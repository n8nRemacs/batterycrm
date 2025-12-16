package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: DefaultBitmapPoolParams.java */
@Nullsafe
/* loaded from: classes13.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f340479a = new SparseIntArray(0);

    public static G a() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return new G(0, iMin > 16777216 ? (iMin / 4) * 3 : iMin / 2, f340479a, -1);
    }
}
