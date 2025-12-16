package defpackage;

import android.os.SystemClock;
import android.os.Trace;
import android.util.Printer;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class am8 implements Printer {
    public long a;
    public long b;
    public long c;
    public final LinkedList d = new LinkedList();

    public static String a(String str) {
        int iD;
        String strM = vmf.M(vmf.M(str, ">>>>> Dispatching to "), "<<<<< Finished to ");
        int iH = vmf.H(": ", strM, 6);
        int iD2 = vmf.D(strM, "} ", 0, false, 6);
        String strSubstring = strM.substring(0, iD2 + 1);
        if (iH <= 0 && iD2 <= 0) {
            return strM;
        }
        int iD3 = vmf.D(strM, "DispatchedContinuation[Dispatchers.Main", 0, false, 6);
        if (iD3 >= 0) {
            int i = iD3 + 39;
            int iD4 = vmf.D(strM, ".immediate", i, false, 4);
            iD = iD4 >= 0 ? vmf.D(strM, ", Continuation at ", iD4 + 10, false, 4) : vmf.D(strM, ", Continuation at ", i, false, 4);
            if (iD >= 0) {
                iD += 18;
            }
        } else {
            iD = iD2 + 2;
        }
        int iG = vmf.G(strM, ']', 0, 6);
        Integer numValueOf = Integer.valueOf(iG);
        if (iG <= iD) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : strM.length();
        int iG2 = vmf.G(strM, '@', 0, 6);
        Integer numValueOf2 = iG2 > iD ? Integer.valueOf(iG2) : null;
        String strSubstring2 = strM.substring(iD, Math.min(numValueOf2 != null ? numValueOf2.intValue() : strM.length(), iIntValue));
        return !strSubstring2.equals("null") ? strSubstring2 : u45.k(strSubstring, " ", strM.substring(iH + 2));
    }

    @Override // android.util.Printer
    public final void println(String str) {
        if (str != null) {
            if (dnf.r(str, ">>>>> Dispatching to ", false)) {
                String strA = a(str);
                if (kfi.f()) {
                    Trace.beginSection(kfi.h(strA));
                }
                this.a = SystemClock.uptimeMillis();
                this.c++;
                return;
            }
            if (dnf.r(str, "<<<<< Finished to ", false)) {
                if (kfi.f()) {
                    Trace.endSection();
                }
                this.c--;
                this.b = System.currentTimeMillis();
                this.d.add(new zl8(a(str), this.a, this.b, this.c));
                this.a = 0L;
                this.b = 0L;
            }
        }
    }
}
