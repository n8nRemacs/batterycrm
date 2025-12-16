package Jp;

import J81.e;
import J81.f;
import J81.k;
import J81.o;
import J81.s;
import Kp.C14339a;
import Lp.C14426a;
import Np.InterfaceC14600a;
import Op.C14722a;
import Pp.C14822a;
import Qp.C14921a;
import Rp.C15069a;
import Rp.d;
import Up.C15555a;
import Up.C15556b;
import Vp.C15704a;
import Vp.C15705b;
import Y61.l;
import com.avito.android.comfortable_deal.generated.api.deal_stage_api.DealStageApiResponse;
import com.avito.android.comfortable_deal.generated.api.request_create_api_v_2.Source;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ComfortableDealApi.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\r\u0010\u000bJ \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00052\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0005H§@¢\u0006\u0004\b\u0014\u0010\u0015J\"\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00052\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0005H§@¢\u0006\u0004\b\u001b\u0010\u0015J*\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00052\b\b\u0001\u0010\u001c\u001a\u00020\u000e2\b\b\u0001\u0010\u001e\u001a\u00020\u001dH§@¢\u0006\u0004\b \u0010!J \u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00052\b\b\u0001\u0010#\u001a\u00020\"H§@¢\u0006\u0004\b%\u0010&J \u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00052\b\b\u0001\u0010#\u001a\u00020'H§@¢\u0006\u0004\b)\u0010*J@\u00102\u001a\b\u0012\u0004\u0012\u0002010\u00052\n\b\u0001\u0010,\u001a\u0004\u0018\u00010+2\b\b\u0001\u0010-\u001a\u00020\u000e2\b\b\u0001\u0010.\u001a\u00020\u000e2\b\b\u0001\u00100\u001a\u00020/H§@¢\u0006\u0004\b2\u00103¨\u00064"}, d2 = {"LJp/a;", "", "", "dealId", "agentCommission", "Lcom/avito/android/remote/model/TypedResult;", "LLp/a;", "d", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LNp/a;", "j", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LOp/a;", "c", "", "dealUuid", "LMp/b;", "i", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LKp/a;", "f", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dealID", "LPp/a;", "b", "(Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/avito/android/comfortable_deal/generated/api/deal_stage_api/DealStageApiResponse;", "g", "applicationId", "", "archived", "LQp/a;", "a", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LRp/d;", "request", "LRp/a;", "k", "(LRp/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LUp/b;", "LUp/a;", "e", "(LUp/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LVp/a;", "deal", "phone", "requestId", "Lcom/avito/android/comfortable_deal/generated/api/request_create_api_v_2/Source;", SearchParamsConverterKt.SOURCE, "LVp/b;", "h", "(LVp/a;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/comfortable_deal/generated/api/request_create_api_v_2/Source;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Jp.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC14233a {
    @o("1/mortgage-form/application/{applicationId}/set-archived")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @k({"X-Geo-required: true"})
    @l
    Object a(@s("applicationId") @Y61.k String str, @J81.c("archived") boolean z12, @Y61.k Continuation<? super TypedResult<C14921a>> continuation);

    @o("1/agent-room/redirect-to-vdr")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object b(@J81.c("dealID") @l Long l12, @Y61.k Continuation<? super TypedResult<C14822a>> continuation);

    @f("1/agent-room/deal/{dealId}/get-sold-form")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object c(@s("dealId") long j12, @Y61.k Continuation<? super TypedResult<C14722a>> continuation);

    @o("1/agent-room/deal/{dealId}/calculate-deal-commission")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object d(@s("dealId") long j12, @J81.c("agentCommission") long j13, @Y61.k Continuation<? super TypedResult<C14426a>> continuation);

    @o("1/mortgage-professional/get-entry-point")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object e(@J81.a @Y61.k C15556b c15556b, @Y61.k Continuation<? super TypedResult<C15555a>> continuation);

    @f("1/agent-room/get-latest-contract-url")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object f(@Y61.k Continuation<? super TypedResult<C14339a>> continuation);

    @o("1/comfortable-deal/deal-stage")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object g(@Y61.k Continuation<? super TypedResult<DealStageApiResponse>> continuation);

    @o("2/re-vas/create-request")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object h(@J81.c("deal") @l C15704a c15704a, @J81.c("phone") @Y61.k String str, @J81.c("requestId") @Y61.k String str2, @J81.c(SearchParamsConverterKt.SOURCE) @Y61.k Source source, @Y61.k Continuation<? super TypedResult<C15705b>> continuation);

    @f("1/agent-room/get-deal/{dealUuid}")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object i(@s("dealUuid") @Y61.k String str, @Y61.k Continuation<? super TypedResult<Mp.b>> continuation);

    @f("1/agent-room/deal/{dealId}/get-report-for-agent")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object j(@s("dealId") long j12, @Y61.k Continuation<? super TypedResult<InterfaceC14600a>> continuation);

    @o("1/mortgage-professional/application/list")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object k(@J81.a @Y61.k d dVar, @Y61.k Continuation<? super TypedResult<C15069a>> continuation);
}
