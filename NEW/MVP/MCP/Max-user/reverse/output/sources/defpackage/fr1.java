package defpackage;

import java.util.concurrent.TimeUnit;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* loaded from: classes2.dex */
public final class fr1 implements qdg {
    public final i21 a;
    public final zkb b;
    public final jbe c;
    public final a3b d;
    public final xt4 e;
    public final fde f;
    public final zva g;
    public final cr1 h;
    public final v6d i;
    public final n81 j;
    public final ss3 k;
    public final z21 l;
    public final r7 m;

    public fr1(i21 i21Var, zkb zkbVar, jbe jbeVar, a3b a3bVar, xt4 xt4Var, fde fdeVar, zva zvaVar, cr1 cr1Var, v6d v6dVar, n81 n81Var, ss3 ss3Var, z21 z21Var, r7 r7Var) {
        this.a = i21Var;
        this.b = zkbVar;
        this.c = jbeVar;
        this.d = a3bVar;
        this.e = xt4Var;
        this.f = fdeVar;
        this.g = zvaVar;
        this.h = cr1Var;
        this.i = v6dVar;
        this.j = n81Var;
        this.k = ss3Var;
        this.l = z21Var;
        this.m = r7Var;
        ((zl3) v6dVar.X).dispose();
        zl3 zl3Var = new zl3();
        v6dVar.X = zl3Var;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        zl3Var.a(vqa.j(MultiFileUploader.UPLOAD_NEXT_INTERVAL, MultiFileUploader.UPLOAD_NEXT_INTERVAL, timeUnit, u0e.b()).n(new ulc(14, v6dVar)));
        ((zl3) v6dVar.X).a(vqa.j(1000L, 1000L, timeUnit, u0e.b()).n(new vgd(12, v6dVar)));
    }

    @Override // defpackage.qdg
    public final void onTopologyUpdated(mdg mdgVar, mdg mdgVar2) {
        this.j.onTopologyUpdated(mdgVar, mdgVar2);
    }
}
