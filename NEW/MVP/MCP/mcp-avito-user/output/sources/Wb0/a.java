package WB0;

import J81.e;
import J81.f;
import J81.o;
import J81.t;
import Y61.k;
import Y61.l;
import bC0.C25495d;
import bC0.g;
import bC0.h;
import bC0.j;
import cC0.C27004a;
import com.avito.android.remote.model.DeepLinkResponse;
import com.avito.android.remote.model.TypedResult;
import dC0.AbstractC39559a;
import e30.InterfaceC39936a;
import eC0.r;
import eC0.s;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.core.z;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: TariffApi.kt */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\u0006H'¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\u0006H'¢\u0006\u0004\b\u0011\u0010\u000fJ/\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00020\f2\b\b\u0001\u0010\u0007\u001a\u00020\u00122\b\b\u0001\u0010\u000b\u001a\u00020\u0006H'¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00020\f2\b\b\u0001\u0010\u0007\u001a\u00020\u00122\b\b\u0001\u0010\u000b\u001a\u00020\u0006H'¢\u0006\u0004\b\u0017\u0010\u0015J/\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00020\f2\b\b\u0001\u0010\u0007\u001a\u00020\u00122\b\b\u0001\u0010\u000b\u001a\u00020\u0006H'¢\u0006\u0004\b\u0018\u0010\u0015J/\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00020\f2\b\b\u0001\u0010\u0007\u001a\u00020\u00122\b\b\u0001\u0010\u000b\u001a\u00020\u0006H'¢\u0006\u0004\b\u0019\u0010\u0015J%\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\u0006H'¢\u0006\u0004\b\u001b\u0010\u000fJ%\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00020\u001c2\b\b\u0001\u0010\u000b\u001a\u00020\u0006H'¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0002H§@¢\u0006\u0004\b!\u0010\u0005J \u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00022\b\b\u0001\u0010\"\u001a\u00020\u0006H§@¢\u0006\u0004\b$\u0010\nJ*\u0010%\u001a\b\u0012\u0004\u0012\u00020 0\u00022\b\b\u0001\u0010\"\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b%\u0010&J \u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00022\b\b\u0001\u0010\"\u001a\u00020\u0006H§@¢\u0006\u0004\b(\u0010\nJ \u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00022\b\b\u0001\u0010\"\u001a\u00020\u0006H§@¢\u0006\u0004\b*\u0010\nJ \u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00022\b\b\u0001\u0010\"\u001a\u00020\u0006H§@¢\u0006\u0004\b,\u0010\nJ \u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00022\b\b\u0001\u0010\"\u001a\u00020\u0006H§@¢\u0006\u0004\b.\u0010\nJ \u00100\u001a\b\u0012\u0004\u0012\u00020 0\u00022\b\b\u0001\u0010/\u001a\u00020\u0006H§@¢\u0006\u0004\b0\u0010\nJ\u0016\u00101\u001a\b\u0012\u0004\u0012\u00020 0\u0002H§@¢\u0006\u0004\b1\u0010\u0005J \u00103\u001a\b\u0012\u0004\u0012\u0002020\u00022\b\b\u0001\u0010/\u001a\u00020\u0006H§@¢\u0006\u0004\b3\u0010\n¨\u00064"}, d2 = {"LWB0/a;", "", "Lcom/avito/android/remote/model/TypedResult;", "LdC0/a;", "p", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "advance", "LbC0/f;", "q", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "context", "Lio/reactivex/rxjava3/core/z;", "LbC0/j;", "i", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "LbC0/d;", "l", "", "LbC0/g;", "b", "(ILjava/lang/String;)Lio/reactivex/rxjava3/core/z;", "LbC0/h;", "a", "e", "c", "LcC0/a;", "d", "Lio/reactivex/rxjava3/core/I;", "LXB0/a;", "o", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/DeepLinkResponse;", "n", "remoteContext", "LeC0/f;", "f", "m", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LeC0/l;", "s", "LeC0/g;", "g", "LeC0/r;", "t", "LeC0/t;", "j", "value", "r", "k", "LeC0/s;", "h", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes4.dex */
public interface a {
    @o("2/tariff/cpa/publication/save")
    @e
    @k
    z<TypedResult<h>> a(@J81.c("advance") int advance, @J81.c("context") @k String context);

    @o("1/tariff/cpa/publication/save")
    @e
    @k
    z<TypedResult<g>> b(@J81.c("advance") int advance, @J81.c("context") @k String context);

    @o("2/tariff/cpa/configure/save")
    @e
    @k
    z<TypedResult<h>> c(@J81.c("advance") int advance, @J81.c("context") @k String context);

    @o("1/tariff/cpa/configure/info")
    @e
    @k
    z<TypedResult<C27004a>> d(@J81.c("context") @k String context);

    @o("1/tariff/cpa/configure/save")
    @e
    @k
    z<TypedResult<g>> e(@J81.c("advance") int advance, @J81.c("context") @k String context);

    @f("1/tariff/cpx/configure/advance")
    @l
    Object f(@t("context") @k String str, @k Continuation<? super TypedResult<eC0.f>> continuation);

    @f("1/tariff/cpx/configure/landing")
    @l
    Object g(@t("context") @k String str, @k Continuation<? super TypedResult<eC0.g>> continuation);

    @o("1/tariff/cpx/info/advance/save")
    @e
    @l
    Object h(@J81.c("value") @k String str, @k Continuation<? super TypedResult<s>> continuation);

    @o("3/tariff/cpa/publication/advance")
    @e
    @k
    z<TypedResult<j>> i(@J81.c("context") @k String context);

    @o("1/tariff/cpx/save")
    @e
    @l
    Object j(@J81.c("context") @k String str, @k Continuation<? super TypedResult<eC0.t>> continuation);

    @o("1/tariff/cpx/info/limit/cancel")
    @l
    Object k(@k Continuation<? super TypedResult<DeepLinkResponse>> continuation);

    @o("3/tariff/cpa/configure/advance")
    @e
    @k
    z<TypedResult<C25495d>> l(@J81.c("context") @k String context);

    @o("1/tariff/cpx/configure/advance/save")
    @e
    @l
    Object m(@J81.c("context") @k String str, @J81.c("advance") @k String str2, @k Continuation<? super TypedResult<DeepLinkResponse>> continuation);

    @o("1/tariff/cpa/close")
    @l
    Object n(@k Continuation<? super TypedResult<DeepLinkResponse>> continuation);

    @o("1/tariff/cpa/configure/services")
    @e
    @k
    I<TypedResult<XB0.a>> o(@J81.c("context") @k String context);

    @f("7/tariff/cpa/info")
    @l
    Object p(@k Continuation<? super TypedResult<AbstractC39559a>> continuation);

    @o("1/tariff/cpa/refill")
    @e
    @l
    Object q(@J81.c("advance") @k String str, @k Continuation<? super TypedResult<bC0.f>> continuation);

    @o("1/tariff/cpx/info/limit/save")
    @e
    @l
    Object r(@J81.c("value") @k String str, @k Continuation<? super TypedResult<DeepLinkResponse>> continuation);

    @f("3/tariff/cpx/levels")
    @l
    Object s(@t("context") @k String str, @k Continuation<? super TypedResult<eC0.l>> continuation);

    @f("1/tariff/cpx/configure/levels")
    @l
    Object t(@t("context") @k String str, @k Continuation<? super TypedResult<r>> continuation);
}
