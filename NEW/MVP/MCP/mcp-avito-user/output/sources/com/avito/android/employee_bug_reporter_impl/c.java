package com.avito.android.employee_bug_reporter_impl;

import Ry.C15095a;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import androidx.view.C22981N;
import androidx.view.InterfaceC22983P;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.reflect.n;
import kotlinx.coroutines.C43259k;

/* compiled from: EmployeeBugReporterLifecycleCallbacksImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f147255l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Activity f147256m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, Activity activity) {
        super(0);
        this.f147255l = fVar;
        this.f147256m = activity;
    }

    @Override // Y41.a
    public final G0 invoke() {
        ComponentCallbacks2 componentCallbacks2 = this.f147256m;
        InterfaceC22983P interfaceC22983P = componentCallbacks2 instanceof InterfaceC22983P ? (InterfaceC22983P) componentCallbacks2 : null;
        f fVar = this.f147255l;
        C15095a c15095a = fVar.f147307e;
        c15095a.getClass();
        n<Object> nVar = C15095a.f14752d[1];
        if (((Boolean) c15095a.f14754c.a().invoke()).booleanValue() && interfaceC22983P != null) {
            C43259k.d(C22981N.a(interfaceC22983P.getLifecycle()), null, null, new d(fVar, null), 3);
        }
        return G0.f406611a;
    }
}
