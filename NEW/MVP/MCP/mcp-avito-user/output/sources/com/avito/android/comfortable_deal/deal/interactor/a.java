package com.avito.android.comfortable_deal.deal.interactor;

import Y61.k;
import Y61.l;
import com.avito.android.comfortable_deal.api.model.ActionTransition;
import com.avito.android.comfortable_deal.deal.mvi.entity.DealInternalAction;
import com.avito.android.comfortable_deal.end_deal.model.EndDealSavedState;
import com.avito.android.comfortable_deal.repository.model.CommentsFilter;
import com.avito.android.comfortable_deal.stages_transition.model.StageTransitionField;
import com.avito.android.comfortable_deal.stages_transition.model.StagesTransitionResultStrategy;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: DealInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/interactor/a;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface a {

    /* compiled from: DealInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.comfortable_deal.deal.interactor.a$a, reason: collision with other inner class name */
    public static final class C3570a {
    }

    @k
    InterfaceC43160i<DealInternalAction> a(@l CommentsFilter commentsFilter);

    @k
    InterfaceC43160i<DealInternalAction> b(@k StagesTransitionResultStrategy stagesTransitionResultStrategy, @l CommentsFilter commentsFilter, @l EndDealSavedState endDealSavedState);

    @k
    InterfaceC43160i<DealInternalAction> c(@k Ep.c cVar, @k StagesTransitionResultStrategy stagesTransitionResultStrategy, @l ActionTransition actionTransition, @l CommentsFilter commentsFilter, @k Map<String, ? extends StageTransitionField> map);

    @k
    InterfaceC43160i<DealInternalAction> d(@k Ep.c cVar, @k DeepLink deepLink);
}
