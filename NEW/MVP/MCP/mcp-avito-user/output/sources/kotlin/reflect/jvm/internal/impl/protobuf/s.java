package kotlin.reflect.jvm.internal.impl.protobuf;

import com.adjust.sdk.Constants;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;
import kotlin.reflect.jvm.internal.impl.protobuf.d;

/* compiled from: RopeByteString.java */
/* loaded from: classes8.dex */
class s extends kotlin.reflect.jvm.internal.impl.protobuf.d {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f409385i;

    /* renamed from: c, reason: collision with root package name */
    public final int f409386c;

    /* renamed from: d, reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.protobuf.d f409387d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.protobuf.d f409388e;

    /* renamed from: f, reason: collision with root package name */
    public final int f409389f;

    /* renamed from: g, reason: collision with root package name */
    public final int f409390g;

    /* renamed from: h, reason: collision with root package name */
    public int f409391h;

    /* compiled from: RopeByteString.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Stack<kotlin.reflect.jvm.internal.impl.protobuf.d> f409392a;

        public b() {
            this.f409392a = new Stack<>();
        }

        public final void a(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
            if (!dVar.i()) {
                if (!(dVar instanceof s)) {
                    String strValueOf = String.valueOf(dVar.getClass());
                    throw new IllegalArgumentException(AK.c.s(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
                }
                s sVar = (s) dVar;
                a(sVar.f409387d);
                a(sVar.f409388e);
                return;
            }
            int size = dVar.size();
            int[] iArr = s.f409385i;
            int iBinarySearch = Arrays.binarySearch(iArr, size);
            if (iBinarySearch < 0) {
                iBinarySearch = (-(iBinarySearch + 1)) - 1;
            }
            int i12 = iArr[iBinarySearch + 1];
            Stack<kotlin.reflect.jvm.internal.impl.protobuf.d> stack = this.f409392a;
            if (stack.isEmpty() || stack.peek().size() >= i12) {
                stack.push(dVar);
                return;
            }
            int i13 = iArr[iBinarySearch];
            kotlin.reflect.jvm.internal.impl.protobuf.d dVarPop = stack.pop();
            while (true) {
                if (stack.isEmpty() || stack.peek().size() >= i13) {
                    break;
                } else {
                    dVarPop = new s(stack.pop(), dVarPop);
                }
            }
            s sVar2 = new s(dVarPop, dVar);
            while (!stack.isEmpty()) {
                int[] iArr2 = s.f409385i;
                int iBinarySearch2 = Arrays.binarySearch(iArr2, sVar2.f409386c);
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
                }
                if (stack.peek().size() >= iArr2[iBinarySearch2 + 1]) {
                    break;
                } else {
                    sVar2 = new s(stack.pop(), sVar2);
                }
            }
            stack.push(sVar2);
        }
    }

    /* compiled from: RopeByteString.java */
    public static class c implements Iterator<n> {

        /* renamed from: b, reason: collision with root package name */
        public final Stack<s> f409393b = new Stack<>();

        /* renamed from: c, reason: collision with root package name */
        public n f409394c;

