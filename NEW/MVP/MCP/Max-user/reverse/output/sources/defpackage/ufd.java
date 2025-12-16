package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ufd implements wfd {
    public final long a;
    public final byte[] b;

    public ufd(long j, byte[] bArr) {
        this.a = j;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ufd)) {
            return false;
        }
        ufd ufdVar = (ufd) obj;
        return this.a == ufdVar.a && fni.a(this.b, ufdVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sbN = ho7.n("AudioMsg(duration=", this.a, ", wave=", Arrays.toString(this.b));
        sbN.append(")");
        return sbN.toString();
    }
}
