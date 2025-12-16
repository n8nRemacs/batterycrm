package com.avito.android.rating_form.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.rating_form.RatingFormArguments;
import com.avito.android.rating_form.RatingFormStepProgressInteractor;
import com.avito.android.rating_form.mvi.entity.RatingFormInternalAction;
import com.avito.android.rating_form.mvi.entity.RatingFormState;
import dh0.InterfaceC39727a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: RatingFormActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/rating_form/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "Ldh0/a;", "Lcom/avito/android/rating_form/mvi/entity/RatingFormInternalAction;", "Lcom/avito/android/rating_form/mvi/entity/RatingFormState;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements com.avito.android.arch.mvi.a<InterfaceC39727a, RatingFormInternalAction, RatingFormState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final RatingFormArguments f248703a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.rating_form.interactor.i f248704b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final RatingFormStepProgressInteractor f248705c;

    @Inject
    public d(@Y61.k RatingFormArguments ratingFormArguments, @Y61.k com.avito.android.rating_form.interactor.i iVar, @Y61.k RatingFormStepProgressInteractor ratingFormStepProgressInteractor) {
        this.f248703a = ratingFormArguments;
        this.f248704b = iVar;
        this.f248705c = ratingFormStepProgressInteractor;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<RatingFormInternalAction> b(InterfaceC39727a interfaceC39727a, RatingFormState ratingFormState) {
        InterfaceC39727a interfaceC39727a2 = interfaceC39727a;
        RatingFormState ratingFormState2 = ratingFormState;
        if (interfaceC39727a2.equals(InterfaceC39727a.c.f393998a)) {
            return C43175k.I(C43262l0.f411947c, C43175k.G(new a(this, null)));
        }
        if (interfaceC39727a2 instanceof InterfaceC39727a.d) {
            return C43175k.G(new b(interfaceC39727a2, this, ratingFormState2, null));
        }
        if (interfaceC39727a2 instanceof InterfaceC39727a.C11031a) {
            return new C43210w(new RatingFormInternalAction.Back(((InterfaceC39727a.C11031a) interfaceC39727a2).f393996a, ratingFormState2.f248745c, ratingFormState2.f248756n));
        }
        if (interfaceC39727a2 instanceof InterfaceC39727a.b) {
            return C43175k.G(new c(this, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
