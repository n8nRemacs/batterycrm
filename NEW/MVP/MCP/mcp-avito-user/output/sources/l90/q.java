package l90;

import android.app.Application;
import com.avito.android.L;
import com.avito.android.O;
import com.avito.android.social.M;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ProfileIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f413563a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<M> f413564b;

    /* renamed from: c, reason: collision with root package name */
    public final O f413565c;

    public q(dagger.internal.l lVar, Provider provider, O o12) {
        this.f413563a = lVar;
        this.f413564b = provider;
        this.f413565c = o12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new p((Application) this.f413563a.f393949a, this.f413564b.get(), (L) this.f413565c.get());
    }
}
