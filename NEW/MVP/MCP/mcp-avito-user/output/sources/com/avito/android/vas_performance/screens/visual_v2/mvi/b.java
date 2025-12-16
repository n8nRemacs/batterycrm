package com.avito.android.vas_performance.screens.visual_v2.mvi;

import RL0.a;
import RL0.c;
import com.avito.android.vas_performance.screens.visual_v2.mvi.entity.VisualVasV2InternalAction;
import java.util.Iterator;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: VisualVasV2Actor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/vas_performance/screens/visual_v2/mvi/entity/VisualVasV2InternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.vas_performance.screens.visual_v2.mvi.VisualVasV2Actor$process$2", f = "VisualVasV2Actor.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super VisualVasV2InternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f321248q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f321249r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ RL0.c f321250s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ RL0.a f321251t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d f321252u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(RL0.c cVar, RL0.a aVar, d dVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f321250s = cVar;
        this.f321251t = aVar;
        this.f321252u = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f321250s, this.f321251t, this.f321252u, continuation);
        bVar.f321249r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super VisualVasV2InternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        c.a.C0957a.C0958a c0958a;
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f321248q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f321249r;
            RL0.c cVar = this.f321250s;
            c.a aVar = cVar.f14358f;
            c.a.C0957a c0957a = null;
            if (aVar != null && (obj2 = aVar.f14365c) != null) {
                Iterator it = ((Iterable) obj2).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (L.f(((c.a.C0957a) next).f14367a, ((a.C0955a) this.f321251t).f14343a)) {
                        c0957a = next;
                        break;
                    }
                }
                c0957a = c0957a;
            }
            if (c0957a != null && (c0958a = c0957a.f14371e) != null) {
                d dVar = this.f321252u;
                InterfaceC43160i<VisualVasV2InternalAction> interfaceC43160iA = dVar.f321260e.a(dVar.f321256a, cVar.f14361i, !c0958a.f14374c, c0958a.f14375d, c0957a.f14367a);
                this.f321248q = 1;
                if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
