package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC22934w;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: RopeByteString.java */
/* renamed from: androidx.datastore.preferences.protobuf.f1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22894f1 extends AbstractC22934w {
    private static final long serialVersionUID = 1;

    /* renamed from: e, reason: collision with root package name */
    public final int f45823e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC22934w f45824f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC22934w f45825g;

    /* renamed from: h, reason: collision with root package name */
    public final int f45826h;

    /* renamed from: i, reason: collision with root package name */
    public final int f45827i;

    /* compiled from: RopeByteString.java */
    /* renamed from: androidx.datastore.preferences.protobuf.f1$a */
    public class a extends AbstractC22934w.c {

        /* renamed from: b, reason: collision with root package name */
        public final c f45828b;

        /* renamed from: c, reason: collision with root package name */
        public AbstractC22934w.g f45829c = a();

        public a(C22894f1 c22894f1) {
            this.f45828b = new c(c22894f1, null);
        }

        public final AbstractC22934w.g a() {
            c cVar = this.f45828b;
            if (cVar.hasNext()) {
                return new AbstractC22934w.a();
            }
            return null;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f45829c != null;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22934w.g
        public final byte nextByte() {
            AbstractC22934w.g gVar = this.f45829c;
            if (gVar == null) {
                throw new NoSuchElementException();
            }
            byte bNextByte = gVar.nextByte();
            if (!this.f45829c.hasNext()) {
                this.f45829c = a();
            }
            return bNextByte;
        }
    }

    /* compiled from: RopeByteString.java */
    /* renamed from: androidx.datastore.preferences.protobuf.f1$c */
    public static final class c implements Iterator<AbstractC22934w.i> {

        /* renamed from: b, reason: collision with root package name */
        public final ArrayDeque<C22894f1> f45830b;

        /* renamed from: c, reason: collision with root package name */
        public AbstractC22934w.i f45831c;

        public c(AbstractC22934w abstractC22934w, a aVar) {
            if (!(abstractC22934w instanceof C22894f1)) {
                this.f45830b = null;
                this.f45831c = (AbstractC22934w.i) abstractC22934w;
                return;
            }
            C22894f1 c22894f1 = (C22894f1) abstractC22934w;
            ArrayDeque<C22894f1> arrayDeque = new ArrayDeque<>(c22894f1.f45827i);
            this.f45830b = arrayDeque;
            arrayDeque.push(c22894f1);
            AbstractC22934w abstractC22934w2 = c22894f1.f45824f;
            while (abstractC22934w2 instanceof C22894f1) {
                C22894f1 c22894f12 = (C22894f1) abstractC22934w2;
                this.f45830b.push(c22894f12);
                abstractC22934w2 = c22894f12.f45824f;
            }
            this.f45831c = (AbstractC22934w.i) abstractC22934w2;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC22934w.i next() {
            AbstractC22934w.i iVar;
            AbstractC22934w.i iVar2 = this.f45831c;
            if (iVar2 == null) {
                throw new NoSuchElementException();
            }
            do {
                ArrayDeque<C22894f1> arrayDeque = this.f45830b;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    iVar = null;
                    break;
                }
                AbstractC22934w abstractC22934w = arrayDeque.pop().f45825g;
                while (abstractC22934w instanceof C22894f1) {
                    C22894f1 c22894f1 = (C22894f1) abstractC22934w;
                    arrayDeque.push(c22894f1);
                    abstractC22934w = c22894f1.f45824f;
                }
                iVar = (AbstractC22934w.i) abstractC22934w;
            } while (iVar.size() == 0);
            this.f45831c = iVar;
            return iVar2;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f45831c != null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public /* synthetic */ C22894f1(AbstractC22934w abstractC22934w, AbstractC22934w abstractC22934w2, a aVar) {
        this(abstractC22934w, abstractC22934w2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22934w
    public final String E(Charset charset) {
        return new String(C(), charset);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22934w
    public final void I(AbstractC22932v abstractC22932v) {
        this.f45824f.I(abstractC22932v);
        this.f45825g.I(abstractC22932v);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22934w
    public final void K(AbstractC22932v abstractC22932v) {
        this.f45825g.K(abstractC22932v);
        this.f45824f.K(abstractC22932v);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22934w
    public final ByteBuffer b() {
        return ByteBuffer.wrap(C()).asReadOnlyBuffer();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22934w
    public final byte d(int i12) {
        AbstractC22934w.e(i12, this.f45823e);
        return r(i12);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22934w
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC22934w)) {
            return false;
        }
        AbstractC22934w abstractC22934w = (AbstractC22934w) obj;
        int size = abstractC22934w.size();
        int i12 = this.f45823e;
        if (i12 != size) {
            return false;
        }
        if (i12 == 0) {
            return true;
        }
        int i13 = this.f45927b;
        int i14 = abstractC22934w.f45927b;
        if (i13 != 0 && i14 != 0 && i13 != i14) {
            return false;
        }
        c cVar = new c(this, null);
        AbstractC22934w.i next = cVar.next();
        c cVar2 = new c(abstractC22934w, null);
        AbstractC22934w.i next2 = cVar2.next();
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            int size2 = next.size() - i15;
            int size3 = next2.size() - i16;
            int iMin = Math.min(size2, size3);
            if (!(i15 == 0 ? next.N(next2, i16, iMin) : next2.N(next, i15, iMin))) {
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

    @Override // androidx.datastore.preferences.protobuf.AbstractC22934w
    public final void i(byte[] bArr, int i12, int i13, int i14) {
        int i15 = i12 + i14;
        AbstractC22934w abstractC22934w = this.f45824f;
        int i16 = this.f45826h;
        if (i15 <= i16) {
            abstractC22934w.i(bArr, i12, i13, i14);
            return;
        }
        AbstractC22934w abstractC22934w2 = this.f45825g;
        if (i12 >= i16) {
            abstractC22934w2.i(bArr, i12 - i16, i13, i14);
            return;
        }
        int i17 = i16 - i12;
        abstractC22934w.i(bArr, i12, i13, i17);
        abstractC22934w2.i(bArr, 0, i13 + i17, i14 - i17);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22934w, java.lang.Iterable
    public final Iterator<Byte> iterator() {
        return new a(this);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22934w
    public final int l() {
        return this.f45827i;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22934w
    public final byte r(int i12) {
        int i13 = this.f45826h;
        return i12 < i13 ? this.f45824f.r(i12) : this.f45825g.r(i12 - i13);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22934w
    public final boolean s() {
        int iW2 = this.f45824f.w(0, 0, this.f45826h);
        AbstractC22934w abstractC22934w = this.f45825g;
        return abstractC22934w.w(iW2, 0, abstractC22934w.size()) == 0;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22934w
    public final int size() {
        return this.f45823e;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22934w
    /* renamed from: t */
    public final AbstractC22934w.g iterator() {
        return new a(this);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22934w
    public final int v(int i12, int i13, int i14) {
        int i15 = i13 + i14;
        AbstractC22934w abstractC22934w = this.f45824f;
        int i16 = this.f45826h;
        if (i15 <= i16) {
            return abstractC22934w.v(i12, i13, i14);
        }
        AbstractC22934w abstractC22934w2 = this.f45825g;
        if (i13 >= i16) {
            return abstractC22934w2.v(i12, i13 - i16, i14);
        }
        int i17 = i16 - i13;
        return abstractC22934w2.v(abstractC22934w.v(i12, i13, i17), 0, i14 - i17);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22934w
    public final int w(int i12, int i13, int i14) {
        int i15 = i13 + i14;
        AbstractC22934w abstractC22934w = this.f45824f;
        int i16 = this.f45826h;
        if (i15 <= i16) {
            return abstractC22934w.w(i12, i13, i14);
        }
        AbstractC22934w abstractC22934w2 = this.f45825g;
        if (i13 >= i16) {
            return abstractC22934w2.w(i12, i13 - i16, i14);
        }
        int i17 = i16 - i13;
        return abstractC22934w2.w(abstractC22934w.w(i12, i13, i17), 0, i14 - i17);
    }

    public Object writeReplace() {
        return new AbstractC22934w.j(C());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22934w
    public final AbstractC22934w y(int i12, int i13) {
        int i14 = this.f45823e;
        int iG2 = AbstractC22934w.g(i12, i13, i14);
        if (iG2 == 0) {
            return AbstractC22934w.f45925c;
        }
        if (iG2 == i14) {
            return this;
        }
        AbstractC22934w abstractC22934w = this.f45824f;
        int i15 = this.f45826h;
        if (i13 <= i15) {
            return abstractC22934w.y(i12, i13);
        }
        AbstractC22934w abstractC22934w2 = this.f45825g;
        return i12 >= i15 ? abstractC22934w2.y(i12 - i15, i13 - i15) : new C22894f1(abstractC22934w.y(i12, abstractC22934w.size()), abstractC22934w2.y(0, i13 - i15));
    }

    /* compiled from: RopeByteString.java */
    /* renamed from: androidx.datastore.preferences.protobuf.f1$b */
    public static class b {
        public b() {
            new ArrayDeque();
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public C22894f1(AbstractC22934w abstractC22934w, AbstractC22934w abstractC22934w2) {
        this.f45824f = abstractC22934w;
        this.f45825g = abstractC22934w2;
        int size = abstractC22934w.size();
        this.f45826h = size;
        this.f45823e = abstractC22934w2.size() + size;
        this.f45827i = Math.max(abstractC22934w.l(), abstractC22934w2.l()) + 1;
    }

    /* compiled from: RopeByteString.java */
    /* renamed from: androidx.datastore.preferences.protobuf.f1$d */
    public class d extends InputStream {

        /* renamed from: b, reason: collision with root package name */
        public c f45832b;

        /* renamed from: c, reason: collision with root package name */
        public AbstractC22934w.i f45833c;

        /* renamed from: d, reason: collision with root package name */
        public int f45834d;

        /* renamed from: e, reason: collision with root package name */
        public int f45835e;

        /* renamed from: f, reason: collision with root package name */
        public int f45836f;

        /* renamed from: g, reason: collision with root package name */
        public int f45837g;

        public final void a() {
            if (this.f45833c != null) {
                int i12 = this.f45835e;
                int i13 = this.f45834d;
                if (i12 == i13) {
                    this.f45836f += i13;
                    this.f45835e = 0;
                    if (!this.f45832b.hasNext()) {
                        this.f45833c = null;
                        this.f45834d = 0;
                    } else {
                        AbstractC22934w.i next = this.f45832b.next();
                        this.f45833c = next;
                        this.f45834d = next.size();
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
                if (this.f45833c != null) {
                    int iMin = Math.min(this.f45834d - this.f45835e, i14);
                    if (bArr != null) {
                        AbstractC22934w.i iVar = this.f45833c;
                        int i15 = this.f45835e;
                        AbstractC22934w.g(i15, i15 + iMin, iVar.size());
                        int i16 = i12 + iMin;
                        AbstractC22934w.g(i12, i16, bArr.length);
                        if (iMin > 0) {
                            iVar.i(bArr, i15, i12, iMin);
                        }
                        i12 = i16;
                    }
                    this.f45835e += iMin;
                    i14 -= iMin;
                } else if (i14 == i13) {
                    return -1;
                }
            }
            return i13 - i14;
        }

        @Override // java.io.InputStream
        public final void mark(int i12) {
            this.f45837g = this.f45836f + this.f45835e;
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
            this.f45832b = cVar;
            AbstractC22934w.i next = cVar.next();
            this.f45833c = next;
            this.f45834d = next.size();
            this.f45835e = 0;
            this.f45836f = 0;
            b(null, 0, this.f45837g);
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
            AbstractC22934w.i iVar = this.f45833c;
            if (iVar == null) {
                return -1;
            }
            int i12 = this.f45835e;
            this.f45835e = i12 + 1;
            return iVar.d(i12) & 255;
        }
    }
}
