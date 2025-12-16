package com.avito.android.rating_form.select_item.mvi;

import com.avito.android.rating_form.select_item.RatingFormSelectItemArguments;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingFormSelectItemBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.rating_form.select_item.d> f249093a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.rating_form.interactor.i> f249094b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f249095c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.rating_form.y> f249096d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.rating_form.custom_params.d> f249097e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f249098f;

    public f(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f249093a = provider;
        this.f249094b = provider2;
        this.f249095c = lVar;
        this.f249096d = provider3;
        this.f249097e = provider4;
        this.f249098f = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f249093a.get(), this.f249094b.get(), (RatingFormSelectItemArguments) this.f249095c.f393949a, this.f249096d.get(), this.f249097e.get(), (String) this.f249098f.f393949a);
    }
}
