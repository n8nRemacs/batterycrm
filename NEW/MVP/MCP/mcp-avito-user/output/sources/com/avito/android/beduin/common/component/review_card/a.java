package com.avito.android.beduin.common.component.review_card;

import Ui.InterfaceC15523b;
import Y61.k;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.beduin.common.component.h;
import com.avito.android.beduin.common.component.l;
import com.avito.android.beduin.common.utils.I;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.lib.design.rating.RatingBar;
import com.avito.android.util.I5;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinReviewCardComponent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/review_card/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/review_card/BeduinReviewCardModel;", "Lcom/avito/android/beduin/common/component/review_card/f;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends h<BeduinReviewCardModel, f> {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final C3065a f102362g = new C3065a(null);

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final List<String> f102363h = Collections.singletonList("reviewCard");

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final Class<BeduinReviewCardModel> f102364i = BeduinReviewCardModel.class;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final BeduinReviewCardModel f102365e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f102366f;

    /* compiled from: BeduinReviewCardComponent.kt */
    @l
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/review_card/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.review_card.a$a, reason: collision with other inner class name */
    public static final class C3065a implements com.avito.android.beduin.common.component.b {
        public /* synthetic */ C3065a(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<BeduinReviewCardModel> S() {
            return a.f102364i;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return a.f102363h;
        }

        public C3065a() {
        }
    }

    public a(@k BeduinReviewCardModel beduinReviewCardModel, @k InterfaceC15523b<BeduinAction> interfaceC15523b) {
        this.f102365e = beduinReviewCardModel;
        this.f102366f = interfaceC15523b;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f102365e;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        f fVar = new f(viewGroup.getContext(), null, 0, 6, null);
        fVar.setLayoutParams(layoutParams);
        return fVar;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        f fVar = (f) view;
        BeduinReviewCardModel beduinReviewCardModel = this.f102365e;
        I.e(fVar, beduinReviewCardModel.getPadding());
        I.c(fVar, beduinReviewCardModel.getBackground(), false);
        I5.a(fVar.f102370b, beduinReviewCardModel.getTitle(), false);
        I5.a(fVar.f102371c, beduinReviewCardModel.getSubtitle(), false);
        Integer detailsMaxLinesCount = beduinReviewCardModel.getDetailsMaxLinesCount();
        int iIntValue = detailsMaxLinesCount != null ? detailsMaxLinesCount.intValue() : Integer.MAX_VALUE;
        TextView textView = fVar.f102372d;
        textView.setMaxLines(iIntValue);
        I5.a(textView, beduinReviewCardModel.getDetails(), false);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        I5.a(fVar.f102373e, beduinReviewCardModel.getFooterDescription(), false);
        I5.a(fVar.f102374f, beduinReviewCardModel.getExpandText(), false);
        textView.post(new com.avito.android.app.coldstart.d(fVar, 8));
        RatingBar ratingBar = fVar.f102375g;
        ratingBar.setFloatingRatingIsEnabled(true);
        Float rating = beduinReviewCardModel.getRating();
        ratingBar.setRating(rating != null ? rating.floatValue() : 0.0f);
        fVar.setExpandClickListener(new b(this));
    }
}
