package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public class ee implements i6f {
    public static final kc3 f = new kc3(13);
    public final Method a;
    public final Method b;
    public final Method c;
    public final Method d;
    public final Class e;

    public ee(Class cls) {
        this.e = cls;
        this.a = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        this.b = cls.getMethod("setHostname", String.class);
        this.c = cls.getMethod("getAlpnSelectedProtocol", null);
        this.d = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // defpackage.i6f
    public final boolean a(SSLSocket sSLSocket) {
        return this.e.isInstance(sSLSocket);
    }

    @Override // defpackage.i6f
    public final boolean b() {
        boolean z = zd.e;
        return zd.e;
    }

    @Override // defpackage.i6f
    public final String c(SSLSocket sSLSocket) {
        if (this.e.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.c.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, StandardCharsets.UTF_8);
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (NullPointerException e2) {
                if (!fni.a(e2.getMessage(), "ssl == null")) {
                    throw e2;
                }
            } catch (InvocationTargetException e3) {
                throw new AssertionError(e3);
            }
        }
        return null;
    }

    @Override // defpackage.i6f
    public final void d(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.e.isInstance(sSLSocket)) {
            try {
                this.a.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.b.invoke(sSLSocket, str);
                }
                Method method = this.d;
                p2c p2cVar = p2c.a;
                method.invoke(sSLSocket, u1j.c(list));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }
}
