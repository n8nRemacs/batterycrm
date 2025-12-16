package com.avito.android.developments_agency_search.domain;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.input.single_line.SingleLineInputModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GetDealCabinetHeader.kt */
@P
@Keep
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0002%&B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\f¨\u0006'"}, d2 = {"Lcom/avito/android/developments_agency_search/domain/GetDealCabinetHeader;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/developments_agency_search/domain/GetDealCabinetHeader$BannerItem;", "banners", "Lcom/avito/android/developments_agency_search/domain/GetDealCabinetHeader$CommissionPromoBanner;", "commissionPromoBanner", "<init>", "(Ljava/util/List;Lcom/avito/android/developments_agency_search/domain/GetDealCabinetHeader$CommissionPromoBanner;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/avito/android/developments_agency_search/domain/GetDealCabinetHeader$CommissionPromoBanner;", "copy", "(Ljava/util/List;Lcom/avito/android/developments_agency_search/domain/GetDealCabinetHeader$CommissionPromoBanner;)Lcom/avito/android/developments_agency_search/domain/GetDealCabinetHeader;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getBanners", "Lcom/avito/android/developments_agency_search/domain/GetDealCabinetHeader$CommissionPromoBanner;", "getCommissionPromoBanner", "BannerItem", "CommissionPromoBanner", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes13.dex */
public final /* data */ class GetDealCabinetHeader implements Parcelable {
    public static final int $stable = 8;

    @k
    public static final Parcelable.Creator<GetDealCabinetHeader> CREATOR = new a();

    @c("banners")
    @k
    private final List<BannerItem> banners;

    @c("commissionPromoBanner")
    @l
    private final CommissionPromoBanner commissionPromoBanner;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetDealCabinetHeader.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/developments_agency_search/domain/GetDealCabinetHeader$BannerItem;", "", "(Ljava/lang/String;I)V", "SEARCH", "MORTGAGE", "TARIFF_CARD", "SELECTIONS", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BannerItem {

        @c("mortgage")
        public static final BannerItem MORTGAGE;

        @c(SingleLineInputModel.STYLE_SEARCH)
        public static final BannerItem SEARCH;

        @c("selections")
        public static final BannerItem SELECTIONS;

        @c("commission-history")
        public static final BannerItem TARIFF_CARD;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ BannerItem[] f136506b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f136507c;

        static {
            BannerItem bannerItem = new BannerItem("SEARCH", 0);
            SEARCH = bannerItem;
            BannerItem bannerItem2 = new BannerItem("MORTGAGE", 1);
            MORTGAGE = bannerItem2;
            BannerItem bannerItem3 = new BannerItem("TARIFF_CARD", 2);
            TARIFF_CARD = bannerItem3;
            BannerItem bannerItem4 = new BannerItem("SELECTIONS", 3);
            SELECTIONS = bannerItem4;
            BannerItem[] bannerItemArr = {bannerItem, bannerItem2, bannerItem3, bannerItem4};
            f136506b = bannerItemArr;
            f136507c = kotlin.enums.c.a(bannerItemArr);
        }

        private BannerItem(String str, int i12) {
        }

        public static BannerItem valueOf(String str) {
            return (BannerItem) Enum.valueOf(BannerItem.class, str);
        }

        public static BannerItem[] values() {
            return (BannerItem[]) f136506b.clone();
        }
    }

    /* compiled from: GetDealCabinetHeader.kt */
    @P
    @Keep
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\t¨\u0006\""}, d2 = {"Lcom/avito/android/developments_agency_search/domain/GetDealCabinetHeader$CommissionPromoBanner;", "Landroid/os/Parcelable;", "", "title", "subtitle", "conditionsUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/developments_agency_search/domain/GetDealCabinetHeader$CommissionPromoBanner;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getSubtitle", "getConditionsUrl", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class CommissionPromoBanner implements Parcelable {
        public static final int $stable = 0;

        @k
        public static final Parcelable.Creator<CommissionPromoBanner> CREATOR = new a();

        @c("conditionsUrl")
        @k
        private final String conditionsUrl;

        @c("subtitle")
        @k
        private final String subtitle;

        @c("title")
        @k
        private final String title;

        /* compiled from: GetDealCabinetHeader.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CommissionPromoBanner> {
            @Override // android.os.Parcelable.Creator
            public final CommissionPromoBanner createFromParcel(Parcel parcel) {
                return new CommissionPromoBanner(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CommissionPromoBanner[] newArray(int i12) {
                return new CommissionPromoBanner[i12];
            }
        }

        public CommissionPromoBanner(@k String str, @k String str2, @k String str3) {
            this.title = str;
            this.subtitle = str2;
            this.conditionsUrl = str3;
        }

        public static /* synthetic */ CommissionPromoBanner copy$default(CommissionPromoBanner commissionPromoBanner, String str, String str2, String str3, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = commissionPromoBanner.title;
            }
            if ((i12 & 2) != 0) {
                str2 = commissionPromoBanner.subtitle;
            }
            if ((i12 & 4) != 0) {
                str3 = commissionPromoBanner.conditionsUrl;
            }
            return commissionPromoBanner.copy(str, str2, str3);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getConditionsUrl() {
            return this.conditionsUrl;
        }

        @k
        public final CommissionPromoBanner copy(@k String title, @k String subtitle, @k String conditionsUrl) {
            return new CommissionPromoBanner(title, subtitle, conditionsUrl);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CommissionPromoBanner)) {
                return false;
            }
            CommissionPromoBanner commissionPromoBanner = (CommissionPromoBanner) other;
            return L.f(this.title, commissionPromoBanner.title) && L.f(this.subtitle, commissionPromoBanner.subtitle) && L.f(this.conditionsUrl, commissionPromoBanner.conditionsUrl);
        }

        @k
        public final String getConditionsUrl() {
            return this.conditionsUrl;
        }

        @k
        public final String getSubtitle() {
            return this.subtitle;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.conditionsUrl.hashCode() + H.d(this.title.hashCode() * 31, 31, this.subtitle);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("CommissionPromoBanner(title=");
            sb2.append(this.title);
            sb2.append(", subtitle=");
            sb2.append(this.subtitle);
            sb2.append(", conditionsUrl=");
            return C22026a.c(sb2, this.conditionsUrl, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            parcel.writeString(this.conditionsUrl);
        }
    }

    /* compiled from: GetDealCabinetHeader.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GetDealCabinetHeader> {
        @Override // android.os.Parcelable.Creator
        public final GetDealCabinetHeader createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                arrayList.add(BannerItem.valueOf(parcel.readString()));
            }
            return new GetDealCabinetHeader(arrayList, parcel.readInt() == 0 ? null : CommissionPromoBanner.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final GetDealCabinetHeader[] newArray(int i12) {
            return new GetDealCabinetHeader[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GetDealCabinetHeader(@k List<? extends BannerItem> list, @l CommissionPromoBanner commissionPromoBanner) {
        this.banners = list;
        this.commissionPromoBanner = commissionPromoBanner;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetDealCabinetHeader copy$default(GetDealCabinetHeader getDealCabinetHeader, List list, CommissionPromoBanner commissionPromoBanner, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = getDealCabinetHeader.banners;
        }
        if ((i12 & 2) != 0) {
            commissionPromoBanner = getDealCabinetHeader.commissionPromoBanner;
        }
        return getDealCabinetHeader.copy(list, commissionPromoBanner);
    }

    @k
    public final List<BannerItem> component1() {
        return this.banners;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final CommissionPromoBanner getCommissionPromoBanner() {
        return this.commissionPromoBanner;
    }

    @k
    public final GetDealCabinetHeader copy(@k List<? extends BannerItem> banners, @l CommissionPromoBanner commissionPromoBanner) {
        return new GetDealCabinetHeader(banners, commissionPromoBanner);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetDealCabinetHeader)) {
            return false;
        }
        GetDealCabinetHeader getDealCabinetHeader = (GetDealCabinetHeader) other;
        return L.f(this.banners, getDealCabinetHeader.banners) && L.f(this.commissionPromoBanner, getDealCabinetHeader.commissionPromoBanner);
    }

    @k
    public final List<BannerItem> getBanners() {
        return this.banners;
    }

    @l
    public final CommissionPromoBanner getCommissionPromoBanner() {
        return this.commissionPromoBanner;
    }

    public int hashCode() {
        int iHashCode = this.banners.hashCode() * 31;
        CommissionPromoBanner commissionPromoBanner = this.commissionPromoBanner;
        return iHashCode + (commissionPromoBanner == null ? 0 : commissionPromoBanner.hashCode());
    }

    @k
    public String toString() {
        return "GetDealCabinetHeader(banners=" + this.banners + ", commissionPromoBanner=" + this.commissionPromoBanner + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Iterator itJ = C0.j(this.banners, parcel);
        while (itJ.hasNext()) {
            parcel.writeString(((BannerItem) itJ.next()).name());
        }
        CommissionPromoBanner commissionPromoBanner = this.commissionPromoBanner;
        if (commissionPromoBanner == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            commissionPromoBanner.writeToParcel(parcel, flags);
        }
    }
}
