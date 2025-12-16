package com.avito.android.photo_gallery.autoteka_teaser;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.autoteka.analytics.event.FromBlock;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserGalleryInsight;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult;
import com.avito.android.util.I5;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;

/* compiled from: AutotekaTeaserGallerySingleInsightView.kt */
@P
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001b\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/avito/android/photo_gallery/autoteka_teaser/AutotekaTeaserGallerySingleInsightView;", "Lcom/avito/android/photo_gallery/autoteka_teaser/v;", "Lcom/avito/android/photo_gallery/autoteka_teaser/b;", "listener", "Lkotlin/G0;", "setButton", "(Lcom/avito/android/photo_gallery/autoteka_teaser/b;)V", "Lcom/avito/android/autoteka/analytics/event/FromBlock;", "b", "Lcom/avito/android/autoteka/analytics/event/FromBlock;", "getFromBlock", "()Lcom/avito/android/autoteka/analytics/event/FromBlock;", "fromBlock", "", "c", "Ljava/lang/String;", "getUtmCampaign", "()Ljava/lang/String;", "utmCampaign", "Landroid/widget/TextView;", "d", "Lkotlin/C;", "getTitle", "()Landroid/widget/TextView;", "title", "e", "getDescription", "description", "Landroid/widget/LinearLayout;", "f", "getButtonContainer", "()Landroid/widget/LinearLayout;", "buttonContainer", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AutotekaTeaserGallerySingleInsightView extends v {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f216790g = 0;

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
    public final InterfaceC42726C buttonContainer;

    @X41.j
    public AutotekaTeaserGallerySingleInsightView(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final LinearLayout getButtonContainer() {
        return (LinearLayout) this.buttonContainer.getValue();
    }

    private final TextView getDescription() {
        return (TextView) this.description.getValue();
    }

    private final TextView getTitle() {
        return (TextView) this.title.getValue();
    }

    private final void setButton(b listener) {
        getButtonContainer().removeAllViews();
        Button button = new Button(new ContextThemeWrapper(getContext(), R.style.Theme_DesignSystem_Re23), null, 0, 0, 12, null);
        button.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        button.setAppearanceFromAttr(R.attr.buttonAccentSmallTwoRows);
        button.setText(R.string.gallery_teaser_button_show_text);
        button.setOnClickListener(new c(listener, 1));
        getButtonContainer().addView(button);
    }

    @Override // com.avito.android.photo_gallery.autoteka_teaser.v
    public final void a(@Y61.k AutotekaTeaserResult autotekaTeaserResult, @Y61.l String str, @Y61.l b bVar) {
        TextView title = getTitle();
        AutotekaTeaserGalleryInsight galleryInsight = autotekaTeaserResult.getGalleryInsight();
        title.setText(galleryInsight != null ? galleryInsight.getTitle() : null);
        TextView description = getDescription();
        AutotekaTeaserGalleryInsight galleryInsight2 = autotekaTeaserResult.getGalleryInsight();
        I5.a(description, galleryInsight2 != null ? galleryInsight2.getSubtitle() : null, false);
        setButton(bVar);
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
        a.f216807a.getClass();
        Q qA2 = a.a(this);
        setMeasuredDimension(((Number) qA2.f406619b).intValue(), ((Number) qA2.f406620c).intValue());
    }

    public AutotekaTeaserGallerySingleInsightView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.fromBlock = FromBlock.f96084d;
        this.utmCampaign = "teaser_gallery_single_insight";
        this.title = C42727D.c(new p(this));
        this.description = C42727D.c(new o(this));
        this.buttonContainer = C42727D.c(new n(this));
        View.inflate(context, R.layout.gallery_item_autoteka_teaser_view_single_insight, this);
    }
}
