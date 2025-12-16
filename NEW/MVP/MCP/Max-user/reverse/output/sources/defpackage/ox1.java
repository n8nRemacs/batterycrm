package defpackage;

import android.os.Build;

/* loaded from: classes.dex */
public final class ox1 implements vn4 {
    public boolean X;
    public boolean Y;
    public final nx1 Z;
    public final qsb a;
    public final esb b;
    public final s2i c;
    public final cm6 d;
    public final j48 o;
    public String s0;

    public ox1(qsb qsbVar, esb esbVar, s2i s2iVar, cm6 cm6Var, j48 j48Var) {
        this.a = qsbVar;
        this.b = esbVar;
        this.c = s2iVar;
        this.d = cm6Var;
        this.o = j48Var;
        nx1 nx1Var = new nx1();
        this.Z = nx1Var;
        this.s0 = "ALL_GRANTED";
        j48Var.p().a(this);
        gw0.w(aw0.a(new g56(esbVar.Y, new mx1(this, null), 1), nx1Var.b, l38.o), zpi.a(j48Var.p()));
    }

    public final void a() {
        if (Build.VERSION.SDK_INT < 29 || this.a.b()) {
            return;
        }
        String name = ox1.class.getName();
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, name, ho7.f(hashCode(), "Request fsi: "), null);
            }
        }
        qsb qsbVar = this.a;
        s2i s2iVar = this.c;
        qsbVar.getClass();
        s2iVar.c(qsb.p, 180, i4d.permission_fsi_request, i4d.permission_fsi_request_rationale, i4d.permissions_fsi_request_positive_button, new wrb(y9b.c));
        this.s0 = "NEED_FSI";
    }

    public final void b() {
        String name = ox1.class.getName();
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, name, ho7.f(hashCode(), "delayExecution: "), null);
            }
        }
        this.Y = true;
        this.Z.b.g(l38.d);
    }

    public final void c() {
        lg8 lg8Var = lg8.d;
        String name = ox1.class.getName();
        l6b l6bVar = wqi.a;
        if (l6bVar != null && l6bVar.b(lg8Var)) {
            l6bVar.c(lg8Var, name, "requestPermissionOnResume: shouldRequestOnResume " + this.X + " " + hashCode(), null);
        }
        esb esbVar = this.b;
        if (!esbVar.X) {
            esbVar.X = true;
            String name2 = esb.class.getName();
            l6b l6bVar2 = wqi.a;
            if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                l6bVar2.c(lg8Var, name2, "Start permission timer on init", null);
            }
            esbVar.o = svi.e((nxg) esbVar.c.getValue(), null, null, new csb(esbVar, null), 3);
        }
        if (!this.X) {
            String str = "ALL_GRANTED";
            if (fni.a(this.s0, "ALL_GRANTED")) {
                return;
            }
            String str2 = this.s0;
            qsb qsbVar = this.a;
            if (!qsbVar.d()) {
                str = "NEED_POST_NOTIFICATION";
            } else if (!qsbVar.b()) {
                str = "NEED_FSI";
            }
            if (fni.a(str2, str)) {
                return;
            }
        }
        e();
    }

    public final void e() {
        lg8 lg8Var = lg8.d;
        String name = ox1.class.getName();
        l6b l6bVar = wqi.a;
        if (l6bVar != null && l6bVar.b(lg8Var)) {
            l6bVar.c(lg8Var, name, ho7.f(hashCode(), "requestPermissionsIfNeeded: "), null);
        }
        if (((Boolean) this.d.invoke()).booleanValue()) {
            String name2 = ox1.class.getName();
            l6b l6bVar2 = wqi.a;
            if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                l6bVar2.c(lg8Var, name2, ho7.f(hashCode(), "forbidRequest: "), null);
            }
            this.b.a(false);
            return;
        }
        if (!this.o.p().d.a(l38.o)) {
            String name3 = ox1.class.getName();
            l6b l6bVar3 = wqi.a;
            if (l6bVar3 != null && l6bVar3.b(lg8Var)) {
                l6bVar3.c(lg8Var, name3, ho7.f(hashCode(), "Host not in resumed state: "), null);
            }
            this.X = true;
            return;
        }
        if (this.a.d()) {
            a();
        } else {
            String name4 = ox1.class.getName();
            l6b l6bVar4 = wqi.a;
            if (l6bVar4 != null && l6bVar4.b(lg8Var)) {
                l6bVar4.c(lg8Var, name4, ho7.f(hashCode(), "Request post notification: "), null);
            }
            this.a.h(this.c, true);
            this.s0 = "NEED_POST_NOTIFICATION";
        }
        this.b.a(true);
        this.X = false;
    }

    public final void f() {
        String name = ox1.class.getName();
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, name, ho7.f(hashCode(), "resumeExecution: "), null);
            }
        }
        if (this.Y) {
            l38 l38Var = this.o.p().d;
            l38 l38Var2 = l38.o;
            if (l38Var.a(l38Var2)) {
                this.Z.b.g(l38Var2);
                c();
            }
        }
        this.Y = false;
    }

    @Override // defpackage.vn4
    public final void onDestroy(j48 j48Var) {
        j48Var.p().f(this);
    }

    @Override // defpackage.vn4
    public final void onPause(j48 j48Var) {
        this.Z.b.g(l38.d);
    }

    @Override // defpackage.vn4
    public final void onResume(j48 j48Var) {
        if (this.Y) {
            return;
        }
        this.Z.b.g(l38.o);
        c();
    }
}
