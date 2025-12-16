package defpackage;

import kotlinx.serialization.json.internal.b;

/* loaded from: classes.dex */
public final class ux7 implements zy7 {
    public static final ux7 a = new ux7();
    public static final tee b = r9j.a("kotlinx.serialization.json.JsonPrimitive", h9c.j, new ree[0]);

    @Override // defpackage.zy7
    public final void a(b bVar, Object obj) {
        tx7 tx7Var = (tx7) obj;
        ioi.a(bVar);
        if (tx7Var instanceof hx7) {
            bVar.p(ix7.a, hx7.INSTANCE);
        } else {
            bVar.p(ex7.a, (dx7) tx7Var);
        }
    }

    @Override // defpackage.zy7
    public final Object b(lh4 lh4Var) {
        sw7 sw7VarG = ioi.b(lh4Var).G();
        if (sw7VarG instanceof tx7) {
            return (tx7) sw7VarG;
        }
        throw koi.b("Unexpected JSON element, expected JsonPrimitive, had " + vid.a(sw7VarG.getClass()), sw7VarG.toString(), -1);
    }

    @Override // defpackage.zy7
    public final ree d() {
        return b;
    }
}
