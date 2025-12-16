package nM0;

import J81.e;
import J81.o;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import oM0.C44666a;

/* compiled from: VasPromotionDeeplinkApi.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LnM0/a;", "", "", "checkoutContext", "", "itemId", "Lcom/avito/android/remote/model/TypedResult;", "LoM0/a;", "a", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_vas-promotion-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: nM0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC44292a {
    @o("1/promotion/deeplink")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object a(@J81.c("checkoutContext") @k String str, @J81.c("itemId") long j12, @k Continuation<? super TypedResult<C44666a>> continuation);
}
