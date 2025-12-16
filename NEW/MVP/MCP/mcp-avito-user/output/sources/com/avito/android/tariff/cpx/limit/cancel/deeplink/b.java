package com.avito.android.tariff.cpx.limit.cancel.deeplink;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.error.z;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.DeepLinkResponse;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.tariff.cpx.limit.cancel.deeplink.TariffCpxLimitCancelLink;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: TariffCpxLimitCancelHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.tariff.cpx.limit.cancel.deeplink.TariffCpxLimitCancelHandler$doHandle$1", f = "TariffCpxLimitCancelHandler.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f297188q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f297189r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f297189r = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new b(this.f297189r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f297188q;
        c cVar = this.f297189r;
        a.g gVar = cVar.f297190f;
        if (i12 == 0) {
            C42729a0.b(obj);
            gVar.g(cVar.d(), true);
            this.f297188q = 1;
            obj = cVar.f297192h.a(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Error) {
            gVar.g(cVar.d(), false);
            TypedResult.Error error = (TypedResult.Error) typedResult;
            PrintableText printableTextF = com.avito.android.printable_text.b.f(z.k(error.getError()));
            ToastBarPosition toastBarPosition = ToastBarPosition.f181046d;
            f.c.f125255c.getClass();
            a.i.C4057a.d(cVar.f297191g, printableTextF, null, null, f.c.a.b(), 0, toastBarPosition, null, null, 1966);
            cVar.j(new TariffCpxLimitCancelLink.b.a(error.getError()));
        } else if (typedResult instanceof TypedResult.Success) {
            gVar.g(cVar.d(), false);
            cVar.j(new TariffCpxLimitCancelLink.b.C9061b(((DeepLinkResponse) ((TypedResult.Success) typedResult).getResult()).getDeepLink()));
        }
        return G0.f406611a;
    }
}
