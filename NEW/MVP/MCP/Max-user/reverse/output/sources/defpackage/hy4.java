package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class hy4 implements eih {
    public final Rect a = new Rect();
    public final /* synthetic */ Rect b;
    public final /* synthetic */ View c;
    public final /* synthetic */ View d;
    public final /* synthetic */ Rect e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    public hy4(Rect rect, View view, View view2, Rect rect2, int i, int i2) {
        this.b = rect;
        this.c = view;
        this.d = view2;
        this.e = rect2;
        this.f = i;
        this.g = i2;
    }

    @Override // defpackage.eih
    public final void a() {
    }

    @Override // defpackage.eih
    public final void c(Rect rect, View view) {
        Rect rect2 = this.a;
        if (fni.a(rect2, rect)) {
            return;
        }
        rect2.set(rect);
        View view2 = this.c;
        int width = view2.getWidth();
        int height = view2.getHeight();
        Rect rect3 = this.b;
        rect3.set(0, 0, width, height);
        WeakHashMap weakHashMap = hfh.a;
        g4i g4iVarA = weh.a(view);
        co7 co7VarF = g4iVarA != null ? g4iVarA.a.f(7) : null;
        jy4 jy4VarE = g4iVarA != null ? g4iVarA.a.e() : null;
        int iMax = Math.max(co7VarF != null ? co7VarF.a : 0, jy4VarE != null ? jy4VarE.a() : 0);
        View view3 = this.d;
        Rect rect4 = this.e;
        view3.getWindowVisibleDisplayFrame(rect4);
        if (iMax != 0) {
            int i = -iMax;
            rect4.offset(i, 0);
            rect.offset(i, 0);
        }
        int i2 = this.f;
        rect4.inset(i2, i2);
        int i3 = (rect4.centerX() < rect.centerX() ? (char) 5 : (char) 3) | (rect4.centerY() < rect.centerY() ? 'P' : '0');
        if ((i3 & 5) == 5) {
            rect3.offsetTo(rect.right - rect3.width(), rect3.top);
        } else if ((i3 & 3) == 3) {
            rect3.offsetTo(rect.left, rect3.top);
        }
        int i4 = i3 & 80;
        int i5 = this.g;
        if (i4 == 80) {
            rect3.offsetTo(rect3.left, (rect.top - rect3.height()) - i5);
        } else if ((i3 & 48) == 48) {
            rect3.offsetTo(rect3.left, rect.bottom + i5);
        }
        if (!rect4.contains(rect3)) {
            int i6 = rect3.left;
            int i7 = rect4.left;
            if (i6 < i7) {
                rect3.offsetTo(i7, rect3.top);
            }
            int i8 = rect3.top;
            int i9 = rect4.top;
            if (i8 < i9) {
                rect3.offsetTo(rect3.left, i9);
            }
            int i10 = rect3.bottom;
            int i11 = rect4.bottom;
            if (i10 > i11) {
                rect3.offsetTo(rect3.left, i11 - rect3.height());
            }
            int i12 = rect3.right;
            int i13 = rect4.right;
            if (i12 > i13) {
                rect3.offsetTo(i13 - rect3.width(), rect3.top);
            }
        }
        view2.setX(rect3.left);
        view2.setY(rect3.top);
    }
}
