package com.yandex.mobile.ads.exo.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.Cif;
import com.yandex.mobile.ads.impl.db;
import com.yandex.mobile.ads.impl.pc1;
import j.P;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: classes8.dex */
public final class SlowMotionData implements Metadata.Entry {
    public static final Parcelable.Creator<SlowMotionData> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final List<Segment> f383026a;

    public static final class Segment implements Parcelable {
        public static final Parcelable.Creator<Segment> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final long f383027a;

        /* renamed from: b, reason: collision with root package name */
        public final long f383028b;

        /* renamed from: c, reason: collision with root package name */
        public final int f383029c;

        public class a implements Parcelable.Creator<Segment> {
            @Override // android.os.Parcelable.Creator
            public final Segment createFromParcel(Parcel parcel) {
                return new Segment(parcel.readInt(), parcel.readLong(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final Segment[] newArray(int i12) {
                return new Segment[i12];
            }
        }

        public Segment(int i12, long j12, long j13) {
            db.a(j12 < j13);
            this.f383027a = j12;
            this.f383028b = j13;
            this.f383029c = i12;
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
            return this.f383027a == segment.f383027a && this.f383028b == segment.f383028b && this.f383029c == segment.f383029c;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f383027a), Long.valueOf(this.f383028b), Integer.valueOf(this.f383029c)});
        }

        public final String toString() {
            long j12 = this.f383027a;
            long j13 = this.f383028b;
            int i12 = this.f383029c;
            int i13 = pc1.f388768a;
            Locale locale = Locale.US;
            StringBuilder sbQ = H.q(j12, "Segment: startTimeMs=", ", endTimeMs=");
            sbQ.append(j13);
            sbQ.append(", speedDivisor=");
            sbQ.append(i12);
            return sbQ.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i12) {
            parcel.writeLong(this.f383027a);
            parcel.writeLong(this.f383028b);
            parcel.writeInt(this.f383029c);
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
        this.f383026a = arrayList;
        db.a(!a(arrayList));
    }

    private static boolean a(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return false;
        }
        long j12 = ((Segment) arrayList.get(0)).f383028b;
        for (int i12 = 1; i12 < arrayList.size(); i12++) {
            if (((Segment) arrayList.get(i12)).f383027a < j12) {
                return true;
            }
            j12 = ((Segment) arrayList.get(i12)).f383028b;
        }
        return false;
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
        return this.f383026a.equals(((SlowMotionData) obj).f383026a);
    }

    public final int hashCode() {
        return this.f383026a.hashCode();
    }

    public final String toString() {
        StringBuilder sbA = Cif.a("SlowMotion: segments=");
        sbA.append(this.f383026a);
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeList(this.f383026a);
    }
}
