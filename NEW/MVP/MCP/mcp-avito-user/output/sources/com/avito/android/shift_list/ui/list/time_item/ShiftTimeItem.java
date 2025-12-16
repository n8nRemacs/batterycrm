package com.avito.android.shift_list.ui.list.time_item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ShiftTimeItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/shift_list/ui/list/time_item/ShiftTimeItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_gig_shift-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ShiftTimeItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<ShiftTimeItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f281152b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f281153c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f281154d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Action f281155e;

    /* compiled from: ShiftTimeItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ShiftTimeItem> {
        @Override // android.os.Parcelable.Creator
        public final ShiftTimeItem createFromParcel(Parcel parcel) {
            return new ShiftTimeItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Action.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ShiftTimeItem[] newArray(int i12) {
            return new ShiftTimeItem[i12];
        }
    }

    public ShiftTimeItem(@k String str, @k String str2, @l String str3, @l Action action) {
        this.f281152b = str;
        this.f281153c = str2;
        this.f281154d = str3;
        this.f281155e = action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShiftTimeItem)) {
            return false;
        }
        ShiftTimeItem shiftTimeItem = (ShiftTimeItem) obj;
        return L.f(this.f281152b, shiftTimeItem.f281152b) && L.f(this.f281153c, shiftTimeItem.f281153c) && L.f(this.f281154d, shiftTimeItem.f281154d) && L.f(this.f281155e, shiftTimeItem.f281155e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF124042b() {
        return getF16762f().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF16762f() {
        return this.f281152b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f281152b.hashCode() * 31, 31, this.f281153c);
        String str = this.f281154d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        Action action = this.f281155e;
        return iHashCode + (action != null ? action.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "ShiftTimeItem(stringId=" + this.f281152b + ", title=" + this.f281153c + ", subtitle=" + this.f281154d + ", buttonAction=" + this.f281155e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f281152b);
        parcel.writeString(this.f281153c);
        parcel.writeString(this.f281154d);
        Action action = this.f281155e;
        if (action == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            action.writeToParcel(parcel, i12);
        }
    }
}
