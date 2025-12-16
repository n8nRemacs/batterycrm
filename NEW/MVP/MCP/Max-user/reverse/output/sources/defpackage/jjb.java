package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.a;

/* loaded from: classes.dex */
public final class jjb extends aw7 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jjb(a aVar, int i) {
        super(aVar);
        this.d = i;
    }

    @Override // defpackage.aw7
    public final int c(View view) {
        int iF;
        int i;
        switch (this.d) {
            case 0:
                xhd xhdVar = (xhd) view.getLayoutParams();
                ((a) this.b).getClass();
                iF = a.F(view);
                i = ((ViewGroup.MarginLayoutParams) xhdVar).rightMargin;
                break;
            default:
                xhd xhdVar2 = (xhd) view.getLayoutParams();
                ((a) this.b).getClass();
                iF = a.A(view);
                i = ((ViewGroup.MarginLayoutParams) xhdVar2).bottomMargin;
                break;
        }
        return iF + i;
    }

    @Override // defpackage.aw7
    public final int d(View view) {
        int iE;
        int i;
        switch (this.d) {
            case 0:
                xhd xhdVar = (xhd) view.getLayoutParams();
                ((a) this.b).getClass();
                iE = a.E(view) + ((ViewGroup.MarginLayoutParams) xhdVar).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) xhdVar).rightMargin;
                break;
            default:
                xhd xhdVar2 = (xhd) view.getLayoutParams();
                ((a) this.b).getClass();
                iE = a.D(view) + ((ViewGroup.MarginLayoutParams) xhdVar2).topMargin;
                i = ((ViewGroup.MarginLayoutParams) xhdVar2).bottomMargin;
                break;
        }
        return iE + i;
    }

    @Override // defpackage.aw7
    public final int e(View view) {
        int iD;
        int i;
        switch (this.d) {
            case 0:
                xhd xhdVar = (xhd) view.getLayoutParams();
                ((a) this.b).getClass();
                iD = a.D(view) + ((ViewGroup.MarginLayoutParams) xhdVar).topMargin;
                i = ((ViewGroup.MarginLayoutParams) xhdVar).bottomMargin;
                break;
            default:
                xhd xhdVar2 = (xhd) view.getLayoutParams();
                ((a) this.b).getClass();
                iD = a.E(view) + ((ViewGroup.MarginLayoutParams) xhdVar2).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) xhdVar2).rightMargin;
                break;
        }
        return iD + i;
    }

    @Override // defpackage.aw7
    public final int f(View view) {
        int iC;
        int i;
        switch (this.d) {
            case 0:
                xhd xhdVar = (xhd) view.getLayoutParams();
                ((a) this.b).getClass();
                iC = a.C(view);
                i = ((ViewGroup.MarginLayoutParams) xhdVar).leftMargin;
                break;
            default:
                xhd xhdVar2 = (xhd) view.getLayoutParams();
                ((a) this.b).getClass();
                iC = a.G(view);
                i = ((ViewGroup.MarginLayoutParams) xhdVar2).topMargin;
                break;
        }
        return iC - i;
    }

    @Override // defpackage.aw7
    public final int g() {
        switch (this.d) {
            case 0:
                return ((a) this.b).n;
            default:
                return ((a) this.b).o;
        }
    }

    @Override // defpackage.aw7
    public final int h() {
        int i;
        int iL;
        switch (this.d) {
            case 0:
                a aVar = (a) this.b;
                i = aVar.n;
                iL = aVar.L();
                break;
            default:
                a aVar2 = (a) this.b;
                i = aVar2.o;
                iL = aVar2.J();
                break;
        }
        return i - iL;
    }

    @Override // defpackage.aw7
    public final int i() {
        switch (this.d) {
            case 0:
                return ((a) this.b).L();
            default:
                return ((a) this.b).J();
        }
    }

    @Override // defpackage.aw7
    public final int j() {
        switch (this.d) {
            case 0:
                return ((a) this.b).l;
            default:
                return ((a) this.b).m;
        }
    }

    @Override // defpackage.aw7
    public final int k() {
        switch (this.d) {
            case 0:
                return ((a) this.b).m;
            default:
                return ((a) this.b).l;
        }
    }

    @Override // defpackage.aw7
    public final int m() {
        switch (this.d) {
            case 0:
                return ((a) this.b).K();
            default:
                return ((a) this.b).M();
        }
    }

    @Override // defpackage.aw7
    public final int n() {
        int iK;
        int iL;
        switch (this.d) {
            case 0:
                a aVar = (a) this.b;
                iK = aVar.n - aVar.K();
                iL = aVar.L();
                break;
            default:
                a aVar2 = (a) this.b;
                iK = aVar2.o - aVar2.M();
                iL = aVar2.J();
                break;
        }
        return iK - iL;
    }

    @Override // defpackage.aw7
    public final int p(View view) {
        switch (this.d) {
            case 0:
                a aVar = (a) this.b;
                Rect rect = (Rect) this.c;
                aVar.Q(rect, view);
                return rect.right;
            default:
                a aVar2 = (a) this.b;
                Rect rect2 = (Rect) this.c;
                aVar2.Q(rect2, view);
                return rect2.bottom;
        }
    }

    @Override // defpackage.aw7
    public final int q(View view) {
        switch (this.d) {
            case 0:
                a aVar = (a) this.b;
                Rect rect = (Rect) this.c;
                aVar.Q(rect, view);
                return rect.left;
            default:
                a aVar2 = (a) this.b;
                Rect rect2 = (Rect) this.c;
                aVar2.Q(rect2, view);
                return rect2.top;
        }
    }

    @Override // defpackage.aw7
    public final void r(int i) {
        switch (this.d) {
            case 0:
                ((a) this.b).V(i);
                break;
            default:
                ((a) this.b).W(i);
                break;
        }
    }
}
