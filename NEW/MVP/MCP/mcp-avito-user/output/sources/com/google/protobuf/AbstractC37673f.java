package com.google.protobuf;

import java.nio.ByteBuffer;

/* compiled from: AllocatedBuffer.java */
@InterfaceC37706w
/* renamed from: com.google.protobuf.f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
abstract class AbstractC37673f {
    public static C37669d i(ByteBuffer byteBuffer) {
        C37670d0.a(byteBuffer, "buffer");
        return new C37669d(byteBuffer);
    }

    public static C37671e j(int i12, int i13, byte[] bArr) {
        if (i12 < 0 || i13 < 0 || i12 + i13 > bArr.length) {
            throw new IndexOutOfBoundsException(String.format("bytes.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i12), Integer.valueOf(i13)));
        }
        return new C37671e(bArr, i12, i13);
    }

    public abstract byte[] a();

    public abstract int b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract int e();

    public abstract ByteBuffer f();

    public abstract int g();

    @InterfaceC37704v
    public abstract AbstractC37673f h(int i12);
}
