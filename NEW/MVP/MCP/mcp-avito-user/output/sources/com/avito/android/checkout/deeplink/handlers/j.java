package com.avito.android.checkout.deeplink.handlers;

import Y41.p;
import com.avito.android.checkout.deeplink.CheckoutSaveV2DeepLink;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.error.z;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.ApiException;
import com.avito.android.util.C35936s;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import uo.InterfaceC49084a;

/* compiled from: CheckoutSaveV2DeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.checkout.deeplink.handlers.CheckoutSaveV2DeeplinkHandler$doHandle$1", f = "CheckoutSaveV2DeeplinkHandler.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class j extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f118225q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ k f118226r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ CheckoutSaveV2DeepLink f118227s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, CheckoutSaveV2DeepLink checkoutSaveV2DeepLink, Continuation<? super j> continuation) {
        super(2, continuation);
        this.f118226r = kVar;
        this.f118227s = checkoutSaveV2DeepLink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new j(this.f118226r, this.f118227s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((j) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f118225q;
        k kVar = this.f118226r;
        a.g gVar = kVar.f118229g;
        if (i12 == 0) {
            C42729a0.b(obj);
            gVar.g(kVar.d(), true);
            String str = this.f118227s.f118193b;
            this.f118225q = 1;
            obj = kVar.f118231i.a(str, this);
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
        if (typedResult instanceof TypedResult.Success) {
            InterfaceC49084a interfaceC49084a = (InterfaceC49084a) ((TypedResult.Success) typedResult).getResult();
            gVar.g(kVar.d(), false);
            boolean z12 = interfaceC49084a instanceof InterfaceC49084a.b;
            com.avito.android.deeplink_handler.handler.composite.a aVar = kVar.f118228f;
            if (z12) {
                InterfaceC49084a.b bVar = (InterfaceC49084a.b) interfaceC49084a;
                kVar.i(new CheckoutSaveV2DeepLink.b.C3441b(bVar.getSuccessFinishFlowUri()), aVar, bVar.getUri());
            } else if (interfaceC49084a instanceof InterfaceC49084a.C12729a) {
                kVar.i(CheckoutSaveV2DeepLink.b.c.f118196b, aVar, ((InterfaceC49084a.C12729a) interfaceC49084a).getUri());
            }
        } else {
            if (!(typedResult instanceof TypedResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            TypedResult.Error error = (TypedResult.Error) typedResult;
            ApiException apiExceptionA = C35936s.a(error.getError(), error.getCause());
            gVar.g(kVar.d(), false);
            PrintableText printableTextF = com.avito.android.printable_text.b.f(z.l(apiExceptionA));
            ToastBarPosition toastBarPosition = ToastBarPosition.f181046d;
            f.c.f125255c.getClass();
            a.i.C4057a.d(kVar.f118230h, printableTextF, null, null, f.c.a.b(), 0, toastBarPosition, null, null, 1966);
            kVar.j(new CheckoutSaveV2DeepLink.b.a(apiExceptionA));
        }
        return G0.f406611a;
    }
}
