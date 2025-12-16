package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.a;
import com.futuremind.recyclerviewfastscroll.FastScroller;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class qf5 extends bid {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;
    public final Object d;

    public qf5(yf5 yf5Var, sf5 sf5Var) {
        this.a = 0;
        this.d = yf5Var;
        this.c = sf5Var;
        this.b = 1;
    }

    @Override // defpackage.bid
    public void a(RecyclerView recyclerView, int i) {
        switch (this.a) {
            case 1:
                FastScroller fastScroller = (FastScroller) this.c;
                if (i == 0 && this.b != 0) {
                    u3e viewProvider = fastScroller.getViewProvider();
                    viewProvider.getClass();
                    if (viewProvider.a() != null) {
                        viewProvider.a().getClass();
                    }
                } else if (i != 0 && this.b == 0) {
                    u3e viewProvider2 = fastScroller.getViewProvider();
                    viewProvider2.getClass();
                    if (viewProvider2.a() != null) {
                        viewProvider2.a().getClass();
                    }
                }
                this.b = i;
                break;
        }
    }

    @Override // defpackage.bid
    public final void b(RecyclerView recyclerView, final int i, final int i2) {
        switch (this.a) {
            case 0:
                final yf5 yf5Var = (yf5) this.d;
                yf5Var.post(new Runnable() { // from class: pf5
                    @Override // java.lang.Runnable
                    public final void run() {
                        int iZ0;
                        qf5 qf5Var = this;
                        sf5 sf5Var = (sf5) qf5Var.c;
                        if (i == 0) {
                            int i3 = i2;
                        }
                        yf5 yf5Var2 = yf5Var;
                        a layoutManager = yf5Var2.getLayoutManager();
                        int iX0 = 0;
                        if (layoutManager instanceof StaggeredGridLayoutManager) {
                            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                            int i4 = staggeredGridLayoutManager.p;
                            int[] iArr = new int[i4];
                            for (int i5 = 0; i5 < staggeredGridLayoutManager.p; i5++) {
                                s9f s9fVar = staggeredGridLayoutManager.q[i5];
                                ArrayList arrayList = (ArrayList) s9fVar.e;
                                iArr[i5] = ((StaggeredGridLayoutManager) s9fVar.f).w ? s9fVar.g(0, arrayList.size(), true, false) : s9fVar.g(arrayList.size() - 1, -1, true, false);
                            }
                            iZ0 = iArr[i4 - 1];
                        } else {
                            iZ0 = layoutManager instanceof LinearLayoutManager ? ((LinearLayoutManager) layoutManager).Z0() : 0;
                        }
                        phd adapter = yf5Var2.getAdapter();
                        if (adapter != null) {
                            if (adapter.j() - iZ0 <= qf5Var.b && ((yf5Var2.getIgnoreRefreshingFlagsForScrollEvent() || !yf5Var2.c2) && sf5Var.q())) {
                                if (yf5Var2.f2 != null) {
                                    yf5Var2.getRefreshingNextDelegate();
                                    yf5Var2.setRefreshingNext(true);
                                }
                                sf5Var.p();
                            }
                            a layoutManager2 = yf5Var2.getLayoutManager();
                            if (layoutManager2 instanceof StaggeredGridLayoutManager) {
                                StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) layoutManager2;
                                int i6 = staggeredGridLayoutManager2.p;
                                int[] iArr2 = new int[i6];
                                for (int i7 = 0; i7 < staggeredGridLayoutManager2.p; i7++) {
                                    s9f s9fVar2 = staggeredGridLayoutManager2.q[i7];
                                    ArrayList arrayList2 = (ArrayList) s9fVar2.e;
                                    iArr2[i7] = ((StaggeredGridLayoutManager) s9fVar2.f).w ? s9fVar2.g(arrayList2.size() - 1, -1, true, false) : s9fVar2.g(0, arrayList2.size(), true, false);
                                }
                                iX0 = iArr2[i6 - 1];
                            } else if (layoutManager2 instanceof LinearLayoutManager) {
                                iX0 = ((LinearLayoutManager) layoutManager2).X0();
                            }
                            if (iX0 < 0 || iX0 > qf5Var.b) {
                                return;
                            }
                            if ((yf5Var2.getIgnoreRefreshingFlagsForScrollEvent() || !yf5Var2.d2) && sf5Var.g()) {
                                if (yf5Var2.f2 != null) {
                                    yf5Var2.setRefreshingPrev(true);
                                }
                                sf5Var.j();
                            }
                        }
                    }
                });
                break;
            default:
                FastScroller fastScroller = (FastScroller) this.c;
                if (fastScroller.d != null && !fastScroller.y0 && fastScroller.b.getChildCount() > 0) {
                    c(recyclerView);
                    break;
                }
                break;
        }
    }

    public void c(RecyclerView recyclerView) {
        int iComputeHorizontalScrollOffset;
        int iComputeHorizontalScrollExtent;
        int iComputeHorizontalScrollRange;
        FastScroller fastScroller = (FastScroller) this.c;
        if (fastScroller.c()) {
            iComputeHorizontalScrollOffset = recyclerView.computeVerticalScrollOffset();
            iComputeHorizontalScrollExtent = recyclerView.computeVerticalScrollExtent();
            iComputeHorizontalScrollRange = recyclerView.computeVerticalScrollRange();
        } else {
            iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            iComputeHorizontalScrollExtent = recyclerView.computeHorizontalScrollExtent();
            iComputeHorizontalScrollRange = recyclerView.computeHorizontalScrollRange();
        }
        fastScroller.setScrollerPosition(iComputeHorizontalScrollOffset / (iComputeHorizontalScrollRange - iComputeHorizontalScrollExtent));
        Iterator it = ((ArrayList) this.d).iterator();
        if (it.hasNext()) {
            throw ctd.h(it);
        }
    }

    public qf5(FastScroller fastScroller) {
        this.a = 1;
        this.d = new ArrayList();
        this.b = 0;
        this.c = fastScroller;
    }
}
