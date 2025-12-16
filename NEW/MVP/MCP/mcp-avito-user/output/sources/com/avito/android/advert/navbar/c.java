package com.avito.android.advert.navbar;

import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AdvertDetailsNavBarContentScrollListener.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/navbar/c;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.a<View> f80807b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<Integer> f80808c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final List<Integer> f80809d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Float, G0> f80810e;

    /* renamed from: f, reason: collision with root package name */
    public float f80811f = -1.0f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final int[] f80812g = new int[2];

    /* renamed from: h, reason: collision with root package name */
    public int f80813h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f80814i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f80815j;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@Y61.k Y41.a<? extends View> aVar, @Y61.k List<Integer> list, @Y61.k List<Integer> list2, @Y61.k Y41.l<? super Float, G0> lVar) {
        this.f80807b = aVar;
        this.f80808c = list;
        this.f80809d = list2;
        this.f80810e = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void k(@Y61.k RecyclerView recyclerView, int i12, int i13) {
        int i14;
        if (this.f80815j >= 10) {
            recyclerView.v0(this);
            return;
        }
        int i15 = 0;
        if (this.f80813h == -1 || this.f80814i == -1) {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter == null || adapter.getItemCount() == 0) {
                return;
            }
            int i16 = 0;
            while (true) {
                if (i16 >= 10) {
                    break;
                }
                int itemViewType = adapter.getItemViewType(i16);
                if (this.f80808c.contains(Integer.valueOf(itemViewType))) {
                    this.f80813h = i16;
                }
                if (this.f80809d.contains(Integer.valueOf(itemViewType))) {
                    this.f80814i = i16 + 1;
                    break;
                }
                i16++;
            }
            this.f80815j++;
            if (this.f80813h == -1 || this.f80814i == -1) {
                return;
            }
        }
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        if (linearLayoutManager.K1() < this.f80813h) {
            l(0.0f);
            return;
        }
        if (linearLayoutManager.K1() >= this.f80814i) {
            l(1.0f);
            return;
        }
        View viewInvoke = this.f80807b.invoke();
        if (viewInvoke == null || viewInvoke.getHeight() == 0) {
            return;
        }
        int[] iArr = this.f80812g;
        viewInvoke.getLocationOnScreen(iArr);
        int height = viewInvoke.getHeight() + iArr[1];
        View viewZ = linearLayoutManager.Z(this.f80813h);
        View viewZ2 = linearLayoutManager.Z(this.f80814i);
        if (viewZ != null) {
            viewZ.getLocationOnScreen(iArr);
            i14 = iArr[1];
        } else {
            i14 = 0;
        }
        if (viewZ2 != null) {
            viewZ2.getLocationOnScreen(iArr);
            i15 = iArr[1];
        }
        l(kotlin.ranges.s.f((height - i14) / (i15 - i14), 0.0f, 1.0f));
    }

    public final void l(float f12) {
        if (f12 == this.f80811f) {
            return;
        }
        this.f80811f = f12;
        this.f80810e.invoke(Float.valueOf(f12));
    }
}
