package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import kotlin.coroutines.Continuation;
import one.me.rlottie.RLottieDrawable;

/* loaded from: classes2.dex */
public final class ja5 extends d2f implements hb5 {
    public static final /* synthetic */ int G0 = 0;
    public ob5 E0;
    public final qi F0;

    public ja5(Context context, x6i x6iVar) {
        ImageView imageView = new ImageView(context);
        super(imageView);
        this.F0 = new qi(1, this);
        int iD = kti.d(32 * vw4.d().getDisplayMetrics().density);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(iD, iD));
        u45.n(2, vw4.d().getDisplayMetrics().density, imageView);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setOnClickListener(new ub(this, 27, x6iVar));
        tqi.c(new er(this, (Continuation) null, 6), imageView);
        imageView.addOnAttachStateChangeListener(new rk(4, this));
    }

    public final void F(boolean z) {
        Drawable drawable = ((ImageView) this.a).getDrawable();
        ok okVar = drawable instanceof ok ? (ok) drawable : null;
        if (okVar != null) {
            RLottieDrawable rLottieDrawable = okVar.x0;
            qi qiVar = this.F0;
            if (rLottieDrawable != null) {
                rLottieDrawable.removeParentView(qiVar);
            }
            okVar.z0.remove(qiVar);
            RLottieDrawable rLottieDrawable2 = okVar.x0;
            if (rLottieDrawable2 == null || !rLottieDrawable2.hasParentViews() || z) {
                okVar.stop();
            }
        }
    }

    @Override // defpackage.hb5
    public final void c() {
        Drawable drawable;
        ob5 ob5Var = this.E0;
        if (ob5Var == null || (drawable = ob5Var.o) == null) {
            return;
        }
        ((ImageView) this.a).invalidateDrawable(drawable);
    }

    @Override // defpackage.d2f
    public final void z(t98 t98Var) {
        if (t98Var instanceof ob5) {
            ob5 ob5Var = (ob5) t98Var;
            this.E0 = ob5Var;
            if (ob5Var.X == 0) {
                F(true);
            }
            View view = this.a;
            ((ImageView) view).setImageDrawable(ob5Var.o);
            Drawable drawable = ((ImageView) view).getDrawable();
            ok okVar = drawable instanceof ok ? (ok) drawable : null;
            if (okVar != null) {
                okVar.c(this.F0);
                okVar.start();
            }
        }
    }
}
