package LK0;

import JK0.e;
import PK0.q;
import PK0.r;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FormatterV1Module_ProvideTextStyleParamFormatterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class m implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<e.a> f9917a;

    public m(Provider<e.a> provider) {
        this.f9917a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e.a aVar = this.f9917a.get();
        b.f9902a.getClass();
        return new r(aVar);
    }
}
