package com.avito.android.rating_form.pseudo_done.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.rating_form.pseudo_done.mvi.entity.RatingFormPseudoDoneInternalAction;
import eh0.InterfaceC40105a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: RatingFormPseudoDoneActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/rating_form/pseudo_done/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "Leh0/a;", "Lcom/avito/android/rating_form/pseudo_done/mvi/entity/RatingFormPseudoDoneInternalAction;", "", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC40105a, RatingFormPseudoDoneInternalAction, Object> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.rating_form.interactor.i f248849a;

    @Inject
    public b(@Y61.k com.avito.android.rating_form.interactor.i iVar) {
        this.f248849a = iVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<RatingFormPseudoDoneInternalAction> b(InterfaceC40105a interfaceC40105a, Object obj) {
        if (!(interfaceC40105a instanceof InterfaceC40105a.C11101a)) {
            throw new NoWhenBranchMatchedException();
        }
        return C43175k.I(C43262l0.f411945a, C43175k.G(new a(this, null)));
    }
}
