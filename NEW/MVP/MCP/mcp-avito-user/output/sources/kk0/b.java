package KK0;

import JK0.e;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FormatterRuleV0_Factory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f9394a;

    public b(u uVar) {
        this.f9394a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((e.a) this.f9394a.get());
    }
}
