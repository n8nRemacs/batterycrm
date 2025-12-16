package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;

/* loaded from: classes2.dex */
public final class gr1 {
    public final i21 a;
    public final bwf b = new bwf(new m2(16, this));
    public final zkb c;
    public final jbe d;
    public final a3b e;
    public final xt4 f;
    public final fde g;
    public final zva h;
    public final cr1 i;
    public final v6d j;
    public final n81 k;
    public final ss3 l;
    public final z21 m;
    public final r7 n;

    public gr1(Context context, i21 i21Var, y8g y8gVar, ConnectivityManager connectivityManager, TelephonyManager telephonyManager, y6d y6dVar, vgd vgdVar, p64 p64Var, si1 si1Var) {
        this.a = i21Var;
        zkb zkbVar = new zkb(10, vgdVar);
        this.c = zkbVar;
        jbe jbeVar = new jbe(16);
        this.d = jbeVar;
        a3b a3bVar = new a3b(12, p64Var);
        this.e = a3bVar;
        xt4 xt4Var = new xt4(connectivityManager, 27, y6dVar);
        this.f = xt4Var;
        this.g = new fde(i21Var, connectivityManager, telephonyManager, y6dVar);
        this.h = new zva(i21Var, connectivityManager, telephonyManager);
        this.i = new cr1(i21Var, y6dVar, zkbVar, jbeVar, a3bVar, xt4Var, y8gVar);
        this.j = new v6d(2);
        n81 n81Var = new n81((CallAnalyticsSender) i21Var.e, y8gVar, zkbVar, a3bVar, xt4Var, y6dVar);
        this.k = n81Var;
        qi1 qi1Var = si1Var.z;
        this.l = new ss3(i21Var, y6dVar, new rs3(qi1Var.o, qi1Var.p, qi1Var.q));
        this.m = new z21((CallAnalyticsSender) i21Var.e, new qt6(context, y6dVar, y8gVar), y8gVar);
        this.n = new r7(n81Var, y8gVar);
    }
}
