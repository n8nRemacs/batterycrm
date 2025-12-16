package ie;

import J81.e;
import J81.f;
import J81.k;
import J81.o;
import J81.t;
import Y61.l;
import com.avito.android.authorization.generated.api.ar_flow_v_2.ArFlowV2Response;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import je.C42364b;
import je.InterfaceC42365c;
import ke.C42673b;
import ke.InterfaceC42674c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import le.InterfaceC43738c;
import me.InterfaceC44071d;

/* compiled from: AuthorizationApi.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0004H§@¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0011\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0013\u0010\u0014J\"\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00042\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u000fH§@¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lie/a;", "", "Lje/b;", "request", "Lcom/avito/android/remote/model/TypedResult;", "Lje/c;", "b", "(Lje/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lke/b;", "Lke/c;", "e", "(Lke/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/avito/android/authorization/generated/api/ar_flow_v_2/ArFlowV2Response;", "d", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "code", "login", "Lme/d;", "a", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hash", "Lle/c;", "c", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: ie.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC41389a {
    @o("2/social/code/confirm")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @k({"X-Geo-required: true"})
    @l
    Object a(@J81.c("code") @Y61.k String str, @J81.c("login") @Y61.k String str2, @Y61.k Continuation<? super TypedResult<InterfaceC44071d>> continuation);

    @o("2/automated/recovery/code/confirm")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object b(@J81.a @Y61.k C42364b c42364b, @Y61.k Continuation<? super TypedResult<InterfaceC42365c>> continuation);

    @f("3/register/profiles/list")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @l
    Object c(@l @t("hash") String str, @Y61.k Continuation<? super TypedResult<InterfaceC43738c>> continuation);

    @f("2/automated/recovery/flow")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object d(@Y61.k Continuation<? super TypedResult<ArFlowV2Response>> continuation);

    @o("2/automated/recovery/code/request")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object e(@J81.a @Y61.k C42673b c42673b, @Y61.k Continuation<? super TypedResult<InterfaceC42674c>> continuation);
}
