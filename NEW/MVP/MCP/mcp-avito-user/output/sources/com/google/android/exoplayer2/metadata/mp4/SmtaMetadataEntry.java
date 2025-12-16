package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import j.P;

/* loaded from: classes6.dex */
public final class SmtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<SmtaMetadataEntry> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final float f345726b;

    /* renamed from: c, reason: collision with root package name */
    public final int f345727c;

    public class a implements Parcelable.Creator<SmtaMetadataEntry> {
        @Override // android.os.Parcelable.Creator
        public final SmtaMetadataEntry createFromParcel(Parcel parcel) {
            return new SmtaMetadataEntry(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        public final SmtaMetadataEntry[] newArray(int i12) {
            return new SmtaMetadataEntry[i12];
        }
    }

    public SmtaMetadataEntry(float f12, int i12) {
        this.f345726b = f12;
        this.f345727c = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SmtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        SmtaMetadataEntry smtaMetadataEntry = (SmtaMetadataEntry) obj;
        return this.f345726b == smtaMetadataEntry.f345726b && this.f345727c == smtaMetadataEntry.f345727c;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f345726b).hashCode() + 527) * 31) + this.f345727c;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f345726b + ", svcTemporalLayerCount=" + this.f345727c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeFloat(this.f345726b);
        parcel.writeInt(this.f345727c);
    }

    public SmtaMetadataEntry(Parcel parcel, a aVar) {
        this.f345726b = parcel.readFloat();
        this.f345727c = parcel.readInt();
    }
}
