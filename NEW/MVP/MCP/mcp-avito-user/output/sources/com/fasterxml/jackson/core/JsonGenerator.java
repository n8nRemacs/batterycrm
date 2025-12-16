package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.util.C;
import java.io.Closeable;
import java.io.Flushable;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public abstract class JsonGenerator implements Closeable, Flushable, r {

    /* renamed from: b, reason: collision with root package name */
    public k f341039b;

    public enum Feature {
        AUTO_CLOSE_TARGET(true),
        AUTO_CLOSE_JSON_CONTENT(true),
        FLUSH_PASSED_TO_STREAM(true),
        QUOTE_FIELD_NAMES(true),
        QUOTE_NON_NUMERIC_NUMBERS(true),
        ESCAPE_NON_ASCII(false),
        WRITE_NUMBERS_AS_STRINGS(false),
        WRITE_BIGDECIMAL_AS_PLAIN(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNKNOWN(false);


        /* renamed from: b, reason: collision with root package name */
        public final boolean f341051b;

        /* renamed from: c, reason: collision with root package name */
        public final int f341052c = 1 << ordinal();

        Feature(boolean z12) {
            this.f341051b = z12;
        }

        public static int a() {
            int i12 = 0;
            for (Feature feature : values()) {
                if (feature.f341051b) {
                    i12 |= feature.f341052c;
                }
            }
            return i12;
        }

        public final boolean b(int i12) {
            return (i12 & this.f341052c) != 0;
        }
    }

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f341053a;

        static {
            int[] iArr = new int[WritableTypeId.Inclusion.values().length];
            f341053a = iArr;
            try {
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f341053a[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f341053a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f341053a[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f341053a[0] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        com.fasterxml.jackson.core.util.i.a(StreamWriteCapability.values());
        int i12 = StreamWriteCapability.CAN_WRITE_FORMATTED_NUMBERS.f341114b;
        int i13 = StreamWriteCapability.CAN_WRITE_BINARY_NATIVELY.f341114b;
    }

    public static void b(int i12, int i13) {
        if (i13 > i12) {
            throw new IllegalArgumentException(String.format("invalid argument(s) (offset=%d, length=%d) for input array of %d element", 0, Integer.valueOf(i13), Integer.valueOf(i12)));
        }
    }

    public abstract void A();

    public abstract void B();

    public void D(long j12) {
        G(Long.toString(j12));
    }

    public abstract void F(l lVar);

    public abstract void G(String str);

    public abstract void H();

    public abstract void I(double d12);

    public abstract void J(float f12);

    public abstract void L(int i12);

    public abstract void M(long j12);

    public abstract void N(String str);

    public abstract void O(BigDecimal bigDecimal);

    public abstract void P(BigInteger bigInteger);

    public void Q(short s5) {
        L(s5);
    }

    public final void R(String str) {
        G(str);
        e0();
    }

    public void S(Object obj) throws JsonGenerationException {
        throw new JsonGenerationException("No native support for writing Object Ids", this);
    }

    public void T() throws JsonGenerationException {
        throw new JsonGenerationException("No native support for writing Object Ids", this);
    }

    public abstract void U(char c12);

    public abstract void V(int i12, char[] cArr);

    public void W(l lVar) {
        X(lVar.getValue());
    }

    public abstract void X(String str);

    public void Y(l lVar) {
        Z(lVar.getValue());
    }

    public abstract void Z(String str);

    public final void a(String str) throws JsonGenerationException {
        throw new JsonGenerationException(str, this);
    }

    public abstract void a0();

    public void b0(int i12, Object obj) {
        d0();
        j(obj);
    }

    public boolean c() {
        return this instanceof C;
    }

    public void c0(Object obj) {
        a0();
        j(obj);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public boolean d() {
        return false;
    }

    @Deprecated
    public void d0() {
        a0();
    }

    public abstract void e0();

    public boolean f() {
        return false;
    }

    public void f0(Object obj) {
        e0();
        j(obj);
    }

    @Override // java.io.Flushable
    public abstract void flush();

    public abstract g g();

    public void g0(Object obj) {
        e0();
        j(obj);
    }

    public k h() {
        return this.f341039b;
    }

    public abstract void h0(l lVar);

    public abstract boolean i(Feature feature);

    public abstract void i0(String str);

    public void j(Object obj) {
        g gVarG = g();
        if (gVarG != null) {
            gVarG.g(obj);
        }
    }

    public abstract void j0(char[] cArr, int i12, int i13);

    public final void k0(String str, String str2) {
        G(str);
        i0(str2);
    }

    public void l0(Object obj) throws JsonGenerationException {
        throw new JsonGenerationException("No native support for writing Type Ids", this);
    }

    public void m(k kVar) {
        this.f341039b = kVar;
    }

    public void n(int i12, int[] iArr) {
        if (iArr == null) {
            throw new IllegalArgumentException("null array");
        }
        b(iArr.length, i12);
        b0(i12, iArr);
        for (int i13 = 0; i13 < i12; i13++) {
            L(iArr[i13]);
        }
        A();
    }

    public void o(double[] dArr, int i12) {
        if (dArr == null) {
            throw new IllegalArgumentException("null array");
        }
        b(dArr.length, i12);
        b0(i12, dArr);
        for (int i13 = 0; i13 < i12; i13++) {
            I(dArr[i13]);
        }
        A();
    }

    public void p(long[] jArr, int i12) {
        if (jArr == null) {
            throw new IllegalArgumentException("null array");
        }
        b(jArr.length, i12);
        b0(i12, jArr);
        for (int i13 = 0; i13 < i12; i13++) {
            M(jArr[i13]);
        }
        A();
    }

    public final void q(String str) {
        G(str);
        a0();
    }

    public abstract int u(Base64Variant base64Variant, InputStream inputStream, int i12);

    public abstract void writeObject(Object obj);

    public abstract void x(Base64Variant base64Variant, byte[] bArr, int i12, int i13);

    public abstract void y(boolean z12);

    public void z(Object obj) throws JsonGenerationException {
        if (obj == null) {
            H();
        } else {
            if (!(obj instanceof byte[])) {
                throw new JsonGenerationException("No native support for writing embedded objects of type ".concat(obj.getClass().getName()), this);
            }
            byte[] bArr = (byte[]) obj;
            x(com.fasterxml.jackson.core.a.f341119b, bArr, 0, bArr.length);
        }
    }

    public void k(int i12) {
    }
}
