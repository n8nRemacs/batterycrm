package com.avito.android.photo_gallery.autoteka_teaser;

import Cf.C13298a;
import Xf.C16999a;
import Xf.C17000b;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult;
import com.avito.android.remote.model.autotekateaser.StandaloneAutotekaLink;
import com.avito.android.remote.model.teaser.TeaserIcon;
import com.avito.android.remote.model.teaser.TeaserInsightIcon;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AutotekaTeaserGalleryInsightsListViewFullScreen.kt */
@P
@s0
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0016\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u001b\u0010\u0019\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u001b\u0010\u001c\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u0012R\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0010\u001a\u0004\b\u001f\u0010 R\u001b\u0010$\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0010\u001a\u0004\b#\u0010 ¨\u0006%"}, d2 = {"Lcom/avito/android/photo_gallery/autoteka_teaser/AutotekaTeaserGalleryInsightsListViewFullScreen;", "Lcom/avito/android/photo_gallery/autoteka_teaser/v;", "Lcom/avito/android/autoteka/analytics/event/FromBlock;", "b", "Lcom/avito/android/autoteka/analytics/event/FromBlock;", "getFromBlock", "()Lcom/avito/android/autoteka/analytics/event/FromBlock;", "fromBlock", "", "c", "Ljava/lang/String;", "getUtmCampaign", "()Ljava/lang/String;", "utmCampaign", "Landroid/widget/TextView;", "d", "Lkotlin/C;", "getTitle", "()Landroid/widget/TextView;", "title", "e", "getDescription", "description", "f", "getExampleTeaserTextView", "exampleTeaserTextView", "g", "getStandaloneBlock", "standaloneBlock", "Landroid/widget/LinearLayout;", "h", "getInsightContainer", "()Landroid/widget/LinearLayout;", "insightContainer", "i", "getButtonContainer", "buttonContainer", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AutotekaTeaserGalleryInsightsListViewFullScreen extends v {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f216778j = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final FromBlock fromBlock;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final String utmCampaign;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC42726C title;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC42726C description;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC42726C exampleTeaserTextView;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC42726C standaloneBlock;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC42726C insightContainer;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC42726C buttonContainer;

    /* compiled from: AutotekaTeaserGalleryInsightsListViewFullScreen.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/net/Uri;", TooltipAttribute.PARAM_DEEP_LINK, "Lkotlin/G0;", "invoke", "(Landroid/net/Uri;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Uri, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AutotekaTeaserResult f216787l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ b f216788m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ AutotekaTeaserGalleryInsightsListViewFullScreen f216789n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AutotekaTeaserResult autotekaTeaserResult, b bVar, AutotekaTeaserGalleryInsightsListViewFullScreen autotekaTeaserGalleryInsightsListViewFullScreen) {
            super(1);
            this.f216787l = autotekaTeaserResult;
            this.f216788m = bVar;
            this.f216789n = autotekaTeaserGalleryInsightsListViewFullScreen;
        }

        @Override // Y41.l
        public final G0 invoke(Uri uri) {
            b bVar;
            Uri uri2 = uri;
            if (this.f216787l.getStandaloneAutotekaLink() != null && (bVar = this.f216788m) != null) {
                AutotekaTeaserGalleryInsightsListViewFullScreen autotekaTeaserGalleryInsightsListViewFullScreen = this.f216789n;
                bVar.f(uri2, autotekaTeaserGalleryInsightsListViewFullScreen.getFromBlock(), autotekaTeaserGalleryInsightsListViewFullScreen.getUtmCampaign());
            }
            return G0.f406611a;
        }
    }

    @X41.j
    public AutotekaTeaserGalleryInsightsListViewFullScreen(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final LinearLayout getButtonContainer() {
        return (LinearLayout) this.buttonContainer.getValue();
    }

    private final TextView getDescription() {
        return (TextView) this.description.getValue();
    }

    private final TextView getExampleTeaserTextView() {
        return (TextView) this.exampleTeaserTextView.getValue();
    }

    private final LinearLayout getInsightContainer() {
        return (LinearLayout) this.insightContainer.getValue();
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
        Drawable drawableU;
        int iIntValue;
        getTitle().setText(autotekaTeaserResult.getTitle());
        I5.a(getDescription(), autotekaTeaserResult.getSubTitle(), false);
        getButtonContainer().removeAllViews();
        Button button = new Button(new ContextThemeWrapper(getContext(), R.style.Theme_DesignSystem_Re23), null, 0, 0, 12, null);
        button.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        button.setAppearanceFromAttr(R.attr.buttonAccentSmallTwoRows);
        com.avito.android.autoteka.helpers.b.f96647a.getClass();
        AutotekaPurchaseAction autotekaPurchaseActionA = com.avito.android.autoteka.helpers.b.a(autotekaTeaserResult);
        G0 g03 = null;
        if (autotekaPurchaseActionA != null) {
            AutotekaChoosingPurchaseButtonParams autotekaChoosingPurchaseButtonParamsC = com.avito.android.autoteka.helpers.b.c(autotekaPurchaseActionA, getFromBlock().f96095b, str, null, null);
            button.setText(autotekaChoosingPurchaseButtonParamsC.f97069c);
            String str2 = autotekaChoosingPurchaseButtonParamsC.f97070d;
            if (str2 != null) {
                button.setSubtitle(str2);
            }
            button.setOnClickListener(new g(bVar, autotekaChoosingPurchaseButtonParamsC, 0));
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            button.setText(autotekaTeaserResult.getReportLink().getTitle());
            button.setOnClickListener(new com.avito.android.job.cv_info_actualization.ui.items.radio.g(bVar, autotekaTeaserResult, this, 1));
        }
        getButtonContainer().addView(button);
        AutotekaReportLink exampleReportLink = autotekaTeaserResult.getExampleReportLink();
        if (exampleReportLink != null) {
            TextView exampleTeaserTextView = getExampleTeaserTextView();
            exampleTeaserTextView.setText(exampleReportLink.getTitle());
            D6.H(exampleTeaserTextView);
            exampleTeaserTextView.setOnClickListener(new com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.j(6, bVar, this));
        }
        C17000b.a(getTitle(), R.drawable.ic_autoteka_logo_in_teaser_with_text);
        StandaloneAutotekaLink standaloneAutotekaLink = autotekaTeaserResult.getStandaloneAutotekaLink();
        a aVar = new a(autotekaTeaserResult, bVar, this);
        if (standaloneAutotekaLink != null) {
            TextView standaloneBlock = getStandaloneBlock();
            com.avito.android.util.text.j.c(standaloneBlock, C13298a.a(standaloneAutotekaLink), null);
            standaloneBlock.setOnClickListener(new com.avito.android.advert.item.autoteka.teaser_v3.i(aVar, standaloneAutotekaLink, 1));
            D6.H(standaloneBlock);
        }
        List<TeaserInsightIcon> insights = autotekaTeaserResult.getInsights();
        ArrayList arrayList = new ArrayList();
        for (TeaserInsightIcon teaserInsightIcon : insights) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.advert_details_autoteka_teaser_in_gallery_insight, (ViewGroup) this, false);
            View viewFindViewById = viewInflate.findViewById(R.id.text);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            ((TextView) viewFindViewById).setText(teaserInsightIcon.getText());
            View viewFindViewById2 = viewInflate.findViewById(R.id.icon);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            ImageView imageView = (ImageView) viewFindViewById2;
            C16999a c16999a = C16999a.f18998a;
            TeaserIcon icon = teaserInsightIcon.getIcon();
            c16999a.getClass();
            Integer numA = C16999a.a(icon);
            if (numA != null) {
                iIntValue = numA.intValue();
            } else {
                Integer numB = C16999a.b(teaserInsightIcon.getStatus());
                if (numB != null) {
                    iIntValue = numB.intValue();
                } else {
                    drawableU = null;
                    imageView.setImageDrawable(drawableU);
                    arrayList.add(viewInflate);
                }
            }
            drawableU = D6.u(this, iIntValue);
            imageView.setImageDrawable(drawableU);
            arrayList.add(viewInflate);
        }
        getInsightContainer().removeAllViews();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            getInsightContainer().addView((View) it.next());
        }
        AutotekaDiscount discount = autotekaTeaserResult.getDiscount();
        if (discount != null) {
            D6.H(findViewById(R.id.discountContainer));
            ((TextView) findViewById(R.id.discountTitle)).setText(discount.getTitle());
            ((DockingBadge) findViewById(R.id.discountAmount)).setText(discount.getAmount());
            g03 = G0.f406611a;
        }
        if (g03 == null) {
            D6.w(findViewById(R.id.discountContainer));
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

    public AutotekaTeaserGalleryInsightsListViewFullScreen(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.fromBlock = FromBlock.f96085e;
        this.utmCampaign = "teaser_gallery_insights_list_fullscreen";
        this.title = C42727D.c(new m(this));
        this.description = C42727D.c(new i(this));
        this.exampleTeaserTextView = C42727D.c(new j(this));
        this.standaloneBlock = C42727D.c(new l(this));
        this.insightContainer = C42727D.c(new k(this));
        this.buttonContainer = C42727D.c(new h(this));
        View.inflate(context, R.layout.gallery_item_autoteka_teaser_view_insight_list_full_screen, this);
    }
}
