package androidx.media3.extractor.metadata.dvbsi;

import AK.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.J;

@J
/* loaded from: classes.dex */
public final class AppInfoTable implements Metadata.Entry {
    public static final Parcelable.Creator<AppInfoTable> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f50622b;

    /* renamed from: c, reason: collision with root package name */
    public final String f50623c;

    public class a implements Parcelable.Creator<AppInfoTable> {
        @Override // android.os.Parcelable.Creator
        public final AppInfoTable createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            string.getClass();
            return new AppInfoTable(parcel.readInt(), string);
        }

        @Override // android.os.Parcelable.Creator
        public final AppInfoTable[] newArray(int i12) {
            return new AppInfoTable[i12];
        }
    }

    public AppInfoTable(int i12, String str) {
        this.f50622b = i12;
        this.f50623c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Ait(controlCode=");
        sb2.append(this.f50622b);
        sb2.append(",url=");
        return c.s(sb2, this.f50623c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f50623c);
        parcel.writeInt(this.f50622b);
    }
}
