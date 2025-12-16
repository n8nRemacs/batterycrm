package com.avito.android.developments_advice.data;

import com.avito.android.remote.model.ConsultationFormData;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import lw.InterfaceC43836a;
import ow.InterfaceC44946a;

/* compiled from: ConsultationFormInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC44946a> f135997a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f135998b;

    /* renamed from: c, reason: collision with root package name */
    public final l f135999c;

    /* renamed from: d, reason: collision with root package name */
    public final l f136000d;

    /* renamed from: e, reason: collision with root package name */
    public final l f136001e;

    /* renamed from: f, reason: collision with root package name */
    public final l f136002f;

    /* renamed from: g, reason: collision with root package name */
    public final l f136003g;

    /* renamed from: h, reason: collision with root package name */
    public final l f136004h;

    /* renamed from: i, reason: collision with root package name */
    public final l f136005i;

    /* renamed from: j, reason: collision with root package name */
    public final u f136006j;

    public e(Provider provider, Provider provider2, l lVar, l lVar2, l lVar3, l lVar4, l lVar5, l lVar6, l lVar7, u uVar) {
        this.f135997a = provider;
        this.f135998b = provider2;
        this.f135999c = lVar;
        this.f136000d = lVar2;
        this.f136001e = lVar3;
        this.f136002f = lVar4;
        this.f136003g = lVar5;
        this.f136004h = lVar6;
        this.f136005i = lVar7;
        this.f136006j = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f135997a.get(), this.f135998b.get(), (ConsultationFormData) this.f135999c.f393949a, (String) this.f136000d.f393949a, (String) this.f136001e.f393949a, (String) this.f136002f.f393949a, (String) this.f136003g.f393949a, (String) this.f136004h.f393949a, (String) this.f136005i.f393949a, (InterfaceC43836a) this.f136006j.get());
    }
}
