package com.avito.android.publish.details.di;

import Mj.InterfaceC14496a;
import javax.inject.Provider;

/* compiled from: BodyConditionModule_ProvideBodyConditionBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.details.di.d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33693d implements dagger.internal.h<com.avito.android.body_condition.e> {

    /* renamed from: a, reason: collision with root package name */
    public final C33691c f233911a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.publish.car_body_condition.a> f233912b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f233913c;

    public C33693d(C33691c c33691c, Provider provider, dagger.internal.u uVar) {
        this.f233911a = c33691c;
        this.f233912b = provider;
        this.f233913c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.blueprints.publish.car_body_condition.a aVar = this.f233912b.get();
        InterfaceC14496a interfaceC14496a = (InterfaceC14496a) this.f233913c.get();
        this.f233911a.getClass();
        return new com.avito.android.body_condition.e(aVar, interfaceC14496a);
    }
}
