package LK0;

import dagger.internal.A;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;

/* compiled from: FormatterV1Module_ProvidePreFormatterRuleFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class k implements dagger.internal.h<JK0.h> {

    /* renamed from: a, reason: collision with root package name */
    public final A f9915a;

    public k(A a12) {
        this.f9915a = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Set set = (Set) this.f9915a.get();
        b.f9902a.getClass();
        return new JK0.b(set);
    }
}
