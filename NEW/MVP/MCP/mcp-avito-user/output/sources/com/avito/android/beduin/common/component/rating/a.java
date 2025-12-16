package com.avito.android.beduin.common.component.rating;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.beduin.common.component.h;
import com.avito.android.beduin_models.BeduinModel;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinRatingStatsHeaderComponent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/rating/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/rating/BeduinRatingStatsHeaderModel;", "Lcom/avito/android/beduin/common/component/rating/d;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends h<BeduinRatingStatsHeaderModel, d> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final C3060a f102241f = new C3060a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final List<String> f102242g = Collections.singletonList("ratingStatsHeader");

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final Class<BeduinRatingStatsHeaderModel> f102243h = BeduinRatingStatsHeaderModel.class;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final BeduinRatingStatsHeaderModel f102244e;

    /* compiled from: BeduinRatingStatsHeaderComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/rating/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.rating.a$a, reason: collision with other inner class name */
    public static final class C3060a implements com.avito.android.beduin.common.component.b {
        public /* synthetic */ C3060a(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<BeduinRatingStatsHeaderModel> S() {
            return a.f102243h;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return a.f102242g;
        }

        public C3060a() {
        }
    }

    public a(@k BeduinRatingStatsHeaderModel beduinRatingStatsHeaderModel) {
        this.f102244e = beduinRatingStatsHeaderModel;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f102244e;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        d dVar = new d(viewGroup.getContext(), null, 0, 6, null);
        dVar.setId(View.generateViewId());
        dVar.setLayoutParams(layoutParams);
        return dVar;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        d dVar = (d) view;
        BeduinRatingStatsHeaderModel beduinRatingStatsHeaderModel = this.f102244e;
        dVar.setScore(beduinRatingStatsHeaderModel.getScore());
        dVar.setSubtitle(beduinRatingStatsHeaderModel.getSubtitle());
    }
}
