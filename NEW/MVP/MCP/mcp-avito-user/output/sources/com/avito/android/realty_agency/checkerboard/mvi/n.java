package com.avito.android.realty_agency.checkerboard.mvi;

import Zh0.C19563e;
import Zh0.InterfaceC19561c;
import di0.C39732b;
import di0.C39735e;
import java.util.Iterator;
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
@DebugMetadata(c = "com.avito.android.realty_agency.checkerboard.mvi.CheckerboardActor$processCheckerboardAction$4", f = "CheckerboardActor.kt", i = {0, 0}, l = {278, 284}, m = "invokeSuspend", n = {"$this$flow", "previousSelectedSection"}, s = {"L$0", "L$1"})
/* loaded from: classes16.dex */
final class n extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC19561c>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public C39735e f251288q;

    /* renamed from: r, reason: collision with root package name */
    public int f251289r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f251290s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C34225a f251291t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C19563e f251292u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(C19563e c19563e, C34225a c34225a, Continuation continuation) {
        super(2, continuation);
        this.f251291t = c34225a;
        this.f251292u = c19563e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        n nVar = new n(this.f251292u, this.f251291t, continuation);
        nVar.f251290s = obj;
        return nVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC19561c> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((n) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        C39735e c39735e;
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f251289r;
        C34225a c34225a = this.f251291t;
        C19563e c19563e = this.f251292u;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j2 = (InterfaceC43172j) this.f251290s;
            com.avito.android.realty_agency.checkerboard.mvi.use_case.b bVar = c34225a.f251232f;
            Long l12 = c19563e.f20462e;
            if (l12 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            C39732b c39732bA = c34225a.f251231e.a(l12.longValue());
            Long l13 = c19563e.f20463f;
            if (l13 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            long jLongValue = l13.longValue();
            bVar.getClass();
            Iterator<C39735e> it = c39732bA.f().iterator();
            int i13 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i13 = -1;
                    break;
                }
                if (it.next().getId() == jLongValue) {
                    break;
                }
                i13++;
            }
            c39735e = i13 == 0 ? c39732bA.f().get(c39732bA.f().size() - 1) : c39732bA.f().get(i13 - 1);
            InterfaceC19561c.u uVar = new InterfaceC19561c.u(c39735e.getId());
            this.f251290s = interfaceC43172j2;
            this.f251288q = c39735e;
            this.f251289r = 1;
            if (interfaceC43172j2.emit(uVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            interfaceC43172j = interfaceC43172j2;
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            c39735e = this.f251288q;
            interfaceC43172j = (InterfaceC43172j) this.f251290s;
            C42729a0.b(obj);
        }
        y yVar = c34225a.f251227a;
        Long l14 = c19563e.f20462e;
        if (l14 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        InterfaceC43160i<InterfaceC19561c> interfaceC43160iB = yVar.b(l14.longValue(), c39735e.getId(), c39735e.getName(), c19563e.f20459b);
        this.f251290s = null;
        this.f251288q = null;
        this.f251289r = 2;
        if (C43175k.u(this, interfaceC43160iB, interfaceC43172j) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
