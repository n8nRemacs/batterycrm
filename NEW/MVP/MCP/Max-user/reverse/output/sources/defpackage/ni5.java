package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ni5 implements ry9 {
    public static final hf6 g;
    public static final hf6 h;
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final byte[] e;
    public int f;

    static {
        ff6 ff6Var = new ff6();
        ff6Var.m = xz9.n("application/id3");
        g = new hf6(ff6Var);
        ff6 ff6Var2 = new ff6();
        ff6Var2.m = xz9.n("application/x-scte35");
        h = new hf6(ff6Var2);
    }

    public ni5(String str, String str2, long j, long j2, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ni5.class == obj.getClass()) {
            ni5 ni5Var = (ni5) obj;
            if (this.c == ni5Var.c && this.d == ni5Var.d && Objects.equals(this.a, ni5Var.a) && Objects.equals(this.b, ni5Var.b) && Arrays.equals(this.e, ni5Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f == 0) {
            String str = this.a;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j = this.c;
            int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.d;
            this.f = Arrays.hashCode(this.e) + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.f;
    }

    @Override // defpackage.ry9
    public final hf6 l() {
        String str = this.a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return g;
            default:
                return null;
        }
    }

    @Override // defpackage.ry9
    public final byte[] o() {
        if (l() != null) {
            return this.e;
        }
        return null;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.a + ", id=" + this.d + ", durationMs=" + this.c + ", value=" + this.b;
    }
}
