package com.yandex.mobile.ads.exo.metadata.dvbsi;

import AK.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.Cif;

/* loaded from: classes8.dex */
public final class AppInfoTable implements Metadata.Entry {
    public static final Parcelable.Creator<AppInfoTable> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f382950a;

    /* renamed from: b, reason: collision with root package name */
    public final String f382951b;

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
        this.f382950a = i12;
        this.f382951b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sbA = Cif.a("Ait(controlCode=");
        sbA.append(this.f382950a);
        sbA.append(",url=");
        return c.s(sbA, this.f382951b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f382951b);
        parcel.writeInt(this.f382950a);
    }
}
