package defpackage;

import android.content.Context;
import androidx.media3.common.ParserException;
import java.io.EOFException;
import java.util.Arrays;
import org.apache.http.util.LangUtils;

/* loaded from: classes.dex */
public abstract class gt {
    public static final int[] a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static int a(u62 u62Var) throws ParserException {
        int i = u62Var.i(4);
        if (i == 15) {
            if (u62Var.b() >= 24) {
                return u62Var.i(24);
            }
            throw ParserException.a(null, "AAC header insufficient data");
        }
        if (i < 13) {
            return a[i];
        }
        throw ParserException.a(null, "AAC header wrong Sampling Frequency Index");
    }

    public static int b(Context context) {
        int iD = (context.getResources().getDisplayMetrics().widthPixels - (kti.d(12 * vw4.d().getDisplayMetrics().density) * 2)) / (kti.d(81 * vw4.d().getDisplayMetrics().density) + kti.d(4 * vw4.d().getDisplayMetrics().density));
        if (iD < 1) {
            return 1;
        }
        return iD;
    }

    public static d c(u62 u62Var, boolean z) throws ParserException {
        int i = u62Var.i(5);
        if (i == 31) {
            i = u62Var.i(6) + 32;
        }
        int iA = a(u62Var);
        int i2 = u62Var.i(4);
        String strF = ho7.f(i, "mp4a.40.");
        if (i == 5 || i == 29) {
            iA = a(u62Var);
            int i3 = u62Var.i(5);
            if (i3 == 31) {
                i3 = u62Var.i(6) + 32;
            }
            i = i3;
            if (i == 22) {
                i2 = u62Var.i(4);
            }
        }
        if (z) {
            if (i != 1 && i != 2 && i != 3 && i != 4 && i != 6 && i != 7 && i != 17) {
                switch (i) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw ParserException.c("Unsupported audio object type: " + i);
                }
            }
            if (u62Var.h()) {
                a8i.l("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (u62Var.h()) {
                u62Var.t(14);
            }
            boolean zH = u62Var.h();
            if (i2 == 0) {
                throw new UnsupportedOperationException();
            }
            if (i == 6 || i == 20) {
                u62Var.t(3);
            }
            if (zH) {
                if (i == 22) {
                    u62Var.t(16);
                }
                if (i == 17 || i == 19 || i == 20 || i == 23) {
                    u62Var.t(3);
                }
                u62Var.t(1);
            }
            switch (i) {
                case LangUtils.HASH_SEED /* 17 */:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int i4 = u62Var.i(2);
                    if (i4 == 2 || i4 == 3) {
                        throw ParserException.c("Unsupported epConfig: " + i4);
                    }
            }
        }
        int i5 = b[i2];
        if (i5 != -1) {
            return new d(iA, i5, strF);
        }
        throw ParserException.a(null, null);
    }

    public static sy9 d(hp5 hp5Var, boolean z) {
        os5 os5Var = z ? null : kc7.b;
        qyg qygVar = new qyg(10);
        sy9 sy9VarD = null;
        int i = 0;
        while (true) {
            try {
                hp5Var.i(0, qygVar.a, 10);
                qygVar.E(0);
                if (qygVar.u() != 4801587) {
                    break;
                }
                qygVar.F(3);
                int iR = qygVar.r();
                int i2 = iR + 10;
                if (sy9VarD == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(qygVar.a, 0, bArr, 0, 10);
                    hp5Var.i(10, bArr, iR);
                    sy9VarD = new kc7(os5Var).d(i2, bArr);
                } else {
                    hp5Var.q(iR);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        hp5Var.y();
        hp5Var.q(i);
        if (sy9VarD == null || sy9VarD.a.length == 0) {
            return null;
        }
        return sy9VarD;
    }

    public static h79 e(qyg qygVar) {
        qygVar.F(1);
        int iU = qygVar.u();
        long j = qygVar.b + iU;
        int i = iU / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long jM = qygVar.m();
            if (jM == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jM;
            jArrCopyOf2[i2] = qygVar.m();
            qygVar.F(2);
            i2++;
        }
        qygVar.F((int) (j - qygVar.b));
        return new h79(jArrCopyOf, 18, jArrCopyOf2);
    }
}
