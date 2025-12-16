package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;

/* compiled from: AllocatedBuffer.java */
/* renamed from: androidx.datastore.preferences.protobuf.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC22892f {
    public static C22886d i(ByteBuffer byteBuffer) {
        C22914m0.a(byteBuffer, "buffer");
        return new C22886d(byteBuffer);
    }

    public static C22889e j(int i12, int i13, byte[] bArr) {
        if (i12 < 0 || i13 < 0 || i12 + i13 > bArr.length) {
            throw new IndexOutOfBoundsException(String.format("bytes.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i12), Integer.valueOf(i13)));
        }
        return new C22889e(bArr, i12, i13);
    }

    public abstract byte[] a();

    public abstract int b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract int e();

    public abstract ByteBuffer f();

    public abstract int g();

    public abstract AbstractC22892f h(int i12);
}
