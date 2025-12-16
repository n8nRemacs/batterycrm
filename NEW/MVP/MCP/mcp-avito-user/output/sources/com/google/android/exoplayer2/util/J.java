package com.google.android.exoplayer2.util;

import android.os.SystemClock;
import com.google.android.exoplayer2.upstream.Loader;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;

/* compiled from: SntpClient.java */
/* loaded from: classes6.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f348084a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f348085b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @j.B
    public static boolean f348086c;

    /* compiled from: SntpClient.java */
    public interface b {
    }

    public static void a() throws Throwable {
        DatagramSocket datagramSocket;
        synchronized (f348085b) {
        }
        InetAddress byName = InetAddress.getByName("time.android.com");
        DatagramSocket datagramSocket2 = new DatagramSocket();
        try {
            datagramSocket2.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long jCurrentTimeMillis = System.currentTimeMillis();
            SystemClock.elapsedRealtime();
            if (jCurrentTimeMillis == 0) {
                Arrays.fill(bArr, 40, 48, (byte) 0);
                datagramSocket = datagramSocket2;
            } else {
                long j12 = jCurrentTimeMillis / 1000;
                long j13 = jCurrentTimeMillis - (j12 * 1000);
                long j14 = j12 + 2208988800L;
                bArr[40] = (byte) (j14 >> 24);
                bArr[41] = (byte) (j14 >> 16);
                datagramSocket = datagramSocket2;
                try {
                    bArr[42] = (byte) (j14 >> 8);
                    bArr[43] = (byte) j14;
                    long j15 = (j13 * 4294967296L) / 1000;
                    bArr[44] = (byte) (j15 >> 24);
                    bArr[45] = (byte) (j15 >> 16);
                    bArr[46] = (byte) (j15 >> 8);
                    bArr[47] = (byte) (Math.random() * 255.0d);
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    try {
                        datagramSocket.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            }
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            SystemClock.elapsedRealtime();
            byte b12 = bArr[0];
            int i12 = bArr[1] & 255;
            d(24, bArr);
            d(32, bArr);
            b((byte) ((b12 >> 6) & 3), (byte) (b12 & 7), i12, d(40, bArr));
            datagramSocket.close();
        } catch (Throwable th5) {
            th = th5;
            datagramSocket = datagramSocket2;
        }
    }

    public static void b(byte b12, byte b13, int i12, long j12) throws IOException {
        if (b12 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b13 != 4 && b13 != 5) {
            throw new IOException(AK.c.g(b13, "SNTP: Untrusted mode: "));
        }
        if (i12 == 0 || i12 > 15) {
            throw new IOException(AK.c.g(i12, "SNTP: Untrusted stratum: "));
        }
        if (j12 == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    public static long c(int i12, byte[] bArr) {
        int i13 = bArr[i12];
        int i14 = bArr[i12 + 1];
        int i15 = bArr[i12 + 2];
        int i16 = bArr[i12 + 3];
        if ((i13 & 128) == 128) {
            i13 = (i13 & 127) + 128;
        }
        if ((i14 & 128) == 128) {
            i14 = (i14 & 127) + 128;
        }
        if ((i15 & 128) == 128) {
            i15 = (i15 & 127) + 128;
        }
        if ((i16 & 128) == 128) {
            i16 = (i16 & 127) + 128;
        }
        return (i13 << 24) + (i14 << 16) + (i15 << 8) + i16;
    }

    public static long d(int i12, byte[] bArr) {
        long jC2 = c(i12, bArr);
        long jC3 = c(i12 + 4, bArr);
        if (jC2 == 0 && jC3 == 0) {
            return 0L;
        }
        return ((jC3 * 1000) / 4294967296L) + ((jC2 - 2208988800L) * 1000);
    }

    /* compiled from: SntpClient.java */
    public static final class d implements Loader.e {
        public d() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public final void load() {
            synchronized (J.f348084a) {
                Object obj = J.f348085b;
                synchronized (obj) {
                    if (J.f348086c) {
                        return;
                    }
                    J.a();
                    synchronized (obj) {
                        J.f348086c = true;
                    }
                }
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public final void a() {
        }
    }

    /* compiled from: SntpClient.java */
    public static final class c implements Loader.b<Loader.e> {
        @Override // com.google.android.exoplayer2.upstream.Loader.b
        public final Loader.c l(Loader.e eVar, long j12, long j13, IOException iOException, int i12) {
            return Loader.f347760e;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        public final void j(Loader.e eVar, long j12, long j13) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        public final void h(Loader.e eVar, long j12, long j13, boolean z12) {
        }
    }
}
