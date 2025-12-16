package androidx.compose.material3;

import Q.a;
import X.C16210h1;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.foundation.layout.InterfaceC20572g2;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.graphics.vector.C22293d;
import androidx.compose.ui.graphics.vector.C22295f;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: DatePicker.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/g2;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/g2;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.w5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21944w5 extends kotlin.jvm.internal.N implements Y41.q<InterfaceC20572g2, androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C22096n f37678l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f37679m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21944w5(C22096n c22096n, boolean z12) {
        super(3);
        this.f37678l = c22096n;
        this.f37679m = z12;
    }

    @Override // Y41.q
    public final kotlin.G0 invoke(InterfaceC20572g2 interfaceC20572g2, androidx.compose.runtime.A a12, Integer num) {
        String strA;
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 17) == 16 && a13.c()) {
            a13.f();
        } else {
            this.f37678l.invoke(a13, 0);
            v.a aVar = androidx.compose.ui.v.f42878y1;
            X1.f35798a.getClass();
            C20608p2.a(a13, C20588k2.o(aVar, X1.f35803f));
            int i12 = a.b.f13394a;
            C22293d c22293dD = C16210h1.f18099a;
            if (c22293dD == null) {
                h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                C22293d.a aVar3 = new C22293d.a("Filled.ArrowDropDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96, null);
                C42784z0 c42784z0 = androidx.compose.ui.graphics.vector.U.f39811a;
                androidx.compose.ui.graphics.T.f39320b.getClass();
                androidx.compose.ui.graphics.k1 k1Var = new androidx.compose.ui.graphics.k1(androidx.compose.ui.graphics.T.f39321c, null);
                androidx.compose.ui.graphics.m1.f39698b.getClass();
                androidx.compose.ui.graphics.n1.f39707b.getClass();
                int i13 = androidx.compose.ui.graphics.n1.f39709d;
                C22295f c22295f = new C22295f();
                c22295f.j(7.0f, 10.0f);
                c22295f.i(5.0f, 5.0f);
                c22295f.i(5.0f, -5.0f);
                c22295f.c();
                C22293d.a.c(aVar3, c22295f.f39885a, 0, k1Var, 1.0f, null, 1.0f, 1.0f, 0, i13, 1.0f, 14336);
                c22293dD = aVar3.d();
                C16210h1.f18099a = c22293dD;
            }
            boolean z12 = this.f37679m;
            if (z12) {
                a13.I(1071201785);
                int i14 = Ng.f35206b;
                strA = Og.a(a13, R.string.m3c_date_picker_switch_to_day_selection);
                a13.O();
            } else {
                a13.I(1071201872);
                int i15 = Ng.f35206b;
                strA = Og.a(a13, R.string.m3c_date_picker_switch_to_year_selection);
                a13.O();
            }
            C21991y8.b(c22293dD, strA, androidx.compose.ui.draw.u.a(aVar, z12 ? 180.0f : 0.0f), 0L, a13, 0, 8);
        }
        return kotlin.G0.f406611a;
    }
}
