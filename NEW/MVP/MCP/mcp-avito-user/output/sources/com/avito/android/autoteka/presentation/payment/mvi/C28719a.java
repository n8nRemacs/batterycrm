package com.avito.android.autoteka.presentation.payment.mvi;

import com.avito.android.autoteka.presentation.payment.mvi.entity.AutotekaPaymentInternalAction;
import com.avito.android.autoteka.presentation.payment.mvi.entity.AutotekaPaymentState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AutotekaPaymentActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.autoteka.presentation.payment.mvi.AutotekaPaymentActor$process$1", f = "AutotekaPaymentActor.kt", i = {0}, l = {33, 47, 46}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* renamed from: com.avito.android.autoteka.presentation.payment.mvi.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28719a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super AutotekaPaymentInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f97414q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f97415r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AutotekaPaymentState f97416s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i f97417t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28719a(AutotekaPaymentState autotekaPaymentState, i iVar, Continuation<? super C28719a> continuation) {
        super(2, continuation);
        this.f97416s = autotekaPaymentState;
        this.f97417t = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C28719a c28719a = new C28719a(this.f97416s, this.f97417t, continuation);
        c28719a.f97415r = obj;
        return c28719a;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super AutotekaPaymentInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C28719a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c8 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.autoteka.presentation.payment.mvi.C28719a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
