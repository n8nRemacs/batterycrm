package aP0;

import J81.f;
import J81.s;
import J81.t;
import PO0.b;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.slot.delivery_subsidies.DeliverySubsidiesSlotKt;
import com.avito.android.wallet.page.topup.form.remote.dto.TopUpForm;
import e30.InterfaceC39936a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: WalletApi.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\b\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u0007J\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\r\u0010\u0007J,\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u00022\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LaP0/a;", "", "", "topUpId", "Lcom/avito/android/remote/model/TypedResult;", "LPO0/b$a;", "d", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "operationId", "LUO0/a;", "a", DeliverySubsidiesSlotKt.AMOUNT, "Lcom/avito/android/wallet/page/topup/form/remote/dto/TopUpForm;", "b", "historyId", "pageToken", "LYO0/b;", "c", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: aP0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC19802a {

    /* compiled from: WalletApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: aP0.a$a, reason: collision with other inner class name */
    public static final class C1494a {
    }

    @f("1/payment/operation/{operationId}")
    @l
    Object a(@s("operationId") @k String str, @k Continuation<? super TypedResult<UO0.a>> continuation);

    @f("1/payment/wallet/form")
    @l
    Object b(@l @t(DeliverySubsidiesSlotKt.AMOUNT) String str, @k Continuation<? super TypedResult<TopUpForm>> continuation);

    @f("1/payment/history/{historyId}")
    @l
    Object c(@s("historyId") @k String str, @l @t("pageToken") String str2, @k Continuation<? super TypedResult<YO0.b>> continuation);

    @f("1/wallet/info")
    @l
    Object d(@l @t("topupID") String str, @k Continuation<? super TypedResult<b.a>> continuation);
}
