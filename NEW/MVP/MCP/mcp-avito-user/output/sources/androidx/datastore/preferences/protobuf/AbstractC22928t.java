package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;

/* compiled from: BufferAllocator.java */
/* renamed from: androidx.datastore.preferences.protobuf.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC22928t {

    /* compiled from: BufferAllocator.java */
    /* renamed from: androidx.datastore.preferences.protobuf.t$a */
    public static class a extends AbstractC22928t {
        @Override // androidx.datastore.preferences.protobuf.AbstractC22928t
        public final C22886d a(int i12) {
            return AbstractC22892f.i(ByteBuffer.allocateDirect(i12));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22928t
        public final C22889e b(int i12) {
            return new C22889e(new byte[i12], 0, i12);
        }
    }

    static {
        new a();
    }

    public abstract C22886d a(int i12);

    public abstract C22889e b(int i12);
}
