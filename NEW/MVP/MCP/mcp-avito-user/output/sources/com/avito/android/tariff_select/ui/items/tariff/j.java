package com.avito.android.tariff_select.ui.items.tariff;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35949t5;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TariffSelectTariffItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_select/ui/items/tariff/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff_select/ui/items/tariff/i;", "_avito_tariff-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f301282e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f301283b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f301284c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SimpleDraweeView f301285d;

    public j(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f301283b = aVar;
        View viewFindViewById = view.findViewById(R.id.tariff_select_tariff_text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f301284c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.tariff_select_tariff_image);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f301285d = (SimpleDraweeView) viewFindViewById2;
    }

    @Override // com.avito.android.tariff_select.ui.items.tariff.i
    public final void i(@l UniversalImage universalImage) {
        C35949t5.c(this.f301285d, com.avito.android.image_loader.b.b(universalImage != null ? com.avito.android.advert.item.delivery_suggests.l.g(this.itemView, universalImage) : null), null, null, null, 14);
    }

    @Override // com.avito.android.tariff_select.ui.items.tariff.i
    public final void r(@k AttributedText attributedText) {
        com.avito.android.util.text.j.c(this.f301284c, attributedText, this.f301283b);
    }

    @Override // com.avito.android.tariff_select.ui.items.tariff.i
    public final void setListener(@k Y41.a<G0> aVar) {
        this.itemView.setOnClickListener(new com.avito.android.sx_address.address_video_verification.view.b(26, aVar));
    }
}
