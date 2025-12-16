package defpackage;

import android.os.SystemClock;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.errors.TamErrorException;

/* loaded from: classes.dex */
public abstract class vmi {
    public static final Object a = new Object();
    public static final Object b = new Object();
    public static boolean c;
    public static long d;

    public static long a() {
        byte b2;
        SocketTimeoutException socketTimeoutException;
        byte[] bArr;
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            Object obj = b;
            synchronized (obj) {
            }
            datagramSocket.setSoTimeout(1000);
            synchronized (obj) {
            }
            InetAddress[] allByName = InetAddress.getAllByName("time.android.com");
            int length = allByName.length;
            byte b3 = 0;
            SocketTimeoutException socketTimeoutException2 = null;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                byte[] bArr2 = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr2, 48, allByName[i], 123);
                bArr2[b3] = 27;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (jCurrentTimeMillis == 0) {
                    Arrays.fill(bArr2, 40, 48, b3);
                    b2 = b3;
                    socketTimeoutException = socketTimeoutException2;
                    bArr = bArr2;
                } else {
                    long j = jCurrentTimeMillis / 1000;
                    long j2 = jCurrentTimeMillis - (j * 1000);
                    b2 = b3;
                    socketTimeoutException = socketTimeoutException2;
                    long j3 = j + 2208988800L;
                    bArr = bArr2;
                    bArr[40] = (byte) (j3 >> 24);
                    bArr[41] = (byte) (j3 >> 16);
                    bArr[42] = (byte) (j3 >> 8);
                    bArr[43] = (byte) j3;
                    long j4 = (j2 * 4294967296L) / 1000;
                    bArr[44] = (byte) (j4 >> 24);
                    bArr[45] = (byte) (j4 >> 16);
                    bArr[46] = (byte) (j4 >> 8);
                    bArr[47] = (byte) (Math.random() * 255.0d);
                }
                datagramSocket.send(datagramPacket);
                byte[] bArr3 = bArr;
                try {
                    datagramSocket.receive(new DatagramPacket(bArr3, 48));
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j5 = (jElapsedRealtime2 - jElapsedRealtime) + jCurrentTimeMillis;
                    byte b4 = bArr3[b2];
                    int i3 = bArr3[1] & 255;
                    long jH = h(24, bArr3);
                    long jH2 = h(32, bArr3);
                    long jH3 = h(40, bArr3);
                    b((byte) ((b4 >> 6) & 3), (byte) (b4 & 7), i3, jH3);
                    long j6 = (j5 + (((jH3 - j5) + (jH2 - jH)) / 2)) - jElapsedRealtime2;
                    datagramSocket.close();
                    return j6;
                } catch (SocketTimeoutException e) {
                    if (socketTimeoutException == null) {
                        socketTimeoutException2 = e;
                    } else {
                        SocketTimeoutException socketTimeoutException3 = socketTimeoutException;
                        socketTimeoutException3.addSuppressed(e);
                        socketTimeoutException2 = socketTimeoutException3;
                    }
                    int i4 = i2 + 1;
                    if (i2 >= 10) {
                        break;
                    }
                    i++;
                    i2 = i4;
                    b3 = b2;
                }
            }
            socketTimeoutException2.getClass();
            throw socketTimeoutException2;
        } finally {
        }
    }

    public static void b(byte b2, byte b3, int i, long j) throws IOException {
        if (b2 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b3 != 4 && b3 != 5) {
            throw new IOException(ho7.f(b3, "SNTP: Untrusted mode: "));
        }
        if (i == 0 || i > 15) {
            throw new IOException(ho7.f(i, "SNTP: Untrusted stratum: "));
        }
        if (j == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    public static s5g c(pzf pzfVar) {
        uzf uzfVarB = a6a.b(pzfVar);
        if (uzfVarB.equals(qzf.a)) {
            return new n5g(mvd.E);
        }
        if (uzfVarB.equals(rzf.a)) {
            return new n5g(mvd.F);
        }
        if (uzfVarB.equals(szf.a)) {
            return new n5g(mvd.I);
        }
        if (uzfVarB instanceof tzf) {
            return new r5g(((tzf) uzfVarB).a);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static s5g d(Throwable th) {
        TamErrorException tamErrorException = th instanceof TamErrorException ? (TamErrorException) th : null;
        return c(tamErrorException != null ? tamErrorException.a : null);
    }

    public static boolean e(pzf pzfVar) {
        String str = pzfVar != null ? pzfVar.b : null;
        if (!(pzfVar instanceof vzf) || str == null || str.length() == 0) {
            return false;
        }
        return str.contentEquals("password.invalid") || str.contentEquals("hint.invalid") || str.contentEquals("password2fa.wrong") || str.contentEquals("email.wrong") || str.contentEquals("email.compromised");
    }

    public static boolean f(Throwable th) {
        String str;
        if (th instanceof IOException) {
            return true;
        }
        if (!(th instanceof TamErrorException) || (str = ((TamErrorException) th).a.b) == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -1923846901:
                return str.equals("proto.state");
            case -1582981336:
                return str.equals("service.timeout");
            case -1202230471:
                return str.equals("session.state");
            case -870493304:
                return str.equals("proto.payload");
            case -755046460:
                return str.equals("track.not.found");
            case -192382585:
                return str.equals("io.exception");
            case -93784873:
                return str.equals("password2fa.no.attempts");
            case 570410685:
                return str.equals("internal");
            case 1484015372:
                return str.equals("phone.not.checked");
            case 1562713945:
                return str.equals("too.many.requests");
            case 1571810967:
                return str.equals("service.unavailable");
            default:
                return false;
        }
    }

    public static long g(int i, byte[] bArr) {
        int i2 = bArr[i];
        int i3 = bArr[i + 1];
        int i4 = bArr[i + 2];
        int i5 = bArr[i + 3];
        if ((i2 & 128) == 128) {
            i2 = (i2 & 127) + 128;
        }
        if ((i3 & 128) == 128) {
            i3 = (i3 & 127) + 128;
        }
        if ((i4 & 128) == 128) {
            i4 = (i4 & 127) + 128;
        }
        if ((i5 & 128) == 128) {
            i5 = (i5 & 127) + 128;
        }
        return (i2 << 24) + (i3 << 16) + (i4 << 8) + i5;
    }

    public static long h(int i, byte[] bArr) {
        long jG = g(i, bArr);
        long jG2 = g(i + 4, bArr);
        if (jG == 0 && jG2 == 0) {
            return 0L;
        }
        return ((jG2 * 1000) / 4294967296L) + ((jG - 2208988800L) * 1000);
    }

    public static final Object i(x74 x74Var, cm6 cm6Var, Continuation continuation) {
        return svi.i(x74Var, new aq7(cm6Var, null), continuation);
    }
}
