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
@DebugMetadata(c = "com.avito.android.short_term_rent.bookingform.mvi.BookingFormActor$handlePaymentMethodChanged$1", f = "BookingFormActor.kt", i = {0, 0}, l = {450, 456}, m = "invokeSuspend", n = {"$this$flow", "formData"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class k extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BookingFormInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public C24186b f281962q;

    /* renamed from: r, reason: collision with root package name */
    public int f281963r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f281964s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C39425b f281965t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f281966u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C34968a f281967v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(C39425b c39425b, String str, C34968a c34968a, Continuation<? super k> continuation) {
        super(2, continuation);
        this.f281965t = c39425b;
        this.f281966u = str;
        this.f281967v = c34968a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        k kVar = new k(this.f281965t, this.f281966u, this.f281967v, continuation);
        kVar.f281964s = obj;
        return kVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super BookingFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((k) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        C24186b c24186b;
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f281963r;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j2 = (InterfaceC43172j) this.f281964s;
            c24186b = this.f281965t.f393066b;
            if (c24186b == null) {
                return G0.f406611a;
            }
            BookingFormInternalAction.PaymentMethodChanged paymentMethodChanged = new BookingFormInternalAction.PaymentMethodChanged(this.f281966u);
            this.f281964s = interfaceC43172j2;
            this.f281962q = c24186b;
            this.f281963r = 1;
            if (interfaceC43172j2.emit(paymentMethodChanged, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            interfaceC43172j = interfaceC43172j2;
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            c24186b = this.f281962q;
            interfaceC43172j = (InterfaceC43172j) this.f281964s;
            C42729a0.b(obj);
        }
        X xA2 = this.f281967v.f281763b.a(C24186b.a(c24186b, null, null, null, null, null, null, this.f281966u, null, 1535));
        this.f281964s = null;
        this.f281962q = null;
        this.f281963r = 2;
        if (C43175k.u(this, xA2, interfaceC43172j) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
