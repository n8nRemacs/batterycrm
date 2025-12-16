package com.avito.android.rating.details.di;

import Gg0.InterfaceC13878a;
import Mg0.InterfaceC14487a;
import com.avito.android.rating.details.RatingDetailsArguments;
import com.avito.android.rating.details.interactor.r;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: RatingDetailsModule_ProvideRatingDetailsDataSourceFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class l implements dagger.internal.h<com.avito.android.rating.details.interactor.c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14487a> f246997a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC13878a> f246998b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f246999c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.rating.details.interactor.converter.c f247000d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.rating.details.interactor.converter.g f247001e;

    public l(Provider provider, Provider provider2, dagger.internal.l lVar, com.avito.android.rating.details.interactor.converter.c cVar, com.avito.android.rating.details.interactor.converter.g gVar) {
        this.f246997a = provider;
        this.f246998b = provider2;
        this.f246999c = lVar;
        this.f247000d = cVar;
        this.f247001e = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Object aVar;
        InterfaceC14487a interfaceC14487a = this.f246997a.get();
        InterfaceC13878a interfaceC13878a = this.f246998b.get();
        RatingDetailsArguments ratingDetailsArguments = (RatingDetailsArguments) this.f246999c.f393949a;
        com.avito.android.rating.details.interactor.converter.a aVar2 = (com.avito.android.rating.details.interactor.converter.a) this.f247000d.get();
        this.f247001e.getClass();
        com.avito.android.rating.details.interactor.converter.f fVar = new com.avito.android.rating.details.interactor.converter.f();
        e.f246981a.getClass();
        if (ratingDetailsArguments instanceof RatingDetailsArguments.UserRating) {
            return new com.avito.android.rating.details.interactor.q(interfaceC13878a, (RatingDetailsArguments.UserRating) ratingDetailsArguments, aVar2);
        }
        if (ratingDetailsArguments instanceof RatingDetailsArguments.PublicProfileRating) {
            aVar = new com.avito.android.rating.details.interactor.b(interfaceC14487a, (RatingDetailsArguments.PublicProfileRating) ratingDetailsArguments);
        } else {
            if (ratingDetailsArguments instanceof RatingDetailsArguments.UserReviews) {
                return new r(interfaceC13878a, fVar);
            }
            if (!(ratingDetailsArguments instanceof RatingDetailsArguments.ItemReviews)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = new com.avito.android.rating.details.interactor.a(interfaceC14487a, (RatingDetailsArguments.ItemReviews) ratingDetailsArguments);
        }
        return aVar;
    }
}
