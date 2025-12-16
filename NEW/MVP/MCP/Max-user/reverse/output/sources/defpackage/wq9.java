package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.a;
import one.me.messages.list.ui.recycler.MessagesLayoutManager;

/* loaded from: classes2.dex */
public final class wq9 extends c58 {
    public final boolean q;
    public final vq9 r;
    public volatile Integer s;

    public wq9(Context context, int i, boolean z, vq9 vq9Var) {
        super(context);
        this.q = z;
        this.r = vq9Var;
        if (i >= 0) {
            this.a = i;
        }
    }

    @Override // defpackage.c58
    public final void j(int i, int i2, iid iidVar, gid gidVar) {
        lg8 lg8Var = lg8.d;
        Integer num = this.s;
        if (num != null) {
            int iIntValue = num.intValue();
            vid.a(MessagesLayoutManager.class);
            String name = ca3.class.getName();
            l6b l6bVar = wqi.a;
            if (l6bVar != null && l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, name, ho7.f(iIntValue, "LM SmoothScroller onSeekTargetStep pendingJumpToPos="), null);
            }
            gidVar.d = iIntValue;
            this.s = null;
        }
        super.j(i, i2, iidVar, gidVar);
        vid.a(MessagesLayoutManager.class);
        String name2 = ca3.class.getName();
        l6b l6bVar2 = wqi.a;
        if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
            int i3 = gidVar.a;
            int i4 = gidVar.b;
            int i5 = gidVar.c;
            Interpolator interpolator = gidVar.e;
            StringBuilder sbK = wy1.k("LM SmoothScroller onSeekTargetStep dx=", i, " dy=", i2, " action.dx=");
            hf3.g(sbK, i3, " action.dy=", i4, " action.duration=");
            sbK.append(i5);
            sbK.append(" action.interpolator=");
            sbK.append(interpolator);
            sbK.append(" recyclerView.state=");
            sbK.append(iidVar);
            l6bVar2.c(lg8Var, name2, sbK.toString(), null);
        }
    }

    @Override // defpackage.c58
    public final void k() {
        this.r.invoke(Integer.valueOf(this.a));
        super.k();
    }

    @Override // defpackage.c58
    public final void l(View view, iid iidVar, gid gidVar) {
        wq9 wq9Var;
        int iN;
        if (iidVar.h) {
            return;
        }
        int iH = h();
        a aVar = this.c;
        if (aVar == null || !aVar.g()) {
            wq9Var = this;
            iN = 0;
        } else {
            xhd xhdVar = (xhd) view.getLayoutParams();
            wq9Var = this;
            iN = wq9Var.n(a.G(view) - ((ViewGroup.MarginLayoutParams) xhdVar).topMargin, a.A(view) + ((ViewGroup.MarginLayoutParams) xhdVar).bottomMargin, aVar.M(), aVar.o - aVar.J(), iH);
        }
        int iE = e(Math.abs(iN));
        if (iE > 0) {
            int i = -iN;
            if (iE > 300) {
                iE = 300;
            }
            gidVar.b(0, i, iE, wq9Var.j);
        }
    }

    public final int n(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        if (i5 == -1) {
            return u45.c(30, vw4.d().getDisplayMetrics().density, i3 - i);
        }
        boolean z = this.q;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i10 = i4 - i2;
            return (i10 - (i2 - i) >= i3 || z) ? i10 : i3 - i;
        }
        if (z) {
            i6 = i;
            i7 = i2;
            i8 = i3;
            i9 = i4;
        } else {
            i6 = i;
            i7 = i2;
            i8 = i3;
            i9 = i4;
            int iN = n(i6, i7, i8, i9, -1);
            if (iN > 0) {
                return iN;
            }
        }
        int iN2 = n(i6, i7, i8, i9, 1);
        if (iN2 < 0) {
            return iN2;
        }
        return 0;
    }

    public final void o(int i) {
        if (i == -1) {
            return;
        }
        vid.a(MessagesLayoutManager.class);
        String name = ca3.class.getName();
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, name, ho7.f(i, "LM SmoothScroller replanTo="), null);
            }
        }
        this.a = i;
        this.s = Integer.valueOf(i);
    }
}
