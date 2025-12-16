package com.avito.android.user_stats.extended_user_stats.list_search_dialog.item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.entity.ExpensesItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CheckBoxData.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/list_search_dialog/item/CheckBoxData;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesItem;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CheckBoxData implements ExpensesItem {

    @k
    public static final Parcelable.Creator<CheckBoxData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f317248b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f317249c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f317250d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final CheckboxType f317251e;

    /* renamed from: f, reason: collision with root package name */
    public final int f317252f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final List<String> f317253g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final List<String> f317254h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Boolean f317255i;

    /* compiled from: CheckBoxData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CheckBoxData> {
        @Override // android.os.Parcelable.Creator
        public final CheckBoxData createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            CheckboxType checkboxTypeValueOf = CheckboxType.valueOf(parcel.readString());
            int i12 = parcel.readInt();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CheckBoxData(string, string2, string3, checkboxTypeValueOf, i12, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final CheckBoxData[] newArray(int i12) {
            return new CheckBoxData[i12];
        }
    }

    public CheckBoxData(@k String str, @k String str2, @k String str3, @k CheckboxType checkboxType, int i12, @l List<String> list, @l List<String> list2, @l Boolean bool) {
        this.f317248b = str;
        this.f317249c = str2;
        this.f317250d = str3;
        this.f317251e = checkboxType;
        this.f317252f = i12;
        this.f317253g = list;
        this.f317254h = list2;
        this.f317255i = bool;
    }

    public static CheckBoxData a(CheckBoxData checkBoxData, CheckboxType checkboxType) {
        String str = checkBoxData.f317248b;
        String str2 = checkBoxData.f317249c;
        String str3 = checkBoxData.f317250d;
        int i12 = checkBoxData.f317252f;
        List<String> list = checkBoxData.f317253g;
        List<String> list2 = checkBoxData.f317254h;
        Boolean bool = checkBoxData.f317255i;
        checkBoxData.getClass();
        return new CheckBoxData(str, str2, str3, checkboxType, i12, list, list2, bool);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckBoxData)) {
            return false;
        }
        CheckBoxData checkBoxData = (CheckBoxData) obj;
        return L.f(this.f317248b, checkBoxData.f317248b) && L.f(this.f317249c, checkBoxData.f317249c) && L.f(this.f317250d, checkBoxData.f317250d) && this.f317251e == checkBoxData.f317251e && this.f317252f == checkBoxData.f317252f && L.f(this.f317253g, checkBoxData.f317253g) && L.f(this.f317254h, checkBoxData.f317254h) && L.f(this.f317255i, checkBoxData.f317255i);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207369c() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF309300b() {
        return this.f317248b;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f317252f, (this.f317251e.hashCode() + H.d(H.d(this.f317248b.hashCode() * 31, 31, this.f317249c), 31, this.f317250d)) * 31, 31);
        List<String> list = this.f317253g;
        int iHashCode = (iE2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.f317254h;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.f317255i;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CheckBoxData(stringId=");
        sb2.append(this.f317248b);
        sb2.append(", paramId=");
        sb2.append(this.f317249c);
        sb2.append(", text=");
        sb2.append(this.f317250d);
        sb2.append(", selectType=");
        sb2.append(this.f317251e);
        sb2.append(", numberOfShifts=");
        sb2.append(this.f317252f);
        sb2.append(", parentIds=");
        sb2.append(this.f317253g);
        sb2.append(", childIds=");
        sb2.append(this.f317254h);
        sb2.append(", isEnabled=");
        return C0.g(sb2, this.f317255i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f317248b);
        parcel.writeString(this.f317249c);
        parcel.writeString(this.f317250d);
        parcel.writeString(this.f317251e.name());
        parcel.writeInt(this.f317252f);
        parcel.writeStringList(this.f317253g);
        parcel.writeStringList(this.f317254h);
        Boolean bool = this.f317255i;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }

    public /* synthetic */ CheckBoxData(String str, String str2, String str3, CheckboxType checkboxType, int i12, List list, List list2, Boolean bool, int i13, C42822w c42822w) {
        this(str, str2, str3, (i13 & 8) != 0 ? CheckboxType.f317257c : checkboxType, (i13 & 16) != 0 ? 0 : i12, (i13 & 32) != 0 ? null : list, (i13 & 64) != 0 ? null : list2, (i13 & 128) != 0 ? null : bool);
    }
}
