package one.me.geo.view;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.maps.SupportMapFragment;
import defpackage.a93;
import defpackage.aeb;
import defpackage.aw0;
import defpackage.cj0;
import defpackage.cj6;
import defpackage.g56;
import defpackage.gw0;
import defpackage.hbd;
import defpackage.iw6;
import defpackage.kf3;
import defpackage.l38;
import defpackage.lcj;
import defpackage.n8g;
import defpackage.o8g;
import defpackage.st4;
import defpackage.u8j;
import defpackage.x35;
import defpackage.y83;
import defpackage.yeb;
import defpackage.ze8;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/geo/view/OneMeSupportMapFragment;", "Lcom/google/android/gms/maps/SupportMapFragment;", "Lone/me/geo/native/NativeSupportMapFragment;", "<init>", "()V", "map_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public class OneMeSupportMapFragment extends SupportMapFragment {
    public final int j1;
    public n8g k1;
    public n8g l1;
    public iw6 m1;
    public String n1;

    public OneMeSupportMapFragment() {
        st4 st4VarO = lcj.o(st4.b);
        this.j1 = st4VarO != null ? u8j.b(st4VarO) : 1;
    }

    @Override // com.google.android.gms.maps.SupportMapFragment, androidx.fragment.app.a
    public final void M(Bundle bundle) {
        super.M(bundle);
        k0();
    }

    @Override // com.google.android.gms.maps.SupportMapFragment, androidx.fragment.app.a
    public final void Q() {
        super.Q();
        this.k1 = null;
        this.l1 = null;
        this.m1 = null;
    }

    @Override // androidx.fragment.app.a
    public final void e0(View view, Bundle bundle) {
        g56 g56Var = new g56(new y83(gw0.l((hbd) a93.s0.x(k0()).Y, new cj0(23)), 25, this), new aeb(this, null), 1);
        cj6 cj6Var = (cj6) C();
        cj6Var.b();
        gw0.w(aw0.a(g56Var, cj6Var.o, l38.d), ze8.c(this));
    }

    public final void s0(yeb yebVar) {
        String str = this.n1;
        if (str == null) {
            return;
        }
        kf3 kf3VarH = yebVar.h();
        kf3 kf3Var = kf3.b;
        int i = this.j1;
        n8g n8gVarB = null;
        if (kf3VarH == kf3Var) {
            n8g n8gVar = this.k1;
            if (n8gVar != null) {
                n8gVar.a();
            }
            this.k1 = null;
            iw6 iw6Var = this.m1;
            if (iw6Var != null) {
                o8g o8gVar = new o8g();
                o8gVar.b = true;
                o8gVar.b(new x35(str, i, false));
                o8gVar.c = Float.MAX_VALUE;
                n8gVarB = iw6Var.b(o8gVar);
            }
            this.l1 = n8gVarB;
            return;
        }
        n8g n8gVar2 = this.l1;
        if (n8gVar2 != null) {
            n8gVar2.a();
        }
        this.l1 = null;
        iw6 iw6Var2 = this.m1;
        if (iw6Var2 != null) {
            o8g o8gVar2 = new o8g();
            o8gVar2.b = true;
            o8gVar2.b(new x35(str, i, true));
            o8gVar2.c = Float.MAX_VALUE;
            n8gVarB = iw6Var2.b(o8gVar2);
        }
        this.k1 = n8gVarB;
    }
}
