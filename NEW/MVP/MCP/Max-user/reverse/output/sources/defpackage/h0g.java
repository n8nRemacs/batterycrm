package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import org.apache.http.client.methods.HttpGet;

/* loaded from: classes2.dex */
public final class h0g extends vui {
    public final k18 c;
    public sua d;
    public ExecutorService e;

    public h0g(k18 k18Var) {
        this.c = k18Var;
    }

    @Override // defpackage.vui
    public final tu5 a(hj0 hj0Var, oac oacVar) {
        return new vua(hj0Var, oacVar);
    }

    @Override // defpackage.vui
    public final void d(tu5 tu5Var, i5i i5iVar) {
        kw6 kw6Var;
        vua vuaVar = (vua) tu5Var;
        vuaVar.d = SystemClock.elapsedRealtime();
        Uri uri = ((mk0) vuaVar.b).a.b;
        try {
            kw6Var = new kw6();
            String string = new gy0(false, true, -1, -1, false, false, false, -1, -1, false, false, false, null).toString();
            if (string.length() == 0) {
                ((i17) kw6Var.c).g("Cache-Control");
            } else {
                ((i17) kw6Var.c).h("Cache-Control", string);
            }
            kw6Var.m(uri.toString());
            ((i17) kw6Var.c).a("Accept", "image/webp,/;q=0.8");
            kw6Var.e(HttpGet.METHOD_NAME, null);
            kw6Var.l(UUID.randomUUID().toString());
        } catch (Exception e) {
            e = e;
        }
        try {
            m(vuaVar, i5iVar, kw6Var.a());
        } catch (Exception e2) {
            e = e2;
            i5iVar.o(e);
        }
    }

    @Override // defpackage.vui
    public final HashMap e(tu5 tu5Var, int i) {
        vua vuaVar = (vua) tu5Var;
        HashMap map = new HashMap(4);
        map.put("queue_time", Long.toString(vuaVar.e - vuaVar.d));
        map.put("fetch_time", Long.toString(vuaVar.f - vuaVar.e));
        map.put("total_time", Long.toString(vuaVar.f - vuaVar.d));
        map.put("image_size", Integer.toString(i));
        return map;
    }

    @Override // defpackage.vui
    public final void h(tu5 tu5Var) {
        ((vua) tu5Var).f = SystemClock.elapsedRealtime();
    }

    public final void m(vua vuaVar, i5i i5iVar, zmd zmdVar) {
        sua suaVar = this.d;
        k18 k18Var = this.c;
        if (suaVar == null) {
            this.d = (sua) k18Var.getValue();
        }
        sua suaVar2 = this.d;
        if (this.e == null) {
            this.e = ((sua) k18Var.getValue()).a.s();
        }
        mbd mbdVarB = suaVar2.b(zmdVar);
        ((mk0) vuaVar.b).a(new ia7(this, mbdVarB, false, 3));
        ka5 ka5Var = new ka5();
        ka5Var.a = vuaVar;
        ka5Var.b = i5iVar;
        ka5Var.c = zmdVar;
        mbdVarB.e(ka5Var);
    }
}
