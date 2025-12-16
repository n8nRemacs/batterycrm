package com.avito.android.photo_gallery.autoteka_teaser.v4;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.autoteka.analytics.event.FromBlock;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.docking_badge.DockingBadge;
import com.avito.android.photo_gallery.autoteka_teaser.v;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.autotekateaser.ActivePackage;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserGallery;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult;
import com.avito.android.remote.model.autotekateaser.ExistingReport;
import com.avito.android.remote.model.autotekateaser.FullGallery;
import com.avito.android.remote.model.autotekateaser.PersonalDiscount;
import com.avito.android.remote.model.autotekateaser.UserData;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaTeaserGalleryViewV4FullScreen.kt */
@P
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001c\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0016\u001a\u0004\b)\u0010*R\u001b\u00100\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u0016\u001a\u0004\b.\u0010/R\u001b\u00105\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u0016\u001a\u0004\b3\u00104R\u001b\u00108\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\u0016\u001a\u0004\b7\u0010\u0018R\u001b\u0010;\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010\u0016\u001a\u0004\b:\u0010\u0018R\u001b\u0010>\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010\u0016\u001a\u0004\b=\u0010\u0018¨\u0006?"}, d2 = {"Lcom/avito/android/photo_gallery/autoteka_teaser/v4/AutotekaTeaserGalleryViewV4FullScreen;", "Lcom/avito/android/photo_gallery/autoteka_teaser/v;", "Lcom/avito/android/lib/design/button/Button;", "getButton", "()Lcom/avito/android/lib/design/button/Button;", "", "getButtonStyle", "()I", "Lcom/avito/android/autoteka/analytics/event/FromBlock;", "b", "Lcom/avito/android/autoteka/analytics/event/FromBlock;", "getFromBlock", "()Lcom/avito/android/autoteka/analytics/event/FromBlock;", "fromBlock", "", "c", "Ljava/lang/String;", "getUtmCampaign", "()Ljava/lang/String;", "utmCampaign", "Landroid/widget/TextView;", "d", "Lkotlin/C;", "getTitle", "()Landroid/widget/TextView;", "title", "e", "getDescription", "description", "Landroid/widget/ImageView;", "f", "getIconView", "()Landroid/widget/ImageView;", "iconView", "Lcom/avito/android/fresco/SimpleDraweeView;", "g", "getIllustrationView", "()Lcom/avito/android/fresco/SimpleDraweeView;", "illustrationView", "Landroid/widget/LinearLayout;", "h", "getButtonContainer", "()Landroid/widget/LinearLayout;", "buttonContainer", "Landroid/view/View;", "i", "getInfoBadgeContainer", "()Landroid/view/View;", "infoBadgeContainer", "Lcom/avito/android/lib/design/docking_badge/DockingBadge;", "j", "getInfoBadge", "()Lcom/avito/android/lib/design/docking_badge/DockingBadge;", "infoBadge", "k", "getInfoTitle", "infoTitle", "l", "getInfoAdditional", "infoAdditional", "m", "getInfoDescription", "infoDescription", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AutotekaTeaserGalleryViewV4FullScreen extends v {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f216875n = 0;

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
    public final InterfaceC42726C iconView;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC42726C illustrationView;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC42726C buttonContainer;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC42726C infoBadgeContainer;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC42726C infoBadge;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC42726C infoTitle;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC42726C infoAdditional;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC42726C infoDescription;

    @X41.j
    public AutotekaTeaserGalleryViewV4FullScreen(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final Button getButton() {
        Button button = new Button(new ContextThemeWrapper(getContext(), R.style.Theme_DesignSystem_Re23), null, 0, 0, 12, null);
        button.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        button.setAppearanceFromAttr(getButtonStyle());
        return button;
    }

    private final LinearLayout getButtonContainer() {
        return (LinearLayout) this.buttonContainer.getValue();
    }

    private final int getButtonStyle() {
        return (getResources().getConfiguration().uiMode & 48) == 32 ? R.attr.buttonPrimaryLarge : R.attr.buttonOverlayPrimaryLarge;
    }

    private final TextView getDescription() {
        return (TextView) this.description.getValue();
    }

    private final ImageView getIconView() {
        return (ImageView) this.iconView.getValue();
    }

    private final SimpleDraweeView getIllustrationView() {
        return (SimpleDraweeView) this.illustrationView.getValue();
    }

    private final TextView getInfoAdditional() {
        return (TextView) this.infoAdditional.getValue();
    }

    private final DockingBadge getInfoBadge() {
        return (DockingBadge) this.infoBadge.getValue();
    }

    private final View getInfoBadgeContainer() {
        return (View) this.infoBadgeContainer.getValue();
    }

    private final TextView getInfoDescription() {
        return (TextView) this.infoDescription.getValue();
    }

    private final TextView getInfoTitle() {
        return (TextView) this.infoTitle.getValue();
    }

    private final TextView getTitle() {
        return (TextView) this.title.getValue();
    }

    @Override // com.avito.android.photo_gallery.autoteka_teaser.v
    public final void a(@Y61.k AutotekaTeaserResult autotekaTeaserResult, @Y61.l String str, @Y61.l com.avito.android.photo_gallery.autoteka_teaser.b bVar) {
        UserData userData;
        PersonalDiscount personalDiscount;
        UserData userData2;
        ActivePackage activePackage;
        UserData userData3;
        ExistingReport existingReport;
        FullGallery full;
        FullGallery full2;
        AutotekaTeaserGallery gallery = autotekaTeaserResult.getGallery();
        if (gallery != null && (full = gallery.getFull()) != null) {
            getTitle().setText(full.getTitle());
            I5.a(getDescription(), full.getSubtitle(), false);
            getButtonContainer().removeAllViews();
            Button button = getButton();
            AutotekaTeaserGallery gallery2 = autotekaTeaserResult.getGallery();
            if (gallery2 != null && (full2 = gallery2.getFull()) != null) {
                button.setText(full2.getButton().getAction().getTitle());
                button.setOnClickListener(new com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.j(9, bVar, full2));
            }
            getButtonContainer().addView(button);
            if (full.getImage().getIllustration() != null) {
                UniversalImage illustration = full.getImage().getIllustration();
                if (illustration != null) {
                    C35949t5.c(getIllustrationView(), com.avito.android.image_loader.b.b(illustration.getImage()), null, null, null, 14);
                }
                D6.H(getIllustrationView());
                D6.w(getIconView());
            } else if (L.f(full.getImage().getIconPhoto(), Boolean.TRUE)) {
                getIconView().setImageDrawable(C35835l0.m(getIconView().getContext(), R.attr.ic_camera36, R.attr.constantWhite));
                D6.w(getIllustrationView());
                D6.H(getIconView());
            } else {
                getIconView().setImageResource(R.drawable.ic_autoteka_logo_in_teaser);
                D6.w(getIllustrationView());
                D6.H(getIconView());
            }
        }
        AutotekaTeaserGallery gallery3 = autotekaTeaserResult.getGallery();
        if (gallery3 != null && (userData3 = gallery3.getUserData()) != null && (existingReport = userData3.getExistingReport()) != null) {
            I5.a(getInfoTitle(), existingReport.getTitle(), false);
            D6.H(getInfoAdditional());
            getInfoAdditional().setText((CharSequence) null);
            FV.a.f4720a.f(getInfoAdditional(), R.attr.textIconDoneFilled, y6.b(4));
            I5.a(getInfoDescription(), existingReport.getDescription(), false);
            return;
        }
        AutotekaTeaserGallery gallery4 = autotekaTeaserResult.getGallery();
        if (gallery4 != null && (userData2 = gallery4.getUserData()) != null && (activePackage = userData2.getActivePackage()) != null) {
            I5.a(getInfoTitle(), activePackage.getTitle(), false);
            return;
        }
        AutotekaTeaserGallery gallery5 = autotekaTeaserResult.getGallery();
        if (gallery5 == null || (userData = gallery5.getUserData()) == null || (personalDiscount = userData.getPersonalDiscount()) == null) {
            return;
        }
        I5.a(getInfoTitle(), personalDiscount.getTitle(), false);
        D6.G(getInfoBadgeContainer(), true);
        getInfoBadge().setText(personalDiscount.getAmount());
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

    public AutotekaTeaserGalleryViewV4FullScreen(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.fromBlock = FromBlock.f96085e;
        this.utmCampaign = "teaser_gallery_insights_list_fullscreen";
        this.title = C42727D.c(new n(this));
        this.description = C42727D.c(new f(this));
        this.iconView = C42727D.c(new g(this));
        this.illustrationView = C42727D.c(new h(this));
        this.buttonContainer = C42727D.c(new e(this));
        this.infoBadgeContainer = C42727D.c(new k(this));
        this.infoBadge = C42727D.c(new j(this));
        this.infoTitle = C42727D.c(new m(this));
        this.infoAdditional = C42727D.c(new i(this));
        this.infoDescription = C42727D.c(new l(this));
        View.inflate(context, R.layout.gallery_item_autoteka_teaser_view_v4_full_screen, this);
    }
}
