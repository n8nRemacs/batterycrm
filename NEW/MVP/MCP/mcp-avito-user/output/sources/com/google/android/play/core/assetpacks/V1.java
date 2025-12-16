package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.internal.C37146p;
import com.google.android.play.core.assetpacks.internal.C37147q;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* loaded from: classes6.dex */
public final class V1 implements com.google.android.play.core.assetpacks.internal.r {

    /* renamed from: a, reason: collision with root package name */
    public final W1 f358248a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.play.core.assetpacks.internal.r f358249b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.play.core.assetpacks.internal.r f358250c;

    public V1(W1 w12, com.google.android.play.core.assetpacks.internal.r rVar, com.google.android.play.core.assetpacks.internal.r rVar2) {
        this.f358248a = w12;
        this.f358249b = rVar;
        this.f358250c = rVar2;
    }

    @Override // com.google.android.play.core.assetpacks.internal.r
    public final Object a() {
        a2 a2Var = R1.a(this.f358248a.f358258a.f358227a) == null ? (a2) C37146p.c(this.f358249b).a() : (a2) C37146p.c(this.f358250c).a();
        C37147q.a(a2Var);
        return a2Var;
    }
}
