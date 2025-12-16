package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.b;

/* loaded from: classes.dex */
public final class iw7 implements zy7 {
    public static final iw7 a = new iw7();
    public static final hw7 b = hw7.b;

    @Override // defpackage.zy7
    public final void a(b bVar, Object obj) {
        gw7 gw7Var = (gw7) obj;
        ioi.a(bVar);
        vw7 vw7Var = vw7.a;
        ms msVar = new ms(vw7Var.d());
        int size = gw7Var.size();
        b bVarA = bVar.a(msVar);
        Iterator<sw7> it = gw7Var.iterator();
        for (int i = 0; i < size; i++) {
            bVarA.o(msVar, i, vw7Var, it.next());
        }
        bVarA.t();
    }

    @Override // defpackage.zy7
    public final Object b(lh4 lh4Var) {
        ioi.b(lh4Var);
        return new gw7((List) new os(vw7.a).i(lh4Var));
    }

    @Override // defpackage.zy7
    public final ree d() {
        return b;
    }
}
