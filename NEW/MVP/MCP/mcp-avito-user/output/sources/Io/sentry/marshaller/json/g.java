package io.sentry.marshaller.json;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.l;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import oX0.AbstractC44703c;

/* compiled from: SentryJsonGenerator.java */
/* loaded from: classes8.dex */
public class g extends JsonGenerator {

    /* renamed from: h, reason: collision with root package name */
    public static final org.slf4j.a f405218h = org.slf4j.b.d(io.sentry.util.b.class);

    /* renamed from: c, reason: collision with root package name */
    public int f405219c;

    /* renamed from: d, reason: collision with root package name */
    public int f405220d;

    /* renamed from: e, reason: collision with root package name */
    public int f405221e;

    /* renamed from: f, reason: collision with root package name */
    public int f405222f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractC44703c f405223g;

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void A() {
        this.f405223g.A();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void B() {
        this.f405223g.B();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void F(l lVar) {
        this.f405223g.F(lVar);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void G(String str) {
        this.f405223g.G(str);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void H() {
        this.f405223g.H();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void I(double d12) {
        this.f405223g.I(d12);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void J(float f12) {
        this.f405223g.J(f12);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void L(int i12) {
        this.f405223g.L(i12);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void M(long j12) {
        this.f405223g.M(j12);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void N(String str) {
        this.f405223g.N(str);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void O(BigDecimal bigDecimal) {
        this.f405223g.O(bigDecimal);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void P(BigInteger bigInteger) {
        this.f405223g.P(bigInteger);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void U(char c12) {
        this.f405223g.U(c12);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void V(int i12, char[] cArr) {
        this.f405223g.V(i12, cArr);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void X(String str) {
        this.f405223g.X(str);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void Z(String str) {
        this.f405223g.Z(str);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void a0() {
        this.f405223g.a0();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f405223g.close();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void e0() {
        this.f405223g.e0();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Flushable
    public final void flush() {
        this.f405223g.flush();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final com.fasterxml.jackson.core.g g() {
        return this.f405223g.f413836f;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void h0(l lVar) {
        this.f405223g.h0(lVar);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final boolean i(JsonGenerator.Feature feature) {
        return this.f405223g.i(feature);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void i0(String str) {
        this.f405223g.i0(str);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void j0(char[] cArr, int i12, int i13) {
        this.f405223g.j0(cArr, i12, i13);
    }

    public final void m0() {
        this.f405223g.i0("...");
    }

    public final void n0(int i12, Object obj) {
        int i13 = this.f405222f;
        AbstractC44703c abstractC44703c = this.f405223g;
        if (i12 >= i13) {
            abstractC44703c.i0("<recursion limit hit>");
            return;
        }
        if (obj == null) {
            abstractC44703c.H();
            return;
        }
        boolean zIsArray = obj.getClass().isArray();
        int i14 = this.f405219c;
        int i15 = 0;
        if (!zIsArray) {
            boolean z12 = obj instanceof Map;
            int i16 = this.f405220d;
            if (z12) {
                abstractC44703c.e0();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    if (i15 >= this.f405221e) {
                        break;
                    }
                    if (entry.getKey() == null) {
                        abstractC44703c.G("null");
                    } else {
                        abstractC44703c.G(io.sentry.util.b.d(i16, entry.getKey().toString()));
                    }
                    n0(i12 + 1, entry.getValue());
                    i15++;
                }
                abstractC44703c.B();
                return;
            }
            if (!(obj instanceof Collection)) {
                if (obj instanceof String) {
                    abstractC44703c.i0(io.sentry.util.b.d(i16, (String) obj));
                    return;
                }
                try {
                    abstractC44703c.writeObject(obj);
                    return;
                } catch (IllegalStateException unused) {
                    f405218h.k("Couldn't marshal '{}' of type '{}', had to be converted into a String", obj, obj.getClass());
                    try {
                        abstractC44703c.i0(io.sentry.util.b.d(i16, obj.toString()));
                        return;
                    } catch (Exception unused2) {
                        abstractC44703c.i0("<exception calling toString on object>");
                        return;
                    }
                }
            }
            abstractC44703c.a0();
            Iterator it = ((Collection) obj).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (i15 >= i14) {
                    m0();
                    break;
                } else {
                    n0(i12 + 1, next);
                    i15++;
                }
            }
            abstractC44703c.A();
            return;
        }
        abstractC44703c.a0();
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            while (i15 < bArr.length && i15 < i14) {
                abstractC44703c.L(bArr[i15]);
                i15++;
            }
            if (bArr.length > i14) {
                m0();
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            while (i15 < sArr.length && i15 < i14) {
                abstractC44703c.L(sArr[i15]);
                i15++;
            }
            if (sArr.length > i14) {
                m0();
            }
        } else if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            while (i15 < iArr.length && i15 < i14) {
                abstractC44703c.L(iArr[i15]);
                i15++;
            }
            if (iArr.length > i14) {
                m0();
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            while (i15 < jArr.length && i15 < i14) {
                abstractC44703c.M(jArr[i15]);
                i15++;
            }
            if (jArr.length > i14) {
                m0();
            }
        } else if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            while (i15 < fArr.length && i15 < i14) {
                abstractC44703c.J(fArr[i15]);
                i15++;
            }
            if (fArr.length > i14) {
                m0();
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            while (i15 < dArr.length && i15 < i14) {
                abstractC44703c.I(dArr[i15]);
                i15++;
            }
            if (dArr.length > i14) {
                m0();
            }
        } else if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            while (i15 < cArr.length && i15 < i14) {
                abstractC44703c.i0(String.valueOf(cArr[i15]));
                i15++;
            }
            if (cArr.length > i14) {
                m0();
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            while (i15 < zArr.length && i15 < i14) {
                abstractC44703c.y(zArr[i15]);
                i15++;
            }
            if (zArr.length > i14) {
                m0();
            }
        } else {
            Object[] objArr = (Object[]) obj;
            while (i15 < objArr.length && i15 < i14) {
                n0(i12 + 1, objArr[i15]);
                i15++;
            }
            if (objArr.length > i14) {
                m0();
            }
        }
        abstractC44703c.A();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final int u(Base64Variant base64Variant, InputStream inputStream, int i12) {
        return this.f405223g.u(base64Variant, inputStream, i12);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeObject(Object obj) {
        n0(0, obj);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void x(Base64Variant base64Variant, byte[] bArr, int i12, int i13) {
        this.f405223g.x(base64Variant, bArr, i12, i13);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void y(boolean z12) {
        this.f405223g.y(z12);
    }
}
