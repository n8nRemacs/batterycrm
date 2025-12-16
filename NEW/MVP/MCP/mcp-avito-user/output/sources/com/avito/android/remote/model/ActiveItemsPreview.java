package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileSearchBar.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0013J|\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\r2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b)\u0010$J \u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b.\u0010/R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b3\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b6\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b8\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\b:\u0010\u001cR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010;\u001a\u0004\b\u000e\u0010\u001eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b<\u0010\u0013¨\u0006="}, d2 = {"Lcom/avito/android/remote/model/ActiveItemsPreview;", "Landroid/os/Parcelable;", "Lcom/avito/android/deep_linking/links/DeepLink;", "showAllDeeplink", "searchButtonDeeplink", "filtersButtonDeeplink", "", "activeItemsPreviewNumber", "activeItemsPreviewRows", "Lcom/avito/android/remote/model/BuyerGeoAddress;", "buyerGeoAddress", "", "showMoreButtonTitle", "", "isSearchSuggestsEnabled", "inlineFiltersDeeplink", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/avito/android/remote/model/BuyerGeoAddress;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component2", "component3", "component4", "()Ljava/lang/Integer;", "component5", "component6", "()Lcom/avito/android/remote/model/BuyerGeoAddress;", "component7", "()Ljava/lang/String;", "component8", "()Ljava/lang/Boolean;", "component9", "copy", "(Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/avito/android/remote/model/BuyerGeoAddress;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/ActiveItemsPreview;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getShowAllDeeplink", "getSearchButtonDeeplink", "getFiltersButtonDeeplink", "Ljava/lang/Integer;", "getActiveItemsPreviewNumber", "getActiveItemsPreviewRows", "Lcom/avito/android/remote/model/BuyerGeoAddress;", "getBuyerGeoAddress", "Ljava/lang/String;", "getShowMoreButtonTitle", "Ljava/lang/Boolean;", "getInlineFiltersDeeplink", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ActiveItemsPreview implements Parcelable {

    @k
    public static final Parcelable.Creator<ActiveItemsPreview> CREATOR = new Creator();

    @c("activeItemsPreviewNumber")
    @l
    private final Integer activeItemsPreviewNumber;

    @c("activeItemsPreviewRows")
    @l
    private final Integer activeItemsPreviewRows;

    @c("buyerGeoAddress")
    @l
    private final BuyerGeoAddress buyerGeoAddress;

    @c("filtersButtonDeeplink")
    @l
    private final DeepLink filtersButtonDeeplink;

    @c("inlineFiltersDeeplink")
    @l
    private final DeepLink inlineFiltersDeeplink;

    @c("isSearchSuggestsEnabled")
    @l
    private final Boolean isSearchSuggestsEnabled;

    @c("searchButtonDeeplink")
    @l
    private final DeepLink searchButtonDeeplink;

    @c("showAllDeeplink")
    @l
    private final DeepLink showAllDeeplink;

    @c("showMoreButtonTitle")
    @l
    private final String showMoreButtonTitle;

    /* compiled from: ExtendedProfileSearchBar.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ActiveItemsPreview> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ActiveItemsPreview createFromParcel(@k Parcel parcel) {
            DeepLink deepLink = (DeepLink) parcel.readParcelable(ActiveItemsPreview.class.getClassLoader());
            DeepLink deepLink2 = (DeepLink) parcel.readParcelable(ActiveItemsPreview.class.getClassLoader());
            DeepLink deepLink3 = (DeepLink) parcel.readParcelable(ActiveItemsPreview.class.getClassLoader());
            Boolean boolValueOf = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BuyerGeoAddress buyerGeoAddressCreateFromParcel = parcel.readInt() == 0 ? null : BuyerGeoAddress.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ActiveItemsPreview(deepLink, deepLink2, deepLink3, numValueOf, numValueOf2, buyerGeoAddressCreateFromParcel, string, boolValueOf, (DeepLink) parcel.readParcelable(ActiveItemsPreview.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ActiveItemsPreview[] newArray(int i12) {
            return new ActiveItemsPreview[i12];
        }
    }

    public ActiveItemsPreview(@l DeepLink deepLink, @l DeepLink deepLink2, @l DeepLink deepLink3, @l Integer num, @l Integer num2, @l BuyerGeoAddress buyerGeoAddress, @l String str, @l Boolean bool, @l DeepLink deepLink4) {
        this.showAllDeeplink = deepLink;
        this.searchButtonDeeplink = deepLink2;
        this.filtersButtonDeeplink = deepLink3;
        this.activeItemsPreviewNumber = num;
        this.activeItemsPreviewRows = num2;
        this.buyerGeoAddress = buyerGeoAddress;
        this.showMoreButtonTitle = str;
        this.isSearchSuggestsEnabled = bool;
        this.inlineFiltersDeeplink = deepLink4;
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final DeepLink getShowAllDeeplink() {
        return this.showAllDeeplink;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final DeepLink getSearchButtonDeeplink() {
        return this.searchButtonDeeplink;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final DeepLink getFiltersButtonDeeplink() {
        return this.filtersButtonDeeplink;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Integer getActiveItemsPreviewNumber() {
        return this.activeItemsPreviewNumber;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Integer getActiveItemsPreviewRows() {
        return this.activeItemsPreviewRows;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final BuyerGeoAddress getBuyerGeoAddress() {
        return this.buyerGeoAddress;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final String getShowMoreButtonTitle() {
        return this.showMoreButtonTitle;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final Boolean getIsSearchSuggestsEnabled() {
        return this.isSearchSuggestsEnabled;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final DeepLink getInlineFiltersDeeplink() {
        return this.inlineFiltersDeeplink;
    }

    @k
    public final ActiveItemsPreview copy(@l DeepLink showAllDeeplink, @l DeepLink searchButtonDeeplink, @l DeepLink filtersButtonDeeplink, @l Integer activeItemsPreviewNumber, @l Integer activeItemsPreviewRows, @l BuyerGeoAddress buyerGeoAddress, @l String showMoreButtonTitle, @l Boolean isSearchSuggestsEnabled, @l DeepLink inlineFiltersDeeplink) {
        return new ActiveItemsPreview(showAllDeeplink, searchButtonDeeplink, filtersButtonDeeplink, activeItemsPreviewNumber, activeItemsPreviewRows, buyerGeoAddress, showMoreButtonTitle, isSearchSuggestsEnabled, inlineFiltersDeeplink);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActiveItemsPreview)) {
            return false;
        }
        ActiveItemsPreview activeItemsPreview = (ActiveItemsPreview) other;
        return L.f(this.showAllDeeplink, activeItemsPreview.showAllDeeplink) && L.f(this.searchButtonDeeplink, activeItemsPreview.searchButtonDeeplink) && L.f(this.filtersButtonDeeplink, activeItemsPreview.filtersButtonDeeplink) && L.f(this.activeItemsPreviewNumber, activeItemsPreview.activeItemsPreviewNumber) && L.f(this.activeItemsPreviewRows, activeItemsPreview.activeItemsPreviewRows) && L.f(this.buyerGeoAddress, activeItemsPreview.buyerGeoAddress) && L.f(this.showMoreButtonTitle, activeItemsPreview.showMoreButtonTitle) && L.f(this.isSearchSuggestsEnabled, activeItemsPreview.isSearchSuggestsEnabled) && L.f(this.inlineFiltersDeeplink, activeItemsPreview.inlineFiltersDeeplink);
    }

    @l
    public final Integer getActiveItemsPreviewNumber() {
        return this.activeItemsPreviewNumber;
    }

    @l
    public final Integer getActiveItemsPreviewRows() {
        return this.activeItemsPreviewRows;
    }

    @l
    public final BuyerGeoAddress getBuyerGeoAddress() {
        return this.buyerGeoAddress;
    }

    @l
    public final DeepLink getFiltersButtonDeeplink() {
        return this.filtersButtonDeeplink;
    }

    @l
    public final DeepLink getInlineFiltersDeeplink() {
        return this.inlineFiltersDeeplink;
    }

    @l
    public final DeepLink getSearchButtonDeeplink() {
        return this.searchButtonDeeplink;
    }

    @l
    public final DeepLink getShowAllDeeplink() {
        return this.showAllDeeplink;
    }

    @l
    public final String getShowMoreButtonTitle() {
        return this.showMoreButtonTitle;
    }

    public int hashCode() {
        DeepLink deepLink = this.showAllDeeplink;
        int iHashCode = (deepLink == null ? 0 : deepLink.hashCode()) * 31;
        DeepLink deepLink2 = this.searchButtonDeeplink;
        int iHashCode2 = (iHashCode + (deepLink2 == null ? 0 : deepLink2.hashCode())) * 31;
        DeepLink deepLink3 = this.filtersButtonDeeplink;
        int iHashCode3 = (iHashCode2 + (deepLink3 == null ? 0 : deepLink3.hashCode())) * 31;
        Integer num = this.activeItemsPreviewNumber;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.activeItemsPreviewRows;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        BuyerGeoAddress buyerGeoAddress = this.buyerGeoAddress;
        int iHashCode6 = (iHashCode5 + (buyerGeoAddress == null ? 0 : buyerGeoAddress.hashCode())) * 31;
        String str = this.showMoreButtonTitle;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isSearchSuggestsEnabled;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        DeepLink deepLink4 = this.inlineFiltersDeeplink;
        return iHashCode8 + (deepLink4 != null ? deepLink4.hashCode() : 0);
    }

    @l
    public final Boolean isSearchSuggestsEnabled() {
        return this.isSearchSuggestsEnabled;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ActiveItemsPreview(showAllDeeplink=");
        sb2.append(this.showAllDeeplink);
        sb2.append(", searchButtonDeeplink=");
        sb2.append(this.searchButtonDeeplink);
        sb2.append(", filtersButtonDeeplink=");
        sb2.append(this.filtersButtonDeeplink);
        sb2.append(", activeItemsPreviewNumber=");
        sb2.append(this.activeItemsPreviewNumber);
        sb2.append(", activeItemsPreviewRows=");
        sb2.append(this.activeItemsPreviewRows);
        sb2.append(", buyerGeoAddress=");
        sb2.append(this.buyerGeoAddress);
        sb2.append(", showMoreButtonTitle=");
        sb2.append(this.showMoreButtonTitle);
        sb2.append(", isSearchSuggestsEnabled=");
        sb2.append(this.isSearchSuggestsEnabled);
        sb2.append(", inlineFiltersDeeplink=");
        return a.v(sb2, this.inlineFiltersDeeplink, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.showAllDeeplink, flags);
        parcel.writeParcelable(this.searchButtonDeeplink, flags);
        parcel.writeParcelable(this.filtersButtonDeeplink, flags);
        Integer num = this.activeItemsPreviewNumber;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        Integer num2 = this.activeItemsPreviewRows;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num2);
        }
        BuyerGeoAddress buyerGeoAddress = this.buyerGeoAddress;
        if (buyerGeoAddress == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buyerGeoAddress.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.showMoreButtonTitle);
        Boolean bool = this.isSearchSuggestsEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeParcelable(this.inlineFiltersDeeplink, flags);
    }
}
