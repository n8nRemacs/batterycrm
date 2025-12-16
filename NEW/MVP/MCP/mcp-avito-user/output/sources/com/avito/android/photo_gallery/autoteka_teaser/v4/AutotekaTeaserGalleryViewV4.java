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
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.docking_badge.DockingBadge;
import com.avito.android.photo_gallery.autoteka_teaser.v;
import com.avito.android.photo_gallery.autoteka_teaser.w;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserGallery;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult;
import com.avito.android.remote.model.autotekateaser.MiniGallery;
import com.avito.android.remote.model.autotekateaser.PersonalDiscount;
import com.avito.android.remote.model.autotekateaser.UserData;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaTeaserGalleryViewV4.kt */
@P
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001e\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0015R\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0013\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/avito/android/photo_gallery/autoteka_teaser/v4/AutotekaTeaserGalleryViewV4;", "Lcom/avito/android/photo_gallery/autoteka_teaser/v;", "", "getSmallButtonStyle", "()I", "Lcom/avito/android/autoteka/analytics/event/FromBlock;", "b", "Lcom/avito/android/autoteka/analytics/event/FromBlock;", "getFromBlock", "()Lcom/avito/android/autoteka/analytics/event/FromBlock;", "fromBlock", "", "c", "Ljava/lang/String;", "getUtmCampaign", "()Ljava/lang/String;", "utmCampaign", "Landroid/widget/TextView;", "d", "Lkotlin/C;", "getTitle", "()Landroid/widget/TextView;", "title", "Landroid/widget/ImageView;", "e", "getIconView", "()Landroid/widget/ImageView;", "iconView", "f", "getDescription", "description", "Landroid/widget/LinearLayout;", "g", "getButtonContainer", "()Landroid/widget/LinearLayout;", "buttonContainer", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AutotekaTeaserGalleryViewV4 extends v {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f216868h = 0;

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
    public final InterfaceC42726C iconView;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC42726C description;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC42726C buttonContainer;

    @X41.j
    public AutotekaTeaserGalleryViewV4(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final LinearLayout getButtonContainer() {
        return (LinearLayout) this.buttonContainer.getValue();
    }

    private final TextView getDescription() {
        return (TextView) this.description.getValue();
    }

    private final ImageView getIconView() {
        return (ImageView) this.iconView.getValue();
    }

    private final int getSmallButtonStyle() {
        return (getResources().getConfiguration().uiMode & 48) == 32 ? R.attr.buttonPrimarySmall : R.attr.buttonOverlayPrimarySmall;
    }

    private final TextView getTitle() {
        return (TextView) this.title.getValue();
    }

    @Override // com.avito.android.photo_gallery.autoteka_teaser.v
    public final void a(@Y61.k AutotekaTeaserResult autotekaTeaserResult, @Y61.l String str, @Y61.l com.avito.android.photo_gallery.autoteka_teaser.b bVar) {
        UserData userData;
        MiniGallery mini;
        MiniGallery mini2;
        AutotekaTeaserGallery gallery = autotekaTeaserResult.getGallery();
        if (gallery != null && (mini = gallery.getMini()) != null) {
            getTitle().setText(mini.getTitle());
            I5.a(getDescription(), mini.getSubtitle(), false);
            getButtonContainer().removeAllViews();
            w wVar = w.f216902a;
            Context context = getContext();
            wVar.getClass();
            Button button = new Button(new ContextThemeWrapper(context, R.style.Theme_DesignSystem_Re23), null, 0, 0, 12, null);
            button.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            com.avito.android.photo_gallery.autoteka_teaser.a.f216807a.getClass();
            button.setAppearanceFromAttr((button.getResources().getConfiguration().uiMode & 48) == 32 ? R.attr.buttonPrimaryMedium : R.attr.buttonOverlayPrimaryMedium);
            AutotekaTeaserGallery gallery2 = autotekaTeaserResult.getGallery();
            if (gallery2 != null && (mini2 = gallery2.getMini()) != null) {
                button.setText(mini2.getButton().getAction().getTitle());
                button.setOnClickListener(new com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.j(8, bVar, mini2));
            }
            getButtonContainer().addView(button);
            if (L.f(mini.getImage().getIconPhoto(), Boolean.TRUE)) {
                getIconView().setImageDrawable(C35835l0.m(getIconView().getContext(), R.attr.ic_camera36, R.attr.constantWhite));
            } else {
                getIconView().setImageResource(R.drawable.ic_autoteka_logo_in_teaser);
            }
        }
        AutotekaTeaserGallery gallery3 = autotekaTeaserResult.getGallery();
        G0 g02 = null;
        PersonalDiscount personalDiscount = (gallery3 == null || (userData = gallery3.getUserData()) == null) ? null : userData.getPersonalDiscount();
        if (personalDiscount != null) {
            D6.H(findViewById(R.id.discountContainer));
            ((TextView) findViewById(R.id.discountTitle)).setText(personalDiscount.getTitle());
            ((DockingBadge) findViewById(R.id.discountAmount)).setText(personalDiscount.getAmount());
            g02 = G0.f406611a;
        }
        if (g02 == null) {
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        super.onMeasure(i12, i13);
        com.avito.android.photo_gallery.autoteka_teaser.a.f216807a.getClass();
        Q qA2 = com.avito.android.photo_gallery.autoteka_teaser.a.a(this);
        setMeasuredDimension(((Number) qA2.f406619b).intValue(), ((Number) qA2.f406620c).intValue());
    }

    public AutotekaTeaserGalleryViewV4(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.fromBlock = FromBlock.f96085e;
        this.utmCampaign = "teaser_gallery_insights_list";
        this.title = C42727D.c(new d(this));
        this.iconView = C42727D.c(new c(this));
        this.description = C42727D.c(new b(this));
        this.buttonContainer = C42727D.c(new a(this));
        View.inflate(context, R.layout.gallery_item_autoteka_teaser_view_v4, this);
    }
}
