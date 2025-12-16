package com.avito.android.ui.view;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.photo_picker.legacy.D;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PagerLayoutManager.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ui/view/PagerLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "a", "b", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PagerLayoutManager extends LinearLayoutManager {

    /* renamed from: G, reason: collision with root package name */
    public final int f304680G;

    /* renamed from: H, reason: collision with root package name */
    @l
    public D f304681H;

    /* renamed from: I, reason: collision with root package name */
    public final int f304682I;

    /* renamed from: J, reason: collision with root package name */
    public int f304683J;

    /* renamed from: K, reason: collision with root package name */
    public int f304684K;

    /* compiled from: PagerLayoutManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ui/view/PagerLayoutManager$a;", "", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerLayoutManager(Context context, int i12, int i13, C42822w c42822w) {
        super(0, false);
        i12 = (i13 & 2) != 0 ? 0 : i12;
        this.f304680G = i12;
        this.f304682I = (int) TypedValue.applyDimension(1, 10.0f, context.getResources().getDisplayMetrics());
        this.f304684K = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void H0(@k RecyclerView recyclerView) {
        recyclerView.setScrollingTouchSlop(1);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final void I0(@k RecyclerView recyclerView, @k RecyclerView.u uVar) {
        recyclerView.setScrollingTouchSlop(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void Z0(int i12) {
        int iH2;
        View viewZ;
        this.f304683J = i12;
        if (z0() || i12 != 0 || (iH2 = h2()) == -1 || (viewZ = Z(iH2)) == null) {
            return;
        }
        int iJ02 = RecyclerView.m.j0(viewZ);
        int iM02 = RecyclerView.m.m0(viewZ);
        if (iH2 == o0() - 1 && this.f53850p != iM02) {
            i2(iH2);
        } else if (iJ02 != this.f304680G) {
            i2(iH2);
        }
    }

    public final int h2() {
        int iK1 = K1();
        View viewZ = Z(iK1);
        if (viewZ != null) {
            return Math.abs(RecyclerView.m.j0(viewZ)) <= Math.abs(RecyclerView.m.m0(viewZ)) / 2 ? iK1 : iK1 + 1;
        }
        return -1;
    }

    public final void i2(int i12) {
        if (i12 == -1) {
            return;
        }
        x1(new b(i12, this.f304680G));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final int k1(int i12, @k RecyclerView.u uVar, @k RecyclerView.z zVar) {
        if (this.f304683J == 2 && !z0()) {
            int iK1 = K1();
            int i13 = this.f304682I;
            if (i12 > 0) {
                if (i12 > i13) {
                    i2(iK1 + 1);
                }
            } else if (i12 >= 0) {
                int iH2 = h2();
                if (iH2 != -1) {
                    i2(iH2);
                }
            } else if (i12 < (-i13)) {
                i2(iK1);
            }
        }
        int iH22 = h2();
        if (iH22 != this.f304684K && iH22 != -1) {
            this.f304684K = iH22;
            D d12 = this.f304681H;
            if (d12 != null) {
                d12.f219577a.f219579b.n(iH22);
            }
        }
        return super.k1(i12, uVar, zVar);
    }

    /* compiled from: PagerLayoutManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ui/view/PagerLayoutManager$b;", "Landroidx/recyclerview/widget/RecyclerView$y;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends RecyclerView.y {

        /* renamed from: h, reason: collision with root package name */
        public final int f304685h;

        /* renamed from: i, reason: collision with root package name */
        @k
        public final com.avito.android.ui.view.a f304686i = new com.avito.android.ui.view.a();

        public b(int i12, int i13) {
            this.f304685h = i13;
            this.f53878a = i12;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.y
        public final void e(@k View view, @k RecyclerView.y.a aVar) {
            int iJ02 = this.f53880c != null ? RecyclerView.m.j0(view) : 0;
            if (iJ02 != 0) {
                aVar.b(iJ02 - this.f304685h, 0, 600, this.f304686i);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.y
        public final void d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.y
        public final void c(int i12, int i13, @k RecyclerView.z zVar, @k RecyclerView.y.a aVar) {
        }
    }
}
