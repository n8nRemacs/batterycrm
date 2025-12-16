package c6;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.C35793f6;
import com.avito.android.util.C35801g6;
import com.avito.android.util.Kundle;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MortgageCalculationAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f57642a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f57643b;

    /* renamed from: c, reason: collision with root package name */
    public final C35801g6 f57644c;

    /* renamed from: d, reason: collision with root package name */
    public final l f57645d;

    public c(l lVar, Provider provider, C35801g6 c35801g6, l lVar2) {
        this.f57642a = lVar;
        this.f57643b = provider;
        this.f57644c = c35801g6;
        this.f57645d = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        String str = (String) this.f57642a.f393949a;
        InterfaceC28373a interfaceC28373a = this.f57643b.get();
        this.f57644c.getClass();
        return new b(str, interfaceC28373a, new C35793f6(), (Kundle) this.f57645d.f393949a);
    }
}
