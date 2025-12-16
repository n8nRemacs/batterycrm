package com.avito.android.short_term_rent.soft_booking.domain;

import com.avito.android.remote.model.StrBookingCalculateDetailsResponse;
import com.avito.android.short_term_rent.soft_booking.mvi.entity.StrSoftBookingInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import pw0.C47157a;
import pw0.C47159c;

/* compiled from: StrSoftBookingDetailsInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.short_term_rent.soft_booking.domain.StrSoftBookingDetailsInteractorImpl$invoke$1", f = "StrSoftBookingDetailsInteractor.kt", i = {0, 2, 2}, l = {97, 111, 117, 135}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "response"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes3.dex */
final class n extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrSoftBookingInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ pw0.g f282633A;

    /* renamed from: q, reason: collision with root package name */
    public StrBookingCalculateDetailsResponse f282634q;

    /* renamed from: r, reason: collision with root package name */
    public int f282635r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f282636s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C47157a f282637t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ l f282638u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ pw0.i f282639v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ pw0.h f282640w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Boolean f282641x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ C47159c f282642y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ pw0.j f282643z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(C47157a c47157a, l lVar, pw0.i iVar, pw0.h hVar, Boolean bool, C47159c c47159c, pw0.j jVar, pw0.g gVar, Continuation<? super n> continuation) {
        super(2, continuation);
        this.f282637t = c47157a;
        this.f282638u = lVar;
        this.f282639v = iVar;
        this.f282640w = hVar;
        this.f282641x = bool;
        this.f282642y = c47159c;
        this.f282643z = jVar;
        this.f282633A = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        n nVar = new n(this.f282637t, this.f282638u, this.f282639v, this.f282640w, this.f282641x, this.f282642y, this.f282643z, this.f282633A, continuation);
        nVar.f282636s = obj;
        return nVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrSoftBookingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((n) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x05c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x05e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f2  */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, java.lang.String, lj.a] */
    /* JADX WARN: Type inference failed for: r14v3, types: [android.os.Bundle, com.avito.android.remote.model.StrBookingCalculateDetailsResponse, java.lang.Object, kotlin.jvm.internal.w] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r65) {
        /*
            Method dump skipped, instructions count: 1517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.short_term_rent.soft_booking.domain.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
