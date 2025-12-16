package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.protobuf.d;

/* compiled from: BoundedByteString.java */
/* loaded from: classes8.dex */
class c extends n {

    /* compiled from: BoundedByteString.java */
    public class b implements d.a {

        /* renamed from: b, reason: collision with root package name */
        public int f409329b;

        /* renamed from: c, reason: collision with root package name */
        public final int f409330c;

        public b(a aVar) {
            c.this.getClass();
            this.f409329b = 0;
            this.f409330c = 0;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f409329b < this.f409330c;
        }

        @Override // java.util.Iterator
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.d.a
        public final byte nextByte() {
            int i12 = this.f409329b;
            if (i12 >= this.f409330c) {
                throw new NoSuchElementException();
            }
            byte[] bArr = c.this.f409380c;
            this.f409329b = i12 + 1;
            return bArr[i12];
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public final byte D(int i12) {
        if (i12 < 0) {
            StringBuilder sb2 = new StringBuilder(28);
            sb2.append("Index too small: ");
            sb2.append(i12);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        if (i12 < 0) {
            return this.f409380c[i12];
        }
        StringBuilder sb3 = new StringBuilder(41);
        sb3.append("Index too large: ");
        sb3.append(i12);
        sb3.append(", 0");
        throw new ArrayIndexOutOfBoundsException(sb3.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public final int I() {
        return 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n, kotlin.reflect.jvm.internal.impl.protobuf.d
    public final void g(byte[] bArr, int i12, int i13, int i14) {
        System.arraycopy(this.f409380c, i12, bArr, i13, i14);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n, kotlin.reflect.jvm.internal.impl.protobuf.d, java.lang.Iterable
    /* renamed from: l */
    public final d.a iterator() {
        return new b(null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n, kotlin.reflect.jvm.internal.impl.protobuf.d
    public final int size() {
        return 0;
    }
}
