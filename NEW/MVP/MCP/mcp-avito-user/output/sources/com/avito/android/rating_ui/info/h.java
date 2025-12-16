package com.avito.android.rating_ui.info;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.rating_ui.RatingItemsMarginHorizontal;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: RatingInfoItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_ui/info/h;", "Lcom/avito/android/rating_ui/info/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f250017b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f250018c;

    public h(@k View view) {
        super(view);
        this.f250017b = (TextView) view.findViewById(R.id.review_info_title);
        this.f250018c = (TextView) view.findViewById(R.id.review_info_subtitle);
    }

    @Override // com.avito.android.rating_ui.info.g
    public final void E(@k RatingItemsMarginHorizontal ratingItemsMarginHorizontal) {
        int dimension = (int) this.itemView.getResources().getDimension(ratingItemsMarginHorizontal.H0());
        D6.c(this.f250017b, Integer.valueOf(dimension), null, null, null, 14);
        D6.c(this.f250018c, Integer.valueOf(dimension), null, null, null, 14);
    }

    @Override // com.avito.android.rating_ui.info.g
    public final void f(@l String str) {
        I5.a(this.f250018c, str, false);
    }

    @Override // com.avito.android.rating_ui.info.g
    public final void j0(int i12) {
        TextView textView = this.f250017b;
        textView.setTextAppearance(C35835l0.j(i12, textView.getContext()));
    }

    @Override // com.avito.android.rating_ui.info.g
    public final void setTitle(@l String str) {
        this.f250017b.setText(str);
    }
}
