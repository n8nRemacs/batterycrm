package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class jf extends wa2 {
    public final /* synthetic */ int c = 1;
    public Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf(kf kfVar) {
        super(1);
        this.e = kfVar;
    }

    @Override // defpackage.wa2
    public void b(s3i s3iVar) {
        switch (this.c) {
            case 0:
                kf kfVar = (kf) this.e;
                if (!kfVar.g && kfVar.k == s3iVar.a.c()) {
                    kfVar.k = -1;
                    kfVar.i();
                    g4i g4iVar = kfVar.e;
                    if (g4iVar != null) {
                        kfVar.c(g4iVar);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.wa2
    public final void c(s3i s3iVar) {
        switch (this.c) {
            case 0:
                r3i r3iVar = s3iVar.a;
                kf kfVar = (kf) this.e;
                if (!kfVar.g && kfVar.k == -1 && (r3iVar.c() & kfVar.j) != 0) {
                    kfVar.k = r3iVar.c();
                    this.d = kfVar.e;
                    kfVar.j();
                    break;
                }
                break;
            default:
                y09 y09Var = (y09) this.e;
                View view = y09Var.b;
                if ((s3iVar.a.c() & 8) != 0) {
                    View view2 = y09Var.c;
                    int iC = y09Var.c();
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), iC + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0));
                    view.setTranslationY(0.0f);
                    hfh.p((View) this.d, null);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.wa2
    public final g4i d(g4i g4iVar, List list) {
        Object next;
        switch (this.c) {
            case 0:
                kf kfVar = (kf) this.e;
                if (kfVar.g) {
                    return g4iVar;
                }
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((s3i) next).a.c() == kfVar.k) {
                        }
                    } else {
                        next = null;
                    }
                }
                return ((s3i) next) != null ? kfVar.h(kf.f(kfVar, g4iVar)) : g4iVar;
            default:
                return g4iVar;
        }
    }

    @Override // defpackage.wa2
    public ssb e(s3i s3iVar, ssb ssbVar) {
        g4i g4iVar;
        switch (this.c) {
            case 0:
                kf kfVar = (kf) this.e;
                if (!kfVar.g && (g4iVar = (g4i) this.d) != null && kfVar.k == s3iVar.a.c()) {
                    g4i g4iVarF = kf.f(kfVar, g4iVar);
                    kfVar.g(g4iVarF, ssbVar);
                    kfVar.h(g4iVarF);
                    break;
                }
                break;
        }
        return ssbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf(View view, y09 y09Var) {
        super(1);
        this.d = view;
        this.e = y09Var;
    }
}
