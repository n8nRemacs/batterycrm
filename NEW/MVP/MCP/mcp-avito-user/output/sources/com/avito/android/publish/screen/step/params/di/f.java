package com.avito.android.publish.screen.step.params.di;

import com.avito.android.analytics.screens.Screen;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.ownership.Owners;
import com.avito.android.publish.details.beduin.custom_actions.BeduinSetContinuePublishAction;
import com.avito.android.publish.screen.step.params.di.a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import gj.d;
import java.util.Collections;
import javax.inject.Provider;
import kj.C42699b;
import pj.C47099b;

/* compiled from: PublishDetailsModule_ProvideBeduinContextFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<InterfaceC40691b> {

    /* renamed from: a, reason: collision with root package name */
    public final d f241108a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<gj.d> f241109b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f241110c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<a.b> f241111d;

    /* renamed from: e, reason: collision with root package name */
    public final u f241112e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<Screen> f241113f;

    public f(d dVar, Provider provider, Provider provider2, Provider provider3, u uVar, Provider provider4) {
        this.f241108a = dVar;
        this.f241109b = provider;
        this.f241110c = provider2;
        this.f241111d = provider3;
        this.f241112e = uVar;
        this.f241113f = provider4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        gj.d dVarEl = ((a.c.C34057j) this.f241109b).f241079a.El();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) ((a.c.C34069v) this.f241110c).get();
        a.b bVar = (a.b) ((a.c.C34070w) this.f241111d).get();
        com.avito.android.publish.details.beduin.custom_actions.a aVar2 = (com.avito.android.publish.details.beduin.custom_actions.a) this.f241112e.get();
        Screen screen = this.f241113f.get();
        this.f241108a.getClass();
        return d.a.a(dVarEl, aVar, bVar, C47099b.f428743a, Collections.singleton(new gj.f(BeduinSetContinuePublishAction.class, aVar2)), null, null, new C42699b(screen.f90471b, Collections.singletonList(Owners.f210498i1), "PublishDetails", false, 8, null), 48);
    }
}
