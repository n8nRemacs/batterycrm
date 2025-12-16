package defpackage;

import java.util.Iterator;
import kotlinx.serialization.json.internal.b;

/* loaded from: classes.dex */
public abstract class se3 extends k0 {
    public final zy7 a;

    public se3(zy7 zy7Var) {
        this.a = zy7Var;
    }

    @Override // defpackage.zy7
    public void a(b bVar, Object obj) {
        int iH = h(obj);
        b bVarA = bVar.a(d());
        Iterator itG = g(obj);
        for (int i = 0; i < iH; i++) {
            bVarA.o(d(), i, this.a, itG.next());
        }
        bVarA.t();
    }

    @Override // defpackage.k0
    public void j(yl3 yl3Var, int i, Object obj) {
        m(obj, i, yl3Var.p(d(), i, this.a, null));
    }

    public abstract void m(Object obj, int i, Object obj2);
}
