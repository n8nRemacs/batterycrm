package defpackage;

import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class uk9 extends n2 implements zk9 {
    public tk9 X;
    public sm6 d;
    public sm6 o;

    public uk9() {
        super(new wm7(19));
    }

    @Override // defpackage.n2
    public final void c0(View view) {
        f8j.d((yk9) view, 300L, new ye6(18, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    @Override // defpackage.zk9
    public final void d(yt0 yt0Var) {
        ?? r0 = this.c;
        if (r0.e()) {
            ((yk9) r0.getValue()).a(yt0Var);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k18] */
    @Override // defpackage.zk9
    public final void m() {
        this.X = null;
        ?? r0 = this.c;
        if (r0.e()) {
            ((yk9) r0.getValue()).setVisibility(8);
        }
    }

    @Override // defpackage.zk9
    public final void setForwardClickListener(sm6 sm6Var) {
        this.o = sm6Var;
    }

    @Override // defpackage.zk9
    public final void setLink(tk9 tk9Var) {
        Layout layout = tk9Var.c;
        lk9 lk9Var = tk9Var.e;
        qk9 qk9Var = tk9Var.d;
        this.X = tk9Var;
        ViewGroup viewGroup = (ViewGroup) this.b;
        if (viewGroup == null) {
            viewGroup = null;
        }
        if (!viewGroup.isLaidOut() || viewGroup.isLayoutRequested()) {
            viewGroup.addOnLayoutChangeListener(new es0(6, this));
        } else {
            ViewGroup viewGroup2 = (ViewGroup) this.b;
            if (viewGroup2 == null) {
                viewGroup2 = null;
            }
            int iQ = u45.q(10, vw4.d().getDisplayMetrics().density, viewGroup2.getMeasuredWidth()) - N();
            if (iQ < 0) {
                iQ = 0;
            }
            ViewGroup viewGroup3 = (ViewGroup) this.b;
            jfi.b(iQ, T(), viewGroup3 != null ? viewGroup3 : null);
        }
        ((yk9) T()).setIsFloating(tk9Var.f);
        boolean z = qk9Var != null;
        boolean z2 = lk9Var != null;
        if (z2 && !z) {
            ((yk9) T()).setSingleForward(lk9Var);
        } else if (z2 && (qk9Var instanceof ok9)) {
            ((yk9) T()).k(lk9Var.a(), ((ok9) qk9Var).a);
        } else if (qk9Var instanceof ok9) {
            yk9 yk9Var = (yk9) T();
            if (layout == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            yk9Var.l(layout, ((ok9) qk9Var).a);
        } else if (z2 && (qk9Var instanceof nk9)) {
            ((yk9) T()).i((nk9) qk9Var, lk9Var.a());
        } else if (qk9Var instanceof nk9) {
            yk9 yk9Var2 = (yk9) T();
            if (layout == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            yk9Var2.j((nk9) qk9Var, layout);
        } else if (z2 && (qk9Var instanceof pk9)) {
            ((yk9) T()).m(lk9Var.a(), (pk9) qk9Var);
        } else if (qk9Var instanceof pk9) {
            yk9 yk9Var3 = (yk9) T();
            if (layout == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            yk9Var3.m(layout, (pk9) qk9Var);
        } else if (qk9Var instanceof mk9) {
            yk9 yk9Var4 = (yk9) T();
            if (layout == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            yk9Var4.h(layout, (mk9) qk9Var);
        }
        y();
    }

    @Override // defpackage.zk9
    public final void setReplyClickListener(sm6 sm6Var) {
        this.d = sm6Var;
    }
}
