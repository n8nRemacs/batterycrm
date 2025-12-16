package com.avito.android.short_term_rent.bookingform.mvi;

import aw0.C24186b;
import com.avito.android.short_term_rent.bookingform.mvi.entity.BookingFormInternalAction;
import com.avito.android.short_term_rent.bookingform.mvi.entity.a;
import cw0.C39425b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.X;

/* compiled from: BookingFormActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.short_term_rent.bookingform.mvi.BookingFormActor$handleRefundToggleButtonClick$1", f = "BookingFormActor.kt", i = {}, l = {437, 439}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class n extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BookingFormInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f281979q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f281980r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a.q f281981s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C39425b f281982t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C34968a f281983u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(a.q qVar, C39425b c39425b, C34968a c34968a, Continuation<? super n> continuation) {
        super(2, continuation);
        this.f281981s = qVar;
        this.f281982t = c39425b;
        this.f281983u = c34968a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        n nVar = new n(this.f281981s, this.f281982t, this.f281983u, continuation);
        nVar.f281980r = obj;
        return nVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super BookingFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((n) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f281979q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f281980r;
            a.q qVar = this.f281981s;
            if (qVar.f281855b) {
                return G0.f406611a;
            }
            C39425b c39425b = this.f281982t;
            if (c39425b.f393066b == null) {
                return G0.f406611a;
            }
            boolean zF2 = L.f(qVar.f281854a, "noRefund");
            if (qVar.f281856c) {
                X xA2 = this.f281983u.f281763b.a(C24186b.a(c39425b.f393066b, null, null, null, null, null, Boxing.boxBoolean(zF2), null, null, 1791));
                this.f281979q = 1;
                if (C43175k.u(this, xA2, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                BookingFormInternalAction.RefundToggleChanged refundToggleChanged = new BookingFormInternalAction.RefundToggleChanged(zF2);
                this.f281979q = 2;
                if (interfaceC43172j.emit(refundToggleChanged, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
