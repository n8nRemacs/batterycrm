package com.avito.android.search_bar.utils;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.lib.util.darkTheme.ThemeAppearance;
import com.avito.android.remote.model.UniversalColor;
import j.InterfaceC42156l;
import j.InterfaceC42158n;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UdfToolbarStyle.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/avito/android/search_bar/utils/UdfToolbarStyle;", "", "BottomPaddingType", "CartIconRightMargin", "a", "Color", "b", "c", "d", "SearchInputHeightType", "SearchInputRightMargin", "e", "f", "_avito_search-bar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class UdfToolbarStyle {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Color f264054a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final c f264055b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final e f264056c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final b f264057d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final a f264058e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final f f264059f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final BottomPaddingType f264060g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UdfToolbarStyle.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_bar/utils/UdfToolbarStyle$BottomPaddingType;", "", "_avito_search-bar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BottomPaddingType {

        /* renamed from: b, reason: collision with root package name */
        public static final BottomPaddingType f264061b;

        /* renamed from: c, reason: collision with root package name */
        public static final BottomPaddingType f264062c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ BottomPaddingType[] f264063d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f264064e;

        static {
            BottomPaddingType bottomPaddingType = new BottomPaddingType("VISIBLE_INLINES", 0);
            f264061b = bottomPaddingType;
            BottomPaddingType bottomPaddingType2 = new BottomPaddingType("INVISIBLE_INLINES", 1);
            f264062c = bottomPaddingType2;
            BottomPaddingType[] bottomPaddingTypeArr = {bottomPaddingType, bottomPaddingType2};
            f264063d = bottomPaddingTypeArr;
            f264064e = kotlin.enums.c.a(bottomPaddingTypeArr);
        }

        public BottomPaddingType() {
            throw null;
        }

        public static BottomPaddingType valueOf(String str) {
            return (BottomPaddingType) Enum.valueOf(BottomPaddingType.class, str);
        }

        public static BottomPaddingType[] values() {
            return (BottomPaddingType[]) f264063d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UdfToolbarStyle.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_bar/utils/UdfToolbarStyle$CartIconRightMargin;", "", "_avito_search-bar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CartIconRightMargin {

        /* renamed from: b, reason: collision with root package name */
        public static final CartIconRightMargin f264065b;

        /* renamed from: c, reason: collision with root package name */
        public static final CartIconRightMargin f264066c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ CartIconRightMargin[] f264067d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f264068e;

        static {
            CartIconRightMargin cartIconRightMargin = new CartIconRightMargin("DEFAULT", 0);
            f264065b = cartIconRightMargin;
            CartIconRightMargin cartIconRightMargin2 = new CartIconRightMargin("SEARCH_PROMO_HEADER_WIDGET", 1);
            f264066c = cartIconRightMargin2;
            CartIconRightMargin[] cartIconRightMarginArr = {cartIconRightMargin, cartIconRightMargin2};
            f264067d = cartIconRightMarginArr;
            f264068e = kotlin.enums.c.a(cartIconRightMarginArr);
        }

        public CartIconRightMargin() {
            throw null;
        }

        public static CartIconRightMargin valueOf(String str) {
            return (CartIconRightMargin) Enum.valueOf(CartIconRightMargin.class, str);
        }

        public static CartIconRightMargin[] values() {
            return (CartIconRightMargin[]) f264067d.clone();
        }
    }

    /* compiled from: UdfToolbarStyle.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/search_bar/utils/UdfToolbarStyle$Color;", "Landroid/os/Parcelable;", "ByColor", "ByRes", "ByUniversalColor", "RippleColorByThemeAppearance", "Lcom/avito/android/search_bar/utils/UdfToolbarStyle$Color$ByColor;", "Lcom/avito/android/search_bar/utils/UdfToolbarStyle$Color$ByRes;", "Lcom/avito/android/search_bar/utils/UdfToolbarStyle$Color$ByUniversalColor;", "Lcom/avito/android/search_bar/utils/UdfToolbarStyle$Color$RippleColorByThemeAppearance;", "_avito_search-bar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public interface Color extends Parcelable {

        /* compiled from: UdfToolbarStyle.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_bar/utils/UdfToolbarStyle$Color$ByColor;", "Lcom/avito/android/search_bar/utils/UdfToolbarStyle$Color;", "_avito_search-bar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ByColor implements Color {

            @k
            public static final Parcelable.Creator<ByColor> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            public final int f264069b;

            /* compiled from: UdfToolbarStyle.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ByColor> {
                @Override // android.os.Parcelable.Creator
                public final ByColor createFromParcel(Parcel parcel) {
                    return new ByColor(parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final ByColor[] newArray(int i12) {
                    return new ByColor[i12];
                }
            }

            public ByColor(@InterfaceC42156l int i12) {
                this.f264069b = i12;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ByColor) && this.f264069b == ((ByColor) obj).f264069b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f264069b);
            }

            @k
            public final String toString() {
                return r.t(new StringBuilder("ByColor(color="), this.f264069b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(this.f264069b);
            }
        }

        /* compiled from: UdfToolbarStyle.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_bar/utils/UdfToolbarStyle$Color$ByRes;", "Lcom/avito/android/search_bar/utils/UdfToolbarStyle$Color;", "_avito_search-bar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ByRes implements Color {

            @k
            public static final Parcelable.Creator<ByRes> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            public final int f264070b;

            /* compiled from: UdfToolbarStyle.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ByRes> {
                @Override // android.os.Parcelable.Creator
                public final ByRes createFromParcel(Parcel parcel) {
                    return new ByRes(parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final ByRes[] newArray(int i12) {
                    return new ByRes[i12];
                }
            }

            public ByRes(@InterfaceC42158n int i12) {
                this.f264070b = i12;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ByRes) && this.f264070b == ((ByRes) obj).f264070b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f264070b);
            }

            @k
            public final String toString() {
                return r.t(new StringBuilder("ByRes(colorRes="), this.f264070b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(this.f264070b);
            }
        }

        /* compiled from: UdfToolbarStyle.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_bar/utils/UdfToolbarStyle$Color$ByUniversalColor;", "Lcom/avito/android/search_bar/utils/UdfToolbarStyle$Color;", "_avito_search-bar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ByUniversalColor implements Color {

            @k
            public static final Parcelable.Creator<ByUniversalColor> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final UniversalColor f264071b;

            /* compiled from: UdfToolbarStyle.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ByUniversalColor> {
                @Override // android.os.Parcelable.Creator
                public final ByUniversalColor createFromParcel(Parcel parcel) {
                    return new ByUniversalColor((UniversalColor) parcel.readParcelable(ByUniversalColor.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final ByUniversalColor[] newArray(int i12) {
                    return new ByUniversalColor[i12];
                }
            }

            public ByUniversalColor(@k UniversalColor universalColor) {
                this.f264071b = universalColor;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ByUniversalColor) && L.f(this.f264071b, ((ByUniversalColor) obj).f264071b);
            }

            public final int hashCode() {
                return this.f264071b.hashCode();
            }

            @k
            public final String toString() {
                return com.avito.android.advert.item.delivery_suggests.l.r(new StringBuilder("ByUniversalColor(universalColor="), this.f264071b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeParcelable(this.f264071b, i12);
            }
        }

        /* compiled from: UdfToolbarStyle.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_bar/utils/UdfToolbarStyle$Color$RippleColorByThemeAppearance;", "Lcom/avito/android/search_bar/utils/UdfToolbarStyle$Color;", "_avito_search-bar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class RippleColorByThemeAppearance implements Color {

            @k
            public static final Parcelable.Creator<RippleColorByThemeAppearance> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final ThemeAppearance f264072b;

            /* compiled from: UdfToolbarStyle.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<RippleColorByThemeAppearance> {
                @Override // android.os.Parcelable.Creator
                public final RippleColorByThemeAppearance createFromParcel(Parcel parcel) {
                    return new RippleColorByThemeAppearance(ThemeAppearance.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final RippleColorByThemeAppearance[] newArray(int i12) {
                    return new RippleColorByThemeAppearance[i12];
                }
            }

            public RippleColorByThemeAppearance(@k ThemeAppearance themeAppearance) {
                this.f264072b = themeAppearance;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RippleColorByThemeAppearance) && this.f264072b == ((RippleColorByThemeAppearance) obj).f264072b;
            }

            public final int hashCode() {
                return this.f264072b.hashCode();
            }

            @k
            public final String toString() {
                return "RippleColorByThemeAppearance(themeAppearance=" + this.f264072b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.f264072b.name());
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UdfToolbarStyle.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_bar/utils/UdfToolbarStyle$SearchInputHeightType;", "", "_avito_search-bar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SearchInputHeightType {

        /* renamed from: b, reason: collision with root package name */
        public static final SearchInputHeightType f264073b;

        /* renamed from: c, reason: collision with root package name */
        public static final SearchInputHeightType f264074c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ SearchInputHeightType[] f264075d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f264076e;

        static {
            SearchInputHeightType searchInputHeightType = new SearchInputHeightType("DEFAULT", 0);
            f264073b = searchInputHeightType;
            SearchInputHeightType searchInputHeightType2 = new SearchInputHeightType("SEARCH_PROMO_HEADER_WIDGET", 1);
            f264074c = searchInputHeightType2;
            SearchInputHeightType[] searchInputHeightTypeArr = {searchInputHeightType, searchInputHeightType2};
            f264075d = searchInputHeightTypeArr;
            f264076e = kotlin.enums.c.a(searchInputHeightTypeArr);
        }

        public SearchInputHeightType() {
            throw null;
        }

        public static SearchInputHeightType valueOf(String str) {
            return (SearchInputHeightType) Enum.valueOf(SearchInputHeightType.class, str);
        }

        public static SearchInputHeightType[] values() {
            return (SearchInputHeightType[]) f264075d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UdfToolbarStyle.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_bar/utils/UdfToolbarStyle$SearchInputRightMargin;", "", "_avito_search-bar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SearchInputRightMargin {

        /* renamed from: b, reason: collision with root package name */
        public static final SearchInputRightMargin f264077b;

        /* renamed from: c, reason: collision with root package name */
        public static final SearchInputRightMargin f264078c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ SearchInputRightMargin[] f264079d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f264080e;

        static {
            SearchInputRightMargin searchInputRightMargin = new SearchInputRightMargin("DEFAULT", 0);
            f264077b = searchInputRightMargin;
            SearchInputRightMargin searchInputRightMargin2 = new SearchInputRightMargin("SEARCH_PROMO_HEADER_WIDGET", 1);
            f264078c = searchInputRightMargin2;
            SearchInputRightMargin[] searchInputRightMarginArr = {searchInputRightMargin, searchInputRightMargin2};
            f264079d = searchInputRightMarginArr;
            f264080e = kotlin.enums.c.a(searchInputRightMarginArr);
        }

        public SearchInputRightMargin() {
            throw null;
        }

        public static SearchInputRightMargin valueOf(String str) {
            return (SearchInputRightMargin) Enum.valueOf(SearchInputRightMargin.class, str);
        }

        public static SearchInputRightMargin[] values() {
            return (SearchInputRightMargin[]) f264079d.clone();
        }
    }

    /* compiled from: UdfToolbarStyle.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_bar/utils/UdfToolbarStyle$a;", "", "_avito_search-bar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Color f264081a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Color f264082b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Color f264083c;

        /* renamed from: d, reason: collision with root package name */
        public final float f264084d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final d f264085e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final CartIconRightMargin f264086f;

        public a(@k Color color, @k Color color2, @k Color color3, float f12, @k d dVar, @k CartIconRightMargin cartIconRightMargin) {
            this.f264081a = color;
            this.f264082b = color2;
            this.f264083c = color3;
            this.f264084d = f12;
            this.f264085e = dVar;
            this.f264086f = cartIconRightMargin;
        }

        public static a a(a aVar, Color color, Color color2, Color color3, float f12, d dVar, CartIconRightMargin cartIconRightMargin, int i12) {
            if ((i12 & 1) != 0) {
                color = aVar.f264081a;
            }
            Color color4 = color;
            if ((i12 & 2) != 0) {
                color2 = aVar.f264082b;
            }
            Color color5 = color2;
            if ((i12 & 4) != 0) {
                color3 = aVar.f264083c;
            }
            Color color6 = color3;
            if ((i12 & 8) != 0) {
                f12 = aVar.f264084d;
            }
            float f13 = f12;
            if ((i12 & 16) != 0) {
                dVar = aVar.f264085e;
            }
            d dVar2 = dVar;
            if ((i12 & 32) != 0) {
                cartIconRightMargin = aVar.f264086f;
            }
            aVar.getClass();
            return new a(color4, color5, color6, f13, dVar2, cartIconRightMargin);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f264081a, aVar.f264081a) && L.f(this.f264082b, aVar.f264082b) && L.f(this.f264083c, aVar.f264083c) && Float.compare(this.f264084d, aVar.f264084d) == 0 && L.f(this.f264085e, aVar.f264085e) && this.f264086f == aVar.f264086f;
        }

        public final int hashCode() {
            return this.f264086f.hashCode() + ((this.f264085e.hashCode() + r.d(this.f264084d, (this.f264083c.hashCode() + ((this.f264082b.hashCode() + (this.f264081a.hashCode() * 31)) * 31)) * 31, 31)) * 31);
        }

        @k
        public final String toString() {
            return "CartIconStyle(iconColor=" + this.f264081a + ", backgroundColor=" + this.f264082b + ", rippleColor=" + this.f264083c + ", alpha=" + this.f264084d + ", pointStyle=" + this.f264085e + ", rightMargin=" + this.f264086f + ')';
        }
    }

    /* compiled from: UdfToolbarStyle.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_bar/utils/UdfToolbarStyle$b;", "", "_avito_search-bar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Color f264087a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Color f264088b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final d f264089c;

        public b(@k Color color, @k Color color2, @k d dVar) {
            this.f264087a = color;
            this.f264088b = color2;
            this.f264089c = dVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f264087a, bVar.f264087a) && L.f(this.f264088b, bVar.f264088b) && L.f(this.f264089c, bVar.f264089c);
        }

        public final int hashCode() {
            return this.f264089c.hashCode() + ((this.f264088b.hashCode() + (this.f264087a.hashCode() * 31)) * 31);
        }

        @k
        public final String toString() {
            return "FilterIconStyle(iconColor=" + this.f264087a + ", rippleColor=" + this.f264088b + ", pointStyle=" + this.f264089c + ')';
        }
    }

    /* compiled from: UdfToolbarStyle.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_bar/utils/UdfToolbarStyle$c;", "", "_avito_search-bar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Color f264090a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Color f264091b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Color f264092c;

        public c(@k Color color, @k Color color2, @k Color color3) {
            this.f264090a = color;
            this.f264091b = color2;
            this.f264092c = color3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f264090a, cVar.f264090a) && L.f(this.f264091b, cVar.f264091b) && L.f(this.f264092c, cVar.f264092c);
        }

        public final int hashCode() {
            return this.f264092c.hashCode() + ((this.f264091b.hashCode() + (this.f264090a.hashCode() * 31)) * 31);
        }

        @k
        public final String toString() {
            return "NavigationIconStyle(iconColor=" + this.f264090a + ", backgroundColor=" + this.f264091b + ", rippleColor=" + this.f264092c + ')';
        }
    }

    /* compiled from: UdfToolbarStyle.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_bar/utils/UdfToolbarStyle$d;", "", "_avito_search-bar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Color f264093a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Color f264094b;

        public d(@k Color color, @k Color color2) {
            this.f264093a = color;
            this.f264094b = color2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f264093a, dVar.f264093a) && L.f(this.f264094b, dVar.f264094b);
        }

        public final int hashCode() {
            return this.f264094b.hashCode() + (this.f264093a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "PointStyle(backgroundColor=" + this.f264093a + ", indicatorColor=" + this.f264094b + ')';
        }
    }

    /* compiled from: UdfToolbarStyle.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_bar/utils/UdfToolbarStyle$e;", "", "_avito_search-bar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Color f264095a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Color f264096b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Color f264097c;

        /* renamed from: d, reason: collision with root package name */
        public final float f264098d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final SearchInputHeightType f264099e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final SearchInputRightMargin f264100f;

        public e(@k Color color, @k Color color2, @k Color color3, float f12, @k SearchInputHeightType searchInputHeightType, @k SearchInputRightMargin searchInputRightMargin) {
            this.f264095a = color;
            this.f264096b = color2;
            this.f264097c = color3;
            this.f264098d = f12;
            this.f264099e = searchInputHeightType;
            this.f264100f = searchInputRightMargin;
        }

        public static e a(e eVar, Color color, Color color2, Color color3, float f12, SearchInputHeightType searchInputHeightType, SearchInputRightMargin searchInputRightMargin, int i12) {
            if ((i12 & 1) != 0) {
                color = eVar.f264095a;
            }
            Color color4 = color;
            if ((i12 & 2) != 0) {
                color2 = eVar.f264096b;
            }
            Color color5 = color2;
            if ((i12 & 4) != 0) {
                color3 = eVar.f264097c;
            }
            Color color6 = color3;
            if ((i12 & 8) != 0) {
                f12 = eVar.f264098d;
            }
            float f13 = f12;
            if ((i12 & 16) != 0) {
                searchInputHeightType = eVar.f264099e;
            }
            SearchInputHeightType searchInputHeightType2 = searchInputHeightType;
            if ((i12 & 32) != 0) {
                searchInputRightMargin = eVar.f264100f;
            }
            eVar.getClass();
            return new e(color4, color5, color6, f13, searchInputHeightType2, searchInputRightMargin);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f264095a, eVar.f264095a) && L.f(this.f264096b, eVar.f264096b) && L.f(this.f264097c, eVar.f264097c) && Float.compare(this.f264098d, eVar.f264098d) == 0 && this.f264099e == eVar.f264099e && this.f264100f == eVar.f264100f;
        }

        public final int hashCode() {
            return this.f264100f.hashCode() + ((this.f264099e.hashCode() + r.d(this.f264098d, (this.f264097c.hashCode() + ((this.f264096b.hashCode() + (this.f264095a.hashCode() * 31)) * 31)) * 31, 31)) * 31);
        }

        @k
        public final String toString() {
            return "SearchInputStyle(textColor=" + this.f264095a + ", hintAndLeftIconColor=" + this.f264096b + ", backgroundColor=" + this.f264097c + ", alpha=" + this.f264098d + ", height=" + this.f264099e + ", rightMargin=" + this.f264100f + ')';
        }
    }

    /* compiled from: UdfToolbarStyle.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_bar/utils/UdfToolbarStyle$f;", "", "_avito_search-bar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Color f264101a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Color f264102b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Color f264103c;

        public f(@k Color color, @k Color color2, @k Color color3) {
            this.f264101a = color;
            this.f264102b = color2;
            this.f264103c = color3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f264101a, fVar.f264101a) && L.f(this.f264102b, fVar.f264102b) && L.f(this.f264103c, fVar.f264103c);
        }

        public final int hashCode() {
            return this.f264103c.hashCode() + ((this.f264102b.hashCode() + (this.f264101a.hashCode() * 31)) * 31);
        }

        @k
        public final String toString() {
            return "ShareIconStyle(iconColor=" + this.f264101a + ", backgroundColor=" + this.f264102b + ", rippleColor=" + this.f264103c + ')';
        }
    }

    public UdfToolbarStyle(@k Color color, @l c cVar, @l e eVar, @l b bVar, @l a aVar, @l f fVar, @k BottomPaddingType bottomPaddingType) {
        this.f264054a = color;
        this.f264055b = cVar;
        this.f264056c = eVar;
        this.f264057d = bVar;
        this.f264058e = aVar;
        this.f264059f = fVar;
        this.f264060g = bottomPaddingType;
    }

    public static UdfToolbarStyle a(UdfToolbarStyle udfToolbarStyle, Color color, c cVar, e eVar, b bVar, a aVar, f fVar, BottomPaddingType bottomPaddingType, int i12) {
        Color color2 = (i12 & 1) != 0 ? udfToolbarStyle.f264054a : color;
        c cVar2 = (i12 & 2) != 0 ? udfToolbarStyle.f264055b : cVar;
        e eVar2 = (i12 & 4) != 0 ? udfToolbarStyle.f264056c : eVar;
        b bVar2 = (i12 & 8) != 0 ? udfToolbarStyle.f264057d : bVar;
        a aVar2 = (i12 & 16) != 0 ? udfToolbarStyle.f264058e : aVar;
        f fVar2 = (i12 & 32) != 0 ? udfToolbarStyle.f264059f : fVar;
        BottomPaddingType bottomPaddingType2 = (i12 & 64) != 0 ? udfToolbarStyle.f264060g : bottomPaddingType;
        udfToolbarStyle.getClass();
        return new UdfToolbarStyle(color2, cVar2, eVar2, bVar2, aVar2, fVar2, bottomPaddingType2);
    }

    @l
    /* renamed from: b, reason: from getter */
    public final a getF264058e() {
        return this.f264058e;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final e getF264056c() {
        return this.f264056c;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UdfToolbarStyle)) {
            return false;
        }
        UdfToolbarStyle udfToolbarStyle = (UdfToolbarStyle) obj;
        return L.f(this.f264054a, udfToolbarStyle.f264054a) && L.f(this.f264055b, udfToolbarStyle.f264055b) && L.f(this.f264056c, udfToolbarStyle.f264056c) && L.f(this.f264057d, udfToolbarStyle.f264057d) && L.f(this.f264058e, udfToolbarStyle.f264058e) && L.f(this.f264059f, udfToolbarStyle.f264059f) && this.f264060g == udfToolbarStyle.f264060g;
    }

    public final int hashCode() {
        int iHashCode = this.f264054a.hashCode() * 31;
        c cVar = this.f264055b;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        e eVar = this.f264056c;
        int iHashCode3 = (iHashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        b bVar = this.f264057d;
        int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        a aVar = this.f264058e;
        int iHashCode5 = (iHashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        f fVar = this.f264059f;
        return this.f264060g.hashCode() + ((iHashCode5 + (fVar != null ? fVar.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "UdfToolbarStyle(backgroundColor=" + this.f264054a + ", navigationIconStyle=" + this.f264055b + ", searchInputStyle=" + this.f264056c + ", filterIconStyle=" + this.f264057d + ", cartIconStyle=" + this.f264058e + ", shareIconStyle=" + this.f264059f + ", bottomPaddingType=" + this.f264060g + ')';
    }
}
