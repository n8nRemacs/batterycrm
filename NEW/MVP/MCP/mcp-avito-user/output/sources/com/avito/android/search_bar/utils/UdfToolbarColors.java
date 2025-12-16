package com.avito.android.search_bar.utils;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.search_bar.utils.UdfToolbarStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UdfToolbarColors.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/search_bar/utils/UdfToolbarColors;", "Landroid/os/Parcelable;", "CartIcon", "FilterIcon", "NavigationIcon", "Point", "SearchInput", "ShareIcon", "_avito_search-bar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class UdfToolbarColors implements Parcelable {

    @k
    public static final Parcelable.Creator<UdfToolbarColors> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final UdfToolbarStyle.Color f264030b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final NavigationIcon f264031c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final SearchInput f264032d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final FilterIcon f264033e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final CartIcon f264034f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final ShareIcon f264035g;

    /* compiled from: UdfToolbarColors.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_bar/utils/UdfToolbarColors$CartIcon;", "Landroid/os/Parcelable;", "_avito_search-bar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CartIcon implements Parcelable {

        @k
        public static final Parcelable.Creator<CartIcon> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final UdfToolbarStyle.Color f264036b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final UdfToolbarStyle.Color f264037c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final UdfToolbarStyle.Color f264038d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final Point f264039e;

        /* compiled from: UdfToolbarColors.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CartIcon> {
            @Override // android.os.Parcelable.Creator
            public final CartIcon createFromParcel(Parcel parcel) {
                return new CartIcon((UdfToolbarStyle.Color) parcel.readParcelable(CartIcon.class.getClassLoader()), (UdfToolbarStyle.Color) parcel.readParcelable(CartIcon.class.getClassLoader()), (UdfToolbarStyle.Color) parcel.readParcelable(CartIcon.class.getClassLoader()), parcel.readInt() == 0 ? null : Point.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final CartIcon[] newArray(int i12) {
                return new CartIcon[i12];
            }
        }

        public CartIcon() {
            this(null, null, null, null, 15, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CartIcon)) {
                return false;
            }
            CartIcon cartIcon = (CartIcon) obj;
            return L.f(this.f264036b, cartIcon.f264036b) && L.f(this.f264037c, cartIcon.f264037c) && L.f(this.f264038d, cartIcon.f264038d) && L.f(this.f264039e, cartIcon.f264039e);
        }

        public final int hashCode() {
            UdfToolbarStyle.Color color = this.f264036b;
            int iHashCode = (color == null ? 0 : color.hashCode()) * 31;
            UdfToolbarStyle.Color color2 = this.f264037c;
            int iHashCode2 = (iHashCode + (color2 == null ? 0 : color2.hashCode())) * 31;
            UdfToolbarStyle.Color color3 = this.f264038d;
            int iHashCode3 = (iHashCode2 + (color3 == null ? 0 : color3.hashCode())) * 31;
            Point point = this.f264039e;
            return iHashCode3 + (point != null ? point.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "CartIcon(iconColor=" + this.f264036b + ", backgroundColor=" + this.f264037c + ", rippleColor=" + this.f264038d + ", point=" + this.f264039e + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f264036b, i12);
            parcel.writeParcelable(this.f264037c, i12);
            parcel.writeParcelable(this.f264038d, i12);
            Point point = this.f264039e;
            if (point == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                point.writeToParcel(parcel, i12);
            }
        }

        public CartIcon(@l UdfToolbarStyle.Color color, @l UdfToolbarStyle.Color color2, @l UdfToolbarStyle.Color color3, @l Point point) {
            this.f264036b = color;
            this.f264037c = color2;
            this.f264038d = color3;
            this.f264039e = point;
        }

        public /* synthetic */ CartIcon(UdfToolbarStyle.Color color, UdfToolbarStyle.Color color2, UdfToolbarStyle.Color color3, Point point, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : color, (i12 & 2) != 0 ? null : color2, (i12 & 4) != 0 ? null : color3, (i12 & 8) != 0 ? null : point);
        }
    }

    /* compiled from: UdfToolbarColors.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_bar/utils/UdfToolbarColors$FilterIcon;", "Landroid/os/Parcelable;", "_avito_search-bar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FilterIcon implements Parcelable {

        @k
        public static final Parcelable.Creator<FilterIcon> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final UdfToolbarStyle.Color f264040b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final UdfToolbarStyle.Color f264041c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Point f264042d;

        /* compiled from: UdfToolbarColors.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<FilterIcon> {
            @Override // android.os.Parcelable.Creator
            public final FilterIcon createFromParcel(Parcel parcel) {
                return new FilterIcon((UdfToolbarStyle.Color) parcel.readParcelable(FilterIcon.class.getClassLoader()), (UdfToolbarStyle.Color) parcel.readParcelable(FilterIcon.class.getClassLoader()), parcel.readInt() == 0 ? null : Point.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final FilterIcon[] newArray(int i12) {
                return new FilterIcon[i12];
            }
        }

        public FilterIcon() {
            this(null, null, null, 7, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FilterIcon)) {
                return false;
            }
            FilterIcon filterIcon = (FilterIcon) obj;
            return L.f(this.f264040b, filterIcon.f264040b) && L.f(this.f264041c, filterIcon.f264041c) && L.f(this.f264042d, filterIcon.f264042d);
        }

        public final int hashCode() {
            UdfToolbarStyle.Color color = this.f264040b;
            int iHashCode = (color == null ? 0 : color.hashCode()) * 31;
            UdfToolbarStyle.Color color2 = this.f264041c;
            int iHashCode2 = (iHashCode + (color2 == null ? 0 : color2.hashCode())) * 31;
            Point point = this.f264042d;
            return iHashCode2 + (point != null ? point.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "FilterIcon(iconColor=" + this.f264040b + ", rippleColor=" + this.f264041c + ", point=" + this.f264042d + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f264040b, i12);
            parcel.writeParcelable(this.f264041c, i12);
            Point point = this.f264042d;
            if (point == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                point.writeToParcel(parcel, i12);
            }
        }

        public FilterIcon(@l UdfToolbarStyle.Color color, @l UdfToolbarStyle.Color color2, @l Point point) {
            this.f264040b = color;
            this.f264041c = color2;
            this.f264042d = point;
        }

        public /* synthetic */ FilterIcon(UdfToolbarStyle.Color color, UdfToolbarStyle.Color color2, Point point, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : color, (i12 & 2) != 0 ? null : color2, (i12 & 4) != 0 ? null : point);
        }
    }

    /* compiled from: UdfToolbarColors.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_bar/utils/UdfToolbarColors$NavigationIcon;", "Landroid/os/Parcelable;", "_avito_search-bar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NavigationIcon implements Parcelable {

        @k
        public static final Parcelable.Creator<NavigationIcon> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final UdfToolbarStyle.Color f264043b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final UdfToolbarStyle.Color f264044c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final UdfToolbarStyle.Color f264045d;

        /* compiled from: UdfToolbarColors.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<NavigationIcon> {
            @Override // android.os.Parcelable.Creator
            public final NavigationIcon createFromParcel(Parcel parcel) {
                return new NavigationIcon((UdfToolbarStyle.Color) parcel.readParcelable(NavigationIcon.class.getClassLoader()), (UdfToolbarStyle.Color) parcel.readParcelable(NavigationIcon.class.getClassLoader()), (UdfToolbarStyle.Color) parcel.readParcelable(NavigationIcon.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NavigationIcon[] newArray(int i12) {
                return new NavigationIcon[i12];
            }
        }

        public NavigationIcon() {
            this(null, null, null, 7, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NavigationIcon)) {
                return false;
            }
            NavigationIcon navigationIcon = (NavigationIcon) obj;
            return L.f(this.f264043b, navigationIcon.f264043b) && L.f(this.f264044c, navigationIcon.f264044c) && L.f(this.f264045d, navigationIcon.f264045d);
        }

        public final int hashCode() {
            UdfToolbarStyle.Color color = this.f264043b;
            int iHashCode = (color == null ? 0 : color.hashCode()) * 31;
            UdfToolbarStyle.Color color2 = this.f264044c;
            int iHashCode2 = (iHashCode + (color2 == null ? 0 : color2.hashCode())) * 31;
            UdfToolbarStyle.Color color3 = this.f264045d;
            return iHashCode2 + (color3 != null ? color3.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "NavigationIcon(iconColor=" + this.f264043b + ", backgroundColor=" + this.f264044c + ", rippleColor=" + this.f264045d + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f264043b, i12);
            parcel.writeParcelable(this.f264044c, i12);
            parcel.writeParcelable(this.f264045d, i12);
        }

        public NavigationIcon(@l UdfToolbarStyle.Color color, @l UdfToolbarStyle.Color color2, @l UdfToolbarStyle.Color color3) {
            this.f264043b = color;
            this.f264044c = color2;
            this.f264045d = color3;
        }

        public /* synthetic */ NavigationIcon(UdfToolbarStyle.Color color, UdfToolbarStyle.Color color2, UdfToolbarStyle.Color color3, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : color, (i12 & 2) != 0 ? null : color2, (i12 & 4) != 0 ? null : color3);
        }
    }

    /* compiled from: UdfToolbarColors.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_bar/utils/UdfToolbarColors$Point;", "Landroid/os/Parcelable;", "_avito_search-bar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Point implements Parcelable {

        @k
        public static final Parcelable.Creator<Point> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final UdfToolbarStyle.Color f264046b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final UdfToolbarStyle.Color f264047c;

        /* compiled from: UdfToolbarColors.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Point> {
            @Override // android.os.Parcelable.Creator
            public final Point createFromParcel(Parcel parcel) {
                return new Point((UdfToolbarStyle.Color) parcel.readParcelable(Point.class.getClassLoader()), (UdfToolbarStyle.Color) parcel.readParcelable(Point.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Point[] newArray(int i12) {
                return new Point[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Point() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Point)) {
                return false;
            }
            Point point = (Point) obj;
            return L.f(this.f264046b, point.f264046b) && L.f(this.f264047c, point.f264047c);
        }

        public final int hashCode() {
            UdfToolbarStyle.Color color = this.f264046b;
            int iHashCode = (color == null ? 0 : color.hashCode()) * 31;
            UdfToolbarStyle.Color color2 = this.f264047c;
            return iHashCode + (color2 != null ? color2.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "Point(backgroundColor=" + this.f264046b + ", indicatorColor=" + this.f264047c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f264046b, i12);
            parcel.writeParcelable(this.f264047c, i12);
        }

        public Point(@l UdfToolbarStyle.Color color, @l UdfToolbarStyle.Color color2) {
            this.f264046b = color;
            this.f264047c = color2;
        }

        public /* synthetic */ Point(UdfToolbarStyle.Color color, UdfToolbarStyle.Color color2, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : color, (i12 & 2) != 0 ? null : color2);
        }
    }

    /* compiled from: UdfToolbarColors.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_bar/utils/UdfToolbarColors$SearchInput;", "Landroid/os/Parcelable;", "_avito_search-bar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SearchInput implements Parcelable {

        @k
        public static final Parcelable.Creator<SearchInput> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final UdfToolbarStyle.Color f264048b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final UdfToolbarStyle.Color f264049c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final UdfToolbarStyle.Color f264050d;

        /* compiled from: UdfToolbarColors.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SearchInput> {
            @Override // android.os.Parcelable.Creator
            public final SearchInput createFromParcel(Parcel parcel) {
                return new SearchInput((UdfToolbarStyle.Color) parcel.readParcelable(SearchInput.class.getClassLoader()), (UdfToolbarStyle.Color) parcel.readParcelable(SearchInput.class.getClassLoader()), (UdfToolbarStyle.Color) parcel.readParcelable(SearchInput.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SearchInput[] newArray(int i12) {
                return new SearchInput[i12];
            }
        }

        public SearchInput() {
            this(null, null, null, 7, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SearchInput)) {
                return false;
            }
            SearchInput searchInput = (SearchInput) obj;
            return L.f(this.f264048b, searchInput.f264048b) && L.f(this.f264049c, searchInput.f264049c) && L.f(this.f264050d, searchInput.f264050d);
        }

        public final int hashCode() {
            UdfToolbarStyle.Color color = this.f264048b;
            int iHashCode = (color == null ? 0 : color.hashCode()) * 31;
            UdfToolbarStyle.Color color2 = this.f264049c;
            int iHashCode2 = (iHashCode + (color2 == null ? 0 : color2.hashCode())) * 31;
            UdfToolbarStyle.Color color3 = this.f264050d;
            return iHashCode2 + (color3 != null ? color3.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "SearchInput(textColor=" + this.f264048b + ", hintAndLeftIconColor=" + this.f264049c + ", backgroundColor=" + this.f264050d + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f264048b, i12);
            parcel.writeParcelable(this.f264049c, i12);
            parcel.writeParcelable(this.f264050d, i12);
        }

        public SearchInput(@l UdfToolbarStyle.Color color, @l UdfToolbarStyle.Color color2, @l UdfToolbarStyle.Color color3) {
            this.f264048b = color;
            this.f264049c = color2;
            this.f264050d = color3;
        }

        public /* synthetic */ SearchInput(UdfToolbarStyle.Color color, UdfToolbarStyle.Color color2, UdfToolbarStyle.Color color3, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : color, (i12 & 2) != 0 ? null : color2, (i12 & 4) != 0 ? null : color3);
        }
    }

    /* compiled from: UdfToolbarColors.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_bar/utils/UdfToolbarColors$ShareIcon;", "Landroid/os/Parcelable;", "_avito_search-bar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShareIcon implements Parcelable {

        @k
        public static final Parcelable.Creator<ShareIcon> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final UdfToolbarStyle.Color f264051b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final UdfToolbarStyle.Color f264052c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final UdfToolbarStyle.Color f264053d;

        /* compiled from: UdfToolbarColors.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ShareIcon> {
            @Override // android.os.Parcelable.Creator
            public final ShareIcon createFromParcel(Parcel parcel) {
                return new ShareIcon((UdfToolbarStyle.Color) parcel.readParcelable(ShareIcon.class.getClassLoader()), (UdfToolbarStyle.Color) parcel.readParcelable(ShareIcon.class.getClassLoader()), (UdfToolbarStyle.Color) parcel.readParcelable(ShareIcon.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ShareIcon[] newArray(int i12) {
                return new ShareIcon[i12];
            }
        }

        public ShareIcon() {
            this(null, null, null, 7, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShareIcon)) {
                return false;
            }
            ShareIcon shareIcon = (ShareIcon) obj;
            return L.f(this.f264051b, shareIcon.f264051b) && L.f(this.f264052c, shareIcon.f264052c) && L.f(this.f264053d, shareIcon.f264053d);
        }

        public final int hashCode() {
            UdfToolbarStyle.Color color = this.f264051b;
            int iHashCode = (color == null ? 0 : color.hashCode()) * 31;
            UdfToolbarStyle.Color color2 = this.f264052c;
            int iHashCode2 = (iHashCode + (color2 == null ? 0 : color2.hashCode())) * 31;
            UdfToolbarStyle.Color color3 = this.f264053d;
            return iHashCode2 + (color3 != null ? color3.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "ShareIcon(iconColor=" + this.f264051b + ", backgroundColor=" + this.f264052c + ", rippleColor=" + this.f264053d + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f264051b, i12);
            parcel.writeParcelable(this.f264052c, i12);
            parcel.writeParcelable(this.f264053d, i12);
        }

        public ShareIcon(@l UdfToolbarStyle.Color color, @l UdfToolbarStyle.Color color2, @l UdfToolbarStyle.Color color3) {
            this.f264051b = color;
            this.f264052c = color2;
            this.f264053d = color3;
        }

        public /* synthetic */ ShareIcon(UdfToolbarStyle.Color color, UdfToolbarStyle.Color color2, UdfToolbarStyle.Color color3, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : color, (i12 & 2) != 0 ? null : color2, (i12 & 4) != 0 ? null : color3);
        }
    }

    /* compiled from: UdfToolbarColors.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UdfToolbarColors> {
        @Override // android.os.Parcelable.Creator
        public final UdfToolbarColors createFromParcel(Parcel parcel) {
            return new UdfToolbarColors((UdfToolbarStyle.Color) parcel.readParcelable(UdfToolbarColors.class.getClassLoader()), parcel.readInt() == 0 ? null : NavigationIcon.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SearchInput.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : FilterIcon.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CartIcon.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ShareIcon.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final UdfToolbarColors[] newArray(int i12) {
            return new UdfToolbarColors[i12];
        }
    }

    public UdfToolbarColors() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UdfToolbarColors)) {
            return false;
        }
        UdfToolbarColors udfToolbarColors = (UdfToolbarColors) obj;
        return L.f(this.f264030b, udfToolbarColors.f264030b) && L.f(this.f264031c, udfToolbarColors.f264031c) && L.f(this.f264032d, udfToolbarColors.f264032d) && L.f(this.f264033e, udfToolbarColors.f264033e) && L.f(this.f264034f, udfToolbarColors.f264034f) && L.f(this.f264035g, udfToolbarColors.f264035g);
    }

    public final int hashCode() {
        UdfToolbarStyle.Color color = this.f264030b;
        int iHashCode = (color == null ? 0 : color.hashCode()) * 31;
        NavigationIcon navigationIcon = this.f264031c;
        int iHashCode2 = (iHashCode + (navigationIcon == null ? 0 : navigationIcon.hashCode())) * 31;
        SearchInput searchInput = this.f264032d;
        int iHashCode3 = (iHashCode2 + (searchInput == null ? 0 : searchInput.hashCode())) * 31;
        FilterIcon filterIcon = this.f264033e;
        int iHashCode4 = (iHashCode3 + (filterIcon == null ? 0 : filterIcon.hashCode())) * 31;
        CartIcon cartIcon = this.f264034f;
        int iHashCode5 = (iHashCode4 + (cartIcon == null ? 0 : cartIcon.hashCode())) * 31;
        ShareIcon shareIcon = this.f264035g;
        return iHashCode5 + (shareIcon != null ? shareIcon.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "UdfToolbarColors(backgroundColor=" + this.f264030b + ", navigationIcon=" + this.f264031c + ", searchInput=" + this.f264032d + ", filterIcon=" + this.f264033e + ", cartIcon=" + this.f264034f + ", shareIcon=" + this.f264035g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f264030b, i12);
        NavigationIcon navigationIcon = this.f264031c;
        if (navigationIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            navigationIcon.writeToParcel(parcel, i12);
        }
        SearchInput searchInput = this.f264032d;
        if (searchInput == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            searchInput.writeToParcel(parcel, i12);
        }
        FilterIcon filterIcon = this.f264033e;
        if (filterIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            filterIcon.writeToParcel(parcel, i12);
        }
        CartIcon cartIcon = this.f264034f;
        if (cartIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cartIcon.writeToParcel(parcel, i12);
        }
        ShareIcon shareIcon = this.f264035g;
        if (shareIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shareIcon.writeToParcel(parcel, i12);
        }
    }

    public UdfToolbarColors(@l UdfToolbarStyle.Color color, @l NavigationIcon navigationIcon, @l SearchInput searchInput, @l FilterIcon filterIcon, @l CartIcon cartIcon, @l ShareIcon shareIcon) {
        this.f264030b = color;
        this.f264031c = navigationIcon;
        this.f264032d = searchInput;
        this.f264033e = filterIcon;
        this.f264034f = cartIcon;
        this.f264035g = shareIcon;
    }

    public /* synthetic */ UdfToolbarColors(UdfToolbarStyle.Color color, NavigationIcon navigationIcon, SearchInput searchInput, FilterIcon filterIcon, CartIcon cartIcon, ShareIcon shareIcon, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : color, (i12 & 2) != 0 ? null : navigationIcon, (i12 & 4) != 0 ? null : searchInput, (i12 & 8) != 0 ? null : filterIcon, (i12 & 16) != 0 ? null : cartIcon, (i12 & 32) != 0 ? null : shareIcon);
    }
}
