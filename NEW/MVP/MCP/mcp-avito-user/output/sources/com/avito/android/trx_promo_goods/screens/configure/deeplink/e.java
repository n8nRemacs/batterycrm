package com.avito.android.trx_promo_goods.screens.configure.deeplink;

import JF0.b;
import Y41.p;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.error.z;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.trx_promo_goods.screens.configure.deeplink.TrxPromoGoodsConfigureCancelLink;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.H;
import kotlinx.coroutines.T;

/* compiled from: TrxPromoGoodsConfigureCancelDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.trx_promo_goods.screens.configure.deeplink.TrxPromoGoodsConfigureCancelDeeplinkHandler$doHandle$1", f = "TrxPromoGoodsConfigureCancelDeeplinkHandler.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class e extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f303396q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f f303397r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ TrxPromoGoodsConfigureCancelLink f303398s;

    /* compiled from: TrxPromoGoodsConfigureCancelDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements Y41.l<JF0.b, G0> {
        @Override // Y41.l
        public final G0 invoke(JF0.b bVar) {
            JF0.b bVar2 = bVar;
            f fVar = (f) this.receiver;
            fVar.f303401h.g(fVar.d(), false);
            if (bVar2 instanceof b.C0519b) {
                String message = ((b.C0519b) bVar2).getMessage();
                if (message != null) {
                    fVar.f303400g.z1(message);
                }
                fVar.j(TrxPromoGoodsConfigureCancelLink.b.C9283b.f303379b);
            } else if (bVar2 instanceof b.a) {
                fVar.i(TrxPromoGoodsConfigureCancelLink.b.c.f303380b, fVar.f303402i, ((b.a) bVar2).getDeeplink());
            }
            return G0.f406611a;
        }
    }

    /* compiled from: TrxPromoGoodsConfigureCancelDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<String, G0> {
        @Override // Y41.l
        public final G0 invoke(String str) {
            f fVar = (f) this.receiver;
            fVar.f303401h.g(fVar.d(), false);
            PrintableText printableTextF = com.avito.android.printable_text.b.f(str);
            ToastBarPosition toastBarPosition = ToastBarPosition.f181046d;
            f.c.f125255c.getClass();
            a.i.C4057a.d(fVar.f303400g, printableTextF, null, null, f.c.a.b(), 0, toastBarPosition, null, null, 1966);
            fVar.j(TrxPromoGoodsConfigureCancelLink.b.a.f303378b);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, TrxPromoGoodsConfigureCancelLink trxPromoGoodsConfigureCancelLink, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f303397r = fVar;
        this.f303398s = trxPromoGoodsConfigureCancelLink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new e(this.f303397r, this.f303398s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f303396q;
        f fVar = this.f303397r;
        if (i12 == 0) {
            C42729a0.b(obj);
            fVar.f303401h.g(fVar.d(), true);
            String str = this.f303398s.f303377b;
            this.f303396q = 1;
            obj = fVar.f303399f.e(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        z.o((TypedResult) obj, new a(1, fVar, f.class, "onSuccess", "onSuccess(Lcom/avito/android/trx_promo_goods/remote/model/TrxPromoGoodsConfigureCancelResult;)V", 0), new b(1, fVar, f.class, "onError", "onError(Ljava/lang/String;)V", 0), null, 60);
        return G0.f406611a;
    }
}
