package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.U;
import j.P;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class SlowMotionData implements Metadata.Entry {
    public static final Parcelable.Creator<SlowMotionData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f345722b;

    public static final class Segment implements Parcelable {
        public static final Parcelable.Creator<Segment> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final long f345723b;

        /* renamed from: c, reason: collision with root package name */
        public final long f345724c;

        /* renamed from: d, reason: collision with root package name */
        public final int f345725d;

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
            C36585a.b(j12 < j13);
            this.f345723b = j12;
            this.f345724c = j13;
            this.f345725d = i12;
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
            return this.f345723b == segment.f345723b && this.f345724c == segment.f345724c && this.f345725d == segment.f345725d;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f345723b), Long.valueOf(this.f345724c), Integer.valueOf(this.f345725d)});
        }

        public final String toString() {
            int i12 = U.f348106a;
            Locale locale = Locale.US;
            return "Segment: startTimeMs=" + this.f345723b + ", endTimeMs=" + this.f345724c + ", speedDivisor=" + this.f345725d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i12) {
            parcel.writeLong(this.f345723b);
            parcel.writeLong(this.f345724c);
            parcel.writeInt(this.f345725d);
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
        this.f345722b = arrayList;
        boolean z12 = false;
        if (!arrayList.isEmpty()) {
            long j12 = ((Segment) arrayList.get(0)).f345724c;
            int i12 = 1;
            while (true) {
                if (i12 >= arrayList.size()) {
                    break;
                }
                if (((Segment) arrayList.get(i12)).f345723b < j12) {
                    z12 = true;
                    break;
                } else {
                    j12 = ((Segment) arrayList.get(i12)).f345724c;
                    i12++;
                }
            }
        }
        C36585a.b(!z12);
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
        return this.f345722b.equals(((SlowMotionData) obj).f345722b);
    }

    public final int hashCode() {
        return this.f345722b.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f345722b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeList(this.f345722b);
    }
}
