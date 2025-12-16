package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class xm4 implements x57 {
    public final /* synthetic */ bn4 a;

    public xm4(bn4 bn4Var) {
        this.a = bn4Var;
    }

    @Override // defpackage.x57
    public final void a() {
        this.a.c.remove(this);
    }

    @Override // defpackage.x57
    public final boolean e(Uri uri, sb8 sb8Var, boolean z) {
        zm4 zm4Var;
        bn4 bn4Var = this.a;
        HashMap map = bn4Var.b;
        if (((h57) bn4Var.y0) == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            p57 p57Var = (p57) bn4Var.x0;
            int i = xxg.a;
            List list = p57Var.e;
            int i2 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                zm4 zm4Var2 = (zm4) map.get(((n57) list.get(i3)).a);
                if (zm4Var2 != null && jElapsedRealtime < zm4Var2.Z) {
                    i2++;
                }
            }
            nc5 nc5Var = new nc5(1, 0, ((p57) bn4Var.x0).e.size(), i2, 2);
            ((rha) bn4Var.t0).getClass();
            y21 y21VarP = rha.p(nc5Var, sb8Var);
            if (y21VarP != null && y21VarP.b == 2 && (zm4Var = (zm4) map.get(uri)) != null) {
                zm4.a(zm4Var, y21VarP.c);
            }
        }
        return false;
    }
}
