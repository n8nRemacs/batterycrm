package com.avito.android.rating.details.adapter;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.rating_ui.badge_score.i;
import com.avito.android.rating_ui.reviews.model_review.m;
import com.avito.android.rating_ui.reviews.review.o;
import com.avito.android.rating_ui.sort.g;
import com.avito.android.rating_ui.statistic.h;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RatingDetailsItemDecoration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/adapter/e;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f246508b;

    /* renamed from: c, reason: collision with root package name */
    public final int f246509c;

    /* renamed from: d, reason: collision with root package name */
    public final int f246510d;

    /* renamed from: e, reason: collision with root package name */
    public final int f246511e;

    /* renamed from: f, reason: collision with root package name */
    public final int f246512f;

    /* renamed from: g, reason: collision with root package name */
    public final int f246513g;

    /* renamed from: h, reason: collision with root package name */
    public final int f246514h;

    /* renamed from: i, reason: collision with root package name */
    public final int f246515i;

    @Inject
    public e(@k com.avito.konveyor.a aVar) {
        this.f246508b = aVar.Y(com.avito.android.rating_ui.score_with_statistic.c.class);
        this.f246509c = aVar.Y(com.avito.android.rating_ui.score_with_statistic.a.class);
        this.f246510d = aVar.Y(com.avito.android.rating_ui.info_with_hint.a.class);
        this.f246511e = aVar.Y(com.avito.android.rating_ui.lmm_summary.a.class);
        this.f246512f = aVar.Y(com.avito.android.rating_ui.aspects.b.class);
        this.f246513g = aVar.Y(com.avito.android.rating_ui.sort.b.class);
        this.f246514h = aVar.Y(com.avito.android.rating_ui.reviews.review.a.class);
        this.f246515i = aVar.Y(com.avito.android.rating_ui.reviews.model_review.b.class);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        int iB2;
        int iU2;
        recyclerView.getClass();
        boolean z12 = RecyclerView.U(view) == 0;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemViewType = -1;
        if (adapter != null && (iU2 = RecyclerView.U(view)) != -1 && iU2 != 0) {
            itemViewType = adapter.getItemViewType(iU2 - 1);
        }
        RecyclerView.C cW2 = recyclerView.W(view);
        if (cW2 instanceof i) {
            rect.top = y6.b(4);
            return;
        }
        if (cW2 instanceof h) {
            rect.top = y6.b(6);
            return;
        }
        boolean z13 = cW2 instanceof com.avito.android.rating_ui.lmm_summary.h;
        int i12 = this.f246509c;
        int i13 = this.f246508b;
        if (z13) {
            rect.top = (itemViewType == i13 || itemViewType == i12) ? y6.b(4) : y6.b(20);
            return;
        }
        if (cW2 instanceof com.avito.android.rating_ui.aspects.h) {
            rect.top = (itemViewType == i13 || itemViewType == i12) ? y6.b(5) : y6.b(20);
            return;
        }
        boolean z14 = cW2 instanceof g;
        int i14 = this.f246512f;
        int i15 = this.f246510d;
        if (z14) {
            rect.top = (itemViewType == i13 || itemViewType == i12 || itemViewType == i15) ? y6.b(3) : itemViewType == this.f246511e ? y6.b(28) : itemViewType == i14 ? y6.b(12) : y6.b(20);
            return;
        }
        if (cW2 instanceof o ? true : cW2 instanceof m) {
            rect.top = z12 ? y6.b(6) : (itemViewType == i13 || itemViewType == i12) ? y6.b(4) : itemViewType == i15 ? y6.b(22) : y6.b(20);
            rect.bottom = y6.b(4);
        } else if (cW2 instanceof com.avito.android.rating_ui.info_with_hint.g) {
            if (itemViewType == this.f246514h || itemViewType == this.f246515i) {
                iB2 = y6.b(14);
            } else {
                iB2 = itemViewType == i14 || itemViewType == this.f246513g ? y6.b(24) : rect.top;
            }
            rect.top = iB2;
        }
    }
}
