package com.avito.android.tariff.cpx.info.advance.deeplink;

import Y41.l;
import Y41.p;
import Y61.k;
import android.os.Bundle;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.error.z;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.tariff.deeplink.TariffCpxInfoAdvanceSaveLink;
import eC0.s;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.H;
import kotlinx.coroutines.T;

/* compiled from: TariffCpxInfoAdvanceSaveDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.tariff.cpx.info.advance.deeplink.TariffCpxInfoAdvanceSaveDeeplinkHandler$doHandle$1", f = "TariffCpxInfoAdvanceSaveDeeplinkHandler.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f296290q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Bundle f296291r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.tariff.cpx.info.advance.deeplink.b f296292s;

    /* compiled from: TariffCpxInfoAdvanceSaveDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.tariff.cpx.info.advance.deeplink.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C9017a extends H implements l<s, G0> {
        @Override // Y41.l
        public final G0 invoke(s sVar) {
            s sVar2 = sVar;
            com.avito.android.tariff.cpx.info.advance.deeplink.b bVar = (com.avito.android.tariff.cpx.info.advance.deeplink.b) this.receiver;
            bVar.f296294g.g(bVar.d(), false);
            boolean z12 = sVar2 instanceof s.a;
            com.avito.android.deeplink_handler.handler.composite.a aVar = bVar.f296295h;
            if (z12) {
                bVar.i(TariffCpxInfoAdvanceSaveLink.c.C9077c.f297381b, aVar, ((s.a) sVar2).getDeeplink());
            } else if (sVar2 instanceof s.b) {
                s.b bVar2 = (s.b) sVar2;
                bVar.i(new TariffCpxInfoAdvanceSaveLink.c.b(bVar2.getSuccessFinishFlowUri()), aVar, bVar2.getDeeplink());
            }
            return G0.f406611a;
        }
    }

    /* compiled from: TariffCpxInfoAdvanceSaveDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements l<String, G0> {
        @Override // Y41.l
        public final G0 invoke(String str) {
            com.avito.android.tariff.cpx.info.advance.deeplink.b bVar = (com.avito.android.tariff.cpx.info.advance.deeplink.b) this.receiver;
            bVar.f296294g.g(bVar.d(), false);
            PrintableText printableTextF = com.avito.android.printable_text.b.f(str);
            ToastBarPosition toastBarPosition = ToastBarPosition.f181046d;
            f.c.f125255c.getClass();
            a.i.C4057a.d(bVar.f296293f, printableTextF, null, null, f.c.a.b(), 0, toastBarPosition, null, null, 1966);
            bVar.j(TariffCpxInfoAdvanceSaveLink.c.a.f297379b);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Bundle bundle, com.avito.android.tariff.cpx.info.advance.deeplink.b bVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f296291r = bundle;
        this.f296292s = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
        return new a(this.f296291r, this.f296292s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f296290q;
        com.avito.android.tariff.cpx.info.advance.deeplink.b bVar = this.f296292s;
        if (i12 == 0) {
            C42729a0.b(obj);
            Bundle bundle = this.f296291r;
            String string = bundle != null ? bundle.getString("tariff_cpx_info_key_advance_value") : null;
            if (string == null) {
                bVar.j(TariffCpxInfoAdvanceSaveLink.c.a.f297379b);
                return G0.f406611a;
            }
            bVar.f296294g.g(bVar.d(), true);
            this.f296290q = 1;
            obj = bVar.f296296i.h(string, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        z.o((TypedResult) obj, new C9017a(1, bVar, com.avito.android.tariff.cpx.info.advance.deeplink.b.class, "onSuccess", "onSuccess(Lcom/avito/android/tariff/remote/model/cpx/TariffCpxInfoAdvanceSaveResult;)V", 0), new b(1, bVar, com.avito.android.tariff.cpx.info.advance.deeplink.b.class, "onError", "onError(Ljava/lang/String;)V", 0), null, 60);
        return G0.f406611a;
    }
}
