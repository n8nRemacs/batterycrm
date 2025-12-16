package com.avito.android.employee_bug_reporter_impl.data;

import My.C14542a;
import My.C14543b;
import Oy.InterfaceC14748a;
import Oy.InterfaceC14749b;
import com.avito.android.analytics.InterfaceC28373a;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* compiled from: BugReporterAnalyticsRepositoryImpl.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/employee_bug_reporter_impl/data/a;", "LOy/a;", "_avito_employee-bug-reporter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements InterfaceC14748a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f147259a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14749b f147260b;

    @Inject
    public a(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC14749b interfaceC14749b) {
        this.f147259a = interfaceC28373a;
        this.f147260b = interfaceC14749b;
    }

    @Override // Oy.InterfaceC14748a
    public final void a(@Y61.l String str) {
        this.f147259a.c(new C14542a(str));
    }

    @Override // Oy.InterfaceC14748a
    @Y61.l
    public final Object b(@Y61.l String str, @Y61.k Continuation<? super G0> continuation) {
        InterfaceC14749b interfaceC14749b = this.f147260b;
        if (interfaceC14749b.a()) {
            return G0.f406611a;
        }
        this.f147259a.c(new C14543b(str));
        Object objB = interfaceC14749b.b(continuation);
        return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : G0.f406611a;
    }
}
