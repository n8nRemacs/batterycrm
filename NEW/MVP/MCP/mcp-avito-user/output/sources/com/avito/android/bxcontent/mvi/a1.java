package com.avito.android.bxcontent.mvi;

import com.avito.android.bxcontent.Q1;
import com.avito.android.progress_info_toast_bar.presenter.ProgressInfoToastBarPresenter;
import javax.inject.Provider;

/* compiled from: BxContentShowProgressToastActorDelegate_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class a1 implements dagger.internal.h<Z0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<ProgressInfoToastBarPresenter> f111745a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Q1> f111746b;

    public a1(Provider<ProgressInfoToastBarPresenter> provider, Provider<Q1> provider2) {
        this.f111745a = provider;
        this.f111746b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new Z0(this.f111745a.get(), this.f111746b.get());
    }
}
