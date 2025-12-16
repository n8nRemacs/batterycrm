package Hr0;

import com.avito.android.serp.adapter.carousel_widget.C34691a;
import com.avito.android.serp.adapter.carousel_widget.C34692b;
import com.avito.android.visual_rubricator.InterfaceC36110a;
import com.avito.android.visual_rubricator.InterfaceC36118i;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SaleHeaderItemModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC36110a> f7768a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC36118i> f7769b;

    /* renamed from: c, reason: collision with root package name */
    public final C34692b f7770c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.serp.adapter.slider.b f7771d;

    public d(Provider provider, Provider provider2, C34692b c34692b, com.avito.android.serp.adapter.slider.b bVar) {
        this.f7768a = provider;
        this.f7769b = provider2;
        this.f7770c = c34692b;
        this.f7771d = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        InterfaceC36110a interfaceC36110a = this.f7768a.get();
        InterfaceC36118i interfaceC36118i = this.f7769b.get();
        C34691a c34691a = (C34691a) this.f7770c.get();
        com.avito.android.serp.adapter.slider.a aVar = (com.avito.android.serp.adapter.slider.a) this.f7771d.get();
        c.f7767a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(interfaceC36110a);
        c10493a.b(interfaceC36118i);
        c10493a.b(c34691a);
        c10493a.b(aVar);
        return c10493a.a();
    }
}
