package com.avito.android.rating_ui.badge_score.di;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RatingBadgeScoreItemModule_ProvideRatingBadgeScoreClickedItemStreamFactory.java */
@e
@x
@y
/* loaded from: classes16.dex */
public final class b implements h<com.jakewharton.rxrelay3.c<com.avito.android.rating_ui.badge_score.b>> {

    /* compiled from: RatingBadgeScoreItemModule_ProvideRatingBadgeScoreClickedItemStreamFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f249963a = new b();
    }

    public static b a() {
        return a.f249963a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.rating_ui.badge_score.di.a.f249962a.getClass();
        return new com.jakewharton.rxrelay3.c();
    }
}
