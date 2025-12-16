package com.avito.android.bottom_sheet_group.items.multiselect_item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.bottom_sheet_group.items.checkable_item.BottomSheetGroupCheckableItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BottomSheetMultiselectItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bottom_sheet_group/items/multiselect_item/BottomSheetMultiselectItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_bottom-sheet-group_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BottomSheetMultiselectItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<BottomSheetMultiselectItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f107356b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f107357c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final List<String> f107358d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final List<BottomSheetGroupCheckableItem> f107359e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final List<BottomSheetGroupCheckableItem> f107360f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f107361g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Boolean f107362h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f107363i;

    /* compiled from: BottomSheetMultiselectItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BottomSheetMultiselectItem> {
        @Override // android.os.Parcelable.Creator
        public final BottomSheetMultiselectItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(BottomSheetGroupCheckableItem.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                int iC3 = 0;
                while (iC3 != i13) {
                    iC3 = com.avito.android.actions_sheet.a.c(BottomSheetGroupCheckableItem.CREATOR, parcel, arrayList2, iC3, 1);
                }
            }
            boolean z12 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BottomSheetMultiselectItem(string, string2, arrayListCreateStringArrayList, arrayList, arrayList2, z12, boolValueOf, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final BottomSheetMultiselectItem[] newArray(int i12) {
            return new BottomSheetMultiselectItem[i12];
        }
    }

    public BottomSheetMultiselectItem(@k String str, @k String str2, @l List<String> list, @l List<BottomSheetGroupCheckableItem> list2, @l List<BottomSheetGroupCheckableItem> list3, boolean z12, @l Boolean bool, boolean z13) {
        this.f107356b = str;
        this.f107357c = str2;
        this.f107358d = list;
        this.f107359e = list2;
        this.f107360f = list3;
        this.f107361g = z12;
        this.f107362h = bool;
        this.f107363i = z13;
    }

    public static BottomSheetMultiselectItem a(BottomSheetMultiselectItem bottomSheetMultiselectItem, boolean z12) {
        String str = bottomSheetMultiselectItem.f107356b;
        String str2 = bottomSheetMultiselectItem.f107357c;
        List<String> list = bottomSheetMultiselectItem.f107358d;
        List<BottomSheetGroupCheckableItem> list2 = bottomSheetMultiselectItem.f107359e;
        List<BottomSheetGroupCheckableItem> list3 = bottomSheetMultiselectItem.f107360f;
        Boolean bool = bottomSheetMultiselectItem.f107362h;
        boolean z13 = bottomSheetMultiselectItem.f107363i;
        bottomSheetMultiselectItem.getClass();
        return new BottomSheetMultiselectItem(str, str2, list, list2, list3, z12, bool, z13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomSheetMultiselectItem)) {
            return false;
        }
        BottomSheetMultiselectItem bottomSheetMultiselectItem = (BottomSheetMultiselectItem) obj;
        return L.f(this.f107356b, bottomSheetMultiselectItem.f107356b) && L.f(this.f107357c, bottomSheetMultiselectItem.f107357c) && L.f(this.f107358d, bottomSheetMultiselectItem.f107358d) && L.f(this.f107359e, bottomSheetMultiselectItem.f107359e) && L.f(this.f107360f, bottomSheetMultiselectItem.f107360f) && this.f107361g == bottomSheetMultiselectItem.f107361g && L.f(this.f107362h, bottomSheetMultiselectItem.f107362h) && this.f107363i == bottomSheetMultiselectItem.f107363i;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85355b() {
        return getF97993b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF97993b() {
        return this.f107356b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f107356b.hashCode() * 31, 31, this.f107357c);
        List<String> list = this.f107358d;
        int iHashCode = (iD2 + (list == null ? 0 : list.hashCode())) * 31;
        List<BottomSheetGroupCheckableItem> list2 = this.f107359e;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<BottomSheetGroupCheckableItem> list3 = this.f107360f;
        int i12 = r.i((iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31, 31, this.f107361g);
        Boolean bool = this.f107362h;
        return Boolean.hashCode(this.f107363i) + ((i12 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BottomSheetMultiselectItem(stringId=");
        sb2.append(this.f107356b);
        sb2.append(", title=");
        sb2.append(this.f107357c);
        sb2.append(", value=");
        sb2.append(this.f107358d);
        sb2.append(", allValues=");
        sb2.append(this.f107359e);
        sb2.append(", topValues=");
        sb2.append(this.f107360f);
        sb2.append(", isExpanded=");
        sb2.append(this.f107361g);
        sb2.append(", hideTitle=");
        sb2.append(this.f107362h);
        sb2.append(", isFirstItem=");
        return r.x(sb2, this.f107363i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f107356b);
        parcel.writeString(this.f107357c);
        parcel.writeStringList(this.f107358d);
        List<BottomSheetGroupCheckableItem> list = this.f107359e;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((BottomSheetGroupCheckableItem) itA.next()).writeToParcel(parcel, i12);
            }
        }
        List<BottomSheetGroupCheckableItem> list2 = this.f107360f;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                ((BottomSheetGroupCheckableItem) itA2.next()).writeToParcel(parcel, i12);
            }
        }
        parcel.writeInt(this.f107361g ? 1 : 0);
        Boolean bool = this.f107362h;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeInt(this.f107363i ? 1 : 0);
    }

    public /* synthetic */ BottomSheetMultiselectItem(String str, String str2, List list, List list2, List list3, boolean z12, Boolean bool, boolean z13, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : list, (i12 & 8) != 0 ? null : list2, (i12 & 16) != 0 ? null : list3, (i12 & 32) != 0 ? false : z12, (i12 & 64) != 0 ? null : bool, (i12 & 128) != 0 ? false : z13);
    }
}
