package androidx.media3.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.J;
import j.P;

@J
/* loaded from: classes.dex */
public final class SmtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<SmtaMetadataEntry> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final float f50708b;

    /* renamed from: c, reason: collision with root package name */
    public final int f50709c;

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
        this.f50708b = f12;
        this.f50709c = i12;
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
        return this.f50708b == smtaMetadataEntry.f50708b && this.f50709c == smtaMetadataEntry.f50709c;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f50708b).hashCode() + 527) * 31) + this.f50709c;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f50708b + ", svcTemporalLayerCount=" + this.f50709c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeFloat(this.f50708b);
        parcel.writeInt(this.f50709c);
    }

    public SmtaMetadataEntry(Parcel parcel, a aVar) {
        this.f50708b = parcel.readFloat();
        this.f50709c = parcel.readInt();
    }
}
