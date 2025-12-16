package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.gms.tasks.C37028k;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* loaded from: classes6.dex */
final class D extends BinderC37177t {

    /* renamed from: p, reason: collision with root package name */
    public final C37196z0 f358101p;

    /* renamed from: q, reason: collision with root package name */
    public final C37165o1 f358102q;

    public D(E e12, C37028k c37028k, C37196z0 c37196z0, C37165o1 c37165o1) {
        super(e12, c37028k);
        this.f358101p = c37196z0;
        this.f358102q = c37165o1;
    }

    @Override // com.google.android.play.core.assetpacks.BinderC37177t, com.google.android.play.core.assetpacks.internal.y
    public final void R0(int i12, Bundle bundle) {
        super.R0(i12, bundle);
        this.f358499a.d(AbstractC37119f.a(bundle, this.f358101p, this.f358102q, O.f358193a));
    }
}
