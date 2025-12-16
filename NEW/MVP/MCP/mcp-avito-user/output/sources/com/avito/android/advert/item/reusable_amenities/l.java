package com.avito.android.advert.item.reusable_amenities;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert_amenities.Amenities;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AmenitiesView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/reusable_amenities/l;", "Lcom/avito/android/advert/item/reusable_amenities/k;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class l extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f78617g = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f78618b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_amenities.amenity.j f78619c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f78620d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f78621e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f78622f;

    public l(@Y61.k View view, @Y61.k com.avito.android.advert_amenities.amenity.j jVar) {
        super(view);
        this.f78618b = view;
        this.f78619c = jVar;
        View viewFindViewById = view.findViewById(R.id.header);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f78620d = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.amenities);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f78621e = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.expand_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f78622f = (TextView) viewFindViewById3;
    }

    @Override // com.avito.android.advert.item.reusable_amenities.k
    public final void RP(@Y61.l AttributedText attributedText, @Y61.k Y41.a<G0> aVar) {
        if (attributedText != null) {
            TextView textView = this.f78622f;
            textView.setVisibility(0);
            com.avito.android.util.text.j.c(textView, attributedText, null);
            textView.setOnClickListener(new com.avito.android.advert.item.parking.h(10, aVar));
        }
    }

    @Override // com.avito.android.advert.item.reusable_amenities.k
    public final void fH() {
        this.f78622f.setVisibility(8);
    }

    @Override // com.avito.android.advert.item.reusable_amenities.k
    public final void s1(@Y61.k List<Amenities.Amenity> list) {
        LinearLayout linearLayout = this.f78621e;
        linearLayout.setVisibility(0);
        linearLayout.removeAllViews();
        for (Amenities.Amenity amenity : list) {
            linearLayout.addView(this.f78619c.a(this.f78618b.getContext(), amenity));
        }
    }

    @Override // com.avito.android.advert.item.reusable_amenities.k
    public final void w(@Y61.l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f78620d, attributedText, null);
    }
}
