package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class pa0 extends ig8 {
    public final long a;
    public final Integer b;
    public final long c;
    public final byte[] d;
    public final String e;
    public final long f;
    public final cea g;

    public pa0(long j, Integer num, long j2, byte[] bArr, String str, long j3, cea ceaVar) {
        this.a = j;
        this.b = num;
        this.c = j2;
        this.d = bArr;
        this.e = str;
        this.f = j3;
        this.g = ceaVar;
    }

    public final boolean equals(Object obj) {
        Integer num;
        String str;
        cea ceaVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ig8) {
            ig8 ig8Var = (ig8) obj;
            if (this.a == ((pa0) ig8Var).a && ((num = this.b) != null ? num.equals(((pa0) ig8Var).b) : ((pa0) ig8Var).b == null)) {
                pa0 pa0Var = (pa0) ig8Var;
                cea ceaVar2 = pa0Var.g;
                String str2 = pa0Var.e;
                if (this.c == pa0Var.c) {
                    if (Arrays.equals(this.d, ig8Var instanceof pa0 ? ((pa0) ig8Var).d : pa0Var.d) && ((str = this.e) != null ? str.equals(str2) : str2 == null) && this.f == pa0Var.f && ((ceaVar = this.g) != null ? ceaVar.equals(ceaVar2) : ceaVar2 == null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j2 = this.c;
        int iHashCode2 = (((iHashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.f;
        int i2 = (iHashCode3 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        cea ceaVar = this.g;
        return i2 ^ (ceaVar != null ? ceaVar.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", eventUptimeMs=" + this.c + ", sourceExtension=" + Arrays.toString(this.d) + ", sourceExtensionJsonProto3=" + this.e + ", timezoneOffsetSeconds=" + this.f + ", networkConnectionInfo=" + this.g + "}";
    }
}
