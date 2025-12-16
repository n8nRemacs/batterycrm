package androidx.media3.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.J;
import com.google.common.primitives.n;
import j.P;

@J
/* loaded from: classes.dex */
public final class MotionPhotoMetadata implements Metadata.Entry {
    public static final Parcelable.Creator<MotionPhotoMetadata> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f50699b;

    /* renamed from: c, reason: collision with root package name */
    public final long f50700c;

    /* renamed from: d, reason: collision with root package name */
    public final long f50701d;

    /* renamed from: e, reason: collision with root package name */
    public final long f50702e;

    /* renamed from: f, reason: collision with root package name */
    public final long f50703f;

    public class a implements Parcelable.Creator<MotionPhotoMetadata> {
        @Override // android.os.Parcelable.Creator
        public final MotionPhotoMetadata createFromParcel(Parcel parcel) {
            return new MotionPhotoMetadata(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final MotionPhotoMetadata[] newArray(int i12) {
            return new MotionPhotoMetadata[i12];
        }
    }

    public MotionPhotoMetadata(long j12, long j13, long j14, long j15, long j16) {
        this.f50699b = j12;
        this.f50700c = j13;
        this.f50701d = j14;
        this.f50702e = j15;
        this.f50703f = j16;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MotionPhotoMetadata.class != obj.getClass()) {
            return false;
        }
        MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
        return this.f50699b == motionPhotoMetadata.f50699b && this.f50700c == motionPhotoMetadata.f50700c && this.f50701d == motionPhotoMetadata.f50701d && this.f50702e == motionPhotoMetadata.f50702e && this.f50703f == motionPhotoMetadata.f50703f;
    }

    public final int hashCode() {
        return n.b(this.f50703f) + ((n.b(this.f50702e) + ((n.b(this.f50701d) + ((n.b(this.f50700c) + ((n.b(this.f50699b) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f50699b + ", photoSize=" + this.f50700c + ", photoPresentationTimestampUs=" + this.f50701d + ", videoStartPosition=" + this.f50702e + ", videoSize=" + this.f50703f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeLong(this.f50699b);
        parcel.writeLong(this.f50700c);
        parcel.writeLong(this.f50701d);
        parcel.writeLong(this.f50702e);
        parcel.writeLong(this.f50703f);
    }

    public MotionPhotoMetadata(Parcel parcel, a aVar) {
        this.f50699b = parcel.readLong();
        this.f50700c = parcel.readLong();
        this.f50701d = parcel.readLong();
        this.f50702e = parcel.readLong();
        this.f50703f = parcel.readLong();
    }
}
