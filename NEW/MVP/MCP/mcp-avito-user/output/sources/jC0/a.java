package JC0;

import J81.e;
import J81.f;
import J81.o;
import J81.t;
import KC0.d;
import KC0.m;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.DeepLinkResponse;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.search.InlineFilterValue;
import e30.InterfaceC39936a;
import io.reactivex.rxjava3.core.I;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: TariffCptApi.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J.\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\t2\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00050\t2\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u000e\u0010\fJ%\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00050\t2\b\b\u0001\u0010\u000f\u001a\u00020\u0002H'¢\u0006\u0004\b\u0011\u0010\fJ%\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00050\t2\b\b\u0001\u0010\u000f\u001a\u00020\u0002H'¢\u0006\u0004\b\u0013\u0010\f¨\u0006\u0014"}, d2 = {"LJC0/a;", "", "", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "remoteContext", "Lcom/avito/android/remote/model/TypedResult;", "LKC0/d;", "b", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/reactivex/rxjava3/core/I;", "LKC0/c;", "e", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "LKC0/e;", "d", "context", "Lcom/avito/android/remote/model/DeepLinkResponse;", "a", "LKC0/m;", "c", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes4.dex */
public interface a {
    @o("4/tariff/cpt/configure/save")
    @e
    @k
    I<TypedResult<DeepLinkResponse>> a(@J81.c("context") @k String context);

    @f("4/tariff/cpt/configure/landing")
    @l
    Object b(@l @t(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME) String str, @l @t("context") String str2, @k Continuation<? super TypedResult<d>> continuation);

    @o("2/tariff/cpt/level/save")
    @e
    @k
    I<TypedResult<m>> c(@J81.c("context") @k String context);

    @f("4/tariff/cpt/configure/migration")
    @k
    I<TypedResult<KC0.e>> d(@l @t("context") String remoteContext);

    @f("2/tariff/cpt/configure/forbidden")
    @k
    I<TypedResult<KC0.c>> e(@l @t("context") String remoteContext);
}
