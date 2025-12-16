package com.google.protobuf;

import com.google.protobuf.AbstractC37700t;
import com.google.protobuf.AbstractC37708x;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: RopeByteString.java */
/* loaded from: classes7.dex */
final class S0 extends AbstractC37700t {
    private static final long serialVersionUID = 1;

    /* renamed from: e, reason: collision with root package name */
    public final int f362739e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC37700t f362740f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC37700t f362741g;

    /* renamed from: h, reason: collision with root package name */
    public final int f362742h;

    /* renamed from: i, reason: collision with root package name */
    public final int f362743i;

    /* compiled from: RopeByteString.java */
    public class a extends AbstractC37700t.c {

        /* renamed from: b, reason: collision with root package name */
        public final c f362744b;

        /* renamed from: c, reason: collision with root package name */
        public AbstractC37700t.g f362745c = a();

        public a(S0 s02) {
            this.f362744b = new c(s02, null);
        }

        public final AbstractC37700t.g a() {
            c cVar = this.f362744b;
            if (cVar.hasNext()) {
                return new AbstractC37700t.a();
            }
            return null;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f362745c != null;
        }

        @Override // com.google.protobuf.AbstractC37700t.g
        public final byte nextByte() {
            AbstractC37700t.g gVar = this.f362745c;
            if (gVar == null) {
                throw new NoSuchElementException();
            }
            byte bNextByte = gVar.nextByte();
            if (!this.f362745c.hasNext()) {
                this.f362745c = a();
            }
            return bNextByte;
        }
    }

    /* compiled from: RopeByteString.java */
    public static final class c implements Iterator<AbstractC37700t.i> {

        /* renamed from: b, reason: collision with root package name */
        public final ArrayDeque<S0> f362746b;

        /* renamed from: c, reason: collision with root package name */
        public AbstractC37700t.i f362747c;

