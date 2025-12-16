package com.avito.android.rating.details.adapter.action;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.rating_ui.RatingItemsMarginHorizontal;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ActionItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating/details/adapter/action/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/rating/details/adapter/action/g;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f246490c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f246491b;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.rating_details_action);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f246491b = (TextView) viewFindViewById;
    }

    @Override // com.avito.android.rating.details.adapter.action.g
    public final void E(@k RatingItemsMarginHorizontal ratingItemsMarginHorizontal) {
        int dimension = (int) this.itemView.getResources().getDimension(ratingItemsMarginHorizontal.H0());
        D6.c(this.itemView, Integer.valueOf(dimension), null, Integer.valueOf(dimension), null, 10);
    }

    @Override // com.avito.android.rating.details.adapter.action.g
    public final void a(@k Y41.a<G0> aVar) {
        this.f246491b.setOnClickListener(new com.avito.android.publish.slots.cpa_ddu_upload.k(10, aVar));
    }

    @Override // com.avito.android.rating.details.adapter.action.g
    public final void setTitle(@k String str) {
        this.f246491b.setText(str);
    }
}
