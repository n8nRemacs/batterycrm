package com.avito.android.rating_ui.statistic;

import Y61.k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.progress_bar.ProgressBar;
import com.avito.android.lib.design.rating.RatingBar;
import com.avito.android.rating_ui.RatingItemsMarginHorizontal;
import com.avito.android.util.D6;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RatingStatisticItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_ui/statistic/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/rating_ui/statistic/h;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TableLayout f250479b;

    /* renamed from: c, reason: collision with root package name */
    public final LayoutInflater f250480c;

    public i(@k View view) {
        super(view);
        TableLayout tableLayout = (TableLayout) view.findViewById(R.id.rating_statistic);
        this.f250479b = tableLayout;
        this.f250480c = LayoutInflater.from(tableLayout.getContext());
    }

    @Override // com.avito.android.rating_ui.statistic.h
    public final void E(@k RatingItemsMarginHorizontal ratingItemsMarginHorizontal) {
        int dimension = (int) this.itemView.getResources().getDimension(ratingItemsMarginHorizontal.H0());
        D6.c(this.itemView, Integer.valueOf(dimension), null, Integer.valueOf(dimension), null, 10);
    }

    @Override // com.avito.android.rating_ui.statistic.h
    public final void z80(@k List<RatingStatisticRow> list) {
        TableLayout tableLayout = this.f250479b;
        tableLayout.removeAllViews();
        for (RatingStatisticRow ratingStatisticRow : list) {
            View viewInflate = this.f250480c.inflate(R.layout.rating_table_row, (ViewGroup) tableLayout, false);
            View viewFindViewById = viewInflate.findViewById(R.id.rating_row_stars);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.rating.RatingBar");
            }
            ((RatingBar) viewFindViewById).setRating(ratingStatisticRow.f250467b);
            View viewFindViewById2 = viewInflate.findViewById(R.id.rating_row_bar);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.progress_bar.ProgressBar");
            }
            ((ProgressBar) viewFindViewById2).setProgress(ratingStatisticRow.f250468c);
            View viewFindViewById3 = viewInflate.findViewById(R.id.rating_row_count);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            ((TextView) viewFindViewById3).setText(ratingStatisticRow.f250469d);
            tableLayout.addView(viewInflate);
        }
    }
}
