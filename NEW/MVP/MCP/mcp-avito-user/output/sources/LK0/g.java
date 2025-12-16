package LK0;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FormatterV1Module_ProvideFontAttributeFormatterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<CK0.a<?>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<IK0.a> f9909a;

    /* renamed from: b, reason: collision with root package name */
    public final u f9910b;

    public g(u uVar, Provider provider) {
        this.f9909a = provider;
        this.f9910b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        IK0.a aVar = this.f9909a.get();
        JK0.h hVar = (JK0.h) this.f9910b.get();
        b.f9902a.getClass();
        return new GK0.c(aVar, hVar);
    }
}
