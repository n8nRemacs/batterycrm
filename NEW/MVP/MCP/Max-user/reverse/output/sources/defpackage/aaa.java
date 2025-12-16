package defpackage;

import android.content.res.Resources;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.ok.messages.media.mediabar.ActLocalMedias;

/* loaded from: classes2.dex */
public final /* synthetic */ class aaa implements gu3, w2f {
    public final /* synthetic */ int a;
    public final /* synthetic */ eaa b;

    public /* synthetic */ aaa(eaa eaaVar, int i) {
        this.a = i;
        this.b = eaaVar;
    }

    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.gu3
    public void accept(Object obj) throws Resources.NotFoundException {
        final gsc gscVar;
        int i = this.a;
        final eaa eaaVar = this.b;
        final int i2 = 0;
        switch (i) {
            case 0:
                eaaVar.getClass();
                wqi.g("eaa", (Throwable) obj, "startCrop error", new Object[0]);
                ActLocalMedias actLocalMedias = eaaVar.c;
                efi.r(actLocalMedias, actLocalMedias.getString(mvd.D), 0);
                break;
            default:
                final daa daaVar = (daa) obj;
                wqi.c("eaa", "initVideoLocalMediasResult doOnSuccess", new Object[0]);
                eaaVar.Y = daaVar.c;
                long j = daaVar.a;
                eaaVar.Z = j;
                eaaVar.s0 = daaVar.b;
                final int i3 = 1;
                if (j == 0) {
                    wqi.c("eaa", "videoDuration == 0 -> hide controls", new Object[0]);
                    eaaVar.P0(new lz1(11));
                } else if (daaVar.d) {
                    wqi.c("eaa", "showQualityButton == true", new Object[0]);
                    eaaVar.P0(new dn6() { // from class: caa
                        @Override // defpackage.dn6
                        public final Object apply(Object obj2) {
                            switch (i2) {
                                case 0:
                                    daa daaVar2 = (daa) daaVar;
                                    le8 le8Var = (le8) obj2;
                                    eaa eaaVar2 = eaaVar;
                                    eaaVar2.getClass();
                                    le8Var.i = daaVar2.b.a;
                                    le8Var.a = true;
                                    le8Var.b = true;
                                    le8Var.g = false;
                                    le8Var.h = false;
                                    le8Var.c = false;
                                    le8Var.n = eaaVar2.s0.d;
                                    le8Var.o = daaVar2.e;
                                    return le8Var;
                                default:
                                    gsc gscVar2 = (gsc) daaVar;
                                    le8 le8Var2 = (le8) obj2;
                                    eaa eaaVar3 = eaaVar;
                                    eaaVar3.getClass();
                                    le8Var2.a = false;
                                    le8Var2.b = true;
                                    le8Var2.c = false;
                                    le8Var2.i = gscVar2;
                                    le8Var2.g = false;
                                    le8Var2.h = false;
                                    le8Var2.n = eaaVar3.s0.d;
                                    return le8Var2;
                            }
                        }
                    });
                } else {
                    wqi.c("eaa", "showQualityButton == false", new Object[0]);
                    if (eaaVar.Y.isEmpty()) {
                        wqi.c("eaa", "allowedQualities is empty -> set default 480p", new Object[0]);
                        gscVar = gsc.s0;
                    } else {
                        gscVar = eaaVar.s0.a;
                    }
                    eaaVar.P0(new dn6() { // from class: caa
                        @Override // defpackage.dn6
                        public final Object apply(Object obj2) {
                            switch (i3) {
                                case 0:
                                    daa daaVar2 = (daa) gscVar;
                                    le8 le8Var = (le8) obj2;
                                    eaa eaaVar2 = eaaVar;
                                    eaaVar2.getClass();
                                    le8Var.i = daaVar2.b.a;
                                    le8Var.a = true;
                                    le8Var.b = true;
                                    le8Var.g = false;
                                    le8Var.h = false;
                                    le8Var.c = false;
                                    le8Var.n = eaaVar2.s0.d;
                                    le8Var.o = daaVar2.e;
                                    return le8Var;
                                default:
                                    gsc gscVar2 = (gsc) gscVar;
                                    le8 le8Var2 = (le8) obj2;
                                    eaa eaaVar3 = eaaVar;
                                    eaaVar3.getClass();
                                    le8Var2.a = false;
                                    le8Var2.b = true;
                                    le8Var2.c = false;
                                    le8Var2.i = gscVar2;
                                    le8Var2.g = false;
                                    le8Var2.h = false;
                                    le8Var2.n = eaaVar3.s0.d;
                                    return le8Var2;
                            }
                        }
                    });
                }
                eaaVar.c.T(!eaaVar.s0.d, false);
                break;
        }
    }

    @Override // defpackage.w2f
    public void i(i2f i2fVar) throws Throwable {
        p2h p2hVar;
        eaa eaaVar = this.b;
        ActLocalMedias actLocalMedias = eaaVar.c;
        j16 j16VarE = zpi.e(actLocalMedias, xpi.q(eaaVar.o.a()));
        if (j16VarE.b == 0 || i2fVar.e()) {
            return;
        }
        u10 u10Var = new u10(2);
        Object next = null;
        u10Var.c = null;
        u10Var.a = 0.0f;
        u10Var.b = 1.0f;
        u10Var.d = false;
        p2h p2hVar2 = new p2h(u10Var);
        fce fceVarH = eaaVar.v0.h(eaaVar.o);
        if (fceVarH != null && (p2hVar = fceVarH.b) != null) {
            u10 u10Var2 = new u10(2);
            u10Var2.c = p2hVar.a;
            u10Var2.a = p2hVar.b;
            u10Var2.b = p2hVar.c;
            u10Var2.d = p2hVar.d;
            p2hVar2 = new p2h(u10Var2);
        }
        if (i2fVar.e()) {
            return;
        }
        List listA = m7j.a(xpi.q(eaaVar.o.a()), actLocalMedias, (u6b) ((t1b) ((qm3) actLocalMedias.J0.b)).getAccessor().c(660));
        Collections.sort(listA, isc.g);
        boolean z = listA.size() > 1;
        if (listA.size() > 0 && p2hVar2.a == null) {
            gsc gscVar = eaaVar.X.a;
            Iterator it = listA.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    gsc gscVar2 = ((isc) next).a;
                    do {
                        Object next2 = it.next();
                        gsc gscVar3 = ((isc) next2).a;
                        if (gscVar2.compareTo(gscVar3) > 0) {
                            next = next2;
                            gscVar2 = gscVar3;
                        }
                    } while (it.hasNext());
                }
            }
            isc iscVar = (isc) next;
            if (iscVar != null) {
                gsc gscVar4 = iscVar.a;
                if (gscVar4.compareTo(gscVar) >= 0) {
                    gscVar = gscVar4;
                }
            }
            u10 u10VarA = p2hVar2.a();
            u10VarA.c = gscVar;
            p2hVar2 = new p2h(u10VarA);
        }
        if (!j16VarE.a) {
            u10 u10VarA2 = p2hVar2.a();
            u10VarA2.d = true;
            p2hVar2 = new p2h(u10VarA2);
        }
        i2fVar.a(new daa(j16VarE.b, p2hVar2, listA, z, j16VarE.a));
    }
}
