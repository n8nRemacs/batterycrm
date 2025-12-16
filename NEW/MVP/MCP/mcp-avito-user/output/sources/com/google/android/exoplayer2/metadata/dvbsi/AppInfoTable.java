package com.google.android.exoplayer2.metadata.dvbsi;

import AK.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;

/* loaded from: classes6.dex */
public final class AppInfoTable implements Metadata.Entry {
    public static final Parcelable.Creator<AppInfoTable> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f345626b;

    /* renamed from: c, reason: collision with root package name */
    public final String f345627c;

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
        this.f345626b = i12;
        this.f345627c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Ait(controlCode=");
        sb2.append(this.f345626b);
        sb2.append(",url=");
        return c.s(sb2, this.f345627c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f345627c);
        parcel.writeInt(this.f345626b);
    }
}
