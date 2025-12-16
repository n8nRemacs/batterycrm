package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class oga extends xfh {
    public final tcf X;
    public volatile int Y;
    public final ci5 Z;
    public final /* synthetic */ vea b;
    public final boolean c;
    public final nce d;
    public volatile zea o;
    public final fve s0;
    public final o6g t0;
    public final hbd u0;
    public final jve v0;
    public final gbd w0;
    public final z41 x0;
    public final tcf y0;
    public final zn1 z0;

    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [kotlin.coroutines.Continuation, xbe] */
    /* JADX WARN: Type inference failed for: r14v3 */
    public oga(Long l, njd njdVar, bwf bwfVar, bwf bwfVar2, k18 k18Var, k18 k18Var2, k18 k18Var3, int i) {
        int i2;
        boolean z;
        f2c f2cVar;
        ?? r14;
        int i3;
        nce xjdVar;
        Object objY;
        k18 k18VarD = (i & 32) != 0 ? hh8.a.getAccessor().d(8) : k18Var2;
        k18 k18VarD2 = (i & 64) != 0 ? hh8.a.getAccessor().d(139) : k18Var3;
        hh8 hh8Var = hh8.a;
        bwf bwfVarD = hh8Var.getAccessor().d(10);
        bwf bwfVarD2 = hh8Var.getAccessor().d(111);
        bwf bwfVarD3 = hh8Var.getAccessor().d(14);
        bwf bwfVarD4 = hh8Var.getAccessor().d(47);
        bwf bwfVarD5 = hh8Var.getAccessor().d(79);
        bwf bwfVarD6 = hh8Var.getAccessor().d(454);
        bwf bwfVarD7 = hh8Var.getAccessor().d(123);
        k18 k18VarA = hh8Var.a();
        bwf bwfVarB = hh8Var.getAccessor().b(4);
        vea veaVar = new vea(bwfVarD, k18VarD, bwfVarD2, bwfVarD3, bwfVarD4, bwfVarD6);
        this.b = veaVar;
        boolean z2 = njdVar != null;
        this.c = z2;
        f2c f2cVar2 = f2c.a;
        if (njdVar != null) {
            k18 k18Var4 = k18VarD2;
            i3 = 2;
            i2 = 1;
            f2cVar = f2cVar2;
            r14 = 0;
            z = z2;
            xjdVar = new xjd(njdVar, this.a, new fga(this, 0), k18Var, k18Var4, bwfVar2, k18VarD, bwfVarD5, k18VarA, bwfVarB);
        } else {
            i2 = 1;
            z = z2;
            f2cVar = f2cVar2;
            r14 = 0;
            i3 = 2;
            if (l == null) {
                throw new IllegalStateException("Pass registrationData or contactId to work with NeuroAvatarsDelegate");
            }
            long jLongValue = l.longValue();
            ContextScope contextScope = this.a;
            fga fgaVar = new fga(this, 1);
            l24 l24Var = (l24) bwfVarD7.getValue();
            r30 r30Var = new r30();
            r30Var.b = fgaVar;
            r30Var.c = bwfVarD5;
            jve jveVarA = kve.a(1, 1, 2);
            r30Var.a = jveVarA;
            r30Var.d = new gbd(jveVarA);
            tcf tcfVarA = ucf.a(f2cVar);
            r30Var.o = tcfVarA;
            r30Var.X = new hbd(tcfVarA);
            gw0.w(new g56(l24Var.c(jLongValue), new mmc(r30Var, null), 1), contextScope);
            xjdVar = r30Var;
        }
        this.d = xjdVar;
        d53 d53Var = new d53(veaVar.k, 25);
        tcf tcfVarA2 = ucf.a(hd5.a);
        this.X = tcfVarA2;
        this.Z = new ci5(0);
        mr3 mr3Var = xjdVar instanceof mr3 ? (mr3) xjdVar : r14;
        this.s0 = mr3Var != null ? mr3Var.i() : r14;
        this.t0 = xjdVar.f();
        int i4 = 3;
        if (z) {
            objY = new z41(new m36(new iga(i3, r14), xjdVar.e()), new m36(new jga(i3, r14), d53Var), new kga(i4, (Continuation) r14, 0), 3);
        } else {
            x26[] x26VarArr = new x26[i3];
            x26VarArr[0] = xjdVar.e();
            x26VarArr[i2] = d53Var;
            objY = gw0.y(x26VarArr);
        }
        this.u0 = gw0.C(new g56(gw0.m(new z41(objY, xjdVar.c(), new kga(i4, (Continuation) r14, i2), 3)), new lga(this, r14), i2), this.a, yve.a, new ybe(r14, f2cVar));
        jve jveVarB = kve.b(0, Integer.MAX_VALUE, 4);
        this.v0 = jveVarB;
        this.w0 = new gbd(jveVarB);
        jve jveVarA2 = kve.a(i2, i2, i3);
        this.x0 = new z41(new hbd(tcfVarA2), jveVarA2, new cj8(3, r14, i3), 3);
        tcf tcfVarA3 = ucf.a(id5.a);
        this.y0 = tcfVarA3;
        this.z0 = new zn1(new hbd(tcfVarA3), 6);
        ArrayList arrayList = new ArrayList(16);
        for (int i5 = 0; i5 < 16; i5++) {
            arrayList.add(new aga());
        }
        jveVarA2.h(arrayList);
        jfa jfaVar = (jfa) bwfVar.getValue();
        jfaVar.getClass();
        gw0.w(gw0.u(new g56(gw0.u(new mwd(new ifa(jfaVar, r14)), ((q2b) ((lzf) jfaVar.c.getValue())).b()), new gga(this, r14), i2), ((q2b) ((lzf) k18VarD.getValue())).b()), this.a);
        if (this.c) {
            gw0.w(new g56(this.b.k, new hga(this, r14), i2), this.a);
        }
    }

    public final void A() {
        vea veaVar = this.b;
        if (!((qsb) veaVar.a.getValue()).c(qsb.m)) {
            veaVar.h.h(sc0.a);
            return;
        }
        svi.e(this.a, ((q2b) ((lzf) veaVar.g.getValue())).b(), null, new uea(veaVar, null), 2);
    }

    public final void t() {
        boolean z = this.c;
        vea veaVar = this.b;
        if (!z) {
            y(null);
            veaVar.j.setValue(null);
        } else if (((ybe) this.u0.a.getValue()).a instanceof vbe) {
            y(null);
        } else {
            veaVar.j.setValue(null);
        }
    }

    public final List u() {
        o98 o98VarD = ve3.d();
        o98VarD.add(new pq3(xyc.oneme_login_neuro_avatars_load_from_gallery_action, new n5g(t3d.oneme_login_neuro_avatars_load_from_gallery_action), 4, 56));
        o98VarD.add(new pq3(xyc.oneme_login_neuro_avatars_take_photo_action, new n5g(t3d.oneme_login_neuro_avatars_take_photo_action), 4, 56));
        if (((ybe) this.u0.a.getValue()).a != null) {
            o98VarD.add(new pq3(xyc.oneme_login_neuro_avatars_remove_photo_action, new n5g(t3d.oneme_login_neuro_avatars_remove_photo_action), 1, 56));
        }
        o98VarD.add(new pq3(xyc.oneme_login_neuro_avatars_cancel_action, new n5g(mvd.p), 3, 56));
        return ve3.a(o98VarD);
    }

    public final boolean v() {
        hbd hbdVar = this.u0;
        xbe xbeVar = ((ybe) hbdVar.a.getValue()).a;
        i2c i2cVar = ((ybe) hbdVar.a.getValue()).b;
        vbe vbeVar = xbeVar instanceof vbe ? (vbe) xbeVar : null;
        Long lValueOf = vbeVar != null ? Long.valueOf(vbeVar.c) : null;
        g2c g2cVar = i2cVar instanceof g2c ? (g2c) i2cVar : null;
        boolean zA = fni.a(lValueOf, g2cVar != null ? Long.valueOf(g2cVar.b) : null);
        wbe wbeVar = xbeVar instanceof wbe ? (wbe) xbeVar : null;
        String str = wbeVar != null ? wbeVar.a : null;
        h2c h2cVar = i2cVar instanceof h2c ? (h2c) i2cVar : null;
        boolean zA2 = fni.a(str, h2cVar != null ? h2cVar.a : null);
        if (xbeVar != null) {
            return (zA2 && zA) ? false : true;
        }
        return false;
    }

    public final void w() {
        this.d.b(((ybe) this.u0.a.getValue()).a);
    }

    public final void x() {
        int i;
        zea zeaVar = this.o;
        if (zeaVar != null) {
            int i2 = zeaVar.c;
            zea zeaVar2 = this.o;
            if (zeaVar2 != null) {
                long j = zeaVar2.a;
                Iterator it = ((Map) this.y0.getValue()).keySet().iterator();
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    i = -1;
                    if (!it.hasNext()) {
                        i4 = -1;
                        break;
                    }
                    Object next = it.next();
                    if (i4 < 0) {
                        ve3.p();
                        throw null;
                    }
                    if (((Number) next).intValue() == i2) {
                        break;
                    } else {
                        i4++;
                    }
                }
                Iterator it2 = ((List) this.X.getValue()).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((zea) it2.next()).a == j) {
                        i = i3;
                        break;
                    }
                    i3++;
                }
                Integer numValueOf = Integer.valueOf(i);
                this.Y = i4;
                this.v0.h(new ffa(i4, numValueOf));
            }
        }
    }

    public final void y(zea zeaVar) {
        zea zeaVarX = zeaVar != null ? zea.x(zeaVar, true) : null;
        this.d.a(zeaVarX != null ? new vbe(zeaVarX.a, zeaVarX.b, zeaVarX.c) : null);
    }

    public final void z(int i) {
        if (i == this.Y) {
            return;
        }
        int iIntValue = ((Number) ue3.D(i, ((Map) this.y0.getValue()).keySet())).intValue();
        Iterator it = ((List) this.X.getValue()).iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (((zea) it.next()).c == iIntValue) {
                break;
            } else {
                i2++;
            }
        }
        Integer numValueOf = Integer.valueOf(i2);
        this.Y = i;
        this.v0.h(new ffa(i, numValueOf));
    }
}
