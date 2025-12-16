package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import one.me.folders.list.FoldersListScreen;

/* loaded from: classes2.dex */
public final class vs7 extends at7 {
    public final FoldersListScreen X;

    public vs7(FoldersListScreen foldersListScreen) {
        super(3, 0);
        this.X = foldersListScreen;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.at7
    public final void a(RecyclerView recyclerView, mid midVar) {
        super.a(recyclerView, midVar);
        if (midVar instanceof ct7) {
            hxg hxgVar = (hxg) ((ct7) midVar);
            ((gxg) hxgVar.a).animate().translationZ(0.0f);
            t9f t9fVar = hxgVar.E0;
            if (t9fVar != null) {
                oc6 oc6VarY0 = ((FoldersListScreen) t9fVar.b).y0();
                int iF = hxgVar.f() - 1;
                String str = oc6VarY0.v0;
                if (str == null || str.length() == 0) {
                    return;
                }
                svi.e(oc6VarY0.a, ((q2b) oc6VarY0.c).c().getImmediate(), null, new mc6(oc6VarY0, str, iF, null), 2);
                oc6VarY0.v0 = null;
            }
        }
    }

    @Override // defpackage.at7
    public final boolean i(mid midVar, mid midVar2) {
        int iG = midVar.g();
        int iG2 = midVar2.g();
        dc6 dc6Var = this.X.o;
        boolean z = ((fxg) ((t98) dc6Var.C(iG2))).b == exg.b;
        boolean z2 = iG2 <= 0 || iG2 >= dc6Var.j();
        if (!z || z2) {
            return true;
        }
        ArrayList arrayList = new ArrayList(dc6Var.d.f);
        Object obj = arrayList.get(iG);
        arrayList.remove(iG);
        arrayList.add(iG2, obj);
        dc6Var.F(arrayList, new mn1(dc6Var, iG, iG2, arrayList));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.at7
    public final void j(mid midVar, int i) {
        if (i == 0 || !(midVar instanceof ct7)) {
            return;
        }
        ((gxg) ((hxg) ((ct7) midVar)).a).animate().translationZ(vw4.d().getDisplayMetrics().density * 20.0f);
    }
}
