package defpackage;

import kotlinx.serialization.json.internal.b;

/* loaded from: classes.dex */
public final class ex7 implements zy7 {
    public static final ex7 a = new ex7();
    public static final j9c b;

    static {
        h9c h9cVar = h9c.j;
        if (vmf.F("kotlinx.serialization.json.JsonLiteral")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        Object it = ((pn8) k9c.a.values()).iterator();
        while (((mn8) it).hasNext()) {
            zy7 zy7Var = (zy7) ((kn8) it).next();
            if ("kotlinx.serialization.json.JsonLiteral".equals(zy7Var.d().a())) {
                throw new IllegalArgumentException(wmf.d("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name kotlinx.serialization.json.JsonLiteral there already exists " + vid.a(zy7Var.getClass()).b() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
        b = new j9c("kotlinx.serialization.json.JsonLiteral", h9cVar);
    }

    @Override // defpackage.zy7
    public final void a(b bVar, Object obj) {
        dx7 dx7Var = (dx7) obj;
        String str = dx7Var.b;
        ioi.a(bVar);
        if (dx7Var.a) {
            bVar.r(str);
            return;
        }
        Long lI = cnf.i(str);
        if (lI != null) {
            bVar.l(lI.longValue());
            return;
        }
        ppg ppgVarD = lni.d(str);
        if (ppgVarD != null) {
            bVar.i(tpg.b).l(ppgVarD.a);
            return;
        }
        Double dF = bnf.f(str);
        if (dF != null) {
            bVar.f(dF.doubleValue());
            return;
        }
        Boolean boolB0 = vmf.b0(str);
        if (boolB0 != null) {
            bVar.b(boolB0.booleanValue());
        } else {
            bVar.r(str);
        }
    }

    @Override // defpackage.zy7
    public final Object b(lh4 lh4Var) {
        sw7 sw7VarG = ioi.b(lh4Var).G();
        if (sw7VarG instanceof dx7) {
            return (dx7) sw7VarG;
        }
        throw koi.b("Unexpected JSON element, expected JsonLiteral, had " + vid.a(sw7VarG.getClass()), sw7VarG.toString(), -1);
    }

    @Override // defpackage.zy7
    public final ree d() {
        return b;
    }
}
