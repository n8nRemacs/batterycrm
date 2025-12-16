package defpackage;

import java.net.ProtocolException;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public abstract class kcj {
    public static m1j a;

    public static boolean a(qyg qygVar, x16 x16Var, int i, n7 n7Var) {
        long jT = qygVar.t();
        long j = jT >>> 16;
        if (j != i) {
            return false;
        }
        boolean z = (j & 1) == 1;
        int i2 = (int) ((jT >> 12) & 15);
        int i3 = (int) ((jT >> 8) & 15);
        int i4 = (int) ((jT >> 4) & 15);
        int i5 = (int) ((jT >> 1) & 7);
        boolean z2 = (jT & 1) == 1;
        if (i4 <= 7) {
            if (i4 != x16Var.h - 1) {
                return false;
            }
        } else if (i4 > 10 || x16Var.h != 2) {
            return false;
        }
        if (!(i5 == 0 || i5 == x16Var.j) || z2) {
            return false;
        }
        try {
            long jA = qygVar.A();
            if (!z) {
                jA *= x16Var.c;
            }
            n7Var.a = jA;
            int iC = c(i2, qygVar);
            if (iC == -1 || iC > x16Var.c) {
                return false;
            }
            int i6 = x16Var.f;
            if (i3 != 0) {
                if (i3 <= 11) {
                    if (i3 != x16Var.g) {
                        return false;
                    }
                } else if (i3 != 12) {
                    if (i3 > 14) {
                        return false;
                    }
                    int iX = qygVar.x();
                    if (i3 == 14) {
                        iX *= 10;
                    }
                    if (iX != i6) {
                        return false;
                    }
                } else if (qygVar.s() * 1000 != i6) {
                    return false;
                }
            }
            int iS = qygVar.s();
            int i7 = qygVar.b;
            byte[] bArr = qygVar.a;
            int i8 = i7 - 1;
            int i9 = 0;
            for (int i10 = qygVar.b; i10 < i8; i10++) {
                i9 = xxg.n[i9 ^ (bArr[i10] & 255)];
            }
            int i11 = xxg.a;
            return iS == i9;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static lk6 b(String str) {
        int i;
        String strSubstring;
        boolean zR = dnf.r(str, "HTTP/1.", false);
        epc epcVar = epc.HTTP_1_0;
        if (zR) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                epcVar = epc.HTTP_1_1;
            }
        } else {
            if (!dnf.r(str, "ICY ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i = 4;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            int i3 = Integer.parseInt(str.substring(i, i2));
            if (str.length() <= i2) {
                strSubstring = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i + 4);
            }
            return new lk6(epcVar, i3, strSubstring, 25);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public static int c(int i, qyg qygVar) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return qygVar.s() + 1;
            case 7:
                return qygVar.x() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case Protos.Attaches.Attach.PRESENT /* 12 */:
            case 13:
            case Protos.Attaches.Attach.LOCATION /* 14 */:
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    public static synchronized fcj d(String str) {
        fcj fcjVar;
        byte b = (byte) (((byte) (0 | 1)) | 2);
        if (b != 3) {
            StringBuilder sb = new StringBuilder();
            if ((b & 1) == 0) {
                sb.append(" enableFirelog");
            }
            if ((b & 2) == 0) {
                sb.append(" firelogEventType");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        bcj bcjVar = new bcj(str, 1);
        synchronized (kcj.class) {
            try {
                if (a == null) {
                    a = new m1j(2);
                }
                fcjVar = (fcj) a.l0(bcjVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fcjVar;
        return fcjVar;
    }
}
