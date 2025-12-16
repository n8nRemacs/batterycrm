package com.avito.android.employee_bug_reporter_impl.task;

import Oy.InterfaceC14754g;
import Y61.k;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.u;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LoadEmployeeBugReporterDeeplinkShortTask_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/employee_bug_reporter_impl/task/c;", "Ldagger/internal/h;", "Lcom/avito/android/employee_bug_reporter_impl/task/b;", "a", "_avito_employee-bug-reporter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c implements h<b> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f147319c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<R0> f147320a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final u f147321b;

    /* compiled from: LoadEmployeeBugReporterDeeplinkShortTask_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/employee_bug_reporter_impl/task/c$a;", "", "<init>", "()V", "_avito_employee-bug-reporter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k u uVar, @k Provider provider) {
        this.f147320a = provider;
        this.f147321b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = this.f147320a.get();
        InterfaceC14754g interfaceC14754g = (InterfaceC14754g) this.f147321b.get();
        f147319c.getClass();
        return new b(r02, interfaceC14754g);
    }
}
