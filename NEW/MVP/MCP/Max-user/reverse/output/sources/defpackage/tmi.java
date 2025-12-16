package defpackage;

import android.os.SystemClock;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class tmi {
    public static final Object a = new Object();
    public static final Object b = new Object();
    public static boolean c;
    public static long d;
    public static final /* synthetic */ int e = 0;

    public static long a() throws UnknownHostException {
        char c2;
        long j;
        synchronized (b) {
        }
        InetAddress byName = InetAddress.getByName("time.android.com");
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jCurrentTimeMillis == 0) {
                Arrays.fill(bArr, 40, 48, (byte) 0);
                c2 = 0;
                j = jCurrentTimeMillis;
            } else {
                long j2 = jCurrentTimeMillis / 1000;
                long j3 = jCurrentTimeMillis - (j2 * 1000);
                c2 = 0;
                j = jCurrentTimeMillis;
                bArr[40] = (byte) (r14 >> 24);
                bArr[41] = (byte) (r14 >> 16);
                bArr[42] = (byte) (r14 >> 8);
                bArr[43] = (byte) (j2 + 2208988800L);
                long j4 = (j3 * 4294967296L) / 1000;
                bArr[44] = (byte) (j4 >> 24);
                bArr[45] = (byte) (j4 >> 16);
                bArr[46] = (byte) (j4 >> 8);
                bArr[47] = (byte) (Math.random() * 255.0d);
            }
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            long j5 = (jElapsedRealtime2 - jElapsedRealtime) + j;
            byte b2 = bArr[c2];
            int i = bArr[1] & 255;
            long jD = d(24, bArr);
            long jD2 = d(32, bArr);
            long jD3 = d(40, bArr);
            b((byte) ((b2 >> 6) & 3), (byte) (b2 & 7), i, jD3);
            long j6 = (j5 + (((jD3 - j5) + (jD2 - jD)) / 2)) - jElapsedRealtime2;
            datagramSocket.close();
            return j6;
        } finally {
        }
    }

    public static void b(byte b2, byte b3, int i, long j) throws IOException {
        if (b2 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b3 != 4 && b3 != 5) {
            StringBuilder sb = new StringBuilder(26);
            sb.append("SNTP: Untrusted mode: ");
            sb.append((int) b3);
            throw new IOException(sb.toString());
        }
        if (i != 0 && i <= 15) {
            if (j == 0) {
                throw new IOException("SNTP: Zero transmitTime");
            }
        } else {
            StringBuilder sb2 = new StringBuilder(36);
            sb2.append("SNTP: Untrusted stratum: ");
            sb2.append(i);
            throw new IOException(sb2.toString());
        }
    }

    public static long c(int i, byte[] bArr) {
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

    public static long d(int i, byte[] bArr) {
        long jC = c(i, bArr);
        long jC2 = c(i + 4, bArr);
        if (jC == 0 && jC2 == 0) {
            return 0L;
        }
        return ((jC2 * 1000) / 4294967296L) + ((jC - 2208988800L) * 1000);
    }

    public static final void e(esg esgVar) {
        esgVar.b(1, new a4e(29));
    }
}
