package Fc1;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.foundation.layout.InterfaceC20572g2;
import androidx.compose.ui.unit.h;
import com.avito.android.R;
import xyz.n.a.ub;

@kotlin.jvm.internal.s0
/* loaded from: classes9.dex */
public final class T4 extends kotlin.jvm.internal.N implements Y41.q<InterfaceC20572g2, androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ub f5189l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<kotlin.G0> f5190m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f5191n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<kotlin.G0> f5192o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T4(int i12, ub ubVar, Y41.a aVar, Y41.a aVar2) {
        super(3);
        this.f5189l = ubVar;
        this.f5190m = aVar;
        this.f5191n = i12;
        this.f5192o = aVar2;
    }

    @Override // Y41.q
    public final kotlin.G0 invoke(InterfaceC20572g2 interfaceC20572g2, androidx.compose.runtime.A a12, Integer num) {
        String strC;
        int i12;
        int i13;
        Y41.a<kotlin.G0> aVar;
        androidx.compose.ui.v vVarD;
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 81) == 16 && a13.c()) {
            a13.f();
        } else {
            int iOrdinal = this.f5189l.ordinal();
            int i14 = this.f5191n;
            if (iOrdinal == 0 || iOrdinal == 1) {
                a13.I(-1525542396);
                X2.a((i14 << 3) & 896, 2, this.f5190m, a13, null, u0.i.c(a13, R.string.feedback_screenshots_not_delete));
                h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                C20608p2.a(a13, C20588k2.t(androidx.compose.ui.v.f42878y1, 8));
                strC = u0.i.c(a13, R.string.feedback_screenshots_delete);
                i12 = i14 & 896;
                i13 = 2;
                aVar = this.f5192o;
                vVarD = null;
            } else if (iOrdinal != 2) {
                a13.I(-1525541754);
                a13.O();
            } else {
                a13.I(-1525541975);
                strC = u0.i.c(a13, R.string.feedback_screenshots_understand);
                vVarD = C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f);
                i12 = ((i14 << 3) & 896) | 48;
                i13 = 0;
                aVar = this.f5190m;
            }
            X2.a(i12, i13, aVar, a13, vVarD, strC);
            a13.O();
        }
        return kotlin.G0.f406611a;
    }
}
