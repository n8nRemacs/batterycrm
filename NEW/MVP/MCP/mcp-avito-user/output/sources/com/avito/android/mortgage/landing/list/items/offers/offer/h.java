package com.avito.android.mortgage.landing.list.items.offers.offer;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.docking_badge.DockingBadge;
import com.avito.android.lib.design.toggle.Checkbox;
import com.avito.android.lib.util.layout.OffsetLayout;
import com.avito.android.messenger.channels.mvi.view.ViewOnClickListenerC31873b;
import com.avito.android.mortgage.api.model.OfferBadge;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import m.C43852a;

/* compiled from: OfferView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/offers/offer/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/mortgage/landing/list/items/offers/offer/g;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    public final Context f199860b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f199861c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f199862d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Checkbox f199863e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ImageView f199864f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final OffsetLayout f199865g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public Y41.l<? super Boolean, G0> f199866h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final com.avito.android.advert.item.short_term_rent.payment_toggles.toggle.h f199867i;

    public h(@k View view) {
        super(view);
        this.f199860b = view.getContext();
        View viewFindViewById = view.findViewById(R.id.offer_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f199861c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.offer_subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f199862d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.offer_checkbox);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.toggle.Checkbox");
        }
        Checkbox checkbox = (Checkbox) viewFindViewById3;
        this.f199863e = checkbox;
        View viewFindViewById4 = view.findViewById(R.id.offer_image);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f199864f = (ImageView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.badges_container);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.util.layout.OffsetLayout");
        }
        this.f199865g = (OffsetLayout) viewFindViewById5;
        com.avito.android.advert.item.short_term_rent.payment_toggles.toggle.h hVar = new com.avito.android.advert.item.short_term_rent.payment_toggles.toggle.h(this, 4);
        this.f199867i = hVar;
        checkbox.setOnCheckedChangeListener(hVar);
        view.setOnClickListener(new ViewOnClickListenerC31873b(this, 15));
    }

    @Override // com.avito.android.mortgage.landing.list.items.offers.offer.g
    public final void UZ(@k Y41.l<? super Boolean, G0> lVar) {
        this.f199866h = lVar;
    }

    @Override // com.avito.android.mortgage.landing.list.items.offers.offer.g
    public final void V8(@k List<OfferBadge> list) {
        int i12 = !list.isEmpty() ? 0 : 8;
        OffsetLayout offsetLayout = this.f199865g;
        offsetLayout.setVisibility(i12);
        if (list.isEmpty()) {
            return;
        }
        offsetLayout.removeAllViews();
        for (OfferBadge offerBadge : list) {
            offsetLayout.addView(new DockingBadge(this.f199860b, offerBadge.getText(), offerBadge.getPreset(), offerBadge.getSize(), offerBadge.getLeftCorner(), offerBadge.getRightCorner()));
        }
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f199866h = null;
    }

    @Override // com.avito.android.mortgage.landing.list.items.offers.offer.g
    public final void k(@k AttributedText attributedText) {
        j.c(this.f199862d, attributedText, null);
    }

    @Override // com.avito.android.mortgage.landing.list.items.offers.offer.g
    public final void nb(@l String str) {
        Uri uri = str != null ? Uri.parse(str) : null;
        ImageView imageView = this.f199864f;
        if (uri == null) {
            imageView.setVisibility(4);
            return;
        }
        imageView.setVisibility(0);
        ImageRequest.a aVar = new ImageRequest.a(new DM.a(imageView));
        aVar.f169503u = true;
        Drawable drawableA = C43852a.a(this.f199860b, R.drawable.placeholder_circle_bg);
        ImageRequest.ScaleType scaleType = ImageRequest.ScaleType.f169473d;
        aVar.f169492j = drawableA;
        aVar.f169493k = scaleType;
        aVar.f169485c = Integer.valueOf(R.drawable.placeholder_circle_bg);
        aVar.f(uri);
        aVar.c();
    }

    @Override // com.avito.android.mortgage.landing.list.items.offers.offer.g
    public final void setChecked(boolean z12) {
        Checkbox checkbox = this.f199863e;
        if (checkbox.isChecked() == z12) {
            return;
        }
        checkbox.setOnCheckedChangeListener(null);
        checkbox.setChecked(z12);
        checkbox.setOnCheckedChangeListener(this.f199867i);
    }

    @Override // com.avito.android.mortgage.landing.list.items.offers.offer.g
    public final void setTitle(@k String str) {
        this.f199861c.setText(str);
    }
}
