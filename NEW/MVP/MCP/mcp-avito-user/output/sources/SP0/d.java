package Sp0;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AvitoBusinessFiltersFeedbackHelperImpl_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<SK0.b> f15153a;

    public d(Provider<SK0.b> provider) {
        this.f15153a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f15153a.get());
    }
}
