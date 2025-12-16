package com.avito.android.rating_ui.badge_score;

import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RatingBadgeScoreShowedItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/badge_score/k;", "", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final a f249973a;

    public k(@Y61.k a aVar) {
        this.f249973a = aVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && L.f(this.f249973a, ((k) obj).f249973a);
    }

    public final int hashCode() {
        return this.f249973a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "RatingBadgeScoreShowedItem(item=" + this.f249973a + ')';
    }
}
