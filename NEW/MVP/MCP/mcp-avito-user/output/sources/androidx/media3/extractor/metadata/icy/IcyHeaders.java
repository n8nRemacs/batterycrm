package androidx.media3.extractor.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.B;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import j.P;

@J
/* loaded from: classes.dex */
public final class IcyHeaders implements Metadata.Entry {
    public static final Parcelable.Creator<IcyHeaders> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f50644b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public final String f50645c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public final String f50646d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public final String f50647e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f50648f;

    /* renamed from: g, reason: collision with root package name */
    public final int f50649g;

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
        C23110a.b(i13 == -1 || i13 > 0);
        this.f50644b = i12;
        this.f50645c = str;
        this.f50646d = str2;
        this.f50647e = str3;
        this.f50648f = z12;
        this.f50649g = i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.media3.extractor.metadata.icy.IcyHeaders a(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) throws java.lang.NumberFormatException {
        /*
            java.lang.String r0 = "icy-br"
            java.lang.Object r0 = r11.get(r0)
            java.util.List r0 = (java.util.List) r0
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 == 0) goto L2b
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L24
            int r0 = r0 * 1000
            if (r0 <= 0) goto L1d
            r4 = r1
            goto L22
        L1d:
            androidx.media3.common.util.s.g()     // Catch: java.lang.NumberFormatException -> L25
            r4 = r2
            r0 = r3
        L22:
            r5 = r0
            goto L2d
        L24:
            r0 = r3
        L25:
            androidx.media3.common.util.s.g()
            r5 = r0
            r4 = r2
            goto L2d
        L2b:
            r4 = r2
            r5 = r3
        L2d:
            java.lang.String r0 = "icy-genre"
            java.lang.Object r0 = r11.get(r0)
            java.util.List r0 = (java.util.List) r0
            r6 = 0
            if (r0 == 0) goto L40
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            r4 = r1
            goto L41
        L40:
            r0 = r6
        L41:
            java.lang.String r7 = "icy-name"
            java.lang.Object r7 = r11.get(r7)
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L54
            java.lang.Object r4 = r7.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            r7 = r4
            r4 = r1
            goto L55
        L54:
            r7 = r6
        L55:
            java.lang.String r8 = "icy-url"
            java.lang.Object r8 = r11.get(r8)
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L68
            java.lang.Object r4 = r8.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            r8 = r4
            r4 = r1
            goto L69
        L68:
            r8 = r6
        L69:
            java.lang.String r9 = "icy-pub"
            java.lang.Object r9 = r11.get(r9)
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto L82
            java.lang.Object r4 = r9.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r9 = "1"
            boolean r4 = r4.equals(r9)
            r9 = r4
            r4 = r1
            goto L83
        L82:
            r9 = r2
        L83:
            java.lang.String r10 = "icy-metaint"
            java.lang.Object r11 = r11.get(r10)
            java.util.List r11 = (java.util.List) r11
            if (r11 == 0) goto La0
            java.lang.Object r11 = r11.get(r2)
            java.lang.String r11 = (java.lang.String) r11
            int r11 = java.lang.Integer.parseInt(r11)     // Catch: java.lang.NumberFormatException -> La3
            if (r11 <= 0) goto L9b
            r3 = r11
            goto L9f
        L9b:
            androidx.media3.common.util.s.g()     // Catch: java.lang.NumberFormatException -> La2
            r1 = r4
        L9f:
            r4 = r1
        La0:
            r10 = r3
            goto La7
        La2:
            r3 = r11
        La3:
            androidx.media3.common.util.s.g()
            goto La0
        La7:
            if (r4 == 0) goto Lb1
            androidx.media3.extractor.metadata.icy.IcyHeaders r11 = new androidx.media3.extractor.metadata.icy.IcyHeaders
            r4 = r11
            r6 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r6 = r11
        Lb1:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.metadata.icy.IcyHeaders.a(java.util.Map):androidx.media3.extractor.metadata.icy.IcyHeaders");
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final void J5(B.b bVar) {
        String str = this.f50646d;
        if (str != null) {
            bVar.f47183E = str;
        }
        String str2 = this.f50645c;
        if (str2 != null) {
            bVar.f47181C = str2;
        }
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
        return this.f50644b == icyHeaders.f50644b && M.a(this.f50645c, icyHeaders.f50645c) && M.a(this.f50646d, icyHeaders.f50646d) && M.a(this.f50647e, icyHeaders.f50647e) && this.f50648f == icyHeaders.f50648f && this.f50649g == icyHeaders.f50649g;
    }

    public final int hashCode() {
        int i12 = (527 + this.f50644b) * 31;
        String str = this.f50645c;
        int iHashCode = (i12 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f50646d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f50647e;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f50648f ? 1 : 0)) * 31) + this.f50649g;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f50646d + "\", genre=\"" + this.f50645c + "\", bitrate=" + this.f50644b + ", metadataInterval=" + this.f50649g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeInt(this.f50644b);
        parcel.writeString(this.f50645c);
        parcel.writeString(this.f50646d);
        parcel.writeString(this.f50647e);
        int i13 = M.f47887a;
        parcel.writeInt(this.f50648f ? 1 : 0);
        parcel.writeInt(this.f50649g);
    }

    public IcyHeaders(Parcel parcel) {
        this.f50644b = parcel.readInt();
        this.f50645c = parcel.readString();
        this.f50646d = parcel.readString();
        this.f50647e = parcel.readString();
        int i12 = M.f47887a;
        this.f50648f = parcel.readInt() != 0;
        this.f50649g = parcel.readInt();
    }
}
