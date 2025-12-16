package com.avito.android.employee_mode_impl.manager.storage;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: EmployeeStorageKey.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/employee_mode_impl/manager/storage/d;", "", "a", "_avito_employee-mode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class d {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f147560g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f147561a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Object f147562b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Object f147563c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Object f147564d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Object f147565e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Object f147566f;

    /* compiled from: EmployeeStorageKey.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/avito/android/employee_mode_impl/manager/storage/d$a;", "", "<init>", "()V", "", "EMPLOYEE_MODE_HASH_ID_SUFFIX", "Ljava/lang/String;", "EMPLOYEE_MODE_ID_SUFFIX", "EMPLOYEE_MODE_INFO_TYPE_SUFFIX", "EMPLOYEE_MODE_PREFIX", "EMPLOYEE_MODE_SESSION_SUFFIX", "_avito_employee-mode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: EmployeeStorageKey.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<String> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            return d.this.a() + "_cmp_hash_id";
        }
    }

    /* compiled from: EmployeeStorageKey.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<String> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            return d.this.a() + "_cmp_ss";
        }
    }

    /* compiled from: EmployeeStorageKey.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.employee_mode_impl.manager.storage.d$d, reason: collision with other inner class name */
    public static final class C4309d extends N implements Y41.a<String> {
        public C4309d() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            return d.this.a() + "_employee_id";
        }
    }

    /* compiled from: EmployeeStorageKey.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.a<String> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            return d.this.a() + "_info_type";
        }
    }

    /* compiled from: EmployeeStorageKey.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends N implements Y41.a<String> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            return "employee_mode_for_" + d.this.f147561a;
        }
    }

    public d(@k String str) {
        this.f147561a = str;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        this.f147562b = C42727D.b(lazyThreadSafetyMode, new f());
        this.f147563c = C42727D.b(lazyThreadSafetyMode, new e());
        this.f147564d = C42727D.b(lazyThreadSafetyMode, new c());
        this.f147565e = C42727D.b(lazyThreadSafetyMode, new C4309d());
        this.f147566f = C42727D.b(lazyThreadSafetyMode, new b());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @k
    public final String a() {
        return (String) this.f147562b.getValue();
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && L.f(this.f147561a, ((d) obj).f147561a);
    }

    public final int hashCode() {
        return this.f147561a.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("EmployeeStorageKey(profileId="), this.f147561a, ')');
    }
}
