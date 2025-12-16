package com.facebook.imagepipeline.memory;

import com.facebook.infer.annotation.Nullsafe;

/* compiled from: BitmapCounterProvider.java */
@Nullsafe
/* renamed from: com.facebook.imagepipeline.memory.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C36386d {

    /* renamed from: a, reason: collision with root package name */
    public static final int f340462a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f340463b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile C36384b f340464c;

    static {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        f340462a = ((long) iMin) > 16777216 ? (iMin / 4) * 3 : iMin / 2;
        f340463b = 384;
    }
}
