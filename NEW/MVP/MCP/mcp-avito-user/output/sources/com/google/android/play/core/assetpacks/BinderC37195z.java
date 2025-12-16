package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.gms.tasks.C37028k;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* renamed from: com.google.android.play.core.assetpacks.z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class BinderC37195z extends BinderC37177t {

    /* renamed from: p, reason: collision with root package name */
    public final int f358557p;

    /* renamed from: q, reason: collision with root package name */
    public final String f358558q;

    /* renamed from: r, reason: collision with root package name */
    public final int f358559r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ E f358560s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC37195z(E e12, C37028k c37028k, int i12, String str, int i13) {
        super(e12, c37028k);
        this.f358560s = e12;
        this.f358557p = i12;
        this.f358558q = str;
        this.f358559r = i13;
    }

    @Override // com.google.android.play.core.assetpacks.BinderC37177t, com.google.android.play.core.assetpacks.internal.y
    public final void M2(Bundle bundle) {
        E e12 = this.f358560s;
        e12.f358111d.d(this.f358499a);
        E.f358106g.b("onError(%d), retrying notifyModuleCompleted...", Integer.valueOf(bundle.getInt("error_code")));
        int i12 = this.f358559r;
        if (i12 > 0) {
            e12.j(this.f358557p, i12 - 1, this.f358558q);
        }
    }
}
