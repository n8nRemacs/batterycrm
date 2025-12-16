package com.avito.android.rating.details.answer.text.mvi;

import com.avito.android.rating.details.answer.text.RatingAddAnswerTextValidationInteractor;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingAddAnswerTextActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<RatingAddAnswerTextValidationInteractor> f246863a;

    /* renamed from: b, reason: collision with root package name */
    public final l f246864b;

    /* renamed from: c, reason: collision with root package name */
    public final l f246865c;

    public b(l lVar, l lVar2, Provider provider) {
        this.f246863a = provider;
        this.f246864b = lVar;
        this.f246865c = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f246863a.get(), (Long) this.f246864b.f393949a, (String) this.f246865c.f393949a);
    }
}
