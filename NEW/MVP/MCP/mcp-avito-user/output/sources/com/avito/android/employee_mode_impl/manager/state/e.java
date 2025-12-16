package com.avito.android.employee_mode_impl.manager.state;

import dz.C39832c;
import dz.InterfaceC39830a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Z1;

/* compiled from: EmployeeModeInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/Z1;", "Ldz/c;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/Z1;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.employee_mode_impl.manager.state.EmployeeModeInteractor$queueUpdateAndGet$2", f = "EmployeeModeInteractor.kt", i = {}, l = {193}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class e extends SuspendLambda implements Y41.p<Z1<C39832c>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f147470q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f147471r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C30339b f147472s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC39830a f147473t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(C30339b c30339b, InterfaceC39830a interfaceC39830a, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f147472s = c30339b;
        this.f147473t = interfaceC39830a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f147472s, this.f147473t, continuation);
        eVar.f147471r = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(Z1<C39832c> z12, Continuation<? super G0> continuation) {
        return ((e) create(z12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f147470q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Z1 z12 = (Z1) this.f147471r;
            x xVar = this.f147472s.f147409e;
            this.f147470q = 1;
            if (xVar.a(z12, this.f147473t, this) == coroutine_suspended) {
                return coroutine_suspended;
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
