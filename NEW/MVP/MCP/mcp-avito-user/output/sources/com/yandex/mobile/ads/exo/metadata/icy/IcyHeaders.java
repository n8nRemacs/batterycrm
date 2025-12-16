package com.yandex.mobile.ads.exo.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.Cif;
import com.yandex.mobile.ads.impl.ad0;
import com.yandex.mobile.ads.impl.db;
import com.yandex.mobile.ads.impl.pc1;
import j.P;

/* loaded from: classes8.dex */
public final class IcyHeaders implements Metadata.Entry {
    public static final Parcelable.Creator<IcyHeaders> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f382970a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public final String f382971b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public final String f382972c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public final String f382973d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f382974e;

    /* renamed from: f, reason: collision with root package name */
    public final int f382975f;

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
        db.a(i13 == -1 || i13 > 0);
        this.f382970a = i12;
        this.f382971b = str;
        this.f382972c = str2;
        this.f382973d = str3;
        this.f382974e = z12;
        this.f382975f = i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc A[PHI: r6
  0x00bc: PHI (r6v1 int) = (r6v0 int), (r6v2 int), (r6v0 int) binds: [B:31:0x009d, B:39:0x00c0, B:36:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.yandex.mobile.ads.exo.metadata.icy.IcyHeaders a(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r15) throws java.lang.NumberFormatException {
        /*
            java.lang.String r0 = "Invalid metadata interval: "
            java.lang.String r1 = "Invalid bitrate: "
            java.lang.String r2 = "icy-br"
            java.lang.Object r2 = r15.get(r2)
            java.util.List r2 = (java.util.List) r2
            java.lang.String r3 = "IcyHeaders"
            r4 = 1
            r5 = 0
            r6 = -1
            if (r2 == 0) goto L33
            java.lang.Object r2 = r2.get(r5)
            java.lang.String r2 = (java.lang.String) r2
            int r7 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L36
            int r7 = r7 * 1000
            if (r7 <= 0) goto L24
            r1 = r4
        L22:
            r9 = r7
            goto L3e
        L24:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L37
            r8.<init>(r1)     // Catch: java.lang.NumberFormatException -> L37
            r8.append(r2)     // Catch: java.lang.NumberFormatException -> L37
            java.lang.String r1 = r8.toString()     // Catch: java.lang.NumberFormatException -> L37
            com.yandex.mobile.ads.impl.ka0.d(r3, r1)     // Catch: java.lang.NumberFormatException -> L37
        L33:
            r1 = r5
            r9 = r6
            goto L3e
        L36:
            r7 = r6
        L37:
            java.lang.String r1 = "Invalid bitrate header: "
            com.yandex.mobile.ads.impl.yk1.a(r1, r2, r3)
            r1 = r5
            goto L22
        L3e:
            java.lang.String r2 = "icy-genre"
            java.lang.Object r2 = r15.get(r2)
            java.util.List r2 = (java.util.List) r2
            r7 = 0
            if (r2 == 0) goto L52
            java.lang.Object r1 = r2.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r10 = r1
            r1 = r4
            goto L53
        L52:
            r10 = r7
        L53:
            java.lang.String r2 = "icy-name"
            java.lang.Object r2 = r15.get(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L66
            java.lang.Object r1 = r2.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r11 = r1
            r1 = r4
            goto L67
        L66:
            r11 = r7
        L67:
            java.lang.String r2 = "icy-url"
            java.lang.Object r2 = r15.get(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L7a
            java.lang.Object r1 = r2.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r12 = r1
            r1 = r4
            goto L7b
        L7a:
            r12 = r7
        L7b:
            java.lang.String r2 = "icy-pub"
            java.lang.Object r2 = r15.get(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L94
            java.lang.Object r1 = r2.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "1"
            boolean r1 = r1.equals(r2)
            r13 = r1
            r1 = r4
            goto L95
        L94:
            r13 = r5
        L95:
            java.lang.String r2 = "icy-metaint"
            java.lang.Object r15 = r15.get(r2)
            java.util.List r15 = (java.util.List) r15
            if (r15 == 0) goto Lbc
            java.lang.Object r15 = r15.get(r5)
            java.lang.String r15 = (java.lang.String) r15
            int r2 = java.lang.Integer.parseInt(r15)     // Catch: java.lang.NumberFormatException -> Lc0
            if (r2 <= 0) goto Lad
            r14 = r2
            goto Lc4
        Lad:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> Lbf
            r4.<init>(r0)     // Catch: java.lang.NumberFormatException -> Lbf
            r4.append(r15)     // Catch: java.lang.NumberFormatException -> Lbf
            java.lang.String r4 = r4.toString()     // Catch: java.lang.NumberFormatException -> Lbf
            com.yandex.mobile.ads.impl.ka0.d(r3, r4)     // Catch: java.lang.NumberFormatException -> Lbf
        Lbc:
            r4 = r1
            r14 = r6
            goto Lc4
        Lbf:
            r6 = r2
        Lc0:
            com.yandex.mobile.ads.impl.yk1.a(r0, r15, r3)
            goto Lbc
        Lc4:
            if (r4 == 0) goto Lcc
            com.yandex.mobile.ads.exo.metadata.icy.IcyHeaders r7 = new com.yandex.mobile.ads.exo.metadata.icy.IcyHeaders
            r8 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14)
        Lcc:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.metadata.icy.IcyHeaders.a(java.util.Map):com.yandex.mobile.ads.exo.metadata.icy.IcyHeaders");
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
        return this.f382970a == icyHeaders.f382970a && pc1.a(this.f382971b, icyHeaders.f382971b) && pc1.a(this.f382972c, icyHeaders.f382972c) && pc1.a(this.f382973d, icyHeaders.f382973d) && this.f382974e == icyHeaders.f382974e && this.f382975f == icyHeaders.f382975f;
    }

    public final int hashCode() {
        int i12 = (this.f382970a + 527) * 31;
        String str = this.f382971b;
        int iHashCode = (i12 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f382972c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f382973d;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f382974e ? 1 : 0)) * 31) + this.f382975f;
    }

    public final String toString() {
        StringBuilder sbA = Cif.a("IcyHeaders: name=\"");
        sbA.append(this.f382972c);
        sbA.append("\", genre=\"");
        sbA.append(this.f382971b);
        sbA.append("\", bitrate=");
        sbA.append(this.f382970a);
        sbA.append(", metadataInterval=");
        sbA.append(this.f382975f);
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeInt(this.f382970a);
        parcel.writeString(this.f382971b);
        parcel.writeString(this.f382972c);
        parcel.writeString(this.f382973d);
        boolean z12 = this.f382974e;
        int i13 = pc1.f388768a;
        parcel.writeInt(z12 ? 1 : 0);
        parcel.writeInt(this.f382975f);
    }

    public IcyHeaders(Parcel parcel) {
        this.f382970a = parcel.readInt();
        this.f382971b = parcel.readString();
        this.f382972c = parcel.readString();
        this.f382973d = parcel.readString();
        this.f382974e = pc1.a(parcel);
        this.f382975f = parcel.readInt();
    }

    @Override // com.yandex.mobile.ads.exo.metadata.Metadata.Entry
    public final void a(ad0.a aVar) {
        String str = this.f382972c;
        if (str != null) {
            aVar.j(str);
        }
        String str2 = this.f382971b;
        if (str2 != null) {
            aVar.i(str2);
        }
    }
}
