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
@DebugMetadata(c = "com.avito.android.sx_address.new_address.mvi.SxNewAddressMviActor$handle$11", f = "SxNewAddressMviActor.kt", i = {0, 0, 1, 2, 3, 4, 4, 5, 6}, l = {156, 158, 162, 166, 171, 176, 184, 185}, m = "invokeSuspend", n = {"$this$flow", "reason", "$this$flow", "$this$flow", "$this$flow", "$this$flow", "request", "$this$flow", "$this$flow"}, s = {"L$0", "L$1", "L$0", "L$0", "L$0", "L$0", "L$1", "L$0", "L$0"})
/* loaded from: classes4.dex */
final class i extends SuspendLambda implements Y41.p<InterfaceC43172j<? super B>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Object f293796q;

    /* renamed from: r, reason: collision with root package name */
    public int f293797r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f293798s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ SxNewAddressMviState f293799t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ w f293800u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(SxNewAddressMviState sxNewAddressMviState, w wVar, Continuation<? super i> continuation) {
        super(2, continuation);
        this.f293799t = sxNewAddressMviState;
        this.f293800u = wVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        i iVar = new i(this.f293799t, this.f293800u, continuation);
        iVar.f293798s = obj;
        return iVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super B> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((i) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x030f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0492 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r33) {
        /*
            Method dump skipped, instructions count: 1234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sx_address.new_address.mvi.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
