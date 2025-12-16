package com.avito.android.photo_gallery.autoteka_teaser.v3;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.autoteka.analytics.event.FromBlock;
import com.avito.android.autoteka.model.AutotekaChoosingPurchaseButtonParams;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.docking_badge.DockingBadge;
import com.avito.android.photo_gallery.autoteka_teaser.g;
import com.avito.android.photo_gallery.autoteka_teaser.v;
import com.avito.android.photo_gallery.autoteka_teaser.w;
import com.avito.android.remote.model.autotekateaser.AutotekaDiscount;
import com.avito.android.remote.model.autotekateaser.AutotekaPurchaseAction;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserGalleryInsight;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: AutotekaTeaserV3GalleryViewFullScreen.kt */
@P
@s0
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001f\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0019\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0019\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/avito/android/photo_gallery/autoteka_teaser/v3/AutotekaTeaserV3GalleryViewFullScreen;", "Lcom/avito/android/photo_gallery/autoteka_teaser/v;", "", "text", "Lkotlin/G0;", "setTitle", "(Ljava/lang/String;)V", "setDescription", "Lcom/avito/android/remote/model/autotekateaser/AutotekaDiscount;", "discount", "setDiscount", "(Lcom/avito/android/remote/model/autotekateaser/AutotekaDiscount;)V", "Lcom/avito/android/autoteka/analytics/event/FromBlock;", "b", "Lcom/avito/android/autoteka/analytics/event/FromBlock;", "getFromBlock", "()Lcom/avito/android/autoteka/analytics/event/FromBlock;", "fromBlock", "c", "Ljava/lang/String;", "getUtmCampaign", "()Ljava/lang/String;", "utmCampaign", "Landroid/widget/TextView;", "d", "Lkotlin/C;", "getTitle", "()Landroid/widget/TextView;", "title", "e", "getDescription", "description", "Lcom/avito/android/lib/design/docking_badge/DockingBadge;", "f", "getDiscountAmount", "()Lcom/avito/android/lib/design/docking_badge/DockingBadge;", "discountAmount", "Landroid/widget/LinearLayout;", "g", "getButtonContainer", "()Landroid/widget/LinearLayout;", "buttonContainer", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AutotekaTeaserV3GalleryViewFullScreen extends v {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f216857h = 0;

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
    public final InterfaceC42726C description;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @k
    public final InterfaceC42726C discountAmount;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @k
    public final InterfaceC42726C buttonContainer;

    @j
    public AutotekaTeaserV3GalleryViewFullScreen(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final LinearLayout getButtonContainer() {
        return (LinearLayout) this.buttonContainer.getValue();
    }

    private final TextView getDescription() {
        return (TextView) this.description.getValue();
    }

    private final DockingBadge getDiscountAmount() {
        return (DockingBadge) this.discountAmount.getValue();
    }

    private final TextView getTitle() {
        return (TextView) this.title.getValue();
    }

    private final void setDescription(String text) {
        I5.a(getDescription(), text, false);
    }

    private final void setDiscount(AutotekaDiscount discount) {
        G0 g02;
        if (discount != null) {
            D6.H(getDiscountAmount());
            getDiscountAmount().setText(discount.getAmount());
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            D6.w(getDiscountAmount());
        }
    }

    private final void setTitle(String text) {
        I5.a(getTitle(), text, false);
    }

    @Override // com.avito.android.photo_gallery.autoteka_teaser.v
    public final void a(@k AutotekaTeaserResult autotekaTeaserResult, @l String str, @l com.avito.android.photo_gallery.autoteka_teaser.b bVar) {
        AutotekaTeaserGalleryInsight galleryInsight = autotekaTeaserResult.getGalleryInsight();
        G0 g02 = null;
        setTitle(galleryInsight != null ? galleryInsight.getTitle() : null);
        AutotekaTeaserGalleryInsight galleryInsight2 = autotekaTeaserResult.getGalleryInsight();
        setDescription(galleryInsight2 != null ? galleryInsight2.getSubtitle() : null);
        setDiscount(autotekaTeaserResult.getDiscount());
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
            buttonA.setOnClickListener(new g(bVar, autotekaChoosingPurchaseButtonParamsC, 3));
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            buttonA.setText(autotekaTeaserResult.getReportLink().getTitle());
            buttonA.setOnClickListener(new com.avito.android.job.cv_info_actualization.ui.items.radio.g(bVar, autotekaTeaserResult, this, 4));
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

    public AutotekaTeaserV3GalleryViewFullScreen(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.fromBlock = FromBlock.f96085e;
        this.utmCampaign = "teaser_gallery_single_insight_fullscreen";
        this.title = C42727D.c(new d(this));
        this.description = C42727D.c(new b(this));
        this.discountAmount = C42727D.c(new c(this));
        this.buttonContainer = C42727D.c(new a(this));
        View.inflate(context, R.layout.gallery_item_autoteka_teaser_v3_view_full_screen, this);
    }
}
