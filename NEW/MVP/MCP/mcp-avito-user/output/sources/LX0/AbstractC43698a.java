package lX0;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.g;
import com.fasterxml.jackson.core.l;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import oX0.C44702b;
import oX0.C44705e;

/* compiled from: GeneratorBase.java */
/* renamed from: lX0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC43698a extends JsonGenerator {

    /* renamed from: g, reason: collision with root package name */
    public static final int f413832g = (JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.f341052c | JsonGenerator.Feature.ESCAPE_NON_ASCII.f341052c) | JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.f341052c;

    /* renamed from: c, reason: collision with root package name */
    public ObjectMapper f413833c;

    /* renamed from: d, reason: collision with root package name */
    public int f413834d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f413835e;

    /* renamed from: f, reason: collision with root package name */
    public C44705e f413836f;

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void F(l lVar) {
        G(lVar.getValue());
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void Y(l lVar) {
        o0("write raw value");
        W(lVar);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void Z(String str) {
        o0("write raw value");
        X(str);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void f0(Object obj) {
        e0();
        if (obj != null) {
            j(obj);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final g g() {
        return this.f413836f;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void h0(l lVar) {
        i0(lVar.getValue());
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final boolean i(JsonGenerator.Feature feature) {
        return (feature.f341052c & this.f413834d) != 0;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void j(Object obj) {
        C44705e c44705e = this.f413836f;
        if (c44705e != null) {
            c44705e.f419837g = obj;
        }
    }

    public final String m0(BigDecimal bigDecimal) throws JsonGenerationException {
        if (!JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN.b(this.f413834d)) {
            return bigDecimal.toString();
        }
        int iScale = bigDecimal.scale();
        if (iScale >= -9999 && iScale <= 9999) {
            return bigDecimal.toPlainString();
        }
        a(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", Integer.valueOf(iScale), 9999, 9999));
        throw null;
    }

    public void n0(int i12, int i13) {
        if ((f413832g & i13) == 0) {
            return;
        }
        this.f413835e = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.b(i12);
        JsonGenerator.Feature feature = JsonGenerator.Feature.ESCAPE_NON_ASCII;
        if (feature.b(i13)) {
            if (feature.b(i12)) {
                k(127);
            } else {
                k(0);
            }
        }
        JsonGenerator.Feature feature2 = JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
        if (feature2.b(i13)) {
            if (!feature2.b(i12)) {
                C44705e c44705e = this.f413836f;
                c44705e.f419834d = null;
                this.f413836f = c44705e;
            } else {
                C44705e c44705e2 = this.f413836f;
                if (c44705e2.f419834d == null) {
                    c44705e2.f419834d = new C44702b(this);
                    this.f413836f = c44705e2;
                }
            }
        }
    }

    public abstract void o0(String str);

    public JsonGenerator p0(JsonGenerator.Feature feature) {
        int i12 = feature.f341052c;
        this.f413834d &= ~i12;
        if ((i12 & f413832g) != 0) {
            if (feature == JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS) {
                this.f413835e = false;
            } else if (feature == JsonGenerator.Feature.ESCAPE_NON_ASCII) {
                k(0);
            } else if (feature == JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION) {
                C44705e c44705e = this.f413836f;
                c44705e.f419834d = null;
                this.f413836f = c44705e;
            }
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int u(Base64Variant base64Variant, InputStream inputStream, int i12) {
        throw new UnsupportedOperationException("Operation not supported by generator of type ".concat(getClass().getName()));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeObject(Object obj) {
        if (obj == null) {
            H();
            return;
        }
        ObjectMapper objectMapper = this.f413833c;
        if (objectMapper != null) {
            objectMapper.a(this, obj);
            return;
        }
        if (obj instanceof String) {
            i0((String) obj);
            return;
        }
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if (number instanceof Integer) {
                L(number.intValue());
                return;
            }
            if (number instanceof Long) {
                M(number.longValue());
                return;
            }
            if (number instanceof Double) {
                I(number.doubleValue());
                return;
            }
            if (number instanceof Float) {
                J(number.floatValue());
                return;
            }
            if (number instanceof Short) {
                Q(number.shortValue());
                return;
            }
            if (number instanceof Byte) {
                Q(number.byteValue());
                return;
            }
            if (number instanceof BigInteger) {
                P((BigInteger) number);
                return;
            }
            if (number instanceof BigDecimal) {
                O((BigDecimal) number);
                return;
            } else if (number instanceof AtomicInteger) {
                L(((AtomicInteger) number).get());
                return;
            } else if (number instanceof AtomicLong) {
                M(((AtomicLong) number).get());
                return;
            }
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            x(com.fasterxml.jackson.core.a.f341119b, bArr, 0, bArr.length);
            return;
        } else if (obj instanceof Boolean) {
            y(((Boolean) obj).booleanValue());
            return;
        } else if (obj instanceof AtomicBoolean) {
            y(((AtomicBoolean) obj).get());
            return;
        }
        throw new IllegalStateException("No ObjectCodec defined for the generator, can only serialize simple wrapper types (type passed " + obj.getClass().getName() + ")");
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
