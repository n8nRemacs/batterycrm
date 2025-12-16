package defpackage;

import com.fasterxml.jackson.core.JsonGenerationException;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public abstract class zw7 implements Closeable, Flushable {
    static {
        v17.p(bmf.values());
        bmf.CAN_WRITE_FORMATTED_NUMBERS.c();
        bmf.CAN_WRITE_BINARY_NATIVELY.c();
    }

    public static void d(String str) {
        throw new JsonGenerationException(str, null, null);
    }

    public abstract void P(double d);

    public abstract void Q(float f);

    public abstract void Z(int i);

    public final void c(vmb vmbVar) throws IOException {
        int i = 1;
        while (true) {
            by7 by7VarZ = vmbVar.Z();
            if (by7VarZ == null) {
                return;
            }
            boolean z = false;
            switch (by7VarZ.d) {
                case 1:
                    l0();
                    break;
                case 2:
                    w();
                    i--;
                    if (i == 0) {
                        return;
                    } else {
                        continue;
                    }
                case 3:
                    k0();
                    break;
                case 4:
                    l();
                    i--;
                    if (i == 0) {
                        return;
                    } else {
                        continue;
                    }
                case 5:
                    y(vmbVar.B0());
                    continue;
                case 6:
                    by7 by7Var = vmbVar.b;
                    if (by7Var == by7.VALUE_STRING) {
                        z = true;
                    } else if (by7Var == by7.FIELD_NAME) {
                        z = vmbVar.z0;
                    }
                    if (z) {
                        n0(vmbVar.y(), vmbVar.Q(), vmbVar.P());
                    } else {
                        m0(vmbVar.w());
                        continue;
                    }
                case 7:
                    int iG0 = vmbVar.G0();
                    if (iG0 == 1) {
                        Z(vmbVar.E0());
                    } else if (iG0 == 3) {
                        j0(vmbVar.A0());
                    } else {
                        h0(vmbVar.F0());
                        continue;
                    }
                case 8:
                    int iG02 = vmbVar.G0();
                    if (iG02 == 6) {
                        i0(vmbVar.C0());
                    } else if (iG02 == 4) {
                        Q((float) vmbVar.D0());
                    } else {
                        P(vmbVar.D0());
                        continue;
                    }
                case 9:
                    i(true);
                    continue;
                case 10:
                    i(false);
                    continue;
                case 11:
                    v6i v6iVar = (v6i) this;
                    v6iVar.v0("write a null");
                    v6iVar.w0();
                    continue;
                case Protos.Attaches.Attach.PRESENT /* 12 */:
                    v6i v6iVar2 = (v6i) ((br6) this);
                    v6iVar2.v0("write a null");
                    v6iVar2.w0();
                    continue;
                default:
                    throw new IllegalStateException("Internal error: unknown current token, " + by7VarZ);
            }
            i++;
        }
    }

    public abstract void h0(long j);

    public abstract void i(boolean z);

    public abstract void i0(BigDecimal bigDecimal);

    public abstract void j0(BigInteger bigInteger);

    public abstract void k0();

    public abstract void l();

    public abstract void l0();

    public abstract void m0(String str);

    public abstract void n0(char[] cArr, int i, int i2);

    public abstract void w();

    public abstract void y(String str);
}
