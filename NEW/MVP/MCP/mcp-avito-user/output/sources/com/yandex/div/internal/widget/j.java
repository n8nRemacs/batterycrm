package com.yandex.div.internal.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j.U;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PageItemDecoration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/internal/widget/j;", "Landroidx/recyclerview/widget/RecyclerView$l;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class j extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f370304b;

    /* renamed from: c, reason: collision with root package name */
    public final int f370305c;

    /* renamed from: d, reason: collision with root package name */
    public final int f370306d;

    /* renamed from: e, reason: collision with root package name */
    public final int f370307e;

    /* renamed from: f, reason: collision with root package name */
    public final int f370308f;

    /* renamed from: g, reason: collision with root package name */
    public final int f370309g;

    /* renamed from: h, reason: collision with root package name */
    public final int f370310h;

    /* renamed from: i, reason: collision with root package name */
    public final int f370311i;

    @X41.j
    public j() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 127, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        boolean z12 = false;
        boolean z13 = adapter != null && adapter.getItemCount() == 2;
        boolean z14 = recyclerView.getLayoutManager() != null && RecyclerView.m.t0(view) == 0;
        if (recyclerView.getLayoutManager() != null && RecyclerView.m.t0(view) == recyclerView.getAdapter().getItemCount() - 1) {
            z12 = true;
        }
        int i12 = this.f370310h;
        int i13 = this.f370308f;
        int i14 = this.f370306d;
        int i15 = this.f370311i;
        int i16 = this.f370307e;
        int i17 = this.f370305c;
        int i18 = this.f370309g;
        int i19 = this.f370304b;
        if (i19 == 0) {
            if (z14) {
                i15 = i17;
            } else if (!z12 || z13) {
                i15 = i18;
            }
            if (z12) {
                i12 = i14;
            } else if (!z14 || z13) {
                i12 = i18;
            }
            rect.set(i15, i16, i12, i13);
            return;
        }
        if (i19 != 1) {
            int i22 = com.yandex.div.internal.n.f370123a;
            return;
        }
        if (z14) {
            i15 = i16;
        } else if (!z12 || z13) {
            i15 = i18;
        }
        if (z12) {
            i12 = i13;
        } else if (!z14 || z13) {
            i12 = i18;
        }
        rect.set(i17, i15, i14, i12);
    }

    public /* synthetic */ j(float f12, float f13, float f14, float f15, float f16, float f17, int i12, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? 0.0f : f12, (i13 & 2) != 0 ? 0.0f : f13, (i13 & 4) != 0 ? 0.0f : f14, (i13 & 8) != 0 ? 0.0f : f15, (i13 & 16) != 0 ? 0.0f : f16, (i13 & 32) == 0 ? f17 : 0.0f, (i13 & 64) != 0 ? 0 : i12);
    }

    @X41.j
    public j(@U float f12, @U float f13, @U float f14, @U float f15, @U float f16, @U float f17, int i12) {
        int iB2;
        this.f370304b = i12;
        this.f370305c = kotlin.math.b.b(f12);
        this.f370306d = kotlin.math.b.b(f13);
        this.f370307e = kotlin.math.b.b(f14);
        this.f370308f = kotlin.math.b.b(f15);
        float f18 = f16 + f17;
        this.f370309g = kotlin.math.b.b(f18);
        int iB3 = 0;
        if (i12 != 0) {
            iB2 = i12 != 1 ? 0 : kotlin.math.b.b((2 * f18) - f15);
        } else {
            iB2 = kotlin.math.b.b((2 * f18) - f12);
        }
        this.f370310h = iB2;
        if (i12 == 0) {
            iB3 = kotlin.math.b.b((f18 * 2) - f13);
        } else if (i12 == 1) {
            iB3 = kotlin.math.b.b((f18 * 2) - f14);
        }
        this.f370311i = iB3;
    }
}
