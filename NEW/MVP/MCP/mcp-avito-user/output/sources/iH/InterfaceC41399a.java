package ih;

import J81.d;
import J81.e;
import J81.f;
import J81.o;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.DeepLinkResponse;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import io.reactivex.rxjava3.core.z;
import java.util.Map;
import jh.C42376A;
import jh.i;
import jh.j;
import jh.n;
import jh.v;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: BbipApi.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\tJE\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\n2\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00060\u00052\u0014\b\u0001\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0010H'¢\u0006\u0004\b\u0013\u0010\u0014J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0016\u0010\u0017J,\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00062\u0014\b\u0001\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0010H§@¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u00062\u0014\b\u0001\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0010H§@¢\u0006\u0004\b\u001b\u0010\u001aJ*\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001d\u0010\u0017J@\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\n2\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lih/a;", "", "", "itemId", "checkoutContext", "Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/TypedResult;", "Ljh/i;", "d", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "", "duration", "budget", "Ljh/n;", "g", "(Ljava/lang/String;IILjava/lang/String;)Lio/reactivex/rxjava3/core/z;", "", "params", "Lcom/avito/android/remote/model/DeepLinkResponse;", "c", "(Ljava/util/Map;)Lio/reactivex/rxjava3/core/z;", "Ljh/v;", "f", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljh/A;", "a", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "h", "Ljh/j;", "e", "b", "(Ljava/lang/String;IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: ih.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC41399a {
    @o("1/bbip/private/forecast")
    @e
    @l
    Object a(@d @k Map<String, String> map, @k Continuation<? super TypedResult<C42376A>> continuation);

    @f("1/bbip/forecast")
    @l
    Object b(@t("itemId") @k String str, @t("duration") int i12, @t("budget") int i13, @l @t("checkoutContext") String str2, @k Continuation<? super TypedResult<n>> continuation);

    @o("2/bbip/context")
    @e
    @k
    z<TypedResult<DeepLinkResponse>> c(@d @k Map<String, String> params);

    @f("1/bbip/bbl/configurator")
    @k
    z<TypedResult<i>> d(@t("itemId") @k String itemId, @t("checkoutContext") @k String checkoutContext);

    @f("3/bbip/configurator")
    @l
    Object e(@t("itemId") @k String str, @t("checkoutContext") @k String str2, @k Continuation<? super TypedResult<j>> continuation);

    @f("2/bbip/private/configurator")
    @l
    Object f(@t("itemId") @k String str, @t("checkoutContext") @k String str2, @k Continuation<? super TypedResult<v>> continuation);

    @f("1/bbip/forecast")
    @k
    z<TypedResult<n>> g(@t("itemId") @k String itemId, @t("duration") int duration, @t("budget") int budget, @l @t("checkoutContext") String checkoutContext);

    @o("2/bbip/context")
    @e
    @l
    Object h(@d @k Map<String, String> map, @k Continuation<? super TypedResult<DeepLinkResponse>> continuation);
}
