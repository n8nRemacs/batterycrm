package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class ym4 implements y57 {
    public final /* synthetic */ bn4 a;

    public ym4(bn4 bn4Var) {
        this.a = bn4Var;
    }

    @Override // defpackage.y57
    public final void a() {
        this.a.c.remove(this);
    }

    @Override // defpackage.y57
    public final boolean b(Uri uri, sb8 sb8Var, boolean z) {
        an4 an4Var;
        bn4 bn4Var = this.a;
        HashMap map = bn4Var.b;
        if (((i57) bn4Var.y0) == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            q57 q57Var = (q57) bn4Var.x0;
            String str = zxg.a;
            List list = q57Var.e;
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                an4 an4Var2 = (an4) map.get(((o57) list.get(i2)).a);
                if (an4Var2 != null && jElapsedRealtime < an4Var2.Z) {
                    i++;
                }
            }
            y21 y21VarP = ((tha) bn4Var.t0).p(new nc5(1, 0, ((q57) bn4Var.x0).e.size(), i, 3), sb8Var);
            if (y21VarP != null && y21VarP.b == 2 && (an4Var = (an4) map.get(uri)) != null) {
                an4.a(an4Var, y21VarP.c);
            }
        }
        return false;
    }
}
