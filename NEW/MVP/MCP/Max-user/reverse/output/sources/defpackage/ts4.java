package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class ts4 extends h54 {
    public static final /* synthetic */ int Y = 0;
    public u02 X;
    public final long d = 1000;
    public final Handler o = new Handler(Looper.getMainLooper());

    @Override // defpackage.h54
    public final void a() throws Throwable {
        u02 u02Var = this.X;
        if (u02Var != null) {
            this.o.removeCallbacks(u02Var);
        }
        u02 u02Var2 = this.X;
        if (u02Var2 != null) {
            u02Var2.run();
        }
        this.X = null;
    }

    @Override // defpackage.h54
    public final void f(h54 h54Var, c54 c54Var) {
        u02 u02Var = this.X;
        if (u02Var != null) {
            this.o.removeCallbacks(u02Var);
        }
        this.X = null;
    }

    @Override // defpackage.h54
    public final void g(ViewGroup viewGroup, View view, View view2, boolean z, f54 f54Var) {
        u02 u02Var = this.X;
        Handler handler = this.o;
        if (u02Var != null) {
            handler.removeCallbacks(u02Var);
        }
        u02 u02Var2 = new u02(view, z, this, viewGroup, view2, f54Var);
        handler.postDelayed(u02Var2, this.d);
        this.X = u02Var2;
    }
}
