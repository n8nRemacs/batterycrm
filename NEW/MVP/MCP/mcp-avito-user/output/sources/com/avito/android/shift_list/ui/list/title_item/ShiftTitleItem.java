package com.avito.android.shift_list.ui.list.title_item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ShiftTitleItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/shift_list/ui/list/title_item/ShiftTitleItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_gig_shift-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ShiftTitleItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<ShiftTitleItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f281166b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f281167c;

    /* compiled from: ShiftTitleItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ShiftTitleItem> {
        @Override // android.os.Parcelable.Creator
        public final ShiftTitleItem createFromParcel(Parcel parcel) {
            return new ShiftTitleItem(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShiftTitleItem[] newArray(int i12) {
            return new ShiftTitleItem[i12];
        }
    }

    public ShiftTitleItem(@k String str, @k String str2) {
        this.f281166b = str;
        this.f281167c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShiftTitleItem)) {
            return false;
        }
        ShiftTitleItem shiftTitleItem = (ShiftTitleItem) obj;
        return L.f(this.f281166b, shiftTitleItem.f281166b) && L.f(this.f281167c, shiftTitleItem.f281167c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF282036b() {
        return getF279229b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF279229b() {
        return this.f281166b;
    }

    public final int hashCode() {
        return this.f281167c.hashCode() + (this.f281166b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShiftTitleItem(stringId=");
        sb2.append(this.f281166b);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f281167c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f281166b);
        parcel.writeString(this.f281167c);
    }
}
