package com.avito.android.employee_stub_impl.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.employee_stub_impl.di.b;
import com.avito.android.employee_stub_impl.view.EmployeeStubFragment;
import cv.InterfaceC39417a;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerEmployeeStubComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerEmployeeStubComponent.java */
    public static final class b implements com.avito.android.employee_stub_impl.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f147587a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC28481c> f147588b;

        /* renamed from: c, reason: collision with root package name */
        public final u<C28478k> f147589c;

        /* renamed from: d, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f147590d;

        /* compiled from: DaggerEmployeeStubComponent.java */
        /* renamed from: com.avito.android.employee_stub_impl.di.a$b$a, reason: collision with other inner class name */
        public static final class C4314a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.employee_stub_impl.di.c f147591a;

            public C4314a(com.avito.android.employee_stub_impl.di.c cVar) {
                this.f147591a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f147591a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(cv.b bVar, com.avito.android.employee_stub_impl.di.c cVar, r rVar, C4313a c4313a) {
            this.f147587a = bVar;
            this.f147588b = new C4314a(cVar);
            u<C28478k> uVarD = g.d(new e(l.a(rVar)));
            this.f147589c = uVarD;
            this.f147590d = g.d(new f(uVarD, this.f147588b));
        }

        @Override // com.avito.android.employee_stub_impl.di.b
        public final void a(EmployeeStubFragment employeeStubFragment) {
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f147587a.u4();
            t.c(aVarU4);
            employeeStubFragment.f147601n0 = aVarU4;
            employeeStubFragment.f147602o0 = this.f147590d.get();
        }
    }

    /* compiled from: DaggerEmployeeStubComponent.java */
    public static final class c implements b.a {
        public c() {
        }

        @Override // com.avito.android.employee_stub_impl.di.b.a
        public final com.avito.android.employee_stub_impl.di.b a(r rVar, InterfaceC39417a interfaceC39417a, com.avito.android.employee_stub_impl.di.c cVar) {
            interfaceC39417a.getClass();
            return new b(interfaceC39417a, cVar, rVar, null);
        }
    }

    public static b.a a() {
        return new c();
    }
}
