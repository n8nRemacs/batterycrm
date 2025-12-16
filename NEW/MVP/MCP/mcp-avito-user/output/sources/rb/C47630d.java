package rb;

import com.avito.android.C30828i;
import com.avito.android.P;
import com.avito.android.advertising.analytics.events.BannerPageSource;
import com.avito.android.analytics.H;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdsMonitoringInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: rb.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C47630d implements h<C47629c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f429891a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<H> f429892b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<P> f429893c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<C30828i> f429894d;

    /* renamed from: e, reason: collision with root package name */
    public final u f429895e;

    public C47630d(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f429891a = provider;
        this.f429892b = provider2;
        this.f429893c = provider3;
        this.f429894d = provider4;
        this.f429895e = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C47629c(this.f429891a.get(), this.f429892b.get(), this.f429893c.get(), this.f429894d.get(), (BannerPageSource) this.f429895e.get());
    }
}
