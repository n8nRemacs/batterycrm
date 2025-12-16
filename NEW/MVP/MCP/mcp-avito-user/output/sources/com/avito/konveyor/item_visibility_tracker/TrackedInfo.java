package com.avito.konveyor.item_visibility_tracker;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ItemVisibilityTracker.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/konveyor/item_visibility_tracker/TrackedInfo;", "Landroid/os/Parcelable;", "_common_konveyor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TrackedInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<TrackedInfo> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Class<WV0.a> f338525b;

    /* renamed from: c, reason: collision with root package name */
    public long f338526c;

    /* renamed from: d, reason: collision with root package name */
    public long f338527d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public WV0.a f338528e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public c f338529f;

    /* compiled from: ItemVisibilityTracker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TrackedInfo> {
        @Override // android.os.Parcelable.Creator
        public final TrackedInfo createFromParcel(Parcel parcel) {
            return new TrackedInfo((Class) parcel.readSerializable(), parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final TrackedInfo[] newArray(int i12) {
            return new TrackedInfo[i12];
        }
    }

    public TrackedInfo(@k Class<WV0.a> cls, long j12, long j13) {
        this.f338525b = cls;
        this.f338526c = j12;
        this.f338527d = j13;
    }

    public final long c() {
        WV0.a aVar = this.f338528e;
        return Math.max(0L, (aVar != null ? aVar.f17933d : 0L) - this.f338526c);
    }

    public final boolean d() {
        long j12 = this.f338526c;
        WV0.a aVar = this.f338528e;
        return j12 >= (aVar != null ? aVar.f17933d : 0L);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(@l c cVar) {
        this.f338529f = cVar;
        if (cVar != null) {
            this.f338527d = SystemClock.elapsedRealtime();
        } else if (this.f338527d != 0) {
            this.f338526c = (SystemClock.elapsedRealtime() - this.f338527d) + this.f338526c;
        }
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackedInfo)) {
            return false;
        }
        TrackedInfo trackedInfo = (TrackedInfo) obj;
        return L.f(this.f338525b, trackedInfo.f338525b) && this.f338526c == trackedInfo.f338526c && this.f338527d == trackedInfo.f338527d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f338527d) + r.g(this.f338525b.hashCode() * 31, 31, this.f338526c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TrackedInfo(filterClass=");
        sb2.append(this.f338525b);
        sb2.append(", trackedTime=");
        sb2.append(this.f338526c);
        sb2.append(", startTrackingTime=");
        return r.u(sb2, this.f338527d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeSerializable(this.f338525b);
        parcel.writeLong(this.f338526c);
        parcel.writeLong(this.f338527d);
    }

    public /* synthetic */ TrackedInfo(Class cls, long j12, long j13, int i12, C42822w c42822w) {
        this(cls, (i12 & 2) != 0 ? 0L : j12, (i12 & 4) != 0 ? 0L : j13);
    }
}
