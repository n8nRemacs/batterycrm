package Qy;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BugReporterApi_Module_ProvideBugReporterApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LQy/c;", "Ldagger/internal/h;", "LQy/a;", "a", "_avito_employee-bug-reporter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c implements h<InterfaceC14949a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f14040b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f14041a;

    /* compiled from: BugReporterApi_Module_ProvideBugReporterApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQy/c$a;", "", "<init>", "()V", "_avito_employee-bug-reporter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k f fVar) {
        this.f14041a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f14041a.get();
        f14040b.getClass();
        b.f14039a.getClass();
        InterfaceC14949a interfaceC14949a = (InterfaceC14949a) r02.create(InterfaceC14949a.class);
        t.b(interfaceC14949a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC14949a;
    }
}
