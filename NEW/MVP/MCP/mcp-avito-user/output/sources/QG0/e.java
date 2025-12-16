package QG0;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import lD.C43617a;

/* compiled from: UsedCarsFeedbackHelperImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f13646a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C43617a> f13647b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<SK0.b> f13648c;

    public e(u uVar, Provider provider, Provider provider2) {
        this.f13646a = uVar;
        this.f13647b = provider;
        this.f13648c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((g) this.f13646a.get(), this.f13647b.get(), this.f13648c.get());
    }
}
