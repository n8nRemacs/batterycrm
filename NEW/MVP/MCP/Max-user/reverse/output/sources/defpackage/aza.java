package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* loaded from: classes2.dex */
public final class aza extends LinearLayout implements u6g {
    public static final v17 c;
    public static final /* synthetic */ yy7[] d;
    public final nk a;
    public final int b;

    static {
        z8a z8aVar = new z8a(aza.class, "isBlurEnabled", "isBlurEnabled()Ljava/lang/Boolean;");
        vid.a.getClass();
        d = new yy7[]{z8aVar};
        c = new v17(26, (byte) 0);
    }

    public aza(Context context) {
        super(context, null);
        this.a = new nk(19, this);
        int iD = kti.d(4 * vw4.d().getDisplayMetrics().density);
        this.b = iD;
        setOrientation(0);
        setElevation(16.0f * vw4.d().getDisplayMetrics().density);
        setClickable(true);
        setPadding(iD, getPaddingTop(), iD, getPaddingBottom());
    }

    public final void a(yeb yebVar, Boolean bool) {
        Context context = getContext();
        int i = yebVar.b().b.c.a;
        Boolean bool2 = Boolean.TRUE;
        Drawable drawableA = mvi.a(context, i, 2.0f, fni.a(bool, bool2));
        if (!fni.a(bool, bool2)) {
            drawableA.setAlpha(255);
        }
        setBackground(drawableA);
    }

    public final int getSelectedItemId() {
        f2 f2Var = new f2(9, this);
        while (true) {
            if (!f2Var.hasNext()) {
                break;
            }
            View view = (View) f2Var.next();
            if (view.isSelected()) {
                Object objC = rqi.c(view, o0d.tag_tab_item);
                zya zyaVar = objC instanceof zya ? (zya) objC : null;
                if (zyaVar != null) {
                    return zyaVar.c;
                }
            }
        }
        return -1;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        co7 co7VarF = g4i.h(this, getRootWindowInsets()).a.f(2);
        int i3 = 0;
        while (true) {
            if (!(i3 < getChildCount())) {
                c.getClass();
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getPaddingTop() + getPaddingBottom() + v17.b(this), 1073741824));
                return;
            }
            int i4 = i3 + 1;
            View childAt = getChildAt(i3);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            float f = 10;
            layoutParams2.topMargin = kti.d(vw4.d().getDisplayMetrics().density * f);
            if (co7VarF.d <= 0) {
                f = 12;
            }
            layoutParams2.bottomMargin = kti.d(f * vw4.d().getDisplayMetrics().density);
            childAt.setLayoutParams(layoutParams2);
            i3 = i4;
        }
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        yy7 yy7Var = d[0];
        a(yebVar, (Boolean) this.a.b);
        int i = 0;
        while (true) {
            if (!(i < getChildCount())) {
                return;
            }
            int i2 = i + 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            ((ks0) childAt).v();
            i = i2;
        }
    }

    public final void setBlurEnabled(Boolean bool) {
        this.a.O(this, d[0], bool);
    }
}
