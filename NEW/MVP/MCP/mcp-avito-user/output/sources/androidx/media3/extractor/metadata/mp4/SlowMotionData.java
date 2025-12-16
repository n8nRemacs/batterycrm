package androidx.media3.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import j.P;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

@J
/* loaded from: classes.dex */
public final class SlowMotionData implements Metadata.Entry {
    public static final Parcelable.Creator<SlowMotionData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f50704b;

    public static final class Segment implements Parcelable {
        public static final Parcelable.Creator<Segment> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final long f50705b;

        /* renamed from: c, reason: collision with root package name */
        public final long f50706c;

        /* renamed from: d, reason: collision with root package name */
        public final int f50707d;

        public class a implements Parcelable.Creator<Segment> {
            @Override // android.os.Parcelable.Creator
            public final Segment createFromParcel(Parcel parcel) {
                return new Segment(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Segment[] newArray(int i12) {
                return new Segment[i12];
            }
        }

        public Segment(long j12, long j13, int i12) {
            C23110a.b(j12 < j13);
            this.f50705b = j12;
            this.f50706c = j13;
            this.f50707d = i12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Segment.class != obj.getClass()) {
                return false;
            }
            Segment segment = (Segment) obj;
            return this.f50705b == segment.f50705b && this.f50706c == segment.f50706c && this.f50707d == segment.f50707d;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f50705b), Long.valueOf(this.f50706c), Integer.valueOf(this.f50707d)});
        }

        public final String toString() {
            int i12 = M.f47887a;
            Locale locale = Locale.US;
            return "Segment: startTimeMs=" + this.f50705b + ", endTimeMs=" + this.f50706c + ", speedDivisor=" + this.f50707d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i12) {
            parcel.writeLong(this.f50705b);
            parcel.writeLong(this.f50706c);
            parcel.writeInt(this.f50707d);
        }
    }

    public class a implements Parcelable.Creator<SlowMotionData> {
        @Override // android.os.Parcelable.Creator
        public final SlowMotionData createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, Segment.class.getClassLoader());
            return new SlowMotionData(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SlowMotionData[] newArray(int i12) {
            return new SlowMotionData[i12];
        }
    }

    public SlowMotionData(ArrayList arrayList) {
        this.f50704b = arrayList;
        boolean z12 = false;
        if (!arrayList.isEmpty()) {
            long j12 = ((Segment) arrayList.get(0)).f50706c;
            int i12 = 1;
            while (true) {
                if (i12 >= arrayList.size()) {
                    break;
                }
                if (((Segment) arrayList.get(i12)).f50705b < j12) {
                    z12 = true;
                    break;
                } else {
                    j12 = ((Segment) arrayList.get(i12)).f50706c;
                    i12++;
                }
            }
        }
        C23110a.b(!z12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SlowMotionData.class != obj.getClass()) {
            return false;
        }
        return this.f50704b.equals(((SlowMotionData) obj).f50704b);
    }

    public final int hashCode() {
        return this.f50704b.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f50704b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeList(this.f50704b);
    }
}
