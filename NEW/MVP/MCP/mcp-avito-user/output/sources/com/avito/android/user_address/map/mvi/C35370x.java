package com.avito.android.user_address.map.mvi;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UserAddressMapFlowUtils.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_address.map.mvi.UserAddressMapFlowUtilsKt$proceedAddressDetailsFlow$1", f = "UserAddressMapFlowUtils.kt", i = {0, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9}, l = {35, 36, 39, 40, 41, 53, 58, 63, 68, 72, 73}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "request", "$this$flow", "request", "$this$flow", "request", "$this$flow", "request", "$this$flow", "request", "$this$flow", "request", "$this$flow", "request", "$this$flow", "request"}, s = {"L$0", "L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
/* renamed from: com.avito.android.user_address.map.mvi.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35370x extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserAddressMapMviInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public aH0.c f307930q;

    /* renamed from: r, reason: collision with root package name */
    public int f307931r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f307932s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.user_address.map.domain.d f307933t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f307934u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35370x(com.avito.android.user_address.map.domain.d dVar, int i12, Continuation<? super C35370x> continuation) {
        super(2, continuation);
        this.f307933t = dVar;
        this.f307934u = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C35370x c35370x = new C35370x(this.f307933t, this.f307934u, continuation);
        c35370x.f307932s = obj;
        return c35370x;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super UserAddressMapMviInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C35370x) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0126 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0191 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f4 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_address.map.mvi.C35370x.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
