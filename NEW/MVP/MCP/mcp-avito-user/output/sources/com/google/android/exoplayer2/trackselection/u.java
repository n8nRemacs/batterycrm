package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.j0;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.trackselection.m;
import com.google.android.exoplayer2.util.U;
import j.P;

/* compiled from: TrackSelectorResult.java */
/* loaded from: classes6.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final int f347336a;

    /* renamed from: b, reason: collision with root package name */
    public final j0[] f347337b;

    /* renamed from: c, reason: collision with root package name */
    public final k[] f347338c;

    /* renamed from: d, reason: collision with root package name */
    public final t0 f347339d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public final m.a f347340e;

    public u(j0[] j0VarArr, k[] kVarArr, t0 t0Var, @P m.a aVar) {
        this.f347337b = j0VarArr;
        this.f347338c = (k[]) kVarArr.clone();
        this.f347339d = t0Var;
        this.f347340e = aVar;
        this.f347336a = j0VarArr.length;
    }

    public final boolean a(@P u uVar, int i12) {
        return uVar != null && U.a(this.f347337b[i12], uVar.f347337b[i12]) && U.a(this.f347338c[i12], uVar.f347338c[i12]);
    }

    public final boolean b(int i12) {
        return this.f347337b[i12] != null;
    }
}
