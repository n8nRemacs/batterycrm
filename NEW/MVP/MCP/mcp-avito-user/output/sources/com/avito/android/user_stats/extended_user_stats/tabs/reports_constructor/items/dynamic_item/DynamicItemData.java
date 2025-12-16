package com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.dynamic_item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.entity.ExpensesItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DynamicItemData.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/items/dynamic_item/DynamicItemData;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesItem;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DynamicItemData implements ExpensesItem {

    @k
    public static final Parcelable.Creator<DynamicItemData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f317973b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f317974c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f317975d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f317976e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f317977f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f317978g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f317979h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final List<UniversalColor> f317980i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final Image f317981j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f317982k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final DeepLink f317983l;

    /* compiled from: DynamicItemData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DynamicItemData> {
        @Override // android.os.Parcelable.Creator
        public final DynamicItemData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(DynamicItemData.class, parcel, arrayList, iL2, 1);
                }
            }
            return new DynamicItemData(string, string2, string3, string4, string5, string6, string7, arrayList, (Image) parcel.readParcelable(DynamicItemData.class.getClassLoader()), parcel.readInt() != 0, (DeepLink) parcel.readParcelable(DynamicItemData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final DynamicItemData[] newArray(int i12) {
            return new DynamicItemData[i12];
        }
    }

    public DynamicItemData(@k String str, @k String str2, @l String str3, @l String str4, @l String str5, @l String str6, @l String str7, @l List<UniversalColor> list, @l Image image, boolean z12, @l DeepLink deepLink) {
        this.f317973b = str;
        this.f317974c = str2;
        this.f317975d = str3;
        this.f317976e = str4;
        this.f317977f = str5;
        this.f317978g = str6;
        this.f317979h = str7;
        this.f317980i = list;
        this.f317981j = image;
        this.f317982k = z12;
        this.f317983l = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicItemData)) {
            return false;
        }
        DynamicItemData dynamicItemData = (DynamicItemData) obj;
        return L.f(this.f317973b, dynamicItemData.f317973b) && L.f(this.f317974c, dynamicItemData.f317974c) && L.f(this.f317975d, dynamicItemData.f317975d) && L.f(this.f317976e, dynamicItemData.f317976e) && L.f(this.f317977f, dynamicItemData.f317977f) && L.f(this.f317978g, dynamicItemData.f317978g) && L.f(this.f317979h, dynamicItemData.f317979h) && L.f(this.f317980i, dynamicItemData.f317980i) && L.f(this.f317981j, dynamicItemData.f317981j) && this.f317982k == dynamicItemData.f317982k && L.f(this.f317983l, dynamicItemData.f317983l);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF186822h() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF310312b() {
        return this.f317973b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f317973b.hashCode() * 31, 31, this.f317974c);
        String str = this.f317975d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f317976e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f317977f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f317978g;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f317979h;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<UniversalColor> list = this.f317980i;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Image image = this.f317981j;
        int i12 = r.i((iHashCode6 + (image == null ? 0 : image.hashCode())) * 31, 31, this.f317982k);
        DeepLink deepLink = this.f317983l;
        return i12 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DynamicItemData(stringId=");
        sb2.append(this.f317973b);
        sb2.append(", idItem=");
        sb2.append(this.f317974c);
        sb2.append(", title=");
        sb2.append(this.f317975d);
        sb2.append(", value=");
        sb2.append(this.f317976e);
        sb2.append(", price=");
        sb2.append(this.f317977f);
        sb2.append(", address=");
        sb2.append(this.f317978g);
        sb2.append(", metro=");
        sb2.append(this.f317979h);
        sb2.append(", metroColors=");
        sb2.append(this.f317980i);
        sb2.append(", image=");
        sb2.append(this.f317981j);
        sb2.append(", isDeleted=");
        sb2.append(this.f317982k);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f317983l, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f317973b);
        parcel.writeString(this.f317974c);
        parcel.writeString(this.f317975d);
        parcel.writeString(this.f317976e);
        parcel.writeString(this.f317977f);
        parcel.writeString(this.f317978g);
        parcel.writeString(this.f317979h);
        List<UniversalColor> list = this.f317980i;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        parcel.writeParcelable(this.f317981j, i12);
        parcel.writeInt(this.f317982k ? 1 : 0);
        parcel.writeParcelable(this.f317983l, i12);
    }
}
