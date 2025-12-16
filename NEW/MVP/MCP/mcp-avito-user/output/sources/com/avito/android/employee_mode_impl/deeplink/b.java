package com.avito.android.employee_mode_impl.deeplink;

import Y41.p;
import Y61.l;
import com.avito.android.deep_linking.links.EmployeeModeSwitchLink;
import com.avito.android.employee_mode_pub.manager.model.EmployeeModeSwitchSource;
import com.avito.android.util.R0;
import hz.InterfaceC41196a;
import jz.C42453d;
import jz.InterfaceC42451b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;

/* compiled from: EmployeeModeSwitchLinkHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.employee_mode_impl.deeplink.EmployeeModeSwitchLinkHandler$doHandle$1$1", f = "EmployeeModeSwitchLinkHandler.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f147333q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a f147334r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ EmployeeModeSwitchLink f147335s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, EmployeeModeSwitchLink employeeModeSwitchLink, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f147334r = aVar;
        this.f147335s = employeeModeSwitchLink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        return new b(this.f147334r, this.f147335s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) throws Throwable {
        Object objCollect;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f147333q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = this.f147334r;
            EmployeeModeSwitchLink employeeModeSwitchLink = this.f147335s;
            this.f147333q = 1;
            if (employeeModeSwitchLink.f133301d) {
                aVar.k(employeeModeSwitchLink);
                objCollect = G0.f406611a;
            } else {
                InterfaceC42451b interfaceC42451b = L.f(Boxing.boxBoolean(employeeModeSwitchLink.f133299b), Boolean.TRUE) ? InterfaceC42451b.C11596b.f405967a : InterfaceC42451b.a.f405966a;
                boolean z12 = interfaceC42451b instanceof InterfaceC42451b.a;
                R0 r02 = aVar.f147325i;
                InterfaceC41196a interfaceC41196a = aVar.f147323g;
                if (z12) {
                    C42453d.a aVar2 = C42453d.f405975d;
                    EmployeeModeSwitchSource employeeModeSwitchSourceL = a.l(employeeModeSwitchLink);
                    aVar2.getClass();
                    objCollect = new C43137a0(new d(aVar, null), C43175k.I(r02.a(), interfaceC41196a.k(new C42453d(InterfaceC42451b.a.f405966a, false, employeeModeSwitchSourceL, null)))).collect(new e(aVar, employeeModeSwitchLink), this);
                    if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objCollect = G0.f406611a;
                    }
                    if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objCollect = G0.f406611a;
                    }
                } else if (interfaceC42451b instanceof InterfaceC42451b.C11596b) {
                    objCollect = new C43137a0(new g(aVar, null), C43175k.I(r02.a(), C43175k.C(new f(aVar, employeeModeSwitchLink, null), interfaceC41196a.j()))).collect(new h(aVar, employeeModeSwitchLink), this);
                    if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objCollect = G0.f406611a;
                    }
                    if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objCollect = G0.f406611a;
                    }
                } else {
                    aVar.k(employeeModeSwitchLink);
                    objCollect = G0.f406611a;
                }
                if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCollect = G0.f406611a;
                }
            }
            if (objCollect == coroutine_suspended) {
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
