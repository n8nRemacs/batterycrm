package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.C23410a;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: RecyclerView.java */
/* loaded from: classes10.dex */
class L implements C23410a.InterfaceC1911a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f53683a;

    public L(RecyclerView recyclerView) {
        this.f53683a = recyclerView;
    }

    public final void a(C23410a.b bVar) {
        int i12 = bVar.f53977a;
        RecyclerView recyclerView = this.f53683a;
        if (i12 == 1) {
            recyclerView.f53787n.O0(bVar.f53978b, bVar.f53980d);
            return;
        }
        if (i12 == 2) {
            recyclerView.f53787n.R0(bVar.f53978b, bVar.f53980d);
        } else if (i12 == 4) {
            recyclerView.f53787n.T0(recyclerView, bVar.f53978b, bVar.f53980d);
        } else {
            if (i12 != 8) {
                return;
            }
            recyclerView.f53787n.Q0(bVar.f53978b, bVar.f53980d);
        }
    }

    public final RecyclerView.C b(int i12) {
        RecyclerView recyclerView = this.f53683a;
        RecyclerView.C cQ2 = recyclerView.Q(i12, true);
        if (cQ2 == null) {
            return null;
        }
        C23416g c23416g = recyclerView.f53771f;
        if (c23416g.f54012c.contains(cQ2.itemView)) {
            return null;
        }
        return cQ2;
    }

    public final void c(int i12, int i13, Object obj) {
        int i14;
        int i15;
        RecyclerView recyclerView = this.f53683a;
        int childCount = recyclerView.f53771f.f54010a.f53682a.getChildCount();
        int i16 = i13 + i12;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = recyclerView.f53771f.f54010a.f53682a.getChildAt(i17);
            RecyclerView.C cX2 = RecyclerView.X(childAt);
            if (cX2 != null && !cX2.shouldIgnore() && (i15 = cX2.mPosition) >= i12 && i15 < i16) {
                cX2.addFlags(2);
                cX2.addChangePayload(obj);
                ((RecyclerView.n) childAt.getLayoutParams()).f53860d = true;
            }
        }
        RecyclerView.u uVar = recyclerView.f53765c;
        ArrayList<RecyclerView.C> arrayList = uVar.f53870c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RecyclerView.C c12 = arrayList.get(size);
            if (c12 != null && (i14 = c12.mPosition) >= i12 && i14 < i16) {
                c12.addFlags(2);
                uVar.f(size);
            }
        }
        recyclerView.f53786m0 = true;
    }

    public final void d(int i12, int i13) {
        RecyclerView recyclerView = this.f53683a;
        int childCount = recyclerView.f53771f.f54010a.f53682a.getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            RecyclerView.C cX2 = RecyclerView.X(recyclerView.f53771f.f54010a.f53682a.getChildAt(i14));
            if (cX2 != null && !cX2.shouldIgnore() && cX2.mPosition >= i12) {
                cX2.offsetPosition(i13, false);
                recyclerView.f53778i0.f53896f = true;
            }
        }
        ArrayList<RecyclerView.C> arrayList = recyclerView.f53765c.f53870c;
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            RecyclerView.C c12 = arrayList.get(i15);
            if (c12 != null && c12.mPosition >= i12) {
                c12.offsetPosition(i13, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f53784l0 = true;
    }

    public final void e(int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i22;
        RecyclerView recyclerView = this.f53683a;
        int childCount = recyclerView.f53771f.f54010a.f53682a.getChildCount();
        int i23 = -1;
        if (i12 < i13) {
            i15 = i12;
            i14 = i13;
            i16 = -1;
        } else {
            i14 = i12;
            i15 = i13;
            i16 = 1;
        }
        for (int i24 = 0; i24 < childCount; i24++) {
            RecyclerView.C cX2 = RecyclerView.X(recyclerView.f53771f.f54010a.f53682a.getChildAt(i24));
            if (cX2 != null && (i22 = cX2.mPosition) >= i15 && i22 <= i14) {
                if (i22 == i12) {
                    cX2.offsetPosition(i13 - i12, false);
                } else {
                    cX2.offsetPosition(i16, false);
                }
                recyclerView.f53778i0.f53896f = true;
            }
        }
        RecyclerView.u uVar = recyclerView.f53765c;
        uVar.getClass();
        if (i12 < i13) {
            i18 = i12;
            i17 = i13;
        } else {
            i17 = i12;
            i18 = i13;
            i23 = 1;
        }
        ArrayList<RecyclerView.C> arrayList = uVar.f53870c;
        int size = arrayList.size();
        for (int i25 = 0; i25 < size; i25++) {
            RecyclerView.C c12 = arrayList.get(i25);
            if (c12 != null && (i19 = c12.mPosition) >= i18 && i19 <= i17) {
                if (i19 == i12) {
                    c12.offsetPosition(i13 - i12, false);
                } else {
                    c12.offsetPosition(i23, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f53784l0 = true;
    }

    public final void f(int i12, int i13) {
        RecyclerView recyclerView = this.f53683a;
        recyclerView.g0(i12, i13, true);
        recyclerView.f53784l0 = true;
        recyclerView.f53778i0.f53893c += i13;
    }
}
