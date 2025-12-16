package com.avito.android.short_term_rent.bookingform.mvi;

import aw0.C24186b;
import com.avito.android.short_term_rent.bookingform.mvi.entity.BookingFormInternalAction;
import cw0.C39425b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.X;

/* compiled from: BookingFormActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.short_term_rent.bookingform.mvi.BookingFormActor$handlePaymentPlanChanged$1", f = "BookingFormActor.kt", i = {}, l = {474}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class l extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BookingFormInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f281968q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f281969r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C39425b f281970s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C34968a f281971t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f281972u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f281973v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(C39425b c39425b, C34968a c34968a, String str, String str2, Continuation<? super l> continuation) {
        super(2, continuation);
        this.f281970s = c39425b;
        this.f281971t = c34968a;
        this.f281972u = str;
        this.f281973v = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        l lVar = new l(this.f281970s, this.f281971t, this.f281972u, this.f281973v, continuation);
        lVar.f281969r = obj;
        return lVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super BookingFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((l) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f281968q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f281969r;
            C39425b c39425b = this.f281970s;
            C24186b c24186b = c39425b.f393066b;
            if (c24186b == null) {
                return G0.f406611a;
            }
            C34968a c34968a = this.f281971t;
            c34968a.f281766e.f(c34968a.f281762a.f281214b, this.f281972u);
            if (c39425b.f393067c instanceof C39425b.InterfaceC11001b.c) {
                X xA2 = c34968a.f281763b.a(C24186b.a(c24186b, null, null, null, null, null, null, c39425b.f393071g, this.f281973v, 511));
                this.f281968q = 1;
                if (C43175k.u(this, xA2, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
