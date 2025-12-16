package com.avito.android.beduin.common.component.rating_stats;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.beduin.common.component.h;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.rating_ui.rating_stat.RatingStatEntry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinRatingStatsComponent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/rating_stats/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/rating_stats/BeduinRatingStatsModel;", "Lcom/avito/android/beduin/common/component/rating_stats/d;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends h<BeduinRatingStatsModel, d> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final C3062a f102256f = new C3062a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final List<String> f102257g = Collections.singletonList("ratingStats");

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final Class<BeduinRatingStatsModel> f102258h = BeduinRatingStatsModel.class;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final BeduinRatingStatsModel f102259e;

    /* compiled from: BeduinRatingStatsComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/rating_stats/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.rating_stats.a$a, reason: collision with other inner class name */
    public static final class C3062a implements com.avito.android.beduin.common.component.b {
        public /* synthetic */ C3062a(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<BeduinRatingStatsModel> S() {
            return a.f102258h;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return a.f102257g;
        }

        public C3062a() {
        }
    }

    public a(@k BeduinRatingStatsModel beduinRatingStatsModel) {
        this.f102259e = beduinRatingStatsModel;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f102259e;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        d dVar = new d(viewGroup.getContext(), null, 2, null);
        dVar.setId(View.generateViewId());
        dVar.setLayoutParams(layoutParams);
        return dVar;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        int iIntValue;
        d dVar = (d) view;
        BeduinRatingStatsModel beduinRatingStatsModel = this.f102259e;
        Integer reviewCount = beduinRatingStatsModel.getReviewCount();
        List<BeduinRating> ratings = beduinRatingStatsModel.getRatings();
        if (reviewCount != null) {
            iIntValue = reviewCount.intValue();
        } else {
            Iterator<T> it = ratings.iterator();
            int count = 0;
            while (it.hasNext()) {
                count += ((BeduinRating) it.next()).getCount();
            }
            iIntValue = count;
        }
        List<BeduinRating> list = ratings;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (BeduinRating beduinRating : list) {
            arrayList.add(new RatingStatEntry(beduinRating.getScore(), beduinRating.getCount() / iIntValue, beduinRating.getTitle()));
        }
        dVar.f102261b.a(arrayList);
    }
}
