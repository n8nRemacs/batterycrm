package com.avito.android.short_term_rent.soft_booking.mvi;

import com.avito.android.short_term_rent.common.entity.PromoCode;
import com.avito.android.short_term_rent.common.entity.PromoCodesDialog;
import com.avito.android.short_term_rent.promo_codes.ui.StrSoftBookingPromoCodesDialogOpenParams;
import com.avito.android.short_term_rent.soft_booking.mvi.entity.StrSoftBookingInternalAction;
import com.avito.android.util.O2;
import java.util.ArrayList;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StrSoftBookingActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.short_term_rent.soft_booking.mvi.StrSoftBookingActor$handlePromoCodeInfoClick$1", f = "StrSoftBookingActor.kt", i = {}, l = {430}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class l extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrSoftBookingInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f282768q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f282769r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.short_term_rent.soft_booking.mvi.state.a f282770s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C34981a f282771t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(C34981a c34981a, com.avito.android.short_term_rent.soft_booking.mvi.state.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f282770s = aVar;
        this.f282771t = c34981a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        l lVar = new l(this.f282771t, this.f282770s, continuation);
        lVar.f282769r = obj;
        return lVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrSoftBookingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((l) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f282768q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f282769r;
            com.avito.android.short_term_rent.soft_booking.mvi.state.a aVar = this.f282770s;
            pw0.i iVar = aVar.f282799h;
            PromoCodesDialog promoCodesDialog = iVar.f428881b;
            ArrayList arrayList = null;
            boolean zA2 = O2.a(promoCodesDialog != null ? promoCodesDialog.f282226e : null);
            String str = aVar.f282795d.f428849c;
            if (promoCodesDialog != null) {
                ArrayList<PromoCode> arrayList2 = promoCodesDialog.f282226e;
                if (arrayList2 != null) {
                    arrayList = new ArrayList(C42745f0.q(arrayList2, 10));
                    for (PromoCode promoCode : arrayList2) {
                        arrayList.add(new PromoCode(promoCode.f282217b, promoCode.f282218c, promoCode.f282219d, promoCode.f282220e, promoCode.f282221f, promoCode.f282222g));
                    }
                }
                StrSoftBookingPromoCodesDialogOpenParams strSoftBookingPromoCodesDialogOpenParams = new StrSoftBookingPromoCodesDialogOpenParams(str, promoCodesDialog.f282223b, promoCodesDialog.f282225d, promoCodesDialog.f282224c, iVar.f428880a, arrayList);
                this.f282771t.f282673d.h(zA2);
                StrSoftBookingInternalAction.ShowPromoCodesDialog showPromoCodesDialog = new StrSoftBookingInternalAction.ShowPromoCodesDialog(strSoftBookingPromoCodesDialogOpenParams);
                this.f282768q = 1;
                if (interfaceC43172j.emit(showPromoCodesDialog, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