        public c(AbstractC37700t abstractC37700t, a aVar) {
            if (!(abstractC37700t instanceof S0)) {
                this.f362746b = null;
                this.f362747c = (AbstractC37700t.i) abstractC37700t;
                return;
            }
            S0 s02 = (S0) abstractC37700t;
            ArrayDeque<S0> arrayDeque = new ArrayDeque<>(s02.f362743i);
            this.f362746b = arrayDeque;
            arrayDeque.push(s02);
            AbstractC37700t abstractC37700t2 = s02.f362740f;
            while (abstractC37700t2 instanceof S0) {
                S0 s03 = (S0) abstractC37700t2;
                this.f362746b.push(s03);
                abstractC37700t2 = s03.f362740f;
            }
            this.f362747c = (AbstractC37700t.i) abstractC37700t2;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC37700t.i next() {
            AbstractC37700t.i iVar;
            AbstractC37700t.i iVar2 = this.f362747c;
            if (iVar2 == null) {
                throw new NoSuchElementException();
            }
            do {
                ArrayDeque<S0> arrayDeque = this.f362746b;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    iVar = null;
                    break;
                }
                AbstractC37700t abstractC37700t = arrayDeque.pop().f362741g;
                while (abstractC37700t instanceof S0) {
                    S0 s02 = (S0) abstractC37700t;
                    arrayDeque.push(s02);
                    abstractC37700t = s02.f362740f;
                }
                iVar = (AbstractC37700t.i) abstractC37700t;
            } while (iVar.size() == 0);
            this.f362747c = iVar;
            return iVar2;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f362747c != null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public /* synthetic */ S0(AbstractC37700t abstractC37700t, AbstractC37700t abstractC37700t2, a aVar) {
        this(abstractC37700t, abstractC37700t2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // com.google.protobuf.AbstractC37700t
    public final int C(int i12, int i13, int i14) {
        int i15 = i13 + i14;
        AbstractC37700t abstractC37700t = this.f362740f;
        int i16 = this.f362742h;
        if (i15 <= i16) {
            return abstractC37700t.C(i12, i13, i14);
        }
        AbstractC37700t abstractC37700t2 = this.f362741g;
        if (i13 >= i16) {
            return abstractC37700t2.C(i12, i13 - i16, i14);
        }
        int i17 = i16 - i13;
        return abstractC37700t2.C(abstractC37700t.C(i12, i13, i17), 0, i14 - i17);
    }

    @Override // com.google.protobuf.AbstractC37700t
    public final AbstractC37700t E(int i12, int i13) {
        int i14 = this.f362739e;
        int iG2 = AbstractC37700t.g(i12, i13, i14);
        if (iG2 == 0) {
            return AbstractC37700t.f362954c;
        }
        if (iG2 == i14) {
            return this;
        }
        AbstractC37700t abstractC37700t = this.f362740f;
        int i15 = this.f362742h;
        if (i13 <= i15) {
            return abstractC37700t.E(i12, i13);
        }
        AbstractC37700t abstractC37700t2 = this.f362741g;
        return i12 >= i15 ? abstractC37700t2.E(i12 - i15, i13 - i15) : new S0(abstractC37700t.E(i12, abstractC37700t.size()), abstractC37700t2.E(0, i13 - i15));
    }

    @Override // com.google.protobuf.AbstractC37700t
    public final String K(Charset charset) {
        return new String(I(), charset);
    }

    @Override // com.google.protobuf.AbstractC37700t
    public final void O(AbstractC37698s abstractC37698s) {
        this.f362740f.O(abstractC37698s);
        this.f362741g.O(abstractC37698s);
    }

    @Override // com.google.protobuf.AbstractC37700t
    public final void P(AbstractC37698s abstractC37698s) {
        this.f362741g.P(abstractC37698s);
        this.f362740f.P(abstractC37698s);
    }

    @Override // com.google.protobuf.AbstractC37700t
    public final ByteBuffer b() {
        return ByteBuffer.wrap(I()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.AbstractC37700t
    public final byte d(int i12) {
        AbstractC37700t.e(i12, this.f362739e);
        return s(i12);
    }

    @Override // com.google.protobuf.AbstractC37700t
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC37700t)) {
            return false;
        }
        AbstractC37700t abstractC37700t = (AbstractC37700t) obj;
        int size = abstractC37700t.size();
        int i12 = this.f362739e;
        if (i12 != size) {
            return false;
        }
        if (i12 == 0) {
            return true;
        }
        int i13 = this.f362956b;
        int i14 = abstractC37700t.f362956b;
        if (i13 != 0 && i14 != 0 && i13 != i14) {
            return false;
        }
        c cVar = new c(this, null);
        AbstractC37700t.i next = cVar.next();
        c cVar2 = new c(abstractC37700t, null);
        AbstractC37700t.i next2 = cVar2.next();
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            int size2 = next.size() - i15;
            int size3 = next2.size() - i16;
            int iMin = Math.min(size2, size3);
            if (!(i15 == 0 ? next.Q(next2, i16, iMin) : next2.Q(next, i15, iMin))) {
                return false;
            }
            i17 += iMin;
            if (i17 >= i12) {
                if (i17 == i12) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == size2) {
                next = cVar.next();
                i15 = 0;
            } else {
                i15 += iMin;
                next = next;
            }
            if (iMin == size3) {
                next2 = cVar2.next();
                i16 = 0;
            } else {
                i16 += iMin;
            }
        }
    }

    @Override // com.google.protobuf.AbstractC37700t, java.lang.Iterable
    public final Iterator<Byte> iterator() {
        return new a(this);
    }

    @Override // com.google.protobuf.AbstractC37700t
    public final void l(byte[] bArr, int i12, int i13, int i14) {
        int i15 = i12 + i14;
        AbstractC37700t abstractC37700t = this.f362740f;
        int i16 = this.f362742h;
        if (i15 <= i16) {
            abstractC37700t.l(bArr, i12, i13, i14);
            return;
        }
        AbstractC37700t abstractC37700t2 = this.f362741g;
        if (i12 >= i16) {
            abstractC37700t2.l(bArr, i12 - i16, i13, i14);
            return;
        }
        int i17 = i16 - i12;
        abstractC37700t.l(bArr, i12, i13, i17);
        abstractC37700t2.l(bArr, 0, i13 + i17, i14 - i17);
    }

    @Override // com.google.protobuf.AbstractC37700t
    public final int r() {
        return this.f362743i;
    }

    @Override // com.google.protobuf.AbstractC37700t
    public final byte s(int i12) {
        int i13 = this.f362742h;
        return i12 < i13 ? this.f362740f.s(i12) : this.f362741g.s(i12 - i13);
    }

    @Override // com.google.protobuf.AbstractC37700t
    public final int size() {
        return this.f362739e;
    }

    @Override // com.google.protobuf.AbstractC37700t
    public final boolean t() {
        int iC2 = this.f362740f.C(0, 0, this.f362742h);
        AbstractC37700t abstractC37700t = this.f362741g;
        return abstractC37700t.C(iC2, 0, abstractC37700t.size()) == 0;
    }

    @Override // com.google.protobuf.AbstractC37700t
    /* renamed from: v */
    public final AbstractC37700t.g iterator() {
        return new a(this);
    }

    @Override // com.google.protobuf.AbstractC37700t
    public final AbstractC37708x w() {
        ArrayList arrayList = new ArrayList();
        c cVar = new c(this, null);
        while (cVar.hasNext()) {
            arrayList.add(cVar.next().b());
        }
        Iterator it = arrayList.iterator();
        int i12 = 0;
        int iRemaining = 0;
        while (it.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) it.next();
            iRemaining += byteBuffer.remaining();
            i12 = byteBuffer.hasArray() ? i12 | 1 : byteBuffer.isDirect() ? i12 | 2 : i12 | 4;
        }
        if (i12 == 2) {
            return new AbstractC37708x.c(arrayList, iRemaining, true, null);
        }
        C37674f0 c37674f0 = new C37674f0();
        c37674f0.f362866b = arrayList.iterator();
        c37674f0.f362868d = 0;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            c37674f0.f362868d++;
        }
        c37674f0.f362869e = -1;
        if (!c37674f0.a()) {
            c37674f0.f362867c = C37670d0.f362859c;
            c37674f0.f362869e = 0;
            c37674f0.f362870f = 0;
            c37674f0.f362874j = 0L;
        }
        return AbstractC37708x.h(c37674f0);
    }

