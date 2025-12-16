package com.avito.android.employee_mode_impl.manager.state;

import dz.C39832c;
import dz.InterfaceC39830a;
import dz.InterfaceC39831b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.Z1;

/* compiled from: EmployeeModeStateUpdater.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Ldz/c;", "<anonymous>", "(Lkotlinx/coroutines/T;)Ldz/c;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.employee_mode_impl.manager.state.EmployeeModeStateUpdaterImpl$updateAndGet$2", f = "EmployeeModeStateUpdater.kt", i = {}, l = {52, 53, 58, 60}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class A extends SuspendLambda implements Y41.p<T, Continuation<? super C39832c>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f147376q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Z1<C39832c> f147377r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC39830a f147378s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ y f147379t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(Z1<C39832c> z12, InterfaceC39830a interfaceC39830a, y yVar, Continuation<? super A> continuation) {
        super(2, continuation);
        this.f147377r = z12;
        this.f147378s = interfaceC39830a;
        this.f147379t = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new A(this.f147377r, this.f147378s, this.f147379t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super C39832c> continuation) {
        return ((A) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        C39832c value;
        C39832c c39832cA;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f147376q;
        if (i12 != 0) {
            if (i12 == 1) {
                C42729a0.b(obj);
                return (C39832c) obj;
            }
            if (i12 == 2) {
                C42729a0.b(obj);
                return (C39832c) obj;
            }
            if (i12 == 3) {
                C42729a0.b(obj);
                return (C39832c) obj;
            }
            if (i12 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return (C39832c) obj;
        }
        C42729a0.b(obj);
        InterfaceC39830a interfaceC39830a = this.f147378s;
        boolean z12 = interfaceC39830a instanceof InterfaceC39830a.e;
        Z1<C39832c> z13 = this.f147377r;
        y yVar = this.f147379t;
        if (z12) {
            this.f147376q = 1;
            obj = y.b(yVar, z13, (InterfaceC39830a.e) interfaceC39830a, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (C39832c) obj;
        }
        if (interfaceC39830a instanceof InterfaceC39830a.C11046a) {
            this.f147376q = 2;
            int i13 = y.f147539i;
            obj = yVar.e(z13, false, false, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (C39832c) obj;
        }
        if (interfaceC39830a instanceof InterfaceC39830a.c) {
            this.f147376q = 3;
            obj = y.c(yVar, z13, (InterfaceC39830a.c) interfaceC39830a, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (C39832c) obj;
        }
        if (!(interfaceC39830a instanceof InterfaceC39830a.b)) {
            if (!(interfaceC39830a instanceof InterfaceC39830a.d)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f147376q = 4;
            int i14 = y.f147539i;
            obj = yVar.e(z13, false, true, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (C39832c) obj;
        }
        InterfaceC39830a.b bVar = (InterfaceC39830a.b) interfaceC39830a;
        int i15 = y.f147539i;
        yVar.getClass();
        InterfaceC39831b.d dVar = new InterfaceC39831b.d(bVar.f394186a, bVar.f394187b);
        do {
            value = z13.getValue();
            c39832cA = yVar.f147544e.a(dVar, value);
        } while (!z13.N3(value, c39832cA));
        return c39832cA;
    }
}
