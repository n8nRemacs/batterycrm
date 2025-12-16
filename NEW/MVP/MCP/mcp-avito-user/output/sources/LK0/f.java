package LK0;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FormatterV1Module_ProvideDeeplinkAttributeFormatterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class f implements dagger.internal.h<CK0.a<?>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<IK0.a> f9907a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<JK0.h> f9908b;

    public f(Provider<IK0.a> provider, Provider<JK0.h> provider2) {
        this.f9907a = provider;
        this.f9908b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        IK0.a aVar = this.f9907a.get();
        JK0.h hVar = this.f9908b.get();
        b.f9902a.getClass();
        return new FK0.c(aVar, hVar);
    }
}
