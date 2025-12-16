package es0;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MainPageUxFeedbackHelperImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: es0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40154d implements dagger.internal.h<C40153c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<SK0.b> f395407a;

    public C40154d(Provider<SK0.b> provider) {
        this.f395407a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C40153c(this.f395407a.get());
    }
}
