package p31;

import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.v;
import androidx.fragment.app.ActivityC22955m;
import androidx.view.AbstractC23301M0;
import androidx.view.C23397v;
import androidx.view.C23404y0;
import androidx.view.compose.C23358x;
import androidx.view.compose.C23359y;
import g31.AbstractC40527b;
import g31.C40526a;

/* renamed from: p31.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46887d {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(ActivityC22955m activityC22955m, A a12, int i12) {
        B bE2 = a12.E(-377879755);
        v.a aVar = v.f42878y1;
        C23404y0 c23404y0B = C23358x.b(new AbstractC23301M0[0], bE2);
        bE2.I(-492369756);
        Object objT = bE2.t();
        A.f37866a.getClass();
        if (objT == A.a.f37868b) {
            objT = C22126m3.g(C40526a.f396277b);
            bE2.H(objT);
        }
        bE2.X(false);
        InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
        g31.c cVar = (g31.c) interfaceC22204y1.getF42167b();
        if (!(cVar instanceof C40526a) && (cVar instanceof AbstractC40527b)) {
            C23397v.n(c23404y0B, ((g31.c) interfaceC22204y1.getF42167b()).f396278a, null, 6);
            interfaceC22204y1.setValue(C40526a.f396277b);
        }
        C23359y.c(c23404y0B, "elk_root", aVar, new C46885b(i12, aVar, activityC22955m), bE2, ((i12 << 3) & 896) | 8);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new C46886c(i12, aVar, activityC22955m);
    }
}
