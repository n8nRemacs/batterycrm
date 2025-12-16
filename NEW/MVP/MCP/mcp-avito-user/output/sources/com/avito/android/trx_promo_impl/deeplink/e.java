package com.avito.android.trx_promo_impl.deeplink;

import VF0.a;
import Y41.p;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.error.z;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.trx_promo_public.deeplink.TrxPromoConfigureCancelLink;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.H;
import kotlinx.coroutines.T;

/* compiled from: TrxPromoConfigureCancelDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.trx_promo_impl.deeplink.TrxPromoConfigureCancelDeeplinkHandler$doHandle$1", f = "TrxPromoConfigureCancelDeeplinkHandler.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class e extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f304081q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f f304082r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ TrxPromoConfigureCancelLink f304083s;

    /* compiled from: TrxPromoConfigureCancelDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements Y41.l<VF0.a, G0> {
        @Override // Y41.l
        public final G0 invoke(VF0.a aVar) {
            VF0.a aVar2 = aVar;
            f fVar = (f) this.receiver;
            fVar.f304086h.g(fVar.d(), false);
            if (aVar2 instanceof a.b) {
                String message = ((a.b) aVar2).getMessage();
                if (message != null) {
                    fVar.f304085g.z1(message);
                }
                fVar.j(TrxPromoConfigureCancelLink.b.C9350b.f304494b);
            } else if (aVar2 instanceof a.C1169a) {
                fVar.i(TrxPromoConfigureCancelLink.b.c.f304495b, fVar.f304087i, ((a.C1169a) aVar2).getAction());
            }
            return G0.f406611a;
        }
    }

    /* compiled from: TrxPromoConfigureCancelDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<String, G0> {
        @Override // Y41.l
        public final G0 invoke(String str) {
            f fVar = (f) this.receiver;
            fVar.f304086h.g(fVar.d(), false);
            PrintableText printableTextF = com.avito.android.printable_text.b.f(str);
            ToastBarPosition toastBarPosition = ToastBarPosition.f181046d;
            f.c.f125255c.getClass();
            a.i.C4057a.d(fVar.f304085g, printableTextF, null, null, f.c.a.b(), 0, toastBarPosition, null, null, 1966);
            fVar.j(TrxPromoConfigureCancelLink.b.a.f304493b);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, TrxPromoConfigureCancelLink trxPromoConfigureCancelLink, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f304082r = fVar;
        this.f304083s = trxPromoConfigureCancelLink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new e(this.f304082r, this.f304083s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f304081q;
        f fVar = this.f304082r;
        if (i12 == 0) {
            C42729a0.b(obj);
            fVar.f304086h.g(fVar.d(), true);
            String str = this.f304083s.f304492b;
            this.f304081q = 1;
            obj = fVar.f304084f.a(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        z.o((TypedResult) obj, new a(1, fVar, f.class, "onSuccess", "onSuccess(Lcom/avito/android/trx_promo_impl/generated/api/api_trx_promo_configure_cancel_v_2/ApiTrxPromoConfigureCancelV2Response;)V", 0), new b(1, fVar, f.class, "onError", "onError(Ljava/lang/String;)V", 0), null, 60);
        return G0.f406611a;
    }
}
