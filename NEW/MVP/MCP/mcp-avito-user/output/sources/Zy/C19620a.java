package Zy;

import Y61.k;
import Y61.l;
import com.avito.android.employee_mode_impl.manager.state.InterfaceC30338a;
import cz.C39437b;
import gz.InterfaceC40750a;
import javax.inject.Inject;
import jz.InterfaceC42451b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: EmployeeModeHeader.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZy/a;", "Lgz/a;", "_avito_employee-mode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Zy.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C19620a implements InterfaceC40750a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC30338a f20592a;

    @Inject
    public C19620a(@k InterfaceC30338a interfaceC30338a) {
        this.f20592a = interfaceC30338a;
    }

    @Override // hd.InterfaceC40915a
    /* renamed from: b */
    public final boolean getF253495a() {
        return true;
    }

    @Override // hd.InterfaceC40915a
    @k
    public final String getKey() {
        return "X-EmployeeMode";
    }

    @Override // hd.InterfaceC40915a
    @l
    /* renamed from: getValue */
    public final String getF253516a() {
        InterfaceC42451b f405972a = this.f20592a.a().f405963a.getF405972a();
        if (f405972a instanceof InterfaceC42451b.a) {
            return null;
        }
        if (f405972a instanceof InterfaceC42451b.C11596b) {
            return String.valueOf(C39437b.a(f405972a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
