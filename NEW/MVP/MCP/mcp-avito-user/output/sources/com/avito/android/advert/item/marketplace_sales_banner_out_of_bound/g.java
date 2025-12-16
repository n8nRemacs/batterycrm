package com.avito.android.advert.item.marketplace_sales_banner_out_of_bound;

import Y61.k;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.window.layout.p;
import androidx.window.layout.s;
import com.avito.android.active_orders_common.items.order.n;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.sales_banner_image_out_of_bounds.Background;
import com.avito.android.remote.model.sales_banner_image_out_of_bounds.Button;
import com.avito.android.remote.model.sales_banner_image_out_of_bounds.Configuration;
import com.avito.android.remote.model.sales_banner_image_out_of_bounds.ImageLayoutSettings;
import com.avito.android.remote.model.sales_banner_image_out_of_bounds.SalesBannerImageOutOfBounds;
import com.avito.android.remote.model.sales_banner_image_out_of_bounds.WidthLayout;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import com.avito.android.util.y6;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ranges.l;
import sK0.C48063a;

/* compiled from: MarketplaceSalesBannerOutOfBoundsPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/marketplace_sales_banner_out_of_bound/g;", "LTV0/d;", "Lcom/avito/android/advert/item/marketplace_sales_banner_out_of_bound/i;", "Lcom/avito/android/advert/item/marketplace_sales_banner_out_of_bound/MarketplaceSalesBannerOutOfBoundsItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g implements TV0.d<i, MarketplaceSalesBannerOutOfBoundsItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f77581b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C f77582c;

    @Inject
    public g(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k C c12) {
        this.f77581b = aVar;
        this.f77582c = c12;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) throws Throwable {
        Configuration configuration;
        UniversalImage image;
        i iVar = (i) eVar;
        MarketplaceSalesBannerOutOfBoundsItem marketplaceSalesBannerOutOfBoundsItem = (MarketplaceSalesBannerOutOfBoundsItem) aVar;
        TreeMap treeMap = marketplaceSalesBannerOutOfBoundsItem.f77571i;
        f fVar = new f(marketplaceSalesBannerOutOfBoundsItem, this);
        p.f55345a.getClass();
        s sVarA = p.a.a();
        ViewGroup viewGroup = iVar.f77586b;
        int iWidth = sVarA.b(viewGroup.getContext()).f55343a.c().width();
        Banner banner = iVar.f77587c;
        ViewGroup.LayoutParams layoutParams = banner.getLayoutParams();
        int marginStart = iWidth - (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0);
        ViewGroup.LayoutParams layoutParams2 = banner.getLayoutParams();
        int marginEnd = ((marginStart - (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0)) - viewGroup.getPaddingStart()) - viewGroup.getPaddingEnd();
        Iterator it = treeMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                fVar.invoke(Integer.valueOf(marginEnd));
                configuration = new Configuration(new WidthLayout(null, null, 24), new WidthLayout(null, null, 24), null, null, null);
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            l lVar = (l) entry.getKey();
            configuration = (Configuration) entry.getValue();
            if (marginEnd <= lVar.f406906c && lVar.f406905b <= marginEnd) {
                break;
            }
        }
        e eVar2 = new e(marketplaceSalesBannerOutOfBoundsItem, this);
        i.B80(iVar.f77590f, configuration.getTextWidth());
        i.B80(iVar.f77593i, configuration.getButtonWidth());
        Configuration.ImageData imageData = configuration.getImageData();
        Image imageDependsOnThemeOrDefault = (imageData == null || (image = imageData.getImage()) == null) ? null : UniversalImageKt.getImageDependsOnThemeOrDefault(image, com.avito.android.lib.util.darkTheme.c.b(viewGroup.getContext()));
        SimpleDraweeView simpleDraweeView = iVar.f77591g;
        if (imageDependsOnThemeOrDefault == null) {
            D6.w(simpleDraweeView);
        } else {
            ViewGroup.LayoutParams layoutParams3 = simpleDraweeView.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
            ImageLayoutSettings layout = imageData.getLayout();
            marginLayoutParams.width = y6.b(layout.getSize().getWidth());
            marginLayoutParams.height = y6.b(layout.getSize().getHeight());
            simpleDraweeView.setTranslationX(layout.getOffset() != null ? y6.b(r7.getX()) : 0.0f);
            simpleDraweeView.setTranslationY(layout.getOffset() != null ? y6.b(r0.getY()) : 0.0f);
            simpleDraweeView.setLayoutParams(marginLayoutParams);
            D6.H(simpleDraweeView);
            com.avito.android.advert.item.delivery_suggests.l.w(imageDependsOnThemeOrDefault, C35949t5.a(simpleDraweeView));
        }
        SalesBannerImageOutOfBounds salesBannerImageOutOfBounds = marketplaceSalesBannerOutOfBoundsItem.f77566d;
        AttributedText title = salesBannerImageOutOfBounds.getTitle();
        Integer titleMaxLines = configuration.getTitleMaxLines();
        TextView textView = iVar.f77588d;
        j.a(textView, title, null);
        textView.setMaxLines(titleMaxLines != null ? titleMaxLines.intValue() : 2);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        AttributedText subtitle = salesBannerImageOutOfBounds.getSubtitle();
        Integer subtitleMaxLines = configuration.getSubtitleMaxLines();
        TextView textView2 = iVar.f77589e;
        j.a(textView2, subtitle, null);
        textView2.setMaxLines(subtitleMaxLines != null ? subtitleMaxLines.intValue() : 2);
        textView2.setEllipsize(truncateAt);
        Background background = salesBannerImageOutOfBounds.getBackground();
        Banner.h(banner, ColorStateList.valueOf(C48063a.f437606a.a(banner.getContext(), background.getColor())));
        Float opacity = background.getOpacity();
        banner.setAlpha(opacity != null ? opacity.floatValue() : 1.0f);
        Button button = salesBannerImageOutOfBounds.getButton();
        com.avito.android.lib.design.button.Button button2 = iVar.f77592h;
        if (button == null) {
            button2.setOnClickListener(null);
            D6.w(button2);
        } else {
            D6.H(button2);
            button2.setText(button.getText());
            button2.setAppearanceFromAttr(com.avito.android.lib.util.f.d(button.getStyle()));
            button2.setOnClickListener(new n(24, eVar2));
        }
    }
}
