package com.avito.android.publish.slots.images_groups_recommendations.item;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.C23424o;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import com.avito.android.publish.slots.images_groups_recommendations.item.Title;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ImagesGroupsRecommendationsItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/images_groups_recommendations/item/k;", "Lcom/avito/android/publish/slots/images_groups_recommendations/item/j;", "Lcom/avito/konveyor/adapter/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class k extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f244224b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ShimmerLayout f244225c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.slots.images_groups_recommendations.item.a f244226d;

    /* compiled from: ImagesGroupsRecommendationsItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/publish/slots/images_groups_recommendations/item/k$a", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends GridLayoutManager.c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int f(int i12) {
            return 1;
        }
    }

    public k(@Y61.k View view, @Y61.k l lVar) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f244224b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.title_skeleton);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout");
        }
        this.f244225c = (ShimmerLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.recommendation_list);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById3;
        com.avito.android.publish.slots.images_groups_recommendations.item.a aVar = new com.avito.android.publish.slots.images_groups_recommendations.item.a(lVar);
        this.f244226d = aVar;
        recyclerView.setHasFixedSize(false);
        recyclerView.setAdapter(aVar);
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager != null) {
            gridLayoutManager.f53667M = new a();
        }
        recyclerView.l(new com.avito.android.photo_list_view_groups.a(), -1);
    }

    @Override // com.avito.android.publish.slots.images_groups_recommendations.item.j
    public final void QG(@Y61.k ArrayList arrayList) {
        com.avito.android.publish.slots.images_groups_recommendations.item.a aVar = this.f244226d;
        aVar.getClass();
        C23424o.a(new b(aVar, arrayList), false).b(aVar);
        aVar.f244208d = arrayList;
    }

    @Override // com.avito.android.publish.slots.images_groups_recommendations.item.j
    public final void zn(@Y61.k Title title) {
        boolean z12 = title instanceof Title.Content;
        TextView textView = this.f244224b;
        ShimmerLayout shimmerLayout = this.f244225c;
        if (z12) {
            I5.a(textView, ((Title.Content) title).f244205b, false);
            D6.w(shimmerLayout);
            shimmerLayout.d();
        } else if (title instanceof Title.Skeleton) {
            D6.w(textView);
            D6.H(shimmerLayout);
            shimmerLayout.c();
        }
    }
}
