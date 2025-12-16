package com.avito.android.publish_limits_info;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ItemId.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish_limits_info/ItemId;", "Landroid/os/Parcelable;", "_avito_publish-limits-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ItemId implements Parcelable {

    @k
    public static final Parcelable.Creator<ItemId> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f245800b;

    /* compiled from: ItemId.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ItemId> {
        @Override // android.os.Parcelable.Creator
        public final ItemId createFromParcel(Parcel parcel) {
            return new ItemId(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ItemId[] newArray(int i12) {
            return new ItemId[i12];
        }
    }

    public ItemId(@k String str) {
        this.f245800b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ItemId) && L.f(this.f245800b, ((ItemId) obj).f245800b);
    }

    public final int hashCode() {
        return this.f245800b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("ItemId(id="), this.f245800b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f245800b);
    }
}
