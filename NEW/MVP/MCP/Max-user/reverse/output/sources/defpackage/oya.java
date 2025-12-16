package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class oya implements iv4 {
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final tcf i;

    public oya(w5 w5Var) {
        this.a = w5Var.d(12);
        this.b = w5Var.d(74);
        this.c = w5Var.d(46);
        this.d = w5Var.d(80);
        AtomicLong atomicLong = pu4.b;
        this.e = atomicLong.incrementAndGet();
        this.f = atomicLong.incrementAndGet();
        this.g = atomicLong.incrementAndGet();
        this.h = atomicLong.incrementAndGet();
        this.i = ucf.a(e());
    }

    @Override // defpackage.iv4
    public final mcf b() {
        return this.i;
    }

    @Override // defpackage.iv4
    public final void d(yg4 yg4Var) {
        long j = yg4Var.a;
        if (pu4.a(j, this.e)) {
            String strE = ((vxf) this.b.getValue()).e();
            xb3.a((Context) this.a.getValue(), strE);
            wqi.c("PushToken", "Current pushToken: \"" + strE + "\"", new Object[0]);
            return;
        }
        if (pu4.a(j, this.f)) {
            try {
                svi.e(nv6.a, null, null, new nya(this, null), 3);
                return;
            } catch (Throwable th) {
                wqi.p("PushToken", "Refresh current token failed", th);
                return;
            }
        }
        boolean zA = pu4.a(j, this.g);
        tcf tcfVar = this.i;
        if (zA) {
            pe8 pe8Var = (pe8) f();
            pe8Var.A0.O(pe8Var, pe8.U0[14], Boolean.valueOf(!((pe8) f()).P()));
            tcfVar.m(null, e());
            return;
        }
        if (pu4.a(j, this.h)) {
            pe8 pe8Var2 = (pe8) f();
            pe8Var2.s0.O(pe8Var2, pe8.U0[5], Boolean.valueOf(!((pe8) f()).L()));
            tcfVar.m(null, e());
        }
    }

    public final List e() {
        String strConcat;
        r5g r5gVar = new r5g("Скопировать Push token");
        String strE = ((vxf) this.b.getValue()).e();
        if (strE == null || (strConcat = "...".concat(vmf.a0(10, strE))) == null) {
            strConcat = "null";
        }
        return ve3.j(new yg4(this.e, r5gVar, 0, new r5g(strConcat), null, 20), new yg4(this.f, new r5g("Обновить Push token"), 0, new r5g(((vw6) ((alf) this.d.getValue())).f), null, 20), new yg4(this.g, new r5g("Показывать пуши из сокета"), 0, null, new xg4(!((pe8) f()).P()), 12), new yg4(this.h, new r5g("Использовать ssl"), 0, null, new xg4(((pe8) f()).L()), 12));
    }

    public final pb3 f() {
        return (pb3) this.c.getValue();
    }
}
