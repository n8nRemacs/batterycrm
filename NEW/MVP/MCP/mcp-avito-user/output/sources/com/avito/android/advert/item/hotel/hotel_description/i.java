package com.avito.android.advert.item.hotel.hotel_description;

import Y61.l;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.ExpandablePanelLayout;
import com.avito.android.util.I5;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertHotelDescriptionView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_description/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/hotel/hotel_description/g;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f75859b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ExpandablePanelLayout f75860c;

    public i(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f75859b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.description_root);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.util.ExpandablePanelLayout");
        }
        this.f75860c = (ExpandablePanelLayout) viewFindViewById2;
    }

    @Override // com.avito.android.advert.item.hotel.hotel_description.g
    public final void M60(@Y61.k c cVar) {
        this.f75860c.setOnExpandListener(new h(cVar, this));
    }

    @Override // com.avito.android.advert.item.hotel.hotel_description.g
    public final void Pg() {
        this.f75860c.setCollapsedLineCount(3);
    }

    @Override // com.avito.android.advert.item.hotel.hotel_description.g
    public final void b(@l String str) {
        I5.a(this.f75859b, str, false);
    }

    @Override // com.avito.android.advert.item.hotel.hotel_description.g
    @l
    public final Parcelable d0() {
        return this.f75860c.onSaveInstanceState();
    }

    @Override // com.avito.android.advert.item.hotel.hotel_description.g
    public final void gb(@Y61.k Parcelable parcelable) {
        this.f75860c.onRestoreInstanceState(parcelable);
    }

    @Override // com.avito.android.advert.item.hotel.hotel_description.g
    public final void h(@l String str) {
        ExpandablePanelLayout.b(this.f75860c, str);
    }
}
