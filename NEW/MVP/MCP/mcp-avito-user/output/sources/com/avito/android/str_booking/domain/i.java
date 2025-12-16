package com.avito.android.str_booking.domain;

import Sx0.C15258g;
import Y41.p;
import com.avito.android.remote.model.TypedResult;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StrBookingInteractor.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/TypedResult;", "LSx0/g;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_booking.domain.StrBookingInteractorImpl$loadSellerStrBooking$1", f = "StrBookingInteractor.kt", i = {}, l = {84, 87, 86}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class i extends SuspendLambda implements p<InterfaceC43172j<? super TypedResult<C15258g>>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f285613q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f285614r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f285615s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g f285616t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f285615s = str;
        this.f285616t = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        i iVar = new i(this.f285616t, this.f285615s, continuation);
        iVar.f285614r = obj;
        return iVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super TypedResult<C15258g>> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((i) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0086 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r12.f285613q
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L26
            if (r1 == r4) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            goto L22
        L12:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1a:
            java.lang.Object r1 = r12.f285614r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r13)
            goto L7b
        L22:
            kotlin.C42729a0.b(r13)
            goto L87
        L26:
            kotlin.C42729a0.b(r13)
            java.lang.Object r13 = r12.f285614r
            r1 = r13
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            java.lang.String r13 = r12.f285615s
            java.lang.Long r13 = kotlin.text.C43066x.z0(r13)
            com.avito.android.str_booking.domain.g r5 = r12.f285616t
            if (r13 != 0) goto L6a
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Couldn't parse orderId"
            r13.<init>(r2)
            com.avito.android.analytics.a r2 = r5.f285583e
            com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent r3 = new com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent
            r8 = 0
            r9 = 0
            java.lang.String r6 = "Couldn't parse orderId"
            r7 = 0
            r10 = 14
            r11 = 0
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r2.c(r3)
            com.avito.android.remote.model.TypedResult$Error r2 = new com.avito.android.remote.model.TypedResult$Error
            com.avito.android.remote.error.ApiError$UnknownError r3 = new com.avito.android.remote.error.ApiError$UnknownError
            java.lang.String r6 = "Couldn't parse orderId"
            r9 = 6
            r10 = 0
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            r2.<init>(r3, r13)
            r12.f285613q = r4
            java.lang.Object r13 = r1.emit(r2, r12)
            if (r13 != r0) goto L87
            return r0
        L6a:
            Px0.a r4 = r5.f285579a
            long r5 = r13.longValue()
            r12.f285614r = r1
            r12.f285613q = r3
            java.lang.Object r13 = r4.c(r5, r12)
            if (r13 != r0) goto L7b
            return r0
        L7b:
            r3 = 0
            r12.f285614r = r3
            r12.f285613q = r2
            java.lang.Object r13 = r1.emit(r13, r12)
            if (r13 != r0) goto L87
            return r0
        L87:
            kotlin.G0 r13 = kotlin.G0.f406611a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_booking.domain.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
