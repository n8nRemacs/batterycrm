package Ny;

import AK0.i;
import Oy.InterfaceC14753f;
import Y61.k;
import android.app.Application;
import com.avito.android.employee_bug_reporter_impl.data.o;
import dagger.internal.h;
import dagger.internal.l;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: EmployeeBugReporterModule_ProvideBugReporterPositionStorageFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LNy/d;", "Ldagger/internal/h;", "LOy/f;", "a", "_avito_employee-bug-reporter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ny.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C14628d implements h<InterfaceC14753f> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f11881c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f11882a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<i> f11883b;

    /* compiled from: EmployeeBugReporterModule_ProvideBugReporterPositionStorageFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNy/d$a;", "", "<init>", "()V", "_avito_employee-bug-reporter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ny.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C14628d(@k l lVar, @k Provider provider) {
        this.f11882a = lVar;
        this.f11883b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f11882a.f393949a;
        i iVar = this.f11883b.get();
        f11881c.getClass();
        int i12 = C14627c.f11880a;
        return new o(iVar.a(application, "employee_bug_reporter"));
    }
}
