package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class l3e implements eih {
    public final /* synthetic */ vhb a;
    public final /* synthetic */ Rect b;
    public final /* synthetic */ Rect c;
    public final /* synthetic */ Rect d;
    public final /* synthetic */ int e;

    public l3e(vhb vhbVar, Rect rect, Rect rect2, Rect rect3, int i) {
        this.a = vhbVar;
        this.b = rect;
        this.c = rect2;
        this.d = rect3;
        this.e = i;
    }

    @Override // defpackage.eih
    public final void a() {
    }

    @Override // defpackage.eih
    public final void b() {
        vhb vhbVar = this.a;
        View view = (View) vhbVar.c;
        RecyclerView recyclerView = view instanceof RecyclerView ? (RecyclerView) view : null;
        if (recyclerView != null) {
            y7j.c(5, recyclerView, new qyb(recyclerView, 1), null);
        }
        vhbVar.c = null;
    }

    @Override // defpackage.eih
    public final void c(Rect rect, View view) {
        i3 i3VarV;
        i6c callback;
        vhb vhbVar = this.a;
        View view2 = (View) vhbVar.b;
        if (((View) vhbVar.c) == null) {
            View viewW = vhb.w(view);
            if (viewW == null) {
                viewW = (View) view.getParent();
            }
            vhbVar.c = viewW;
            RecyclerView recyclerView = viewW instanceof RecyclerView ? (RecyclerView) viewW : null;
            if (recyclerView != null) {
                y7j.c(5, recyclerView, new qyb(recyclerView, 2), null);
            }
        }
        Rect rect2 = this.b;
        shh.d(rect2, view2);
        ViewParent parent = view2.getParent();
        o6c o6cVar = parent instanceof o6c ? (o6c) parent : null;
        int iC = (o6cVar == null || (callback = o6cVar.getCallback()) == null) ? rect2.top : callback.c();
        View view3 = (View) vhbVar.c;
        Rect rect3 = this.c;
        if (view3 != null) {
            shh.d(rect3, view3);
        }
        int i = rect3.top;
        int i2 = this.e;
        Rect rect4 = this.d;
        rect4.top = i + i2;
        rect4.bottom = iC - i2;
        rect4.left = rect3.left;
        rect4.right = rect3.right;
        if (rect4.contains(rect) || (i3VarV = vhb.v(view, view)) == null) {
            return;
        }
        i3VarV.k0(rect, rect4);
    }
}
