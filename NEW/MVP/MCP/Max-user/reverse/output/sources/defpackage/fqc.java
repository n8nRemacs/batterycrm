package defpackage;

import android.util.SparseArray;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* loaded from: classes.dex */
public final class fqc implements fp5 {
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public q16 i;
    public jp5 j;
    public boolean k;
    public final y9g a = new y9g(0);
    public final qyg c = new qyg(4096);
    public final SparseArray b = new SparseArray();
    public final bqc d = new bqc(0);

    @Override // defpackage.fp5
    public final void d(long j, long j2) {
        long j3;
        SparseArray sparseArray = this.b;
        y9g y9gVar = this.a;
        synchronized (y9gVar) {
            j3 = y9gVar.b;
        }
        boolean z = j3 == -9223372036854775807L;
        if (!z) {
            long jC = y9gVar.c();
            z = (jC == -9223372036854775807L || jC == 0 || jC == j2) ? false : true;
        }
        if (z) {
            y9gVar.d(j2);
        }
        q16 q16Var = this.i;
        if (q16Var != null) {
            q16Var.e(j2);
        }
        for (int i = 0; i < sparseArray.size(); i++) {
            dqc dqcVar = (dqc) sparseArray.valueAt(i);
            dqcVar.f = false;
            dqcVar.a.a();
        }
    }

    @Override // defpackage.fp5
    public final void g(jp5 jp5Var) {
        this.j = jp5Var;
    }

    @Override // defpackage.fp5
    public final boolean h(hp5 hp5Var) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        mm4 mm4Var = (mm4) hp5Var;
        mm4Var.n(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            mm4Var.b(bArr[13] & 7, false);
            mm4Var.n(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0232  */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    @Override // defpackage.fp5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(defpackage.hp5 r28, defpackage.n7 r29) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 807
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fqc.i(hp5, n7):int");
    }

    @Override // defpackage.fp5
    public final void release() {
    }
}
