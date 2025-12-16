package Py;

import Oy.InterfaceC14748a;
import Oy.InterfaceC14750c;
import Oy.InterfaceC14752e;
import Y61.k;
import com.avito.android.account.G;
import com.avito.android.employee_bug_reporter_impl.data.n;
import dagger.internal.h;
import dagger.internal.u;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: EmployeeBugReporterInteractorImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LPy/c;", "Ldagger/internal/h;", "LPy/a;", "a", "_avito_employee-bug-reporter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Py.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C14856c implements h<C14854a> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f13386e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final n f13387a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.employee_bug_reporter_impl.data.k f13388b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final u f13389c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Provider<G> f13390d;

    /* compiled from: EmployeeBugReporterInteractorImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPy/c$a;", "", "<init>", "()V", "_avito_employee-bug-reporter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Py.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C14856c(@k n nVar, @k com.avito.android.employee_bug_reporter_impl.data.k kVar, @k u uVar, @k Provider provider) {
        this.f13387a = nVar;
        this.f13388b = kVar;
        this.f13389c = uVar;
        this.f13390d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC14752e interfaceC14752e = (InterfaceC14752e) this.f13387a.get();
        InterfaceC14750c interfaceC14750c = (InterfaceC14750c) this.f13388b.get();
        InterfaceC14748a interfaceC14748a = (InterfaceC14748a) this.f13389c.get();
        G g12 = this.f13390d.get();
        f13386e.getClass();
        return new C14854a(interfaceC14752e, interfaceC14750c, interfaceC14748a, g12);
    }
}
