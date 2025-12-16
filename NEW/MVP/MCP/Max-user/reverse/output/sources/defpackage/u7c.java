package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class u7c extends bid {
    public static final /* synthetic */ yy7[] l;
    public static final String m;
    public final yu9 a;
    public final int b;
    public final iu3 c;
    public boolean f;
    public int i;
    public final n8a j;
    public final n8a d = new n8a(10);
    public final n8a e = new n8a(10);
    public int g = -1;
    public int h = -1;
    public final nk k = new nk(24, this);

    static {
        z8a z8aVar = new z8a(u7c.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;");
        vid.a.getClass();
        l = new yy7[]{z8aVar};
        m = u7c.class.getName();
    }

    public u7c(yu9 yu9Var, int i, iu3 iu3Var) {
        this.a = yu9Var;
        this.b = i;
        this.c = iu3Var;
        this.j = new n8a(i);
    }

    @Override // defpackage.bid
    public final void a(RecyclerView recyclerView, int i) {
        this.k.O(this, l[0], recyclerView);
    }

    @Override // defpackage.bid
    public final void b(RecyclerView recyclerView, int i, int i2) {
        n8a n8aVar = this.j;
        this.k.O(this, l[0], recyclerView);
        if (!this.f || this.c == null) {
            return;
        }
        try {
            n8aVar.c();
            c();
            n8aVar.c();
        } catch (Throwable th) {
            wqi.e(m, "tryToPrefetch failure!", th);
        }
    }

    public final void c() {
        phd adapter;
        iu3 iu3Var;
        int iG;
        yy7 yy7Var = l[0];
        RecyclerView recyclerView = (RecyclerView) this.k.b;
        if (recyclerView == null) {
            return;
        }
        boolean z = false;
        int i = 0;
        int iMin = -1;
        int iMax = -1;
        while (true) {
            boolean z2 = i < recyclerView.getChildCount();
            n8a n8aVar = this.e;
            n8a n8aVar2 = this.j;
            if (!z2) {
                n8a n8aVar3 = this.d;
                this.f = n8aVar3.j() && !fni.a(n8aVar, n8aVar3);
                if (z && (adapter = recyclerView.getAdapter()) != null) {
                    int i2 = n8aVar2.d;
                    if (i2 > 0) {
                        float f = i2;
                        int i3 = this.b;
                        if (f < i3 * 0.8f) {
                            if (this.i != adapter.j()) {
                                this.i = adapter.j();
                                this.g = -1;
                                this.h = -1;
                            }
                            int i4 = (i3 - i2) / 2;
                            if (i4 != 0) {
                                long[] jArr = (long[]) this.a.invoke();
                                if (this.g != iMin) {
                                    this.g = iMin;
                                    long[] jArrC = eei.c(jArr, iMin, -i4);
                                    for (long j : jArrC) {
                                        if (n8aVar.a(j)) {
                                            n8aVar2.a(j);
                                        }
                                    }
                                }
                                if (this.h != iMax) {
                                    this.h = iMax;
                                    for (long j2 : eei.c(jArr, iMax, i4)) {
                                        if (n8aVar.a(j2)) {
                                            n8aVar2.a(j2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (n8aVar2.j() && (iu3Var = this.c) != null) {
                        iu3Var.accept(dsi.f(n8aVar2));
                    }
                    if (this.f) {
                        return;
                    }
                    wqi.c(m, "clear", new Object[0]);
                    n8aVar2.c();
                    n8aVar.c();
                    n8aVar3.c();
                    return;
                }
                return;
            }
            int i5 = i + 1;
            View childAt = recyclerView.getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            try {
                Object objT = recyclerView.T(childAt);
                Object obj = objT instanceof rj9 ? (rj9) objT : null;
                if (obj != null) {
                    bi9 bi9Var = (bi9) obj;
                    if (bi9Var.O0) {
                        long j3 = bi9Var.P0;
                        boolean zA = n8aVar.a(j3);
                        if (zA) {
                            n8aVar2.a(j3);
                        }
                        z = z || zA;
                        if (z && (iG = ((mid) obj).g()) != -1) {
                            iMin = Math.min(iMin, iG);
                            iMax = Math.max(iMax, iG);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
            i = i5;
        }
    }
}
