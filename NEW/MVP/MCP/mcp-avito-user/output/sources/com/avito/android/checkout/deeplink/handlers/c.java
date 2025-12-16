package com.avito.android.checkout.deeplink.handlers;

import Y41.p;
import android.os.Bundle;
import com.avito.android.R;
import com.avito.android.checkout.deeplink.CheckoutPromoCodeV2DeepLink;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.error.z;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.ApiException;
import com.avito.android.util.C35936s;
import java.io.Serializable;
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
import to.C48697a;

/* compiled from: CheckoutPromoCodeV2DeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.checkout.deeplink.handlers.CheckoutPromoCodeV2DeeplinkHandler$doHandle$1", f = "CheckoutPromoCodeV2DeeplinkHandler.kt", i = {0}, l = {38}, m = "invokeSuspend", n = {"needShowSuccessMessage"}, s = {"I$0"})
/* loaded from: classes12.dex */
final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f118199q;

    /* renamed from: r, reason: collision with root package name */
    public int f118200r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Bundle f118201s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f118202t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ CheckoutPromoCodeV2DeepLink f118203u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Bundle bundle, d dVar, CheckoutPromoCodeV2DeepLink checkoutPromoCodeV2DeepLink, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f118201s = bundle;
        this.f118202t = dVar;
        this.f118203u = checkoutPromoCodeV2DeepLink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new c(this.f118201s, this.f118202t, this.f118203u, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        int i12;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = this.f118200r;
        d dVar = this.f118202t;
        a.g gVar = dVar.f118206h;
        if (i13 == 0) {
            C42729a0.b(obj);
            Bundle bundle = this.f118201s;
            String string = bundle != null ? bundle.getString("checkout_promo_code") : null;
            int i14 = string == null ? 1 : 0;
            gVar.g(dVar.d(), true);
            String str = this.f118203u.f118187b;
            this.f118199q = i14;
            this.f118200r = 1;
            obj = dVar.f118204f.a(str, string, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            i12 = i14;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i12 = this.f118199q;
            C42729a0.b(obj);
        }
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Success) {
            C48697a c48697a = (C48697a) ((TypedResult.Success) typedResult).getResult();
            boolean z12 = i12 != 0;
            gVar.g(dVar.d(), false);
            if (z12) {
                a.i.C4057a.d(dVar.f118205g, com.avito.android.printable_text.b.c(R.string.checkout_promocode_removed, new Serializable[0]), null, null, f.a.f125253a, 0, ToastBarPosition.f181047e, null, null, 1966);
            }
            dVar.i(CheckoutPromoCodeV2DeepLink.b.C3439b.f118189b, dVar.f118207i, c48697a.getUri());
        } else {
            if (!(typedResult instanceof TypedResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            TypedResult.Error error = (TypedResult.Error) typedResult;
            ApiException apiExceptionA = C35936s.a(error.getError(), error.getCause());
            gVar.g(dVar.d(), false);
            PrintableText printableTextF = com.avito.android.printable_text.b.f(z.l(apiExceptionA));
            f.c.f125255c.getClass();
            a.i.C4057a.d(dVar.f118205g, printableTextF, null, null, f.c.a.b(), 0, ToastBarPosition.f181046d, null, null, 1966);
            dVar.j(CheckoutPromoCodeV2DeepLink.b.a.f118188b);
        }
        return G0.f406611a;
    }
}
