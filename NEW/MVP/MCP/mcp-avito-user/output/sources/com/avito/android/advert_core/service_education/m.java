package com.avito.android.advert_core.service_education;

import a9.InterfaceC19700a;
import com.avito.android.account.E;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertServiceEducationPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final u f84324a;

    /* renamed from: b, reason: collision with root package name */
    public final u f84325b;

    public m(u uVar, u uVar2) {
        this.f84324a = uVar;
        this.f84325b = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l((InterfaceC19700a) this.f84324a.get(), (E) this.f84325b.get());
    }
}
