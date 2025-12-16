package com.avito.android.advert.item.hotel.hotel_review.badges;

import Y61.k;
import Y61.l;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import j.InterfaceC42150f;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: AdvertHotelRatingBadgeView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_review/badges/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/hotel/hotel_review/badges/f;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f76255b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f76256c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ImageView f76257d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f76258e;

    public g(@k View view) {
        super(view);
        this.f76255b = view;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f76256c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.icon);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f76257d = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.subtitle);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f76258e = (TextView) viewFindViewById3;
    }

    @Override // com.avito.android.advert.item.hotel.hotel_review.badges.f
    public final void D5(@k UniversalColor universalColor) {
        this.f76256c.setTextColor(C48063a.f437606a.a(this.f76255b.getContext(), universalColor));
    }

    @Override // com.avito.android.advert.item.hotel.hotel_review.badges.f
    public final void GP(@k UniversalColor universalColor) {
        this.f76257d.setImageTintList(ColorStateList.valueOf(C48063a.f437606a.a(this.f76255b.getContext(), universalColor)));
    }

    @Override // com.avito.android.advert.item.hotel.hotel_review.badges.f
    public final void Qn() {
        ImageView imageView = this.f76257d;
        imageView.setImageDrawable(androidx.core.content.d.getDrawable(imageView.getContext(), R.drawable.ic_tophotels));
    }

    @Override // com.avito.android.advert.item.hotel.hotel_review.badges.f
    public final void b(@l String str) {
        I5.a(this.f76256c, str, true);
    }

    @Override // com.avito.android.advert.item.hotel.hotel_review.badges.f
    public final void gL(@InterfaceC42150f @l Integer num) {
        ImageView imageView = this.f76257d;
        imageView.setImageDrawable(num != null ? C35835l0.h(num.intValue(), imageView.getContext()) : null);
    }

    @Override // com.avito.android.advert.item.hotel.hotel_review.badges.f
    public final void j(@l String str) {
        I5.a(this.f76258e, str, true);
    }

    @Override // com.avito.android.advert.item.hotel.hotel_review.badges.f
    public final void je(@k UniversalColor universalColor) {
        this.f76258e.setTextColor(C48063a.f437606a.a(this.f76255b.getContext(), universalColor));
    }

    @Override // com.avito.android.advert.item.hotel.hotel_review.badges.f
    public final void v(@k UniversalColor universalColor) {
        View view = this.f76255b;
        view.setBackgroundTintList(ColorStateList.valueOf(C48063a.f437606a.a(view.getContext(), universalColor)));
    }
}
