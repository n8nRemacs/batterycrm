package com.avito.android.rating_form.select_item.mvi;

import com.avito.android.rating_form.select_item.RatingFormSelectItemArguments;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingFormSelectItemReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f249112a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.rating_form.y> f249113b;

    public m(dagger.internal.l lVar, Provider provider) {
        this.f249112a = lVar;
        this.f249113b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new l((RatingFormSelectItemArguments) this.f249112a.f393949a, this.f249113b.get());
    }
}
