package kotlin.reflect.jvm.internal.impl.protobuf;

import com.adjust.sdk.Constants;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import kotlin.reflect.jvm.internal.impl.protobuf.s;

/* compiled from: ByteString.java */
/* loaded from: classes8.dex */
public abstract class d implements Iterable<Byte> {

    /* renamed from: b, reason: collision with root package name */
    public static final d f409332b = new n(new byte[0]);

    /* compiled from: ByteString.java */
    public interface a extends Iterator<Byte> {
        byte nextByte();
    }

    public static d a(Iterator<d> it, int i12) {
        if (i12 == 1) {
            return it.next();
        }
        int i13 = i12 >>> 1;
        return a(it, i13).b(a(it, i12 - i13));
    }

    public static d d(String str) {
        try {
            return new n(str.getBytes(Constants.ENCODING));
        } catch (UnsupportedEncodingException e12) {
            throw new RuntimeException("UTF-8 not supported?", e12);
        }
    }

    public static b r() {
        return new b();
    }

    public abstract void C(OutputStream outputStream, int i12, int i13);

    public final d b(d dVar) {
        d dVarPop;
        int size = size();
        int size2 = dVar.size();
        if (size + size2 >= 2147483647L) {
            StringBuilder sb2 = new StringBuilder(53);
            sb2.append("ByteString would be too long: ");
            sb2.append(size);
            sb2.append("+");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        }
        int[] iArr = s.f409385i;
        s sVar = this instanceof s ? (s) this : null;
        if (dVar.size() == 0) {
            return this;
        }
        if (size() == 0) {
            return dVar;
        }
        int size3 = dVar.size() + size();
        if (size3 < 128) {
            int size4 = size();
            int size5 = dVar.size();
            byte[] bArr = new byte[size4 + size5];
            e(bArr, 0, 0, size4);
            dVar.e(bArr, 0, size4, size5);
            return new n(bArr);
        }
        if (sVar != null) {
            d dVar2 = sVar.f409388e;
            if (dVar.size() + dVar2.size() < 128) {
                int size6 = dVar2.size();
                int size7 = dVar.size();
                byte[] bArr2 = new byte[size6 + size7];
                dVar2.e(bArr2, 0, 0, size6);
                dVar.e(bArr2, 0, size6, size7);
                return new s(sVar.f409387d, new n(bArr2));
            }
        }
        if (sVar != null) {
            d dVar3 = sVar.f409387d;
            int iH2 = dVar3.h();
            d dVar4 = sVar.f409388e;
            if (iH2 > dVar4.h()) {
                if (sVar.f409390g > dVar.h()) {
                    return new s(dVar3, new s(dVar4, dVar));
                }
            }
        }
        if (size3 >= s.f409385i[Math.max(h(), dVar.h()) + 1]) {
            dVarPop = new s(this, dVar);
        } else {
            s.b bVar = new s.b();
            bVar.a(this);
            bVar.a(dVar);
            Stack<d> stack = bVar.f409392a;
            dVarPop = stack.pop();
            while (!stack.isEmpty()) {
                dVarPop = new s(stack.pop(), dVarPop);
            }
        }
        return dVarPop;
    }

