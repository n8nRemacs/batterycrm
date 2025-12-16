package com.avito.android.user_advert.di;

import com.avito.android.analytics.screens.MyAdvertDetailsScreen;
import com.avito.android.beduin_shared.model.action.custom.reloadScreen.BeduinReloadScreenAction;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.ownership.Owners;
import gj.InterfaceC40691b;
import gj.d;
import java.util.Collections;
import javax.inject.Provider;
import kI0.InterfaceC42585a;
import kj.C42699b;

/* compiled from: MyAdvertItemsModule_ProvideBeduinContextFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class C implements dagger.internal.h<InterfaceC40691b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f310788a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f310789b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f310790c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC42585a> f310791d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f310792e;

    public C(dagger.internal.u uVar, dagger.internal.u uVar2, dagger.internal.u uVar3, dagger.internal.u uVar4, Provider provider) {
        this.f310788a = uVar;
        this.f310789b = uVar2;
        this.f310790c = uVar3;
        this.f310791d = provider;
        this.f310792e = uVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        gj.d dVar = (gj.d) this.f310788a.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) this.f310789b.get();
        a.b bVar = (a.b) this.f310790c.get();
        InterfaceC42585a interfaceC42585a = this.f310791d.get();
        Wi.b bVar2 = (Wi.b) this.f310792e.get();
        B.f310787a.getClass();
        return d.a.a(dVar, aVar, bVar, interfaceC42585a, Collections.singleton(new gj.f(BeduinReloadScreenAction.class, bVar2)), null, null, new C42699b(MyAdvertDetailsScreen.f90434d.f90471b, Collections.singletonList(Owners.f210450U2), "MyAdvertItems", false, 8, null), 48);
    }
}
