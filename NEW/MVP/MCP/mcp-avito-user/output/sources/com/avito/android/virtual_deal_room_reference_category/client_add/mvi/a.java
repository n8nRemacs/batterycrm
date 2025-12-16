package com.avito.android.virtual_deal_room_reference_category.client_add.mvi;

import Y41.p;
import Y61.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;
import rO0.C47580d;
import rO0.InterfaceC47578b;

/* compiled from: ClientAddActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LrO0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.virtual_deal_room_reference_category.client_add.mvi.ClientAddActor$saveUser$1", f = "ClientAddActor.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 5}, l = {45, 49, 53, 57, 62, 63, 83, 86}, m = "invokeSuspend", n = {"$this$flow", "validationSuccessful", "$this$flow", "validationSuccessful", "$this$flow", "validationSuccessful", "$this$flow", "validationSuccessful", "$this$flow", "$this$flow"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$0"})
/* loaded from: classes5.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC47578b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public l0.a f327187q;

    /* renamed from: r, reason: collision with root package name */
    public Object f327188r;

    /* renamed from: s, reason: collision with root package name */
    public int f327189s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f327190t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ b f327191u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C47580d f327192v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, C47580d c47580d, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f327191u = bVar;
        this.f327192v = c47580d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f327191u, this.f327192v, continuation);
        aVar.f327190t = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC47578b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0179 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a8  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.virtual_deal_room_reference_category.client_add.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
