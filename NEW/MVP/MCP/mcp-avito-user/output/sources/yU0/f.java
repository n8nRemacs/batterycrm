package Yu0;

import android.content.res.Resources;
import com.avito.android.J0;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServicesOnboardingConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<J0> f19730a;

    /* renamed from: b, reason: collision with root package name */
    public final l f19731b;

    public f(l lVar, Provider provider) {
        this.f19730a = provider;
        this.f19731b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((Resources) this.f19731b.f393949a, this.f19730a.get());
    }
}
