package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class gs3 {
    public static final gs3 e;
    public static final gs3 f;
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    static {
        q93 q93Var = q93.q;
        q93 q93Var2 = q93.r;
        q93 q93Var3 = q93.s;
        q93 q93Var4 = q93.k;
        q93 q93Var5 = q93.m;
        q93 q93Var6 = q93.l;
        q93 q93Var7 = q93.n;
        q93 q93Var8 = q93.p;
        q93 q93Var9 = q93.o;
        q93[] q93VarArr = {q93Var, q93Var2, q93Var3, q93Var4, q93Var5, q93Var6, q93Var7, q93Var8, q93Var9};
        q93[] q93VarArr2 = {q93Var, q93Var2, q93Var3, q93Var4, q93Var5, q93Var6, q93Var7, q93Var8, q93Var9, q93.i, q93.j, q93.g, q93.h, q93.e, q93.f, q93.d};
        i21 i21Var = new i21(1);
        i21Var.b((q93[]) Arrays.copyOf(q93VarArr, 9));
        qbg qbgVar = qbg.TLS_1_3;
        qbg qbgVar2 = qbg.TLS_1_2;
        i21Var.d(qbgVar, qbgVar2);
        if (!i21Var.b) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        i21Var.c = true;
        i21Var.a();
        i21 i21Var2 = new i21(1);
        i21Var2.b((q93[]) Arrays.copyOf(q93VarArr2, 16));
        i21Var2.d(qbgVar, qbgVar2);
        if (!i21Var2.b) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        i21Var2.c = true;
        e = i21Var2.a();
        i21 i21Var3 = new i21(1);
        i21Var3.b((q93[]) Arrays.copyOf(q93VarArr2, 16));
        i21Var3.d(qbgVar, qbgVar2, qbg.TLS_1_1, qbg.TLS_1_0);
        if (!i21Var3.b) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        i21Var3.c = true;
        i21Var3.a();
        f = new gs3(false, false, null, null);
    }

    public gs3(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.a = z;
        this.b = z2;
        this.c = strArr;
        this.d = strArr2;
    }

    public final List a() {
        String[] strArr = this.c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(q93.t.R(str));
        }
        return ue3.d0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !yxg.i(strArr, sSLSocket.getEnabledProtocols(), xca.b)) {
            return false;
        }
        String[] strArr2 = this.c;
        return strArr2 == null || yxg.i(strArr2, sSLSocket.getEnabledCipherSuites(), q93.b);
    }

    public final List c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(dfi.c(str));
        }
        return ue3.d0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gs3)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        gs3 gs3Var = (gs3) obj;
        boolean z = gs3Var.a;
        boolean z2 = this.a;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.c, gs3Var.c) && Arrays.equals(this.d, gs3Var.d) && this.b == gs3Var.b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.a) {
            return 17;
        }
        String[] strArr = this.c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.b ? 1 : 0);
    }

    public final String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.b + ')';
    }
}
