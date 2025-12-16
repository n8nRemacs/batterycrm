package com.avito.android.publish.slots.images_groups_recommendations.item;

import androidx.recyclerview.widget.C23424o;
import com.avito.android.publish.slots.images_groups_recommendations.item.Recommendation;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImagesGroupsRecommendationsAdapter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/images_groups_recommendations/item/b;", "Landroidx/recyclerview/widget/o$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b extends C23424o.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f244209a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f244210b;

    public b(a aVar, ArrayList arrayList) {
        this.f244209a = aVar;
        this.f244210b = arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.C23424o.b
    public final boolean areContentsTheSame(int i12, int i13) {
        Recommendation recommendation = (Recommendation) this.f244209a.f244208d.get(i12);
        Recommendation recommendation2 = (Recommendation) this.f244210b.get(i13);
        if ((recommendation instanceof Recommendation.Content) && (recommendation2 instanceof Recommendation.Content)) {
            return L.f(recommendation, recommendation2);
        }
        if (recommendation instanceof Recommendation.Skeleton) {
            boolean z12 = recommendation2 instanceof Recommendation.Skeleton;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.C23424o.b
    public final boolean areItemsTheSame(int i12, int i13) {
        return L.f(((Recommendation) this.f244209a.f244208d.get(i12)).getF244204b(), ((Recommendation) this.f244210b.get(i13)).getF244204b());
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final int getNewListSize() {
        return this.f244210b.size();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.C23424o.b
    public final int getOldListSize() {
        return this.f244209a.f244208d.size();
    }
}
