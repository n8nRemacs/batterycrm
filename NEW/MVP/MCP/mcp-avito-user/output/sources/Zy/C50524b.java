package zY;

import com.avito.android.I1;
import com.avito.android.K1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.E;
import com.avito.android.util.C;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AppMemoryConsumptionModule_ProvideAppMemoryTrackerFactory.java */
@e
@y
@x
/* renamed from: zY.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C50524b implements h<com.avito.android.memory.consumption.a> {

    /* renamed from: a, reason: collision with root package name */
    public final C50523a f444058a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C> f444059b;

    /* renamed from: c, reason: collision with root package name */
    public final E f444060c;

    /* renamed from: d, reason: collision with root package name */
    public final f f444061d;

    /* renamed from: e, reason: collision with root package name */
    public final K1 f444062e;

    public C50524b(C50523a c50523a, Provider provider, E e12, f fVar, K1 k12) {
        this.f444058a = c50523a;
        this.f444059b = provider;
        this.f444060c = e12;
        this.f444061d = fVar;
        this.f444062e = k12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C c12 = this.f444059b.get();
        this.f444060c.getClass();
        D d12 = new D();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f444061d.get();
        I1 i12 = (I1) this.f444062e.get();
        this.f444058a.getClass();
        return new com.avito.android.memory.consumption.b(c12, interfaceC28373a, d12, i12);
    }
}
