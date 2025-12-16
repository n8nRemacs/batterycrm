package defpackage;

import android.content.Context;
import android.graphics.drawable.Animatable;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes2.dex */
public final class xea extends OneMeDraweeView implements u6g {
    public boolean C0;
    public final Object D0;

    public xea(Context context) {
        super(context);
        this.C0 = true;
        this.D0 = ipi.b(3, new fr7(20, this));
        setClipToOutline(true);
        hr6 hr6Var = new hr6(getResources());
        hr6Var.d = getShimmerDrawable();
        hr6Var.p = vtd.a();
        setHierarchy(hr6Var.a());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final wea getShimmerDrawable() {
        return (wea) this.D0.getValue();
    }

    public static bwe k(yeb yebVar) {
        ulc ulcVar = new ulc(4);
        bwe bweVar = (bwe) ulcVar.b;
        bweVar.j = false;
        ulcVar.q(yebVar.b().m);
        bweVar.d = yebVar.b().l;
        ulcVar.p(1.0f);
        ulcVar.s(kti.d(64 * vw4.d().getDisplayMetrics().density));
        return ulcVar.k();
    }

    @Override // one.me.sdk.uikit.common.views.OneMeDraweeView
    public final void j(pe7 pe7Var, Animatable animatable) {
        this.C0 = false;
        getShimmerDrawable().d();
        setClickable(!this.C0);
    }

    @Override // defpackage.o45, android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setClickable(!this.C0);
        if (this.C0) {
            return;
        }
        getShimmerDrawable().c();
    }

    @Override // defpackage.o45, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.C0) {
            return;
        }
        getShimmerDrawable().d();
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        getShimmerDrawable().b(k(yebVar));
    }
}
