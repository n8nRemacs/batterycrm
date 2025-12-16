package com.avito.android.short_term_rent.bookingform.items.toggle;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ToggleOptionsItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/items/toggle/ToggleOptionsItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ToggleOptionsItem implements ParcelableItem {

    @Y61.k
    public static final Parcelable.Creator<ToggleOptionsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f281699b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f281700c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ToggleOptionsDisplayType f281701d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ArrayList f281702e;

    /* renamed from: f, reason: collision with root package name */
    public final int f281703f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f281704g;

    /* compiled from: ToggleOptionsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ToggleOptionsItem> {
        @Override // android.os.Parcelable.Creator
        public final ToggleOptionsItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            ToggleOptionsDisplayType toggleOptionsDisplayTypeValueOf = ToggleOptionsDisplayType.valueOf(parcel.readString());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(ToggleOptionItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new ToggleOptionsItem(string, string2, toggleOptionsDisplayTypeValueOf, arrayList, parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ToggleOptionsItem[] newArray(int i12) {
            return new ToggleOptionsItem[i12];
        }
    }

    public ToggleOptionsItem(@Y61.k String str, @Y61.k String str2, @Y61.k ToggleOptionsDisplayType toggleOptionsDisplayType, @Y61.k ArrayList arrayList, int i12, boolean z12) {
        this.f281699b = str;
        this.f281700c = str2;
        this.f281701d = toggleOptionsDisplayType;
        this.f281702e = arrayList;
        this.f281703f = i12;
        this.f281704g = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToggleOptionsItem)) {
            return false;
        }
        ToggleOptionsItem toggleOptionsItem = (ToggleOptionsItem) obj;
        return L.f(this.f281699b, toggleOptionsItem.f281699b) && L.f(this.f281700c, toggleOptionsItem.f281700c) && this.f281701d == toggleOptionsItem.f281701d && this.f281702e.equals(toggleOptionsItem.f281702e) && this.f281703f == toggleOptionsItem.f281703f && this.f281704g == toggleOptionsItem.f281704g;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF82706b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF281722b() {
        return this.f281699b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f281704g) + r.e(this.f281703f, androidx.compose.ui.graphics.colorspace.e.g(this.f281702e, (this.f281701d.hashCode() + H.d(this.f281699b.hashCode() * 31, 31, this.f281700c)) * 31, 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ToggleOptionsItem(stringId=");
        sb2.append(this.f281699b);
        sb2.append(", parameterId=");
        sb2.append(this.f281700c);
        sb2.append(", displayType=");
        sb2.append(this.f281701d);
        sb2.append(", options=");
        sb2.append(this.f281702e);
        sb2.append(", selectedOptionPosition=");
        sb2.append(this.f281703f);
        sb2.append(", needFormReload=");
        return r.x(sb2, this.f281704g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f281699b);
        parcel.writeString(this.f281700c);
        parcel.writeString(this.f281701d.name());
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f281702e, parcel);
        while (itZ.hasNext()) {
            ((ToggleOptionItem) itZ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f281703f);
        parcel.writeInt(this.f281704g ? 1 : 0);
    }
}
