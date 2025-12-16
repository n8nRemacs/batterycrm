package com.avito.android.employee_bug_reporter_impl.task;

import Ry.C15095a;
import Y61.k;
import com.avito.android.service.short_task.j;
import dagger.internal.f;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LoadEmployeeBugReporterDeeplinkScheduler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/employee_bug_reporter_impl/task/a;", "Ldagger/internal/h;", "Lcom/avito/android/employee_bug_reporter_impl/task/LoadEmployeeBugReporterDeeplinkScheduler;", "a", "_avito_employee-bug-reporter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements h<LoadEmployeeBugReporterDeeplinkScheduler> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final C4289a f147310c = new C4289a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f147311a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Ry.c f147312b;

    /* compiled from: LoadEmployeeBugReporterDeeplinkScheduler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/employee_bug_reporter_impl/task/a$a;", "", "<init>", "()V", "_avito_employee-bug-reporter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.employee_bug_reporter_impl.task.a$a, reason: collision with other inner class name */
    public static final class C4289a {
        public /* synthetic */ C4289a(C42822w c42822w) {
            this();
        }

        public C4289a() {
        }
    }

    public a(@k f fVar, @k Ry.c cVar) {
        this.f147311a = fVar;
        this.f147312b = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        j jVar = (j) this.f147311a.get();
        C15095a c15095a = (C15095a) this.f147312b.get();
        f147310c.getClass();
        return new LoadEmployeeBugReporterDeeplinkScheduler(jVar, c15095a);
    }
}
