package com.avito.android.checkout.deeplink.handlers;

import Y41.p;
import com.avito.android.checkout.data.CheckoutResponse;
import com.avito.android.checkout.deeplink.CheckoutRefreshDeepLink;
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

/* compiled from: CheckoutRefreshDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.checkout.deeplink.handlers.CheckoutRefreshDeeplinkHandler$doHandle$1", f = "CheckoutRefreshDeeplinkHandler.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class g extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f118214q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f118215r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ CheckoutRefreshDeepLink f118216s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, CheckoutRefreshDeepLink checkoutRefreshDeepLink, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f118215r = hVar;
        this.f118216s = checkoutRefreshDeepLink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new g(this.f118215r, this.f118216s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((g) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f118214q;
        h hVar = this.f118215r;
        a.g gVar = hVar.f118219h;
        if (i12 == 0) {
            C42729a0.b(obj);
            gVar.g(hVar.d(), true);
            String str = this.f118216s.f118190b;
            this.f118214q = 1;
            obj = hVar.f118217f.a(str, this);
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
            CheckoutResponse checkoutResponse = (CheckoutResponse) ((TypedResult.Success) typedResult).getResult();
            gVar.g(hVar.d(), false);
            hVar.j(new CheckoutRefreshDeepLink.b.C3440b(checkoutResponse));
        } else {
            if (!(typedResult instanceof TypedResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            TypedResult.Error error = (TypedResult.Error) typedResult;
            ApiException apiExceptionA = C35936s.a(error.getError(), error.getCause());
            gVar.g(hVar.d(), false);
            PrintableText printableTextF = com.avito.android.printable_text.b.f(z.l(apiExceptionA));
            f.c.f125255c.getClass();
            a.i.C4057a.d(hVar.f118218g, printableTextF, null, null, f.c.a.b(), 0, ToastBarPosition.f181046d, null, null, 1966);
            hVar.j(CheckoutRefreshDeepLink.b.a.f118191b);
        }
        return G0.f406611a;
    }
}
