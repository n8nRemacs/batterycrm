package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.gms.tasks.C37028k;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* renamed from: com.google.android.play.core.assetpacks.x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class BinderC37189x extends BinderC37177t {

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ E f358530p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC37189x(E e12, C37028k c37028k) {
        super(e12, c37028k);
        this.f358530p = e12;
    }

    @Override // com.google.android.play.core.assetpacks.BinderC37177t, com.google.android.play.core.assetpacks.internal.y
    public final void M2(Bundle bundle) {
        com.google.android.play.core.assetpacks.internal.Q q12 = this.f358530p.f358112e;
        C37028k c37028k = this.f358499a;
        q12.d(c37028k);
        int i12 = bundle.getInt("error_code");
        E.f358106g.b("onError(%d)", Integer.valueOf(i12));
        c37028k.c(new AssetPackException(i12));
    }

    @Override // com.google.android.play.core.assetpacks.BinderC37177t, com.google.android.play.core.assetpacks.internal.y
    public final void i0(Bundle bundle, Bundle bundle2) {
        super.i0(bundle, bundle2);
        E e12 = this.f358530p;
        if (!e12.f358113f.compareAndSet(true, false)) {
            E.f358106g.e("Expected keepingAlive to be true, but was false.", new Object[0]);
        }
        if (bundle.getBoolean("keep_alive")) {
            e12.f();
        }
    }
}
