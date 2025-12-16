package com.avito.android.rating_ui.score_with_statistic;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.rating.RatingBar;
import com.avito.android.rating_ui.RatingItemsMarginHorizontal;
import com.avito.android.rating_ui.rating_stat.RatingStatEntry;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35852n1;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import zh0.C50568b;

/* compiled from: RatingScoreWithStatisticItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_ui/score_with_statistic/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/rating_ui/score_with_statistic/h;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f250424b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final RatingBar f250425c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f250426d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f250427e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final C50568b f250428f;

    public i(@k View view) {
        super(view);
        this.f250424b = view;
        View viewFindViewById = view.findViewById(R.id.rating);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.rating.RatingBar");
        }
        this.f250425c = (RatingBar) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.rating_value);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f250426d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.rating_description);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f250427e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.rating_stat);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TableLayout");
        }
        this.f250428f = new C50568b((TableLayout) viewFindViewById4);
    }

    @Override // com.avito.android.rating_ui.score_with_statistic.h
    public final void E(@k RatingItemsMarginHorizontal ratingItemsMarginHorizontal) {
        int dimension = (int) this.itemView.getResources().getDimension(ratingItemsMarginHorizontal.H0());
        D6.c(this.itemView, Integer.valueOf(dimension), null, Integer.valueOf(dimension), null, 10);
    }

    @Override // com.avito.android.rating_ui.score_with_statistic.h
    public final void T(@l CharSequence charSequence) {
        I5.a(this.f250427e, charSequence, false);
    }

    @Override // com.avito.android.rating_ui.score_with_statistic.h
    public final void ny(@l List<RatingStatEntry> list) {
        C50568b c50568b = this.f250428f;
        if (list == null) {
            D6.G(c50568b.f444170a, false);
        } else {
            D6.G(c50568b.f444170a, true);
            c50568b.a(list);
        }
    }

    @Override // com.avito.android.rating_ui.score_with_statistic.h
    public final void vc(@l Float f12) {
        TextView textView = this.f250427e;
        RatingBar ratingBar = this.f250425c;
        TextView textView2 = this.f250426d;
        if (f12 == null) {
            D6.w(ratingBar);
            D6.w(textView2);
            D6.w(textView);
            return;
        }
        D6.H(ratingBar);
        D6.H(textView2);
        D6.H(textView);
        ratingBar.setFloatingRatingIsEnabled(true);
        ratingBar.setRating(f12.floatValue());
        textView2.setText(C35852n1.a(f12.floatValue()));
        textView2.setTextAppearance(C35835l0.j(R.attr.textH05, this.f250424b.getContext()));
        textView2.setTextSize(2, 58.0f);
        textView2.setFontFeatureSettings("tnum");
        textView2.setLetterSpacing(-0.06f);
    }
}
