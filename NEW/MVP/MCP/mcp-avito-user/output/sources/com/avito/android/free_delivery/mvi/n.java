package com.avito.android.free_delivery.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.u;
import com.avito.android.free_delivery.FreeDeliveryDetails;
import com.avito.android.free_delivery.mvi.entity.FreeDeliveryInternalAction;
import com.avito.android.free_delivery.v;
import com.avito.android.free_delivery.z;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: FreeDeliveryReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/free_delivery/mvi/n;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/free_delivery/mvi/entity/FreeDeliveryInternalAction;", "LUE/c;", "_avito_free-delivery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class n implements u<FreeDeliveryInternalAction, UE.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f158809b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final FreeDeliveryDetails f158810c;

    @Inject
    public n(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k FreeDeliveryDetails freeDeliveryDetails) {
        this.f158809b = interfaceC28373a;
        this.f158810c = freeDeliveryDetails;
    }

    @Override // com.avito.android.arch.mvi.u
    public final UE.c a(FreeDeliveryInternalAction freeDeliveryInternalAction, UE.c cVar) {
        FreeDeliveryInternalAction freeDeliveryInternalAction2 = freeDeliveryInternalAction;
        UE.c cVar2 = cVar;
        boolean z12 = freeDeliveryInternalAction2 instanceof FreeDeliveryInternalAction.Content;
        InterfaceC28373a interfaceC28373a = this.f158809b;
        FreeDeliveryDetails freeDeliveryDetails = this.f158810c;
        if (z12) {
            interfaceC28373a.c(new z(String.valueOf(freeDeliveryDetails.getItemPrice()), freeDeliveryDetails.getDiscount(), freeDeliveryDetails.getMinDiscount(), freeDeliveryDetails.getMaxDiscount(), "promo_block", Long.valueOf(freeDeliveryDetails.getItemId()), null, 64, null));
            return UE.c.a(cVar2, freeDeliveryDetails.getDiscount(), null, false, 254);
        }
        if (freeDeliveryInternalAction2 instanceof FreeDeliveryInternalAction.Updated) {
            interfaceC28373a.c(new v(String.valueOf(freeDeliveryDetails.getItemPrice()), ((FreeDeliveryInternalAction.Updated) freeDeliveryInternalAction2).f158792b, freeDeliveryDetails.getDiscount(), cVar2.f16315d, cVar2.f16316e, "promo_block", Long.valueOf(freeDeliveryDetails.getItemId()), null, 128, null));
            return UE.c.a(cVar2, 0, null, false, 207);
        }
        if (freeDeliveryInternalAction2 instanceof FreeDeliveryInternalAction.Error) {
            return UE.c.a(cVar2, 0, null, false, 223);
        }
        if (freeDeliveryInternalAction2 instanceof FreeDeliveryInternalAction.Loading) {
            return UE.c.a(cVar2, 0, null, true, 223);
        }
        if (freeDeliveryInternalAction2 instanceof FreeDeliveryInternalAction.Finalize) {
            return UE.c.a(cVar2, Math.min(freeDeliveryDetails.getMaxDiscount(), Math.max(((FreeDeliveryInternalAction.Finalize) freeDeliveryInternalAction2).f158788b, freeDeliveryDetails.getMinDiscount())), null, false, WebSocketProtocol.PAYLOAD_SHORT);
        }
        if (freeDeliveryInternalAction2 instanceof FreeDeliveryInternalAction.Input) {
            UE.c cVarA = UE.c.a(cVar2, 0, null, false, 119);
            int maxDiscount = freeDeliveryDetails.getMaxDiscount();
            int i12 = ((FreeDeliveryInternalAction.Input) freeDeliveryInternalAction2).f158789b;
            return i12 > maxDiscount ? UE.c.a(cVarA, i12, String.valueOf(freeDeliveryDetails.getDiscountTooBigHint()), false, 252) : i12 < freeDeliveryDetails.getMinDiscount() ? UE.c.a(cVarA, i12, String.valueOf(freeDeliveryDetails.getDiscountTooSmallHint()), false, 252) : UE.c.a(cVarA, i12, null, false, 254);
        }
        if (freeDeliveryInternalAction2 instanceof FreeDeliveryInternalAction.Slider) {
            UE.c cVarA2 = UE.c.a(cVar2, 0, null, false, 251);
            int iB2 = kotlin.math.b.b(((FreeDeliveryInternalAction.Slider) freeDeliveryInternalAction2).f158791b);
            return iB2 == freeDeliveryDetails.getMaxDiscount() ? UE.c.a(cVarA2, iB2, String.valueOf(freeDeliveryDetails.getDiscountTooBigHint()), false, 252) : iB2 == freeDeliveryDetails.getMinDiscount() ? UE.c.a(cVarA2, iB2, String.valueOf(freeDeliveryDetails.getDiscountTooSmallHint()), false, 252) : UE.c.a(cVarA2, iB2, null, false, 254);
        }
        if (!(freeDeliveryInternalAction2 instanceof FreeDeliveryInternalAction.Dismiss)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!cVar2.f16317f) {
            interfaceC28373a.c(new com.avito.android.free_delivery.u(cVar2.f16315d, cVar2.f16316e, String.valueOf(freeDeliveryDetails.getItemPrice()), "promo_block", Long.valueOf(freeDeliveryDetails.getItemId()), null, 32, null));
        }
        return UE.c.a(cVar2, 0, null, false, 223);
    }
}
