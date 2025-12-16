package xs0;

import com.avito.android.geo.j;
import com.avito.android.remote.H;
import com.avito.android.remote.t1;
import com.avito.android.util.InterfaceC35950u;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AvitoCommonParametersProvider_Factory.java */
@e
@y
@x
/* renamed from: xs0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49992b implements h<C49991a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35950u> f442680a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<H> f442681b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<t1> f442682c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<j> f442683d;

    public C49992b(Provider<InterfaceC35950u> provider, Provider<H> provider2, Provider<t1> provider3, Provider<j> provider4) {
        this.f442680a = provider;
        this.f442681b = provider2;
        this.f442682c = provider3;
        this.f442683d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C49991a(this.f442680a.get(), this.f442681b.get(), this.f442682c.get(), this.f442683d.get());
    }
}
