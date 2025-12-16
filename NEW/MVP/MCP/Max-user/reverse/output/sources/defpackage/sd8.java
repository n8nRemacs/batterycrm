package defpackage;

import android.content.ContentResolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class sd8 {
    public static final /* synthetic */ int h = 0;
    public final tw0 a;
    public final a84 b;
    public final de8 c;
    public final lzf d;
    public final ContextScope e;
    public final dce f;
    public Object g;

    public sd8(tw0 tw0Var, a84 a84Var, z7c z7cVar, de8 de8Var, lzf lzfVar, ContentResolver contentResolver, qx5 qx5Var) {
        this.a = tw0Var;
        this.b = a84Var;
        this.c = de8Var;
        this.d = lzfVar;
        q2b q2bVar = (q2b) lzfVar;
        ContextScope contextScopeA = d7j.a(q2bVar.a());
        this.e = contextScopeA;
        this.f = new dce(z7cVar.c, new h79(contentResolver, 22, qx5Var));
        this.g = id5.a;
        gw0.w(gw0.u(new g56(((bj7) de8Var).v0, new qd8(this, null), 1), q2bVar.a()), d7j.i(contextScopeA, a84Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.List] */
    public final List a(String str) {
        hd5 hd5Var = hd5.a;
        if (str != null) {
            if (str.equals("SELECTED_MEDIA_ALBUM")) {
                dce dceVar = this.f;
                dceVar.getClass();
                ArrayList arrayList = new ArrayList();
                Iterator it = dceVar.a.iterator();
                while (it.hasNext()) {
                    fce fceVar = (fce) it.next();
                    if (fceVar.f) {
                        arrayList.add(fceVar.a);
                    }
                }
                return arrayList;
            }
            vo6 vo6Var = (vo6) this.g.get(str);
            if (vo6Var != null) {
                ?? r4 = (List) ((bj7) this.c).z0.get(vo6Var.a);
                if (r4 != 0) {
                    hd5Var = r4;
                }
                ArrayList arrayList2 = new ArrayList(we3.q(hd5Var, 10));
                Iterator it2 = hd5Var.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(nqi.b((vd8) it2.next()));
                }
                return arrayList2;
            }
        }
        return hd5Var;
    }
}
