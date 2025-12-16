package com.avito.android.sx_address.new_address.mvi;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SxNewAddressMviActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/sx_address/new_address/mvi/B;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.sx_address.new_address.mvi.SxNewAddressMviActor$handle$1", f = "SxNewAddressMviActor.kt", i = {0, 1, 2, 2, 4, 5, 5, 7, 8, 8, 9, 9, 9, 11, 11, 12, 12, 12}, l = {57, 62, 63, 64, 67, 68, 69, 74, 77, 78, 79, 81, 82, 83}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "response", "$this$flow", "$this$flow", "response", "$this$flow", "$this$flow", "initialAddress", "$this$flow", "initialAddress", "response", "$this$flow", "initialAddress", "$this$flow", "initialAddress", "response"}, s = {"L$0", "L$0", "L$0", "L$1", "L$0", "L$0", "L$1", "L$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1", "L$2"})
/* loaded from: classes4.dex */
final class m extends SuspendLambda implements Y41.p<InterfaceC43172j<? super B>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Object f293808q;

    /* renamed from: r, reason: collision with root package name */
    public Object f293809r;

    /* renamed from: s, reason: collision with root package name */
    public int f293810s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f293811t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ w f293812u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(w wVar, Continuation<? super m> continuation) {
        super(2, continuation);
        this.f293812u = wVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        m mVar = new m(this.f293812u, continuation);
        mVar.f293811t = obj;
        return mVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super B> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((m) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0138 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01fe A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x022b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0247 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sx_address.new_address.mvi.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
