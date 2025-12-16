package com.yandex.mobile.ads.exo.drm;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.db;
import com.yandex.mobile.ads.impl.pc1;
import com.yandex.mobile.ads.impl.v2;
import com.yandex.mobile.ads.impl.xg;
import j.InterfaceC42154j;
import j.P;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* loaded from: classes8.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final SchemeData[] f382826a;

    /* renamed from: b, reason: collision with root package name */
    private int f382827b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public final String f382828c;

    /* renamed from: d, reason: collision with root package name */
    public final int f382829d;

    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private int f382830a;

        /* renamed from: b, reason: collision with root package name */
        public final UUID f382831b;

        /* renamed from: c, reason: collision with root package name */
        @P
        public final String f382832c;

        /* renamed from: d, reason: collision with root package name */
        public final String f382833d;

        /* renamed from: e, reason: collision with root package name */
        @P
        public final byte[] f382834e;

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

        public SchemeData() {
            throw null;
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
            return pc1.a(this.f382832c, schemeData.f382832c) && pc1.a(this.f382833d, schemeData.f382833d) && pc1.a(this.f382831b, schemeData.f382831b) && Arrays.equals(this.f382834e, schemeData.f382834e);
        }

        public final int hashCode() {
            if (this.f382830a == 0) {
                int iHashCode = this.f382831b.hashCode() * 31;
                String str = this.f382832c;
                this.f382830a = Arrays.hashCode(this.f382834e) + v2.a(this.f382833d, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            }
            return this.f382830a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i12) {
            parcel.writeLong(this.f382831b.getMostSignificantBits());
            parcel.writeLong(this.f382831b.getLeastSignificantBits());
            parcel.writeString(this.f382832c);
            parcel.writeString(this.f382833d);
            parcel.writeByteArray(this.f382834e);
        }

        public SchemeData(UUID uuid, @P String str, String str2, @P byte[] bArr) {
            this.f382831b = (UUID) db.a(uuid);
            this.f382832c = str;
            this.f382833d = (String) db.a(str2);
            this.f382834e = bArr;
        }

        public SchemeData(Parcel parcel) {
            this.f382831b = new UUID(parcel.readLong(), parcel.readLong());
            this.f382832c = parcel.readString();
            this.f382833d = (String) pc1.a(parcel.readString());
            this.f382834e = parcel.createByteArray();
        }
    }

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

    public DrmInitData(ArrayList arrayList) {
        this(null, false, (SchemeData[]) arrayList.toArray(new SchemeData[0]));
    }

    public final SchemeData a(int i12) {
        return this.f382826a[i12];
    }

    @Override // java.util.Comparator
    public final int compare(SchemeData schemeData, SchemeData schemeData2) {
        SchemeData schemeData3 = schemeData;
        SchemeData schemeData4 = schemeData2;
        UUID uuid = xg.f391717a;
        return uuid.equals(schemeData3.f382831b) ? uuid.equals(schemeData4.f382831b) ? 0 : 1 : schemeData3.f382831b.compareTo(schemeData4.f382831b);
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
        return pc1.a(this.f382828c, drmInitData.f382828c) && Arrays.equals(this.f382826a, drmInitData.f382826a);
    }

    public final int hashCode() {
        if (this.f382827b == 0) {
            String str = this.f382828c;
            this.f382827b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f382826a);
        }
        return this.f382827b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f382828c);
        parcel.writeTypedArray(this.f382826a, 0);
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this(null, true, schemeDataArr);
    }

    @InterfaceC42154j
    public final DrmInitData a(@P String str) {
        return pc1.a(this.f382828c, str) ? this : new DrmInitData(str, false, this.f382826a);
    }

    private DrmInitData(@P String str, boolean z12, SchemeData... schemeDataArr) {
        this.f382828c = str;
        schemeDataArr = z12 ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.f382826a = schemeDataArr;
        this.f382829d = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    public DrmInitData(Parcel parcel) {
        this.f382828c = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) pc1.a((SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR));
        this.f382826a = schemeDataArr;
        this.f382829d = schemeDataArr.length;
    }
}
