package com.avito.android.rating_form.di;

import com.avito.android.rating_form.RatingFormArguments;
import com.avito.android.rating_form.di.a;
import com.avito.android.rating_form.mvi.p;
import com.avito.android.rating_form.mvi.s;
import com.avito.android.rating_form.step.validations.o;
import com.avito.android.rating_form.step.validations.r;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: RatingFormModule_ProvideRatingFormMviInteractorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class k implements dagger.internal.h<com.avito.android.rating_form.interactor.i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Vg0.d> f248121a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.rating_form.interactor.c> f248122b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f248123c;

    /* renamed from: d, reason: collision with root package name */
    public final s f248124d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.rating_form.y> f248125e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<o> f248126f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.rating_form.step.validations.a> f248127g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<r> f248128h;

    /* renamed from: i, reason: collision with root package name */
    public final u f248129i;

    public k(Provider provider, Provider provider2, dagger.internal.l lVar, s sVar, Provider provider3, Provider provider4, Provider provider5, Provider provider6, u uVar) {
        this.f248121a = provider;
        this.f248122b = provider2;
        this.f248123c = lVar;
        this.f248124d = sVar;
        this.f248125e = provider3;
        this.f248126f = provider4;
        this.f248127g = provider5;
        this.f248128h = provider6;
        this.f248129i = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Vg0.d dVar = (Vg0.d) ((a.c.e) this.f248121a).get();
        com.avito.android.rating_form.interactor.c cVar = this.f248122b.get();
        RatingFormArguments ratingFormArguments = (RatingFormArguments) this.f248123c.f393949a;
        p pVar = (p) this.f248124d.get();
        com.avito.android.rating_form.y yVar = (com.avito.android.rating_form.y) ((a.c.f) this.f248125e).get();
        o oVar = this.f248126f.get();
        com.avito.android.rating_form.step.validations.a aVar = this.f248127g.get();
        r rVar = this.f248128h.get();
        boolean zBooleanValue = ((Boolean) this.f248129i.get()).booleanValue();
        h.f248117a.getClass();
        if (ratingFormArguments instanceof RatingFormArguments.RatingModelArguments) {
            return new com.avito.android.rating_form.interactor.j(dVar, cVar, ((RatingFormArguments.RatingModelArguments) ratingFormArguments).f247904b, pVar, yVar, oVar, aVar, rVar, zBooleanValue);
        }
        if (ratingFormArguments instanceof RatingFormArguments.RatingSellerArguments) {
            return new com.avito.android.rating_form.interactor.l(dVar, cVar, pVar, yVar, oVar, aVar, rVar, zBooleanValue);
        }
        throw new NoWhenBranchMatchedException();
    }
}
