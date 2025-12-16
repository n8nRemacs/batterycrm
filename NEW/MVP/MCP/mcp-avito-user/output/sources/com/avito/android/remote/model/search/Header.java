package com.avito.android.remote.model.search;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InlineFilters.kt */
@d
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J^\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0010J\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010\u001eJ \u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b)\u0010*R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b/\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u0010\u0017R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b5\u0010\u0019¨\u00066"}, d2 = {"Lcom/avito/android/remote/model/search/Header;", "Landroid/os/Parcelable;", "", "title", "", "itemsCount", "selectedFiltersCount", "Lcom/avito/android/deep_linking/links/DeepLink;", "resetAction", "Lcom/avito/android/remote/model/search/HeaderSubtitle;", "subTitle", "", "inlinesOrder", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/search/HeaderSubtitle;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component5", "()Lcom/avito/android/remote/model/search/HeaderSubtitle;", "component6", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/search/HeaderSubtitle;Ljava/util/List;)Lcom/avito/android/remote/model/search/Header;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Ljava/lang/Integer;", "getItemsCount", "getSelectedFiltersCount", "Lcom/avito/android/deep_linking/links/DeepLink;", "getResetAction", "Lcom/avito/android/remote/model/search/HeaderSubtitle;", "getSubTitle", "Ljava/util/List;", "getInlinesOrder", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Header implements Parcelable {

    @k
    public static final Parcelable.Creator<Header> CREATOR = new Creator();

    @c("inlinesOrder")
    @l
    private final List<String> inlinesOrder;

    @c("itemsCount")
    @l
    private final Integer itemsCount;

    @c("resetAction")
    @l
    private final DeepLink resetAction;

    @c("selectedFiltersCount")
    @l
    private final Integer selectedFiltersCount;

    @c("subTitle")
    @l
    private final HeaderSubtitle subTitle;

    @c("title")
    @l
    private final String title;

    /* compiled from: InlineFilters.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Header> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Header createFromParcel(@k Parcel parcel) {
            return new Header(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (DeepLink) parcel.readParcelable(Header.class.getClassLoader()), parcel.readInt() != 0 ? HeaderSubtitle.CREATOR.createFromParcel(parcel) : null, parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Header[] newArray(int i12) {
            return new Header[i12];
        }
    }

    public Header(@l String str, @l Integer num, @l Integer num2, @l DeepLink deepLink, @l HeaderSubtitle headerSubtitle, @l List<String> list) {
        this.title = str;
        this.itemsCount = num;
        this.selectedFiltersCount = num2;
        this.resetAction = deepLink;
        this.subTitle = headerSubtitle;
        this.inlinesOrder = list;
    }

    public static /* synthetic */ Header copy$default(Header header, String str, Integer num, Integer num2, DeepLink deepLink, HeaderSubtitle headerSubtitle, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = header.title;
        }
        if ((i12 & 2) != 0) {
            num = header.itemsCount;
        }
        Integer num3 = num;
        if ((i12 & 4) != 0) {
            num2 = header.selectedFiltersCount;
        }
        Integer num4 = num2;
        if ((i12 & 8) != 0) {
            deepLink = header.resetAction;
        }
        DeepLink deepLink2 = deepLink;
        if ((i12 & 16) != 0) {
            headerSubtitle = header.subTitle;
        }
        HeaderSubtitle headerSubtitle2 = headerSubtitle;
        if ((i12 & 32) != 0) {
            list = header.inlinesOrder;
        }
        return header.copy(str, num3, num4, deepLink2, headerSubtitle2, list);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Integer getItemsCount() {
        return this.itemsCount;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Integer getSelectedFiltersCount() {
        return this.selectedFiltersCount;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final DeepLink getResetAction() {
        return this.resetAction;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final HeaderSubtitle getSubTitle() {
        return this.subTitle;
    }

    @l
    public final List<String> component6() {
        return this.inlinesOrder;
    }

    @k
    public final Header copy(@l String title, @l Integer itemsCount, @l Integer selectedFiltersCount, @l DeepLink resetAction, @l HeaderSubtitle subTitle, @l List<String> inlinesOrder) {
        return new Header(title, itemsCount, selectedFiltersCount, resetAction, subTitle, inlinesOrder);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Header)) {
            return false;
        }
        Header header = (Header) other;
        return L.f(this.title, header.title) && L.f(this.itemsCount, header.itemsCount) && L.f(this.selectedFiltersCount, header.selectedFiltersCount) && L.f(this.resetAction, header.resetAction) && L.f(this.subTitle, header.subTitle) && L.f(this.inlinesOrder, header.inlinesOrder);
    }

    @l
    public final List<String> getInlinesOrder() {
        return this.inlinesOrder;
    }

    @l
    public final Integer getItemsCount() {
        return this.itemsCount;
    }

    @l
    public final DeepLink getResetAction() {
        return this.resetAction;
    }

    @l
    public final Integer getSelectedFiltersCount() {
        return this.selectedFiltersCount;
    }

    @l
    public final HeaderSubtitle getSubTitle() {
        return this.subTitle;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.itemsCount;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.selectedFiltersCount;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        DeepLink deepLink = this.resetAction;
        int iHashCode4 = (iHashCode3 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        HeaderSubtitle headerSubtitle = this.subTitle;
        int iHashCode5 = (iHashCode4 + (headerSubtitle == null ? 0 : headerSubtitle.hashCode())) * 31;
        List<String> list = this.inlinesOrder;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Header(title=");
        sb2.append(this.title);
        sb2.append(", itemsCount=");
        sb2.append(this.itemsCount);
        sb2.append(", selectedFiltersCount=");
        sb2.append(this.selectedFiltersCount);
        sb2.append(", resetAction=");
        sb2.append(this.resetAction);
        sb2.append(", subTitle=");
        sb2.append(this.subTitle);
        sb2.append(", inlinesOrder=");
        return H.p(sb2, this.inlinesOrder, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        Integer num = this.itemsCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        Integer num2 = this.selectedFiltersCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num2);
        }
        parcel.writeParcelable(this.resetAction, flags);
        HeaderSubtitle headerSubtitle = this.subTitle;
        if (headerSubtitle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            headerSubtitle.writeToParcel(parcel, flags);
        }
        parcel.writeStringList(this.inlinesOrder);
    }
}
