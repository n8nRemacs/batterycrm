package dm;

import com.avito.android.account.E;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import gD.f;
import hz.InterfaceC41196a;
import javax.inject.Provider;

/* compiled from: CallTrackingCounterModule_ProvideCallTrackingRepositoryFactory.java */
@e
@y
@x
/* renamed from: dm.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C39754c implements h<com.avito.android.calltracking_core.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f394037a;

    /* renamed from: b, reason: collision with root package name */
    public final u f394038b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<E> f394039c;

    /* renamed from: d, reason: collision with root package name */
    public final gD.h f394040d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC41196a> f394041e;

    public C39754c(Provider provider, u uVar, Provider provider2, gD.h hVar, Provider provider3) {
        this.f394037a = provider;
        this.f394038b = uVar;
        this.f394039c = provider2;
        this.f394040d = hVar;
        this.f394041e = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC35745a5 interfaceC35745a5 = this.f394037a.get();
        h31.e eVarA = g.a(w.a(this.f394038b));
        E e12 = this.f394039c.get();
        f fVar = (f) this.f394040d.get();
        InterfaceC41196a interfaceC41196a = this.f394041e.get();
        C39752a.f394035a.getClass();
        return new com.avito.android.calltracking_core.c(eVarA, interfaceC35745a5, fVar, e12, interfaceC41196a);
    }
}
