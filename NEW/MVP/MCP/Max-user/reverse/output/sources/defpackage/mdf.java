package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public class mdf {
    public final View a;
    public final eo7 b;
    public final em6 c;
    public final int d = 7;
    public g4i e;
    public int f;
    public boolean g;
    public final Rect h;
    public final Rect i;

    public mdf(View view, eo7 eo7Var, em6 em6Var) {
        this.a = view;
        this.b = eo7Var;
        this.c = em6Var;
        u4e u4eVar = new u4e(13, this);
        this.h = new Rect(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        this.i = marginLayoutParams != null ? new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin) : new Rect(0, 0, 0, 0);
        WeakHashMap weakHashMap = hfh.a;
        veh.u(view, u4eVar);
        if (view.isAttachedToWindow()) {
            teh.c(view);
            fo7.a.a(this);
        }
        view.addOnAttachStateChangeListener(new r40(15, this));
    }

    public final void a(co7 co7Var, ms0 ms0Var) {
        int iMax = Math.max(co7Var.d, this.f);
        int iV = az1.v(ms0Var.a);
        if (iV != 0) {
            View view = this.a;
            if (iV == 1) {
                view.setTranslationY(-iMax);
                return;
            }
            if (iV == 2) {
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), this.h.bottom + iMax);
                return;
            }
            if (iV == 3) {
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), iMax);
                return;
            }
            if (iV != 4) {
                throw new NoWhenBranchMatchedException();
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = this.i.bottom + iMax;
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public void b(g4i g4iVar, ms0 ms0Var) {
        a(g4iVar.a.f(this.d), ms0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(defpackage.g4i r18) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mdf.c(g4i):void");
    }

    public g4i d(g4i g4iVar) {
        return g4iVar;
    }

    public void e() {
        this.g = false;
    }
}
