package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.Toast;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.msgpack.core.MessageIntegerOverflowException;
import org.msgpack.core.buffer.OutputStreamBufferOutput;

/* loaded from: classes.dex */
public abstract class efi {
    public static Handler a;

    public static void a(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static Object b(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        try {
            return e(kl9.a(bArr).x0());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void c(ll9 ll9Var, Map map) throws IOException {
        ll9Var.y(map.size());
        for (Map.Entry entry : map.entrySet()) {
            d(ll9Var, entry.getKey());
            d(ll9Var, entry.getValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:201:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0368  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(defpackage.ll9 r23, java.lang.Object r24) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 943
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efi.d(ll9, java.lang.Object):void");
    }

    public static Object e(lyg lygVar) {
        switch (az1.v(lygVar.d())) {
            case 0:
                return null;
            case 1:
                return Boolean.valueOf(((kg7) lygVar).a);
            case 2:
                return Long.valueOf(lygVar.f().i());
            case 3:
                return Float.valueOf((float) ((og7) lygVar).a);
            case 4:
                return ((z1) lygVar.m()).y();
            case 5:
                return ByteBuffer.wrap(((z1) lygVar.o()).a).asReadOnlyBuffer();
            case 6:
                eg7 eg7VarC = lygVar.c();
                int length = eg7VarC.a.length;
                ArrayList arrayList = new ArrayList(length);
                for (int i = 0; i < length; i++) {
                    arrayList.add(e(eg7VarC.a[i]));
                }
                return arrayList;
            case 7:
                dh7 dh7VarG = lygVar.g();
                HashMap map = new HashMap(dh7VarG.a.length / 2);
                Iterator it = new ps(dh7VarG.a).iterator();
                while (true) {
                    dg7 dg7Var = (dg7) it;
                    if (!dg7Var.hasNext()) {
                        return map;
                    }
                    Map.Entry entry = (Map.Entry) dg7Var.next();
                    map.put(e((lyg) entry.getKey()), e((lyg) entry.getValue()));
                }
            default:
                throw new RuntimeException(ho7.i("Type ", xrf.w(lygVar.d()), " isn't yet implemented"));
        }
    }

    public static int f(tm9 tm9Var) {
        if (tm9Var.w().a() == 7) {
            return tm9Var.n0();
        }
        tm9Var.v();
        return 0;
    }

    public static boolean g(tm9 tm9Var) {
        if (tm9Var.w().a() == 2) {
            return tm9Var.p0();
        }
        tm9Var.v();
        return false;
    }

    public static Byte h(tm9 tm9Var) {
        if (tm9Var.w().a() == 3) {
            return Byte.valueOf(tm9Var.q0());
        }
        tm9Var.v();
        return null;
    }

    public static double i(tm9 tm9Var, double d) throws IOException {
        if (tm9Var.w().a() != 4) {
            tm9Var.v();
            return d;
        }
        byte b = tm9Var.readByte();
        if (b == -54) {
            return tm9Var.h0(4).getFloat(tm9Var.u0);
        }
        if (b == -53) {
            return tm9Var.h0(8).getDouble(tm9Var.u0);
        }
        throw tm9.m0(b, "Float");
    }

    public static float j(tm9 tm9Var) {
        if (tm9Var.w().a() == 4) {
            return tm9Var.r0();
        }
        tm9Var.v();
        return 0.0f;
    }

    public static int k(tm9 tm9Var, int i) {
        if (tm9Var.w().a() == 3) {
            return tm9Var.s0();
        }
        tm9Var.v();
        return i;
    }

    public static long l(tm9 tm9Var, long j) {
        if (tm9Var.w().a() == 3) {
            return tm9Var.t0();
        }
        tm9Var.v();
        return j;
    }

    public static int m(tm9 tm9Var) {
        if (tm9Var.w().a() == 8) {
            return tm9Var.u0();
        }
        tm9Var.v();
        return 0;
    }

    public static short n(tm9 tm9Var) throws IOException {
        if (tm9Var.w().a() != 3) {
            tm9Var.v();
            return (short) 0;
        }
        byte b = tm9Var.readByte();
        if (uvi.a(b)) {
            return b;
        }
        switch (b) {
            case -52:
                return (short) (tm9Var.readByte() & 255);
            case -51:
                short s = tm9Var.readShort();
                if (s >= 0) {
                    return s;
                }
                throw new MessageIntegerOverflowException(BigInteger.valueOf(s & 65535));
            case -50:
                int i = tm9Var.readInt();
                if (i < 0 || i > 32767) {
                    throw tm9.Q(i);
                }
                return (short) i;
            case -49:
                long j = tm9Var.readLong();
                if (j < 0 || j > 32767) {
                    throw tm9.Z(j);
                }
                return (short) j;
            case -48:
                return tm9Var.readByte();
            case -47:
                return tm9Var.readShort();
            case -46:
                int i2 = tm9Var.readInt();
                if (i2 < -32768 || i2 > 32767) {
                    throw new MessageIntegerOverflowException(BigInteger.valueOf(i2));
                }
                return (short) i2;
            case -45:
                long j2 = tm9Var.readLong();
                if (j2 < -32768 || j2 > 32767) {
                    throw new MessageIntegerOverflowException(BigInteger.valueOf(j2));
                }
                return (short) j2;
            default:
                throw tm9.m0(b, "Integer");
        }
    }

    public static String o(tm9 tm9Var) {
        if (tm9Var.w().a() == 5) {
            return tm9Var.w0();
        }
        tm9Var.v();
        return null;
    }

    public static String p(tm9 tm9Var, String str) {
        if (tm9Var.w().a() == 5) {
            return tm9Var.w0();
        }
        tm9Var.v();
        return str;
    }

    public static void q(Map map, ByteArrayOutputStream byteArrayOutputStream) {
        il9 il9Var = kl9.b;
        il9Var.getClass();
        ll9 ll9Var = new ll9(new OutputStreamBufferOutput(byteArrayOutputStream, 8192), il9Var);
        try {
            ll9Var.y(map.size());
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                ll9Var.Q(str);
                d(ll9Var, obj);
            }
        } finally {
            ll9Var.close();
        }
    }

    public static void r(Context context, String str, int i) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            Toast.makeText(context, str, i).show();
            return;
        }
        if (a == null) {
            a = new Handler(Looper.getMainLooper());
        }
        a.post(new mn1(context, str, i, 17));
    }

    public static ArrayList s(tm9 tm9Var, g5a g5aVar) {
        if (tm9Var.w().a() != 7) {
            tm9Var.v();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iN0 = tm9Var.n0();
        for (int i = 0; i < iN0; i++) {
            arrayList.add(g5aVar.p(tm9Var));
        }
        return arrayList;
    }
}
