package com.avito.android.photo_gallery.autoteka_teaser.v2;

import Cf.C13298a;
import Y41.l;
import Y61.k;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.autoteka.analytics.event.FromBlock;
import com.avito.android.autoteka.model.AutotekaChoosingPurchaseButtonParams;
import com.avito.android.bottom_navigation.RunnableC28882d;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.docking_badge.DockingBadge;
import com.avito.android.photo_gallery.autoteka_teaser.v;
import com.avito.android.photo_gallery.autoteka_teaser.w;
import com.avito.android.remote.model.autotekateaser.AutotekaDiscount;
import com.avito.android.remote.model.autotekateaser.AutotekaPurchaseAction;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult;
import com.avito.android.remote.model.autotekateaser.StandaloneAutotekaLink;
import com.avito.android.remote.model.teaser.TeaserInsightIcon;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import java.util.List;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AutotekaTeaserV2GalleryInsightListViewFullScreen.kt */
@P
@s0
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001FJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010%\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010(\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010$R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b+\u0010,R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\"\u001a\u0004\b0\u00101R\u001b\u00105\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\"\u001a\u0004\b4\u0010$R\u001b\u0010:\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\"\u001a\u0004\b8\u00109R\u001b\u0010=\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\"\u001a\u0004\b<\u00109R\u001b\u0010@\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010\"\u001a\u0004\b?\u0010$R\u001b\u0010E\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010\"\u001a\u0004\bC\u0010D¨\u0006G"}, d2 = {"Lcom/avito/android/photo_gallery/autoteka_teaser/v2/AutotekaTeaserV2GalleryInsightListViewFullScreen;", "Lcom/avito/android/photo_gallery/autoteka_teaser/v;", "", "text", "Lkotlin/G0;", "setTitle", "(Ljava/lang/String;)V", "setSubtitle", "", "Lcom/avito/android/remote/model/teaser/TeaserInsightIcon;", "insights", "setInsights", "(Ljava/util/List;)V", "Lcom/avito/android/photo_gallery/autoteka_teaser/b;", "listener", "setMoreLink", "(Lcom/avito/android/photo_gallery/autoteka_teaser/b;)V", "Lcom/avito/android/remote/model/autotekateaser/AutotekaDiscount;", "discount", "setDiscount", "(Lcom/avito/android/remote/model/autotekateaser/AutotekaDiscount;)V", "Lcom/avito/android/autoteka/analytics/event/FromBlock;", "b", "Lcom/avito/android/autoteka/analytics/event/FromBlock;", "getFromBlock", "()Lcom/avito/android/autoteka/analytics/event/FromBlock;", "fromBlock", "c", "Ljava/lang/String;", "getUtmCampaign", "()Ljava/lang/String;", "utmCampaign", "Landroid/widget/TextView;", "d", "Lkotlin/C;", "getTitle", "()Landroid/widget/TextView;", "title", "e", "getSubtitle", "subtitle", "Landroid/view/ViewGroup;", "f", "getInsightList", "()Landroid/view/ViewGroup;", "insightList", "Landroid/widget/FrameLayout;", "g", "getMoreLink", "()Landroid/widget/FrameLayout;", "moreLink", "h", "getStandaloneBlock", "standaloneBlock", "Landroid/widget/LinearLayout;", "i", "getButtonContainer", "()Landroid/widget/LinearLayout;", "buttonContainer", "j", "getDiscountContainer", "discountContainer", "k", "getDiscountTitle", "discountTitle", "Lcom/avito/android/lib/design/docking_badge/DockingBadge;", "l", "getDiscountAmount", "()Lcom/avito/android/lib/design/docking_badge/DockingBadge;", "discountAmount", "a", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AutotekaTeaserV2GalleryInsightListViewFullScreen extends v {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f216830m = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    public final FromBlock fromBlock;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    public final String utmCampaign;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @k
    public final InterfaceC42726C title;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @k
    public final InterfaceC42726C subtitle;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @k
    public final InterfaceC42726C insightList;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @k
    public final InterfaceC42726C moreLink;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @k
    public final InterfaceC42726C standaloneBlock;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @k
    public final InterfaceC42726C buttonContainer;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @k
    public final InterfaceC42726C discountContainer;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @k
    public final InterfaceC42726C discountTitle;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @k
    public final InterfaceC42726C discountAmount;

    /* compiled from: AutotekaTeaserV2GalleryInsightListViewFullScreen.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/photo_gallery/autoteka_teaser/v2/AutotekaTeaserV2GalleryInsightListViewFullScreen$a;", "", "<init>", "()V", "", "MAX_VISIBLE_INSIGHTS", "I", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AutotekaTeaserV2GalleryInsightListViewFullScreen.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/net/Uri;", TooltipAttribute.PARAM_DEEP_LINK, "Lkotlin/G0;", "invoke", "(Landroid/net/Uri;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<Uri, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AutotekaTeaserResult f216842l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.photo_gallery.autoteka_teaser.b f216843m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ AutotekaTeaserV2GalleryInsightListViewFullScreen f216844n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AutotekaTeaserResult autotekaTeaserResult, com.avito.android.photo_gallery.autoteka_teaser.b bVar, AutotekaTeaserV2GalleryInsightListViewFullScreen autotekaTeaserV2GalleryInsightListViewFullScreen) {
            super(1);
            this.f216842l = autotekaTeaserResult;
            this.f216843m = bVar;
            this.f216844n = autotekaTeaserV2GalleryInsightListViewFullScreen;
        }

        @Override // Y41.l
        public final G0 invoke(Uri uri) {
            com.avito.android.photo_gallery.autoteka_teaser.b bVar;
            Uri uri2 = uri;
            if (this.f216842l.getStandaloneAutotekaLink() != null && (bVar = this.f216843m) != null) {
                AutotekaTeaserV2GalleryInsightListViewFullScreen autotekaTeaserV2GalleryInsightListViewFullScreen = this.f216844n;
                bVar.f(uri2, autotekaTeaserV2GalleryInsightListViewFullScreen.getFromBlock(), autotekaTeaserV2GalleryInsightListViewFullScreen.getUtmCampaign());
            }
            return G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    @X41.j
    public AutotekaTeaserV2GalleryInsightListViewFullScreen(@k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public static void b(AutotekaTeaserV2GalleryInsightListViewFullScreen autotekaTeaserV2GalleryInsightListViewFullScreen, String str) {
        Layout layout = autotekaTeaserV2GalleryInsightListViewFullScreen.getTitle().getLayout();
        if (layout == null) {
            return;
        }
        int height = autotekaTeaserV2GalleryInsightListViewFullScreen.getTitle().getHeight() / layout.getLineCount();
        Drawable drawable = androidx.core.content.d.getDrawable(autotekaTeaserV2GalleryInsightListViewFullScreen.getTitle().getContext(), R.drawable.ic_autoteka_logo_in_teaser);
        int iB2 = y6.b(20);
        int iB3 = y6.b(5);
        drawable.setBounds(0, 0, iB2, iB2);
        j jVar = new j(iB3, height, autotekaTeaserV2GalleryInsightListViewFullScreen.getTitle().getHeight(), drawable);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(jVar, length - 1, length, 33);
        I5.a(autotekaTeaserV2GalleryInsightListViewFullScreen.getTitle(), spannableStringBuilder, false);
    }

    private final LinearLayout getButtonContainer() {
        return (LinearLayout) this.buttonContainer.getValue();
    }

    private final DockingBadge getDiscountAmount() {
        return (DockingBadge) this.discountAmount.getValue();
    }

    private final LinearLayout getDiscountContainer() {
        return (LinearLayout) this.discountContainer.getValue();
    }

    private final TextView getDiscountTitle() {
        return (TextView) this.discountTitle.getValue();
    }

    private final ViewGroup getInsightList() {
        return (ViewGroup) this.insightList.getValue();
    }

    private final FrameLayout getMoreLink() {
        return (FrameLayout) this.moreLink.getValue();
    }

    private final TextView getStandaloneBlock() {
        return (TextView) this.standaloneBlock.getValue();
    }

    private final TextView getSubtitle() {
        return (TextView) this.subtitle.getValue();
    }

    private final TextView getTitle() {
        return (TextView) this.title.getValue();
    }

    private final void setDiscount(AutotekaDiscount discount) {
        G0 g02;
        if (discount != null) {
            D6.H(getDiscountContainer());
            I5.a(getDiscountTitle(), discount.getTitle(), false);
            getDiscountAmount().setText(discount.getAmount());
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            D6.w(getDiscountContainer());
        }
    }

    private final void setInsights(List<TeaserInsightIcon> insights) {
        getInsightList().removeAllViews();
        for (TeaserInsightIcon teaserInsightIcon : C42745f0.E0(insights, 3)) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.gallery_item_autoteka_teaser_v2_view_insight_list_full_screen_insight_item, getInsightList(), false);
            TextView textView = (TextView) viewInflate.findViewById(R.id.text);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.description);
            I5.a(textView, teaserInsightIcon.getText(), false);
            I5.a(textView2, teaserInsightIcon.getDescription(), false);
            getInsightList().addView(viewInflate);
        }
    }

    private final void setMoreLink(com.avito.android.photo_gallery.autoteka_teaser.b listener) {
        getMoreLink().setOnClickListener(new com.avito.android.photo_gallery.autoteka_teaser.c(listener, 2));
    }

    private final void setSubtitle(String text) {
        I5.a(getSubtitle(), text, false);
    }

    private final void setTitle(String text) {
        I5.a(getTitle(), text, false);
        getTitle().post(new RunnableC28882d(21, this, text));
    }

    @Override // com.avito.android.photo_gallery.autoteka_teaser.v
    public final void a(@k AutotekaTeaserResult autotekaTeaserResult, @Y61.l String str, @Y61.l com.avito.android.photo_gallery.autoteka_teaser.b bVar) {
        setTitle(autotekaTeaserResult.getTitle());
        setSubtitle(autotekaTeaserResult.getSubTitle());
        setInsights(autotekaTeaserResult.getInsights());
        setDiscount(autotekaTeaserResult.getDiscount());
        StandaloneAutotekaLink standaloneAutotekaLink = autotekaTeaserResult.getStandaloneAutotekaLink();
        b bVar2 = new b(autotekaTeaserResult, bVar, this);
        G0 g02 = null;
        if (standaloneAutotekaLink != null) {
            TextView standaloneBlock = getStandaloneBlock();
            com.avito.android.util.text.j.c(standaloneBlock, C13298a.a(standaloneAutotekaLink), null);
            standaloneBlock.setOnClickListener(new com.avito.android.advert.item.autoteka.teaser_v3.i(bVar2, standaloneAutotekaLink, 3));
            D6.H(standaloneBlock);
        }
        setMoreLink(bVar);
        getButtonContainer().removeAllViews();
        w wVar = w.f216902a;
        Context context = getRootView().getContext();
        wVar.getClass();
        Button buttonA = w.a(context);
        com.avito.android.autoteka.helpers.b.f96647a.getClass();
        AutotekaPurchaseAction autotekaPurchaseActionA = com.avito.android.autoteka.helpers.b.a(autotekaTeaserResult);
        if (autotekaPurchaseActionA != null) {
            AutotekaChoosingPurchaseButtonParams autotekaChoosingPurchaseButtonParamsC = com.avito.android.autoteka.helpers.b.c(autotekaPurchaseActionA, getFromBlock().f96095b, str, null, null);
            buttonA.setText(autotekaChoosingPurchaseButtonParamsC.f97069c);
            String str2 = autotekaChoosingPurchaseButtonParamsC.f97070d;
            if (str2 != null) {
                buttonA.setSubtitle(str2);
            }
            buttonA.setOnClickListener(new com.avito.android.photo_gallery.autoteka_teaser.g(bVar, autotekaChoosingPurchaseButtonParamsC, 2));
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            buttonA.setText(autotekaTeaserResult.getReportLink().getTitle());
            buttonA.setOnClickListener(new com.avito.android.job.cv_info_actualization.ui.items.radio.g(bVar, autotekaTeaserResult, this, 3));
        }
        getButtonContainer().addView(buttonA);
    }

    @Override // com.avito.android.photo_gallery.autoteka_teaser.v
    @k
    public FromBlock getFromBlock() {
        return this.fromBlock;
    }

    @Override // com.avito.android.photo_gallery.autoteka_teaser.v
    @k
    public String getUtmCampaign() {
        return this.utmCampaign;
    }

    public AutotekaTeaserV2GalleryInsightListViewFullScreen(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.fromBlock = FromBlock.f96085e;
        this.utmCampaign = "teaser_gallery_insites_list_fullscreen";
        this.title = C42727D.c(new i(this));
        this.subtitle = C42727D.c(new h(this));
        this.insightList = C42727D.c(new e(this));
        this.moreLink = C42727D.c(new f(this));
        this.standaloneBlock = C42727D.c(new g(this));
        this.buttonContainer = C42727D.c(new com.avito.android.photo_gallery.autoteka_teaser.v2.a(this));
        this.discountContainer = C42727D.c(new c(this));
        this.discountTitle = C42727D.c(new d(this));
        this.discountAmount = C42727D.c(new com.avito.android.photo_gallery.autoteka_teaser.v2.b(this));
        LayoutInflater.from(context).inflate(R.layout.gallery_item_autoteka_teaser_v2_view_insight_list_full_screen, (ViewGroup) this, true);
    }
}
