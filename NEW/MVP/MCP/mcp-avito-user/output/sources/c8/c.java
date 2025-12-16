package c8;

import ac.C19864a;
import com.avito.android.C29640d;
import com.avito.android.V;
import com.avito.android.account.E;
import com.avito.android.advert_core.analytics.AdvertDetailsAnalyticsInteractorImpl;
import com.avito.android.advertising.loaders.j;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.permissions.z;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class c implements h<AdvertDetailsAnalyticsInteractorImpl> {

    /* renamed from: a, reason: collision with root package name */
    public final u f57671a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<j> f57672b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<V> f57673c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.advert_core.offers.analytics.e f57674d;

    /* renamed from: e, reason: collision with root package name */
    public final u f57675e;

    /* renamed from: f, reason: collision with root package name */
    public final u f57676f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<TreeClickStreamParent> f57677g;

    /* renamed from: h, reason: collision with root package name */
    public final u f57678h;

    /* renamed from: i, reason: collision with root package name */
    public final u f57679i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<C19864a> f57680j;

    /* renamed from: k, reason: collision with root package name */
    public final f f57681k;

    public c(u uVar, Provider provider, Provider provider2, com.avito.android.advert_core.offers.analytics.e eVar, u uVar2, u uVar3, Provider provider3, u uVar4, u uVar5, Provider provider4, f fVar) {
        this.f57671a = uVar;
        this.f57672b = provider;
        this.f57673c = provider2;
        this.f57674d = eVar;
        this.f57675e = uVar2;
        this.f57676f = uVar3;
        this.f57677g = provider3;
        this.f57678h = uVar4;
        this.f57679i = uVar5;
        this.f57680j = provider4;
        this.f57681k = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f57671a.get();
        j jVar = this.f57672b.get();
        V v12 = this.f57673c.get();
        this.f57674d.getClass();
        return new AdvertDetailsAnalyticsInteractorImpl(interfaceC28373a, jVar, v12, new com.avito.android.advert_core.offers.analytics.d(), (E) this.f57675e.get(), (com.avito.android.analytics.provider.e) this.f57676f.get(), this.f57677g.get(), (C29640d) this.f57678h.get(), (z) this.f57679i.get(), this.f57680j.get(), (e) this.f57681k.get());
    }
}
