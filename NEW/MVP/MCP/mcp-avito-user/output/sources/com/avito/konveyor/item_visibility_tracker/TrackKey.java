package com.avito.konveyor.item_visibility_tracker;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ItemVisibilityTracker.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/konveyor/item_visibility_tracker/TrackKey;", "Landroid/os/Parcelable;", "_common_konveyor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TrackKey implements Parcelable {

    @k
    public static final Parcelable.Creator<TrackKey> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Class<?> f338522b;

    /* renamed from: c, reason: collision with root package name */
    public final long f338523c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Class<?> f338524d;

    /* compiled from: ItemVisibilityTracker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TrackKey> {
        @Override // android.os.Parcelable.Creator
        public final TrackKey createFromParcel(Parcel parcel) {
            return new TrackKey((Class) parcel.readSerializable(), parcel.readLong(), (Class) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final TrackKey[] newArray(int i12) {
            return new TrackKey[i12];
        }
    }

    public TrackKey(@k Class<?> cls, long j12, @k Class<?> cls2) {
        this.f338522b = cls;
        this.f338523c = j12;
        this.f338524d = cls2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackKey)) {
            return false;
        }
        TrackKey trackKey = (TrackKey) obj;
        return L.f(this.f338522b, trackKey.f338522b) && this.f338523c == trackKey.f338523c && L.f(this.f338524d, trackKey.f338524d);
    }

    public final int hashCode() {
        return this.f338524d.hashCode() + r.g(this.f338522b.hashCode() * 31, 31, this.f338523c);
    }

    @k
    public final String toString() {
        return "TrackKey(itemClass=" + this.f338522b + ", itemId=" + this.f338523c + ", filterClass=" + this.f338524d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeSerializable(this.f338522b);
        parcel.writeLong(this.f338523c);
        parcel.writeSerializable(this.f338524d);
    }
}
