package com.avito.android.sbc.dispatch_edit.mvi;

import Y41.p;
import com.avito.android.sbc.autodispatches.SbcDispatchEditResult;
import com.avito.android.sbc.dispatch_edit.mvi.entity.SbcDispatchEditInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SbcDispatchEditActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/sbc/dispatch_edit/mvi/entity/SbcDispatchEditInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.sbc.dispatch_edit.mvi.SbcDispatchEditActor$process$1", f = "SbcDispatchEditActor.kt", i = {0, 1, 1}, l = {39, 57, 63, 67}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "dispatchEditResult"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes3.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super SbcDispatchEditInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public SbcDispatchEditResult f260103q;

    /* renamed from: r, reason: collision with root package name */
    public int f260104r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f260105s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Wo0.d f260106t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c f260107u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Wo0.d dVar, c cVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f260106t = dVar;
        this.f260107u = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f260106t, this.f260107u, continuation);
        aVar.f260105s = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super SbcDispatchEditInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010a  */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [kotlin.collections.z0] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sbc.dispatch_edit.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
