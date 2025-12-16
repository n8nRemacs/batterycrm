package com.avito.android.advert.item.fmp.banner;

import LV.c;
import VU.b;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.active_orders_common.items.order.n;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.gradient.AvitoLinearGradientDrawable;
import com.avito.android.lib.design.gradient.a;
import com.avito.android.remote.fmp.FMPBannerBackground;
import com.avito.android.remote.fmp.FMPBannerButton;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: AdvertDetailsFmpBannerView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/fmp/banner/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/fmp/banner/i;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f75445i = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Context f75446b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ConstraintLayout f75447c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f75448d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f75449e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SimpleDraweeView f75450f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f75451g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Button f75452h;

    public j(@k View view) {
        super(view);
        this.f75446b = view.getContext();
        View viewFindViewById = view.findViewById(R.id.fmp_banner_background);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        }
        this.f75447c = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.fmp_banner_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f75448d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.fmp_banner_subtitle);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f75449e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.fmp_banner_image);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f75450f = (SimpleDraweeView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.fmp_banner_legal);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f75451g = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.fmp_banner_button);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f75452h = (Button) viewFindViewById6;
    }

    @Override // com.avito.android.advert.item.fmp.banner.i
    public final void B30(@l FMPBannerButton fMPBannerButton) {
        if (fMPBannerButton != null) {
            Button button = this.f75452h;
            D6.G(button, true);
            String text = fMPBannerButton.getText();
            if (text != null) {
                button.setText(text);
            }
            String style = fMPBannerButton.getStyle();
            int iD2 = style != null ? com.avito.android.lib.util.f.d(style) : R.attr.buttonPrimaryMedium;
            b.a aVar = VU.b.f17147t;
            aVar.getClass();
            button.setStyle((VU.b) c.a.a(aVar, this.f75446b, iD2));
        }
    }

    @Override // com.avito.android.advert.item.fmp.banner.i
    public final void P50(@l FMPBannerBackground fMPBannerBackground) {
        String gradient;
        String gradient2;
        Integer numH = (fMPBannerBackground == null || (gradient2 = fMPBannerBackground.getGradient()) == null) ? null : com.avito.android.lib.util.f.h(gradient2);
        Integer numI = (fMPBannerBackground == null || (gradient = fMPBannerBackground.getGradient()) == null) ? null : com.avito.android.lib.util.f.i(gradient);
        UniversalColor solid = fMPBannerBackground != null ? fMPBannerBackground.getSolid() : null;
        Context context = this.f75446b;
        ConstraintLayout constraintLayout = this.f75447c;
        if (numH != null) {
            constraintLayout.setBackground(new AvitoLinearGradientDrawable(new AvitoLinearGradientDrawable.a.C5275a(context, numH.intValue(), 0, 4, null).a()));
            constraintLayout.setBackgroundTintList(null);
        } else if (numI != null) {
            constraintLayout.setBackground(new com.avito.android.lib.design.gradient.a(context, new a.C5276a.C5277a(context, numI.intValue(), 0, 4, null).a()));
            constraintLayout.setBackgroundTintList(null);
        } else if (solid != null) {
            constraintLayout.setBackgroundColor(C48063a.f437606a.a(context, solid));
        }
    }

    @Override // com.avito.android.advert.item.fmp.banner.i
    public final void Y(@k Y41.a<G0> aVar) {
        this.f75452h.setOnClickListener(new n(14, aVar));
    }

    @Override // com.avito.android.advert.item.fmp.banner.i
    public final void a(@k Y41.a<G0> aVar) {
        this.f75447c.setOnClickListener(new n(15, aVar));
    }

    @Override // com.avito.android.advert.item.fmp.banner.i
    public final void e(@l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f75448d, attributedText, null);
    }

    @Override // com.avito.android.advert.item.fmp.banner.i
    public final void i(@l UniversalImage universalImage) {
        Image imageDependsOnTheme = universalImage != null ? UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(this.f75446b)) : null;
        int i12 = imageDependsOnTheme != null ? 0 : 8;
        SimpleDraweeView simpleDraweeView = this.f75450f;
        simpleDraweeView.setVisibility(i12);
        com.avito.android.image_loader.glide.utils.b.d(simpleDraweeView, com.avito.android.image_loader.b.b(imageDependsOnTheme));
    }

    @Override // com.avito.android.advert.item.fmp.banner.i
    public final void k(@l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f75449e, attributedText, null);
    }

    @Override // com.avito.android.advert.item.fmp.banner.i
    public final void x4(@l AttributedText attributedText) {
        if (attributedText != null) {
            TextView textView = this.f75451g;
            D6.G(textView, true);
            com.avito.android.util.text.j.a(textView, attributedText, null);
        }
    }
}
