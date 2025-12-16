package com.avito.android.rating.details.adapter.text;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.rating_ui.RatingItemsMarginHorizontal;
import com.avito.android.util.D6;
import kotlin.Metadata;

/* compiled from: TextItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating/details/adapter/text/e;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/rating/details/adapter/text/d;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e extends com.avito.konveyor.adapter.b implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f246572b;

    public e(@k View view) {
        super(view);
        this.f246572b = (TextView) view;
    }

    @Override // com.avito.android.rating.details.adapter.text.d
    public final void E(@k RatingItemsMarginHorizontal ratingItemsMarginHorizontal) {
        int dimension = (int) this.itemView.getResources().getDimension(ratingItemsMarginHorizontal.H0());
        D6.c(this.itemView, Integer.valueOf(dimension), null, Integer.valueOf(dimension), null, 10);
    }

    @Override // com.avito.android.rating.details.adapter.text.d
    public final void setText(@k String str) {
        this.f246572b.setText(str);
    }
}
