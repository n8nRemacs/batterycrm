package defpackage;

import android.graphics.drawable.Drawable;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* loaded from: classes2.dex */
public final class s26 implements Drawable.Callback {
    public final gq5 a;
    public final qz5 b;
    public final /* synthetic */ t26 c;

    public s26(t26 t26Var) {
        this.c = t26Var;
        this.a = new gq5(1, t26Var);
        this.b = new qz5(t26Var, 4, this);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        t26 t26Var = this.c;
        EndlessRecyclerView2 endlessRecyclerView2 = t26Var.s0;
        qz5 qz5Var = this.b;
        if (endlessRecyclerView2 != null) {
            endlessRecyclerView2.removeCallbacks(qz5Var);
        }
        EndlessRecyclerView2 endlessRecyclerView22 = t26Var.s0;
        if (endlessRecyclerView22 != null) {
            endlessRecyclerView22.post(qz5Var);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        t26 t26Var = this.c;
        EndlessRecyclerView2 endlessRecyclerView2 = t26Var.s0;
        qz5 qz5Var = this.b;
        if (endlessRecyclerView2 != null) {
            endlessRecyclerView2.removeCallbacks(qz5Var);
        }
        EndlessRecyclerView2 endlessRecyclerView22 = t26Var.s0;
        if (endlessRecyclerView22 != null) {
            endlessRecyclerView22.postDelayed(qz5Var, j - System.currentTimeMillis());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        EndlessRecyclerView2 endlessRecyclerView2 = this.c.s0;
        if (endlessRecyclerView2 != null) {
            endlessRecyclerView2.removeCallbacks(this.b);
        }
    }
}
