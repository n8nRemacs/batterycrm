package com.avito.android.bxcontent.search_bar_promo_widget;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SearchPromoHeaderWidgetItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/search_bar_promo_widget/SearchPromoHeaderWidgetItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "SearchBarPromoItemHeaderButton", "SearchBarPromoItemTitle", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SearchPromoHeaderWidgetItem implements PersistableSerpItem {

    @Y61.k
    public static final Parcelable.Creator<SearchPromoHeaderWidgetItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f112843b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SearchBarPromoItemTitle f112844c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final UniversalImage f112845d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final UniversalImage f112846e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final ArrayList f112847f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final UdfToolbarAndStatusBarConfig f112848g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f112849h = SerpViewType.f268585e;

    /* renamed from: i, reason: collision with root package name */
    public final int f112850i = 6;

    /* compiled from: SearchPromoHeaderWidgetItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/search_bar_promo_widget/SearchPromoHeaderWidgetItem$SearchBarPromoItemHeaderButton;", "Landroid/os/Parcelable;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SearchBarPromoItemHeaderButton implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<SearchBarPromoItemHeaderButton> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f112851b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final UniversalColor f112852c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final UniversalColor f112853d;

        /* compiled from: SearchPromoHeaderWidgetItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SearchBarPromoItemHeaderButton> {
            @Override // android.os.Parcelable.Creator
            public final SearchBarPromoItemHeaderButton createFromParcel(Parcel parcel) {
                return new SearchBarPromoItemHeaderButton(parcel.readString(), (UniversalColor) parcel.readParcelable(SearchBarPromoItemHeaderButton.class.getClassLoader()), (UniversalColor) parcel.readParcelable(SearchBarPromoItemHeaderButton.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SearchBarPromoItemHeaderButton[] newArray(int i12) {
                return new SearchBarPromoItemHeaderButton[i12];
            }
        }

        public SearchBarPromoItemHeaderButton(@Y61.l String str, @Y61.l UniversalColor universalColor, @Y61.l UniversalColor universalColor2) {
            this.f112851b = str;
            this.f112852c = universalColor;
            this.f112853d = universalColor2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SearchBarPromoItemHeaderButton)) {
                return false;
            }
            SearchBarPromoItemHeaderButton searchBarPromoItemHeaderButton = (SearchBarPromoItemHeaderButton) obj;
            return L.f(this.f112851b, searchBarPromoItemHeaderButton.f112851b) && L.f(this.f112852c, searchBarPromoItemHeaderButton.f112852c) && L.f(this.f112853d, searchBarPromoItemHeaderButton.f112853d);
        }

        public final int hashCode() {
            String str = this.f112851b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            UniversalColor universalColor = this.f112852c;
            int iHashCode2 = (iHashCode + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
            UniversalColor universalColor2 = this.f112853d;
            return iHashCode2 + (universalColor2 != null ? universalColor2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SearchBarPromoItemHeaderButton(style=");
            sb2.append(this.f112851b);
            sb2.append(", backgroundColor=");
            sb2.append(this.f112852c);
            sb2.append(", color=");
            return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.f112853d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f112851b);
            parcel.writeParcelable(this.f112852c, i12);
            parcel.writeParcelable(this.f112853d, i12);
        }
    }

    /* compiled from: SearchPromoHeaderWidgetItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/search_bar_promo_widget/SearchPromoHeaderWidgetItem$SearchBarPromoItemTitle;", "Landroid/os/Parcelable;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SearchBarPromoItemTitle implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<SearchBarPromoItemTitle> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final AttributedText f112854b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final DeepLink f112855c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final SearchBarPromoItemHeaderButton f112856d;

        /* compiled from: SearchPromoHeaderWidgetItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SearchBarPromoItemTitle> {
            @Override // android.os.Parcelable.Creator
            public final SearchBarPromoItemTitle createFromParcel(Parcel parcel) {
                return new SearchBarPromoItemTitle((AttributedText) parcel.readParcelable(SearchBarPromoItemTitle.class.getClassLoader()), (DeepLink) parcel.readParcelable(SearchBarPromoItemTitle.class.getClassLoader()), parcel.readInt() == 0 ? null : SearchBarPromoItemHeaderButton.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final SearchBarPromoItemTitle[] newArray(int i12) {
                return new SearchBarPromoItemTitle[i12];
            }
        }

        public SearchBarPromoItemTitle(@Y61.k AttributedText attributedText, @Y61.k DeepLink deepLink, @Y61.l SearchBarPromoItemHeaderButton searchBarPromoItemHeaderButton) {
            this.f112854b = attributedText;
            this.f112855c = deepLink;
            this.f112856d = searchBarPromoItemHeaderButton;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SearchBarPromoItemTitle)) {
                return false;
            }
            SearchBarPromoItemTitle searchBarPromoItemTitle = (SearchBarPromoItemTitle) obj;
            return L.f(this.f112854b, searchBarPromoItemTitle.f112854b) && L.f(this.f112855c, searchBarPromoItemTitle.f112855c) && L.f(this.f112856d, searchBarPromoItemTitle.f112856d);
        }

        public final int hashCode() {
            int iE2 = com.avito.android.actions_sheet.a.e(this.f112855c, this.f112854b.hashCode() * 31, 31);
            SearchBarPromoItemHeaderButton searchBarPromoItemHeaderButton = this.f112856d;
            return iE2 + (searchBarPromoItemHeaderButton == null ? 0 : searchBarPromoItemHeaderButton.hashCode());
        }

        @Y61.k
        public final String toString() {
            return "SearchBarPromoItemTitle(text=" + this.f112854b + ", deeplink=" + this.f112855c + ", headerButton=" + this.f112856d + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f112854b, i12);
            parcel.writeParcelable(this.f112855c, i12);
            SearchBarPromoItemHeaderButton searchBarPromoItemHeaderButton = this.f112856d;
            if (searchBarPromoItemHeaderButton == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                searchBarPromoItemHeaderButton.writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: SearchPromoHeaderWidgetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SearchPromoHeaderWidgetItem> {
        @Override // android.os.Parcelable.Creator
        public final SearchPromoHeaderWidgetItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            SearchBarPromoItemTitle searchBarPromoItemTitleCreateFromParcel = SearchBarPromoItemTitle.CREATOR.createFromParcel(parcel);
            UniversalImage universalImage = (UniversalImage) parcel.readParcelable(SearchPromoHeaderWidgetItem.class.getClassLoader());
            UniversalImage universalImage2 = (UniversalImage) parcel.readParcelable(SearchPromoHeaderWidgetItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(SearchPromoHeaderWidgetItem.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new SearchPromoHeaderWidgetItem(string, searchBarPromoItemTitleCreateFromParcel, universalImage, universalImage2, arrayList, parcel.readInt() != 0 ? UdfToolbarAndStatusBarConfig.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final SearchPromoHeaderWidgetItem[] newArray(int i12) {
            return new SearchPromoHeaderWidgetItem[i12];
        }
    }

    public SearchPromoHeaderWidgetItem(@Y61.k String str, @Y61.k SearchBarPromoItemTitle searchBarPromoItemTitle, @Y61.l UniversalImage universalImage, @Y61.l UniversalImage universalImage2, @Y61.l ArrayList arrayList, @Y61.l UdfToolbarAndStatusBarConfig udfToolbarAndStatusBarConfig) {
        this.f112843b = str;
        this.f112844c = searchBarPromoItemTitle;
        this.f112845d = universalImage;
        this.f112846e = universalImage2;
        this.f112847f = arrayList;
        this.f112848g = udfToolbarAndStatusBarConfig;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchPromoHeaderWidgetItem)) {
            return false;
        }
        SearchPromoHeaderWidgetItem searchPromoHeaderWidgetItem = (SearchPromoHeaderWidgetItem) obj;
        return L.f(this.f112843b, searchPromoHeaderWidgetItem.f112843b) && L.f(this.f112844c, searchPromoHeaderWidgetItem.f112844c) && L.f(this.f112845d, searchPromoHeaderWidgetItem.f112845d) && L.f(this.f112846e, searchPromoHeaderWidgetItem.f112846e) && L.f(this.f112847f, searchPromoHeaderWidgetItem.f112847f) && L.f(this.f112848g, searchPromoHeaderWidgetItem.f112848g);
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF270317l() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF113512b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF112850i() {
        return this.f112850i;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF112843b() {
        return this.f112843b;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF112849h() {
        return this.f112849h;
    }

    public final int hashCode() {
        int iHashCode = (this.f112844c.hashCode() + (this.f112843b.hashCode() * 31)) * 31;
        UniversalImage universalImage = this.f112845d;
        int iHashCode2 = (iHashCode + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        UniversalImage universalImage2 = this.f112846e;
        int iHashCode3 = (iHashCode2 + (universalImage2 == null ? 0 : universalImage2.hashCode())) * 31;
        ArrayList arrayList = this.f112847f;
        int iHashCode4 = (iHashCode3 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        UdfToolbarAndStatusBarConfig udfToolbarAndStatusBarConfig = this.f112848g;
        return iHashCode4 + (udfToolbarAndStatusBarConfig != null ? udfToolbarAndStatusBarConfig.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "SearchPromoHeaderWidgetItem(stringId=" + this.f112843b + ", title=" + this.f112844c + ", image=" + this.f112845d + ", backgroundImage=" + this.f112846e + ", colors=" + this.f112847f + ", udfToolbarAndStatusBarConfig=" + this.f112848g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f112843b);
        this.f112844c.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.f112845d, i12);
        parcel.writeParcelable(this.f112846e, i12);
        ArrayList arrayList = this.f112847f;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            Iterator itY = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList);
            while (itY.hasNext()) {
                parcel.writeParcelable((Parcelable) itY.next(), i12);
            }
        }
        UdfToolbarAndStatusBarConfig udfToolbarAndStatusBarConfig = this.f112848g;
        if (udfToolbarAndStatusBarConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            udfToolbarAndStatusBarConfig.writeToParcel(parcel, i12);
        }
    }
}
