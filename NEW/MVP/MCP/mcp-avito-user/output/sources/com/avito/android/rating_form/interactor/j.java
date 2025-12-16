package com.avito.android.rating_form.interactor;

import Wg0.AbstractC15763a;
import com.avito.android.rating_form.mvi.p;
import com.avito.android.rating_form.step.validations.o;
import com.avito.android.rating_form.step.validations.r;
import com.avito.android.rating_form.y;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: RatingFormInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/interactor/j;", "Lcom/avito/android/rating_form/interactor/d;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j extends d {

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Vg0.d f248256j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final c f248257k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final String f248258l;

    @Inject
    public j(@Y61.k Vg0.d dVar, @Y61.k c cVar, @Y61.l String str, @Y61.k p pVar, @Y61.k y yVar, @Y61.k o oVar, @Y61.k com.avito.android.rating_form.step.validations.a aVar, @Y61.k r rVar, boolean z12) {
        super(yVar, oVar, aVar, rVar, pVar, z12);
        this.f248256j = dVar;
        this.f248257k = cVar;
        this.f248258l = str;
    }

    @Override // com.avito.android.rating_form.interactor.d
    @Y61.l
    public final Object h(@Y61.k List list, @Y61.l Integer num, @Y61.l String str, @Y61.k Continuation continuation) {
        return this.f248256j.f(this.f248257k.a(new AbstractC15763a.C1279a(this.f248258l, num, list, str)), continuation);
    }
}
