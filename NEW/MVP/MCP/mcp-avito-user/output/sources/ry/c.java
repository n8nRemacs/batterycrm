package Ry;

import Y61.k;
import com.avito.android.C34161r;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: EmployeeBugReporterFeaturesModule_ProvideEmployeeBugReporterFeaturesFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LRy/c;", "Ldagger/internal/h;", "LRy/a;", "a", "_avito_employee-bug-reporter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c implements h<C15095a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f14756b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<C34161r> f14757a;

    /* compiled from: EmployeeBugReporterFeaturesModule_ProvideEmployeeBugReporterFeaturesFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRy/c$a;", "", "<init>", "()V", "_avito_employee-bug-reporter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k Provider<C34161r> provider) {
        this.f14757a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C34161r c34161r = this.f14757a.get();
        f14756b.getClass();
        b.f14755a.getClass();
        return (C15095a) c34161r.f246393a.b(C15095a.class);
    }
}
