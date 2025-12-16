package dD;

import com.avito.android.C34161r;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: OrderFeaturesModule_ProvideActiveOrdersFeaturesFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final c f393744a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C34161r> f393745b;

    public d(c cVar, Provider<C34161r> provider) {
        this.f393744a = cVar;
        this.f393745b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C34161r c34161r = this.f393745b.get();
        this.f393744a.getClass();
        return (b) c34161r.f246393a.b(b.class);
    }
}
