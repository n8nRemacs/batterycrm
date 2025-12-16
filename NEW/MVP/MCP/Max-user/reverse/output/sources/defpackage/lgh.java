package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public abstract class lgh extends a74 {
    public mgh a;
    public int b = 0;

    public lgh() {
    }

    @Override // defpackage.a74
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        y(coordinatorLayout, view, i);
        if (this.a == null) {
            this.a = new mgh(view);
        }
        mgh mghVar = this.a;
        View view2 = mghVar.a;
        mghVar.b = view2.getTop();
        mghVar.c = view2.getLeft();
        this.a.a();
        int i2 = this.b;
        if (i2 == 0) {
            return true;
        }
        this.a.b(i2);
        this.b = 0;
        return true;
    }

    public final int x() {
        mgh mghVar = this.a;
        if (mghVar != null) {
            return mghVar.d;
        }
        return 0;
    }

    public void y(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(view, i);
    }

    public boolean z(int i) {
        mgh mghVar = this.a;
        if (mghVar != null) {
            return mghVar.b(i);
        }
        this.b = i;
        return false;
    }

    public lgh(int i) {
    }
}
