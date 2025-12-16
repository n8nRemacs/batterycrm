package com.avito.android.advertising.adapter.items.buzzoola.video;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CommercialVideoStates.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/adapter/items/buzzoola/video/CommercialVideoState;", "Landroid/os/Parcelable;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CommercialVideoState implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<CommercialVideoState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public long f87517b;

    /* renamed from: c, reason: collision with root package name */
    public float f87518c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f87519d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f87520e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f87521f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f87522g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f87523h;

    /* compiled from: CommercialVideoStates.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CommercialVideoState> {
        @Override // android.os.Parcelable.Creator
        public final CommercialVideoState createFromParcel(Parcel parcel) {
            return new CommercialVideoState(parcel.readLong(), parcel.readFloat(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final CommercialVideoState[] newArray(int i12) {
            return new CommercialVideoState[i12];
        }
    }

    public CommercialVideoState() {
        this(0L, 0.0f, false, false, false, false, false, 127, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommercialVideoState)) {
            return false;
        }
        CommercialVideoState commercialVideoState = (CommercialVideoState) obj;
        return this.f87517b == commercialVideoState.f87517b && Float.compare(this.f87518c, commercialVideoState.f87518c) == 0 && this.f87519d == commercialVideoState.f87519d && this.f87520e == commercialVideoState.f87520e && this.f87521f == commercialVideoState.f87521f && this.f87522g == commercialVideoState.f87522g && this.f87523h == commercialVideoState.f87523h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f87523h) + r.i(r.i(r.i(r.i(r.d(this.f87518c, Long.hashCode(this.f87517b) * 31, 31), 31, this.f87519d), 31, this.f87520e), 31, this.f87521f), 31, this.f87522g);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CommercialVideoState(videoPositionMs=");
        sb2.append(this.f87517b);
        sb2.append(", videoVolume=");
        sb2.append(this.f87518c);
        sb2.append(", isVideoStartTracked=");
        sb2.append(this.f87519d);
        sb2.append(", isVideoFirstQuartileTracked=");
        sb2.append(this.f87520e);
        sb2.append(", isVideoMidpointTracked=");
        sb2.append(this.f87521f);
        sb2.append(", isVideoThirdQuartileTracked=");
        sb2.append(this.f87522g);
        sb2.append(", isVideoCompleteTracked=");
        return r.x(sb2, this.f87523h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f87517b);
        parcel.writeFloat(this.f87518c);
        parcel.writeInt(this.f87519d ? 1 : 0);
        parcel.writeInt(this.f87520e ? 1 : 0);
        parcel.writeInt(this.f87521f ? 1 : 0);
        parcel.writeInt(this.f87522g ? 1 : 0);
        parcel.writeInt(this.f87523h ? 1 : 0);
    }

    public CommercialVideoState(long j12, float f12, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f87517b = j12;
        this.f87518c = f12;
        this.f87519d = z12;
        this.f87520e = z13;
        this.f87521f = z14;
        this.f87522g = z15;
        this.f87523h = z16;
    }

    public /* synthetic */ CommercialVideoState(long j12, float f12, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? 0L : j12, (i12 & 2) != 0 ? 0.0f : f12, (i12 & 4) != 0 ? false : z12, (i12 & 8) != 0 ? false : z13, (i12 & 16) != 0 ? false : z14, (i12 & 32) != 0 ? false : z15, (i12 & 64) == 0 ? z16 : false);
    }
}
