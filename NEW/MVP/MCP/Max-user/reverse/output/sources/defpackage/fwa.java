package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class fwa extends FrameLayout implements u6g {
    public static final /* synthetic */ yy7[] c;
    public final nk a;
    public final TextView b;

    static {
        z8a z8aVar = new z8a(fwa.class, "appearance", "getAppearance()Lone/me/pinbars/unknowncontact/OneMeActionButton$Appearance;");
        vid.a.getClass();
        c = new yy7[]{z8aVar};
    }

    public fwa(Context context) {
        super(context, null);
        this.a = new nk(this);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        dpg.z.b(textView, t75.b);
        textView.setGravity(17);
        this.b = textView;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        float f = 40;
        setMinimumHeight(kti.d(vw4.d().getDisplayMetrics().density * f));
        setMinimumWidth(kti.d(f * vw4.d().getDisplayMetrics().density));
        setClipToOutline(true);
        setOutlineProvider(new u74(vw4.d().getDisplayMetrics().density * 12.0f));
        float f2 = 16;
        float f3 = 10;
        setPadding(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f2 * vw4.d().getDisplayMetrics().density), kti.d(f3 * vw4.d().getDisplayMetrics().density));
        addView(textView);
        onThemeChanged(a93.s0.y(this));
    }

    private final RippleDrawable getBackgroundDrawable() {
        int i = a93.s0.y(this).c().a.a.i;
        return new RippleDrawable(ColorStateList.valueOf(i), null, new ColorDrawable(-1));
    }

    public final ewa getAppearance() {
        yy7 yy7Var = c[0];
        return (ewa) this.a.b;
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        int i;
        int iOrdinal = getAppearance().ordinal();
        if (iOrdinal == 0) {
            i = isEnabled() ? yebVar.getText().j : yebVar.c().c.b.g;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i = isEnabled() ? yebVar.getText().b : yebVar.c().c.b.c;
        }
        this.b.setTextColor(i);
        setBackground(getBackgroundDrawable());
        invalidate();
    }

    public final void setAppearance(ewa ewaVar) {
        this.a.O(this, c[0], ewaVar);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        onThemeChanged(a93.s0.y(this));
    }

    public final void setText(int i) {
        this.b.setText(i);
    }
}
