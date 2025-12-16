package com.avito.android.profile_settings_extended.adapter.item_selections;

import Rb0.InterfaceC15025a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.grid.GridElementType;
import com.avito.android.profile_settings_extended.adapter.SettingsListItem;
import com.avito.android.profile_settings_extended.adapter.item_selections.adapter.SelectionsRecyclerItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectionsItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/item_selections/SelectionsItem;", "Lcom/avito/android/profile_settings_extended/adapter/SettingsListItem;", "LRb0/a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class SelectionsItem implements SettingsListItem, InterfaceC15025a {

    @Y61.k
    public static final Parcelable.Creator<SelectionsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f229520b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f229521c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f229522d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f229523e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final List<SelectionsRecyclerItem> f229524f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Parcelable f229525g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f229526h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final GridElementType.FullWidth f229527i;

    /* compiled from: SelectionsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelectionsItem> {
        @Override // android.os.Parcelable.Creator
        public final SelectionsItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(SelectionsItem.class, parcel, arrayList, iL2, 1);
            }
            return new SelectionsItem(string, string2, string3, string4, arrayList, parcel.readParcelable(SelectionsItem.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SelectionsItem[] newArray(int i12) {
            return new SelectionsItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SelectionsItem(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4, @Y61.k List<? extends SelectionsRecyclerItem> list, @Y61.l Parcelable parcelable, boolean z12) {
        this.f229520b = str;
        this.f229521c = str2;
        this.f229522d = str3;
        this.f229523e = str4;
        this.f229524f = list;
        this.f229525g = parcelable;
        this.f229526h = z12;
        this.f229527i = GridElementType.FullWidth.f161209b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SelectionsItem a(SelectionsItem selectionsItem, ArrayList arrayList, Parcelable parcelable, int i12) {
        List list = arrayList;
        if ((i12 & 16) != 0) {
            list = selectionsItem.f229524f;
        }
        List list2 = list;
        if ((i12 & 32) != 0) {
            parcelable = selectionsItem.f229525g;
        }
        boolean z12 = selectionsItem.f229526h;
        return new SelectionsItem(selectionsItem.f229520b, selectionsItem.f229521c, selectionsItem.f229522d, selectionsItem.f229523e, list2, parcelable, z12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectionsItem)) {
            return false;
        }
        SelectionsItem selectionsItem = (SelectionsItem) obj;
        return L.f(this.f229520b, selectionsItem.f229520b) && L.f(this.f229521c, selectionsItem.f229521c) && L.f(this.f229522d, selectionsItem.f229522d) && L.f(this.f229523e, selectionsItem.f229523e) && L.f(this.f229524f, selectionsItem.f229524f) && L.f(this.f229525g, selectionsItem.f229525g) && this.f229526h == selectionsItem.f229526h;
    }

    @Override // QH.a
    @Y61.k
    /* renamed from: getGridType */
    public final GridElementType getF154809c() {
        return this.f229527i;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85355b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF225422b() {
        return this.f229520b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f229520b.hashCode() * 31, 31, this.f229521c);
        String str = this.f229522d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f229523e;
        int iE2 = H.e((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f229524f);
        Parcelable parcelable = this.f229525g;
        return Boolean.hashCode(this.f229526h) + ((iE2 + (parcelable != null ? parcelable.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectionsItem(stringId=");
        sb2.append(this.f229520b);
        sb2.append(", fieldName=");
        sb2.append(this.f229521c);
        sb2.append(", title=");
        sb2.append(this.f229522d);
        sb2.append(", description=");
        sb2.append(this.f229523e);
        sb2.append(", recyclerItems=");
        sb2.append(this.f229524f);
        sb2.append(", scrollState=");
        sb2.append(this.f229525g);
        sb2.append(", isActive=");
        return r.x(sb2, this.f229526h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f229520b);
        parcel.writeString(this.f229521c);
        parcel.writeString(this.f229522d);
        parcel.writeString(this.f229523e);
        Iterator itJ = C0.j(this.f229524f, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeParcelable(this.f229525g, i12);
        parcel.writeInt(this.f229526h ? 1 : 0);
    }

    public /* synthetic */ SelectionsItem(String str, String str2, String str3, String str4, List list, Parcelable parcelable, boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "item_selections" : str, str2, str3, str4, list, (i12 & 32) != 0 ? null : parcelable, z12);
    }
}
