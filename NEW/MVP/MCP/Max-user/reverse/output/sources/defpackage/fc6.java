package defpackage;

import android.view.View;
import java.util.Collection;
import one.me.folders.list.FoldersListScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class fc6 extends hn6 implements um6 {
    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Collection collectionA;
        fxg fxgVar = (fxg) obj2;
        ((Number) obj3).intValue();
        FoldersListScreen foldersListScreen = (FoldersListScreen) this.receiver;
        yy7[] yy7VarArr = FoldersListScreen.Y;
        foldersListScreen.y0().w0 = fxgVar;
        y34 y34VarB = h6j.a(1).B((View) obj);
        foldersListScreen.y0().getClass();
        f86 f86Var = fxgVar.a;
        if (f86Var == null) {
            collectionA = hd5.a;
        } else {
            o98 o98VarD = ve3.d();
            o98VarD.add(new b44(d5b.j, new n5g(f5b.m), Integer.valueOf(y9b.h), (Integer) null, 20));
            if (!f86Var.s0.contains(ra6.c)) {
                int i = d5b.k;
                n5g n5gVar = new n5g(f5b.n);
                int i2 = yud.x;
                o98VarD.add(new b44(i, n5gVar, Integer.valueOf(w9b.V), Integer.valueOf(i2), Integer.valueOf(w9b.Q)));
            }
            collectionA = ve3.a(o98VarD);
        }
        y34VarB.o(collectionA).f().build().u(foldersListScreen);
        return qqg.a;
    }
}
