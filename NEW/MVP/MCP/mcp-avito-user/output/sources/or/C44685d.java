package oR;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import lD.C43617a;

/* compiled from: LeasingCalculatorUxFeedbackHelperImpl_Factory.java */
@e
@y
@x
/* renamed from: oR.d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C44685d implements h<C44684c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C43617a> f419775a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<SK0.b> f419776b;

    public C44685d(Provider<C43617a> provider, Provider<SK0.b> provider2) {
        this.f419775a = provider;
        this.f419776b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C44684c(this.f419776b.get(), this.f419775a.get());
    }
}
