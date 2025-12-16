package com.avito.android.short_term_rent.bookingform.promocode.mvi;

import com.avito.android.remote.d1;
import com.avito.android.remote.model.StrBookingPromoCodeApplyResponse;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.short_term_rent.bookingform.promocode.mvi.a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: ApplyPromoCodeUseCase.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/a$a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/a$a;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.short_term_rent.bookingform.promocode.mvi.ApplyPromoCodeUseCase$invoke$2", f = "ApplyPromoCodeUseCase.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class b extends SuspendLambda implements Y41.p<T, Continuation<? super a.InterfaceC8419a>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f282134q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a f282135r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f282136s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f282137t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, String str, String str2, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f282135r = aVar;
        this.f282136s = str;
        this.f282137t = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new b(this.f282135r, this.f282136s, this.f282137t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super a.InterfaceC8419a> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f282134q;
        if (i12 == 0) {
            C42729a0.b(obj);
            d1 d1Var = this.f282135r.f282128a;
            this.f282134q = 1;
            obj = d1Var.m(this.f282136s, this.f282137t, this);
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
        if (!(typedResult instanceof TypedResult.Success)) {
            if (typedResult instanceof TypedResult.Error) {
                return a.InterfaceC8419a.b.f282131a;
            }
            throw new NoWhenBranchMatchedException();
        }
        StrBookingPromoCodeApplyResponse strBookingPromoCodeApplyResponse = (StrBookingPromoCodeApplyResponse) ((TypedResult.Success) typedResult).getResult();
        if (strBookingPromoCodeApplyResponse instanceof StrBookingPromoCodeApplyResponse.Ok) {
            String message = ((StrBookingPromoCodeApplyResponse.Ok) strBookingPromoCodeApplyResponse).getMessage();
            return message != null ? new a.InterfaceC8419a.c(message) : a.InterfaceC8419a.C8420a.f282130a;
        }
        if (!(strBookingPromoCodeApplyResponse instanceof StrBookingPromoCodeApplyResponse.ValidationError)) {
            throw new NoWhenBranchMatchedException();
        }
        String message2 = ((StrBookingPromoCodeApplyResponse.ValidationError) strBookingPromoCodeApplyResponse).getMessage();
        return message2 != null ? new a.InterfaceC8419a.d(message2) : a.InterfaceC8419a.C8420a.f282130a;
    }
}
