package zz0;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrSellerOrdersFeedbackHelperImpl_Factory.java */
@e
@y
@x
/* renamed from: zz0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50653c implements h<C50652b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<SK0.b> f444404a;

    public C50653c(Provider<SK0.b> provider) {
        this.f444404a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C50652b(this.f444404a.get());
    }
}
