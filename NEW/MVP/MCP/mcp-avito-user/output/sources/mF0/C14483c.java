package Mf0;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PublishLimitsAnalyticsModule_ProvideAnalyticsFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: Mf0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C14483c implements h<InterfaceC14484d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f10983a;

    public C14483c(Provider<InterfaceC28373a> provider) {
        this.f10983a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = this.f10983a.get();
        C14482b.f10982a.getClass();
        return new C14485e(interfaceC28373a);
    }
}
