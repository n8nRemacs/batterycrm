package com.avito.android.map_core.view.marker;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.avito_map.marker.MarkerItem;
import com.avito.android.map_core.view.marker.MarkerPinWithPriceView;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;

/* compiled from: MarkerPinWithBrandView.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fR\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/map_core/view/marker/MarkerPinWithBrandView;", "Lcom/avito/android/map_core/view/marker/MarkerPinWithPriceView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/avito/android/avito_map/marker/MarkerItem$Pin;", "pin", "Lkotlin/G0;", "setView", "(Lcom/avito/android/avito_map/marker/MarkerItem$Pin;)V", "setTextAndIcon", "Landroid/widget/ImageView;", "e", "Lkotlin/C;", "getBrandImage", "()Landroid/widget/ImageView;", "brandImage", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MarkerPinWithBrandView extends MarkerPinWithPriceView {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC42726C brandImage;

    /* compiled from: MarkerPinWithBrandView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[MarkerPinWithPriceView.PinWithPriceType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MarkerPinWithPriceView.PinWithPriceType pinWithPriceType = MarkerPinWithPriceView.PinWithPriceType.f185786b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                MarkerPinWithPriceView.PinWithPriceType pinWithPriceType2 = MarkerPinWithPriceView.PinWithPriceType.f185786b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                MarkerPinWithPriceView.PinWithPriceType pinWithPriceType3 = MarkerPinWithPriceView.PinWithPriceType.f185786b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                MarkerPinWithPriceView.PinWithPriceType pinWithPriceType4 = MarkerPinWithPriceView.PinWithPriceType.f185786b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public MarkerPinWithBrandView(@Y61.k Context context, @Y61.k AttributeSet attributeSet) {
        super(context, attributeSet);
        this.brandImage = C42727D.c(new e(this));
    }

    private final ImageView getBrandImage() {
        return (ImageView) this.brandImage.getValue();
    }

    public final void b(@Y61.k MarkerItem.Pin pin, @Y61.l Drawable drawable) {
        ImageView brandImage = getBrandImage();
        if (brandImage != null) {
            if (drawable != null) {
                D6.H(brandImage);
                brandImage.setImageDrawable(drawable);
            } else {
                D6.w(brandImage);
            }
            brandImage.setAlpha((!pin.isViewed() || pin.getSelected()) ? 1.0f : 0.6f);
        }
    }

    @Override // com.avito.android.map_core.view.marker.MarkerPinWithPriceView
    public void setTextAndIcon(@Y61.k MarkerItem.Pin pin) {
        TextView price = getPrice();
        if (price != null) {
            I5.a(price, pin.getPrice(), false);
            price.setTextColor(pin.getSelected() ? C35835l0.d(R.attr.constantWhite, price.getContext()) : C35835l0.d(R.attr.constantBlack, price.getContext()));
            price.setAlpha((!pin.isViewed() || pin.getSelected()) ? 1.0f : 0.6f);
        }
    }

    @Override // com.avito.android.map_core.view.marker.MarkerPinWithPriceView
    public void setView(@Y61.k MarkerItem.Pin pin) {
        LinearLayout pinContainer = getPinContainer();
        if (pinContainer != null) {
            int iOrdinal = MarkerPinWithPriceView.a(pin).ordinal();
            if (iOrdinal == 0) {
                D6.D(pinContainer, R.drawable.search_map_marker_with_brand_default);
                return;
            }
            if (iOrdinal == 1) {
                D6.D(pinContainer, R.drawable.search_map_marker_with_brand_selected);
                return;
            }
            if (iOrdinal == 2) {
                D6.D(pinContainer, R.drawable.search_map_marker_with_brand_default);
                return;
            }
            if (iOrdinal == 3) {
                D6.D(pinContainer, R.drawable.search_map_marker_with_brand_default);
            } else if (iOrdinal != 4) {
                super.setView(pin);
            } else {
                D6.D(pinContainer, R.drawable.search_map_marker_with_brand_selected);
            }
        }
    }
}
