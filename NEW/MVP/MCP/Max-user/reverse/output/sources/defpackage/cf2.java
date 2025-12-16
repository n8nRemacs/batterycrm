package defpackage;

import android.os.SystemClock;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.a;
import com.google.android.gms.tasks.Task;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class cf2 implements lva {
    public int a;
    public long b;
    public long c;
    public Object d;
    public Object o;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0031 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ls3 b(defpackage.wai r4, com.google.android.gms.common.internal.a r5, int r6) {
        /*
            cwi r5 = r5.E0
            r0 = 0
            if (r5 != 0) goto L7
            r5 = r0
            goto L9
        L7:
            ls3 r5 = r5.d
        L9:
            if (r5 == 0) goto L35
            boolean r1 = r5.b
            if (r1 == 0) goto L35
            int[] r1 = r5.d
            r2 = 0
            if (r1 != 0) goto L24
            int[] r1 = r5.X
            if (r1 != 0) goto L19
            goto L2b
        L19:
            int r3 = r1.length
            if (r2 >= r3) goto L2b
            r3 = r1[r2]
            if (r3 != r6) goto L21
            goto L35
        L21:
            int r2 = r2 + 1
            goto L19
        L24:
            int r3 = r1.length
            if (r2 >= r3) goto L35
            r3 = r1[r2]
            if (r3 != r6) goto L32
        L2b:
            int r4 = r4.n
            int r6 = r5.o
            if (r4 >= r6) goto L35
            return r5
        L32:
            int r2 = r2 + 1
            goto L24
        L35:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cf2.b(wai, com.google.android.gms.common.internal.a, int):ls3");
    }

    public df2 a() {
        if (((List) this.o) == null) {
            this.o = Collections.EMPTY_LIST;
        }
        return new df2((jf2) this.d, this.a, this.b, this.c, (List) this.o);
    }

    @Override // defpackage.lva
    public void p(Task task) {
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        long j2;
        if (((xv6) this.d).a()) {
            vsd vsdVar = (vsd) usd.h().b;
            if (vsdVar == null || vsdVar.b) {
                wai waiVar = (wai) ((xv6) this.d).t0.get((cm) this.o);
                if (waiVar != null) {
                    fl flVar = waiVar.d;
                    if (flVar instanceof a) {
                        a aVar = (a) flVar;
                        int i5 = 0;
                        boolean z = this.b > 0;
                        int i6 = aVar.z0;
                        int i7 = 100;
                        if (vsdVar != null) {
                            z &= vsdVar.c;
                            int i8 = vsdVar.d;
                            int i9 = vsdVar.o;
                            i = vsdVar.a;
                            if (aVar.E0 != null && !aVar.c()) {
                                ls3 ls3VarB = b(waiVar, aVar, this.a);
                                if (ls3VarB == null) {
                                    return;
                                }
                                boolean z2 = ls3VarB.c && this.b > 0;
                                i9 = ls3VarB.o;
                                z = z2;
                            }
                            i3 = i8;
                            i2 = i9;
                        } else {
                            i = 0;
                            i2 = 100;
                            i3 = 5000;
                        }
                        xv6 xv6Var = (xv6) this.d;
                        int iElapsedRealtime = -1;
                        if (task.h()) {
                            i4 = 0;
                        } else if (((ybj) task).d) {
                            i4 = i7;
                            i5 = -1;
                        } else {
                            Exception excE = task.e();
                            if (excE instanceof ApiException) {
                                Status status = ((ApiException) excE).a;
                                i7 = status.a;
                                es3 es3Var = status.d;
                                if (es3Var != null) {
                                    i5 = es3Var.b;
                                    i4 = i7;
                                }
                                i4 = i7;
                                i5 = -1;
                            } else {
                                i4 = 101;
                                i5 = -1;
                            }
                        }
                        if (z) {
                            long j3 = this.b;
                            long j4 = this.c;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j4);
                            j2 = jCurrentTimeMillis;
                            j = j3;
                        } else {
                            j = 0;
                            j2 = 0;
                        }
                        ebi ebiVar = new ebi(new mz9(this.a, i4, i5, j, j2, null, null, i6, iElapsedRealtime), i, i3, i2);
                        y1a y1aVar = xv6Var.w0;
                        y1aVar.sendMessage(y1aVar.obtainMessage(18, ebiVar));
                    }
                }
            }
        }
    }
}
