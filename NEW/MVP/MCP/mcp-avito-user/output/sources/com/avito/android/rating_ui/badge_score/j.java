package com.avito.android.rating_ui.badge_score;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.avito.android.R;
import com.avito.android.rating_ui.RatingItemsMarginHorizontal;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: RatingBadgeScoreItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_ui/badge_score/j;", "Lcom/avito/android/rating_ui/badge_score/i;", "Lcom/avito/konveyor/adapter/b;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final CardView f249970b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f249971c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f249972d;

    public j(@Y61.k View view) {
        super(view);
        this.f249970b = (CardView) view.findViewById(R.id.rating_badge_score_container);
        this.f249971c = (TextView) view.findViewById(R.id.rating_badge_score);
        this.f249972d = (TextView) view.findViewById(R.id.rating_badge_caption);
    }

    @Override // com.avito.android.rating_ui.badge_score.i
    public final void E(@Y61.k RatingItemsMarginHorizontal ratingItemsMarginHorizontal) {
        int dimension = (int) this.itemView.getResources().getDimension(ratingItemsMarginHorizontal.H0());
        D6.c(this.itemView, Integer.valueOf(dimension), null, Integer.valueOf(dimension), null, 10);
    }

    @Override // com.avito.android.rating_ui.badge_score.i
    public final void MJ(@Y61.k String str) {
        this.f249972d.setText(str);
    }

    @Override // com.avito.android.rating_ui.badge_score.i
    public final void cN(@Y61.k com.avito.android.publish.slots.delivery_addresses.f fVar) {
        this.itemView.setOnClickListener(fVar);
    }

    @Override // com.avito.android.rating_ui.badge_score.i
    public final void e30(@Y61.k String str) {
        this.f249971c.setText(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.rating_ui.badge_score.i
    public final void gp(@Y61.l Float f12) {
        Context context = this.itemView.getContext();
        double dFloatValue = f12 != null ? f12.floatValue() : 0.0f;
        Q q12 = (dFloatValue < 1.0d || dFloatValue > 2.84d) ? (dFloatValue <= 2.84d || dFloatValue > 3.64d) ? (dFloatValue <= 3.64d || dFloatValue > 4.34d) ? (dFloatValue <= 4.34d || dFloatValue > 5.0d) ? new Q(Integer.valueOf(R.color.rating_badge_score_0), Integer.valueOf(R.color.rating_badge_score_caption_0)) : new Q(Integer.valueOf(R.color.rating_badge_score_4), Integer.valueOf(R.color.rating_badge_score_caption_4)) : new Q(Integer.valueOf(R.color.rating_badge_score_3), Integer.valueOf(R.color.rating_badge_score_caption_3)) : new Q(Integer.valueOf(R.color.rating_badge_score_2), Integer.valueOf(R.color.rating_badge_score_caption_2)) : new Q(Integer.valueOf(R.color.rating_badge_score_1), Integer.valueOf(R.color.rating_badge_score_caption_1));
        int iIntValue = ((Number) q12.f406619b).intValue();
        int iIntValue2 = ((Number) q12.f406620c).intValue();
        Integer numValueOf = Integer.valueOf(androidx.core.content.d.getColor(context, iIntValue));
        Integer numValueOf2 = Integer.valueOf(androidx.core.content.d.getColor(context, iIntValue2));
        int iIntValue3 = numValueOf.intValue();
        int iIntValue4 = numValueOf2.intValue();
        this.f249970b.setCardBackgroundColor(iIntValue3);
        this.f249972d.setTextColor(iIntValue4);
    }
}
