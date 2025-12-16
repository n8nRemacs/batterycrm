package com.avito.android.advert.item.teaser;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.docking_badge.DockingBadge;
import com.avito.android.lib.design.gradient.AvitoLinearGradientDrawable;
import com.avito.android.remote.model.auto_select.SelectButtonParams;
import com.avito.android.remote.model.autoteka_teaser_select.AutotekaTeaserSelectV2Result;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import x4.c;

/* compiled from: AutotekaSelectV2TeaserView.kt */
@P
@s0
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR\u001b\u0010\u0012\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000bR\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\t\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010 \u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\t\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/avito/android/advert/item/teaser/AutotekaSelectV2TeaserView;", "Landroid/widget/LinearLayout;", "Lcom/avito/android/remote/model/autoteka_teaser_select/AutotekaTeaserSelectV2Result$Background;", BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, "Lkotlin/G0;", "setBackground", "(Lcom/avito/android/remote/model/autoteka_teaser_select/AutotekaTeaserSelectV2Result$Background;)V", "Landroid/widget/TextView;", "b", "Lkotlin/C;", "getTitleView", "()Landroid/widget/TextView;", "titleView", "c", "getDescriptionView", "descriptionView", "d", "getPriceView", "priceView", "Lcom/avito/android/lib/design/docking_badge/DockingBadge;", "e", "getBadgeView", "()Lcom/avito/android/lib/design/docking_badge/DockingBadge;", "badgeView", "Lcom/avito/android/lib/design/button/Button;", "f", "getButtonView", "()Lcom/avito/android/lib/design/button/Button;", "buttonView", "g", "getBackgroundView", "()Landroid/widget/LinearLayout;", "backgroundView", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AutotekaSelectV2TeaserView extends LinearLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f80519h = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC42726C titleView;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC42726C descriptionView;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC42726C priceView;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC42726C badgeView;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC42726C buttonView;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC42726C backgroundView;

    @X41.j
    public AutotekaSelectV2TeaserView(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final LinearLayout getBackgroundView() {
        return (LinearLayout) this.backgroundView.getValue();
    }

    private final DockingBadge getBadgeView() {
        return (DockingBadge) this.badgeView.getValue();
    }

    private final Button getButtonView() {
        return (Button) this.buttonView.getValue();
    }

    private final TextView getDescriptionView() {
        return (TextView) this.descriptionView.getValue();
    }

    private final TextView getPriceView() {
        return (TextView) this.priceView.getValue();
    }

    private final TextView getTitleView() {
        return (TextView) this.titleView.getValue();
    }

    private final void setBackground(AutotekaTeaserSelectV2Result.Background background) {
        String color;
        String gradient;
        if (background == null || (gradient = background.getGradient()) == null) {
            if (background == null || (color = background.getColor()) == null) {
                return;
            }
            Integer numA = com.avito.android.lib.util.e.a(color);
            getBackgroundView().setBackgroundColor(C35835l0.d(numA != null ? numA.intValue() : R.attr.green200, getContext()));
            return;
        }
        Integer numH = com.avito.android.lib.util.f.h(gradient);
        int iIntValue = numH != null ? numH.intValue() : R.attr.gradientLinearMixedHorizontalRedBlue;
        LinearLayout backgroundView = getBackgroundView();
        AvitoLinearGradientDrawable.a.C5275a c5275a = new AvitoLinearGradientDrawable.a.C5275a(getContext(), iIntValue, 0, 4, null);
        c5275a.f179264a = y6.b(24);
        backgroundView.setBackground(new AvitoLinearGradientDrawable(c5275a.a()));
    }

    public final void a(@Y61.l String str, @Y61.l AttributedText attributedText, @Y61.l AttributedText attributedText2, @Y61.k String str2, @Y61.l SelectButtonParams selectButtonParams, @Y61.l AutotekaTeaserSelectV2Result.Background background, @Y61.l c.a aVar) {
        String style;
        setBackground(background);
        I5.a(getTitleView(), str, false);
        com.avito.android.util.text.j.a(getDescriptionView(), attributedText, null);
        com.avito.android.util.text.j.a(getPriceView(), attributedText2, null);
        getBadgeView().setText(str2);
        com.avito.android.lib.design.button.b.a(getButtonView(), selectButtonParams != null ? selectButtonParams.getText() : null, false);
        getButtonView().setOnClickListener(new com.avito.android.advert.item.ownership_cost.dialogs.region_select.item.g(10, selectButtonParams, aVar));
        if (selectButtonParams == null || (style = selectButtonParams.getStyle()) == null) {
            return;
        }
        getButtonView().setAppearanceFromAttr(com.avito.android.lib.util.f.d(style));
    }

    public AutotekaSelectV2TeaserView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.titleView = C42727D.c(new k(this));
        this.descriptionView = C42727D.c(new i(this));
        this.priceView = C42727D.c(new j(this));
        this.badgeView = C42727D.c(new g(this));
        this.buttonView = C42727D.c(new h(this));
        this.backgroundView = C42727D.c(new f(this));
        View.inflate(context, R.layout.advert_details_select_v2_teaser_container, this);
    }
}
