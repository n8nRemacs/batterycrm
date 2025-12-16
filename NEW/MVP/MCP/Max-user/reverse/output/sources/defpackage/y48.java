package defpackage;

import android.view.View;
import java.util.List;

/* loaded from: classes.dex */
public final class y48 {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public List k;
    public boolean l;

    public final void a(View view) {
        int iH;
        int size = this.k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((mid) this.k.get(i2)).a;
            xhd xhdVar = (xhd) view3.getLayoutParams();
            if (view3 != view && !xhdVar.a.q() && (iH = (xhdVar.a.h() - this.d) * this.e) >= 0 && iH < i) {
                view2 = view3;
                if (iH == 0) {
                    break;
                } else {
                    i = iH;
                }
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((xhd) view2.getLayoutParams()).a.h();
        }
    }

    public final View b(did didVar) {
        List list = this.k;
        if (list == null) {
            View viewD = didVar.d(this.d);
            this.d += this.e;
            return viewD;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((mid) this.k.get(i)).a;
            xhd xhdVar = (xhd) view.getLayoutParams();
            if (!xhdVar.a.q() && this.d == xhdVar.a.h()) {
                a(view);
                return view;
            }
        }
        return null;
    }
}
