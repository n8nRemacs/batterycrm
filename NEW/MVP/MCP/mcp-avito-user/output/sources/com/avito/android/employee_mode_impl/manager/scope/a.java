package com.avito.android.employee_mode_impl.manager.scope;

import Y61.k;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.S;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.internal.K;
import kotlinx.coroutines.scheduling.c;
import kotlinx.coroutines.t1;

/* compiled from: EmployeeModeCoroutineScope.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0017¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/employee_mode_impl/manager/scope/a;", "Lkotlinx/coroutines/T;", "<init>", "()V", "_avito_employee-mode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements T {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C43238h f147374b;

    @Inject
    public a() {
        CoroutineContext.Element elementB = t1.b();
        c cVar = C43262l0.f411945a;
        this.f147374b = U.f(new C43238h(CoroutineContext.Element.DefaultImpls.plus((V0) elementB, K.f411877a)), new S("EmployeeModeCoroutine"));
    }

    @Override // kotlinx.coroutines.T
    @k
    /* renamed from: getCoroutineContext */
    public final CoroutineContext getF46675c() {
        return this.f147374b.f411905b;
    }
}
