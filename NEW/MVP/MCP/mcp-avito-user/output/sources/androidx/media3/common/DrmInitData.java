package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import j.InterfaceC42154j;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

@androidx.media3.common.util.J
/* loaded from: classes.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final SchemeData[] f47220b;

    /* renamed from: c, reason: collision with root package name */
    public int f47221c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public final String f47222d;

    /* renamed from: e, reason: collision with root package name */
    public final int f47223e;

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

    @InterfaceC42154j
    public final DrmInitData a(@j.P String str) {
        return androidx.media3.common.util.M.a(this.f47222d, str) ? this : new DrmInitData(str, false, this.f47220b);
    }

    @Override // java.util.Comparator
    public final int compare(SchemeData schemeData, SchemeData schemeData2) {
        SchemeData schemeData3 = schemeData;
        SchemeData schemeData4 = schemeData2;
        UUID uuid = C23097k.f47666a;
        return uuid.equals(schemeData3.f47225c) ? uuid.equals(schemeData4.f47225c) ? 0 : 1 : schemeData3.f47225c.compareTo(schemeData4.f47225c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DrmInitData.class != obj.getClass()) {
            return false;
        }
        DrmInitData drmInitData = (DrmInitData) obj;
        return androidx.media3.common.util.M.a(this.f47222d, drmInitData.f47222d) && Arrays.equals(this.f47220b, drmInitData.f47220b);
    }

    public final int hashCode() {
        if (this.f47221c == 0) {
            String str = this.f47222d;
            this.f47221c = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f47220b);
        }
        return this.f47221c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f47222d);
        parcel.writeTypedArray(this.f47220b, 0);
    }

    public DrmInitData(@j.P String str, boolean z12, SchemeData... schemeDataArr) {
        this.f47222d = str;
        schemeDataArr = z12 ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.f47220b = schemeDataArr;
        this.f47223e = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public int f47224b;

        /* renamed from: c, reason: collision with root package name */
        public final UUID f47225c;

        /* renamed from: d, reason: collision with root package name */
        @j.P
        public final String f47226d;

        /* renamed from: e, reason: collision with root package name */
        public final String f47227e;

        /* renamed from: f, reason: collision with root package name */
        @j.P
        public final byte[] f47228f;

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

        public SchemeData(UUID uuid, @j.P String str, String str2, @j.P byte[] bArr) {
            uuid.getClass();
            this.f47225c = uuid;
            this.f47226d = str;
            str2.getClass();
            this.f47227e = str2;
            this.f47228f = bArr;
        }

        public final boolean a(UUID uuid) {
            UUID uuid2 = C23097k.f47666a;
            UUID uuid3 = this.f47225c;
            return uuid2.equals(uuid3) || uuid.equals(uuid3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@j.P Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            return androidx.media3.common.util.M.a(this.f47226d, schemeData.f47226d) && androidx.media3.common.util.M.a(this.f47227e, schemeData.f47227e) && androidx.media3.common.util.M.a(this.f47225c, schemeData.f47225c) && Arrays.equals(this.f47228f, schemeData.f47228f);
        }

        public final int hashCode() {
            if (this.f47224b == 0) {
                int iHashCode = this.f47225c.hashCode() * 31;
                String str = this.f47226d;
                this.f47224b = Arrays.hashCode(this.f47228f) + androidx.compose.foundation.H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f47227e);
            }
            return this.f47224b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i12) {
            UUID uuid = this.f47225c;
            parcel.writeLong(uuid.getMostSignificantBits());
            parcel.writeLong(uuid.getLeastSignificantBits());
            parcel.writeString(this.f47226d);
            parcel.writeString(this.f47227e);
            parcel.writeByteArray(this.f47228f);
        }

        public SchemeData(Parcel parcel) {
            this.f47225c = new UUID(parcel.readLong(), parcel.readLong());
            this.f47226d = parcel.readString();
            String string = parcel.readString();
            int i12 = androidx.media3.common.util.M.f47887a;
            this.f47227e = string;
            this.f47228f = parcel.createByteArray();
        }
    }

    public DrmInitData(Parcel parcel) {
        this.f47222d = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR);
        int i12 = androidx.media3.common.util.M.f47887a;
        this.f47220b = schemeDataArr;
        this.f47223e = schemeDataArr.length;
    }
}
