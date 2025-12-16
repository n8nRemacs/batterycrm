package ru.ok.tracer.crash.report;

import android.content.Context;
import android.net.Uri;
import defpackage.afg;
import defpackage.bfg;
import defpackage.d6j;
import defpackage.dnf;
import defpackage.dwa;
import defpackage.feg;
import defpackage.i94;
import defpackage.iv6;
import defpackage.jeg;
import defpackage.jz5;
import defpackage.mba;
import defpackage.nbj;
import defpackage.pje;
import defpackage.qg8;
import defpackage.qje;
import defpackage.qs3;
import defpackage.sni;
import defpackage.tl7;
import defpackage.uyf;
import defpackage.v17;
import defpackage.v1a;
import defpackage.zk;
import java.io.File;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import ru.ok.tracer.TracerInitializer;
import ru.ok.tracer.minidump.Minidump;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ok/tracer/crash/report/CrashReportInitializer;", "Ltl7;", "Ljeg;", "<init>", "()V", "tracer-crash-report_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class CrashReportInitializer implements tl7 {
    @Override // defpackage.tl7
    public final List a() {
        return Collections.singletonList(TracerInitializer.class);
    }

    @Override // defpackage.tl7
    public final Object b(Context context) {
        String str;
        feg fegVar = feg.a;
        Object obj = feg.c().get(dwa.b);
        i94 i94Var = obj instanceof i94 ? (i94) obj : null;
        byte b = 0;
        int i = 17;
        if (i94Var == null) {
            i94Var = new i94(new v17(i, b));
        }
        if (i94Var.a) {
            try {
                String strB = d6j.b();
                if (strB.equals(context.getPackageName())) {
                    str = "tracer";
                } else {
                    str = "tracer-" + Uri.encode(dnf.p(strB, ':', '-', false));
                }
                File fileG = jz5.g(new File(context.getCacheDir(), str), "minidump");
                nbj.b(fileG);
                Minidump.c.a(fileG.getPath());
            } catch (Throwable unused) {
            }
        }
        pje pjeVar = feg.e;
        pje pjeVar2 = pjeVar != null ? pjeVar : null;
        uyf uyfVar = feg.f;
        uyf uyfVar2 = uyfVar != null ? uyfVar : null;
        iv6 iv6Var = new iv6(1, context);
        qg8 qg8Var = new qg8(context, i94Var.d);
        v1a v1aVar = new v1a(i);
        qje qjeVar = new qje();
        zk zkVar = new zk(context, i94Var.c);
        jeg.b = new qs3(iv6Var, pjeVar2, uyfVar2, qg8Var, qjeVar, v1aVar);
        afg.b(new mba(i94Var, context, pjeVar2, uyfVar2, qg8Var, iv6Var, zkVar, qjeVar, v1aVar));
        sni.a(new bfg());
        return jeg.a;
    }
}
