package com.avito.android.publish.iac_devices;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacDevice.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/iac_devices/IacDevice;", "Landroid/os/Parcelable;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class IacDevice implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<IacDevice> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f236029b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f236030c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f236031d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236032e;

    /* compiled from: IacDevice.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IacDevice> {
        @Override // android.os.Parcelable.Creator
        public final IacDevice createFromParcel(Parcel parcel) {
            return new IacDevice(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final IacDevice[] newArray(int i12) {
            return new IacDevice[i12];
        }
    }

    public IacDevice(@Y61.k String str, @Y61.k String str2, boolean z12, boolean z13) {
        this.f236029b = str;
        this.f236030c = str2;
        this.f236031d = z12;
        this.f236032e = z13;
    }

    public static IacDevice a(IacDevice iacDevice) {
        String str = iacDevice.f236029b;
        String str2 = iacDevice.f236030c;
        boolean z12 = iacDevice.f236031d;
        boolean z13 = iacDevice.f236032e;
        iacDevice.getClass();
        return new IacDevice(str, str2, z12, z13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IacDevice)) {
            return false;
        }
        IacDevice iacDevice = (IacDevice) obj;
        return L.f(this.f236029b, iacDevice.f236029b) && L.f(this.f236030c, iacDevice.f236030c) && this.f236031d == iacDevice.f236031d && this.f236032e == iacDevice.f236032e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f236032e) + r.i(H.d(this.f236029b.hashCode() * 31, 31, this.f236030c), 31, this.f236031d);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IacDevice(deviceName=");
        sb2.append(this.f236029b);
        sb2.append(", deviceId=");
        sb2.append(this.f236030c);
        sb2.append(", isCurrentDevice=");
        sb2.append(this.f236031d);
        sb2.append(", checked=");
        return r.x(sb2, this.f236032e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f236029b);
        parcel.writeString(this.f236030c);
        parcel.writeInt(this.f236031d ? 1 : 0);
        parcel.writeInt(this.f236032e ? 1 : 0);
    }
}
