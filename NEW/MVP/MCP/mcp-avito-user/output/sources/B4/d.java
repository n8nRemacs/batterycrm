package B4;

import com.avito.android.analytics.screens.AdvertScreen;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.ownership.Owners;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import gj.d;
import java.util.Collections;
import javax.inject.Provider;
import kj.C42699b;
import pj.C47099b;

/* compiled from: AdvertDetailsBeduinModule_ProvideViewModelBeduinContextFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class d implements h<InterfaceC40691b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<gj.d> f870a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f871b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<a.b> f872c;

    public d(Provider<gj.d> provider, Provider<com.avito.android.deeplink_handler.handler.composite.a> provider2, Provider<a.b> provider3) {
        this.f870a = provider;
        this.f871b = provider2;
        this.f872c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        gj.d dVar = this.f870a.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f871b.get();
        a.b bVar = this.f872c.get();
        a.f866a.getClass();
        return d.a.a(dVar, aVar, bVar, C47099b.f428743a, null, null, null, new C42699b(AdvertScreen.f90278d.f90471b, Collections.singletonList(Owners.f210394C), "AdvertDetails", false, 8, null), 56);
    }
}
