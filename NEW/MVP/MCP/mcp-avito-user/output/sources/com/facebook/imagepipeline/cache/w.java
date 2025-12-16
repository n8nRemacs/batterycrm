package com.facebook.imagepipeline.cache;

import com.facebook.infer.annotation.Nullsafe;
import java.util.concurrent.TimeUnit;

/* compiled from: DefaultEncodedMemoryCacheParamsSupplier.java */
@Nullsafe
/* loaded from: classes12.dex */
public class w implements com.facebook.common.internal.r<I> {

    /* renamed from: a, reason: collision with root package name */
    public static final long f340257a = TimeUnit.MINUTES.toMillis(5);

    @Override // com.facebook.common.internal.r
    public final I get() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        int i12 = iMin < 16777216 ? 1048576 : iMin < 33554432 ? 2097152 : 4194304;
        return new I(i12, Integer.MAX_VALUE, i12, i12 / 8, f340257a);
    }
}
