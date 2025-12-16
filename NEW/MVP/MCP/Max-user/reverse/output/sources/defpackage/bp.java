package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;

/* loaded from: classes.dex */
public final class bp extends ca8 implements dp {
    public CharSequence M0;
    public yo N0;
    public final Rect O0;
    public int P0;
    public final /* synthetic */ ep Q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp(ep epVar, Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.Q0 = epVar;
        this.O0 = new Rect();
        this.y0 = epVar;
        this.I0 = true;
        this.J0.setFocusable(true);
        this.z0 = new zo(0, this);
    }

    @Override // defpackage.dp
    public final CharSequence f() {
        return this.M0;
    }

    @Override // defpackage.dp
    public final void h(CharSequence charSequence) {
        this.M0 = charSequence;
    }

    @Override // defpackage.dp
    public final void m(int i) {
        this.P0 = i;
    }

    @Override // defpackage.dp
    public final void n(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        oo ooVar = this.J0;
        boolean zIsShowing = ooVar.isShowing();
        s();
        this.J0.setInputMethodMode(2);
        g();
        q55 q55Var = this.c;
        q55Var.setChoiceMode(1);
        q55Var.setTextDirection(i);
        q55Var.setTextAlignment(i2);
        ep epVar = this.Q0;
        int selectedItemPosition = epVar.getSelectedItemPosition();
        q55 q55Var2 = this.c;
        if (ooVar.isShowing() && q55Var2 != null) {
            q55Var2.setListSelectionHidden(false);
            q55Var2.setSelection(selectedItemPosition);
            if (q55Var2.getChoiceMode() != 0) {
                q55Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = epVar.getViewTreeObserver()) == null) {
            return;
        }
        vo voVar = new vo(1, this);
        viewTreeObserver.addOnGlobalLayoutListener(voVar);
        this.J0.setOnDismissListener(new ap(this, voVar));
    }

    @Override // defpackage.ca8, defpackage.dp
    public final void p(ListAdapter listAdapter) {
        super.p(listAdapter);
        this.N0 = (yo) listAdapter;
    }

    public final void s() {
        int i;
        ep epVar = this.Q0;
        Rect rect = epVar.u0;
        oo ooVar = this.J0;
        Drawable background = ooVar.getBackground();
        if (background != null) {
            background.getPadding(rect);
            boolean z = whh.a;
            i = epVar.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = epVar.getPaddingLeft();
        int paddingRight = epVar.getPaddingRight();
        int width = epVar.getWidth();
        int i2 = epVar.t0;
        if (i2 == -2) {
            int iA = epVar.a(this.N0, ooVar.getBackground());
            int i3 = (epVar.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iA > i3) {
                iA = i3;
            }
            r(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i2);
        }
        boolean z2 = whh.a;
        this.X = epVar.getLayoutDirection() == 1 ? (((width - paddingRight) - this.o) - this.P0) + i : paddingLeft + this.P0 + i;
    }
}
