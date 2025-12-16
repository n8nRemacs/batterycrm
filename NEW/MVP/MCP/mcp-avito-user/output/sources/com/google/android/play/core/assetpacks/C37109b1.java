package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.assetpacks.internal.C37145o;
import com.google.android.play.core.assetpacks.internal.C37146p;
import java.io.File;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* renamed from: com.google.android.play.core.assetpacks.b1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37109b1 implements com.google.android.play.core.assetpacks.internal.r {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.play.core.assetpacks.internal.r f358298a;

    /* renamed from: b, reason: collision with root package name */
    public final C37145o f358299b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.play.core.assetpacks.internal.r f358300c;

    /* renamed from: d, reason: collision with root package name */
    public final W1 f358301d;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.android.play.core.assetpacks.internal.r f358302e;

    /* renamed from: f, reason: collision with root package name */
    public final com.google.android.play.core.assetpacks.internal.r f358303f;

    /* renamed from: g, reason: collision with root package name */
    public final com.google.android.play.core.assetpacks.internal.r f358304g;

    public C37109b1(com.google.android.play.core.assetpacks.internal.r rVar, C37145o c37145o, com.google.android.play.core.assetpacks.internal.r rVar2, W1 w12, com.google.android.play.core.assetpacks.internal.r rVar3, com.google.android.play.core.assetpacks.internal.r rVar4, com.google.android.play.core.assetpacks.internal.r rVar5) {
        this.f358298a = rVar;
        this.f358299b = c37145o;
        this.f358300c = rVar2;
        this.f358301d = w12;
        this.f358302e = rVar3;
        this.f358303f = rVar4;
        this.f358304g = rVar5;
    }

    @Override // com.google.android.play.core.assetpacks.internal.r
    public final Object a() {
        String str = (String) this.f358298a.a();
        Object objA = this.f358299b.a();
        Object objA2 = this.f358300c.a();
        Context context = this.f358301d.f358258a.f358227a;
        Object objA3 = this.f358302e.a();
        return new C37106a1(str != null ? new File(context.getExternalFilesDir(null), str) : context.getExternalFilesDir(null), (K) objA, (C37196z0) objA2, context, (C37171q1) objA3, C37146p.c(this.f358303f), (C37165o1) this.f358304g.a());
    }
}
