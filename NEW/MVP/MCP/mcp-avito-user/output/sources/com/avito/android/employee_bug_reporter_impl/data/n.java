package com.avito.android.employee_bug_reporter_impl.data;

import Oy.InterfaceC14753f;
import dagger.internal.u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BugReporterPositionRepositoryImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/employee_bug_reporter_impl/data/n;", "Ldagger/internal/h;", "Lcom/avito/android/employee_bug_reporter_impl/data/l;", "a", "_avito_employee-bug-reporter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class n implements dagger.internal.h<l> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f147286b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final u f147287a;

    /* compiled from: BugReporterPositionRepositoryImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/employee_bug_reporter_impl/data/n$a;", "", "<init>", "()V", "_avito_employee-bug-reporter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public n(@Y61.k u uVar) {
        this.f147287a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC14753f interfaceC14753f = (InterfaceC14753f) this.f147287a.get();
        f147286b.getClass();
        return new l(interfaceC14753f);
    }
}
