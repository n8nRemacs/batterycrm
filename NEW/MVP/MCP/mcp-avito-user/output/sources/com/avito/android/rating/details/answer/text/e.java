package com.avito.android.rating.details.answer.text;

import com.avito.android.ratings.RatingActionAnswerLengthValidationData;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RatingAddAnswerTextValidationInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final l f246857a;

    public e(l lVar) {
        this.f246857a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((RatingActionAnswerLengthValidationData) this.f246857a.f393949a);
    }
}
