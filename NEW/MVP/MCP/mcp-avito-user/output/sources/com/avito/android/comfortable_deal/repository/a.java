package com.avito.android.comfortable_deal.repository;

import Pp.C14822a;
import com.avito.android.comfortable_deal.api.model.AgentRoomDealResponse;
import com.avito.android.comfortable_deal.api.model.IsContractSignedResponse;
import com.avito.android.comfortable_deal.generated.api.deal_stage_api.DealStageApiResponse;
import com.avito.android.comfortable_deal.repository.model.CommentsFilter;
import com.avito.android.comfortable_deal.stages_transition.model.StageTransitionField;
import com.avito.android.remote.model.TypedResult;
import cq.C39396a;
import dp.C39776e;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ComfortableDealRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/repository/a;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface a {

    /* compiled from: ComfortableDealRepository.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.comfortable_deal.repository.a$a, reason: collision with other inner class name */
    public static final class C3628a {
    }

    @Y61.l
    Object a(@Y61.k Continuation<? super TypedResult<C39776e>> continuation);

    @Y61.l
    Object b(@Y61.k String str, @Y61.k Continuation<? super TypedResult<Object>> continuation);

    @Y61.l
    Object c(@Y61.k Continuation<? super TypedResult<IsContractSignedResponse>> continuation);

    @Y61.l
    Object d(@Y61.k String str, @Y61.k Continuation<? super TypedResult<AgentRoomDealResponse>> continuation);

    @Y61.l
    Object e(@Y61.k String str, @Y61.k String str2, @Y61.k Continuation<? super TypedResult<Object>> continuation);

    void f(@Y61.k String str);

    @Y61.l
    Object g(@Y61.k String str, @Y61.k String str2, @Y61.k Map<String, ? extends StageTransitionField> map, @Y61.k Continuation<? super TypedResult<Object>> continuation);

    @Y61.l
    Object h(@Y61.k String str, @Y61.k ContinuationImpl continuationImpl);

    @Y61.l
    Object i(int i12, @Y61.k List list, int i13, @Y61.k SuspendLambda suspendLambda);

    @Y61.l
    Object j(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @Y61.k Continuation<? super C39396a> continuation);

    @Y61.l
    Object k(@Y61.k String str, @Y61.k Continuation<? super TypedResult<AgentRoomDealResponse>> continuation);

    @Y61.l
    Object l(@Y61.k Continuation<? super TypedResult<DealStageApiResponse>> continuation);

    @Y61.l
    Object m(@Y61.k SuspendLambda suspendLambda);

    @Y61.l
    Object n(@Y61.k String str, @Y61.k Continuation<? super TypedResult<G0>> continuation);

    @Y61.l
    Object o(@Y61.k Continuation<? super TypedResult<C14822a>> continuation);

    @Y61.l
    Object p(@Y61.k String str, @Y61.k String str2, @Y61.k Continuation<? super TypedResult<Object>> continuation);

    @Y61.l
    Object q(int i12, @Y61.k List list, int i13, @Y61.k SuspendLambda suspendLambda);

    @Y61.l
    Object r(int i12, int i13, @Y61.l String str, boolean z12, @Y61.k SuspendLambda suspendLambda);

    @Y61.l
    Object s(@Y61.l String str, @Y61.k Continuation<? super TypedResult<dp.o>> continuation);

    @Y61.l
    Object t(@Y61.k String str, @Y61.l CommentsFilter commentsFilter, @Y61.k ContinuationImpl continuationImpl);

    @Y61.l
    Object u(@Y61.k String str, @Y61.k String str2, @Y61.k SuspendLambda suspendLambda);

    @Y61.l
    Object v(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.k ContinuationImpl continuationImpl);

    @Y61.l
    Object w(int i12, @Y61.k List list, int i13, @Y61.k SuspendLambda suspendLambda);
}
