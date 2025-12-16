package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.P;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.U;
import j.P;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class IcyHeaders implements Metadata.Entry {
    public static final Parcelable.Creator<IcyHeaders> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f345658b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public final String f345659c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public final String f345660d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public final String f345661e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f345662f;

    /* renamed from: g, reason: collision with root package name */
    public final int f345663g;

    public class a implements Parcelable.Creator<IcyHeaders> {
        @Override // android.os.Parcelable.Creator
        public final IcyHeaders createFromParcel(Parcel parcel) {
            return new IcyHeaders(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final IcyHeaders[] newArray(int i12) {
            return new IcyHeaders[i12];
        }
    }

    public IcyHeaders(int i12, @P String str, @P String str2, @P String str3, boolean z12, int i13) {
        C36585a.b(i13 == -1 || i13 > 0);
        this.f345658b = i12;
        this.f345659c = str;
        this.f345660d = str2;
        this.f345661e = str3;
        this.f345662f = z12;
        this.f345663g = i13;
    }

    @P
    public static IcyHeaders a(Map<String, List<String>> map) throws NumberFormatException {
        boolean z12;
        int i12;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        List<String> list = map.get("icy-br");
        boolean z13 = true;
        int i13 = -1;
        if (list != null) {
            try {
                int i14 = Integer.parseInt(list.get(0)) * 1000;
                if (i14 > 0) {
                    z12 = true;
                } else {
                    z12 = false;
                    i14 = -1;
                }
                i12 = i14;
            } catch (NumberFormatException unused) {
            }
        } else {
            z12 = false;
            i12 = -1;
        }
        List<String> list2 = map.get("icy-genre");
        if (list2 != null) {
            str = list2.get(0);
            z12 = true;
        } else {
            str = null;
        }
        List<String> list3 = map.get("icy-name");
        if (list3 != null) {
            str2 = list3.get(0);
            z12 = true;
        } else {
            str2 = null;
        }
        List<String> list4 = map.get("icy-url");
        if (list4 != null) {
            str3 = list4.get(0);
            z12 = true;
        } else {
            str3 = null;
        }
        List<String> list5 = map.get("icy-pub");
        if (list5 != null) {
            zEquals = list5.get(0).equals("1");
            z12 = true;
        } else {
            zEquals = false;
        }
        List<String> list6 = map.get("icy-metaint");
        if (list6 != null) {
            try {
                int i15 = Integer.parseInt(list6.get(0));
                if (i15 > 0) {
                    i13 = i15;
                } else {
                    z13 = z12;
                }
                z12 = z13;
            } catch (NumberFormatException unused2) {
            }
        }
        int i16 = i13;
        if (z12) {
            return new IcyHeaders(i12, str, str2, str3, zEquals, i16);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyHeaders.class != obj.getClass()) {
            return false;
        }
        IcyHeaders icyHeaders = (IcyHeaders) obj;
        return this.f345658b == icyHeaders.f345658b && U.a(this.f345659c, icyHeaders.f345659c) && U.a(this.f345660d, icyHeaders.f345660d) && U.a(this.f345661e, icyHeaders.f345661e) && this.f345662f == icyHeaders.f345662f && this.f345663g == icyHeaders.f345663g;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void f4(P.b bVar) {
        String str = this.f345660d;
        if (str != null) {
            bVar.f343638D = str;
        }
        String str2 = this.f345659c;
        if (str2 != null) {
            bVar.f343636B = str2;
        }
    }

    public final int hashCode() {
        int i12 = (527 + this.f345658b) * 31;
        String str = this.f345659c;
        int iHashCode = (i12 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f345660d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f345661e;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f345662f ? 1 : 0)) * 31) + this.f345663g;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f345660d + "\", genre=\"" + this.f345659c + "\", bitrate=" + this.f345658b + ", metadataInterval=" + this.f345663g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeInt(this.f345658b);
        parcel.writeString(this.f345659c);
        parcel.writeString(this.f345660d);
        parcel.writeString(this.f345661e);
        int i13 = U.f348106a;
        parcel.writeInt(this.f345662f ? 1 : 0);
        parcel.writeInt(this.f345663g);
    }

    public IcyHeaders(Parcel parcel) {
        this.f345658b = parcel.readInt();
        this.f345659c = parcel.readString();
        this.f345660d = parcel.readString();
        this.f345661e = parcel.readString();
        int i12 = U.f348106a;
        this.f345662f = parcel.readInt() != 0;
        this.f345663g = parcel.readInt();
    }
}
