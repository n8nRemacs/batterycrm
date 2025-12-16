package com.avito.android.employee_mode_impl.deeplink;

import Y41.p;
import Y61.l;
import com.avito.android.deep_linking.links.EmployeeModeSwitchLink;
import com.avito.android.employee_mode_impl.deeplink.a;
import com.avito.android.employee_mode_pub.manager.model.EmployeeModeSwitchSource;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import jz.C42450a;
import jz.C42453d;
import jz.InterfaceC42451b;
import jz.InterfaceC42452c;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: EmployeeModeSwitchLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Ljz/a;", RequestReviewResultKt.INFO_TYPE, "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/employee_mode_impl/deeplink/a$a;", "<anonymous>", "(Lcom/avito/android/remote/model/TypedResult;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.employee_mode_impl.deeplink.EmployeeModeSwitchLinkHandler$handleOn$2", f = "EmployeeModeSwitchLinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class f extends SuspendLambda implements p<TypedResult<C42450a>, Continuation<? super InterfaceC43160i<? extends a.InterfaceC4290a>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f147341q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a f147342r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ EmployeeModeSwitchLink f147343s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a aVar, EmployeeModeSwitchLink employeeModeSwitchLink, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f147342r = aVar;
        this.f147343s = employeeModeSwitchLink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        f fVar = new f(this.f147342r, this.f147343s, continuation);
        fVar.f147341q = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(TypedResult<C42450a> typedResult, Continuation<? super InterfaceC43160i<? extends a.InterfaceC4290a>> continuation) {
        return ((f) create(typedResult, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object c43210w;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        TypedResult typedResult = (TypedResult) this.f147341q;
        if (typedResult instanceof TypedResult.Error) {
            return new C43210w(new a.InterfaceC4290a.C4291a(((TypedResult.Error) typedResult).getError()));
        }
        if (!(typedResult instanceof TypedResult.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        C42450a c42450a = (C42450a) ((TypedResult.Success) typedResult).getResult();
        a aVar = this.f147342r;
        InterfaceC42452c interfaceC42452c = c42450a.f405963a;
        if ((interfaceC42452c instanceof InterfaceC42452c.a) && L.f(interfaceC42452c.getF405972a(), InterfaceC42451b.C11596b.f405967a)) {
            c43210w = new C43210w(a.InterfaceC4290a.c.f147332a);
        } else if (c42450a.f405963a instanceof InterfaceC42452c.a) {
            C42453d.a aVar2 = C42453d.f405975d;
            EmployeeModeSwitchSource employeeModeSwitchSourceL = a.l(this.f147343s);
            aVar2.getClass();
            c43210w = new i(aVar.f147323g.k(new C42453d(InterfaceC42451b.C11596b.f405967a, false, employeeModeSwitchSourceL, null)));
        } else {
            c43210w = new C43210w(a.InterfaceC4290a.b.f147331a);
        }
        return c43210w;
    }
}
