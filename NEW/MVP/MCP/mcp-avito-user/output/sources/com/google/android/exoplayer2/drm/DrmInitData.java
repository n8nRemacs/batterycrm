package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.google.android.exoplayer2.C36526i;
import com.google.android.exoplayer2.util.U;
import j.P;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* loaded from: classes6.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final SchemeData[] f344318b;

    /* renamed from: c, reason: collision with root package name */
    public int f344319c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public final String f344320d;

    /* renamed from: e, reason: collision with root package name */
    public final int f344321e;

    public class a implements Parcelable.Creator<DrmInitData> {
        @Override // android.os.Parcelable.Creator
        public final DrmInitData createFromParcel(Parcel parcel) {
            return new DrmInitData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final DrmInitData[] newArray(int i12) {
            return new DrmInitData[i12];
        }
    }

    public DrmInitData() {
        throw null;
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this(null, true, schemeDataArr);
    }

    public final DrmInitData a(@P String str) {
        return U.a(this.f344320d, str) ? this : new DrmInitData(str, false, this.f344318b);
    }

    @Override // java.util.Comparator
    public final int compare(SchemeData schemeData, SchemeData schemeData2) {
        SchemeData schemeData3 = schemeData;
        SchemeData schemeData4 = schemeData2;
        UUID uuid = C36526i.f345417a;
        return uuid.equals(schemeData3.f344323c) ? uuid.equals(schemeData4.f344323c) ? 0 : 1 : schemeData3.f344323c.compareTo(schemeData4.f344323c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DrmInitData.class != obj.getClass()) {
            return false;
        }
        DrmInitData drmInitData = (DrmInitData) obj;
        return U.a(this.f344320d, drmInitData.f344320d) && Arrays.equals(this.f344318b, drmInitData.f344318b);
    }

    public final int hashCode() {
        if (this.f344319c == 0) {
            String str = this.f344320d;
            this.f344319c = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f344318b);
        }
        return this.f344319c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f344320d);
        parcel.writeTypedArray(this.f344318b, 0);
    }

    public DrmInitData(@P String str, boolean z12, SchemeData... schemeDataArr) {
        this.f344320d = str;
        schemeDataArr = z12 ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.f344318b = schemeDataArr;
        this.f344321e = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public int f344322b;

        /* renamed from: c, reason: collision with root package name */
        public final UUID f344323c;

        /* renamed from: d, reason: collision with root package name */
        @P
        public final String f344324d;

        /* renamed from: e, reason: collision with root package name */
        public final String f344325e;

        /* renamed from: f, reason: collision with root package name */
        @P
        public final byte[] f344326f;

        public class a implements Parcelable.Creator<SchemeData> {
            @Override // android.os.Parcelable.Creator
            public final SchemeData createFromParcel(Parcel parcel) {
                return new SchemeData(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SchemeData[] newArray(int i12) {
                return new SchemeData[i12];
            }
        }

        public SchemeData(UUID uuid, @P String str, String str2, @P byte[] bArr) {
            uuid.getClass();
            this.f344323c = uuid;
            this.f344324d = str;
            str2.getClass();
            this.f344325e = str2;
            this.f344326f = bArr;
        }

        public final boolean a(UUID uuid) {
            UUID uuid2 = C36526i.f345417a;
            UUID uuid3 = this.f344323c;
            return uuid2.equals(uuid3) || uuid.equals(uuid3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@P Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            return U.a(this.f344324d, schemeData.f344324d) && U.a(this.f344325e, schemeData.f344325e) && U.a(this.f344323c, schemeData.f344323c) && Arrays.equals(this.f344326f, schemeData.f344326f);
        }

        public final int hashCode() {
            if (this.f344322b == 0) {
                int iHashCode = this.f344323c.hashCode() * 31;
                String str = this.f344324d;
                this.f344322b = Arrays.hashCode(this.f344326f) + H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f344325e);
            }
            return this.f344322b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i12) {
            UUID uuid = this.f344323c;
            parcel.writeLong(uuid.getMostSignificantBits());
            parcel.writeLong(uuid.getLeastSignificantBits());
            parcel.writeString(this.f344324d);
            parcel.writeString(this.f344325e);
            parcel.writeByteArray(this.f344326f);
        }

        public SchemeData(Parcel parcel) {
            this.f344323c = new UUID(parcel.readLong(), parcel.readLong());
            this.f344324d = parcel.readString();
            String string = parcel.readString();
            int i12 = U.f348106a;
            this.f344325e = string;
            this.f344326f = parcel.createByteArray();
        }
    }

    public DrmInitData(Parcel parcel) {
        this.f344320d = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR);
        int i12 = U.f348106a;
        this.f344318b = schemeDataArr;
        this.f344321e = schemeDataArr.length;
    }
}
