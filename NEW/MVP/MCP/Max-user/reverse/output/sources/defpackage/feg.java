package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class feg {
    public static volatile boolean b;
    public static x79 c;
    public static Context d;
    public static pje e;
    public static uyf f;
    public static final feg a = new feg();
    public static final AtomicBoolean g = new AtomicBoolean();
    public static final bwf h = new bwf(l8.s0);
    public static final bwf i = new bwf(l8.Z);
    public static volatile Object j = id5.a;

    public static String a() {
        if (b) {
            return null;
        }
        Object obj = c().get(nca.b);
        if ((obj instanceof s74 ? (s74) obj : null) == null) {
            new s7c(13).d();
        }
        Context context = d;
        if (context == null) {
            context = null;
        }
        String strB = kri.b(context, "tracer_app_token");
        if (strB == null) {
            throw new IllegalStateException("Could not find Tracer's appToken. Is Tracer plugin configured properly?");
        }
        if (strB.equals("0000000000000000000000000000000000000000000")) {
            return null;
        }
        return strB;
    }

    public static w55 b() {
        return (w55) i.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    public static Map c() {
        if (g.get()) {
            return j;
        }
        throw new IllegalStateException("Tracer is not initialized");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List d(w07 w07Var) {
        s7c s7cVar = new s7c(13);
        s7cVar.b = 2147482647;
        s74 s74Var = new s74(s7cVar);
        i94 i94Var = new i94(new v17(17, (byte) 0));
        x6i x6iVar = new x6i(11, (boolean) (null == true ? 1 : 0));
        Boolean bool = Boolean.TRUE;
        x6iVar.b = bool;
        h94 h94Var = new h94(x6iVar);
        mc5 mc5Var = new mc5(16, (boolean) (null == true ? 1 : 0));
        mc5Var.b = bool;
        q17 q17Var = new q17(mc5Var);
        h08 h08Var = new h08(14, (boolean) (null == true ? 1 : 0));
        h08Var.b = bool;
        xx4 xx4Var = new xx4(h08Var);
        lxd lxdVar = new lxd();
        bj bjVar = new bj(12);
        bjVar.c = bool;
        bjVar.b = 1000;
        return ve3.j(s74Var, i94Var, h94Var, q17Var, xx4Var, lxdVar, new irb(bjVar));
    }

    public static final void e(String str, String str2) {
        Map mapSingletonMap = Collections.singletonMap(str, str2);
        if (b) {
            return;
        }
        try {
            pje pjeVar = e;
            if (pjeVar == null) {
                pjeVar = null;
            }
            pjeVar.f(mapSingletonMap);
        } catch (Exception unused) {
        }
    }
}
