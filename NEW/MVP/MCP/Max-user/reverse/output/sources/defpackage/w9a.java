package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import androidx.work.WorkRequest;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class w9a extends i3 {
    public final Handler X;
    public final Rect Y;
    public taa Z;
    public final wz4 c;
    public final wz4 d;
    public final GestureDetector o;
    public final dd s0;
    public yaa t0;

    public w9a(uaa uaaVar, taa taaVar, Context context, dd ddVar) throws Resources.NotFoundException {
        super(0, uaaVar);
        this.Z = taaVar;
        this.s0 = ddVar;
        wz4 wz4Var = new wz4(context);
        this.c = wz4Var;
        wz4 wz4Var2 = new wz4(context);
        this.d = wz4Var2;
        this.o = new GestureDetector(context, new kx0(11, this));
        this.X = new Handler(Looper.getMainLooper());
        this.Y = new Rect();
        wz4Var.a = new kce(28, this);
        wz4Var2.a = new t9f(26, this);
        uaaVar.z(this.Z);
        uaaVar.p(this);
    }

    public static void L0(w9a w9aVar, boolean z, int i) {
        ibh ibhVar;
        ibh ibhVar2;
        Handler handler = w9aVar.X;
        if (w9aVar.t0 == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
        saa saaVar = new saa();
        saaVar.a = i;
        saaVar.b = z;
        saaVar.c = true;
        taa taaVar = new taa(saaVar);
        w9aVar.Z = taaVar;
        ((uaa) ((oaa) w9aVar.b)).z(taaVar);
        yaa yaaVar = w9aVar.t0;
        long j = 0;
        long j2 = (yaaVar == null || (ibhVar = yaaVar.D0) == null) ? 0L : ibhVar.f;
        long j3 = z ? j2 + WorkRequest.MIN_BACKOFF_MILLIS : j2 - WorkRequest.MIN_BACKOFF_MILLIS;
        long j4 = (yaaVar == null || (ibhVar2 = yaaVar.D0) == null) ? 0L : ibhVar2.e;
        if (j3 > j4) {
            w9aVar.N0(i, z);
            w9aVar.M0();
            j3 = j4;
        }
        if (j3 < 0) {
            w9aVar.N0(i, z);
            w9aVar.M0();
        } else {
            j = j3;
        }
        yaa yaaVar2 = w9aVar.t0;
        if (yaaVar2 != null) {
            Iterator it = ((Set) yaaVar2.a).iterator();
            while (it.hasNext()) {
                ((iaa) it.next()).c.i(j);
            }
        }
        handler.postDelayed(new fm5(w9aVar, z, i), 600L);
        handler.postDelayed(new gq5(26, w9aVar), 600L);
    }

    public final void M0() {
        taa taaVar = this.Z;
        saa saaVar = new saa();
        saaVar.a = taaVar.a;
        saaVar.b = taaVar.b;
        saaVar.c = taaVar.c;
        saaVar.a = 0;
        saaVar.c = false;
        taa taaVar2 = new taa(saaVar);
        this.Z = taaVar2;
        ((uaa) ((oaa) this.b)).z(taaVar2);
        this.c.c = 0;
        this.d.c = 0;
    }

    public final void N0(int i, boolean z) {
        HashMap map = new HashMap();
        map.put("forward", Boolean.valueOf(z));
        map.put("seconds", Integer.valueOf(i));
        this.s0.g("SEEK_BY_DOUBLE_TAP", map);
    }
}
