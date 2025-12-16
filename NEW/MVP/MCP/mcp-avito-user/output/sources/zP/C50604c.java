package zp;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MortgageBannerAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: zp.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C50604c implements dagger.internal.h<C50603b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f444245a;

    public C50604c(Provider<InterfaceC28373a> provider) {
        this.f444245a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C50603b(this.f444245a.get());
    }
}
