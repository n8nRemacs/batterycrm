package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: PoolParams.java */
@Nullsafe
/* loaded from: classes13.dex */
public class G {

    /* renamed from: a, reason: collision with root package name */
    public final int f340443a;

    /* renamed from: b, reason: collision with root package name */
    public final int f340444b;

    /* renamed from: c, reason: collision with root package name */
    @I41.h
    public final SparseIntArray f340445c;

    /* renamed from: d, reason: collision with root package name */
    public final int f340446d;

    public G(int i12, int i13, @I41.h SparseIntArray sparseIntArray, int i14) {
        com.facebook.common.internal.o.d(i12 >= 0 && i13 >= i12);
        this.f340444b = i12;
        this.f340443a = i13;
        this.f340445c = sparseIntArray;
        this.f340446d = i14;
    }
}
