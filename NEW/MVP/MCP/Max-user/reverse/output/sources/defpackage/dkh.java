package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.math.RoundingMode;
import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public final class dkh implements ekh, fkh {
    public static final int[] n = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] o = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, HttpStatus.SC_TEMPORARY_REDIRECT, 337, 371, HttpStatus.SC_REQUEST_TIMEOUT, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public static final int[] p = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] q = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, HttpStatus.SC_TEMPORARY_REDIRECT, 337, 371, HttpStatus.SC_REQUEST_TIMEOUT, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public final /* synthetic */ int a = 0;
    public final int b;
    public final byte[] c;
    public final int d;
    public int e;
    public long f;
    public int g;
    public long h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;

    public dkh(jp5 jp5Var, rfg rfgVar, jkh jkhVar) throws ParserException {
        this.i = jp5Var;
        this.j = rfgVar;
        this.k = jkhVar;
        int i = jkhVar.b;
        int iMax = Math.max(1, i / 10);
        this.d = iMax;
        byte[] bArr = jkhVar.e;
        int length = bArr.length;
        byte b = bArr[0];
        byte b2 = bArr[1];
        int i2 = ((bArr[3] & 255) << 8) | (bArr[2] & 255);
        this.b = i2;
        int i3 = jkhVar.a;
        int i4 = jkhVar.c;
        int i5 = (((i4 - (i3 * 4)) * 8) / (jkhVar.d * i3)) + 1;
        if (i2 != i5) {
            StringBuilder sb = new StringBuilder(56);
            sb.append("Expected frames per block: ");
            sb.append(i5);
            sb.append("; got: ");
            sb.append(i2);
            throw ParserException.a(null, sb.toString());
        }
        int iF = xxg.f(iMax, i2);
        this.c = new byte[iF * i4];
        this.l = new qyg(i2 * 2 * i3 * iF);
        int i6 = ((i4 * i) * 8) / i2;
        ef6 ef6Var = new ef6();
        ef6Var.k = "audio/raw";
        ef6Var.f = i6;
        ef6Var.g = i6;
        ef6Var.l = iMax * 2 * i3;
        ef6Var.x = i3;
        ef6Var.y = i;
        ef6Var.z = 2;
        this.m = new gf6(ef6Var);
    }

    @Override // defpackage.ekh, defpackage.fkh
    public final void a(long j) {
        switch (this.a) {
            case 0:
                this.e = 0;
                this.f = j;
                this.g = 0;
                this.h = 0L;
                break;
            default:
                this.e = 0;
                this.f = j;
                this.g = 0;
                this.h = 0L;
                break;
        }
    }

    @Override // defpackage.ekh, defpackage.fkh
    public final void b(int i, long j) {
        switch (this.a) {
            case 0:
                ((jp5) this.i).N(new kkh((jkh) this.k, this.b, i, j));
                ((rfg) this.j).d((gf6) this.m);
                break;
            default:
                ((kp5) this.i).Q(new lkh((jkh) this.k, this.b, i, j));
                sfg sfgVar = (sfg) this.j;
                sfgVar.d((hf6) this.m);
                sfgVar.getClass();
                break;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004b A[ADDED_TO_REGION, EDGE_INSN: B:42:0x004b->B:14:0x004b BREAK  A[LOOP:0: B:6:0x0029->B:13:0x0045], REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0042 -> B:4:0x0026). Please report as a decompilation issue!!! */
    @Override // defpackage.fkh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(defpackage.ip5 r25, long r26) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkh.c(ip5, long):boolean");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004b A[ADDED_TO_REGION, EDGE_INSN: B:42:0x004b->B:14:0x004b BREAK  A[LOOP:0: B:6:0x0029->B:13:0x0045], REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0042 -> B:4:0x0026). Please report as a decompilation issue!!! */
    @Override // defpackage.ekh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(defpackage.hp5 r25, long r26) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkh.d(hp5, long):boolean");
    }

    public final void e(int i) {
        int i2 = this.a;
        Object obj = this.j;
        Object obj2 = this.k;
        switch (i2) {
            case 0:
                long jH = this.f + xxg.H(this.h, 1000000L, r2.b);
                int i3 = i * 2 * ((jkh) obj2).a;
                ((rfg) obj).b(jH, 1, i3, this.g - i3, null);
                this.h += i;
                this.g -= i3;
                break;
            default:
                long j = this.f;
                long j2 = this.h;
                jkh jkhVar = (jkh) obj2;
                long j3 = jkhVar.b;
                String str = zxg.a;
                long jE0 = j + zxg.e0(j2, 1000000L, j3, RoundingMode.DOWN);
                int i4 = i * 2 * jkhVar.a;
                ((sfg) obj).a(jE0, 1, i4, this.g - i4, null);
                this.h += i;
                this.g -= i4;
                break;
        }
    }

    public dkh(kp5 kp5Var, sfg sfgVar, jkh jkhVar) throws androidx.media3.common.ParserException {
        this.i = kp5Var;
        this.j = sfgVar;
        this.k = jkhVar;
        int i = jkhVar.b;
        int iMax = Math.max(1, i / 10);
        this.d = iMax;
        umb umbVar = new umb(jkhVar.e);
        umbVar.q();
        int iQ = umbVar.q();
        this.b = iQ;
        int i2 = jkhVar.a;
        int i3 = jkhVar.c;
        int i4 = (((i3 - (i2 * 4)) * 8) / (jkhVar.d * i2)) + 1;
        if (iQ == i4) {
            int iF = zxg.f(iMax, iQ);
            this.c = new byte[iF * i3];
            this.l = new umb(iQ * 2 * i2 * iF);
            int i5 = ((i3 * i) * 8) / iQ;
            ff6 ff6Var = new ff6();
            ff6Var.m = xz9.n("audio/raw");
            ff6Var.h = i5;
            ff6Var.i = i5;
            ff6Var.n = iMax * 2 * i2;
            ff6Var.E = i2;
            ff6Var.F = i;
            ff6Var.G = 2;
            this.m = new hf6(ff6Var);
            return;
        }
        throw androidx.media3.common.ParserException.a(null, "Expected frames per block: " + i4 + "; got: " + iQ);
    }
}
