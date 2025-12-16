package com.avito.android.crm_paid_cvs.dto;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.L;

/* compiled from: FilterItem.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/crm_paid_cvs/dto/FilterItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "FilterType", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FilterItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<FilterItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f130357b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final FilterType f130358c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f130359d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<OptionItem> f130360e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FilterItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/dto/FilterItem$FilterType;", "", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FilterType {

        /* renamed from: b, reason: collision with root package name */
        public static final FilterType f130361b;

        /* renamed from: c, reason: collision with root package name */
        public static final FilterType f130362c;

        /* renamed from: d, reason: collision with root package name */
        public static final FilterType f130363d;

        /* renamed from: e, reason: collision with root package name */
        public static final FilterType f130364e;

        /* renamed from: f, reason: collision with root package name */
        public static final FilterType f130365f;

        /* renamed from: g, reason: collision with root package name */
        public static final FilterType f130366g;

        /* renamed from: h, reason: collision with root package name */
        public static final FilterType f130367h;

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ FilterType[] f130368i;

        /* renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f130369j;

        static {
            FilterType filterType = new FilterType("SWITCHER", 0);
            f130361b = filterType;
            FilterType filterType2 = new FilterType("DATE", 1);
            f130362c = filterType2;
            FilterType filterType3 = new FilterType("LIST_SELECT", 2);
            f130363d = filterType3;
            FilterType filterType4 = new FilterType("LIST_MULTISELECT", 3);
            f130364e = filterType4;
            FilterType filterType5 = new FilterType("RANGE", 4);
            f130365f = filterType5;
            FilterType filterType6 = new FilterType("CHIPS", 5);
            f130366g = filterType6;
            FilterType filterType7 = new FilterType("ALL_FILTERS", 6);
            f130367h = filterType7;
            FilterType[] filterTypeArr = {filterType, filterType2, filterType3, filterType4, filterType5, filterType6, filterType7};
            f130368i = filterTypeArr;
            f130369j = c.a(filterTypeArr);
        }

        public FilterType() {
            throw null;
        }

        public static FilterType valueOf(String str) {
            return (FilterType) Enum.valueOf(FilterType.class, str);
        }

        public static FilterType[] values() {
            return (FilterType[]) f130368i.clone();
        }
    }

    /* compiled from: FilterItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FilterItem> {
        @Override // android.os.Parcelable.Creator
        public final FilterItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            FilterType filterTypeValueOf = FilterType.valueOf(parcel.readString());
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(OptionItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new FilterItem(string, filterTypeValueOf, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final FilterItem[] newArray(int i12) {
            return new FilterItem[i12];
        }
    }

    public FilterItem(@k String str, @k FilterType filterType, @k String str2, @k List<OptionItem> list) {
        this.f130357b = str;
        this.f130358c = filterType;
        this.f130359d = str2;
        this.f130360e = list;
    }

    public static FilterItem a(FilterItem filterItem, List list) {
        return new FilterItem(filterItem.f130357b, filterItem.f130358c, filterItem.f130359d, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterItem)) {
            return false;
        }
        FilterItem filterItem = (FilterItem) obj;
        return L.f(this.f130357b, filterItem.f130357b) && this.f130358c == filterItem.f130358c && L.f(this.f130359d, filterItem.f130359d) && L.f(this.f130360e, filterItem.f130360e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85355b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF126319b() {
        return this.f130357b;
    }

    public final int hashCode() {
        return this.f130360e.hashCode() + H.d((this.f130358c.hashCode() + (this.f130357b.hashCode() * 31)) * 31, 31, this.f130359d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FilterItem(stringId=");
        sb2.append(this.f130357b);
        sb2.append(", type=");
        sb2.append(this.f130358c);
        sb2.append(", title=");
        sb2.append(this.f130359d);
        sb2.append(", options=");
        return H.p(sb2, this.f130360e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f130357b);
        parcel.writeString(this.f130358c.name());
        parcel.writeString(this.f130359d);
        Iterator itJ = C0.j(this.f130360e, parcel);
        while (itJ.hasNext()) {
            ((OptionItem) itJ.next()).writeToParcel(parcel, i12);
        }
    }
}
