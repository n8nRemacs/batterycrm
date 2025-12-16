package one.me.messages.list.ui.recycler;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.ag2;
import defpackage.bp5;
import defpackage.d9a;
import defpackage.dqi;
import defpackage.fn9;
import defpackage.gq5;
import defpackage.gzd;
import defpackage.iid;
import defpackage.kti;
import defpackage.l6b;
import defpackage.lg8;
import defpackage.mid;
import defpackage.n7j;
import defpackage.phd;
import defpackage.vq9;
import defpackage.vw4;
import defpackage.wq9;
import defpackage.wqi;
import defpackage.wy1;
import defpackage.xq9;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lone/me/messages/list/ui/recycler/MessagesLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "", "wq9", "xq9", "message-list_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MessagesLayoutManager extends LinearLayoutManager {
    public final float E;
    public final String F;
    public boolean G;
    public RecyclerView H;
    public final Rect I;
    public wq9 J;
    public final d9a K;
    public final gq5 L;

    public MessagesLayoutManager() {
        super(1, false);
        this.E = 2.0f;
        this.F = MessagesLayoutManager.class.getName();
        this.I = new Rect();
        d9a d9aVar = gzd.a;
        this.K = new d9a();
        this.L = new gq5(21, this);
        q1(true);
        this.h = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final void J0(RecyclerView recyclerView, int i) {
        lg8 lg8Var = lg8.d;
        int iX0 = X0();
        int iZ0 = Z0();
        if (iX0 == -1 || iZ0 == -1) {
            z0(i);
            return;
        }
        boolean z = true;
        if (iX0 > i || i > iZ0) {
            int i2 = (iZ0 + iX0) / 2 <= i ? 1 : -1;
            if (i >= iX0) {
                iX0 = iZ0;
            }
            if (Math.abs(iX0 - i) > 3) {
                int iD = kti.d(i2 * this.E * recyclerView.getHeight());
                String str = this.F;
                l6b l6bVar = wqi.a;
                if (l6bVar != null && l6bVar.b(lg8Var)) {
                    phd adapter = recyclerView.getAdapter();
                    Integer numValueOf = adapter != null ? Integer.valueOf(adapter.j()) : null;
                    StringBuilder sbK = wy1.k("LM fast scroll by pos:", i, " and offset:", iD, ", curSize:");
                    sbK.append(numValueOf);
                    l6bVar.c(lg8Var, str, sbK.toString(), null);
                }
                o1(i, iD);
            }
        }
        Context context = recyclerView.getContext();
        int iX02 = X0();
        boolean z2 = iX02 == Z0();
        boolean z3 = H() - 1 == i;
        boolean z4 = iX02 == i;
        if ((!z2 || !z3 || !z4) && !this.G) {
            z = false;
        }
        wq9 wq9Var = new wq9(context, i, z, new vq9(this, i, recyclerView, 0));
        this.J = wq9Var;
        String str2 = this.F;
        l6b l6bVar2 = wqi.a;
        if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
            phd adapter2 = recyclerView.getAdapter();
            l6bVar2.c(lg8Var, str2, "LM smooth scroll by pos:" + i + ", curSize:" + (adapter2 != null ? Integer.valueOf(adapter2.j()) : null), null);
        }
        K0(wq9Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final void T(View view, int i, int i2, int i3, int i4) {
        mid midVarT;
        RecyclerView recyclerView = this.H;
        if (recyclerView == null || (midVarT = recyclerView.T(view)) == null) {
            return;
        }
        boolean z = midVarT instanceof ag2;
        int i5 = midVarT.X;
        if (i5 != 0 && !z && !fn9.e(i5)) {
            super.T(view, i, i2, i3, i4);
            return;
        }
        int i6 = i3 - i;
        int width = ((recyclerView.getWidth() - i6) / 2) + recyclerView.getLeft();
        super.T(view, width, i2, width + i6, i4);
    }

    @Override // androidx.recyclerview.widget.a
    public final void Y(RecyclerView recyclerView) {
        this.H = recyclerView;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final void Z(RecyclerView recyclerView) {
        Handler handler;
        RecyclerView recyclerView2 = this.H;
        if (recyclerView2 != null && (handler = recyclerView2.getHandler()) != null) {
            handler.removeCallbacks(this.L);
        }
        this.H = null;
        this.I.setEmpty();
        this.J = null;
    }

    @Override // androidx.recyclerview.widget.a
    public final void f0(int i, int i2) {
        int i3;
        wq9 wq9Var = this.J;
        if (wq9Var != null && (i3 = wq9Var.a) != -1 && i <= i3) {
            int i4 = i3 + i2;
            int iH = H();
            if (iH < 1) {
                iH = 1;
            }
            wq9Var.o(n7j.c(i4, 0, iH - 1));
        }
        v1();
    }

    @Override // androidx.recyclerview.widget.a
    public final void g0() {
        wq9 wq9Var = this.J;
        if (wq9Var != null) {
            int iH = H();
            if (iH <= 0) {
                wq9Var.m();
                this.J = null;
            } else {
                int iC = n7j.c(wq9Var.a, 0, iH - 1);
                if (iC != wq9Var.a) {
                    wq9Var.o(iC);
                }
            }
        }
        v1();
    }

    @Override // androidx.recyclerview.widget.a
    public final void h0(int i, int i2) {
        int i3;
        wq9 wq9Var = this.J;
        if (wq9Var != null && (i3 = wq9Var.a) != -1) {
            int i4 = (i > i3 || i3 >= i + 1) ? (i >= i3 || i2 < i3) ? (i <= i3 || i2 > i3) ? i3 : i3 + 1 : i3 - 1 : (i2 - i) + i3;
            int iH = H();
            if (iH < 1) {
                iH = 1;
            }
            int iC = n7j.c(i4, 0, iH - 1);
            if (iC != i3) {
                wq9Var.o(iC);
            }
        }
        v1();
    }

    @Override // androidx.recyclerview.widget.a
    public final void i0(int i, int i2) {
        int i3;
        wq9 wq9Var = this.J;
        if (wq9Var != null && (i3 = wq9Var.a) != -1) {
            int i4 = (i + i2) - 1;
            int iH = H();
            if (iH <= 0) {
                wq9Var.m();
                this.J = null;
            } else {
                if (i <= i3 && i3 <= i4) {
                    int i5 = iH - 1;
                    if (i > i5) {
                        i = i5;
                    }
                } else if (i < i3) {
                    i = i3 - i2;
                    if (i < 0) {
                        i = 0;
                    }
                } else {
                    i = i3;
                }
                if (i != i3) {
                    wq9Var.o(i);
                }
            }
        }
        v1();
    }

    @Override // androidx.recyclerview.widget.a
    public final void j0(int i) {
        v1();
    }

    @Override // androidx.recyclerview.widget.a
    public final void k0(RecyclerView recyclerView, int i, int i2) {
        v1();
        v1();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final void m0(iid iidVar) {
        super.m0(iidVar);
        if (X0() == -1 || Z0() == -1) {
            return;
        }
        d9a d9aVar = this.K;
        Object[] objArr = d9aVar.b;
        long[] jArr = d9aVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        ((xq9) objArr[(i << 3) + i3]).b();
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u1(defpackage.xq9 r17) {
        /*
            r16 = this;
            r0 = r16
            d9a r1 = r0.K
            java.lang.Object[] r2 = r1.b
            long[] r3 = r1.a
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L53
            r5 = 0
            r6 = r5
        Lf:
            r7 = r3[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L56
            int r9 = r6 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = r5
        L29:
            if (r11 >= r9) goto L50
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.3E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L4c
            int r12 = r6 << 3
            int r12 = r12 + r11
            r13 = r2[r12]
            xq9 r13 = (defpackage.xq9) r13
            java.lang.String r13 = r13.getTag()
            java.lang.String r14 = r17.getTag()
            boolean r13 = r13.equals(r14)
            if (r13 == 0) goto L4c
            r1.h(r12)
        L4c:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L29
        L50:
            if (r9 != r10) goto L53
            goto L56
        L53:
            r2 = r17
            goto L5b
        L56:
            if (r6 == r4) goto L53
            int r6 = r6 + 1
            goto Lf
        L5b:
            r1.a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.messages.list.ui.recycler.MessagesLayoutManager.u1(xq9):void");
    }

    public final void v1() {
        Handler handler;
        Handler handler2;
        RecyclerView recyclerView = this.H;
        gq5 gq5Var = this.L;
        if (recyclerView != null && (handler2 = recyclerView.getHandler()) != null) {
            handler2.removeCallbacks(gq5Var);
        }
        RecyclerView recyclerView2 = this.H;
        if (recyclerView2 == null || (handler = recyclerView2.getHandler()) == null) {
            return;
        }
        handler.postAtFrontOfQueue(gq5Var);
    }

    public final void w1(String str) {
        d9a d9aVar = this.K;
        Object[] objArr = d9aVar.b;
        long[] jArr = d9aVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        if (((xq9) objArr[i4]).getTag().equals(str)) {
                            d9aVar.h(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void x1(View view, int i) {
        if (!this.G) {
            o1(i, kti.d(30 * vw4.d().getDisplayMetrics().density));
            return;
        }
        Rect rect = this.I;
        RecyclerView.V(rect, view);
        RecyclerView recyclerView = this.H;
        int height = (recyclerView != null ? recyclerView.getHeight() : 0) - rect.height();
        o1(i, height >= 0 ? height : 0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final void z0(int i) {
        phd adapter;
        View viewS = s(i);
        if (viewS == null) {
            super.z0(i);
            RecyclerView recyclerView = this.H;
            if (recyclerView != null) {
                dqi.e(recyclerView, new bp5(this, i, 2));
                return;
            }
            return;
        }
        String str = this.F;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                RecyclerView recyclerView2 = this.H;
                l6bVar.c(lg8Var, str, "LM scroll to inflated view by pos:" + i + ", curSize:" + ((recyclerView2 == null || (adapter = recyclerView2.getAdapter()) == null) ? null : Integer.valueOf(adapter.j())), null);
            }
        }
        x1(viewS, i);
    }
}
