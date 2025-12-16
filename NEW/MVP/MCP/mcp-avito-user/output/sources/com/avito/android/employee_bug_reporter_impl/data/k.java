package com.avito.android.employee_bug_reporter_impl.data;

import Qy.InterfaceC14949a;
import Ry.C15095a;
import com.avito.android.account.E;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BugReporterDeepLinkRepositoryImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/employee_bug_reporter_impl/data/k;", "Ldagger/internal/h;", "Lcom/avito/android/employee_bug_reporter_impl/data/i;", "a", "_avito_employee-bug-reporter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class k implements dagger.internal.h<i> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f147279e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<E> f147280a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC14949a> f147281b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<T81.a> f147282c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Ry.c f147283d;

    /* compiled from: BugReporterDeepLinkRepositoryImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/employee_bug_reporter_impl/data/k$a;", "", "<init>", "()V", "_avito_employee-bug-reporter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public k(@Y61.k Provider provider, @Y61.k Provider provider2, @Y61.k Provider provider3, @Y61.k Ry.c cVar) {
        this.f147280a = provider;
        this.f147281b = provider2;
        this.f147282c = provider3;
        this.f147283d = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        E e12 = this.f147280a.get();
        h31.e eVarB = dagger.internal.g.b(this.f147281b);
        h31.e eVarB2 = dagger.internal.g.b(this.f147282c);
        C15095a c15095a = (C15095a) this.f147283d.get();
        f147279e.getClass();
        return new i(e12, eVarB, eVarB2, c15095a);
    }
}
