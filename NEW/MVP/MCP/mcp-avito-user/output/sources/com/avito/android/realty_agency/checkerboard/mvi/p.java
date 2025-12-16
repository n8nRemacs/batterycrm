package com.avito.android.realty_agency.checkerboard.mvi;

import Zh0.C19563e;
import Zh0.InterfaceC19559a;
import Zh0.InterfaceC19561c;
import Zh0.f;
import com.avito.android.realty_agency.checkerboard.bottom_sheet.I;
import java.util.Iterator;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CheckerboardActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LZh0/c;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.realty_agency.checkerboard.mvi.CheckerboardActor$processLotItemAction$1", f = "CheckerboardActor.kt", i = {}, l = {362}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class p extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC19561c>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f251298q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f251299r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C19563e f251300s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C34225a f251301t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC19559a.b.InterfaceC1448a f251302u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(C19563e c19563e, C34225a c34225a, InterfaceC19559a.b.InterfaceC1448a interfaceC1448a, Continuation<? super p> continuation) {
        super(2, continuation);
        this.f251300s = c19563e;
        this.f251301t = c34225a;
        this.f251302u = interfaceC1448a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        p pVar = new p(this.f251300s, this.f251301t, this.f251302u, continuation);
        pVar.f251299r = obj;
        return pVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC19561c> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((p) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f251298q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f251299r;
            Zh0.f fVar = this.f251300s.f20464g;
            Object obj2 = null;
            f.b bVar = fVar instanceof f.b ? (f.b) fVar : null;
            if (bVar != null) {
                Iterator it = bVar.f20476a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((Yh0.d) next).f19614a == this.f251302u.getF20399b()) {
                        obj2 = next;
                        break;
                    }
                }
                Yh0.d dVar = (Yh0.d) obj2;
                if (dVar != null) {
                    this.f251301t.f251230d.getClass();
                    InterfaceC19561c.n nVar = new InterfaceC19561c.n(new I(Long.valueOf(dVar.f19614a), dVar.f19615b, false, dVar.f19617d, dVar.f19618e, dVar.f19620g, dVar.f19619f, true));
                    this.f251298q = 1;
                    if (interfaceC43172j.emit(nVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return G0.f406611a;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C42729a0.b(obj);
        return G0.f406611a;
    }
}