    public final void e(byte[] bArr, int i12, int i13, int i14) {
        if (i12 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Source offset < 0: ");
            sb2.append(i12);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i13 < 0) {
            StringBuilder sb3 = new StringBuilder(30);
            sb3.append("Target offset < 0: ");
            sb3.append(i13);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        if (i14 < 0) {
            StringBuilder sb4 = new StringBuilder(23);
            sb4.append("Length < 0: ");
            sb4.append(i14);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        int i15 = i12 + i14;
        if (i15 > size()) {
            StringBuilder sb5 = new StringBuilder(34);
            sb5.append("Source end offset < 0: ");
            sb5.append(i15);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
        int i16 = i13 + i14;
        if (i16 <= bArr.length) {
            if (i14 > 0) {
                g(bArr, i12, i13, i14);
            }
        } else {
            StringBuilder sb6 = new StringBuilder(34);
            sb6.append("Target end offset < 0: ");
            sb6.append(i16);
            throw new IndexOutOfBoundsException(sb6.toString());
        }
    }

    public abstract void g(byte[] bArr, int i12, int i13, int i14);

    public abstract int h();

    public abstract boolean i();

    public abstract boolean j();

    @Override // java.lang.Iterable
    /* renamed from: l */
    public abstract a iterator();

    public abstract int s(int i12, int i13, int i14);

    public abstract int size();

    public abstract int t(int i12, int i13, int i14);

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract int v();

    public abstract String w();

    public final String y() {
        try {
            return w();
        } catch (UnsupportedEncodingException e12) {
            throw new RuntimeException("UTF-8 not supported?", e12);
        }
    }

    /* compiled from: ByteString.java */
    public static final class b extends OutputStream {

        /* renamed from: g, reason: collision with root package name */
        public static final byte[] f409333g = new byte[0];

        /* renamed from: d, reason: collision with root package name */
        public int f409336d;

        /* renamed from: f, reason: collision with root package name */
        public int f409338f;

        /* renamed from: b, reason: collision with root package name */
        public final int f409334b = 128;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList<d> f409335c = new ArrayList<>();

        /* renamed from: e, reason: collision with root package name */
        public byte[] f409337e = new byte[128];

        public final void a(int i12) {
            this.f409335c.add(new n(this.f409337e));
            int length = this.f409336d + this.f409337e.length;
            this.f409336d = length;
            this.f409337e = new byte[Math.max(this.f409334b, Math.max(i12, length >>> 1))];
            this.f409338f = 0;
        }

        public final void b() {
            int i12 = this.f409338f;
            byte[] bArr = this.f409337e;
            int length = bArr.length;
            ArrayList<d> arrayList = this.f409335c;
            if (i12 >= length) {
                arrayList.add(new n(this.f409337e));
                this.f409337e = f409333g;
            } else if (i12 > 0) {
                byte[] bArr2 = new byte[i12];
                System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i12));
                arrayList.add(new n(bArr2));
            }
            this.f409336d += this.f409338f;
            this.f409338f = 0;
        }

        public final synchronized d c() {
            ArrayList<d> arrayList;
            b();
            arrayList = this.f409335c;
            d dVar = d.f409332b;
            if (arrayList == null) {
                ArrayList<d> arrayList2 = new ArrayList<>();
                Iterator<d> it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(it.next());
                }
                arrayList = arrayList2;
            }
            return arrayList.isEmpty() ? d.f409332b : d.a(arrayList.iterator(), arrayList.size());
        }

        public final String toString() {
            int i12;
            String hexString = Integer.toHexString(System.identityHashCode(this));
            synchronized (this) {
                i12 = this.f409336d + this.f409338f;
            }
            return String.format("<ByteString.Output@%s size=%d>", hexString, Integer.valueOf(i12));
        }

        @Override // java.io.OutputStream
        public final synchronized void write(int i12) {
            try {
                if (this.f409338f == this.f409337e.length) {
                    a(1);
                }
                byte[] bArr = this.f409337e;
                int i13 = this.f409338f;
                this.f409338f = i13 + 1;
                bArr[i13] = (byte) i12;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // java.io.OutputStream
        public final synchronized void write(byte[] bArr, int i12, int i13) {
            try {
                byte[] bArr2 = this.f409337e;
                int length = bArr2.length;
                int i14 = this.f409338f;
                if (i13 <= length - i14) {
                    System.arraycopy(bArr, i12, bArr2, i14, i13);
                    this.f409338f += i13;
                } else {
                    int length2 = bArr2.length - i14;
                    System.arraycopy(bArr, i12, bArr2, i14, length2);
                    int i15 = i13 - length2;
                    a(i15);
                    System.arraycopy(bArr, i12 + length2, this.f409337e, 0, i15);
                    this.f409338f = i15;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
