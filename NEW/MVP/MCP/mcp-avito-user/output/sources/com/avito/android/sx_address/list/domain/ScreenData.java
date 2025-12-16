package com.avito.android.sx_address.list.domain;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ScreenData.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/domain/ScreenData;", "Landroid/os/Parcelable;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ScreenData implements Parcelable {

    @k
    public static final Parcelable.Creator<ScreenData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final List<AddressItem> f293166b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f293167c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final InfoBannerData f293168d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final InfoBannerData f293169e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f293170f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Boolean f293171g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Boolean f293172h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final ArrayList f293173i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final Boolean f293174j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final String f293175k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final String f293176l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f293177m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final Filter f293178n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f293179o;

    /* renamed from: p, reason: collision with root package name */
    @l
    public final String f293180p;

    /* compiled from: ScreenData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ScreenData> {
        @Override // android.os.Parcelable.Creator
        public final ScreenData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf;
            Boolean boolValueOf2;
            ArrayList arrayList2;
            Boolean boolValueOf3 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(AddressItem.CREATOR, parcel, arrayList3, iC2, 1);
                }
                arrayList = arrayList3;
            }
            AttributedText attributedText = (AttributedText) parcel.readParcelable(ScreenData.class.getClassLoader());
            InfoBannerData infoBannerDataCreateFromParcel = parcel.readInt() == 0 ? null : InfoBannerData.CREATOR.createFromParcel(parcel);
            InfoBannerData infoBannerDataCreateFromParcel2 = parcel.readInt() == 0 ? null : InfoBannerData.CREATOR.createFromParcel(parcel);
            boolean z12 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i13);
                int iC3 = 0;
                while (iC3 != i13) {
                    iC3 = com.avito.android.actions_sheet.a.c(PromotionData.CREATOR, parcel, arrayList4, iC3, 1);
                }
                arrayList2 = arrayList4;
            }
            if (parcel.readInt() != 0) {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ScreenData(arrayList, attributedText, infoBannerDataCreateFromParcel, infoBannerDataCreateFromParcel2, z12, boolValueOf, boolValueOf2, arrayList2, boolValueOf3, parcel.readString(), parcel.readString(), parcel.readInt() != 0, Filter.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ScreenData[] newArray(int i12) {
            return new ScreenData[i12];
        }
    }

    public ScreenData(@l List list, @k AttributedText attributedText, @l InfoBannerData infoBannerData, @l InfoBannerData infoBannerData2, boolean z12, @l Boolean bool, @l Boolean bool2, @l ArrayList arrayList, @l Boolean bool3, @k String str, @k String str2, boolean z13, @k Filter filter, boolean z14, @l String str3) {
        this.f293166b = list;
        this.f293167c = attributedText;
        this.f293168d = infoBannerData;
        this.f293169e = infoBannerData2;
        this.f293170f = z12;
        this.f293171g = bool;
        this.f293172h = bool2;
        this.f293173i = arrayList;
        this.f293174j = bool3;
        this.f293175k = str;
        this.f293176l = str2;
        this.f293177m = z13;
        this.f293178n = filter;
        this.f293179o = z14;
        this.f293180p = str3;
    }

    public static ScreenData a(ScreenData screenData, List list, String str, Filter filter, boolean z12, int i12) {
        List list2 = (i12 & 1) != 0 ? screenData.f293166b : list;
        AttributedText attributedText = screenData.f293167c;
        InfoBannerData infoBannerData = screenData.f293168d;
        InfoBannerData infoBannerData2 = screenData.f293169e;
        boolean z13 = screenData.f293170f;
        Boolean bool = screenData.f293171g;
        Boolean bool2 = screenData.f293172h;
        ArrayList arrayList = screenData.f293173i;
        Boolean bool3 = screenData.f293174j;
        String str2 = screenData.f293175k;
        String str3 = (i12 & 1024) != 0 ? screenData.f293176l : str;
        boolean z14 = screenData.f293177m;
        Filter filter2 = (i12 & 4096) != 0 ? screenData.f293178n : filter;
        String str4 = screenData.f293180p;
        screenData.getClass();
        return new ScreenData(list2, attributedText, infoBannerData, infoBannerData2, z13, bool, bool2, arrayList, bool3, str2, str3, z14, filter2, z12, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScreenData)) {
            return false;
        }
        ScreenData screenData = (ScreenData) obj;
        return L.f(this.f293166b, screenData.f293166b) && L.f(this.f293167c, screenData.f293167c) && L.f(this.f293168d, screenData.f293168d) && L.f(this.f293169e, screenData.f293169e) && this.f293170f == screenData.f293170f && L.f(this.f293171g, screenData.f293171g) && L.f(this.f293172h, screenData.f293172h) && L.f(this.f293173i, screenData.f293173i) && L.f(this.f293174j, screenData.f293174j) && L.f(this.f293175k, screenData.f293175k) && L.f(this.f293176l, screenData.f293176l) && this.f293177m == screenData.f293177m && this.f293178n == screenData.f293178n && this.f293179o == screenData.f293179o && L.f(this.f293180p, screenData.f293180p);
    }

    public final int hashCode() {
        List<AddressItem> list = this.f293166b;
        int iB2 = com.avito.android.actions_sheet.a.b((list == null ? 0 : list.hashCode()) * 31, 31, this.f293167c);
        InfoBannerData infoBannerData = this.f293168d;
        int iHashCode = (iB2 + (infoBannerData == null ? 0 : infoBannerData.hashCode())) * 31;
        InfoBannerData infoBannerData2 = this.f293169e;
        int i12 = r.i((iHashCode + (infoBannerData2 == null ? 0 : infoBannerData2.hashCode())) * 31, 31, this.f293170f);
        Boolean bool = this.f293171g;
        int iHashCode2 = (i12 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f293172h;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        ArrayList arrayList = this.f293173i;
        int iHashCode4 = (iHashCode3 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        Boolean bool3 = this.f293174j;
        int i13 = r.i((this.f293178n.hashCode() + r.i(H.d(H.d((iHashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31, 31, this.f293175k), 31, this.f293176l), 31, this.f293177m)) * 31, 31, this.f293179o);
        String str = this.f293180p;
        return i13 + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScreenData(addresses=");
        sb2.append(this.f293166b);
        sb2.append(", description=");
        sb2.append(this.f293167c);
        sb2.append(", infoBanner=");
        sb2.append(this.f293168d);
        sb2.append(", innMigratedAddressesPopup=");
        sb2.append(this.f293169e);
        sb2.append(", isAddAvailable=");
        sb2.append(this.f293170f);
        sb2.append(", isAutoloadAvailable=");
        sb2.append(this.f293171g);
        sb2.append(", isEditButtonAvailable=");
        sb2.append(this.f293172h);
        sb2.append(", promotion=");
        sb2.append(this.f293173i);
        sb2.append(", shouldShowFilters=");
        sb2.append(this.f293174j);
        sb2.append(", title=");
        sb2.append(this.f293175k);
        sb2.append(", searchInput=");
        sb2.append(this.f293176l);
        sb2.append(", showSearch=");
        sb2.append(this.f293177m);
        sb2.append(", selectedFilter=");
        sb2.append(this.f293178n);
        sb2.append(", fullReload=");
        sb2.append(this.f293179o);
        sb2.append(", addUnavailableMessage=");
        return C22026a.c(sb2, this.f293180p, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        List<AddressItem> list = this.f293166b;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((AddressItem) itA.next()).writeToParcel(parcel, i12);
            }
        }
        parcel.writeParcelable(this.f293167c, i12);
        InfoBannerData infoBannerData = this.f293168d;
        if (infoBannerData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            infoBannerData.writeToParcel(parcel, i12);
        }
        InfoBannerData infoBannerData2 = this.f293169e;
        if (infoBannerData2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            infoBannerData2.writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f293170f ? 1 : 0);
        Boolean bool = this.f293171g;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.f293172h;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        ArrayList arrayList = this.f293173i;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            Iterator itY = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList);
            while (itY.hasNext()) {
                ((PromotionData) itY.next()).writeToParcel(parcel, i12);
            }
        }
        Boolean bool3 = this.f293174j;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool3);
        }
        parcel.writeString(this.f293175k);
        parcel.writeString(this.f293176l);
        parcel.writeInt(this.f293177m ? 1 : 0);
        parcel.writeString(this.f293178n.name());
        parcel.writeInt(this.f293179o ? 1 : 0);
        parcel.writeString(this.f293180p);
    }
}
