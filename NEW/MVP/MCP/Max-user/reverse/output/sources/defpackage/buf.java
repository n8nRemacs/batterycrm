package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class buf extends dtf implements sm6 {
    public final /* synthetic */ duf X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public buf(duf dufVar, Continuation continuation) {
        super(2, continuation);
        this.X = dufVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((buf) l((um9) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        buf bufVar = new buf(this.X, continuation);
        bufVar.o = obj;
        return bufVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object next;
        g8j.b(obj);
        um9 um9Var = (um9) this.o;
        wvg wvgVar = um9Var.d;
        wvg wvgVar2 = wvg.c;
        if (wvgVar != wvgVar2) {
            return new m11(13, um9Var);
        }
        gu5 gu5Var = (gu5) ((rt5) this.X.a.getValue());
        if (!((Boolean) gu5Var.O.D(gu5Var, gu5.S[29])).booleanValue()) {
            return s8j.a(((w64) this.X.f.getValue()).a(um9Var));
        }
        zsf zsfVar = (zsf) this.X.g.getValue();
        zsfVar.getClass();
        lg8 lg8Var = lg8.d;
        String str = zsf.e;
        l6b l6bVar = wqi.a;
        if (l6bVar != null && l6bVar.b(lg8Var)) {
            l6bVar.c(lg8Var, str, "convertVideo: messageUpload = " + um9Var, null);
        }
        if (um9Var.d != wvgVar2) {
            return new m11(13, um9Var);
        }
        tgg tggVar = (tgg) zsfVar.b.getValue();
        String str2 = um9Var.a.c;
        tggVar.getClass();
        kvg kvgVar = kvg.g;
        kvgVar.getClass();
        yqb.c(kvgVar, "converting_started", 0, str2, 56);
        if (um9Var.e == null) {
            wo8 wo8VarA = um9Var.a();
            u10 u10Var = new u10(2);
            gsc gscVar = ((sxg) zsfVar.a.getValue()).o().a;
            List listE = ((u6b) zsfVar.d.getValue()).e(um9Var.b);
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
                    l6b l6bVar2 = wqi.a;
                    if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                        l6bVar2.c(lg8Var, str, "MessageUpload.autoQuality, result=" + gscVar4 + ", defQuality=" + gscVar + ", maxQuality=" + iscVar, null);
                    }
                    gscVar = gscVar4;
                }
            }
            u10Var.c = gscVar;
            wo8VarA.o = new p2h(u10Var);
            um9Var = new um9(wo8VarA);
        }
        p2h p2hVar = um9Var.e;
        u10 u10Var2 = new u10(2);
        u10Var2.c = p2hVar.a;
        u10Var2.a = p2hVar.b;
        u10Var2.b = p2hVar.c;
        u10Var2.d = p2hVar.d;
        p2h p2hVar2 = new p2h(u10Var2);
        xpb xpbVar = new xpb(15, false);
        xpbVar.b = um9Var.b;
        xpbVar.c = p2hVar2;
        l2h l2hVar = new l2h(xpbVar);
        quf qufVar = (quf) zsfVar.c.getValue();
        qufVar.getClass();
        return new n46(new uxb(new g56(gw0.f(new juf(qufVar, l2hVar, null)), new ysf(zsfVar, um9Var, null), 1), um9Var, 21), new z8e(zsfVar, um9Var, null, 5));
    }
}
