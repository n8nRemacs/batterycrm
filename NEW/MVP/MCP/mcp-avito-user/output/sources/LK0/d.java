package LK0;

import dagger.internal.A;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import javax.inject.Provider;

/* compiled from: FormatterV1Module_ProvideCompositeFormatterRuleFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class d implements dagger.internal.h<JK0.a> {

    /* renamed from: a, reason: collision with root package name */
    public final A f9904a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<JK0.h> f9905b;

    public d(A a12, Provider provider) {
        this.f9904a = a12;
        this.f9905b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Set set = (Set) this.f9904a.get();
        JK0.h hVar = this.f9905b.get();
        b.f9902a.getClass();
        return new JK0.a(set, hVar);
    }
}
