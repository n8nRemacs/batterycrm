package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class w64 {
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;

    public w64(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4) {
        this.a = k18Var;
        this.b = k18Var4;
        this.c = k18Var2;
        this.d = k18Var3;
    }

    public final vqa a(um9 um9Var) {
        vqa vqaVarP;
        Object next;
        wqi.c("w64", "convertVideo: messageUpload = %s", um9Var);
        if (um9Var.d != wvg.c) {
            return vqa.k(um9Var);
        }
        tgg tggVar = (tgg) this.b.getValue();
        String str = um9Var.a.c;
        tggVar.getClass();
        kvg kvgVar = kvg.g;
        kvgVar.getClass();
        yqb.c(kvgVar, "converting_started", 0, str, 56);
        uid uidVar = new uid();
        uidVar.a = um9Var;
        if (um9Var.e == null) {
            wo8 wo8VarA = um9Var.a();
            u10 u10Var = new u10(2);
            um9 um9Var2 = (um9) uidVar.a;
            gsc gscVar = ((sxg) this.a.getValue()).o().a;
            List listE = ((u6b) this.d.getValue()).e(um9Var2.b);
            if (listE != null) {
                Iterator it = listE.iterator();
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
                } else {
                    next = null;
                }
                isc iscVar = (isc) next;
                if (iscVar != null) {
                    gsc gscVar4 = iscVar.a;
                    if (gscVar4.compareTo(gscVar) < 0) {
                        gscVar4 = gscVar;
                    }
                    l6b l6bVar = wqi.a;
                    if (l6bVar != null) {
                        lg8 lg8Var = lg8.d;
                        if (l6bVar.b(lg8Var)) {
                            l6bVar.c(lg8Var, "w64", "MessageUpload.autoQuality, result=" + gscVar4 + ", defQuality=" + gscVar + ", maxQuality=" + iscVar, null);
                        }
                    }
                    gscVar = gscVar4;
                }
            }
            u10Var.c = gscVar;
            wo8VarA.o = new p2h(u10Var);
            uidVar.a = new um9(wo8VarA);
        }
        Object obj = uidVar.a;
        p2h p2hVar = ((um9) obj).e;
        u10 u10Var2 = new u10(2);
        u10Var2.c = p2hVar.a;
        u10Var2.a = p2hVar.b;
        u10Var2.b = p2hVar.c;
        u10Var2.d = p2hVar.d;
        p2h p2hVar2 = new p2h(u10Var2);
        xpb xpbVar = new xpb(15, false);
        xpbVar.b = ((um9) obj).b;
        xpbVar.c = p2hVar2;
        l2h l2hVar = new l2h(xpbVar);
        u2h u2hVar = (u2h) this.c.getValue();
        synchronized (u2hVar) {
            wqi.c("u2h", "convertVideo: %s", l2hVar);
            vqaVarP = (vqa) u2hVar.i.get(l2hVar);
            if (vqaVarP == null) {
                xr8 xr8Var = new xr8(new wr8(u2hVar.b.a(), new q2h(l2hVar, 1), 1), new fwg(12), 1);
                fwg fwgVar = new fwg(10);
                r8j r8jVar = pdf.e;
                jn6 jn6Var = pdf.d;
                Object wr8Var = new wr8(new xr8(new fs8(xr8Var, fwgVar, r8jVar, jn6Var), new yr8(new u64(u2hVar, 11, l2hVar)), 2), new t2h(u2hVar, 0), 0);
                bra braVar = new bra(new bra(new sra(wr8Var instanceof on6 ? ((on6) wr8Var).b() : new vk3(1, wr8Var), r8jVar, new c5g(u2hVar, 15, l2hVar), jn6Var), r8jVar, new v64(u2hVar, 13, l2hVar), 1), new t2h(u2hVar, 1), jn6Var, 1);
                ifi.c(1, "bufferSize");
                r8j r8jVar2 = new r8j(25);
                AtomicReference atomicReference = new AtomicReference();
                vqaVarP = new xsa(new gta(new dta(atomicReference, r8jVar2), braVar, atomicReference, r8jVar2)).p(u2hVar.f);
                u2hVar.i.put(l2hVar, vqaVarP);
            }
        }
        h79 h79Var = new h79(this, 13, uidVar);
        r8j r8jVar3 = pdf.e;
        return new sra(new ora(new sra(vqaVarP, h79Var, r8jVar3, pdf.d), new ukd(13, uidVar), 5), r8jVar3, r8jVar3, new v64(this, 0, uidVar));
    }
}
