package com.avito.android.tariff.cpr.configure.deeplink;

import Y41.p;
import android.os.Bundle;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.error.z;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.tariff.cpr.configure.deeplink.TariffCprConfigureSaveLink;
import iB0.d;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: TariffCprConfigureSaveHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.tariff.cpr.configure.deeplink.TariffCprConfigureSaveHandler$doHandle$1", f = "TariffCprConfigureSaveHandler.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class i extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f295507q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Bundle f295508r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f295509s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ TariffCprConfigureSaveLink f295510t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Bundle bundle, j jVar, TariffCprConfigureSaveLink tariffCprConfigureSaveLink, Continuation<? super i> continuation) {
        super(2, continuation);
        this.f295508r = bundle;
        this.f295509s = jVar;
        this.f295510t = tariffCprConfigureSaveLink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new i(this.f295508r, this.f295509s, this.f295510t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((i) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        String string;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f295507q;
        j jVar = this.f295509s;
        a.g gVar = jVar.f295512g;
        if (i12 == 0) {
            C42729a0.b(obj);
            Bundle bundle = this.f295508r;
            if (bundle == null || (string = bundle.getString("keyCprConfigureAdvance")) == null) {
                return G0.f406611a;
            }
            gVar.g(jVar.d(), true);
            String str = this.f295510t.f295497b;
            this.f295507q = 1;
            obj = jVar.f295514i.a(str, string, this);
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
            gVar.g(jVar.d(), false);
            TypedResult.Error error = (TypedResult.Error) typedResult;
            PrintableText printableTextF = com.avito.android.printable_text.b.f(z.k(error.getError()));
            f.c.a aVar = f.c.f125255c;
            ApiError error2 = error.getError();
            Throwable cause = error.getCause();
            aVar.getClass();
            a.i.C4057a.d(jVar.f295513h, printableTextF, null, null, f.c.a.a(error2, cause), 0, ToastBarPosition.f181046d, null, null, 1966);
            jVar.j(new TariffCprConfigureSaveLink.b.a(error.getError()));
        } else if (typedResult instanceof TypedResult.Success) {
            gVar.g(jVar.d(), false);
            iB0.d dVar = (iB0.d) ((TypedResult.Success) typedResult).getResult();
            boolean z12 = dVar instanceof d.b;
            com.avito.android.deeplink_handler.handler.composite.a aVar2 = jVar.f295511f;
            if (z12) {
                d.b bVar = (d.b) dVar;
                jVar.i(new TariffCprConfigureSaveLink.b.C8988b(bVar.getSuccessFinishFlowUri()), aVar2, bVar.getDeeplink());
            } else if (dVar instanceof d.a) {
                jVar.f295515j.s1();
                jVar.i(TariffCprConfigureSaveLink.b.c.f295500b, aVar2, ((d.a) dVar).getDeeplink());
            }
        }
        return G0.f406611a;
    }
}
