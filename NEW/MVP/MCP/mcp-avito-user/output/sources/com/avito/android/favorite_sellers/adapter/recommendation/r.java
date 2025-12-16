package com.avito.android.favorite_sellers.adapter.recommendation;

import android.os.Parcelable;
import com.avito.android.favorite_sellers.RecommendationItem;
import kotlin.Metadata;

/* compiled from: RecommendationItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/os/Parcelable;", "it", "Lkotlin/G0;", "accept", "(Landroid/os/Parcelable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class r<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecommendationItem f155686b;

    public r(RecommendationItem recommendationItem) {
        this.f155686b = recommendationItem;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        this.f155686b.f155463f = (Parcelable) obj;
    }
}
