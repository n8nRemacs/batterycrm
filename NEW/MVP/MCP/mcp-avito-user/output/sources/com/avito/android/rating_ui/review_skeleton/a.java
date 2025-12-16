package com.avito.android.rating_ui.review_skeleton;

import Y61.k;
import kotlin.Metadata;

/* compiled from: RatingReviewSkeletonItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/review_skeleton/a;", "Lcom/avito/conveyor_item/a;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f250119b;

    public a(@k String str) {
        this.f250119b = str;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF322725b() {
        return getF250119b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF250119b() {
        return this.f250119b;
    }
}
