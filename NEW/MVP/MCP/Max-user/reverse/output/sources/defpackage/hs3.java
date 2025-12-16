package defpackage;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class hs3 {
    public int a;
    public boolean b;
    public boolean c;
    public final List d;

    public hs3(List list) {
        this.d = list;
    }

    public final gs3 a(SSLSocket sSLSocket) throws UnknownServiceException, CloneNotSupportedException {
        boolean z;
        gs3 gs3Var;
        boolean z2;
        int i = this.a;
        List list = this.d;
        int size = list.size();
        while (true) {
            z = true;
            if (i >= size) {
                gs3Var = null;
                break;
            }
            gs3Var = (gs3) list.get(i);
            if (gs3Var.b(sSLSocket)) {
                this.a = i + 1;
                break;
            }
            i++;
        }
        if (gs3Var == null) {
            throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.c + ", modes=" + list + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
        }
        String[] strArr = gs3Var.c;
        String[] strArr2 = gs3Var.d;
        int i2 = this.a;
        int size2 = list.size();
        while (true) {
            if (i2 >= size2) {
                z2 = false;
                break;
            }
            if (((gs3) list.get(i2)).b(sSLSocket)) {
                z2 = true;
                break;
            }
            i2++;
        }
        this.b = z2;
        boolean z3 = this.c;
        String[] strArrO = strArr != null ? yxg.o(sSLSocket.getEnabledCipherSuites(), strArr, q93.b) : sSLSocket.getEnabledCipherSuites();
        String[] strArrO2 = strArr2 != null ? yxg.o(sSLSocket.getEnabledProtocols(), strArr2, xca.b) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        s55 s55Var = q93.b;
        byte[] bArr = yxg.a;
        int length = supportedCipherSuites.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                i3 = -1;
                break;
            }
            boolean z4 = z;
            if (s55Var.compare(supportedCipherSuites[i3], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i3++;
            z = z4;
        }
        if (z3 && i3 != -1) {
            String str = supportedCipherSuites[i3];
            strArrO = (String[]) Arrays.copyOf(strArrO, strArrO.length + 1);
            strArrO[strArrO.length - 1] = str;
        }
        i21 i21Var = new i21(false);
        i21Var.b = gs3Var.a;
        i21Var.d = strArr;
        i21Var.e = strArr2;
        i21Var.c = gs3Var.b;
        i21Var.c((String[]) Arrays.copyOf(strArrO, strArrO.length));
        i21Var.e((String[]) Arrays.copyOf(strArrO2, strArrO2.length));
        gs3 gs3VarA = i21Var.a();
        if (gs3VarA.c() != null) {
            sSLSocket.setEnabledProtocols(gs3VarA.d);
        }
        if (gs3VarA.a() != null) {
            sSLSocket.setEnabledCipherSuites(gs3VarA.c);
        }
        return gs3Var;
    }
}
