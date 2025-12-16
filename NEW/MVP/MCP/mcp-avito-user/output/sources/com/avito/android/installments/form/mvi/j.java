package com.avito.android.installments.form.mvi;

import com.avito.android.installments.form.mvi.entity.InstallmentsFormState;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: InstallmentsFormFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f172791a;

    /* renamed from: b, reason: collision with root package name */
    public final e f172792b;

    /* renamed from: c, reason: collision with root package name */
    public final l f172793c;

    /* renamed from: d, reason: collision with root package name */
    public final n f172794d;

    public j(g gVar, e eVar, l lVar, n nVar) {
        this.f172791a = gVar;
        this.f172792b = eVar;
        this.f172793c = lVar;
        this.f172794d = nVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f172791a.get();
        a aVar = (a) this.f172792b.get();
        k kVar = (k) this.f172793c.get();
        this.f172794d.getClass();
        m mVar = new m();
        InstallmentsFormState.f172766d.getClass();
        return new i("InstallmentsForm", InstallmentsFormState.f172767e, new h(fVar, aVar, mVar, kVar));
    }
}
