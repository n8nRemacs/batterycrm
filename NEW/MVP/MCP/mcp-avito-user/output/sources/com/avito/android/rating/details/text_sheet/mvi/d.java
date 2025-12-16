package com.avito.android.rating.details.text_sheet.mvi;

import com.avito.android.rating.details.interactor.m;
import com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TextSheetActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<m> f247562a;

    /* renamed from: b, reason: collision with root package name */
    public final l f247563b;

    public d(l lVar, Provider provider) {
        this.f247562a = provider;
        this.f247563b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f247562a.get(), (BaseRatingReviewItem.ReviewAction.ReviewActionValue) this.f247563b.f393949a);
    }
}
