package defpackage;

import android.text.Layout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class wde {
    public final ViewGroup a;
    public final Object b = ipi.b(3, new prd(11, this));

    public wde(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final int a() {
        return ((ude) this.b.getValue()).getMeasuredHeight();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final int b() {
        return ((ude) this.b.getValue()).getMeasuredWidth();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void c(int i, int i2) {
        cri.c((View) this.b.getValue(), i, i2, 0, 12);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void d(int i, int i2) {
        ((ude) this.b.getValue()).measure(i, i2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void e(Layout layout) {
        ?? r0 = this.b;
        if (layout == null) {
            if (r0.e()) {
                ((ude) r0.getValue()).setVisibility(8);
                return;
            }
            return;
        }
        ude udeVar = (ude) r0.getValue();
        udeVar.a = layout;
        TextPaint paint = layout.getPaint();
        if (paint != null) {
            paint.setColor(udeVar.b);
        }
        udeVar.requestLayout();
        udeVar.invalidate();
        if (udeVar.getParent() == null) {
            this.a.addView(udeVar, new ViewGroup.LayoutParams(-2, -2));
        }
        udeVar.setVisibility(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void f(int i) {
        TextPaint paint;
        ?? r0 = this.b;
        if (r0.e()) {
            ude udeVar = (ude) r0.getValue();
            udeVar.b = i;
            Layout layout = udeVar.a;
            if (layout != null && (paint = layout.getPaint()) != null) {
                paint.setColor(i);
            }
            udeVar.invalidate();
        }
    }
}
