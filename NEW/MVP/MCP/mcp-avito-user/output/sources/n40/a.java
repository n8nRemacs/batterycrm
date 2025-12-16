package N40;

import J81.f;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.offlinization.C;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: OrderApi.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J@\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\t2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\r\u0010\u000eJB\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LN40/a;", "", "", "orderId", "Lcom/avito/android/remote/model/TypedResult;", "LO40/c;", "c", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "timezoneId", "", "supportSelectedPvzUniversalMap", "segment", "LO40/a;", "b", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "templateVersion", "LO40/b;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes15.dex */
public interface a {
    @C(timeoutMs = 2500)
    @f("2/profile/order")
    @l
    Object a(@t("referenceID") @k String str, @com.avito.android.offlinization.k @t("location") @k String str2, @com.avito.android.offlinization.k @l @t("templateVersion") Integer num, @l @t("segment") String str3, @k Continuation<? super TypedResult<O40.b>> continuation);

    @C(timeoutMs = 2750)
    @f("1/profile/order")
    @l
    Object b(@t("orderId") @k String str, @com.avito.android.offlinization.k @t("location") @k String str2, @com.avito.android.offlinization.k @t("supportSelectedPvzUniversalMap") boolean z12, @l @t("segment") String str3, @k Continuation<? super TypedResult<O40.a>> continuation);

    @f("1/profile/order/lastUpdate")
    @l
    Object c(@t("orderId") @k String str, @k Continuation<? super TypedResult<O40.c>> continuation);
}
