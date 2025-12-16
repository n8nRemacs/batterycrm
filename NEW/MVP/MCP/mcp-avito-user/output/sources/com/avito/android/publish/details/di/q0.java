package com.avito.android.publish.details.di;

import com.avito.android.analytics.screens.Screen;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.ownership.Owners;
import com.avito.android.publish.details.beduin.custom_actions.BeduinSetContinuePublishAction;
import com.avito.android.publish.details.di.C33697f;
import gj.InterfaceC40691b;
import gj.d;
import java.util.Collections;
import javax.inject.Provider;
import kj.C42699b;
import pj.C47099b;

/* compiled from: PublishDetailsModule_ProvideBeduinContextFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class q0 implements dagger.internal.h<InterfaceC40691b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<gj.d> f234582a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f234583b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<a.b> f234584c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f234585d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<Screen> f234586e;

    public q0(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f234582a = provider;
        this.f234583b = provider2;
        this.f234584c = provider3;
        this.f234585d = uVar;
        this.f234586e = provider4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        gj.d dVarEl = ((C33697f.c.C33705j) this.f234582a).f234517a.El();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) ((C33697f.c.C33717v) this.f234583b).get();
        a.b bVar = (a.b) ((C33697f.c.C33718w) this.f234584c).get();
        com.avito.android.publish.details.beduin.custom_actions.a aVar2 = (com.avito.android.publish.details.beduin.custom_actions.a) this.f234585d.get();
        Screen screen = this.f234586e.get();
        n0.f234577a.getClass();
        return d.a.a(dVarEl, aVar, bVar, C47099b.f428743a, Collections.singleton(new gj.f(BeduinSetContinuePublishAction.class, aVar2)), null, null, new C42699b(screen.f90471b, Collections.singletonList(Owners.f210498i1), "PublishDetails", false, 8, null), 48);
    }
}
