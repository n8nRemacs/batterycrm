package one.me.chats.list.folderwidget.section;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.a;
import defpackage.did;
import defpackage.hb6;
import defpackage.hyc;
import defpackage.ib6;
import defpackage.iid;
import defpackage.kti;
import defpackage.n7j;
import defpackage.to7;
import defpackage.u45;
import defpackage.vw4;
import defpackage.xhd;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lone/me/chats/list/folderwidget/section/FolderWidgetLayoutManager;", "Landroidx/recyclerview/widget/a;", "chats-list_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FolderWidgetLayoutManager extends a {
    public final Context p;
    public int q;
    public int r;
    public int s = -1;
    public int t = -1;
    public int u = -1;
    public int v;
    public int w;
    public boolean x;

    public FolderWidgetLayoutManager(Context context) {
        this.p = context;
    }

    public final void M0(int i, int i2, int i3) {
        hb6 hb6Var;
        boolean z = this.q == 0 || this.r == 0;
        boolean z2 = (i == this.t && i2 == this.u) ? false : true;
        if (z || z2 || i3 != this.s) {
            to7 to7Var = ib6.c;
            int i4 = to7Var.a;
            int i5 = to7Var.b;
            this.r = ((i2 > i5 || i4 > i2) ? i3 > 1 ? hyc.oneme_folder_widget_view_type : hyc.oneme_big_folder_widget_view_type : i3 > 2 ? hyc.oneme_folder_widget_view_type : hyc.oneme_big_folder_widget_view_type) == hyc.oneme_big_folder_widget_view_type ? kti.d(92 * vw4.d().getDisplayMetrics().density) : kti.d(128 * vw4.d().getDisplayMetrics().density);
            to7 to7Var2 = ib6.a;
            int i6 = to7Var2.a;
            if (i2 > to7Var2.b || i6 > i2) {
                to7 to7Var3 = ib6.b;
                int i7 = to7Var3.a;
                if (i2 > to7Var3.b || i7 > i2) {
                    hb6Var = (i2 > i5 || to7Var.a > i2) ? new hb6(4, kti.d(98 * vw4.d().getDisplayMetrics().density), kti.d(138 * vw4.d().getDisplayMetrics().density)) : new hb6(4, kti.d(138 * vw4.d().getDisplayMetrics().density), kti.d(284 * vw4.d().getDisplayMetrics().density));
                } else {
                    hb6Var = new hb6(4, kti.d(98 * vw4.d().getDisplayMetrics().density), kti.d(138 * vw4.d().getDisplayMetrics().density));
                }
            } else {
                hb6Var = new hb6(3, kti.d(98 * vw4.d().getDisplayMetrics().density), kti.d(110 * vw4.d().getDisplayMetrics().density));
            }
            this.q = i3 < hb6Var.a ? i / i3 : n7j.c((int) ((u45.d(8, vw4.d().getDisplayMetrics().density, 2, i) - ((Math.floor(3.5d) - 1) * kti.d(6 * vw4.d().getDisplayMetrics().density))) / 3.5d), hb6Var.b, hb6Var.c);
            this.s = i3;
            this.t = i;
            this.u = i2;
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean R() {
        return true;
    }

    @Override // androidx.recyclerview.widget.a
    /* renamed from: f, reason: from getter */
    public final boolean getX() {
        return this.x;
    }

    @Override // androidx.recyclerview.widget.a
    public final void l0(did didVar, iid iidVar) {
        if (iidVar.b() == 0) {
            t0(didVar);
            return;
        }
        r(didVar);
        int i = this.n;
        int iD = kti.d(i / this.p.getResources().getDisplayMetrics().density);
        M0(i, iD, iidVar.b());
        this.w = iidVar.b() * this.q;
        to7 to7Var = ib6.a;
        int iB = iidVar.b();
        to7 to7Var2 = ib6.a;
        int i2 = to7Var2.a;
        boolean z = true;
        int i3 = 0;
        if (iD > to7Var2.b || i2 > iD ? iB <= 3 : iB <= 2) {
            z = false;
        }
        this.x = z;
        int i4 = this.w - i;
        if (i4 < 0) {
            i4 = 0;
        }
        int iC = n7j.c(this.v, 0, i4);
        this.v = iC;
        int iD2 = (kti.d(8 * vw4.d().getDisplayMetrics().density) * 2) + this.r;
        int iB2 = iidVar.b();
        int i5 = -iC;
        while (i3 < iB2) {
            View viewD = didVar.d(i3);
            b(viewD);
            xhd xhdVar = (xhd) viewD.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) xhdVar).width = this.q;
            ((ViewGroup.MarginLayoutParams) xhdVar).height = this.r;
            viewD.setLayoutParams(xhdVar);
            U(viewD);
            int i6 = i5 + this.q;
            T(viewD, i5, 0, i6, iD2);
            i3++;
            i5 = i6;
        }
        didVar.a.clear();
        didVar.f();
    }

    @Override // androidx.recyclerview.widget.a
    public final void n0(iid iidVar, int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.n;
        int iD = kti.d(i3 / this.p.getResources().getDisplayMetrics().density);
        if (iidVar.b() > 0) {
            M0(i3, iD, iidVar.b());
        } else {
            this.r = 0;
        }
        this.b.setMeasuredDimension(View.resolveSize(size, i), View.resolveSize(J() + M() + this.r, i2));
    }

    @Override // androidx.recyclerview.widget.a
    public final xhd t() {
        return new xhd(-2, -2);
    }

    @Override // androidx.recyclerview.widget.a
    public final int y0(int i, did didVar, iid iidVar) {
        if (!this.x) {
            return 0;
        }
        int i2 = this.w - this.n;
        if (i2 < 0) {
            i2 = 0;
        }
        if (i2 <= 0) {
            return 0;
        }
        int iC = n7j.c(this.v + i, 0, i2);
        int i3 = iC - this.v;
        if (i3 != 0) {
            this.v = iC;
            V(-i3);
        }
        return i3;
    }
}
