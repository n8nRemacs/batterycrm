package com.google.protobuf;

import com.google.protobuf.CodedOutputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.logging.Logger;

/* compiled from: ByteString.java */
@InterfaceC37706w
/* renamed from: com.google.protobuf.t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37700t implements Iterable<Byte>, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC37700t f362954c = new j(C37670d0.f362858b);

    /* renamed from: d, reason: collision with root package name */
    public static final f f362955d;
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public int f362956b = 0;

    /* compiled from: ByteString.java */
    /* renamed from: com.google.protobuf.t$a */
    public class a extends c {

        /* renamed from: b, reason: collision with root package name */
        public int f362957b = 0;

        /* renamed from: c, reason: collision with root package name */
        public final int f362958c;

        public a() {
            this.f362958c = AbstractC37700t.this.size();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f362957b < this.f362958c;
        }

        @Override // com.google.protobuf.AbstractC37700t.g
        public final byte nextByte() {
            int i12 = this.f362957b;
            if (i12 >= this.f362958c) {
                throw new NoSuchElementException();
            }
            this.f362957b = i12 + 1;
            return AbstractC37700t.this.s(i12);
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.protobuf.t$b */
    public class b implements Comparator<AbstractC37700t> {
        @Override // java.util.Comparator
        public final int compare(AbstractC37700t abstractC37700t, AbstractC37700t abstractC37700t2) {
            AbstractC37700t abstractC37700t3 = abstractC37700t;
            AbstractC37700t abstractC37700t4 = abstractC37700t2;
            g it = abstractC37700t3.iterator();
            g it2 = abstractC37700t4.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int iCompareTo = Integer.valueOf(it.nextByte() & 255).compareTo(Integer.valueOf(it2.nextByte() & 255));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(abstractC37700t3.size()).compareTo(Integer.valueOf(abstractC37700t4.size()));
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.protobuf.t$c */
    public static abstract class c implements g {
        @Override // java.util.Iterator
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.protobuf.t$d */
    public static final class d implements f {
        public d() {
        }

        @Override // com.google.protobuf.AbstractC37700t.f
        public final byte[] copyFrom(byte[] bArr, int i12, int i13) {
            return Arrays.copyOfRange(bArr, i12, i13 + i12);
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.protobuf.t$e */
    public static final class e extends j {
        private static final long serialVersionUID = 1;

        /* renamed from: f, reason: collision with root package name */
        public final int f362960f;

        /* renamed from: g, reason: collision with root package name */
        public final int f362961g;

        public e(byte[] bArr, int i12, int i13) {
            super(bArr);
            AbstractC37700t.g(i12, i12 + i13, bArr.length);
            this.f362960f = i12;
            this.f362961g = i13;
        }

        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // com.google.protobuf.AbstractC37700t.j
        public final int R() {
            return this.f362960f;
        }

        @Override // com.google.protobuf.AbstractC37700t.j, com.google.protobuf.AbstractC37700t
        public final byte d(int i12) {
            AbstractC37700t.e(i12, this.f362961g);
            return this.f362964e[this.f362960f + i12];
        }

        @Override // com.google.protobuf.AbstractC37700t.j, com.google.protobuf.AbstractC37700t
        public final void l(byte[] bArr, int i12, int i13, int i14) {
            System.arraycopy(this.f362964e, this.f362960f + i12, bArr, i13, i14);
        }

        @Override // com.google.protobuf.AbstractC37700t.j, com.google.protobuf.AbstractC37700t.i, com.google.protobuf.AbstractC37700t
        public final byte s(int i12) {
            return this.f362964e[this.f362960f + i12];
        }

        @Override // com.google.protobuf.AbstractC37700t.j, com.google.protobuf.AbstractC37700t
        public final int size() {
            return this.f362961g;
        }

        public Object writeReplace() {
            return new j(I());
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.protobuf.t$f */
    public interface f {
        byte[] copyFrom(byte[] bArr, int i12, int i13);
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.protobuf.t$g */
    public interface g extends Iterator<Byte> {
        byte nextByte();
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.protobuf.t$h */
    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final CodedOutputStream f362962a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f362963b;

        public h(int i12, a aVar) {
            byte[] bArr = new byte[i12];
            this.f362963b = bArr;
            Logger logger = CodedOutputStream.f362603b;
            this.f362962a = new CodedOutputStream.c(bArr, i12);
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.protobuf.t$i */
    public static abstract class i extends AbstractC37700t {
        private static final long serialVersionUID = 1;

        @Override // com.google.protobuf.AbstractC37700t
        public final void P(AbstractC37698s abstractC37698s) {
            O(abstractC37698s);
        }

        public abstract boolean Q(AbstractC37700t abstractC37700t, int i12, int i13);

        @Override // com.google.protobuf.AbstractC37700t
        public final int r() {
            return 0;
        }

        @Override // com.google.protobuf.AbstractC37700t
        public byte s(int i12) {
            return d(i12);
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.protobuf.t$j */
    public static class j extends i {
        private static final long serialVersionUID = 1;

        /* renamed from: e, reason: collision with root package name */
        public final byte[] f362964e;

        public j(byte[] bArr) {
            bArr.getClass();
            this.f362964e = bArr;
        }

        @Override // com.google.protobuf.AbstractC37700t
        public final int C(int i12, int i13, int i14) {
            int iR2 = R() + i13;
            return s1.f362953a.f(i12, this.f362964e, iR2, i14 + iR2);
        }

        @Override // com.google.protobuf.AbstractC37700t
        public final AbstractC37700t E(int i12, int i13) {
            int iG2 = AbstractC37700t.g(i12, i13, size());
            if (iG2 == 0) {
                return AbstractC37700t.f362954c;
            }
            return new e(this.f362964e, R() + i12, iG2);
        }

        @Override // com.google.protobuf.AbstractC37700t
        public final String K(Charset charset) {
            return new String(this.f362964e, R(), size(), charset);
        }

        @Override // com.google.protobuf.AbstractC37700t
        public final void O(AbstractC37698s abstractC37698s) {
            abstractC37698s.h(this.f362964e, R(), size());
        }

        @Override // com.google.protobuf.AbstractC37700t.i
        public final boolean Q(AbstractC37700t abstractC37700t, int i12, int i13) {
            if (i13 > abstractC37700t.size()) {
                throw new IllegalArgumentException("Length too large: " + i13 + size());
            }
            int i14 = i12 + i13;
            if (i14 > abstractC37700t.size()) {
                StringBuilder sbY = androidx.appcompat.app.r.y(i12, i13, "Ran off end of other: ", ", ", ", ");
                sbY.append(abstractC37700t.size());
                throw new IllegalArgumentException(sbY.toString());
            }
            if (!(abstractC37700t instanceof j)) {
                return abstractC37700t.E(i12, i14).equals(E(0, i13));
            }
            j jVar = (j) abstractC37700t;
            int iR2 = R() + i13;
            int iR3 = R();
            int iR4 = jVar.R() + i12;
            while (iR3 < iR2) {
                if (this.f362964e[iR3] != jVar.f362964e[iR4]) {
                    return false;
                }
                iR3++;
                iR4++;
            }
            return true;
        }

        public int R() {
            return 0;
        }

        @Override // com.google.protobuf.AbstractC37700t
        public final ByteBuffer b() {
            return ByteBuffer.wrap(this.f362964e, R(), size()).asReadOnlyBuffer();
        }

        @Override // com.google.protobuf.AbstractC37700t
        public byte d(int i12) {
            return this.f362964e[i12];
        }

        @Override // com.google.protobuf.AbstractC37700t
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC37700t) || size() != ((AbstractC37700t) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof j)) {
                return obj.equals(this);
            }
            j jVar = (j) obj;
            int i12 = this.f362956b;
            int i13 = jVar.f362956b;
            if (i12 == 0 || i13 == 0 || i12 == i13) {
                return Q(jVar, 0, size());
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractC37700t
        public void l(byte[] bArr, int i12, int i13, int i14) {
            System.arraycopy(this.f362964e, i12, bArr, i13, i14);
        }

        @Override // com.google.protobuf.AbstractC37700t.i, com.google.protobuf.AbstractC37700t
        public byte s(int i12) {
            return this.f362964e[i12];
        }

        @Override // com.google.protobuf.AbstractC37700t
        public int size() {
            return this.f362964e.length;
        }

        @Override // com.google.protobuf.AbstractC37700t
        public final boolean t() {
            int iR2 = R();
            return s1.f362953a.f(0, this.f362964e, iR2, size() + iR2) == 0;
        }

        @Override // com.google.protobuf.AbstractC37700t
        public final AbstractC37708x w() {
            return AbstractC37708x.j(this.f362964e, R(), size(), true);
        }

        @Override // com.google.protobuf.AbstractC37700t
        public final int y(int i12, int i13, int i14) {
            int iR2 = R() + i13;
            Charset charset = C37670d0.f362857a;
            for (int i15 = iR2; i15 < iR2 + i14; i15++) {
                i12 = (i12 * 31) + this.f362964e[i15];
            }
            return i12;
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.protobuf.t$l */
    public static final class l implements f {
        public l() {
        }

        @Override // com.google.protobuf.AbstractC37700t.f
        public final byte[] copyFrom(byte[] bArr, int i12, int i13) {
            byte[] bArr2 = new byte[i13];
            System.arraycopy(bArr, i12, bArr2, 0, i13);
            return bArr2;
        }

        public /* synthetic */ l(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        f362955d = C37675g.a() ? new l(aVar) : new d(aVar);
        new b();
    }

    public static void e(int i12, int i13) {
        if (((i13 - (i12 + 1)) | i12) < 0) {
            if (i12 >= 0) {
                throw new ArrayIndexOutOfBoundsException(androidx.compose.foundation.H.j(i12, i13, "Index > length: ", ", "));
            }
            throw new ArrayIndexOutOfBoundsException(AK.c.g(i12, "Index < 0: "));
        }
    }

    @InterfaceC37704v
    public static int g(int i12, int i13, int i14) {
        int i15 = i13 - i12;
        if ((i12 | i13 | i15 | (i14 - i13)) >= 0) {
            return i15;
        }
        if (i12 < 0) {
            throw new IndexOutOfBoundsException(androidx.camera.camera2.internal.G.e(i12, "Beginning index: ", " < 0"));
        }
        if (i13 < i12) {
            throw new IndexOutOfBoundsException(androidx.compose.foundation.H.j(i12, i13, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(androidx.compose.foundation.H.j(i13, i14, "End index: ", " >= "));
    }

    public static AbstractC37700t h(int i12, int i13, byte[] bArr) {
        g(i12, i12 + i13, bArr.length);
        return new j(f362955d.copyFrom(bArr, i12, i13));
    }

    public static AbstractC37700t i(String str) {
        return new j(str.getBytes(C37670d0.f362857a));
    }

    public abstract int C(int i12, int i13, int i14);

    public abstract AbstractC37700t E(int i12, int i13);

    public final byte[] I() {
        int size = size();
        if (size == 0) {
            return C37670d0.f362858b;
        }
        byte[] bArr = new byte[size];
        l(bArr, 0, 0, size);
        return bArr;
    }

    public abstract String K(Charset charset);

    public final String N() {
        return size() == 0 ? "" : K(C37670d0.f362857a);
    }

    public abstract void O(AbstractC37698s abstractC37698s);

    public abstract void P(AbstractC37698s abstractC37698s);

    public abstract ByteBuffer b();

    public abstract byte d(int i12);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iY2 = this.f362956b;
        if (iY2 == 0) {
            int size = size();
            iY2 = y(size, 0, size);
            if (iY2 == 0) {
                iY2 = 1;
            }
            this.f362956b = iY2;
        }
        return iY2;
    }

    public abstract void l(byte[] bArr, int i12, int i13, int i14);

    public abstract int r();

    public abstract byte s(int i12);

    public abstract int size();

    public abstract boolean t();

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        String strA = size() <= 50 ? e1.a(this) : AK.c.s(new StringBuilder(), e1.a(E(0, 47)), "...");
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(size);
        sb2.append(" contents=\"");
        return AK.c.s(sb2, strA, "\">");
    }

    @Override // java.lang.Iterable
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public g iterator() {
        return new a();
    }

    public abstract AbstractC37708x w();

    public abstract int y(int i12, int i13, int i14);

    /* compiled from: ByteString.java */
    /* renamed from: com.google.protobuf.t$k */
    public static final class k extends OutputStream {
        public final String toString() {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            synchronized (this) {
            }
            return String.format("<ByteString.Output@%s size=%d>", hexString, 0);
        }

        @Override // java.io.OutputStream
        public final synchronized void write(int i12) {
            throw null;
        }

        @Override // java.io.OutputStream
        public final synchronized void write(byte[] bArr, int i12, int i13) {
            throw null;
        }
    }
}
