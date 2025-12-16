package androidx.media3.container;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.J;
import j.InterfaceC42167x;
import j.P;

@J
/* loaded from: classes.dex */
public final class Mp4LocationData implements Metadata.Entry {
    public static final Parcelable.Creator<Mp4LocationData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final float f48115b;

    /* renamed from: c, reason: collision with root package name */
    public final float f48116c;

    public class a implements Parcelable.Creator<Mp4LocationData> {
        @Override // android.os.Parcelable.Creator
        public final Mp4LocationData createFromParcel(Parcel parcel) {
            return new Mp4LocationData(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        public final Mp4LocationData[] newArray(int i12) {
            return new Mp4LocationData[i12];
        }
    }

    public Mp4LocationData(@InterfaceC42167x float f12, @InterfaceC42167x float f13) {
        C23110a.a("Invalid latitude or longitude", f12 >= -90.0f && f12 <= 90.0f && f13 >= -180.0f && f13 <= 180.0f);
        this.f48115b = f12;
        this.f48116c = f13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Mp4LocationData.class != obj.getClass()) {
            return false;
        }
        Mp4LocationData mp4LocationData = (Mp4LocationData) obj;
        return this.f48115b == mp4LocationData.f48115b && this.f48116c == mp4LocationData.f48116c;
    }

    public final int hashCode() {
        return Float.valueOf(this.f48116c).hashCode() + ((Float.valueOf(this.f48115b).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f48115b + ", longitude=" + this.f48116c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeFloat(this.f48115b);
        parcel.writeFloat(this.f48116c);
    }

    public Mp4LocationData(Parcel parcel, a aVar) {
        this.f48115b = parcel.readFloat();
        this.f48116c = parcel.readFloat();
    }
}
