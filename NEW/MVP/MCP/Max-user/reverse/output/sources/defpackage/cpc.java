package defpackage;

import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* loaded from: classes.dex */
public final class cpc implements qqa {
    public static final Charset f = Charset.forName("UTF-8");
    public static final wu5 g = new wu5("key", az1.p(az1.o(bpc.class, new ly(1))));
    public static final wu5 h = new wu5(SdkMetricStatEvent.VALUE_KEY, az1.p(az1.o(bpc.class, new ly(2))));
    public static final mw7 i = new mw7(1);
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final pqa d;
    public final dpc e = new dpc(this, 0);

    public cpc(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, pqa pqaVar) {
        this.a = byteArrayOutputStream;
        this.b = map;
        this.c = map2;
        this.d = pqaVar;
    }

    public static int g(wu5 wu5Var) {
        bpc bpcVar = (bpc) wu5Var.b(bpc.class);
        if (bpcVar != null) {
            return ((ly) bpcVar).a;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    @Override // defpackage.qqa
    public final qqa a(wu5 wu5Var, Object obj) {
        c(wu5Var, obj, true);
        return this;
    }

    public final void b(wu5 wu5Var, int i2, boolean z) {
        if (z && i2 == 0) {
            return;
        }
        bpc bpcVar = (bpc) wu5Var.b(bpc.class);
        if (bpcVar == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        h(((ly) bpcVar).a << 3);
        h(i2);
    }

    public final void c(wu5 wu5Var, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            h((g(wu5Var) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            h(bytes.length);
            this.a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                c(wu5Var, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                f(i, wu5Var, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (z && dDoubleValue == 0.0d) {
                return;
            }
            h((g(wu5Var) << 3) | 1);
            this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(dDoubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == 0.0f) {
                return;
            }
            h((g(wu5Var) << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long jLongValue = ((Number) obj).longValue();
            if (z && jLongValue == 0) {
                return;
            }
            bpc bpcVar = (bpc) wu5Var.b(bpc.class);
            if (bpcVar == null) {
                throw new EncodingException("Field has no @Protobuf config");
            }
            h(((ly) bpcVar).a << 3);
            i(jLongValue);
            return;
        }
        if (obj instanceof Boolean) {
            b(wu5Var, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            h((g(wu5Var) << 3) | 2);
            h(bArr.length);
            this.a.write(bArr);
            return;
        }
        pqa pqaVar = (pqa) this.b.get(obj.getClass());
        if (pqaVar != null) {
            f(pqaVar, wu5Var, obj, z);
            return;
        }
        oyg oygVar = (oyg) this.c.get(obj.getClass());
        if (oygVar != null) {
            dpc dpcVar = this.e;
            dpcVar.b = false;
            dpcVar.d = wu5Var;
            dpcVar.c = z;
            oygVar.a(obj, dpcVar);
            return;
        }
        if (obj instanceof yoc) {
            b(wu5Var, ((yoc) obj).a(), true);
        } else if (obj instanceof Enum) {
            b(wu5Var, ((Enum) obj).ordinal(), true);
        } else {
            f(this.d, wu5Var, obj, z);
        }
    }

    @Override // defpackage.qqa
    public final qqa d(wu5 wu5Var, int i2) {
        b(wu5Var, i2, true);
        return this;
    }

    @Override // defpackage.qqa
    public final qqa e(wu5 wu5Var, long j) throws IOException {
        if (j == 0) {
            return this;
        }
        bpc bpcVar = (bpc) wu5Var.b(bpc.class);
        if (bpcVar == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        h(((ly) bpcVar).a << 3);
        i(j);
        return this;
    }

    public final void f(pqa pqaVar, wu5 wu5Var, Object obj, boolean z) throws IOException {
        w28 w28Var = new w28(0);
        w28Var.b = 0L;
        try {
            OutputStream outputStream = this.a;
            this.a = w28Var;
            try {
                pqaVar.a(obj, this);
                this.a = outputStream;
                long j = w28Var.b;
                w28Var.close();
                if (z && j == 0) {
                    return;
                }
                h((g(wu5Var) << 3) | 2);
                i(j);
                pqaVar.a(obj, this);
            } catch (Throwable th) {
                this.a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                w28Var.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void h(int i2) throws IOException {
        while ((i2 & (-128)) != 0) {
            this.a.write((i2 & 127) | 128);
            i2 >>>= 7;
        }
        this.a.write(i2 & 127);
    }

    public final void i(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.a.write(((int) j) & 127);
    }
}
