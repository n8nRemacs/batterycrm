package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class zzg {
    public static final zzg b = new zzg(1);
    public static final zzg c = new zzg(1798521807);
    public final int a;

    public zzg(int i) {
        this.a = i;
    }

    public final byte[] a() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt(this.a);
        return byteBufferAllocate.array();
    }

    public final boolean b() {
        return this.a == 1798521807;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzg) && this.a == ((zzg) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        return i != 1 ? i != 1798521807 ? (i <= -16777216 || i > -16777182) ? wy1.h("v-", Integer.toHexString(i)) : ho7.f(i - (-16777216), "draft-") : "v2" : "v1";
    }
}
