package com.avito.android.advert_core.body_condition;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertDetailsCarBodyConditionPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final u f83046a;

    /* renamed from: b, reason: collision with root package name */
    public final u f83047b;

    /* renamed from: c, reason: collision with root package name */
    public final u f83048c;

    public j(u uVar, u uVar2, u uVar3) {
        this.f83046a = uVar;
        this.f83047b = uVar2;
        this.f83048c = uVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((c) this.f83046a.get(), (InterfaceC28373a) this.f83047b.get(), (E) this.f83048c.get());
    }
}
