package com.avito.android.success_screen_after_apply.mvi;

import com.avito.android.success_screen_after_apply.ui.SuccessScreenAfterApplyOpenParams;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SuccessScreenAfterApplyFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f291737a;

    /* renamed from: b, reason: collision with root package name */
    public final l f291738b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f291739c;

    public h(e eVar, l lVar, dagger.internal.l lVar2) {
        this.f291737a = eVar;
        this.f291738b = lVar;
        this.f291739c = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f291737a.get();
        this.f291738b.getClass();
        k kVar = new k();
        SuccessScreenAfterApplyOpenParams successScreenAfterApplyOpenParams = (SuccessScreenAfterApplyOpenParams) this.f291739c.f393949a;
        return new g("SuccessScreenAfterApply", new m(successScreenAfterApplyOpenParams.f291769c, successScreenAfterApplyOpenParams.f291770d, successScreenAfterApplyOpenParams.f291772f, successScreenAfterApplyOpenParams.f291771e), new f(dVar, kVar));
    }
}
