package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.CodedOutputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.logging.Logger;

/* compiled from: ByteString.java */
/* renamed from: androidx.datastore.preferences.protobuf.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC22934w implements Iterable<Byte>, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC22934w f45925c = new j(C22914m0.f45875b);

    /* renamed from: d, reason: collision with root package name */
    public static final f f45926d;

    /* renamed from: b, reason: collision with root package name */
    public int f45927b = 0;

    /* compiled from: ByteString.java */
    /* renamed from: androidx.datastore.preferences.protobuf.w$a */
    public class a extends c {

        /* renamed from: b, reason: collision with root package name */
        public int f45928b = 0;

        /* renamed from: c, reason: collision with root package name */
        public final int f45929c;

        public a() {
            this.f45929c = AbstractC22934w.this.size();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f45928b < this.f45929c;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22934w.g
        public final byte nextByte() {
            int i12 = this.f45928b;
            if (i12 >= this.f45929c) {
                throw new NoSuchElementException();
            }
            this.f45928b = i12 + 1;
            return AbstractC22934w.this.r(i12);
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: androidx.datastore.preferences.protobuf.w$b */
    public static class b implements Comparator<AbstractC22934w> {
        @Override // java.util.Comparator
        public final int compare(AbstractC22934w abstractC22934w, AbstractC22934w abstractC22934w2) {
            AbstractC22934w abstractC22934w3 = abstractC22934w;
            AbstractC22934w abstractC22934w4 = abstractC22934w2;
            g it = abstractC22934w3.iterator();
            g it2 = abstractC22934w4.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int iCompare = Integer.compare(it.nextByte() & 255, it2.nextByte() & 255);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return Integer.compare(abstractC22934w3.size(), abstractC22934w4.size());
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: androidx.datastore.preferences.protobuf.w$c */
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
    /* renamed from: androidx.datastore.preferences.protobuf.w$d */
    public static final class d implements f {
        public d() {
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22934w.f
        public final byte[] copyFrom(byte[] bArr, int i12, int i13) {
            return Arrays.copyOfRange(bArr, i12, i13 + i12);
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: androidx.datastore.preferences.protobuf.w$e */
    public static final class e extends j {
        private static final long serialVersionUID = 1;

        /* renamed from: f, reason: collision with root package name */
        public final int f45931f;

        /* renamed from: g, reason: collision with root package name */
        public final int f45932g;

        public e(byte[] bArr, int i12, int i13) {
            super(bArr);
            AbstractC22934w.g(i12, i12 + i13, bArr.length);
            this.f45931f = i12;
            this.f45932g = i13;
        }

        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22934w.j
        public final int O() {
            return this.f45931f;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22934w.j, androidx.datastore.preferences.protobuf.AbstractC22934w
        public final byte d(int i12) {
            AbstractC22934w.e(i12, this.f45932g);
            return this.f45935e[this.f45931f + i12];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22934w.j, androidx.datastore.preferences.protobuf.AbstractC22934w
        public final void i(byte[] bArr, int i12, int i13, int i14) {
            System.arraycopy(this.f45935e, this.f45931f + i12, bArr, i13, i14);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22934w.j, androidx.datastore.preferences.protobuf.AbstractC22934w.i, androidx.datastore.preferences.protobuf.AbstractC22934w
        public final byte r(int i12) {
            return this.f45935e[this.f45931f + i12];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22934w.j, androidx.datastore.preferences.protobuf.AbstractC22934w
        public final int size() {
            return this.f45932g;
        }

        public Object writeReplace() {
            return new j(C());
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: androidx.datastore.preferences.protobuf.w$f */
    public interface f {
        byte[] copyFrom(byte[] bArr, int i12, int i13);
    }

    /* compiled from: ByteString.java */
    /* renamed from: androidx.datastore.preferences.protobuf.w$g */
    public interface g extends Iterator<Byte> {
        byte nextByte();
    }

    /* compiled from: ByteString.java */
    /* renamed from: androidx.datastore.preferences.protobuf.w$h */
    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final CodedOutputStream f45933a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f45934b;

        public h(int i12, a aVar) {
            byte[] bArr = new byte[i12];
            this.f45934b = bArr;
            Logger logger = CodedOutputStream.f45598b;
            this.f45933a = new CodedOutputStream.c(bArr, i12);
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: androidx.datastore.preferences.protobuf.w$i */
    public static abstract class i extends AbstractC22934w {
        @Override // androidx.datastore.preferences.protobuf.AbstractC22934w
        public final void K(AbstractC22932v abstractC22932v) {
            I(abstractC22932v);
        }

        public abstract boolean N(AbstractC22934w abstractC22934w, int i12, int i13);

        @Override // androidx.datastore.preferences.protobuf.AbstractC22934w, java.lang.Iterable
        public final Iterator<Byte> iterator() {
            return new a();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22934w
        public final int l() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22934w
        public byte r(int i12) {
            return d(i12);
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: androidx.datastore.preferences.protobuf.w$j */
    public static class j extends i {
        private static final long serialVersionUID = 1;

        /* renamed from: e, reason: collision with root package name */
        public final byte[] f45935e;

        public j(byte[] bArr) {
            bArr.getClass();
            this.f45935e = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22934w
        public final String E(Charset charset) {
            return new String(this.f45935e, O(), size(), charset);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22934w
        public final void I(AbstractC22932v abstractC22932v) {
            abstractC22932v.h(this.f45935e, O(), size());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22934w.i
        public final boolean N(AbstractC22934w abstractC22934w, int i12, int i13) {
            if (i13 > abstractC22934w.size()) {
                throw new IllegalArgumentException("Length too large: " + i13 + size());
            }
            int i14 = i12 + i13;
            if (i14 > abstractC22934w.size()) {
                StringBuilder sbY = androidx.appcompat.app.r.y(i12, i13, "Ran off end of other: ", ", ", ", ");
                sbY.append(abstractC22934w.size());
                throw new IllegalArgumentException(sbY.toString());
            }
            if (!(abstractC22934w instanceof j)) {
                return abstractC22934w.y(i12, i14).equals(y(0, i13));
            }
            j jVar = (j) abstractC22934w;
            int iO2 = O() + i13;
            int iO3 = O();
            int iO4 = jVar.O() + i12;
            while (iO3 < iO2) {
                if (this.f45935e[iO3] != jVar.f45935e[iO4]) {
                    return false;
                }
                iO3++;
                iO4++;
            }
            return true;
        }

        public int O() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22934w
        public final ByteBuffer b() {
            return ByteBuffer.wrap(this.f45935e, O(), size()).asReadOnlyBuffer();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22934w
        public byte d(int i12) {
            return this.f45935e[i12];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22934w
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC22934w) || size() != ((AbstractC22934w) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof j)) {
                return obj.equals(this);
            }
            j jVar = (j) obj;
            int i12 = this.f45927b;
            int i13 = jVar.f45927b;
            if (i12 == 0 || i13 == 0 || i12 == i13) {
                return N(jVar, 0, size());
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22934w
        public void i(byte[] bArr, int i12, int i13, int i14) {
            System.arraycopy(this.f45935e, i12, bArr, i13, i14);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22934w.i, androidx.datastore.preferences.protobuf.AbstractC22934w
        public byte r(int i12) {
            return this.f45935e[i12];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22934w
        public final boolean s() {
            int iO2 = O();
            return L1.f45728a.e(this.f45935e, iO2, size() + iO2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22934w
        public int size() {
            return this.f45935e.length;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22934w
        public final int v(int i12, int i13, int i14) {
            int iO2 = O() + i13;
            Charset charset = C22914m0.f45874a;
            for (int i15 = iO2; i15 < iO2 + i14; i15++) {
                i12 = (i12 * 31) + this.f45935e[i15];
            }
            return i12;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22934w
        public final int w(int i12, int i13, int i14) {
            int iO2 = O() + i13;
            return L1.f45728a.g(i12, this.f45935e, iO2, i14 + iO2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22934w
        public final AbstractC22934w y(int i12, int i13) {
            int iG2 = AbstractC22934w.g(i12, i13, size());
            if (iG2 == 0) {
                return AbstractC22934w.f45925c;
            }
            return new e(this.f45935e, O() + i12, iG2);
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: androidx.datastore.preferences.protobuf.w$l */
    public static final class l implements f {
        public l() {
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22934w.f
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
        f45926d = C22895g.a() ? new l(aVar) : new d(aVar);
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

    public static AbstractC22934w h(int i12, int i13, byte[] bArr) {
        g(i12, i12 + i13, bArr.length);
        return new j(f45926d.copyFrom(bArr, i12, i13));
    }

    public final byte[] C() {
        int size = size();
        if (size == 0) {
            return C22914m0.f45875b;
        }
        byte[] bArr = new byte[size];
        i(bArr, 0, 0, size);
        return bArr;
    }

    public abstract String E(Charset charset);

    public abstract void I(AbstractC22932v abstractC22932v);

    public abstract void K(AbstractC22932v abstractC22932v);

    public abstract ByteBuffer b();

    public abstract byte d(int i12);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iV2 = this.f45927b;
        if (iV2 == 0) {
            int size = size();
            iV2 = v(size, 0, size);
            if (iV2 == 0) {
                iV2 = 1;
            }
            this.f45927b = iV2;
        }
        return iV2;
    }

    public abstract void i(byte[] bArr, int i12, int i13, int i14);

    public abstract int l();

    public abstract byte r(int i12);

    public abstract boolean s();

    public abstract int size();

    @Override // java.lang.Iterable
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public g iterator() {
        return new a();
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract int v(int i12, int i13, int i14);

    public abstract int w(int i12, int i13, int i14);

    public abstract AbstractC22934w y(int i12, int i13);

    /* compiled from: ByteString.java */
    /* renamed from: androidx.datastore.preferences.protobuf.w$k */
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
