package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.ExecutorService;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* loaded from: classes2.dex */
public final class y9d {
    public final RecyclerView a;
    public final ds9 b;
    public final yad c;
    public final vu9 d;
    public final ExecutorService e;
    public had f;
    public final Rect g = new Rect();
    public final rf5 h = new rf5(4, this);

    public y9d(EndlessRecyclerView2 endlessRecyclerView2, ds9 ds9Var, yad yadVar, vu9 vu9Var, p6a p6aVar, ExecutorService executorService) {
        this.a = endlessRecyclerView2;
        this.b = ds9Var;
        this.c = yadVar;
        this.d = vu9Var;
        this.e = executorService;
    }

    public final void a() {
        had hadVar = this.f;
        if (hadVar != null) {
            hadVar.dismiss();
            AnimatorSet animatorSet = hadVar.Z;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            hadVar.Z = null;
            ValueAnimator valueAnimator = hadVar.Y;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            hadVar.Y = null;
            hadVar.c = null;
            hadVar.o = null;
            hadVar.d = null;
            hadVar.s0 = null;
        }
        this.f = null;
        this.a.s0(this.h);
    }
}
