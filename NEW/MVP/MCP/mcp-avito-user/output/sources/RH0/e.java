package RH0;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SellerItemCloseWithPortfolioUxFeedbackHelperImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f14259a;

    /* renamed from: b, reason: collision with root package name */
    public final u f14260b;

    public e(u uVar, u uVar2) {
        this.f14259a = uVar;
        this.f14260b = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((f) this.f14259a.get(), (SK0.b) this.f14260b.get());
    }
}
