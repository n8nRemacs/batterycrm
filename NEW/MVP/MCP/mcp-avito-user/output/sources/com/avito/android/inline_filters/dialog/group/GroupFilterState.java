package com.avito.android.inline_filters.dialog.group;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: GroupFilterState.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/group/GroupFilterState;", "Landroid/os/Parcelable;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class GroupFilterState implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<GroupFilterState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f171555b;

    /* compiled from: GroupFilterState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GroupFilterState> {
        @Override // android.os.Parcelable.Creator
        public final GroupFilterState createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                arrayList.add(parcel.readSerializable());
            }
            return new GroupFilterState(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupFilterState[] newArray(int i12) {
            return new GroupFilterState[i12];
        }
    }

    public GroupFilterState(@Y61.k ArrayList arrayList) {
        this.f171555b = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GroupFilterState) && this.f171555b.equals(((GroupFilterState) obj).f171555b);
    }

    public final int hashCode() {
        return this.f171555b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("GroupFilterState(filters="), this.f171555b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f171555b, parcel);
        while (itZ.hasNext()) {
            parcel.writeSerializable((Serializable) itZ.next());
        }
    }
}
