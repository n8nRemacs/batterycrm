package com.avito.android.employee_bug_reporter_impl.data;

import com.avito.android.di.module.C30214v6;
import com.avito.android.util.R0;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BugReporterAnalyticsStorageImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/employee_bug_reporter_impl/data/g;", "Ldagger/internal/h;", "Lcom/avito/android/employee_bug_reporter_impl/data/d;", "a", "_avito_employee-bug-reporter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g implements dagger.internal.h<d> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f147267c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C30214v6 f147268a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<R0> f147269b;

    /* compiled from: BugReporterAnalyticsStorageImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/employee_bug_reporter_impl/data/g$a;", "", "<init>", "()V", "_avito_employee-bug-reporter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public g(@Y61.k C30214v6 c30214v6, @Y61.k Provider provider) {
        this.f147268a = c30214v6;
        this.f147269b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f147268a);
        R0 r02 = this.f147269b.get();
        f147267c.getClass();
        return new d(r02, eVarB);
    }
}
