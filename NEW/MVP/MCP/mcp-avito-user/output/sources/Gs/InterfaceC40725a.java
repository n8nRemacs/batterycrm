package gs;

import J81.e;
import J81.o;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import hs.d;
import hs.f;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: CpxPromoApi.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J6\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\b2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0004\b\f\u0010\rJ4\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000e\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lgs/a;", "", "", "context", "Lcom/avito/android/remote/model/TypedResult;", "Lhs/d;", "c", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "value", "limit", "Lhs/f;", "d", "(Ljava/lang/String;JLjava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "budget", "a", "(Ljava/lang/String;JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: gs.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC40725a {
    @o("1/cpa-cjm/cpx-promo/setAuto")
    @e
    @l
    Object a(@J81.c("context") @k String str, @J81.c("value") long j12, @J81.c("budget") @k String str2, @k Continuation<? super TypedResult<f>> continuation);

    @o("1/cpa-cjm/cpx-promo/removeCurrentPromotion")
    @e
    @l
    Object b(@J81.c("context") @k String str, @k Continuation<? super TypedResult<f>> continuation);

    @J81.f("2/cpa-cjm/cpx-promo/getData")
    @l
    Object c(@t("context") @k String str, @k Continuation<? super TypedResult<d>> continuation);

    @o("1/cpa-cjm/cpx-promo/setManual")
    @e
    @l
    Object d(@J81.c("context") @k String str, @J81.c("value") long j12, @J81.c("limit") @l Long l12, @k Continuation<? super TypedResult<f>> continuation);
}
