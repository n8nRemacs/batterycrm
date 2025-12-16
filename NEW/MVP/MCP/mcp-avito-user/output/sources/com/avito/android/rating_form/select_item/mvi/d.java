package com.avito.android.rating_form.select_item.mvi;

import com.avito.android.rating_form.select_item.RatingFormSelectItemArguments;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingFormSelectItemActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.rating_form.interactor.i> f249059a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.rating_form.select_item.d> f249060b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f249061c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f249062d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f249063e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.rating_form.y> f249064f;

    public d(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f249059a = provider;
        this.f249060b = provider2;
        this.f249061c = lVar;
        this.f249062d = provider3;
        this.f249063e = lVar2;
        this.f249064f = provider4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f249059a.get(), this.f249060b.get(), (String) this.f249061c.f393949a, this.f249062d.get(), (RatingFormSelectItemArguments) this.f249063e.f393949a, this.f249064f.get());
    }
}
