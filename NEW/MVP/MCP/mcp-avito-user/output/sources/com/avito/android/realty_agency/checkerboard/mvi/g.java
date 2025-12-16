package com.avito.android.realty_agency.checkerboard.mvi;

import Zh0.C19563e;
import Zh0.InterfaceC19559a;
import Zh0.InterfaceC19561c;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CheckerboardActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LZh0/c;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.realty_agency.checkerboard.mvi.CheckerboardActor$process$6", f = "CheckerboardActor.kt", i = {0}, l = {165, 171}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes16.dex */
final class g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC19561c>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f251260q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f251261r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC19559a f251262s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C34225a f251263t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C19563e f251264u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(InterfaceC19559a interfaceC19559a, C19563e c19563e, C34225a c34225a, Continuation continuation) {
        super(2, continuation);
        this.f251262s = interfaceC19559a;
        this.f251263t = c34225a;
        this.f251264u = c19563e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C34225a c34225a = this.f251263t;
        g gVar = new g(this.f251262s, this.f251264u, c34225a, continuation);
        gVar.f251261r = obj;
        return gVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC19561c> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f251260q;
        InterfaceC19559a interfaceC19559a = this.f251262s;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f251261r;
            InterfaceC19561c.u uVar = new InterfaceC19561c.u(((InterfaceC19559a.k.b) interfaceC19559a).f20415a);
            this.f251261r = interfaceC43172j;
            this.f251260q = 1;
            if (interfaceC43172j.emit(uVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f251261r;
            C42729a0.b(obj);
        }
        C34225a c34225a = this.f251263t;
        y yVar = c34225a.f251227a;
        C19563e c19563e = this.f251264u;
        Long l12 = c19563e.f20462e;
        if (l12 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        long jLongValue = l12.longValue();
        long j12 = ((InterfaceC19559a.k.b) interfaceC19559a).f20415a;
        InterfaceC43160i<InterfaceC19561c> interfaceC43160iB = yVar.b(jLongValue, j12, c34225a.f251231e.b(j12).getName(), c19563e.f20459b);
        this.f251261r = null;
        this.f251260q = 2;
        if (C43175k.u(this, interfaceC43160iB, interfaceC43172j) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
