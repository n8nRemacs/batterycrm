package com.avito.android.tariff.cpx.configure.advance.deeplink;

import Y41.p;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.error.z;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.j;
import com.avito.android.remote.model.DeepLinkResponse;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.tariff.cpx.configure.advance.deeplink.TariffCpxConfigureAdvanceSaveDeepLink;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: CpxConfigureAdvanceSaveDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.tariff.cpx.configure.advance.deeplink.CpxConfigureAdvanceSaveDeeplinkHandler$doHandle$1", f = "CpxConfigureAdvanceSaveDeeplinkHandler.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class e extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f295567q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Bundle f295568r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f295569s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ TariffCpxConfigureAdvanceSaveDeepLink f295570t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Bundle bundle, f fVar, TariffCpxConfigureAdvanceSaveDeepLink tariffCpxConfigureAdvanceSaveDeepLink, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f295568r = bundle;
        this.f295569s = fVar;
        this.f295570t = tariffCpxConfigureAdvanceSaveDeepLink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new e(this.f295568r, this.f295569s, this.f295570t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f295567q;
        f fVar = this.f295569s;
        a.g gVar = fVar.f295572g;
        if (i12 == 0) {
            C42729a0.b(obj);
            Bundle bundle = this.f295568r;
            String string = bundle != null ? bundle.getString("key_cpx_configure_advance") : null;
            if (string == null) {
                fVar.j(new TariffCpxConfigureAdvanceSaveDeepLink.b.a(j.d(3, null)));
                return G0.f406611a;
            }
            gVar.g(fVar.d(), true);
            String str = this.f295570t.f295562b;
            this.f295567q = 1;
            obj = fVar.f295575j.a(str, string, this);
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
            gVar.g(fVar.d(), false);
            TypedResult.Error error = (TypedResult.Error) typedResult;
            PrintableText printableTextF = com.avito.android.printable_text.b.f(z.k(error.getError()));
            ToastBarPosition toastBarPosition = ToastBarPosition.f181046d;
            f.c.f125255c.getClass();
            a.i.C4057a.d(fVar.f295573h, printableTextF, null, null, f.c.a.b(), 0, toastBarPosition, null, null, 1966);
            fVar.j(new TariffCpxConfigureAdvanceSaveDeepLink.b.a(error.getError()));
        } else if (typedResult instanceof TypedResult.Success) {
            gVar.g(fVar.d(), false);
            fVar.f295574i.s1();
            fVar.i(TariffCpxConfigureAdvanceSaveDeepLink.b.C8991b.f295564b, fVar.f295571f, ((DeepLinkResponse) ((TypedResult.Success) typedResult).getResult()).getDeepLink());
        }
        return G0.f406611a;
    }
}
