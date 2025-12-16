package com.avito.android.map_core.view.marker;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.avito_map.marker.PartialMarker;
import com.avito.android.remote.model.search.map.Highlight;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import j.InterfaceC42165v;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import m.C43852a;

/* compiled from: MarkerPinView.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\"#B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\rR\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010!\u001a\u0004\u0018\u00010\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/avito/android/map_core/view/marker/MarkerPinView;", "Landroid/widget/FrameLayout;", "Lcom/avito/android/map_core/view/marker/l;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/avito/android/avito_map/marker/PartialMarker;", "pin", "Lkotlin/G0;", "setMarginTopForTextAndFavourite", "(Lcom/avito/android/avito_map/marker/PartialMarker;)V", "setText", "setFavourite", "setPinView", "setTextAndFavorite", "Landroid/widget/TextView;", "b", "Lkotlin/C;", "getDataText", "()Landroid/widget/TextView;", "dataText", "Landroid/widget/ImageView;", "c", "getIcon", "()Landroid/widget/ImageView;", "icon", "Landroid/widget/LinearLayout;", "d", "getPinContainer", "()Landroid/widget/LinearLayout;", "pinContainer", "Pin", "PinType", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MarkerPinView extends FrameLayout implements l {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC42726C dataText;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC42726C icon;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC42726C pinContainer;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarkerPinView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map_core/view/marker/MarkerPinView$Pin;", "", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Pin {

        /* renamed from: A, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f185751A;

        /* renamed from: e, reason: collision with root package name */
        public static final Pin f185752e;

        /* renamed from: f, reason: collision with root package name */
        public static final Pin f185753f;

        /* renamed from: g, reason: collision with root package name */
        public static final Pin f185754g;

        /* renamed from: h, reason: collision with root package name */
        public static final Pin f185755h;

        /* renamed from: i, reason: collision with root package name */
        public static final Pin f185756i;

        /* renamed from: j, reason: collision with root package name */
        public static final Pin f185757j;

        /* renamed from: k, reason: collision with root package name */
        public static final Pin f185758k;

        /* renamed from: l, reason: collision with root package name */
        public static final Pin f185759l;

        /* renamed from: m, reason: collision with root package name */
        public static final Pin f185760m;

        /* renamed from: n, reason: collision with root package name */
        public static final Pin f185761n;

        /* renamed from: o, reason: collision with root package name */
        public static final Pin f185762o;

        /* renamed from: p, reason: collision with root package name */
        public static final Pin f185763p;

        /* renamed from: q, reason: collision with root package name */
        public static final Pin f185764q;

        /* renamed from: r, reason: collision with root package name */
        public static final Pin f185765r;

        /* renamed from: s, reason: collision with root package name */
        public static final Pin f185766s;

        /* renamed from: t, reason: collision with root package name */
        public static final Pin f185767t;

        /* renamed from: u, reason: collision with root package name */
        public static final Pin f185768u;

        /* renamed from: v, reason: collision with root package name */
        public static final Pin f185769v;

        /* renamed from: w, reason: collision with root package name */
        public static final Pin f185770w;

        /* renamed from: x, reason: collision with root package name */
        public static final Pin f185771x;

        /* renamed from: y, reason: collision with root package name */
        public static final Pin f185772y;

        /* renamed from: z, reason: collision with root package name */
        public static final /* synthetic */ Pin[] f185773z;

        /* renamed from: b, reason: collision with root package name */
        public final int f185774b;

        /* renamed from: c, reason: collision with root package name */
        public final int f185775c;

        /* renamed from: d, reason: collision with root package name */
        public final int f185776d;

        static {
            Pin pin = new Pin("NO_DIGIT", 0, R.drawable.search_map_no_digit, R.drawable.search_map_no_digit_selected, R.drawable.search_map_no_digit_viewed);
            f185752e = pin;
            Pin pin2 = new Pin("ONE_DIGIT", 1, R.drawable.search_map_one_digit, R.drawable.search_map_one_digit_selected, R.drawable.search_map_one_digit_viewed);
            f185753f = pin2;
            Pin pin3 = new Pin("TWO_DIGITS", 2, R.drawable.search_map_two_digits, R.drawable.search_map_two_digits_selected, R.drawable.search_map_two_digits_viewed);
            f185754g = pin3;
            Pin pin4 = new Pin("THREE_DIGITS", 3, R.drawable.search_map_three_digits, R.drawable.search_map_three_digits_selected, R.drawable.search_map_three_digits_viewed);
            f185755h = pin4;
            Pin pin5 = new Pin("FOUR_DIGITS", 4, R.drawable.search_map_four_digits, R.drawable.search_map_four_digits_selected, R.drawable.search_map_four_digits_viewed);
            f185756i = pin5;
            Pin pin6 = new Pin("FAVOURITE_ONE_DIGIT", 5, R.drawable.search_map_one_favorites, R.drawable.search_map_one_favorites_selected, R.drawable.search_map_one_favorites);
            f185757j = pin6;
            Pin pin7 = new Pin("FAVOURITE_TWO_DIGITS", 6, R.drawable.search_map_two_digits_favorites, R.drawable.search_map_two_digits_selected, R.drawable.search_map_two_digits_favorites);
            f185758k = pin7;
            Pin pin8 = new Pin("FAVOURITE_THREE_DIGITS", 7, R.drawable.search_map_three_digits_favorites, R.drawable.search_map_three_digits_selected, R.drawable.search_map_three_digits_favorites);
            f185759l = pin8;
            Pin pin9 = new Pin("FAVOURITE_FOUR_DIGITS", 8, R.drawable.search_map_four_digits_favorites, R.drawable.search_map_four_digits_selected, R.drawable.search_map_four_digits_favorites);
            f185760m = pin9;
            Pin pin10 = new Pin("FAVOURITE_FIVE_DIGITS", 9, R.drawable.search_map_five_digits_favorites, R.drawable.search_map_five_digits_selected, R.drawable.search_map_five_digits_favorites);
            f185761n = pin10;
            Pin pin11 = new Pin("VIOLET_NO_DIGIT", 10, R.drawable.search_map_no_digit_violet, R.drawable.search_map_no_digit_selected, R.drawable.search_map_no_digit_viewed_violet);
            f185762o = pin11;
            Pin pin12 = new Pin("VIOLET_ONE_DIGIT", 11, R.drawable.search_map_one_digit_violet, R.drawable.search_map_one_digit_selected, R.drawable.search_map_one_digit_viewed_violet);
            f185763p = pin12;
            Pin pin13 = new Pin("VIOLET_TWO_DIGITS", 12, R.drawable.search_map_two_digits_violet, R.drawable.search_map_two_digits_selected, R.drawable.search_map_two_digits_viewed_violet);
            f185764q = pin13;
            Pin pin14 = new Pin("VIOLET_THREE_DIGITS", 13, R.drawable.search_map_three_digits_violet, R.drawable.search_map_three_digits_selected, R.drawable.search_map_three_digits_viewed_violet);
            f185765r = pin14;
            Pin pin15 = new Pin("VIOLET_FOUR_DIGITS", 14, R.drawable.search_map_four_digits_violet, R.drawable.search_map_four_digits_selected, R.drawable.search_map_four_digits_viewed_violet);
            f185766s = pin15;
            Pin pin16 = new Pin("GREEN_NO_DIGIT", 15, R.drawable.search_map_no_digit_green, R.drawable.search_map_no_digit_selected, R.drawable.search_map_no_digit_viewed_green);
            f185767t = pin16;
            Pin pin17 = new Pin("GREEN_ONE_DIGIT", 16, R.drawable.search_map_one_digit_green, R.drawable.search_map_one_digit_selected, R.drawable.search_map_one_digit_viewed_green);
            f185768u = pin17;
            Pin pin18 = new Pin("GREEN_TWO_DIGITS", 17, R.drawable.search_map_two_digits_green, R.drawable.search_map_two_digits_selected, R.drawable.search_map_two_digits_viewed_green);
            f185769v = pin18;
            Pin pin19 = new Pin("GREEN_THREE_DIGITS", 18, R.drawable.search_map_three_digits_green, R.drawable.search_map_three_digits_selected, R.drawable.search_map_three_digits_viewed_green);
            f185770w = pin19;
            Pin pin20 = new Pin("GREEN_FOUR_DIGITS", 19, R.drawable.search_map_four_digits_green, R.drawable.search_map_four_digits_selected, R.drawable.search_map_four_digits_viewed_green);
            f185771x = pin20;
            Pin pin21 = new Pin("GREEN_FIVE_DIGITS", 20, R.drawable.search_map_five_digits_green, R.drawable.search_map_five_digits_selected, R.drawable.search_map_five_digits_viewed_green);
            f185772y = pin21;
            Pin[] pinArr = {pin, pin2, pin3, pin4, pin5, pin6, pin7, pin8, pin9, pin10, pin11, pin12, pin13, pin14, pin15, pin16, pin17, pin18, pin19, pin20, pin21};
            f185773z = pinArr;
            f185751A = kotlin.enums.c.a(pinArr);
        }

        public Pin(@InterfaceC42165v String str, @InterfaceC42165v int i12, @InterfaceC42165v int i13, int i14, int i15) {
            this.f185774b = i13;
            this.f185775c = i14;
            this.f185776d = i15;
        }

        public static Pin valueOf(String str) {
            return (Pin) Enum.valueOf(Pin.class, str);
        }

        public static Pin[] values() {
            return (Pin[]) f185773z.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarkerPinView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map_core/view/marker/MarkerPinView$PinType;", "", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PinType {

        /* renamed from: b, reason: collision with root package name */
        public static final PinType f185777b;

        /* renamed from: c, reason: collision with root package name */
        public static final PinType f185778c;

        /* renamed from: d, reason: collision with root package name */
        public static final PinType f185779d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ PinType[] f185780e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f185781f;

        static {
            PinType pinType = new PinType("DEFAULT", 0);
            f185777b = pinType;
            PinType pinType2 = new PinType("SELECTED", 1);
            f185778c = pinType2;
            PinType pinType3 = new PinType("VIEWED", 2);
            f185779d = pinType3;
            PinType[] pinTypeArr = {pinType, pinType2, pinType3};
            f185780e = pinTypeArr;
            f185781f = kotlin.enums.c.a(pinTypeArr);
        }

        public PinType() {
            throw null;
        }

        public static PinType valueOf(String str) {
            return (PinType) Enum.valueOf(PinType.class, str);
        }

        public static PinType[] values() {
            return (PinType[]) f185780e.clone();
        }
    }

    /* compiled from: MarkerPinView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[PinType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PinType pinType = PinType.f185777b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PinType pinType2 = PinType.f185777b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public MarkerPinView(@Y61.k Context context, @Y61.k AttributeSet attributeSet) {
        super(context, attributeSet);
        this.dataText = C42727D.c(new com.avito.android.map_core.view.marker.a(this));
        this.icon = C42727D.c(new b(this));
        this.pinContainer = C42727D.c(new c(this));
    }

    private final TextView getDataText() {
        return (TextView) this.dataText.getValue();
    }

    private final ImageView getIcon() {
        return (ImageView) this.icon.getValue();
    }

    private final LinearLayout getPinContainer() {
        return (LinearLayout) this.pinContainer.getValue();
    }

    private final void setFavourite(PartialMarker pin) {
        ImageView icon = getIcon();
        if (icon != null) {
            if (!pin.isFavorite() || pin.getCount() <= 1) {
                icon.setImageDrawable(null);
            } else {
                icon.setImageDrawable(C43852a.a(icon.getContext(), R.drawable.search_map_favorites));
            }
        }
    }

    private final void setMarginTopForTextAndFavourite(PartialMarker pin) {
        int iJ2;
        LinearLayout pinContainer = getPinContainer();
        if (pinContainer != null) {
            if (pin.isFavorite()) {
                int count = pin.getCount();
                iJ2 = (2 > count || count >= 10) ? (10 > count || count >= 100) ? (100 > count || count >= 1000) ? D6.j(pinContainer, 21) : D6.j(pinContainer, 17) : D6.j(pinContainer, 13) : D6.j(pinContainer, 9);
            } else if (pin.getCount() < 10) {
                iJ2 = D6.j(pinContainer, 7);
            } else {
                int count2 = pin.getCount();
                if (10 > count2 || count2 >= 100) {
                    int count3 = pin.getCount();
                    if (100 > count3 || count3 >= 1000) {
                        int count4 = pin.getCount();
                        iJ2 = (1000 > count4 || count4 >= 10000) ? D6.j(pinContainer, 21) : D6.j(pinContainer, 17);
                    } else {
                        iJ2 = D6.j(pinContainer, 13);
                    }
                } else {
                    iJ2 = D6.j(pinContainer, 9);
                }
            }
            D6.c(pinContainer, null, Integer.valueOf(iJ2), null, null, 13);
        }
    }

    private final void setText(PartialMarker pin) {
        TextView dataText = getDataText();
        if (dataText != null) {
            I5.a(dataText, pin.getText(), false);
        }
    }

    public void setPinView(@Y61.k PartialMarker pin) {
        Pin pin2;
        int i12;
        if (pin.isFavorite()) {
            int count = pin.getCount();
            pin2 = count == 1 ? Pin.f185757j : (2 > count || count >= 10) ? (10 > count || count >= 100) ? (100 > count || count >= 1000) ? Pin.f185761n : Pin.f185760m : Pin.f185759l : Pin.f185758k;
        } else if (pin.getHighlight() == Highlight.Violet) {
            int count2 = pin.getCount();
            pin2 = count2 == 1 ? Pin.f185762o : (2 > count2 || count2 >= 10) ? (10 > count2 || count2 >= 100) ? (100 > count2 || count2 >= 1000) ? (1000 > count2 || count2 < 10000) ? Pin.f185766s : Pin.f185766s : Pin.f185765r : Pin.f185764q : Pin.f185763p;
        } else if (pin.getHighlight() == Highlight.Green) {
            int count3 = pin.getCount();
            pin2 = count3 == 1 ? Pin.f185767t : (2 > count3 || count3 >= 10) ? (10 > count3 || count3 >= 100) ? (100 > count3 || count3 >= 1000) ? (1000 > count3 || count3 >= 10000) ? Pin.f185772y : Pin.f185771x : Pin.f185770w : Pin.f185769v : Pin.f185768u;
        } else {
            int count4 = pin.getCount();
            pin2 = count4 == 1 ? Pin.f185752e : (2 > count4 || count4 >= 10) ? (10 > count4 || count4 >= 100) ? (100 > count4 || count4 >= 1000) ? (1000 > count4 || count4 < 10000) ? Pin.f185756i : Pin.f185756i : Pin.f185755h : Pin.f185754g : Pin.f185753f;
        }
        int iOrdinal = (pin.getSelected() ? PinType.f185778c : pin.isViewed() ? PinType.f185779d : PinType.f185777b).ordinal();
        if (iOrdinal == 0) {
            i12 = pin2.f185774b;
        } else if (iOrdinal == 1) {
            i12 = pin2.f185775c;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = pin2.f185776d;
        }
        setBackgroundResource(i12);
    }

    public void setTextAndFavorite(@Y61.k PartialMarker pin) {
        setMarginTopForTextAndFavourite(pin);
        setText(pin);
        setFavourite(pin);
    }
}
