package com.avito.android.comparison;

import Qq.InterfaceC14923a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import io.reactivex.rxjava3.core.z;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: OverlayController.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comparison/s;", "LQq/b;", "a", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class s implements Qq.b {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f124200h = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f124201a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f124202b;

    /* renamed from: c, reason: collision with root package name */
    public RecyclerView.C f124203c;

    /* renamed from: d, reason: collision with root package name */
    public int f124204d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final float f124205e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f124206f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f124207g;

    /* compiled from: OverlayController.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/comparison/s$a;", "", "<init>", "()V", "", "NO_PINNED_POSITION", "I", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: OverlayController.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/comparison/s$b", "Landroidx/recyclerview/widget/RecyclerView$g;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends RecyclerView.g {

        /* compiled from: OverlayController.kt */
        @s0
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/comparison/t", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ View f124209b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ s f124210c;

            public a(View view, s sVar) {
                this.f124209b = view;
                this.f124210c = sVar;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                RecyclerView.Adapter adapter;
                View view = this.f124209b;
                if (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) {
                    return;
                }
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                RecyclerView recyclerView = (RecyclerView) view;
                s sVar = this.f124210c;
                if (sVar.f124204d == -1 || (adapter = recyclerView.getAdapter()) == null) {
                    return;
                }
                sVar.f124203c = adapter.onCreateViewHolder(sVar.f124201a, adapter.getItemViewType(sVar.f124204d));
                sVar.a();
                sVar.b();
                sVar.d();
            }
        }

        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void a() {
            s sVar = s.this;
            RecyclerView recyclerView = sVar.f124202b;
            recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new a(recyclerView, sVar));
        }
    }

    /* compiled from: OverlayController.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/comparison/s$c", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends RecyclerView.r {
        public c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void k(@Y61.k RecyclerView recyclerView, int i12, int i13) {
            if (i12 != 0) {
                s sVar = s.this;
                if (sVar.f124203c != null) {
                    sVar.d();
                }
            }
        }
    }

    static {
        new a(null);
    }

    public s(@Y61.k FrameLayout frameLayout, @Y61.k RecyclerView recyclerView, @Y61.k z<Integer> zVar) {
        this.f124201a = frameLayout;
        this.f124202b = recyclerView;
        this.f124205e = recyclerView.getContext().getResources().getDimension(R.dimen.comparison_column_width);
        b bVar = new b();
        recyclerView.o(new c());
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.registerAdapterDataObserver(bVar);
        }
        zVar.j0(io.reactivex.rxjava3.android.schedulers.b.b()).u0(new l41.g() { // from class: com.avito.android.comparison.u
            @Override // l41.g
            public final void accept(Object obj) {
                int iIntValue = ((Number) obj).intValue();
                s sVar = this.f124231b;
                sVar.f124204d = iIntValue;
                if (iIntValue == -1) {
                    sVar.f124201a.removeAllViews();
                } else if (sVar.f124202b.f53799t) {
                    sVar.e();
                }
            }
        }, new v(this));
    }

    public final void a() {
        RecyclerView.C c12 = this.f124203c;
        if (c12 == null) {
            c12 = null;
        }
        View view = c12.itemView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        FrameLayout frameLayout = this.f124201a;
        layoutParams.height = frameLayout.getHeight();
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        frameLayout.addView(view);
    }

    public final void b() {
        RecyclerView.C c12 = this.f124203c;
        if (c12 == null) {
            c12 = null;
        }
        RecyclerView.Adapter adapter = this.f124202b.getAdapter();
        if (adapter != null) {
            adapter.onBindViewHolder(c12, this.f124204d);
        }
        c(this.f124206f, this.f124207g);
        Object obj = this.f124203c;
        if (obj == null) {
            obj = null;
        }
        InterfaceC14923a interfaceC14923a = obj instanceof InterfaceC14923a ? (InterfaceC14923a) obj : null;
        if (interfaceC14923a != null) {
            interfaceC14923a.dr();
        }
    }

    public final void c(boolean z12, boolean z13) {
        this.f124206f = z12;
        this.f124207g = z13;
        RecyclerView.C c12 = this.f124203c;
        if (c12 == null) {
            c12 = null;
        }
        InterfaceC14923a interfaceC14923a = c12 instanceof InterfaceC14923a ? (InterfaceC14923a) c12 : null;
        if (interfaceC14923a != null) {
            interfaceC14923a.oS(z12);
            interfaceC14923a.ey(z13);
        }
    }

    public final void d() {
        if (this.f124204d == -1) {
            return;
        }
        RecyclerView recyclerView = this.f124202b;
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        RecyclerView.C c12 = this.f124203c;
        View view = (c12 != null ? c12 : null).itemView;
        int iK1 = linearLayoutManager.K1();
        int iM1 = linearLayoutManager.M1();
        if (iK1 == -1 || iM1 == -1) {
            return;
        }
        RecyclerView.C cP2 = recyclerView.P(this.f124204d);
        int i12 = this.f124204d;
        float f12 = this.f124205e;
        if (iK1 <= i12 && i12 <= iM1 && cP2 != null) {
            view.setX(kotlin.ranges.s.f(cP2.itemView.getX(), recyclerView.getX(), recyclerView.getWidth() - f12));
        } else if (iM1 < i12) {
            view.setX(recyclerView.getWidth() - f12);
        } else {
            view.setX(recyclerView.getX());
        }
        int iH1 = linearLayoutManager.H1();
        int iL1 = linearLayoutManager.L1();
        int i13 = this.f124204d;
        if (iH1 <= i13 && i13 <= iL1) {
            c(false, false);
        } else if (i13 < iH1) {
            c(false, true);
        } else if (i13 > iL1) {
            c(true, false);
        }
    }

    public final void e() {
        RecyclerView recyclerView;
        RecyclerView.Adapter adapter;
        if (this.f124204d == -1 || (adapter = (recyclerView = this.f124202b).getAdapter()) == null) {
            return;
        }
        RecyclerView.C c12 = this.f124203c;
        FrameLayout frameLayout = this.f124201a;
        if (c12 != null) {
            int itemViewType = c12.getItemViewType();
            RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
            if (adapter2 != null && itemViewType == adapter2.getItemViewType(this.f124204d) && frameLayout.getChildCount() != 0) {
                b();
                d();
                return;
            }
        }
        this.f124203c = adapter.onCreateViewHolder(frameLayout, adapter.getItemViewType(this.f124204d));
        a();
        b();
        d();
    }
}
