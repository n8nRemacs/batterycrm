package defpackage;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public final class t7d extends FrameLayout implements u6g {
    public static final /* synthetic */ yy7[] o;
    public final Object a;
    public final ColorMatrixColorFilter b;
    public final u74 c;
    public final nk d;

    static {
        z8a z8aVar = new z8a(t7d.class, "size", "getSize()Lone/me/calls/ui/bottomsheet/ratecall/view/RateCallButton$Size;");
        vid.a.getClass();
        o = new yy7[]{z8aVar};
    }

    public t7d(Context context) {
        super(context, null);
        this.a = ipi.b(3, new p1b(context, 22));
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        this.b = new ColorMatrixColorFilter(colorMatrix);
        u74 u74Var = new u74(kti.d(32 * vw4.d().getDisplayMetrics().density));
        this.c = u74Var;
        this.d = new nk(this);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        setClipToOutline(true);
        setOutlineProvider(u74Var);
        setBackgroundColor(a93.s0.y(this).b().a.h);
        setClickable(true);
        addView(getImageView());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final ImageView getImageView() {
        return (ImageView) this.a.getValue();
    }

    public final void a() {
        invalidate();
        requestLayout();
    }

    public final s7d getSize() {
        yy7 yy7Var = o[0];
        return (s7d) this.d.b;
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        setBackgroundColor(yebVar.b().a.h);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        getImageView().setColorFilter(z ? null : this.b);
    }

    public final void setImage(Integer num) {
        if (num != null) {
            getImageView().setImageResource(num.intValue());
            a();
        }
    }

    public final void setSize(s7d s7dVar) {
        this.d.O(this, o[0], s7dVar);
    }
}
