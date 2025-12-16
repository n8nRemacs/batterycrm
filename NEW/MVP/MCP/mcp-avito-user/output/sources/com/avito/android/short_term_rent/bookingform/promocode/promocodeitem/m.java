package com.avito.android.short_term_rent.bookingform.promocode.promocodeitem;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.toggle.RadioButton;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.serp.adapter.serp_advert_card.A;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PromoCodeItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/promocode/promocodeitem/m;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/short_term_rent/bookingform/promocode/promocodeitem/l;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m extends com.avito.konveyor.adapter.b implements l {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f282210g = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f282211b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ImageView f282212c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f282213d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f282214e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final RadioButton f282215f;

    public m(@Y61.k View view) {
        super(view);
        this.f282211b = view;
        View viewFindViewById = view.findViewById(R.id.image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f282212c = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.percent);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f282213d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.text);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f282214e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.radio);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.toggle.RadioButton");
        }
        this.f282215f = (RadioButton) viewFindViewById4;
    }

    @Override // com.avito.android.short_term_rent.bookingform.promocode.promocodeitem.l
    public final void BV(@Y61.k PrintableText printableText) {
        I5.a(this.f282213d, printableText.k0(this.f282211b.getContext()), false);
    }

    @Override // com.avito.android.short_term_rent.bookingform.promocode.promocodeitem.l
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f282211b.setOnClickListener(new A(12, aVar));
    }

    @Override // com.avito.android.short_term_rent.bookingform.promocode.promocodeitem.l
    public final void eo(boolean z12) {
        this.f282215f.setChecked(z12);
    }

    @Override // com.avito.android.short_term_rent.bookingform.promocode.promocodeitem.l
    public final void i(@Y61.l UniversalImage universalImage) {
        Image imageG = universalImage != null ? com.avito.android.advert.item.delivery_suggests.l.g(this.f282211b, universalImage) : null;
        ImageView imageView = this.f282212c;
        if (imageG == null) {
            D6.w(imageView);
        } else {
            D6.H(imageView);
            com.avito.android.advert.item.delivery_suggests.l.w(imageG, new ImageRequest.a(new DM.a(imageView)));
        }
    }

    @Override // com.avito.android.short_term_rent.bookingform.promocode.promocodeitem.l
    public final void setEnabled(boolean z12) {
        int iD2 = C35835l0.d(z12 ? R.attr.black : R.attr.gray54, this.f282211b.getContext());
        this.f282214e.setTextColor(iD2);
        this.f282213d.setTextColor(iD2);
    }

    @Override // com.avito.android.short_term_rent.bookingform.promocode.promocodeitem.l
    public final void y(@Y61.l PrintableText printableText) {
        I5.a(this.f282214e, printableText != null ? printableText.k0(this.f282211b.getContext()) : null, false);
    }
}
