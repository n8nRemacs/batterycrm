package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.beduin.common.component.input.BeduinInputModel;

/* compiled from: SnapHelper.java */
/* loaded from: classes10.dex */
public abstract class P extends RecyclerView.p {

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView f53728a;

    /* renamed from: b, reason: collision with root package name */
    public Scroller f53729b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView.r f53730c = new a();

    /* compiled from: SnapHelper.java */
    public class a extends RecyclerView.r {

        /* renamed from: b, reason: collision with root package name */
        public boolean f53731b = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void i(int i12, RecyclerView recyclerView) {
            if (i12 == 0 && this.f53731b) {
                this.f53731b = false;
                P.this.h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void k(RecyclerView recyclerView, int i12, int i13) {
            if (i12 == 0 && i13 == 0) {
                return;
            }
            this.f53731b = true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean a(int i12, int i13) {
        RecyclerView.y yVarE;
        int iG2;
        RecyclerView.m layoutManager = this.f53728a.getLayoutManager();
        if (layoutManager == null || this.f53728a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f53728a.getMinFlingVelocity();
        if ((Math.abs(i13) <= minFlingVelocity && Math.abs(i12) <= minFlingVelocity) || !(layoutManager instanceof RecyclerView.y.b) || (yVarE = e(layoutManager)) == null || (iG2 = g(layoutManager, i12, i13)) == -1) {
            return false;
        }
        yVarE.f53878a = iG2;
        layoutManager.x1(yVarE);
        return true;
    }

    public void b(@j.P RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f53728a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        RecyclerView.r rVar = this.f53730c;
        if (recyclerView2 != null) {
            recyclerView2.v0(rVar);
            this.f53728a.setOnFlingListener(null);
        }
        this.f53728a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.f53728a.o(rVar);
            this.f53728a.setOnFlingListener(this);
            this.f53729b = new Scroller(this.f53728a.getContext(), new DecelerateInterpolator());
            h();
        }
    }

    @j.P
    public abstract int[] c(@j.N RecyclerView.m mVar, @j.N View view);

    public int[] d(int i12, int i13) {
        this.f53729b.fling(0, 0, i12, i13, BeduinInputModel.MIN_TEXT_VERSION, Integer.MAX_VALUE, BeduinInputModel.MIN_TEXT_VERSION, Integer.MAX_VALUE);
        return new int[]{this.f53729b.getFinalX(), this.f53729b.getFinalY()};
    }

    @j.P
    public RecyclerView.y e(@j.N RecyclerView.m mVar) {
        if (mVar instanceof RecyclerView.y.b) {
            return new Q(this, this.f53728a.getContext());
        }
        return null;
    }

    @j.P
    public abstract View f(RecyclerView.m mVar);

    public abstract int g(RecyclerView.m mVar, int i12, int i13);

    public final void h() {
        RecyclerView.m layoutManager;
        View viewF;
        RecyclerView recyclerView = this.f53728a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewF = f(layoutManager)) == null) {
            return;
        }
        int[] iArrC = c(layoutManager, viewF);
        int i12 = iArrC[0];
        if (i12 == 0 && iArrC[1] == 0) {
            return;
        }
        this.f53728a.C0(i12, iArrC[1]);
    }
}
