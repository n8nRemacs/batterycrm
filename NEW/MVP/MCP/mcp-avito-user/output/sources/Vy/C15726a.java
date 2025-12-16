package Vy;

import Y61.k;
import com.avito.android.employee_mode_impl.manager.state.InterfaceC30338a;
import fz.InterfaceC40498a;
import javax.inject.Inject;
import jz.InterfaceC42451b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;

/* compiled from: EmployeeEnvironmentProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVy/a;", "Lfz/a;", "_avito_employee-mode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Vy.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C15726a implements InterfaceC40498a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC30338a f17530a;

    @Inject
    public C15726a(@k InterfaceC30338a interfaceC30338a) {
        this.f17530a = interfaceC30338a;
    }

    @Override // fz.InterfaceC40498a
    @k
    public final String a() {
        InterfaceC42451b f405972a = this.f17530a.a().f405963a.getF405972a();
        if (L.f(f405972a, InterfaceC42451b.a.f405966a)) {
            return "0";
        }
        if (L.f(f405972a, InterfaceC42451b.C11596b.f405967a)) {
            return "1";
        }
        throw new NoWhenBranchMatchedException();
    }
}
