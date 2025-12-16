package Tx;

import J81.e;
import J81.o;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.ThirdPartyApi;
import com.avito.android.remote.model.early_access_advert.EarlyAccessAdvertResult;
import e30.InterfaceC39936a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: EarlyAccessAdvertApi.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J.\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LTx/a;", "", "", "itemId", "feedbackType", "feedbackText", "Lcom/avito/android/remote/model/early_access_advert/EarlyAccessAdvertResult;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Tx.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC15421a {
    @o("1/fakedoor-feedback")
    @e
    @l
    @ThirdPartyApi
    Object a(@J81.c("itemID") @k String str, @J81.c("feedbackType") @k String str2, @J81.c("feedbackText") @k String str3, @k Continuation<? super EarlyAccessAdvertResult> continuation);
}
