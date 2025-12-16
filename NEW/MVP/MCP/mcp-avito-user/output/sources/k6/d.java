package k6;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import lD.C43617a;

/* compiled from: OwnershipCostFeedbackHelperImpl_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C43617a> f406096a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<SK0.b> f406097b;

    public d(Provider<C43617a> provider, Provider<SK0.b> provider2) {
        this.f406096a = provider;
        this.f406097b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f406097b.get(), this.f406096a.get());
    }
}
