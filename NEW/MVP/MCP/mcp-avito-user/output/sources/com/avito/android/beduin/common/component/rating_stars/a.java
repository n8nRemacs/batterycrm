package com.avito.android.beduin.common.component.rating_stars;

import Y61.k;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.beduin.common.component.h;
import com.avito.android.beduin.common.utils.v;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.lib.design.rating.RatingBar;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import sK0.C48063a;

/* compiled from: BeduinRatingStarsComponent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/rating_stars/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/rating_stars/BeduinRatingStarsModel;", "Lcom/avito/android/lib/design/rating/RatingBar;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends h<BeduinRatingStarsModel, RatingBar> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final C3061a f102250f = new C3061a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final List<String> f102251g = Collections.singletonList("ratingStars");

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final Class<BeduinRatingStarsModel> f102252h = BeduinRatingStarsModel.class;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final BeduinRatingStarsModel f102253e;

    /* compiled from: BeduinRatingStarsComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/rating_stars/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.rating_stars.a$a, reason: collision with other inner class name */
    public static final class C3061a implements com.avito.android.beduin.common.component.b {
        public /* synthetic */ C3061a(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<BeduinRatingStarsModel> S() {
            return a.f102252h;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return a.f102251g;
        }

        public C3061a() {
        }
    }

    public a(@k BeduinRatingStarsModel beduinRatingStarsModel) {
        this.f102253e = beduinRatingStarsModel;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f102253e;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        RatingBar ratingBar = new RatingBar(viewGroup.getContext(), null, 0, 6, null);
        ratingBar.setId(View.generateViewId());
        ratingBar.setLayoutParams(layoutParams);
        return ratingBar;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        RatingBar ratingBar = (RatingBar) view;
        ratingBar.setFloatingRatingIsEnabled(true);
        BeduinRatingStarsModel beduinRatingStarsModel = this.f102253e;
        Integer iconsAmount = beduinRatingStarsModel.getIconsAmount();
        ratingBar.setNumStars(iconsAmount != null ? iconsAmount.intValue() : ratingBar.getNumStars());
        ratingBar.setRating((float) beduinRatingStarsModel.getRating());
        int iD2 = C35835l0.d(R.attr.warmGray12, ratingBar.getContext());
        int iD3 = C35835l0.d(R.attr.orange, ratingBar.getContext());
        if (beduinRatingStarsModel.getOnColor() != null) {
            iD3 = C48063a.f437606a.a(ratingBar.getContext(), beduinRatingStarsModel.getOnColor());
        }
        ratingBar.setSelectedColor(iD3);
        if (beduinRatingStarsModel.getOffColor() != null) {
            iD2 = C48063a.f437606a.a(ratingBar.getContext(), beduinRatingStarsModel.getOffColor());
        }
        ratingBar.setUnselectedColor(iD2);
        Drawable drawable = ratingBar.getContext().getDrawable(R.drawable.design_rating_star_large);
        Drawable drawableC = v.c(ratingBar.getContext(), beduinRatingStarsModel.getIcon(), null);
        if (drawableC == null) {
            drawableC = drawable;
        }
        ratingBar.setSelectedDrawable(drawableC);
        Drawable drawableC2 = v.c(ratingBar.getContext(), beduinRatingStarsModel.getIcon(), null);
        if (drawableC2 != null) {
            drawable = drawableC2;
        }
        ratingBar.setUnselectedDrawable(drawable);
        Double interItemSpacing = beduinRatingStarsModel.getInterItemSpacing();
        ratingBar.setDividerWidthPx(interItemSpacing != null ? y6.b((int) interItemSpacing.doubleValue()) : ratingBar.getDividerWidthPx());
        ratingBar.setStarWidth(y6.d(beduinRatingStarsModel.getSize().getWidth()));
        ratingBar.setStarHeight(y6.d(beduinRatingStarsModel.getSize().getHeight()));
    }
}
