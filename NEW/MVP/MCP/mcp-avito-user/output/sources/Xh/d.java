package Xh;

import com.avito.android.AbstractC35201t;
import com.avito.android.beduin.common.utils.C28814j;
import dagger.internal.f;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BeduinBannerGalleryContainerFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements h<C17010c> {

    /* renamed from: a, reason: collision with root package name */
    public final f f19033a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Th.a> f19034b;

    /* renamed from: c, reason: collision with root package name */
    public final u f19035c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<AbstractC35201t> f19036d;

    public d(f fVar, u uVar, Provider provider, Provider provider2) {
        this.f19033a = fVar;
        this.f19034b = provider;
        this.f19035c = uVar;
        this.f19036d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C17010c(g.b(this.f19033a), this.f19034b.get(), (C28814j) this.f19035c.get(), this.f19036d.get());
    }
}
