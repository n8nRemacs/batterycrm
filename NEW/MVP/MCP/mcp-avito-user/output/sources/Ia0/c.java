package iA0;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SuccessScreenAfterApplyApiCaller_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<C41262b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<FQ.a> f398417a;

    public c(Provider<FQ.a> provider) {
        this.f398417a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C41262b(this.f398417a.get());
    }
}
