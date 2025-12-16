package com.google.android.exoplayer2.util;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: MediaFormatUtil.java */
/* loaded from: classes6.dex */
public final class y {
    public static void a(MediaFormat mediaFormat, String str, int i12) {
        if (i12 != -1) {
            mediaFormat.setInteger(str, i12);
        }
    }

    public static void b(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i12 = 0; i12 < list.size(); i12++) {
            mediaFormat.setByteBuffer(AK.c.g(i12, "csd-"), ByteBuffer.wrap(list.get(i12)));
        }
    }
}
