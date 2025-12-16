package com.avito.android.profile_settings_extended.adapter.select;

import Rb0.InterfaceC15025a;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.grid.GridElementType;
import com.avito.android.profile_settings_extended.adapter.SettingsListItem;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/select/SelectItem;", "Lcom/avito/android/profile_settings_extended/adapter/SettingsListItem;", "LRb0/a;", "LRb0/d;", "Option", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class SelectItem implements SettingsListItem, InterfaceC15025a, Rb0.d {

    @k
    public static final Parcelable.Creator<SelectItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f229812b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f229813c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f229814d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f229815e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f229816f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f229817g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f229818h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final List<Option> f229819i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final String f229820j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final String f229821k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final Integer f229822l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final String f229823m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f229824n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final GridElementType.FullWidth f229825o;

    /* compiled from: SelectItem.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/select/SelectItem$Option;", "Lcom/avito/android/remote/model/ParcelableEntity;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Option implements ParcelableEntity<String> {

        @k
        public static final Parcelable.Creator<Option> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f229826b;

        /* renamed from: c, reason: collision with root package name */
        public final int f229827c;

        /* compiled from: SelectItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Option> {
            @Override // android.os.Parcelable.Creator
            public final Option createFromParcel(Parcel parcel) {
                return new Option(parcel.readString(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Option[] newArray(int i12) {
                return new Option[i12];
            }
        }

        public Option(@k String str, int i12) {
            this.f229826b = str;
            this.f229827c = i12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Option)) {
                return false;
            }
            Option option = (Option) obj;
            return L.f(this.f229826b, option.f229826b) && this.f229827c == option.f229827c;
        }

        @Override // com.avito.android.remote.model.Entity
        public final Object getId() {
            return String.valueOf(this.f229827c);
        }

        @Override // com.avito.android.remote.model.Entity
        @k
        /* renamed from: getName, reason: from getter */
        public final String getF199959c() {
            return this.f229826b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f229827c) + (this.f229826b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Option(label=");
            sb2.append(this.f229826b);
            sb2.append(", value=");
            return r.t(sb2, this.f229827c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f229826b);
            parcel.writeInt(this.f229827c);
        }
    }

    /* compiled from: SelectItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelectItem> {
        @Override // android.os.Parcelable.Creator
        public final SelectItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(Option.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new SelectItem(string, string2, string3, string4, string5, string6, string7, arrayList, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SelectItem[] newArray(int i12) {
            return new SelectItem[i12];
        }
    }

    public SelectItem(@k String str, @l String str2, @k String str3, @l String str4, @l String str5, @l String str6, @l String str7, @k List<Option> list, @k String str8, @k String str9, @l Integer num, @l String str10, boolean z12) {
        this.f229812b = str;
        this.f229813c = str2;
        this.f229814d = str3;
        this.f229815e = str4;
        this.f229816f = str5;
        this.f229817g = str6;
        this.f229818h = str7;
        this.f229819i = list;
        this.f229820j = str8;
        this.f229821k = str9;
        this.f229822l = num;
        this.f229823m = str10;
        this.f229824n = z12;
        this.f229825o = GridElementType.FullWidth.f161209b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectItem)) {
            return false;
        }
        SelectItem selectItem = (SelectItem) obj;
        return L.f(this.f229812b, selectItem.f229812b) && L.f(this.f229813c, selectItem.f229813c) && L.f(this.f229814d, selectItem.f229814d) && L.f(this.f229815e, selectItem.f229815e) && L.f(this.f229816f, selectItem.f229816f) && L.f(this.f229817g, selectItem.f229817g) && L.f(this.f229818h, selectItem.f229818h) && L.f(this.f229819i, selectItem.f229819i) && L.f(this.f229820j, selectItem.f229820j) && L.f(this.f229821k, selectItem.f229821k) && L.f(this.f229822l, selectItem.f229822l) && L.f(this.f229823m, selectItem.f229823m) && this.f229824n == selectItem.f229824n;
    }

    @Override // Rb0.d
    @l
    /* renamed from: f, reason: from getter */
    public final String getF229916d() {
        return this.f229813c;
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType */
    public final GridElementType getF154919c() {
        return this.f229825o;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF270893b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF323276b() {
        return this.f229812b;
    }

    public final int hashCode() {
        int iHashCode = this.f229812b.hashCode() * 31;
        String str = this.f229813c;
        int iD2 = H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f229814d);
        String str2 = this.f229815e;
        int iHashCode2 = (iD2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f229816f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f229817g;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f229818h;
        int iD3 = H.d(H.d(H.e((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.f229819i), 31, this.f229820j), 31, this.f229821k);
        Integer num = this.f229822l;
        int iHashCode5 = (iD3 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.f229823m;
        return Boolean.hashCode(this.f229824n) + ((iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectItem(stringId=");
        sb2.append(this.f229812b);
        sb2.append(", widgetName=");
        sb2.append(this.f229813c);
        sb2.append(", title=");
        sb2.append(this.f229814d);
        sb2.append(", description=");
        sb2.append(this.f229815e);
        sb2.append(", placeholder=");
        sb2.append(this.f229816f);
        sb2.append(", popupTitle=");
        sb2.append(this.f229817g);
        sb2.append(", popupInputPlaceholder=");
        sb2.append(this.f229818h);
        sb2.append(", options=");
        sb2.append(this.f229819i);
        sb2.append(", fieldName=");
        sb2.append(this.f229820j);
        sb2.append(", valueId=");
        sb2.append(this.f229821k);
        sb2.append(", value=");
        sb2.append(this.f229822l);
        sb2.append(", defaultSaveErrorMessage=");
        sb2.append(this.f229823m);
        sb2.append(", isActive=");
        return r.x(sb2, this.f229824n, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f229812b);
        parcel.writeString(this.f229813c);
        parcel.writeString(this.f229814d);
        parcel.writeString(this.f229815e);
        parcel.writeString(this.f229816f);
        parcel.writeString(this.f229817g);
        parcel.writeString(this.f229818h);
        Iterator itJ = C0.j(this.f229819i, parcel);
        while (itJ.hasNext()) {
            ((Option) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f229820j);
        parcel.writeString(this.f229821k);
        Integer num = this.f229822l;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeString(this.f229823m);
        parcel.writeInt(this.f229824n ? 1 : 0);
    }

    public /* synthetic */ SelectItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, String str8, String str9, Integer num, String str10, boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "select_item" : str, str2, str3, str4, str5, str6, str7, list, str8, str9, num, str10, z12);
    }
}
