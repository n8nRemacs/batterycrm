package com.avito.android.trx_promo_impl.deeplink;

import Y41.p;
import android.os.Bundle;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.error.z;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.trx_promo_public.deeplink.TrxPromoConfigureApplyLink;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: TrxPromoConfigureApplyDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.trx_promo_impl.deeplink.TrxPromoConfigureApplyDeeplinkHandler$doHandle$1", f = "TrxPromoConfigureApplyDeeplinkHandler.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f304067q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Bundle f304068r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.trx_promo_impl.deeplink.b f304069s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ TrxPromoConfigureApplyLink f304070t;

    /* compiled from: TrxPromoConfigureApplyDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.trx_promo_impl.deeplink.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C9330a extends H implements Y41.l<UF0.a, G0> {
        @Override // Y41.l
        public final G0 invoke(UF0.a aVar) {
            com.avito.android.trx_promo_impl.deeplink.b bVar = (com.avito.android.trx_promo_impl.deeplink.b) this.receiver;
            bVar.f304073h.g(bVar.d(), false);
            bVar.i(TrxPromoConfigureApplyLink.b.C9349b.f304491b, bVar.f304074i, aVar.getUri());
            return G0.f406611a;
        }
    }

    /* compiled from: TrxPromoConfigureApplyDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<String, G0> {
        @Override // Y41.l
        public final G0 invoke(String str) {
            com.avito.android.trx_promo_impl.deeplink.b bVar = (com.avito.android.trx_promo_impl.deeplink.b) this.receiver;
            bVar.f304073h.g(bVar.d(), false);
            PrintableText printableTextF = com.avito.android.printable_text.b.f(str);
            ToastBarPosition toastBarPosition = ToastBarPosition.f181046d;
            f.c.f125255c.getClass();
            a.i.C4057a.d(bVar.f304072g, printableTextF, null, null, f.c.a.b(), 0, toastBarPosition, null, null, 1966);
            bVar.j(TrxPromoConfigureApplyLink.b.a.f304490b);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Bundle bundle, com.avito.android.trx_promo_impl.deeplink.b bVar, TrxPromoConfigureApplyLink trxPromoConfigureApplyLink, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f304068r = bundle;
        this.f304069s = bVar;
        this.f304070t = trxPromoConfigureApplyLink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new a(this.f304068r, this.f304069s, this.f304070t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object objB;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f304067q;
        com.avito.android.trx_promo_impl.deeplink.b bVar = this.f304069s;
        if (i12 == 0) {
            C42729a0.b(obj);
            Bundle bundle = this.f304068r;
            Integer numBoxInt = (bundle == null || !bundle.containsKey("trx_promo_key_configure_apply_commission")) ? null : Boxing.boxInt(bundle.getInt("trx_promo_key_configure_apply_commission"));
            String string = bundle != null ? bundle.getString("trx_promo_key_configure_apply_date_from") : null;
            String string2 = bundle != null ? bundle.getString("trx_promo_key_configure_apply_date_to") : null;
            if (numBoxInt == null) {
                bVar.j(TrxPromoConfigureApplyLink.b.a.f304490b);
                return G0.f406611a;
            }
            bVar.f304073h.g(bVar.d(), true);
            String string3 = numBoxInt.toString();
            String str = this.f304070t.f304489b;
            this.f304067q = 1;
            objB = bVar.f304071f.b(string3, string, string2, str, this);
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            objB = obj;
        }
        z.o((TypedResult) objB, new C9330a(1, bVar, com.avito.android.trx_promo_impl.deeplink.b.class, "onSuccessV3", "onSuccessV3(Lcom/avito/android/trx_promo_impl/generated/api/api_trx_promo_configure_apply_v_3/ApiTrxPromoConfigureApplyV3Response;)V", 0), new b(1, bVar, com.avito.android.trx_promo_impl.deeplink.b.class, "onError", "onError(Ljava/lang/String;)V", 0), null, 60);
        return G0.f406611a;
    }
}
