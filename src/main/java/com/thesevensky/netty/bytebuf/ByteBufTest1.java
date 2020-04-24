package com.thesevensky.netty.bytebuf;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.util.CharsetUtil;

public class ByteBufTest1 {

    public static void main(String[] args) {

        ByteBuf headBuf = Unpooled.copiedBuffer("Hello,", CharsetUtil.UTF_8);
    }
}
