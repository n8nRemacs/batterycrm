package kotlinx.serialization.json.internal;

import androidx.compose.ui.platform.C22491k0;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.text.C43066x;
import kotlinx.serialization.InterfaceC43386e;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.AbstractC43393b;
import kotlinx.serialization.json.AbstractC43443a;
import kotlinx.serialization.json.C43448f;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.internal.M;

/* compiled from: StreamingJsonDecoder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/serialization/json/internal/i0;", "Lkotlinx/serialization/json/h;", "LM51/a;", "Lkotlinx/serialization/encoding/a;", "a", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public class i0 extends kotlinx.serialization.encoding.a implements kotlinx.serialization.json.h, M51.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AbstractC43443a f413090a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final WriteMode f413091b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final AbstractC43450a f413092c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final kotlinx.serialization.modules.f f413093d;

    /* renamed from: e, reason: collision with root package name */
    public int f413094e = -1;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public a f413095f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C43448f f413096g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final C f413097h;

    /* compiled from: StreamingJsonDecoder.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/i0$a;", "", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @X41.f
        @Y61.l
        public String f413098a;
    }

    /* compiled from: StreamingJsonDecoder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[WriteMode.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                WriteMode writeMode = WriteMode.f413034d;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                WriteMode writeMode2 = WriteMode.f413034d;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                WriteMode writeMode3 = WriteMode.f413034d;
                iArr[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public i0(@Y61.k AbstractC43443a abstractC43443a, @Y61.k WriteMode writeMode, @Y61.k AbstractC43450a abstractC43450a, @Y61.k SerialDescriptor serialDescriptor, @Y61.l a aVar) {
        this.f413090a = abstractC43443a;
        this.f413091b = writeMode;
        this.f413092c = abstractC43450a;
        this.f413093d = abstractC43443a.f412956b;
        this.f413095f = aVar;
        C43448f c43448f = abstractC43443a.f412955a;
        this.f413096g = c43448f;
        this.f413097h = c43448f.f412986f ? null : new C(serialDescriptor);
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    @Y61.k
    public final Decoder A(@Y61.k SerialDescriptor serialDescriptor) {
        return l0.a(serialDescriptor) ? new B(this.f413092c, this.f413090a) : this;
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public final float B() throws NumberFormatException {
        AbstractC43450a abstractC43450a = this.f413092c;
        String strL = abstractC43450a.l();
        try {
            float f12 = Float.parseFloat(strL);
            if (this.f413090a.f412955a.f412991k || !(Float.isInfinite(f12) || Float.isNaN(f12))) {
                return f12;
            }
            AbstractC43450a.q(abstractC43450a, "Unexpected special floating-point value " + Float.valueOf(f12) + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            AbstractC43450a.q(abstractC43450a, C22491k0.a('\'', "Failed to parse type 'float' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public final boolean C() {
        boolean z12;
        boolean z13;
        AbstractC43450a abstractC43450a = this.f413092c;
        int iY2 = abstractC43450a.y();
        if (iY2 == abstractC43450a.t().length()) {
            AbstractC43450a.q(abstractC43450a, "EOF", 0, null, 6);
            throw null;
        }
        if (abstractC43450a.t().charAt(iY2) == '\"') {
            iY2++;
            z12 = true;
        } else {
            z12 = false;
        }
        int iX2 = abstractC43450a.x(iY2);
        if (iX2 >= abstractC43450a.t().length() || iX2 == -1) {
            AbstractC43450a.q(abstractC43450a, "EOF", 0, null, 6);
            throw null;
        }
        int i12 = iX2 + 1;
        int iCharAt = abstractC43450a.t().charAt(iX2) | ' ';
        if (iCharAt == 102) {
            abstractC43450a.d(i12, "alse");
            z13 = false;
        } else {
            if (iCharAt != 116) {
                AbstractC43450a.q(abstractC43450a, "Expected valid boolean literal prefix, but had '" + abstractC43450a.l() + '\'', 0, null, 6);
                throw null;
            }
            abstractC43450a.d(i12, "rue");
            z13 = true;
        }
        if (z12) {
            if (abstractC43450a.f413049a == abstractC43450a.t().length()) {
                AbstractC43450a.q(abstractC43450a, "EOF", 0, null, 6);
                throw null;
            }
            if (abstractC43450a.t().charAt(abstractC43450a.f413049a) != '\"') {
                AbstractC43450a.q(abstractC43450a, "Expected closing quotation mark", 0, null, 6);
                throw null;
            }
            abstractC43450a.f413049a++;
        }
        return z13;
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public final boolean E() {
        C c12 = this.f413097h;
        return ((c12 != null ? c12.f413001b : false) || this.f413092c.B(true)) ? false : true;
    }

    @Override // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.c
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final kotlinx.serialization.modules.f getF412999b() {
        return this.f413093d;
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    @Y61.k
    public final kotlinx.serialization.encoding.c c(@Y61.k SerialDescriptor serialDescriptor) {
        AbstractC43443a abstractC43443a = this.f413090a;
        WriteMode writeModeB = s0.b(serialDescriptor, abstractC43443a);
        AbstractC43450a abstractC43450a = this.f413092c;
        M m12 = abstractC43450a.f413050b;
        int i12 = m12.f413018c + 1;
        m12.f413018c = i12;
        Object[] objArr = m12.f413016a;
        if (i12 == objArr.length) {
            int i13 = i12 * 2;
            m12.f413016a = Arrays.copyOf(objArr, i13);
            m12.f413017b = Arrays.copyOf(m12.f413017b, i13);
        }
        m12.f413016a[i12] = serialDescriptor;
        abstractC43450a.h(writeModeB.f413040b);
        if (abstractC43450a.v() == 4) {
            AbstractC43450a.q(abstractC43450a, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        int iOrdinal = writeModeB.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            return new i0(this.f413090a, writeModeB, this.f413092c, serialDescriptor, this.f413095f);
        }
        if (this.f413091b == writeModeB && abstractC43443a.f412955a.f412986f) {
            return this;
        }
        return new i0(this.f413090a, writeModeB, this.f413092c, serialDescriptor, this.f413095f);
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.c
    public final void d(@Y61.k SerialDescriptor serialDescriptor) {
        AbstractC43443a abstractC43443a = this.f413090a;
        if (abstractC43443a.f412955a.f412982b && serialDescriptor.getF412801c() == 0) {
            while (j(serialDescriptor) != -1) {
            }
        }
        AbstractC43450a abstractC43450a = this.f413092c;
        if (abstractC43450a.A() && !abstractC43443a.f412955a.f412995o) {
            D.e(abstractC43450a, "");
            throw null;
        }
        abstractC43450a.h(this.f413091b.f413041c);
        M m12 = abstractC43450a.f413050b;
        int i12 = m12.f413018c;
        int[] iArr = m12.f413017b;
        if (iArr[i12] == -2) {
            iArr[i12] = -1;
            m12.f413018c = i12 - 1;
        }
        int i13 = m12.f413018c;
        if (i13 != -1) {
            m12.f413018c = i13 - 1;
        }
    }

    @Override // kotlinx.serialization.json.h
    @Y61.k
    /* renamed from: e, reason: from getter */
    public final AbstractC43443a getF413063c() {
        return this.f413090a;
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public final double g() throws NumberFormatException {
        AbstractC43450a abstractC43450a = this.f413092c;
        String strL = abstractC43450a.l();
        try {
            double d12 = Double.parseDouble(strL);
            if (this.f413090a.f412955a.f412991k || !(Double.isInfinite(d12) || Double.isNaN(d12))) {
                return d12;
            }
            AbstractC43450a.q(abstractC43450a, "Unexpected special floating-point value " + Double.valueOf(d12) + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            AbstractC43450a.q(abstractC43450a, C22491k0.a('\'', "Failed to parse type 'double' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public final int h(@Y61.k SerialDescriptor serialDescriptor) {
        return L.b(serialDescriptor, this.f413090a, w(), " at path ".concat(this.f413092c.f413050b.a()));
    }

    @Override // kotlinx.serialization.json.h
    @Y61.k
    public final JsonElement i() {
        return new c0(this.f413090a.f412955a, this.f413092c).b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x0288, code lost:
    
        r11 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0109, code lost:
    
        if (r11 == null) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x010b, code lost:
    
        r1 = r11.f413000a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x010d, code lost:
    
        if (r9 >= 64) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x010f, code lost:
    
        r1.f412777c |= 1 << r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0119, code lost:
    
        r3 = (r9 >>> 6) - 1;
        r1 = r1.f412778d;
        r1[r3] = (1 << (r9 & 63)) | r1[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0144, code lost:
    
        r4.p(kotlin.text.C43066x.N(6, r4.z(0, r4.f413049a), r12), androidx.compose.ui.platform.C22491k0.a('\'', "Encountered an unknown key '", r12), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x015d, code lost:
    
        throw null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int j(@Y61.k kotlinx.serialization.descriptors.SerialDescriptor r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.i0.j(kotlinx.serialization.descriptors.SerialDescriptor):int");
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public final <T> T m(@Y61.k InterfaceC43386e<? extends T> interfaceC43386e) {
        AbstractC43450a abstractC43450a = this.f413092c;
        AbstractC43443a abstractC43443a = this.f413090a;
        try {
            if ((interfaceC43386e instanceof AbstractC43393b) && !abstractC43443a.f412955a.f412989i) {
                String strC = d0.c(interfaceC43386e.getF412706c(), abstractC43443a);
                String strU = abstractC43450a.u(strC, this.f413096g.f412983c);
                if (strU == null) {
                    return (T) d0.d(this, interfaceC43386e);
                }
                try {
                    InterfaceC43386e interfaceC43386eA = kotlinx.serialization.n.a((AbstractC43393b) interfaceC43386e, this, strU);
                    a aVar = new a();
                    aVar.f413098a = strC;
                    this.f413095f = aVar;
                    return (T) interfaceC43386eA.deserialize(this);
                } catch (SerializationException e12) {
                    AbstractC43450a.q(abstractC43450a, C43066x.X(".", C43066x.p0(e12.getMessage(), '\n')), 0, C43066x.l0('\n', e12.getMessage(), ""), 2);
                    throw null;
                }
            }
            return interfaceC43386e.deserialize(this);
        } catch (MissingFieldException e13) {
            if (C43066x.q(e13.getMessage(), "at path", false)) {
                throw e13;
            }
            throw new MissingFieldException(e13.f412702b, e13.getMessage() + " at path: " + abstractC43450a.f413050b.a(), e13);
        }
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public final byte n() {
        AbstractC43450a abstractC43450a = this.f413092c;
        long jI2 = abstractC43450a.i();
        byte b12 = (byte) jI2;
        if (jI2 == b12) {
            return b12;
        }
        AbstractC43450a.q(abstractC43450a, "Failed to parse byte for input '" + jI2 + '\'', 0, null, 6);
        throw null;
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public final long r() {
        return this.f413092c.i();
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public final short t() {
        AbstractC43450a abstractC43450a = this.f413092c;
        long jI2 = abstractC43450a.i();
        short s5 = (short) jI2;
        if (jI2 == s5) {
            return s5;
        }
        AbstractC43450a.q(abstractC43450a, "Failed to parse short for input '" + jI2 + '\'', 0, null, 6);
        throw null;
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public final char u() {
        AbstractC43450a abstractC43450a = this.f413092c;
        String strL = abstractC43450a.l();
        if (strL.length() == 1) {
            return strL.charAt(0);
        }
        AbstractC43450a.q(abstractC43450a, C22491k0.a('\'', "Expected single char, but got '", strL), 0, null, 6);
        throw null;
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.c
    public final <T> T v(@Y61.k SerialDescriptor serialDescriptor, int i12, @Y61.k InterfaceC43386e<? extends T> interfaceC43386e, @Y61.l T t12) {
        boolean z12 = this.f413091b == WriteMode.f413036f && (i12 & 1) == 0;
        AbstractC43450a abstractC43450a = this.f413092c;
        if (z12) {
            M m12 = abstractC43450a.f413050b;
            int[] iArr = m12.f413017b;
            int i13 = m12.f413018c;
            if (iArr[i13] == -2) {
                m12.f413016a[i13] = M.a.f413019a;
            }
        }
        T t13 = (T) m(interfaceC43386e);
        if (z12) {
            M m13 = abstractC43450a.f413050b;
            int[] iArr2 = m13.f413017b;
            int i14 = m13.f413018c;
            if (iArr2[i14] != -2) {
                int i15 = i14 + 1;
                m13.f413018c = i15;
                Object[] objArr = m13.f413016a;
                if (i15 == objArr.length) {
                    int i16 = i15 * 2;
                    m13.f413016a = Arrays.copyOf(objArr, i16);
                    m13.f413017b = Arrays.copyOf(m13.f413017b, i16);
                }
            }
            Object[] objArr2 = m13.f413016a;
            int i17 = m13.f413018c;
            objArr2[i17] = t13;
            m13.f413017b[i17] = -2;
        }
        return t13;
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    @Y61.k
    public final String w() {
        boolean z12 = this.f413096g.f412983c;
        AbstractC43450a abstractC43450a = this.f413092c;
        return z12 ? abstractC43450a.m() : abstractC43450a.j();
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public final int z() {
        AbstractC43450a abstractC43450a = this.f413092c;
        long jI2 = abstractC43450a.i();
        int i12 = (int) jI2;
        if (jI2 == i12) {
            return i12;
        }
        AbstractC43450a.q(abstractC43450a, "Failed to parse int for input '" + jI2 + '\'', 0, null, 6);
        throw null;
    }
}
