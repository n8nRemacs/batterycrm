package defpackage;

import android.R;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class w73 extends vhd implements u6g {
    public final cm6 a;
    public final em6 b;
    public final em6 c;
    public final em6 d;
    public Drawable o;
    public final Rect X = new Rect();
    public final Rect Y = new Rect();
    public final int[] Z = {R.attr.state_checked};
    public final int[] s0 = {-16842912};

    public w73(cm6 cm6Var, em6 em6Var, em6 em6Var2, em6 em6Var3) {
        this.a = cm6Var;
        this.b = em6Var;
        this.c = em6Var2;
        this.d = em6Var3;
        this.o = (Drawable) cm6Var.invoke();
    }

    @Override // defpackage.vhd
    public final void f(Rect rect, View view, RecyclerView recyclerView, iid iidVar) {
        if (((Boolean) this.c.invoke(Integer.valueOf(RecyclerView.R(view)))).booleanValue()) {
            rect.left = u45.c(36, vw4.d().getDisplayMetrics().density, rect.left);
        }
    }

    @Override // defpackage.vhd
    public final void g(Canvas canvas, RecyclerView recyclerView, iid iidVar) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((Boolean) this.c.invoke(Integer.valueOf(i))).booleanValue()) {
                Drawable background = recyclerView.getChildAt(i).getBackground();
                RippleDrawable rippleDrawable = background instanceof RippleDrawable ? (RippleDrawable) background : null;
                if (rippleDrawable != null) {
                    q9j.c(rippleDrawable, kti.d((-36) * vw4.d().getDisplayMetrics().density), 0, 0, 14);
                }
            }
        }
    }

    @Override // defpackage.vhd
    public final void h(Canvas canvas, RecyclerView recyclerView) {
        int iD = kti.d(12 * vw4.d().getDisplayMetrics().density);
        int iD2 = kti.d(24 * vw4.d().getDisplayMetrics().density) / 2;
        canvas.save();
        Rect rect = this.X;
        recyclerView.getDrawingRect(rect);
        canvas.clipRect(rect);
        int i = 0;
        while (true) {
            if (!(i < recyclerView.getChildCount())) {
                canvas.restore();
                return;
            }
            int i2 = i + 1;
            View childAt = recyclerView.getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            int iR = RecyclerView.R(childAt);
            if (((Boolean) this.d.invoke(Integer.valueOf(iR))).booleanValue()) {
                RecyclerView.V(rect, childAt);
                Rect rect2 = this.Y;
                childAt.getDrawingRect(rect2);
                int iHeight = (rect.height() - rect2.height()) / 2;
                this.o.setAlpha(kti.d(childAt.getAlpha() * 255));
                if (((Boolean) this.b.invoke(Integer.valueOf(iR))).booleanValue()) {
                    Drawable drawable = this.o;
                    drawable.setState(this.Z);
                    drawable.setBounds(rect.left + iD, (rect.centerY() - iD2) + iHeight, (iD2 * 2) + rect.left + iD, rect.centerY() + iD2 + iHeight);
                    drawable.draw(canvas);
                } else {
                    Drawable drawable2 = this.o;
                    drawable2.setState(this.s0);
                    drawable2.setBounds(rect.left + iD, (rect.centerY() - iD2) + iHeight, (iD2 * 2) + rect.left + iD, rect.centerY() + iD2 + iHeight);
                    drawable2.draw(canvas);
                }
            }
            i = i2;
        }
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        this.o = (Drawable) this.a.invoke();
    }
}
