package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.apache.http.HttpStatus;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class xr extends xfh {
    public static final /* synthetic */ yy7[] I0;
    public final ArrayList A0;
    public final tcf B0;
    public final hbd C0;
    public final xq D0;
    public final ci5 E0;
    public final t9f F0;
    public pr G0;
    public final int H0;
    public final k18 X;
    public final k18 Y;
    public final k18 Z;
    public final v3b b;
    public final k18 c;
    public final sxg d;
    public final pe8 o;
    public final k18 s0;
    public final k18 t0;
    public final k18 u0;
    public final k18 v0;
    public final k18 w0;
    public final k18 x0;
    public final k18 y0;
    public final a93 z0;

    static {
        z8a z8aVar = new z8a(xr.class, "updateSelectedTheme", "getUpdateSelectedTheme()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        I0 = new yy7[]{z8aVar};
    }

    public xr() {
        xq xqVar;
        n5g n5gVar;
        ar arVar = ar.a;
        z7c z7cVar = (z7c) arVar.getAccessor().c(70);
        bwf bwfVarD = arVar.getAccessor().d(32);
        bwf bwfVarD2 = arVar.getAccessor().d(12);
        bwf bwfVarD3 = arVar.getAccessor().d(217);
        bwf bwfVarD4 = arVar.getAccessor().d(215);
        bwf bwfVarD5 = arVar.getAccessor().d(98);
        bwf bwfVarD6 = arVar.getAccessor().d(439);
        bwf bwfVarD7 = arVar.getAccessor().d(8);
        bwf bwfVarD8 = arVar.getAccessor().d(HttpStatus.SC_GONE);
        bwf bwfVarD9 = arVar.getAccessor().d(88);
        bwf bwfVarD10 = arVar.getAccessor().d(597);
        v3b v3bVar = (v3b) arVar.getAccessor().c(500);
        bwf bwfVarD11 = arVar.getAccessor().d(48);
        this.b = v3bVar;
        this.c = bwfVarD;
        this.d = z7cVar.c;
        this.o = z7cVar.a;
        this.X = bwfVarD2;
        this.Y = bwfVarD3;
        this.Z = bwfVarD4;
        this.s0 = bwfVarD5;
        this.t0 = bwfVarD6;
        this.u0 = bwfVarD7;
        this.v0 = bwfVarD8;
        this.w0 = bwfVarD9;
        this.x0 = bwfVarD10;
        this.y0 = bwfVarD11;
        this.z0 = a93.s0.x((Context) bwfVarD2.getValue());
        zg5 zg5Var = xq.X;
        ArrayList arrayList = new ArrayList(we3.q(zg5Var, 10));
        Iterator it = zg5Var.iterator();
        while (true) {
            f2 f2Var = (f2) it;
            if (!f2Var.hasNext()) {
                this.A0 = arrayList;
                pr prVar = pr.d;
                tcf tcfVarA = ucf.a(prVar);
                this.B0 = tcfVarA;
                this.C0 = new hbd(tcfVarA);
                lha lhaVarB = ((dh4) this.z0.d).b();
                if ((lhaVarB instanceof jha) || lhaVarB.equals(kha.b)) {
                    xqVar = xq.b;
                } else if (lhaVarB.equals(hha.b)) {
                    xqVar = xq.c;
                } else {
                    if (!lhaVarB.equals(iha.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    xqVar = xq.d;
                }
                this.D0 = xqVar;
                this.E0 = new ci5(0);
                this.F0 = c7j.c();
                this.G0 = prVar;
                this.H0 = ((t75) this.b.a.a.getValue()).ordinal();
                xfh.o(this, ((q2b) z()).a(), new tr(this, null), 2);
                zs0.e(new g56(((qf0) bwfVarD10.getValue()).g, new or(this, null), 1), this.a);
                return;
            }
            xq xqVar2 = (xq) f2Var.next();
            Boolean bool = Boolean.FALSE;
            int i = qr.$EnumSwitchMapping$0[xqVar2.ordinal()];
            if (i == 1) {
                n5gVar = new n5g(lwa.i);
            } else if (i == 2) {
                n5gVar = new n5g(lwa.d);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                n5gVar = new n5g(lwa.a);
            }
            arrayList.add(new zq(xqVar2, bool, n5gVar));
        }
    }

    public static String A(String str, Integer num, Integer num2, Boolean bool) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            jSONObject.put("background", str);
        }
        if (num != null) {
            jSONObject.put("theme", num.intValue());
        }
        if (num2 != null) {
            jSONObject.put("textSize", num2.intValue());
        }
        jSONObject.put("isFinal", bool.booleanValue() ? 1 : 0);
        return jSONObject.toString();
    }

    public static final eh9 t(xr xrVar, int i, String str, xl9 xl9Var, boolean z) {
        long j = i;
        k18 k18Var = xrVar.c;
        k18 k18Var2 = xrVar.c;
        return pj9.a((pj9) xrVar.Z.getValue(), new si9(j, 0L, 0L, 0L, ((z7c) k18Var.getValue()).a.j(), z ? 1L : ((z7c) k18Var2.getValue()).a.s(), 0L, str, xi9.X, jm9.ACTIVE, ((z7c) k18Var2.getValue()).a.j(), null, null, null, 0, 0L, null, null, null, null, 0, false, 0, 0, 2, 0L, 0L, null, 0L, 0, 0L, new ArrayList(), xl9Var, null, 0L));
    }

    public static final Drawable u(xr xrVar) {
        qf0 qf0Var = (qf0) xrVar.x0.getValue();
        int i = of0.b;
        a93 a93Var = xrVar.z0;
        return (Drawable) qf0Var.e.get(jui.b(a93Var.j().a, a93Var.l()));
    }

    public static final ArrayList v(xr xrVar, List list) {
        xrVar.getClass();
        ArrayList arrayList = new ArrayList(we3.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f7g f7gVar = (f7g) it.next();
            qf0 qf0Var = (qf0) xrVar.x0.getValue();
            int i = of0.b;
            Drawable drawable = (Drawable) qf0Var.e.get(jui.b(f7gVar.b, xrVar.z0.l()));
            c7g c7gVarA = null;
            c7g c7gVar = drawable instanceof c7g ? (c7g) drawable : null;
            if (c7gVar != null) {
                c7gVarA = c7gVar.a(0.45f);
            }
            arrayList.add(f7g.l(f7gVar, false, c7gVarA, 7));
        }
        return arrayList;
    }

    @Override // defpackage.xfh
    public final void s() {
        qf0 qf0Var = (qf0) this.x0.getValue();
        qf0Var.e.clear();
        qt7 qt7Var = (qt7) qf0Var.h.D(qf0Var, qf0.i[0]);
        if (qt7Var != null) {
            qt7Var.cancel(null);
        }
    }

    public final xp7 w(String str, String str2, String str3) {
        nn8 nn8Var = new nn8();
        nn8Var.put("settingsType", "Design");
        nn8Var.put("paramValue", str2);
        nn8Var.put("paramAdditionally", str3);
        nn8 nn8VarB = nn8Var.b();
        xp7 xp7Var = new xp7();
        xp7Var.a = System.currentTimeMillis();
        pe8 pe8Var = this.o;
        xp7Var.o = pe8Var.K();
        xp7Var.c = "SETTINGS";
        xp7Var.d = str;
        xp7Var.b = pe8Var.s();
        xp7Var.c(nn8VarB);
        return xp7Var;
    }

    public final Object x(q44 q44Var) {
        return svi.i(((q2b) z()).a(), new sr(this, null), q44Var);
    }

    public final dd y() {
        return (dd) this.w0.getValue();
    }

    public final lzf z() {
        return (lzf) this.u0.getValue();
    }
}
