package com.facebook.imagepipeline.memory;

import com.facebook.infer.annotation.Nullsafe;

/* compiled from: MemoryChunkUtil.java */
@Nullsafe
/* loaded from: classes13.dex */
public class y {
    public static int a(int i12, int i13, int i14) {
        return Math.min(Math.max(0, i14 - i12), i13);
    }

    public static void b(int i12, int i13, int i14, int i15, int i16) {
        com.facebook.common.internal.o.a(Boolean.valueOf(i15 >= 0));
        com.facebook.common.internal.o.a(Boolean.valueOf(i12 >= 0));
        com.facebook.common.internal.o.a(Boolean.valueOf(i14 >= 0));
        com.facebook.common.internal.o.a(Boolean.valueOf(i12 + i15 <= i16));
        com.facebook.common.internal.o.a(Boolean.valueOf(i14 + i15 <= i13));
    }
}
