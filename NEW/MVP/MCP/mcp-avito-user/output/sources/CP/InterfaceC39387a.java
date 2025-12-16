package cp;

import J81.d;
import J81.e;
import J81.f;
import J81.o;
import J81.s;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.comfortable_deal.api.model.AcceptCallbackResponse;
import com.avito.android.comfortable_deal.api.model.AgentRoomDealResponse;
import com.avito.android.comfortable_deal.api.model.ClientResponse;
import com.avito.android.comfortable_deal.api.model.DealResponse;
import com.avito.android.comfortable_deal.api.model.IsContractSignedResponse;
import com.avito.android.comfortable_deal.api.model.TeamMemberPhone;
import com.avito.android.publish.drafts.LocalPublishState;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.TypedResult;
import dp.C39774c;
import dp.C39776e;
import e30.InterfaceC39936a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ComfortableDealApi.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u000b\u001a\u00020\u0002H§@¢\u0006\u0004\b\f\u0010\u0007J2\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00042\u0014\b\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\rH§@¢\u0006\u0004\b\u0011\u0010\u0012J2\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000f0\u00042\u0014\b\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\rH§@¢\u0006\u0004\b\u0014\u0010\u0012J2\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000f0\u00042\u0014\b\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\rH§@¢\u0006\u0004\b\u0015\u0010\u0012J*\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u001a\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001b\u0010\u0019J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0004H§@¢\u0006\u0004\b\u001d\u0010\nJ\"\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00042\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b \u0010\u0007J,\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00042\b\b\u0001\u0010!\u001a\u00020\u00022\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b#\u0010\u0019J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u0004H§@¢\u0006\u0004\b%\u0010\nJ6\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\rH§@¢\u0006\u0004\b&\u0010'J2\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u000f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b*\u0010\u0019J*\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010+\u001a\u00020\u0002H§@¢\u0006\u0004\b,\u0010\u0019¨\u0006-"}, d2 = {"Lcp/a;", "", "", "dealId", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/comfortable_deal/api/model/AgentRoomDealResponse;", "d", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/avito/android/comfortable_deal/api/model/IsContractSignedResponse;", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processId", "b", "", LocalPublishState.FIELDS, "Ldp/k;", "Lcom/avito/android/comfortable_deal/api/model/ClientResponse;", "o", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/avito/android/comfortable_deal/api/model/DealResponse;", "g", "k", "clientId", "Lcom/avito/android/comfortable_deal/api/model/TeamMemberPhone;", "i", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "agentId", "e", "Ldp/c;", "h", SearchParamsConverterKt.SOURCE, "Ldp/o;", "j", "phone", "Lcom/avito/android/comfortable_deal/api/model/AcceptCallbackResponse;", "m", "Ldp/e;", "a", "l", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "filter", "Ldp/f;", "f", "comment", "n", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: cp.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC39387a {
    @f("2/client-room/get-deal")
    @l
    Object a(@k Continuation<? super TypedResult<C39776e>> continuation);

    @o("1/agent-room/sign-contract")
    @e
    @l
    Object b(@J81.c("idk") @k String str, @k Continuation<? super TypedResult<Object>> continuation);

    @f("1/agent-room/is-contract-signed")
    @l
    Object c(@k Continuation<? super TypedResult<IsContractSignedResponse>> continuation);

    @f("1/agent-room/deal/{dealId}")
    @l
    Object d(@s("dealId") @k String str, @k Continuation<? super TypedResult<AgentRoomDealResponse>> continuation);

    @o("1/agent-room/deal/{dealId}/set-agent")
    @e
    @l
    Object e(@s("dealId") @k String str, @J81.c("agentId") @k String str2, @k Continuation<? super TypedResult<Object>> continuation);

    @f("1/agent-room/deal/{dealId}/list-deal-comments")
    @l
    Object f(@s("dealId") @k String str, @l @t("filter") String str2, @k Continuation<? super TypedResult<dp.k<dp.f>>> continuation);

    @o("1/agent-room/list-requests")
    @e
    @l
    Object g(@d @k Map<String, String> map, @k Continuation<? super TypedResult<dp.k<DealResponse>>> continuation);

    @f("1/agent-room/list-available-agents")
    @l
    Object h(@k Continuation<? super TypedResult<C39774c>> continuation);

    @f("1/agent-room/deal/{dealId}/get-seller-number")
    @l
    Object i(@s("dealId") @k String str, @t("clientId") @k String str2, @k Continuation<? super TypedResult<TeamMemberPhone>> continuation);

    @f("1/comfortable-deal/user-role")
    @l
    Object j(@l @t("utm_source") String str, @k Continuation<? super TypedResult<dp.o>> continuation);

    @o("1/agent-room/list-archived-deals")
    @e
    @l
    Object k(@d @k Map<String, String> map, @k Continuation<? super TypedResult<dp.k<DealResponse>>> continuation);

    @o("1/agent-room/deal/{dealId}/do-transition")
    @e
    @l
    Object l(@s("dealId") @k String str, @d @k Map<String, String> map, @k Continuation<? super TypedResult<Object>> continuation);

    @o("1/pp-user-acquisition/accept-callback-request")
    @e
    @l
    Object m(@J81.c("phone") @k String str, @J81.c(SearchParamsConverterKt.SOURCE) @l String str2, @k Continuation<? super TypedResult<AcceptCallbackResponse>> continuation);

    @o("1/agent-room/create-deal-note")
    @e
    @l
    Object n(@J81.c("dealId") @k String str, @J81.c("text") @k String str2, @k Continuation<? super TypedResult<Object>> continuation);

    @o("1/agent-room/list-clients")
    @e
    @l
    Object o(@d @k Map<String, String> map, @k Continuation<? super TypedResult<dp.k<ClientResponse>>> continuation);
}
