package az;

import A3.a;
import Y61.k;
import Y61.l;
import com.avito.android.employee_mode_impl.manager.state.C30339b;
import com.avito.android.employee_mode_impl.manager.state.n;
import com.avito.android.remote.model.TypedResult;
import iz.C42140a;
import javax.inject.Inject;
import jz.C42450a;
import jz.C42453d;
import jz.C42454e;
import jz.InterfaceC42451b;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.Z1;

/* compiled from: EmployeeModeAccountManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Laz/b;", "Laz/a;", "_avito_employee-mode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: az.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C24197b implements InterfaceC24196a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C30339b f56806a;

    @Inject
    public C24197b(@k C30339b c30339b) {
        this.f56806a = c30339b;
    }

    @Override // hz.InterfaceC41196a
    @k
    public final InterfaceC42451b a() {
        return this.f56806a.f147406b.a().f405963a.getF405972a();
    }

    @Override // hz.InterfaceC41196a
    @k
    public final InterfaceC43160i<InterfaceC42451b> f() {
        return this.f56806a.c();
    }

    @Override // hz.InterfaceC41196a
    @k
    public final InterfaceC43160i<InterfaceC42451b> g(@k C42140a c42140a) {
        return this.f56806a.b(c42140a);
    }

    @Override // hz.InterfaceC41196a
    @k
    public final InterfaceC43160i<C42450a> h() {
        C30339b c30339b = this.f56806a;
        return C43175k.I(c30339b.f147407c.c(), C43175k.r(new n((Z1) c30339b.f147406b.f147506b.getValue())));
    }

    @Override // hz.InterfaceC41196a
    @k
    public final InterfaceC43160i<TypedResult<C42450a>> j() {
        return this.f56806a.e();
    }

    @Override // hz.InterfaceC41196a
    @k
    public final InterfaceC43160i<InterfaceC42451b> k(@k C42453d c42453d) {
        return this.f56806a.i(c42453d);
    }

    @Override // A3.b
    public final void m(@l Boolean bool, @k String str) {
        this.f56806a.f(bool, str);
    }

    @Override // hz.InterfaceC41196a
    @k
    public final InterfaceC43160i<C42454e> n() {
        return this.f56806a.d();
    }

    @Override // hz.InterfaceC41196a
    @k
    public final InterfaceC43160i<Boolean> o() {
        return this.f56806a.h();
    }

    @Override // A3.b
    public final void d(@k a.InterfaceC0003a.C0004a c0004a) {
    }

    @Override // A3.b
    public final void e(@k a.InterfaceC0003a.c cVar) {
    }

    @Override // A3.b
    public final void i(@k a.b bVar) {
    }

    @Override // A3.b
    public final void l(@k a.InterfaceC0003a.b bVar) {
    }

    @Override // A3.b
    public final void p(@k a.InterfaceC0003a.d dVar) {
    }
}
