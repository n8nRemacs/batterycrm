package com.avito.android.beduin.common.component.rating;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.rating.RatingBar;
import com.avito.android.util.C35852n1;
import com.avito.android.util.I5;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinRatingStatsHeaderLayout.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/beduin/common/component/rating/d;", "Landroid/widget/LinearLayout;", "", "score", "Lkotlin/G0;", "setScore", "(F)V", "", "description", "setSubtitle", "(Ljava/lang/CharSequence;)V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f102246b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final RatingBar f102247c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f102248d;

    public d(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        LayoutInflater.from(context).inflate(R.layout.beduin_component_rating_stats_header, (ViewGroup) this, true);
        this.f102246b = (TextView) findViewById(R.id.rating_text);
        RatingBar ratingBar = (RatingBar) findViewById(R.id.rating_stars);
        this.f102247c = ratingBar;
        ratingBar.setFloatingRatingIsEnabled(true);
        this.f102248d = (TextView) findViewById(R.id.rating_subtitle);
    }

    public final void setScore(float score) {
        this.f102247c.setRating(score);
        this.f102246b.setText(C35852n1.a(score));
    }

    public final void setSubtitle(@l CharSequence description) {
        I5.a(this.f102248d, description, false);
    }
}
