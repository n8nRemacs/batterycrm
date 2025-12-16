package Vz0;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrOrdersCalendarFeedbackHelperImpl_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<C15734b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<SK0.b> f17539a;

    public c(Provider<SK0.b> provider) {
        this.f17539a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C15734b(this.f17539a.get());
    }
}
