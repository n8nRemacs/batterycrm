package com.yandex.div.internal.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import j.U;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PaddingItemDecoration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/internal/widget/i;", "Landroidx/recyclerview/widget/RecyclerView$l;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class i extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    @U
    public final int f370275b;

    /* renamed from: c, reason: collision with root package name */
    @U
    public final int f370276c;

    /* renamed from: d, reason: collision with root package name */
    @U
    public final int f370277d;

    /* renamed from: e, reason: collision with root package name */
    @U
    public final int f370278e;

    /* renamed from: f, reason: collision with root package name */
    @U
    public final int f370279f;

    /* renamed from: g, reason: collision with root package name */
    @U
    public final int f370280g;

    /* renamed from: h, reason: collision with root package name */
    public final int f370281h;

    @X41.j
    public i() {
        this(0, 0, 0, 0, 0, 0, 0, 127, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        int i12;
        int i13;
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            i12 = ((StaggeredGridLayoutManager) layoutManager).f53918r;
        } else {
            if (!(layoutManager instanceof LinearLayoutManager)) {
                int i14 = com.yandex.div.internal.n.f370123a;
            }
            i12 = 1;
        }
        int i15 = this.f370281h;
        int i16 = this.f370276c;
        if (i12 != 1) {
            int i17 = i16 / 2;
            int i18 = this.f370277d / 2;
            if (i15 == 0) {
                rect.set(i17, i18, i17, i18);
                return;
            } else if (i15 != 1) {
                int i19 = com.yandex.div.internal.n.f370123a;
                return;
            } else {
                rect.set(i18, i17, i18, i17);
                return;
            }
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        Integer numValueOf = adapter == null ? null : Integer.valueOf(adapter.getItemCount());
        if (numValueOf == null) {
            return;
        }
        int iIntValue = numValueOf.intValue();
        Integer numValueOf2 = recyclerView.getLayoutManager() != null ? Integer.valueOf(RecyclerView.m.t0(view)) : null;
        if (numValueOf2 == null) {
            return;
        }
        int iIntValue2 = numValueOf2.intValue();
        boolean z12 = iIntValue2 == 0;
        boolean z13 = iIntValue2 == iIntValue - 1;
        int i22 = this.f370280g;
        int i23 = this.f370278e;
        int i24 = this.f370279f;
        int i25 = this.f370275b;
        if (i15 == 0) {
            i13 = z12 ? i25 : 0;
            if (z13) {
                i16 = i23;
            }
            rect.set(i13, i24, i16, i22);
            return;
        }
        if (i15 != 1) {
            int i26 = com.yandex.div.internal.n.f370123a;
            return;
        }
        i13 = z12 ? i24 : 0;
        if (z13) {
            i16 = i22;
        }
        rect.set(i25, i13, i23, i16);
    }

    public i(int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, C42822w c42822w) {
        i12 = (i19 & 1) != 0 ? 0 : i12;
        i13 = (i19 & 2) != 0 ? 0 : i13;
        i14 = (i19 & 4) != 0 ? 0 : i14;
        i15 = (i19 & 8) != 0 ? 0 : i15;
        i16 = (i19 & 16) != 0 ? 0 : i16;
        i17 = (i19 & 32) != 0 ? 0 : i17;
        i18 = (i19 & 64) != 0 ? 0 : i18;
        this.f370275b = i12;
        this.f370276c = i13;
        this.f370277d = i14;
        this.f370278e = i15;
        this.f370279f = i16;
        this.f370280g = i17;
        this.f370281h = i18;
    }
}
