package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: SearchPositionItemDecorator.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/d;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.a f220995b;

    /* renamed from: c, reason: collision with root package name */
    public final int f220996c = y6.b(8);

    /* renamed from: d, reason: collision with root package name */
    public final int f220997d = y6.b(40);

    /* renamed from: e, reason: collision with root package name */
    public final int f220998e = y6.b(16);

    /* renamed from: f, reason: collision with root package name */
    public final int f220999f = y6.b(20);

    /* renamed from: g, reason: collision with root package name */
    public final int f221000g = y6.b(28);

    /* renamed from: h, reason: collision with root package name */
    public final int f221001h = y6.b(28);

    /* renamed from: i, reason: collision with root package name */
    public final int f221002i = y6.b(28);

    /* renamed from: j, reason: collision with root package name */
    public final int f221003j = y6.b(12);

    /* renamed from: k, reason: collision with root package name */
    public final int f221004k = y6.b(24);

    /* renamed from: l, reason: collision with root package name */
    public final int f221005l = y6.b(24);

    /* renamed from: m, reason: collision with root package name */
    public final int f221006m = y6.b(12);

    /* renamed from: n, reason: collision with root package name */
    public final int f221007n = y6.b(12);

    /* renamed from: o, reason: collision with root package name */
    public final int f221008o = y6.b(16);

    /* renamed from: p, reason: collision with root package name */
    public final int f221009p = y6.b(28);

    /* renamed from: q, reason: collision with root package name */
    public final int f221010q = y6.b(12);

    /* renamed from: r, reason: collision with root package name */
    public final int f221011r = y6.b(28);

    /* renamed from: s, reason: collision with root package name */
    public final int f221012s = y6.b(28);

    /* renamed from: t, reason: collision with root package name */
    public final int f221013t = y6.b(16);

    /* renamed from: u, reason: collision with root package name */
    public final int f221014u = y6.b(24);

    /* renamed from: v, reason: collision with root package name */
    public final int f221015v = y6.b(16);

    /* renamed from: w, reason: collision with root package name */
    public final int f221016w = y6.b(32);

    /* renamed from: x, reason: collision with root package name */
    public final int f221017x = y6.b(16);

    public d(@k com.avito.konveyor.a aVar) {
        this.f220995b = aVar;
    }

    public final TV0.b c(int i12, RecyclerView recyclerView) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null || i12 < 0 || i12 >= adapter.getItemCount()) {
            return null;
        }
        TV0.b<?, ?> bVar = this.f220995b.f338492b.get(Integer.valueOf(adapter.getItemViewType(i12)));
        return bVar != null ? bVar : null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        TV0.b<?, ?> bVarC;
        TV0.b bVarC2;
        TV0.b bVarC3;
        super.getItemOffsets(rect, view, recyclerView, zVar);
        RecyclerView.C cW2 = recyclerView.W(view);
        if (cW2 == null) {
            super.getItemOffsets(rect, view, recyclerView, zVar);
            return;
        }
        if (cW2.getBindingAdapterPosition() != -1) {
            bVarC = c(cW2.getBindingAdapterPosition(), recyclerView);
            bVarC2 = c(cW2.getBindingAdapterPosition() - 1, recyclerView);
            bVarC3 = c(cW2.getBindingAdapterPosition() + 1, recyclerView);
        } else {
            TV0.b<?, ?> bVar = this.f220995b.f338492b.get(Integer.valueOf(cW2.getItemViewType()));
            if (bVar == null) {
                bVar = null;
            }
            bVarC = bVar;
            bVarC2 = c(cW2.getOldPosition() - 1, recyclerView);
            bVarC3 = c(cW2.getOldPosition(), recyclerView);
        }
        if (bVarC2 != null) {
            if (bVarC instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.banner.a) {
                if (bVarC2 instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.position.b) {
                    rect.top = this.f220998e;
                } else {
                    rect.setEmpty();
                }
            } else if (bVarC instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.period.b) {
                if (bVarC2 instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.banner.a) {
                    rect.top = this.f220999f;
                } else {
                    rect.setEmpty();
                }
            } else if (bVarC instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.position.b) {
                if (bVarC2 instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.period.b) {
                    rect.top = this.f221000g;
                } else {
                    rect.setEmpty();
                }
            } else if (bVarC instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_header.b) {
                if (bVarC2 instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.position.b) {
                    rect.top = this.f221001h;
                } else if (bVarC2 instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.banner.a) {
                    rect.top = this.f221002i;
                } else {
                    rect.setEmpty();
                }
            } else if (bVarC instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_header_info.b) {
                if (bVarC2 instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_header.b) {
                    rect.top = this.f221014u;
                } else if (bVarC2 instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.sort.b) {
                    rect.top = this.f221013t;
                } else {
                    rect.setEmpty();
                }
            } else if (bVarC instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query.b) {
                if (bVarC2 instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_header.b) {
                    rect.top = this.f221003j;
                } else if (bVarC2 instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_link.b) {
                    rect.top = this.f221004k;
                } else if (bVarC2 instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.stat.b) {
                    rect.top = this.f221005l;
                } else {
                    rect.setEmpty();
                }
            } else if (bVarC instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_link.b) {
                if (bVarC2 instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.stat.b) {
                    rect.top = this.f221006m;
                } else {
                    rect.setEmpty();
                }
            } else if (bVarC instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.stat.b) {
                if (bVarC2 instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.stat.b) {
                    rect.top = this.f221007n;
                } else {
                    rect.setEmpty();
                }
            } else if (bVarC instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.next_page.b) {
                boolean z12 = bVarC2 instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_link.b;
                int i12 = this.f221008o;
                if (z12 || (bVarC2 instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query.b)) {
                    rect.top = i12;
                } else {
                    rect.setEmpty();
                }
            } else if (bVarC instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.chart_dynamic.a) {
                if (bVarC2 instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.chart_dynamic.a) {
                    rect.top = this.f221009p;
                } else {
                    rect.setEmpty();
                }
            } else if (bVarC instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.skeleton.b) {
                if (bVarC2 instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_header.b) {
                    rect.top = this.f221010q;
                } else if (bVarC2 instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.period.b) {
                    rect.top = this.f221011r;
                } else {
                    rect.setEmpty();
                }
            } else if (bVarC instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.placeholder.b) {
                if (bVarC2 instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.period.b) {
                    rect.top = this.f221012s;
                } else {
                    rect.setEmpty();
                }
            } else if (bVarC instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.sort.b) {
                if (bVarC2 instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_header.b) {
                    rect.top = this.f221015v;
                } else {
                    rect.setEmpty();
                }
            } else if (bVarC instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.competitors.c) {
                if (bVarC2 instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query.b ? true : bVarC2 instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_link.b) {
                    rect.top = this.f221016w;
                } else {
                    rect.setEmpty();
                }
            } else {
                super.getItemOffsets(rect, view, recyclerView, zVar);
            }
            boolean z13 = bVarC instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.skeleton.b;
            if (!(bVarC instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.chart_dynamic.a) && !z13) {
                int i13 = this.f221017x;
                rect.left = i13;
                rect.right = i13;
            }
        } else {
            rect.top = this.f220996c;
        }
        if (bVarC3 == null) {
            rect.bottom = this.f220997d;
        }
    }
}
