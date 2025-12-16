package Nb;

import J81.f;
import J81.k;
import J81.o;
import J81.t;
import Ob.C14667a;
import Rb.e;
import Rb.m;
import Y61.l;
import com.avito.android.ai_assistant.generated.api.action.ActionResponse;
import com.avito.android.ai_assistant.generated.api.action.InputBody;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: AiAssistantApi.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J,\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ:\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00052\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00052\b\b\u0001\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0013\u0010\u0014J*\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00052\b\b\u0001\u0010\u0011\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LNb/a;", "", "", "idempotentId", "context", "Lcom/avito/android/remote/model/TypedResult;", "LOb/a;", "d", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "openedChatId", "", "offset", "limit", "LPb/b;", "e", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/avito/android/ai_assistant/generated/api/action/InputBody;", "request", "Lcom/avito/android/ai_assistant/generated/api/action/ActionResponse;", "c", "(Lcom/avito/android/ai_assistant/generated/api/action/InputBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LRb/e;", "LRb/m;", "a", "(Ljava/lang/String;LRb/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LQb/e;", "LQb/m;", "b", "(LQb/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Nb.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC14555a {
    @o("2/ai/assistant/message/send")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @l
    Object a(@t("idempotentId") @Y61.k String str, @J81.a @Y61.k e eVar, @Y61.k Continuation<? super TypedResult<m>> continuation);

    @o("2/ai/assistant/open")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @l
    Object b(@J81.a @Y61.k Qb.e eVar, @Y61.k Continuation<? super TypedResult<Qb.m>> continuation);

    @o("1/ai/assistant/message/action")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @l
    Object c(@J81.a @Y61.k InputBody inputBody, @Y61.k Continuation<? super TypedResult<ActionResponse>> continuation);

    @f("1/ai/assistant/chat/discover")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @l
    Object d(@t("idempotentId") @Y61.k String str, @l @t("context") String str2, @Y61.k Continuation<? super TypedResult<C14667a>> continuation);

    @f("1/ai/assistant/chat/list")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @l
    Object e(@l @t("openedChatId") String str, @l @t("offset") Long l12, @l @t("limit") Long l13, @Y61.k Continuation<? super TypedResult<Pb.b>> continuation);
}
