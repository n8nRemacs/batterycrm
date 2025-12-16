package com.avito.android.advert.item.consultation.dynamic_content;

import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.active_orders_common.items.order.n;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.advert_details.realty.TeaserBanner;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DynamicConsultationItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/consultation/dynamic_content/i;", "Lcom/avito/android/advert/item/consultation/dynamic_content/h;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f74751i = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f74752b;

    /* renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f74753c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f74754d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f74755e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f74756f;

    /* renamed from: g, reason: collision with root package name */
    public final SimpleDraweeView f74757g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Button f74758h;

    public i(@k View view) {
        super(view);
        this.f74752b = view;
        this.f74753c = (ConstraintLayout) view.findViewById(R.id.dynamic_content_container);
        this.f74754d = (TextView) view.findViewById(R.id.title);
        this.f74755e = (TextView) view.findViewById(R.id.subtitle);
        this.f74756f = (TextView) view.findViewById(R.id.about_consultation);
        this.f74757g = (SimpleDraweeView) view.findViewById(R.id.first_image);
        this.f74758h = (Button) view.findViewById(R.id.consultation_button);
    }

    @Override // com.avito.android.advert.item.consultation.dynamic_content.h
    public final void Jr(@l AttributedText attributedText, @k Y41.a<G0> aVar) {
        TextView textView = this.f74756f;
        j.a(textView, attributedText, null);
        textView.setOnClickListener(new n(12, aVar));
    }

    @Override // com.avito.android.advert.item.consultation.dynamic_content.h
    public final void Ps(@l TeaserBanner teaserBanner) {
        UniversalImage image;
        ViewOutlineProvider viewOutlineProvider = ViewOutlineProvider.BACKGROUND;
        ConstraintLayout constraintLayout = this.f74753c;
        constraintLayout.setOutlineProvider(viewOutlineProvider);
        constraintLayout.setClipToOutline(true);
        Image imageQ = null;
        I5.a(this.f74754d, teaserBanner != null ? teaserBanner.getTitle() : null, false);
        I5.a(this.f74755e, teaserBanner != null ? teaserBanner.getDescription() : null, false);
        if (teaserBanner != null && (image = teaserBanner.getImage()) != null) {
            imageQ = com.avito.android.actions_sheet.a.q(this.f74752b, image);
        }
        if (imageQ != null) {
            SimpleDraweeView simpleDraweeView = this.f74757g;
            D6.H(simpleDraweeView);
            C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(imageQ), null, null, null, 14);
        }
    }

    @Override // com.avito.android.advert.item.consultation.dynamic_content.h
    public final void Y0(@l String str, @k Y41.a<G0> aVar) {
        Button button = this.f74758h;
        if (button != null) {
            com.avito.android.lib.design.button.b.a(button, str, false);
        }
        if (button != null) {
            button.setOnClickListener(new n(11, aVar));
        }
    }
}
