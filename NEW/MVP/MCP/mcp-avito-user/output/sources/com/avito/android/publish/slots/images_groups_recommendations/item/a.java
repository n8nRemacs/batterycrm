package com.avito.android.publish.slots.images_groups_recommendations.item;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.Q1;
import com.avito.android.R;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: ImagesGroupsRecommendationsAdapter.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/images_groups_recommendations/item/a;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/avito/android/publish/slots/images_groups_recommendations/item/p;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a extends RecyclerView.Adapter<p> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final l f244207c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public Object f244208d = C42784z0.f406748b;

    /* compiled from: ImagesGroupsRecommendationsAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/images_groups_recommendations/item/a$a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.slots.images_groups_recommendations.item.a$a, reason: collision with other inner class name */
    public interface InterfaceC7316a {
    }

    public a(@Y61.k l lVar) {
        this.f244207c = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return ((Collection) this.f244208d).size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i12) {
        return !this.f244208d.get(i12).getClass().getSimpleName().equals(d.f244212a) ? 1 : 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12) {
        ((p) c12).B80((Recommendation) this.f244208d.get(i12));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        c cVar = new c(viewGroup);
        l lVar = this.f244207c;
        if (i12 == 0) {
            Q1 q12 = lVar.f244229c;
            q12.getClass();
            kotlin.reflect.n<Object> nVar = Q1.f67448x0[67];
            return new o((View) cVar.invoke(Integer.valueOf(((Boolean) q12.f67485f0.a().invoke()).booleanValue() ? R.layout.images_groups_recommendation_item_redesigned : R.layout.images_groups_recommendation_item_legacy)), lVar.f244227a, lVar.f244228b);
        }
        Q1 q13 = lVar.f244229c;
        q13.getClass();
        kotlin.reflect.n<Object> nVar2 = Q1.f67448x0[67];
        return new n((View) cVar.invoke(Integer.valueOf(((Boolean) q13.f67485f0.a().invoke()).booleanValue() ? R.layout.images_groups_recommendation_item_skeleton_redesigned : R.layout.images_groups_recommendation_item_skeleton_legacy)));
    }
}
