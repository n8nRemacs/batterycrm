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
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import okhttp3.internal.http2.Http2;
import ru.avito.component.serp.PhoneLoadingState;
import shark.AndroidResourceIdNames;

/* compiled from: DevelopmentItem.kt */
@K51.d
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/serp/adapter/rich_snippets/realty/DevelopmentItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "Lcom/avito/android/async_phone/AsyncPhoneItem;", "Lcom/avito/android/serp/adapter/vertical_main/featured/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DevelopmentItem implements com.avito.android.serp.adapter.Q, PersistableSerpItem, AsyncPhoneItem, com.avito.android.serp.adapter.vertical_main.featured.a {

    @Y61.k
    public static final Parcelable.Creator<DevelopmentItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f270893b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f270894c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f270895d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f270896e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f270897f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f270898g;

    /* renamed from: h, reason: collision with root package name */
    public final int f270899h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f270900i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f270901j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final DeepLink f270902k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final List<Image> f270903l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final AdvertActions f270904m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final AdvertActions f270905n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final List<GeoReference> f270906o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final List<String> f270907p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final SerpBadgeBar f270908q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public final DeveloperProfile f270909r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public PhoneLoadingState f270910s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super String, G0> f270911t;

    /* compiled from: DevelopmentItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DevelopmentItem> {
        @Override // android.os.Parcelable.Creator
        public final DevelopmentItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            AdvertActions advertActions;
            AdvertActions advertActions2;
            ArrayList arrayList2;
            ArrayList arrayList3;
            long j12 = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int i12 = parcel.readInt();
            SerpViewType serpViewTypeValueOf = SerpViewType.valueOf(parcel.readString());
            SerpDisplayType serpDisplayTypeValueOf = SerpDisplayType.valueOf(parcel.readString());
            DeepLink deepLink = (DeepLink) parcel.readParcelable(DevelopmentItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i13);
                int iL2 = 0;
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(DevelopmentItem.class, parcel, arrayList4, iL2, 1);
                    i13 = i13;
                }
                arrayList = arrayList4;
            }
            AdvertActions advertActions3 = (AdvertActions) parcel.readParcelable(DevelopmentItem.class.getClassLoader());
            AdvertActions advertActions4 = (AdvertActions) parcel.readParcelable(DevelopmentItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList2 = arrayList;
                advertActions2 = advertActions3;
                advertActions = advertActions4;
                arrayList3 = null;
            } else {
                advertActions = advertActions4;
                int i14 = parcel.readInt();
                advertActions2 = advertActions3;
                ArrayList arrayList5 = new ArrayList(i14);
                arrayList2 = arrayList;
                int iL3 = 0;
                while (iL3 != i14) {
                    iL3 = com.avito.android.actions_sheet.a.l(DevelopmentItem.class, parcel, arrayList5, iL3, 1);
                    i14 = i14;
                }
                arrayList3 = arrayList5;
            }
            return new DevelopmentItem(j12, string, string2, string3, string4, string5, i12, serpViewTypeValueOf, serpDisplayTypeValueOf, deepLink, arrayList2, advertActions2, advertActions, arrayList3, parcel.createStringArrayList(), (SerpBadgeBar) parcel.readParcelable(DevelopmentItem.class.getClassLoader()), (DeveloperProfile) parcel.readParcelable(DevelopmentItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final DevelopmentItem[] newArray(int i12) {
            return new DevelopmentItem[i12];
        }
    }

    public DevelopmentItem(long j12, @Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, int i12, @Y61.k SerpViewType serpViewType, @Y61.k SerpDisplayType serpDisplayType, @Y61.k DeepLink deepLink, @Y61.l List<Image> list, @Y61.l AdvertActions advertActions, @Y61.l AdvertActions advertActions2, @Y61.l List<GeoReference> list2, @Y61.l List<String> list3, @Y61.l SerpBadgeBar serpBadgeBar, @Y61.l DeveloperProfile developerProfile) {
        this.f270893b = j12;
        this.f270894c = str;
        this.f270895d = str2;
        this.f270896e = str3;
        this.f270897f = str4;
        this.f270898g = str5;
        this.f270899h = i12;
        this.f270900i = serpViewType;
        this.f270901j = serpDisplayType;
        this.f270902k = deepLink;
        this.f270903l = list;
        this.f270904m = advertActions;
        this.f270905n = advertActions2;
        this.f270906o = list2;
        this.f270907p = list3;
        this.f270908q = serpBadgeBar;
        this.f270909r = developerProfile;
        this.f270910s = PhoneLoadingState.f430441b;
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f270901j = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DevelopmentItem)) {
            return false;
        }
        DevelopmentItem developmentItem = (DevelopmentItem) obj;
        return this.f270893b == developmentItem.f270893b && kotlin.jvm.internal.L.f(this.f270894c, developmentItem.f270894c) && kotlin.jvm.internal.L.f(this.f270895d, developmentItem.f270895d) && kotlin.jvm.internal.L.f(this.f270896e, developmentItem.f270896e) && kotlin.jvm.internal.L.f(this.f270897f, developmentItem.f270897f) && kotlin.jvm.internal.L.f(this.f270898g, developmentItem.f270898g) && this.f270899h == developmentItem.f270899h && this.f270900i == developmentItem.f270900i && this.f270901j == developmentItem.f270901j && kotlin.jvm.internal.L.f(this.f270902k, developmentItem.f270902k) && kotlin.jvm.internal.L.f(this.f270903l, developmentItem.f270903l) && kotlin.jvm.internal.L.f(this.f270904m, developmentItem.f270904m) && kotlin.jvm.internal.L.f(this.f270905n, developmentItem.f270905n) && kotlin.jvm.internal.L.f(this.f270906o, developmentItem.f270906o) && kotlin.jvm.internal.L.f(this.f270907p, developmentItem.f270907p) && kotlin.jvm.internal.L.f(this.f270908q, developmentItem.f270908q) && kotlin.jvm.internal.L.f(this.f270909r, developmentItem.f270909r);
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF285043q() {
        return false;
    }

    @Override // TV0.a
    public final long getId() {
        return this.f270893b;
    }

    @Override // com.avito.android.async_phone.AsyncPhoneItem
    @Y61.k
    /* renamed from: getPhoneLoadingState, reason: from getter */
    public final PhoneLoadingState getF270928r() {
        return this.f270910s;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF83473h() {
        return this.f270899h;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF266187b() {
        return this.f270894c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF83475j() {
        return this.f270900i;
    }

    public final int hashCode() {
        int iD2 = androidx.compose.foundation.H.d(androidx.compose.foundation.H.d(Long.hashCode(this.f270893b) * 31, 31, this.f270894c), 31, this.f270895d);
        String str = this.f270896e;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f270897f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f270898g;
        int iE2 = com.avito.android.actions_sheet.a.e(this.f270902k, com.avito.android.actions_sheet.a.h(this.f270901j, com.avito.android.actions_sheet.a.j(this.f270900i, androidx.appcompat.app.r.e(this.f270899h, (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31), 31), 31);
        List<Image> list = this.f270903l;
        int iHashCode3 = (iE2 + (list == null ? 0 : list.hashCode())) * 31;
        AdvertActions advertActions = this.f270904m;
        int iHashCode4 = (iHashCode3 + (advertActions == null ? 0 : advertActions.hashCode())) * 31;
        AdvertActions advertActions2 = this.f270905n;
        int iHashCode5 = (iHashCode4 + (advertActions2 == null ? 0 : advertActions2.hashCode())) * 31;
        List<GeoReference> list2 = this.f270906o;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.f270907p;
        int iHashCode7 = (iHashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        SerpBadgeBar serpBadgeBar = this.f270908q;
        int iHashCode8 = (iHashCode7 + (serpBadgeBar == null ? 0 : serpBadgeBar.hashCode())) * 31;
        DeveloperProfile developerProfile = this.f270909r;
        return iHashCode8 + (developerProfile != null ? developerProfile.hashCode() : 0);
    }

    @Override // com.avito.android.async_phone.AsyncPhoneItem
    public final void setPhoneLoadingState(@Y61.k PhoneLoadingState phoneLoadingState) {
        this.f270910s = phoneLoadingState;
    }

    @Y61.k
    public final String toString() {
        return "DevelopmentItem(id=" + this.f270893b + ", stringId=" + this.f270894c + ", title=" + this.f270895d + ", developer=" + this.f270896e + ", price=" + this.f270897f + ", promoPrice=" + this.f270898g + ", spanCount=" + this.f270899h + ", viewType=" + this.f270900i + ", displayType=" + this.f270901j + ", deepLink=" + this.f270902k + ", imageList=" + this.f270903l + ", contacts=" + this.f270904m + ", galleryContacts=" + this.f270905n + ", geoReferences=" + this.f270906o + ", additionalLines=" + this.f270907p + ", badgeBar=" + this.f270908q + ", developerProfile=" + this.f270909r + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f270893b);
        parcel.writeString(this.f270894c);
        parcel.writeString(this.f270895d);
        parcel.writeString(this.f270896e);
        parcel.writeString(this.f270897f);
        parcel.writeString(this.f270898g);
        parcel.writeInt(this.f270899h);
        parcel.writeString(this.f270900i.name());
        parcel.writeString(this.f270901j.name());
        parcel.writeParcelable(this.f270902k, i12);
        List<Image> list = this.f270903l;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        parcel.writeParcelable(this.f270904m, i12);
        parcel.writeParcelable(this.f270905n, i12);
        List<GeoReference> list2 = this.f270906o;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), i12);
            }
        }
        parcel.writeStringList(this.f270907p);
        parcel.writeParcelable(this.f270908q, i12);
        parcel.writeParcelable(this.f270909r, i12);
    }

    public /* synthetic */ DevelopmentItem(long j12, String str, String str2, String str3, String str4, String str5, int i12, SerpViewType serpViewType, SerpDisplayType serpDisplayType, DeepLink deepLink, List list, AdvertActions advertActions, AdvertActions advertActions2, List list2, List list3, SerpBadgeBar serpBadgeBar, DeveloperProfile developerProfile, int i13, C42822w c42822w) {
        this(j12, str, str2, (i13 & 8) != 0 ? null : str3, str4, str5, i12, serpViewType, serpDisplayType, deepLink, (i13 & 1024) != 0 ? null : list, (i13 & 2048) != 0 ? null : advertActions, (i13 & 4096) != 0 ? null : advertActions2, (i13 & 8192) != 0 ? null : list2, (i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : list3, (32768 & i13) != 0 ? null : serpBadgeBar, (i13 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? null : developerProfile);
    }
}
