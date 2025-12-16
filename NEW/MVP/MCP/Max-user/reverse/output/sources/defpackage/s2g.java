package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class s2g {
    public final long a;
    public final usb b;
    public final c3g c;
    public final int d;
    public final long e;
    public final int f;
    public final byte[] g;
    public final long h;

    public s2g(long j, usb usbVar, c3g c3gVar, int i, long j2, int i2, byte[] bArr, long j3) {
        this.a = j;
        this.b = usbVar;
        this.c = c3gVar;
        this.d = i;
        this.e = j2;
        this.f = i2;
        this.g = bArr;
        this.h = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2g)) {
            return false;
        }
        s2g s2gVar = (s2g) obj;
        return this.a == s2gVar.a && this.b == s2gVar.b && this.c == s2gVar.c && this.d == s2gVar.d && this.e == s2gVar.e && this.f == s2gVar.f && fni.a(this.g, s2gVar.g) && this.h == s2gVar.h;
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + ((Arrays.hashCode(this.g) + xrf.k(this.f, a9h.a(xrf.k(this.d, (this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31)) * 31, 31), 31, this.e), 31)) * 31);
    }

    public final String toString() {
        String string = Arrays.toString(this.g);
        StringBuilder sb = new StringBuilder("TaskEntity(id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", status=");
        sb.append(this.c);
        sb.append(", failsCount=");
        sb.append(this.d);
        az1.r(this.e, ", dependsRequestId=", ", dependencyType=", sb);
        sb.append(this.f);
        sb.append(", data=");
        sb.append(string);
        sb.append(", createdTime=");
        return ho7.k(sb, this.h, ")");
    }
}
