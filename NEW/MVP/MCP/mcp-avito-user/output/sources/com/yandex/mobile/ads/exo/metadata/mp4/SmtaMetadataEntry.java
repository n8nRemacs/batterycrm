package com.yandex.mobile.ads.exo.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.Cif;
import j.P;

/* loaded from: classes8.dex */
public final class SmtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<SmtaMetadataEntry> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final float f383030a;

    /* renamed from: b, reason: collision with root package name */
    public final int f383031b;

    public class a implements Parcelable.Creator<SmtaMetadataEntry> {
        @Override // android.os.Parcelable.Creator
        public final SmtaMetadataEntry createFromParcel(Parcel parcel) {
            return new SmtaMetadataEntry(parcel, 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SmtaMetadataEntry[] newArray(int i12) {
            return new SmtaMetadataEntry[i12];
        }
    }

    public /* synthetic */ SmtaMetadataEntry(Parcel parcel, int i12) {
        this(parcel);
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
        return this.f383030a == smtaMetadataEntry.f383030a && this.f383031b == smtaMetadataEntry.f383031b;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f383030a).hashCode() + 527) * 31) + this.f383031b;
    }

    public final String toString() {
        StringBuilder sbA = Cif.a("smta: captureFrameRate=");
        sbA.append(this.f383030a);
        sbA.append(", svcTemporalLayerCount=");
        sbA.append(this.f383031b);
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeFloat(this.f383030a);
        parcel.writeInt(this.f383031b);
    }

    public SmtaMetadataEntry(int i12, float f12) {
        this.f383030a = f12;
        this.f383031b = i12;
    }

    private SmtaMetadataEntry(Parcel parcel) {
        this.f383030a = parcel.readFloat();
        this.f383031b = parcel.readInt();
    }
}
