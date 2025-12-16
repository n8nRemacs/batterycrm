package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class hjb extends ulf {
    public static final byte[] p = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] q = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean o;

    public static boolean g(umb umbVar, byte[] bArr) {
        if (umbVar.a() < bArr.length) {
            return false;
        }
        int i = umbVar.b;
        byte[] bArr2 = new byte[bArr.length];
        umbVar.h(0, bArr2, bArr.length);
        umbVar.J(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // defpackage.ulf
    public final long b(umb umbVar) {
        byte[] bArr = umbVar.a;
        return (this.f * p4j.g(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // defpackage.ulf
    public final boolean d(umb umbVar, long j, vhb vhbVar) {
        if (g(umbVar, p)) {
            byte[] bArrCopyOf = Arrays.copyOf(umbVar.a, umbVar.c);
            int i = bArrCopyOf[9] & 255;
            ArrayList arrayListA = p4j.a(bArrCopyOf);
            if (((hf6) vhbVar.b) == null) {
                ff6 ff6Var = new ff6();
                ff6Var.l = xz9.n("audio/ogg");
                ff6Var.m = xz9.n("audio/opus");
                ff6Var.E = i;
                ff6Var.F = 48000;
                ff6Var.p = arrayListA;
                vhbVar.b = new hf6(ff6Var);
                return true;
            }
        } else {
            if (!g(umbVar, q)) {
                hsi.h((hf6) vhbVar.b);
                return false;
            }
            hsi.h((hf6) vhbVar.b);
            if (!this.o) {
                this.o = true;
                umbVar.K(8);
                ty9 ty9VarE = gri.e(wg7.k((String[]) gri.f(umbVar, false, false).a));
                if (ty9VarE != null) {
                    ff6 ff6VarA = ((hf6) vhbVar.b).a();
                    ff6VarA.k = ty9VarE.b(((hf6) vhbVar.b).l);
                    vhbVar.b = new hf6(ff6VarA);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // defpackage.ulf
    public final void f(boolean z) {
        super.f(z);
        if (z) {
            this.o = false;
        }
    }
}
