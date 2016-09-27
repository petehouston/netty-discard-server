package com.petehouston.netty.discard;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;

public class DiscardChannelInitializer extends ChannelInitializer<SocketChannel> {

    @Override
    public void initChannel(SocketChannel channel) throws Exception {
        channel.pipeline().addLast(new DiscardServerHandler());
    }
}
