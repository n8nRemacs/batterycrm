package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* loaded from: classes2.dex */
public final class jrb {
    public final nm8 a;
    public final jx1 b;
    public final k18 c;
    public final cq d = cq.a;

    public jrb(nm8 nm8Var, jx1 jx1Var, k18 k18Var) {
        this.a = nm8Var;
        this.b = jx1Var;
        this.c = k18Var;
    }

    public static nn8 a(jrb jrbVar, boolean z, String str, Boolean bool, Boolean bool2, String str2, int i, List list, int i2) {
        String str3 = (i2 & 2) != 0 ? null : str;
        Boolean bool3 = (i2 & 4) != 0 ? null : bool;
        Boolean bool4 = (i2 & 8) != 0 ? null : bool2;
        String str4 = (i2 & 16) != 0 ? null : str2;
        nn8 nn8Var = new nn8();
        o98 o98VarD = ve3.d();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zqb zqbVar = (zqb) it.next();
            nn8 nn8Var2 = new nn8();
            nn8Var2.put(SdkMetricStatEvent.NAME_KEY, zqbVar.a.a);
            long j = zqbVar.c;
            Long lValueOf = Long.valueOf(j);
            if (j == -1) {
                lValueOf = null;
            }
            if (lValueOf != null) {
                nn8Var2.put("duration", Long.valueOf(zqbVar.c));
            }
            long j2 = zqbVar.d;
            Long lValueOf2 = Long.valueOf(j2);
            if (j2 == -1) {
                lValueOf2 = null;
            }
            if (lValueOf2 != null) {
                nn8Var2.put("span_id", Long.valueOf(zqbVar.d));
            }
            long j3 = zqbVar.e;
            Long lValueOf3 = Long.valueOf(j3);
            if (j3 == -1) {
                lValueOf3 = null;
            }
            if (lValueOf3 != null) {
                nn8Var2.put("parent_span_id", Long.valueOf(zqbVar.e));
            }
            List<brb> list2 = zqbVar.f;
            if (list2 != null) {
                for (brb brbVar : list2) {
                    brbVar.getClass();
                    nn8Var2.put("hasData", brbVar.a);
                }
            }
            o98VarD.add(nn8Var2.b());
        }
        o98 o98VarA = ve3.a(o98VarD);
        nn8Var.put("is_incoming_call", Boolean.valueOf(z));
        if (str3 != null) {
            nn8Var.put("call_skip_reason", str3);
        }
        if (bool3 != null) {
            nn8Var.put("is_group_call", bool3);
        }
        if (bool4 != null) {
            nn8Var.put("is_call_initialized", bool4);
        }
        if (str4 != null) {
            nn8Var.put("call_type", str4);
        }
        nn8Var.put("status", Integer.valueOf(vb9.d(i)));
        nn8Var.put("spans", o98VarA);
        return nn8Var.b();
    }

    public final nn8 b(boolean z, boolean z2, int i, int i2, List list) {
        o98 o98VarD = ve3.d();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zqb zqbVar = (zqb) it.next();
            nn8 nn8Var = new nn8();
            nn8Var.put(SdkMetricStatEvent.NAME_KEY, zqbVar.a.a);
            long j = zqbVar.c;
            Long lValueOf = Long.valueOf(j);
            if (j == -1) {
                lValueOf = null;
            }
            if (lValueOf != null) {
                nn8Var.put("duration", Long.valueOf(zqbVar.c));
            }
            long j2 = zqbVar.d;
            Long lValueOf2 = Long.valueOf(j2);
            if (j2 == -1) {
                lValueOf2 = null;
            }
            if (lValueOf2 != null) {
                nn8Var.put("span_id", Long.valueOf(zqbVar.d));
            }
            long j3 = zqbVar.e;
            if ((j3 != -1 ? Long.valueOf(j3) : null) != null) {
                nn8Var.put("parent_span_id", Long.valueOf(zqbVar.e));
            }
            List<brb> list2 = zqbVar.f;
            if (list2 != null) {
                for (brb brbVar : list2) {
                    brbVar.getClass();
                    nn8Var.put("hasData", brbVar.a);
                }
            }
            o98VarD.add(nn8Var.b());
        }
        o98 o98VarA = ve3.a(o98VarD);
        nn8 nn8Var2 = new nn8();
        nn8Var2.put("session_id", Long.valueOf(((pe8) ((pb3) ((erb) this.c.getValue()).a.getValue())).K()));
        nn8Var2.put("start_type", z ? "cold" : "warm");
        if (z2) {
            nn8Var2.put("source", "push");
        }
        nn8Var2.put("trace_id", UUID.randomUUID().toString());
        nn8Var2.put("spans", o98VarA);
        nn8Var2.put("status", Integer.valueOf(vb9.d(i)));
        if (i2 != 0) {
            nn8Var2.put("errorType", Integer.valueOf(az1.v(i2)));
        }
        return nn8Var2.b();
    }

    public final void c() {
        this.d.getClass();
        if (cq.c) {
            c9a c9aVar = cq.b;
            zqb zqbVar = (zqb) c9aVar.f(arb.APP_INIT);
            crb crbVar = zqbVar != null ? new crb(zqbVar.c, ue3.d0(new cf6(c9aVar))) : null;
            if (crbVar == null) {
                return;
            }
            d(gqb.APP_INIT, b(true, this.a.i, 1, 0, crbVar.a));
            Iterator it = crbVar.a.iterator();
            while (it.hasNext()) {
                cq.b.k(((zqb) it.next()).a);
            }
            cq.c = false;
        }
    }

    public final void d(gqb gqbVar, nn8 nn8Var) {
        ((dd) ((erb) this.c.getValue()).f.getValue()).h(new hg8("PERF", gqbVar.a, 0L, 0L, nn8Var, 0L, 44));
    }

    public final void e(int i, int i2) {
        this.d.getClass();
        boolean z = cq.c;
        nm8 nm8Var = this.a;
        boolean z2 = nm8Var.i;
        c();
        gqb gqbVar = gqb.EVENT_OPEN_CHAT;
        crb crbVarD = nm8Var.d(gqbVar);
        if (crbVarD == null) {
            return;
        }
        List list = crbVarD.a;
        zqb zqbVar = new zqb(arb.OPEN_CHAT_ROOT_SPAN, -1L);
        zqbVar.c = crbVarD.b;
        d(gqbVar, b(z, z2, i, i2, ue3.T(Collections.singletonList(zqbVar), list)));
        nm8Var.e(gqbVar, list);
    }

    public final void f(int i, int i2) {
        this.d.getClass();
        boolean z = cq.c;
        nm8 nm8Var = this.a;
        boolean z2 = nm8Var.i;
        c();
        gqb gqbVar = gqb.EVENT_OPEN_CHATS;
        crb crbVarD = nm8Var.d(gqbVar);
        if (crbVarD == null) {
            return;
        }
        List list = crbVarD.a;
        zqb zqbVar = new zqb(arb.OPEN_CHATS_ROOT_SPAN, -1L);
        zqbVar.c = crbVarD.b;
        d(gqbVar, b(z, z2, i, i2, ue3.T(Collections.singletonList(zqbVar), list)));
        nm8Var.e(gqbVar, list);
    }
}