        public c(kotlin.reflect.jvm.internal.impl.protobuf.d dVar, a aVar) {
            while (dVar instanceof s) {
                s sVar = (s) dVar;
                this.f409393b.push(sVar);
                dVar = sVar.f409387d;
            }
            this.f409394c = (n) dVar;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n next() {
            n nVar;
            n nVar2 = this.f409394c;
            if (nVar2 == null) {
                throw new NoSuchElementException();
            }
            while (true) {
                Stack<s> stack = this.f409393b;
                if (!stack.isEmpty()) {
                    Object obj = stack.pop().f409388e;
                    while (obj instanceof s) {
                        s sVar = (s) obj;
                        stack.push(sVar);
                        obj = sVar.f409387d;
                    }
                    nVar = (n) obj;
                    if (nVar.size() != 0) {
                        break;
                    }
                } else {
                    nVar = null;
                    break;
                }
            }
            this.f409394c = nVar;
            return nVar2;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f409394c != null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: RopeByteString.java */
    public class d implements d.a {

        /* renamed from: b, reason: collision with root package name */
        public final c f409395b;

        /* renamed from: c, reason: collision with root package name */
        public d.a f409396c;

        /* renamed from: d, reason: collision with root package name */
        public int f409397d;

        public d(s sVar, a aVar) {
            c cVar = new c(sVar, null);
            this.f409395b = cVar;
            this.f409396c = cVar.next().iterator();
            this.f409397d = sVar.f409386c;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f409397d > 0;
        }

        @Override // java.util.Iterator
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.d.a
        public final byte nextByte() {
            if (!this.f409396c.hasNext()) {
                this.f409396c = this.f409395b.next().iterator();
            }
            this.f409397d--;
            return this.f409396c.nextByte();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i12 = 1;
        int i13 = 1;
        while (i12 > 0) {
            arrayList.add(Integer.valueOf(i12));
            int i14 = i13 + i12;
            i13 = i12;
            i12 = i14;
        }
        arrayList.add(Integer.MAX_VALUE);
        f409385i = new int[arrayList.size()];
        int i15 = 0;
        while (true) {
            int[] iArr = f409385i;
            if (i15 >= iArr.length) {
                return;
            }
            iArr[i15] = ((Integer) arrayList.get(i15)).intValue();
            i15++;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public final void C(OutputStream outputStream, int i12, int i13) {
        int i14 = i12 + i13;
        kotlin.reflect.jvm.internal.impl.protobuf.d dVar = this.f409387d;
        int i15 = this.f409389f;
        if (i14 <= i15) {
            dVar.C(outputStream, i12, i13);
            return;
        }
        kotlin.reflect.jvm.internal.impl.protobuf.d dVar2 = this.f409388e;
        if (i12 >= i15) {
            dVar2.C(outputStream, i12 - i15, i13);
            return;
        }
        int i16 = i15 - i12;
        dVar.C(outputStream, i12, i16);
        dVar2.C(outputStream, 0, i13 - i16);
    }

    public final boolean equals(Object obj) {
        int iV2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.d)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.protobuf.d dVar = (kotlin.reflect.jvm.internal.impl.protobuf.d) obj;
        int size = dVar.size();
        int i12 = this.f409386c;
        if (i12 != size) {
            return false;
        }
        if (i12 == 0) {
            return true;
        }
        if (this.f409391h != 0 && (iV2 = dVar.v()) != 0 && this.f409391h != iV2) {
            return false;
        }
        c cVar = new c(this, null);
        n next = cVar.next();
        c cVar2 = new c(dVar, null);
        n next2 = cVar2.next();
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int size2 = next.size() - i13;
            int size3 = next2.size() - i14;
            int iMin = Math.min(size2, size3);
            if (!(i13 == 0 ? next.E(next2, i14, iMin) : next2.E(next, i13, iMin))) {
                return false;
            }
            i15 += iMin;
            if (i15 >= i12) {
                if (i15 == i12) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == size2) {
                next = cVar.next();
                i13 = 0;
            } else {
                i13 += iMin;
            }
            if (iMin == size3) {
                next2 = cVar2.next();
                i14 = 0;
            } else {
                i14 += iMin;
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public final void g(byte[] bArr, int i12, int i13, int i14) {
        int i15 = i12 + i14;
        kotlin.reflect.jvm.internal.impl.protobuf.d dVar = this.f409387d;
        int i16 = this.f409389f;
        if (i15 <= i16) {
            dVar.g(bArr, i12, i13, i14);
            return;
        }
        kotlin.reflect.jvm.internal.impl.protobuf.d dVar2 = this.f409388e;
        if (i12 >= i16) {
            dVar2.g(bArr, i12 - i16, i13, i14);
            return;
        }
        int i17 = i16 - i12;
        dVar.g(bArr, i12, i13, i17);
        dVar2.g(bArr, 0, i13 + i17, i14 - i17);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public final int h() {
        return this.f409390g;
    }

    public final int hashCode() {
        int iS2 = this.f409391h;
        if (iS2 == 0) {
            int i12 = this.f409386c;
            iS2 = s(i12, 0, i12);
            if (iS2 == 0) {
                iS2 = 1;
            }
            this.f409391h = iS2;
        }
        return iS2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public final boolean i() {
        return this.f409386c >= f409385i[this.f409390g];
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public final boolean j() {
        int iT2 = this.f409387d.t(0, 0, this.f409389f);
        kotlin.reflect.jvm.internal.impl.protobuf.d dVar = this.f409388e;
        return dVar.t(iT2, 0, dVar.size()) == 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d, java.lang.Iterable
    /* renamed from: l */
    public final d.a iterator() {
        return new d(this, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public final int s(int i12, int i13, int i14) {
        int i15 = i13 + i14;
        kotlin.reflect.jvm.internal.impl.protobuf.d dVar = this.f409387d;
        int i16 = this.f409389f;
        if (i15 <= i16) {
            return dVar.s(i12, i13, i14);
        }
        kotlin.reflect.jvm.internal.impl.protobuf.d dVar2 = this.f409388e;
        if (i13 >= i16) {
            return dVar2.s(i12, i13 - i16, i14);
        }
        int i17 = i16 - i13;
        return dVar2.s(dVar.s(i12, i13, i17), 0, i14 - i17);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public final int size() {
        return this.f409386c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public final int t(int i12, int i13, int i14) {
        int i15 = i13 + i14;
        kotlin.reflect.jvm.internal.impl.protobuf.d dVar = this.f409387d;
        int i16 = this.f409389f;
        if (i15 <= i16) {
            return dVar.t(i12, i13, i14);
        }
        kotlin.reflect.jvm.internal.impl.protobuf.d dVar2 = this.f409388e;
        if (i13 >= i16) {
            return dVar2.t(i12, i13 - i16, i14);
        }
        int i17 = i16 - i13;
        return dVar2.t(dVar.t(i12, i13, i17), 0, i14 - i17);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public final int v() {
        return this.f409391h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public final String w() {
        byte[] bArr;
        int i12 = this.f409386c;
        if (i12 == 0) {
            bArr = i.f409374a;
        } else {
            byte[] bArr2 = new byte[i12];
            g(bArr2, 0, 0, i12);
            bArr = bArr2;
        }
        return new String(bArr, Constants.ENCODING);
    }

    public s(kotlin.reflect.jvm.internal.impl.protobuf.d dVar, kotlin.reflect.jvm.internal.impl.protobuf.d dVar2) {
        this.f409391h = 0;
        this.f409387d = dVar;
        this.f409388e = dVar2;
        int size = dVar.size();
        this.f409389f = size;
        this.f409386c = dVar2.size() + size;
        this.f409390g = Math.max(dVar.h(), dVar2.h()) + 1;
    }

    /* compiled from: RopeByteString.java */
    public class e extends InputStream {

        /* renamed from: b, reason: collision with root package name */
        public c f409398b;

        /* renamed from: c, reason: collision with root package name */
        public n f409399c;

        /* renamed from: d, reason: collision with root package name */
        public int f409400d;

        /* renamed from: e, reason: collision with root package name */
        public int f409401e;

        /* renamed from: f, reason: collision with root package name */
        public int f409402f;

        /* renamed from: g, reason: collision with root package name */
        public int f409403g;

        public final void a() {
            if (this.f409399c != null) {
                int i12 = this.f409401e;
                int i13 = this.f409400d;
                if (i12 == i13) {
                    this.f409402f += i13;
                    this.f409401e = 0;
                    if (!this.f409398b.hasNext()) {
                        this.f409399c = null;
                        this.f409400d = 0;
                    } else {
                        n next = this.f409398b.next();
                        this.f409399c = next;
                        this.f409400d = next.size();
                    }
                }
            }
        }

        @Override // java.io.InputStream
        public final int available() {
            throw null;
        }

        public final int b(byte[] bArr, int i12, int i13) {
            int i14 = i13;
            while (true) {
                if (i14 <= 0) {
                    break;
                }
                a();
                if (this.f409399c != null) {
                    int iMin = Math.min(this.f409400d - this.f409401e, i14);
                    if (bArr != null) {
                        this.f409399c.e(bArr, this.f409401e, i12, iMin);
                        i12 += iMin;
                    }
                    this.f409401e += iMin;
                    i14 -= iMin;
                } else if (i14 == i13) {
                    return -1;
                }
            }
            return i13 - i14;
        }

        @Override // java.io.InputStream
        public final void mark(int i12) {
            this.f409403g = this.f409402f + this.f409401e;
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i12, int i13) {
            bArr.getClass();
            if (i12 < 0 || i13 < 0 || i13 > bArr.length - i12) {
                throw new IndexOutOfBoundsException();
            }
            return b(bArr, i12, i13);
        }

        @Override // java.io.InputStream
        public final synchronized void reset() {
            c cVar = new c(null, null);
            this.f409398b = cVar;
            n next = cVar.next();
            this.f409399c = next;
            this.f409400d = next.size();
            this.f409401e = 0;
            this.f409402f = 0;
            b(null, 0, this.f409403g);
        }

        @Override // java.io.InputStream
        public final long skip(long j12) {
            if (j12 < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (j12 > 2147483647L) {
                j12 = 2147483647L;
            }
            return b(null, 0, (int) j12);
        }

        @Override // java.io.InputStream
        public final int read() {
            a();
            n nVar = this.f409399c;
            if (nVar == null) {
                return -1;
            }
            int i12 = this.f409401e;
            this.f409401e = i12 + 1;
            return nVar.D(i12) & 255;
        }
    }
}
