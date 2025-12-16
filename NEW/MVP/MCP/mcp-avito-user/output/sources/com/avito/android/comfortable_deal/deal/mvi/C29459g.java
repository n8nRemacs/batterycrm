package com.avito.android.comfortable_deal.deal.mvi;

import Ep.InterfaceC13517a;
import com.avito.android.comfortable_deal.api.model.CurrentStage;
import com.avito.android.comfortable_deal.deal.mvi.entity.DealInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: DealActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.comfortable_deal.deal.mvi.DealActor$process$14", f = "DealActor.kt", i = {1, 1, 1, 2}, l = {223, 231, 232, 238}, m = "invokeSuspend", n = {"$this$flow", "stage", "backendPhoneFormat", "$this$flow"}, s = {"L$0", "L$1", "L$2", "L$0"})
/* renamed from: com.avito.android.comfortable_deal.deal.mvi.g, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29459g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DealInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public CurrentStage f121661q;

    /* renamed from: r, reason: collision with root package name */
    public String f121662r;

    /* renamed from: s, reason: collision with root package name */
    public int f121663s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f121664t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Ep.c f121665u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC13517a f121666v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C29453a f121667w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29459g(InterfaceC13517a interfaceC13517a, Ep.c cVar, C29453a c29453a, Continuation continuation) {
        super(2, continuation);
        this.f121665u = cVar;
        this.f121666v = interfaceC13517a;
        this.f121667w = c29453a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29459g c29459g = new C29459g(this.f121666v, this.f121665u, this.f121667w, continuation);
        c29459g.f121664t = obj;
        return c29459g;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super DealInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C29459g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d5 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.deal.mvi.C29459g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
