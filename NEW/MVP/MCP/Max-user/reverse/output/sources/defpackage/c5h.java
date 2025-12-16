package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class c5h {
    public final byte[] a;

    public c5h(byte[] bArr) {
        this.a = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c5h) && fni.a(this.a, ((c5h) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return ho7.i("FirstFrameReady(frameByteArray=", Arrays.toString(this.a), ")");
    }
}
