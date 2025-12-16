package lK;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.iac_dialer.impl_module.analytics.i;
import com.avito.android.iac_dialer.impl_module.analytics.tech_info.IacTechInfoStorage;
import com.avito.android.permissions.w;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import mK.InterfaceC43975a;

/* compiled from: IacCallLauncherImpl_Factory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class b implements h<C43649a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f413703a;

    /* renamed from: b, reason: collision with root package name */
    public final f f413704b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<BL.a> f413705c;

    /* renamed from: d, reason: collision with root package name */
    public final w f413706d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.iac_dialer.impl_module.splitter.features.c f413707e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<i> f413708f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<IacTechInfoStorage> f413709g;

    public b(u uVar, f fVar, Provider provider, w wVar, com.avito.android.iac_dialer.impl_module.splitter.features.c cVar, Provider provider2, Provider provider3) {
        this.f413703a = uVar;
        this.f413704b = fVar;
        this.f413705c = provider;
        this.f413706d = wVar;
        this.f413707e = cVar;
        this.f413708f = provider2;
        this.f413709g = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC43975a interfaceC43975a = (InterfaceC43975a) this.f413703a.get();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f413704b.get();
        BL.a aVar = this.f413705c.get();
        com.avito.android.permissions.u uVar = (com.avito.android.permissions.u) this.f413706d.get();
        this.f413707e.get();
        return new C43649a(interfaceC43975a, interfaceC28373a, aVar, uVar, this.f413708f.get(), this.f413709g.get());
    }
}