    public Object writeReplace() {
        return new AbstractC37700t.j(I());
    }

    @Override // com.google.protobuf.AbstractC37700t
    public final int y(int i12, int i13, int i14) {
        int i15 = i13 + i14;
        AbstractC37700t abstractC37700t = this.f362740f;
        int i16 = this.f362742h;
        if (i15 <= i16) {
            return abstractC37700t.y(i12, i13, i14);
        }
        AbstractC37700t abstractC37700t2 = this.f362741g;
        if (i13 >= i16) {
            return abstractC37700t2.y(i12, i13 - i16, i14);
        }
        int i17 = i16 - i13;
        return abstractC37700t2.y(abstractC37700t.y(i12, i13, i17), 0, i14 - i17);
    }

    /* compiled from: RopeByteString.java */
    public static class b {
        public b() {
            new ArrayDeque();
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public S0(AbstractC37700t abstractC37700t, AbstractC37700t abstractC37700t2) {
        this.f362740f = abstractC37700t;
        this.f362741g = abstractC37700t2;
        int size = abstractC37700t.size();
        this.f362742h = size;
        this.f362739e = abstractC37700t2.size() + size;
        this.f362743i = Math.max(abstractC37700t.r(), abstractC37700t2.r()) + 1;
    }

    /* compiled from: RopeByteString.java */
    public class d extends InputStream {

        /* renamed from: b, reason: collision with root package name */
        public c f362748b;

        /* renamed from: c, reason: collision with root package name */
        public AbstractC37700t.i f362749c;

        /* renamed from: d, reason: collision with root package name */
        public int f362750d;

        /* renamed from: e, reason: collision with root package name */
        public int f362751e;

        /* renamed from: f, reason: collision with root package name */
        public int f362752f;

        /* renamed from: g, reason: collision with root package name */
        public int f362753g;

        public final void a() {
            if (this.f362749c != null) {
                int i12 = this.f362751e;
                int i13 = this.f362750d;
                if (i12 == i13) {
                    this.f362752f += i13;
                    this.f362751e = 0;
                    if (!this.f362748b.hasNext()) {
                        this.f362749c = null;
                        this.f362750d = 0;
                    } else {
                        AbstractC37700t.i next = this.f362748b.next();
                        this.f362749c = next;
                        this.f362750d = next.size();
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
            while (i14 > 0) {
                a();
                if (this.f362749c == null) {
                    break;
                }
                int iMin = Math.min(this.f362750d - this.f362751e, i14);
                if (bArr != null) {
                    AbstractC37700t.i iVar = this.f362749c;
                    int i15 = this.f362751e;
                    AbstractC37700t.g(i15, i15 + iMin, iVar.size());
                    AbstractC37700t.g(i12, i12 + iMin, bArr.length);
                    if (iMin > 0) {
                        iVar.l(bArr, i15, i12, iMin);
                    }
                    i12 += iMin;
                }
                this.f362751e += iMin;
                i14 -= iMin;
            }
            return i13 - i14;
        }

        @Override // java.io.InputStream
        public final void mark(int i12) {
            this.f362753g = this.f362752f + this.f362751e;
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
            int iB2 = b(bArr, i12, i13);
            if (iB2 != 0) {
                return iB2;
            }
            if (i13 > 0) {
                return -1;
            }
            throw null;
        }

        @Override // java.io.InputStream
        public final synchronized void reset() {
            c cVar = new c(null, null);
            this.f362748b = cVar;
            AbstractC37700t.i next = cVar.next();
            this.f362749c = next;
            this.f362750d = next.size();
            this.f362751e = 0;
            this.f362752f = 0;
            b(null, 0, this.f362753g);
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
            AbstractC37700t.i iVar = this.f362749c;
            if (iVar == null) {
                return -1;
            }
            int i12 = this.f362751e;
            this.f362751e = i12 + 1;
            return iVar.d(i12) & 255;
        }
    }
}
