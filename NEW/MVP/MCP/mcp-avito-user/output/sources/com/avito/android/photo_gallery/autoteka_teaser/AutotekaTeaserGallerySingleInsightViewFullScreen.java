package com.avito.android.photo_gallery.autoteka_teaser;

import Cf.C13298a;
import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.autoteka.analytics.event.FromBlock;
import com.avito.android.autoteka.model.AutotekaChoosingPurchaseButtonParams;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.docking_badge.DockingBadge;
import com.avito.android.remote.model.autotekateaser.AutotekaDiscount;
import com.avito.android.remote.model.autotekateaser.AutotekaPurchaseAction;
import com.avito.android.remote.model.autotekateaser.AutotekaReportLink;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserGalleryInsight;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult;
import com.avito.android.remote.model.autotekateaser.StandaloneAutotekaLink;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AutotekaTeaserGallerySingleInsightViewFullScreen.kt */
@P
@s0
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001b\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u001a\u0010\u0017R\u001b\u0010\u001e\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u001d\u0010\u0017R\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0010\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/avito/android/photo_gallery/autoteka_teaser/AutotekaTeaserGallerySingleInsightViewFullScreen;", "Lcom/avito/android/photo_gallery/autoteka_teaser/v;", "Lcom/avito/android/autoteka/analytics/event/FromBlock;", "b", "Lcom/avito/android/autoteka/analytics/event/FromBlock;", "getFromBlock", "()Lcom/avito/android/autoteka/analytics/event/FromBlock;", "fromBlock", "", "c", "Ljava/lang/String;", "getUtmCampaign", "()Ljava/lang/String;", "utmCampaign", "Lcom/avito/android/lib/design/button/Button;", "d", "Lkotlin/C;", "getExampleTeaserButton", "()Lcom/avito/android/lib/design/button/Button;", "exampleTeaserButton", "Landroid/widget/TextView;", "e", "getStandaloneBlock", "()Landroid/widget/TextView;", "standaloneBlock", "f", "getTitle", "title", "g", "getDescription", "description", "Landroid/widget/LinearLayout;", "h", "getButtonContainer", "()Landroid/widget/LinearLayout;", "buttonContainer", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AutotekaTeaserGallerySingleInsightViewFullScreen extends v {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f216796i = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final FromBlock fromBlock;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final String utmCampaign;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC42726C exampleTeaserButton;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC42726C standaloneBlock;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC42726C title;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC42726C description;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC42726C buttonContainer;

    /* compiled from: AutotekaTeaserGallerySingleInsightViewFullScreen.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/net/Uri;", TooltipAttribute.PARAM_DEEP_LINK, "Lkotlin/G0;", "invoke", "(Landroid/net/Uri;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Uri, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AutotekaTeaserResult f216804l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ b f216805m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ AutotekaTeaserGallerySingleInsightViewFullScreen f216806n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AutotekaTeaserResult autotekaTeaserResult, b bVar, AutotekaTeaserGallerySingleInsightViewFullScreen autotekaTeaserGallerySingleInsightViewFullScreen) {
            super(1);
            this.f216804l = autotekaTeaserResult;
            this.f216805m = bVar;
            this.f216806n = autotekaTeaserGallerySingleInsightViewFullScreen;
        }

        @Override // Y41.l
        public final G0 invoke(Uri uri) {
            b bVar;
            Uri uri2 = uri;
            if (this.f216804l.getStandaloneAutotekaLink() != null && (bVar = this.f216805m) != null) {
                AutotekaTeaserGallerySingleInsightViewFullScreen autotekaTeaserGallerySingleInsightViewFullScreen = this.f216806n;
                bVar.f(uri2, autotekaTeaserGallerySingleInsightViewFullScreen.getFromBlock(), autotekaTeaserGallerySingleInsightViewFullScreen.getUtmCampaign());
            }
            return G0.f406611a;
        }
    }

    @X41.j
    public AutotekaTeaserGallerySingleInsightViewFullScreen(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final LinearLayout getButtonContainer() {
        return (LinearLayout) this.buttonContainer.getValue();
    }

    private final TextView getDescription() {
        return (TextView) this.description.getValue();
    }

    private final Button getExampleTeaserButton() {
        return (Button) this.exampleTeaserButton.getValue();
    }

    private final TextView getStandaloneBlock() {
        return (TextView) this.standaloneBlock.getValue();
    }

    private final TextView getTitle() {
        return (TextView) this.title.getValue();
    }

    @Override // com.avito.android.photo_gallery.autoteka_teaser.v
    public final void a(@Y61.k AutotekaTeaserResult autotekaTeaserResult, @Y61.l String str, @Y61.l b bVar) {
        G0 g02;
        TextView title = getTitle();
        AutotekaTeaserGalleryInsight galleryInsight = autotekaTeaserResult.getGalleryInsight();
        title.setText(galleryInsight != null ? galleryInsight.getTitle() : null);
        TextView description = getDescription();
        AutotekaTeaserGalleryInsight galleryInsight2 = autotekaTeaserResult.getGalleryInsight();
        I5.a(description, galleryInsight2 != null ? galleryInsight2.getSubtitle() : null, false);
        getButtonContainer().removeAllViews();
        Button button = new Button(new ContextThemeWrapper(getContext(), R.style.Theme_DesignSystem_Re23), null, 0, 0, 12, null);
        button.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        button.setAppearanceFromAttr(R.attr.buttonAccentSmallTwoRows);
        com.avito.android.autoteka.helpers.b.f96647a.getClass();
        AutotekaPurchaseAction autotekaPurchaseActionA = com.avito.android.autoteka.helpers.b.a(autotekaTeaserResult);
        if (autotekaPurchaseActionA != null) {
            AutotekaChoosingPurchaseButtonParams autotekaChoosingPurchaseButtonParamsC = com.avito.android.autoteka.helpers.b.c(autotekaPurchaseActionA, getFromBlock().f96095b, str, null, null);
            button.setText(autotekaChoosingPurchaseButtonParamsC.f97069c);
            String str2 = autotekaChoosingPurchaseButtonParamsC.f97070d;
            if (str2 != null) {
                button.setSubtitle(str2);
            }
            button.setOnClickListener(new g(bVar, autotekaChoosingPurchaseButtonParamsC, 1));
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            button.setText(autotekaTeaserResult.getReportLink().getTitle());
            button.setOnClickListener(new com.avito.android.job.cv_info_actualization.ui.items.radio.g(bVar, autotekaTeaserResult, this, 2));
        }
        getButtonContainer().addView(button);
        AutotekaReportLink exampleReportLink = autotekaTeaserResult.getExampleReportLink();
        if (exampleReportLink != null) {
            Button exampleTeaserButton = getExampleTeaserButton();
            exampleTeaserButton.setText(exampleReportLink.getTitle());
            D6.H(exampleTeaserButton);
            exampleTeaserButton.setOnClickListener(new com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.j(7, bVar, this));
        }
        StandaloneAutotekaLink standaloneAutotekaLink = autotekaTeaserResult.getStandaloneAutotekaLink();
        a aVar = new a(autotekaTeaserResult, bVar, this);
        if (standaloneAutotekaLink != null) {
            TextView standaloneBlock = getStandaloneBlock();
            com.avito.android.util.text.j.c(standaloneBlock, C13298a.a(standaloneAutotekaLink), null);
            standaloneBlock.setOnClickListener(new com.avito.android.advert.item.autoteka.teaser_v3.i(aVar, standaloneAutotekaLink, 2));
            D6.H(standaloneBlock);
        }
        AutotekaDiscount discount = autotekaTeaserResult.getDiscount();
        if (discount != null) {
            D6.H(findViewById(R.id.discountContainer));
            ((TextView) findViewById(R.id.discountTitle)).setText(discount.getTitle());
            ((DockingBadge) findViewById(R.id.discountAmount)).setText(discount.getAmount());
        } else {
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.discountContainer);
            if (linearLayout != null) {
                D6.w(linearLayout);
            }
        }
    }

    @Override // com.avito.android.photo_gallery.autoteka_teaser.v
    @Y61.k
    public FromBlock getFromBlock() {
        return this.fromBlock;
    }

    @Override // com.avito.android.photo_gallery.autoteka_teaser.v
    @Y61.k
    public String getUtmCampaign() {
        return this.utmCampaign;
    }

    public AutotekaTeaserGallerySingleInsightViewFullScreen(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.fromBlock = FromBlock.f96084d;
        this.utmCampaign = "teaser_gallery_single_insight_fullscreen";
        this.exampleTeaserButton = C42727D.c(new s(this));
        this.standaloneBlock = C42727D.c(new t(this));
        this.title = C42727D.c(new u(this));
        this.description = C42727D.c(new r(this));
        this.buttonContainer = C42727D.c(new q(this));
        View.inflate(context, R.layout.gallery_item_autoteka_teaser_view_single_insight_full_screen, this);
    }
}
