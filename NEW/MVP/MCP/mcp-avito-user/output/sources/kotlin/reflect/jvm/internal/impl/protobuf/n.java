package kotlin.reflect.jvm.internal.impl.protobuf;

import com.adjust.sdk.Constants;
import java.io.IOException;
import java.io.OutputStream;
import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.protobuf.d;

/* compiled from: LiteralByteString.java */
/* loaded from: classes8.dex */
class n extends d {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f409380c;

    /* renamed from: d, reason: collision with root package name */
    public int f409381d = 0;

    /* compiled from: LiteralByteString.java */
    public class b implements d.a {

        /* renamed from: b, reason: collision with root package name */
        public int f409382b = 0;

        /* renamed from: c, reason: collision with root package name */
        public final int f409383c;

        public b(a aVar) {
            this.f409383c = n.this.size();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f409382b < this.f409383c;
        }

        @Override // java.util.Iterator
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.d.a
        public final byte nextByte() {
            try {
                byte[] bArr = n.this.f409380c;
                int i12 = this.f409382b;
                this.f409382b = i12 + 1;
                return bArr[i12];
            } catch (ArrayIndexOutOfBoundsException e12) {
                throw new NoSuchElementException(e12.getMessage());
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public n(byte[] bArr) {
        this.f409380c = bArr;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public final void C(OutputStream outputStream, int i12, int i13) throws IOException {
        outputStream.write(this.f409380c, I() + i12, i13);
    }

    public byte D(int i12) {
        return this.f409380c[i12];
    }

    public final boolean E(n nVar, int i12, int i13) {
        if (i13 > nVar.size()) {
            int size = size();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(i13);
            sb2.append(size);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i12 + i13 <= nVar.size()) {
            int I12 = I() + i13;
            int I13 = I();
            int I14 = nVar.I() + i12;
            while (I13 < I12) {
                if (this.f409380c[I13] != nVar.f409380c[I14]) {
                    return false;
                }
                I13++;
                I14++;
            }
            return true;
        }
        int size2 = nVar.size();
        StringBuilder sb3 = new StringBuilder(59);
        sb3.append("Ran off end of other: ");
        sb3.append(i12);
        sb3.append(", ");
        sb3.append(i13);
        sb3.append(", ");
        sb3.append(size2);
        throw new IllegalArgumentException(sb3.toString());
    }

    public int I() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d) || size() != ((d) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof n) {
            return E((n) obj, 0, size());
        }
        if (obj instanceof s) {
            return obj.equals(this);
        }
        String strValueOf = String.valueOf(obj.getClass());
        throw new IllegalArgumentException(AK.c.s(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public void g(byte[] bArr, int i12, int i13, int i14) {
        System.arraycopy(this.f409380c, i12, bArr, i13, i14);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public final int h() {
        return 0;
    }

    public final int hashCode() {
        int iS2 = this.f409381d;
        if (iS2 == 0) {
            int size = size();
            iS2 = s(size, 0, size);
            if (iS2 == 0) {
                iS2 = 1;
            }
            this.f409381d = iS2;
        }
        return iS2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public final boolean i() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public final boolean j() {
        int I12 = I();
        return w.c(this.f409380c, I12, size() + I12) == 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d, java.lang.Iterable
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public d.a iterator() {
        return new b(null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public final int s(int i12, int i13, int i14) {
        int I12 = I() + i13;
        for (int i15 = I12; i15 < I12 + i14; i15++) {
            i12 = (i12 * 31) + this.f409380c[i15];
        }
        return i12;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public int size() {
        return this.f409380c.length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if (r9[r0] > (-65)) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
    
        r0 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0052, code lost:
    
        if (r9[r0] > (-65)) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x009a, code lost:
    
        if (r9[r8] > (-65)) goto L14;
     */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int t(int r8, int r9, int r10) {
        /*
            r7 = this;
            int r0 = r7.I()
            int r0 = r0 + r9
            int r10 = r10 + r0
            byte[] r9 = r7.f409380c
            if (r8 == 0) goto L9d
            if (r0 < r10) goto Le
            goto La1
        Le:
            byte r1 = (byte) r8
            r2 = -65
            r3 = -1
            r4 = -32
            if (r1 >= r4) goto L27
            r8 = -62
            if (r1 < r8) goto L24
            int r8 = r0 + 1
            r0 = r9[r0]
            if (r0 <= r2) goto L21
            goto L24
        L21:
            r0 = r8
            goto L9d
        L24:
            r8 = r3
            goto La1
        L27:
            r5 = -16
            if (r1 >= r5) goto L55
            int r8 = r8 >> 8
            int r8 = ~r8
            byte r8 = (byte) r8
            if (r8 != 0) goto L40
            int r8 = r0 + 1
            r0 = r9[r0]
            if (r8 < r10) goto L3d
            int r8 = kotlin.reflect.jvm.internal.impl.protobuf.w.a(r1, r0)
            goto La1
        L3d:
            r6 = r0
            r0 = r8
            r8 = r6
        L40:
            if (r8 > r2) goto L24
            r5 = -96
            if (r1 != r4) goto L48
            if (r8 < r5) goto L24
        L48:
            r4 = -19
            if (r1 != r4) goto L4e
            if (r8 >= r5) goto L24
        L4e:
            int r8 = r0 + 1
            r0 = r9[r0]
            if (r0 <= r2) goto L21
            goto L24
        L55:
            int r4 = r8 >> 8
            int r4 = ~r4
            byte r4 = (byte) r4
            if (r4 != 0) goto L68
            int r8 = r0 + 1
            r4 = r9[r0]
            if (r8 < r10) goto L66
            int r8 = kotlin.reflect.jvm.internal.impl.protobuf.w.a(r1, r4)
            goto La1
        L66:
            r0 = 0
            goto L6e
        L68:
            int r8 = r8 >> 16
            byte r8 = (byte) r8
            r6 = r0
            r0 = r8
            r8 = r6
        L6e:
            if (r0 != 0) goto L89
            int r0 = r8 + 1
            r8 = r9[r8]
            if (r0 < r10) goto L86
            r9 = -12
            if (r1 > r9) goto L24
            if (r4 > r2) goto L24
            if (r8 <= r2) goto L7f
            goto L24
        L7f:
            int r9 = r4 << 8
            r9 = r9 ^ r1
            int r8 = r8 << 16
            r8 = r8 ^ r9
            goto La1
        L86:
            r6 = r0
            r0 = r8
            r8 = r6
        L89:
            if (r4 > r2) goto L24
            int r1 = r1 << 28
            int r4 = r4 + 112
            int r4 = r4 + r1
            int r1 = r4 >> 30
            if (r1 != 0) goto L24
            if (r0 > r2) goto L24
            int r0 = r8 + 1
            r8 = r9[r8]
            if (r8 <= r2) goto L9d
            goto L24
        L9d:
            int r8 = kotlin.reflect.jvm.internal.impl.protobuf.w.c(r9, r0, r10)
        La1:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.n.t(int, int, int):int");
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public final int v() {
        return this.f409381d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public final String w() {
        return new String(this.f409380c, I(), size(), Constants.ENCODING);
    }
}
