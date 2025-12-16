package com.avito.android.rating.details.adapter.button;

import Y61.k;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.rating_ui.RatingItemsMarginHorizontal;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ButtonItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating/details/adapter/button/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/rating/details/adapter/button/g;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f246505c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Button f246506b;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.rating_details_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f246506b = (Button) viewFindViewById;
    }

    @Override // com.avito.android.rating.details.adapter.button.g
    public final void E(@k RatingItemsMarginHorizontal ratingItemsMarginHorizontal) {
        int dimension = (int) this.itemView.getResources().getDimension(ratingItemsMarginHorizontal.H0());
        D6.c(this.itemView, Integer.valueOf(dimension), null, Integer.valueOf(dimension), null, 10);
    }

    @Override // com.avito.android.rating.details.adapter.button.g
    public final void a(@k Y41.a<G0> aVar) {
        this.f246506b.setOnClickListener(new com.avito.android.publish.slots.cpa_ddu_upload.k(11, aVar));
    }

    @Override // com.avito.android.rating.details.adapter.button.g
    public final void setTitle(@k String str) {
        this.f246506b.setText(str);
    }
}
