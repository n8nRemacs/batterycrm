package ru.ok.tracer;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import defpackage.eeg;
import defpackage.feg;
import defpackage.geg;
import defpackage.ieg;
import defpackage.kri;
import defpackage.nca;
import defpackage.pje;
import defpackage.s74;
import defpackage.s7c;
import defpackage.ssb;
import defpackage.t4j;
import defpackage.tha;
import defpackage.tl7;
import defpackage.to8;
import defpackage.u4j;
import defpackage.uyf;
import defpackage.w07;
import defpackage.we3;
import defpackage.x79;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.ok.tracer.utils.LoggerInitializer;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ok/tracer/TracerInitializer;", "Ltl7;", "Lfeg;", "<init>", "()V", "tracer-commons_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class TracerInitializer implements tl7 {
    @Override // defpackage.tl7
    public final List a() {
        return Collections.singletonList(LoggerInitializer.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tl7
    public final Object b(Context context) {
        feg fegVar = feg.a;
        if (feg.g.getAndSet(true)) {
            throw new IllegalStateException("Tracer already initialized!");
        }
        feg.d = context;
        if (context instanceof w07) {
            try {
                List listD = feg.d((w07) context);
                int i = to8.i(we3.q(listD, 10));
                if (i < 16) {
                    i = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                for (Object obj : listD) {
                    linkedHashMap.put(((ieg) obj).a(), obj);
                }
                feg.j = linkedHashMap;
            } catch (Exception unused) {
            }
        }
        feg fegVar2 = feg.a;
        Object obj2 = feg.c().get(nca.b);
        s74 s74Var = obj2 instanceof s74 ? (s74) obj2 : null;
        if (s74Var == null) {
            s74Var = new s74(new s7c(13));
        }
        PackageInfo packageInfoB = u4j.b(context.getPackageManager(), context.getPackageName());
        String str = packageInfoB.packageName;
        String str2 = packageInfoB.versionName;
        long jE = t4j.e(packageInfoB);
        String strB = kri.b(context, "tracer_mapping_uuid");
        if (strB == null) {
            throw new IllegalStateException("Could not find build UUID. Is Tracer plugin configured properly?");
        }
        if (strB.equals("00000000-0000-0000-0000-000000000000")) {
            strB = null;
        }
        String strB2 = kri.b(context, "tracer_environment");
        x79 x79Var = new x79();
        x79Var.b = str;
        x79Var.a = str2;
        x79Var.d = jE;
        x79Var.c = strB;
        x79Var.o = strB2;
        feg.c = x79Var;
        tha.u0 = new ssb(new eeg(context, 0));
        feg.e = new pje(context);
        feg.f = new uyf(context);
        Map map = s74Var.a;
        if (!map.isEmpty()) {
            uyf uyfVar = feg.f;
            if (uyfVar == null) {
                uyfVar = null;
            }
            uyfVar.c(map);
        }
        Application application = (Application) context.getApplicationContext();
        pje pjeVar = feg.e;
        application.registerActivityLifecycleCallbacks(new geg(pjeVar != null ? pjeVar : null));
        return fegVar2;
    }
}
