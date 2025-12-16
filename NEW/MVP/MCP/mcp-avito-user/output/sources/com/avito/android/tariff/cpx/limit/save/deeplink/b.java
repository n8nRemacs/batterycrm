package com.avito.android.tariff.cpx.limit.save.deeplink;

import Y41.p;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.error.z;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.DeepLinkResponse;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.tariff.cpx.limit.save.deeplink.TariffCpxLimitSaveLink;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: TariffCpxLimitSaveHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.tariff.cpx.limit.save.deeplink.TariffCpxLimitSaveHandler$doHandle$1", f = "TariffCpxLimitSaveHandler.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f297207q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Bundle f297208r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f297209s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Bundle bundle, c cVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f297208r = bundle;
        this.f297209s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new b(this.f297208r, this.f297209s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f297207q;
        c cVar = this.f297209s;
        Bundle bundle = this.f297208r;
        a.g gVar = cVar.f297210f;
        if (i12 == 0) {
            C42729a0.b(obj);
            Integer numBoxInt = bundle != null ? Boxing.boxInt(bundle.getInt("key_cpx_configure_limit")) : null;
            if (numBoxInt == null) {
                cVar.j(new TariffCpxLimitSaveLink.b.a(new ApiError.Failure("Ошибка при вводе лимита")));
                return G0.f406611a;
            }
            gVar.g(cVar.d(), true);
            String string = numBoxInt.toString();
            this.f297207q = 1;
            obj = cVar.f297212h.a(string, this);
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
            a.i.C4057a.d(cVar.f297211g, printableTextF, null, null, f.c.a.b(), 0, toastBarPosition, null, null, 1966);
            cVar.j(new TariffCpxLimitSaveLink.b.a(error.getError()));
        } else if (typedResult instanceof TypedResult.Success) {
            gVar.g(cVar.d(), false);
            if (bundle.getBoolean("key_cpx_configure_limit_is_change")) {
                cVar.j(new TariffCpxLimitSaveLink.b.C9062b(((DeepLinkResponse) ((TypedResult.Success) typedResult).getResult()).getDeepLink()));
            } else {
                cVar.j(new TariffCpxLimitSaveLink.b.c(((DeepLinkResponse) ((TypedResult.Success) typedResult).getResult()).getDeepLink()));
            }
        }
        return G0.f406611a;
    }
}
