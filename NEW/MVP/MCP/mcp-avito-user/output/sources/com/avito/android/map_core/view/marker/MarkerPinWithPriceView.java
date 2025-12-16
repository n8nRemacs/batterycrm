package com.avito.android.map_core.view.marker;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.avito_map.marker.MarkerItem;
import com.avito.android.remote.model.search.map.Highlight;
import com.avito.android.util.D6;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MarkerPinWithPriceView.kt */
@s0
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0001\u001eB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fR\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u000e8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u00198DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/avito/android/map_core/view/marker/MarkerPinWithPriceView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/avito/android/avito_map/marker/MarkerItem$Pin;", "pin", "Lkotlin/G0;", "setView", "(Lcom/avito/android/avito_map/marker/MarkerItem$Pin;)V", "setTextAndIcon", "Landroid/widget/TextView;", "b", "Lkotlin/C;", "getPrice", "()Landroid/widget/TextView;", "price", "Landroid/widget/ImageView;", "c", "getIcon", "()Landroid/widget/ImageView;", "icon", "Landroid/widget/LinearLayout;", "d", "getPinContainer", "()Landroid/widget/LinearLayout;", "pinContainer", "PinWithPriceType", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public class MarkerPinWithPriceView extends FrameLayout {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC42726C price;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC42726C icon;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC42726C pinContainer;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarkerPinWithPriceView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map_core/view/marker/MarkerPinWithPriceView$PinWithPriceType;", "", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PinWithPriceType {

        /* renamed from: b, reason: collision with root package name */
        public static final PinWithPriceType f185786b;

        /* renamed from: c, reason: collision with root package name */
        public static final PinWithPriceType f185787c;

        /* renamed from: d, reason: collision with root package name */
        public static final PinWithPriceType f185788d;

        /* renamed from: e, reason: collision with root package name */
        public static final PinWithPriceType f185789e;

        /* renamed from: f, reason: collision with root package name */
        public static final PinWithPriceType f185790f;

        /* renamed from: g, reason: collision with root package name */
        public static final PinWithPriceType f185791g;

        /* renamed from: h, reason: collision with root package name */
        public static final PinWithPriceType f185792h;

        /* renamed from: i, reason: collision with root package name */
        public static final PinWithPriceType f185793i;

        /* renamed from: j, reason: collision with root package name */
        public static final PinWithPriceType f185794j;

        /* renamed from: k, reason: collision with root package name */
        public static final /* synthetic */ PinWithPriceType[] f185795k;

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f185796l;

        static {
            PinWithPriceType pinWithPriceType = new PinWithPriceType("REGULAR", 0);
            f185786b = pinWithPriceType;
            PinWithPriceType pinWithPriceType2 = new PinWithPriceType("SELECTED", 1);
            f185787c = pinWithPriceType2;
            PinWithPriceType pinWithPriceType3 = new PinWithPriceType("VIEWED", 2);
            f185788d = pinWithPriceType3;
            PinWithPriceType pinWithPriceType4 = new PinWithPriceType("FAVORITE", 3);
            f185789e = pinWithPriceType4;
            PinWithPriceType pinWithPriceType5 = new PinWithPriceType("FAVORITE_SELECTED", 4);
            f185790f = pinWithPriceType5;
            PinWithPriceType pinWithPriceType6 = new PinWithPriceType("VIOLET", 5);
            f185791g = pinWithPriceType6;
            PinWithPriceType pinWithPriceType7 = new PinWithPriceType("VIOLET_VIEWED", 6);
            f185792h = pinWithPriceType7;
            PinWithPriceType pinWithPriceType8 = new PinWithPriceType("GREEN", 7);
            f185793i = pinWithPriceType8;
            PinWithPriceType pinWithPriceType9 = new PinWithPriceType("GREEN_VIEWED", 8);
            f185794j = pinWithPriceType9;
            PinWithPriceType[] pinWithPriceTypeArr = {pinWithPriceType, pinWithPriceType2, pinWithPriceType3, pinWithPriceType4, pinWithPriceType5, pinWithPriceType6, pinWithPriceType7, pinWithPriceType8, pinWithPriceType9};
            f185795k = pinWithPriceTypeArr;
            f185796l = kotlin.enums.c.a(pinWithPriceTypeArr);
        }

        public PinWithPriceType() {
            throw null;
        }

        public static PinWithPriceType valueOf(String str) {
            return (PinWithPriceType) Enum.valueOf(PinWithPriceType.class, str);
        }

        public static PinWithPriceType[] values() {
            return (PinWithPriceType[]) f185795k.clone();
        }
    }

    /* compiled from: MarkerPinWithPriceView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f185797a;

        static {
            int[] iArr = new int[PinWithPriceType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PinWithPriceType pinWithPriceType = PinWithPriceType.f185786b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PinWithPriceType pinWithPriceType2 = PinWithPriceType.f185786b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                PinWithPriceType pinWithPriceType3 = PinWithPriceType.f185786b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                PinWithPriceType pinWithPriceType4 = PinWithPriceType.f185786b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                PinWithPriceType pinWithPriceType5 = PinWithPriceType.f185786b;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                PinWithPriceType pinWithPriceType6 = PinWithPriceType.f185786b;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                PinWithPriceType pinWithPriceType7 = PinWithPriceType.f185786b;
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                PinWithPriceType pinWithPriceType8 = PinWithPriceType.f185786b;
                iArr[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr2 = new int[Highlight.values().length];
            try {
                iArr2[Highlight.Violet.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[Highlight.Green.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            f185797a = iArr2;
        }
    }

    public MarkerPinWithPriceView(@Y61.k Context context, @Y61.k AttributeSet attributeSet) {
        super(context, attributeSet);
        this.price = C42727D.c(new h(this));
        this.icon = C42727D.c(new f(this));
        this.pinContainer = C42727D.c(new g(this));
    }

    @Y61.k
    public static PinWithPriceType a(@Y61.k MarkerItem.Pin pin) {
        int i12;
        if (pin.isFavorite() && !pin.getSelected()) {
            return PinWithPriceType.f185789e;
        }
        if (pin.isFavorite()) {
            return PinWithPriceType.f185790f;
        }
        if (!pin.getSelected() && !pin.isViewed()) {
            Highlight highlight = pin.getHighlight();
            i12 = highlight != null ? a.f185797a[highlight.ordinal()] : -1;
            return i12 != 1 ? i12 != 2 ? PinWithPriceType.f185786b : PinWithPriceType.f185793i : PinWithPriceType.f185791g;
        }
        if (pin.getSelected() || !pin.isViewed()) {
            return pin.getSelected() ? PinWithPriceType.f185787c : PinWithPriceType.f185786b;
        }
        Highlight highlight2 = pin.getHighlight();
        i12 = highlight2 != null ? a.f185797a[highlight2.ordinal()] : -1;
        return i12 != 1 ? i12 != 2 ? PinWithPriceType.f185788d : PinWithPriceType.f185794j : PinWithPriceType.f185792h;
    }

    private final ImageView getIcon() {
        return (ImageView) this.icon.getValue();
    }

    @Y61.l
    public final LinearLayout getPinContainer() {
        return (LinearLayout) this.pinContainer.getValue();
    }

    @Y61.l
    public final TextView getPrice() {
        return (TextView) this.price.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setTextAndIcon(@Y61.k com.avito.android.avito_map.marker.MarkerItem.Pin r7) {
        /*
            r6 = this;
            android.widget.ImageView r0 = r6.getIcon()
            r1 = 2130970416(0x7f040730, float:1.7549542E38)
            r2 = 0
            if (r0 == 0) goto L80
            boolean r3 = r7.isFavorite()
            r4 = 0
            if (r3 == 0) goto L35
            android.content.Context r3 = r0.getContext()
            r5 = 2131235430(0x7f081266, float:1.8087054E38)
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r5)
            r0.setImageDrawable(r3)
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            boolean r5 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r5 == 0) goto L2a
            r4 = r3
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
        L2a:
            if (r4 == 0) goto L80
            r3 = 1
            int r0 = com.avito.android.util.D6.j(r0, r3)
            r4.setMargins(r2, r2, r0, r2)
            goto L80
        L35:
            java.lang.String r3 = r7.getIcon()
            if (r3 == 0) goto L7d
            java.lang.String r3 = r7.getIcon()
            if (r3 == 0) goto L61
            java.lang.Integer r3 = com.avito.android.lib.util.q.a(r3)
            if (r3 == 0) goto L61
            android.content.Context r5 = r0.getContext()
            int r3 = r3.intValue()
            android.graphics.drawable.Drawable r3 = com.avito.android.util.C35835l0.h(r3, r5)
            if (r3 == 0) goto L61
            android.content.Context r5 = r0.getContext()
            int r5 = com.avito.android.util.C35835l0.d(r1, r5)
            r3.setTint(r5)
            goto L62
        L61:
            r3 = r4
        L62:
            r0.setImageDrawable(r3)
            if (r3 == 0) goto L80
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            boolean r5 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r5 == 0) goto L72
            r4 = r3
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
        L72:
            if (r4 == 0) goto L80
            r3 = 4
            int r0 = com.avito.android.util.D6.j(r0, r3)
            r4.setMargins(r2, r2, r0, r2)
            goto L80
        L7d:
            r0.setImageDrawable(r4)
        L80:
            android.widget.TextView r0 = r6.getPrice()
            if (r0 == 0) goto L9e
            java.lang.String r3 = r7.getPrice()
            if (r3 == 0) goto L93
            java.lang.String r7 = r7.getPrice()
            com.avito.android.util.I5.a(r0, r7, r2)
        L93:
            android.content.Context r7 = r0.getContext()
            int r7 = com.avito.android.util.C35835l0.d(r1, r7)
            r0.setTextColor(r7)
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.map_core.view.marker.MarkerPinWithPriceView.setTextAndIcon(com.avito.android.avito_map.marker.MarkerItem$Pin):void");
    }

    public void setView(@Y61.k MarkerItem.Pin pin) {
        LinearLayout pinContainer = getPinContainer();
        if (pinContainer != null) {
            switch (a(pin).ordinal()) {
                case 0:
                    D6.D(pinContainer, R.drawable.search_map_marker_with_price_default);
                    break;
                case 1:
                    D6.D(pinContainer, R.drawable.search_map_marker_with_price_selected);
                    break;
                case 2:
                    D6.D(pinContainer, R.drawable.search_map_marker_with_price_viewed);
                    break;
                case 3:
                    D6.D(pinContainer, R.drawable.search_map_marker_with_price_favorites);
                    break;
                case 4:
                    D6.D(pinContainer, R.drawable.search_map_marker_with_price_favorite_selected);
                    break;
                case 5:
                    D6.D(pinContainer, R.drawable.search_map_marker_with_price_violet_default);
                    break;
                case 6:
                    D6.D(pinContainer, R.drawable.search_map_marker_with_price_violet_viewed);
                    break;
                case 7:
                    D6.D(pinContainer, R.drawable.search_map_marker_with_price_green_default);
                    break;
                case 8:
                    D6.D(pinContainer, R.drawable.search_map_marker_with_price_green_viewed);
                    break;
            }
        }
    }
}
