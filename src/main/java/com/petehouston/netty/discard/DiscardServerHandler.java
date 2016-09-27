package com.petehouston.netty.discard;

import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
import io.netty.buffer.ByteBuf;
import io.netty.util.CharsetUtil;

public class DiscardServerHandler extends ChannelInboundHandlerAdapter {
        
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        cause.printStackTrace();
        ctx.close();
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object message) {
        ByteBuf in = (ByteBuf) message;
        String data = in.toString(CharsetUtil.UTF_8);
        System.out.println("Discard: " + data);
        in.release();
    }
}
