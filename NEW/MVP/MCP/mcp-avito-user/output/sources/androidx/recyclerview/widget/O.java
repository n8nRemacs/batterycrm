package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SimpleItemAnimator.java */
/* loaded from: classes10.dex */
public abstract class O extends RecyclerView.j {

    /* renamed from: g, reason: collision with root package name */
    public boolean f53727g = true;

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final boolean a(@j.N RecyclerView.C c12, @j.P RecyclerView.j.d dVar, @j.N RecyclerView.j.d dVar2) {
        int i12;
        int i13;
        return (dVar == null || ((i12 = dVar.f53833a) == (i13 = dVar2.f53833a) && dVar.f53834b == dVar2.f53834b)) ? o(c12) : q(c12, i12, dVar.f53834b, i13, dVar2.f53834b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final boolean b(@j.N RecyclerView.C c12, @j.N RecyclerView.C c13, @j.N RecyclerView.j.d dVar, @j.N RecyclerView.j.d dVar2) {
        int i12;
        int i13;
        int i14 = dVar.f53833a;
        int i15 = dVar.f53834b;
        if (c13.shouldIgnore()) {
            int i16 = dVar.f53833a;
            i13 = dVar.f53834b;
            i12 = i16;
        } else {
            i12 = dVar2.f53833a;
            i13 = dVar2.f53834b;
        }
        return p(c12, c13, i14, i15, i12, i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final boolean c(@j.N RecyclerView.C c12, @j.N RecyclerView.j.d dVar, @j.P RecyclerView.j.d dVar2) {
        int i12 = dVar.f53833a;
        int i13 = dVar.f53834b;
        View view = c12.itemView;
        int left = dVar2 == null ? view.getLeft() : dVar2.f53833a;
        int top = dVar2 == null ? view.getTop() : dVar2.f53834b;
        if (c12.isRemoved() || (i12 == left && i13 == top)) {
            return r(c12);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return q(c12, i12, i13, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final boolean d(@j.N RecyclerView.C c12, @j.N RecyclerView.j.d dVar, @j.N RecyclerView.j.d dVar2) {
        int i12 = dVar.f53833a;
        int i13 = dVar2.f53833a;
        if (i12 != i13 || dVar.f53834b != dVar2.f53834b) {
            return q(c12, i12, dVar.f53834b, i13, dVar2.f53834b);
        }
        h(c12);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final boolean f(@j.N RecyclerView.C c12) {
        return !this.f53727g || c12.isInvalid();
    }

    public abstract boolean o(RecyclerView.C c12);

    public abstract boolean p(RecyclerView.C c12, RecyclerView.C c13, int i12, int i13, int i14, int i15);

    public abstract boolean q(RecyclerView.C c12, int i12, int i13, int i14, int i15);

    public abstract boolean r(RecyclerView.C c12);
}
