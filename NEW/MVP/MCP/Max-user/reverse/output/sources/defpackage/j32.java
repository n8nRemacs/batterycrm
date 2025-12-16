package defpackage;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class j32 {
    public final StringBuilder a = new StringBuilder();
    public final Object b;
    public int c;
    public final ggg d;
    public final HashMap e;
    public int f;

    public j32(ggg gggVar) {
        Object obj = new Object();
        this.b = obj;
        this.e = new HashMap();
        this.c = 1;
        synchronized (obj) {
            this.d = gggVar;
            this.f = this.c;
        }
    }

    public static void c(ez1 ez1Var, m22 m22Var) {
        if (kfi.f()) {
            kfi.g(m22Var.ordinal(), "CX:State[" + ez1Var + "]");
        }
    }

    public final i32 a(String str) {
        HashMap map = this.e;
        for (h02 h02Var : map.keySet()) {
            if (str.equals(h02Var.a().d())) {
                return (i32) map.get(h02Var);
            }
        }
        return null;
    }

    public final void b() {
        boolean zD = gri.d(3, "CameraStateRegistry");
        StringBuilder sb = this.a;
        if (zD) {
            sb.setLength(0);
            sb.append("Recalculating open cameras:\n");
            sb.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            sb.append("-------------------------------------------------------------------\n");
        }
        int i = 0;
        for (Map.Entry entry : this.e.entrySet()) {
            if (gri.d(3, "CameraStateRegistry")) {
                sb.append(String.format(Locale.US, "%-45s%-22s\n", ((h02) entry.getKey()).toString(), ((i32) entry.getValue()).a != null ? ((i32) entry.getValue()).a.toString() : "UNKNOWN"));
            }
            m22 m22Var = ((i32) entry.getValue()).a;
            if (m22Var != null && m22Var.a) {
                i++;
            }
        }
        if (gri.d(3, "CameraStateRegistry")) {
            sb.append("-------------------------------------------------------------------\n");
            Locale locale = Locale.US;
            sb.append(wy1.g("Open count: ", i, " (Max allowed: ", this.c, ")"));
            gri.a("CameraStateRegistry", sb.toString());
        }
        this.f = Math.max(this.c - i, 0);
    }

    public final boolean d(ez1 ez1Var) {
        boolean z;
        synchronized (this.b) {
            try {
                i32 i32Var = (i32) this.e.get(ez1Var);
                z5j.e(i32Var, "Camera must first be registered with registerCamera()");
                z = true;
                if (gri.d(3, "CameraStateRegistry")) {
                    this.a.setLength(0);
                    StringBuilder sb = this.a;
                    Locale locale = Locale.US;
                    int i = this.f;
                    m22 m22Var = i32Var.a;
                    boolean z2 = m22Var != null && m22Var.a;
                    sb.append("tryOpenCamera(" + ez1Var + ") [Available Cameras: " + i + ", Already Open: " + z2 + " (Previous state: " + i32Var.a + ")]");
                }
                if (this.f > 0) {
                    m22 m22Var2 = m22.OPENING;
                    i32Var.a = m22Var2;
                    c(ez1Var, m22Var2);
                } else {
                    m22 m22Var3 = i32Var.a;
                    if (m22Var3 != null && m22Var3.a) {
                        m22 m22Var22 = m22.OPENING;
                        i32Var.a = m22Var22;
                        c(ez1Var, m22Var22);
                    } else {
                        z = false;
                    }
                }
                if (gri.d(3, "CameraStateRegistry")) {
                    StringBuilder sb2 = this.a;
                    Locale locale2 = Locale.US;
                    sb2.append(" --> ".concat(z ? "SUCCESS" : "FAIL"));
                    gri.a("CameraStateRegistry", this.a.toString());
                }
                if (z) {
                    b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final boolean e(String str, String str2) {
        synchronized (this.b) {
            try {
                boolean z = true;
                if (this.d.b != 2) {
                    return true;
                }
                i32 i32VarA = a(str);
                m22 m22Var = i32VarA != null ? i32VarA.a : null;
                i32 i32VarA2 = str2 != null ? a(str2) : null;
                m22 m22Var2 = i32VarA2 != null ? i32VarA2.a : null;
                m22 m22Var3 = m22.OPEN;
                boolean z2 = m22Var3.equals(m22Var) || m22.CONFIGURED.equals(m22Var);
                boolean z3 = m22Var3.equals(m22Var2) || m22.CONFIGURED.equals(m22Var2);
                if (!z2 || !z3) {
                    z = false;
                }
                return z;
            } finally {
            }
        }
    }
}
