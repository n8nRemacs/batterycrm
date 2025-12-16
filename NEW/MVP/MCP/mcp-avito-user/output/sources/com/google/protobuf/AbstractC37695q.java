package com.google.protobuf;

import java.nio.ByteBuffer;

/* compiled from: BufferAllocator.java */
@InterfaceC37706w
/* renamed from: com.google.protobuf.q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
abstract class AbstractC37695q {

    /* compiled from: BufferAllocator.java */
    /* renamed from: com.google.protobuf.q$a */
    public class a extends AbstractC37695q {
        @Override // com.google.protobuf.AbstractC37695q
        public final C37669d a(int i12) {
            return AbstractC37673f.i(ByteBuffer.allocateDirect(i12));
        }

        @Override // com.google.protobuf.AbstractC37695q
        public final C37671e b(int i12) {
            return new C37671e(new byte[i12], 0, i12);
        }
    }

    static {
        new a();
    }

    public abstract C37669d a(int i12);

    public abstract C37671e b(int i12);
}
