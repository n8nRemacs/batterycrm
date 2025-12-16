package com.avito.android.tariff.cpx.save.deeplink;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.error.z;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.tariff.deeplink.TariffCpxSaveLink;
import eC0.t;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: TariffCpxSaveHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.tariff.cpx.save.deeplink.TariffCpxSaveHandler$doHandle$1", f = "TariffCpxSaveHandler.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f297345q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f297346r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ TariffCpxSaveLink f297347s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, TariffCpxSaveLink tariffCpxSaveLink, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f297346r = dVar;
        this.f297347s = tariffCpxSaveLink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new c(this.f297346r, this.f297347s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f297345q;
        d dVar = this.f297346r;
        a.g gVar = dVar.f297349g;
        if (i12 == 0) {
            C42729a0.b(obj);
            gVar.g(dVar.d(), true);
            String str = this.f297347s.f297389b;
            this.f297345q = 1;
            obj = dVar.f297351i.a(str, this);
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
            gVar.g(dVar.d(), false);
            TypedResult.Error error = (TypedResult.Error) typedResult;
            PrintableText printableTextF = com.avito.android.printable_text.b.f(z.k(error.getError()));
            ToastBarPosition toastBarPosition = ToastBarPosition.f181046d;
            f.c.f125255c.getClass();
            a.i.C4057a.d(dVar.f297350h, printableTextF, null, null, f.c.a.b(), 0, toastBarPosition, null, null, 1966);
            dVar.j(new TariffCpxSaveLink.b.a(error.getError()));
        } else if (typedResult instanceof TypedResult.Success) {
            gVar.g(dVar.d(), false);
            t tVar = (t) ((TypedResult.Success) typedResult).getResult();
            if (tVar instanceof t.b) {
                t.b bVar = (t.b) tVar;
                dVar.i(new TariffCpxSaveLink.b.C9080b(bVar.getSuccessFinishFlowUri()), dVar.f297348f, bVar.getDeeplink());
            } else if (tVar instanceof t.a) {
                dVar.j(new TariffCpxSaveLink.b.c(((t.a) tVar).getDeeplink()));
            }
        }
        return G0.f406611a;
    }
}
