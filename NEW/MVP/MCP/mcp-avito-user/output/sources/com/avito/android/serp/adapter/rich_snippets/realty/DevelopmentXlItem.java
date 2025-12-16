package com.avito.android.serp.adapter.rich_snippets.realty;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.async_phone.AsyncPhoneItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertActions;
import com.avito.android.remote.model.GeoReference;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.badge_bar.SerpBadgeBar;
import com.avito.android.remote.model.developer_profile.DeveloperProfile;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import okhttp3.internal.http2.Http2;
import ru.avito.component.serp.PhoneLoadingState;

/* compiled from: DevelopmentXlItem.kt */
@K51.d
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/serp/adapter/rich_snippets/realty/DevelopmentXlItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "Lcom/avito/android/async_phone/AsyncPhoneItem;", "Lcom/avito/android/serp/adapter/vertical_main/featured/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DevelopmentXlItem implements com.avito.android.serp.adapter.Q, PersistableSerpItem, AsyncPhoneItem, com.avito.android.serp.adapter.vertical_main.featured.a {

    @Y61.k
    public static final Parcelable.Creator<DevelopmentXlItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f270912b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f270913c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f270914d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f270915e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f270916f;

    /* renamed from: g, reason: collision with root package name */
    public final int f270917g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f270918h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f270919i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final DeepLink f270920j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final List<Image> f270921k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final AdvertActions f270922l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final AdvertActions f270923m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final List<GeoReference> f270924n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final List<String> f270925o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final SerpBadgeBar f270926p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final DeveloperProfile f270927q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public PhoneLoadingState f270928r;

    /* compiled from: DevelopmentXlItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DevelopmentXlItem> {
        @Override // android.os.Parcelable.Creator
        public final DevelopmentXlItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            AdvertActions advertActions;
            AdvertActions advertActions2;
            ArrayList arrayList2;
            long j12 = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i12 = parcel.readInt();
            SerpViewType serpViewTypeValueOf = SerpViewType.valueOf(parcel.readString());
            SerpDisplayType serpDisplayTypeValueOf = SerpDisplayType.valueOf(parcel.readString());
            DeepLink deepLink = (DeepLink) parcel.readParcelable(DevelopmentXlItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i13);
                int iL2 = 0;
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(DevelopmentXlItem.class, parcel, arrayList3, iL2, 1);
                }
                arrayList = arrayList3;
            }
            AdvertActions advertActions3 = (AdvertActions) parcel.readParcelable(DevelopmentXlItem.class.getClassLoader());
            AdvertActions advertActions4 = (AdvertActions) parcel.readParcelable(DevelopmentXlItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                advertActions2 = advertActions3;
                advertActions = advertActions4;
                arrayList2 = null;
            } else {
                int i14 = parcel.readInt();
                advertActions = advertActions4;
                ArrayList arrayList4 = new ArrayList(i14);
                advertActions2 = advertActions3;
                int iL3 = 0;
                while (iL3 != i14) {
                    iL3 = com.avito.android.actions_sheet.a.l(DevelopmentXlItem.class, parcel, arrayList4, iL3, 1);
                    i14 = i14;
                }
                arrayList2 = arrayList4;
            }
            return new DevelopmentXlItem(j12, string, string2, string3, string4, i12, serpViewTypeValueOf, serpDisplayTypeValueOf, deepLink, arrayList, advertActions2, advertActions, arrayList2, parcel.createStringArrayList(), (SerpBadgeBar) parcel.readParcelable(DevelopmentXlItem.class.getClassLoader()), (DeveloperProfile) parcel.readParcelable(DevelopmentXlItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final DevelopmentXlItem[] newArray(int i12) {
            return new DevelopmentXlItem[i12];
        }
    }

    public DevelopmentXlItem(long j12, @Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4, int i12, @Y61.k SerpViewType serpViewType, @Y61.k SerpDisplayType serpDisplayType, @Y61.k DeepLink deepLink, @Y61.l List<Image> list, @Y61.l AdvertActions advertActions, @Y61.l AdvertActions advertActions2, @Y61.l List<GeoReference> list2, @Y61.l List<String> list3, @Y61.l SerpBadgeBar serpBadgeBar, @Y61.l DeveloperProfile developerProfile) {
        this.f270912b = j12;
        this.f270913c = str;
        this.f270914d = str2;
        this.f270915e = str3;
        this.f270916f = str4;
        this.f270917g = i12;
        this.f270918h = serpViewType;
        this.f270919i = serpDisplayType;
        this.f270920j = deepLink;
        this.f270921k = list;
        this.f270922l = advertActions;
        this.f270923m = advertActions2;
        this.f270924n = list2;
        this.f270925o = list3;
        this.f270926p = serpBadgeBar;
        this.f270927q = developerProfile;
        this.f270928r = PhoneLoadingState.f430441b;
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f270919i = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DevelopmentXlItem)) {
            return false;
        }
        DevelopmentXlItem developmentXlItem = (DevelopmentXlItem) obj;
        return this.f270912b == developmentXlItem.f270912b && kotlin.jvm.internal.L.f(this.f270913c, developmentXlItem.f270913c) && kotlin.jvm.internal.L.f(this.f270914d, developmentXlItem.f270914d) && kotlin.jvm.internal.L.f(this.f270915e, developmentXlItem.f270915e) && kotlin.jvm.internal.L.f(this.f270916f, developmentXlItem.f270916f) && this.f270917g == developmentXlItem.f270917g && this.f270918h == developmentXlItem.f270918h && this.f270919i == developmentXlItem.f270919i && kotlin.jvm.internal.L.f(this.f270920j, developmentXlItem.f270920j) && kotlin.jvm.internal.L.f(this.f270921k, developmentXlItem.f270921k) && kotlin.jvm.internal.L.f(this.f270922l, developmentXlItem.f270922l) && kotlin.jvm.internal.L.f(this.f270923m, developmentXlItem.f270923m) && kotlin.jvm.internal.L.f(this.f270924n, developmentXlItem.f270924n) && kotlin.jvm.internal.L.f(this.f270925o, developmentXlItem.f270925o) && kotlin.jvm.internal.L.f(this.f270926p, developmentXlItem.f270926p) && kotlin.jvm.internal.L.f(this.f270927q, developmentXlItem.f270927q);
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF285043q() {
        return false;
    }

    @Override // TV0.a
    public final long getId() {
        return this.f270912b;
    }

    @Override // com.avito.android.async_phone.AsyncPhoneItem
    @Y61.k
    /* renamed from: getPhoneLoadingState, reason: from getter */
    public final PhoneLoadingState getF270928r() {
        return this.f270928r;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF83473h() {
        return this.f270917g;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF266187b() {
        return this.f270913c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF83475j() {
        return this.f270918h;
    }

    public final int hashCode() {
        int iD2 = androidx.compose.foundation.H.d(androidx.compose.foundation.H.d(Long.hashCode(this.f270912b) * 31, 31, this.f270913c), 31, this.f270914d);
        String str = this.f270915e;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f270916f;
        int iE2 = com.avito.android.actions_sheet.a.e(this.f270920j, com.avito.android.actions_sheet.a.h(this.f270919i, com.avito.android.actions_sheet.a.j(this.f270918h, androidx.appcompat.app.r.e(this.f270917g, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31), 31);
        List<Image> list = this.f270921k;
        int iHashCode2 = (iE2 + (list == null ? 0 : list.hashCode())) * 31;
        AdvertActions advertActions = this.f270922l;
        int iHashCode3 = (iHashCode2 + (advertActions == null ? 0 : advertActions.hashCode())) * 31;
        AdvertActions advertActions2 = this.f270923m;
        int iHashCode4 = (iHashCode3 + (advertActions2 == null ? 0 : advertActions2.hashCode())) * 31;
        List<GeoReference> list2 = this.f270924n;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.f270925o;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        SerpBadgeBar serpBadgeBar = this.f270926p;
        int iHashCode7 = (iHashCode6 + (serpBadgeBar == null ? 0 : serpBadgeBar.hashCode())) * 31;
        DeveloperProfile developerProfile = this.f270927q;
        return iHashCode7 + (developerProfile != null ? developerProfile.hashCode() : 0);
    }

    @Override // com.avito.android.async_phone.AsyncPhoneItem
    public final void setPhoneLoadingState(@Y61.k PhoneLoadingState phoneLoadingState) {
        this.f270928r = phoneLoadingState;
    }

    @Y61.k
    public final String toString() {
        return "DevelopmentXlItem(id=" + this.f270912b + ", stringId=" + this.f270913c + ", title=" + this.f270914d + ", developer=" + this.f270915e + ", price=" + this.f270916f + ", spanCount=" + this.f270917g + ", viewType=" + this.f270918h + ", displayType=" + this.f270919i + ", deepLink=" + this.f270920j + ", imageList=" + this.f270921k + ", contacts=" + this.f270922l + ", galleryContacts=" + this.f270923m + ", geoReferences=" + this.f270924n + ", additionalLines=" + this.f270925o + ", badgeBar=" + this.f270926p + ", developerProfile=" + this.f270927q + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f270912b);
        parcel.writeString(this.f270913c);
        parcel.writeString(this.f270914d);
        parcel.writeString(this.f270915e);
        parcel.writeString(this.f270916f);
        parcel.writeInt(this.f270917g);
        parcel.writeString(this.f270918h.name());
        parcel.writeString(this.f270919i.name());
        parcel.writeParcelable(this.f270920j, i12);
        List<Image> list = this.f270921k;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        parcel.writeParcelable(this.f270922l, i12);
        parcel.writeParcelable(this.f270923m, i12);
        List<GeoReference> list2 = this.f270924n;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), i12);
            }
        }
        parcel.writeStringList(this.f270925o);
        parcel.writeParcelable(this.f270926p, i12);
        parcel.writeParcelable(this.f270927q, i12);
    }

    public /* synthetic */ DevelopmentXlItem(long j12, String str, String str2, String str3, String str4, int i12, SerpViewType serpViewType, SerpDisplayType serpDisplayType, DeepLink deepLink, List list, AdvertActions advertActions, AdvertActions advertActions2, List list2, List list3, SerpBadgeBar serpBadgeBar, DeveloperProfile developerProfile, int i13, C42822w c42822w) {
        this(j12, str, str2, (i13 & 8) != 0 ? null : str3, str4, i12, serpViewType, serpDisplayType, deepLink, (i13 & 512) != 0 ? null : list, (i13 & 1024) != 0 ? null : advertActions, (i13 & 2048) != 0 ? null : advertActions2, (i13 & 4096) != 0 ? null : list2, (i13 & 8192) != 0 ? null : list3, (i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : serpBadgeBar, (i13 & 32768) != 0 ? null : developerProfile);
    }
}
