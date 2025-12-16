package androidx.media3.extractor.mp4;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media3.common.util.z;
import androidx.media3.extractor.q;

/* compiled from: Sniffer.java */
/* loaded from: classes.dex */
final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f51040a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean a(q qVar, boolean z12, boolean z13) {
        boolean z14;
        boolean z15;
        boolean z16;
        int i12;
        boolean z17;
        long length = qVar.getLength();
        long j12 = -1;
        int i13 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j13 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        if (i13 != 0 && length <= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j13 = length;
        }
        int i14 = (int) j13;
        z zVar = new z(64);
        boolean z18 = false;
        int i15 = 0;
        boolean z19 = false;
        while (i15 < i14) {
            zVar.C(8);
            if (!qVar.a(zVar.f47962a, z18 ? 1 : 0, 8, true)) {
                break;
            }
            long jV2 = zVar.v();
            int iG2 = zVar.g();
            if (jV2 == 1) {
                qVar.b(8, 8, zVar.f47962a);
                zVar.E(16);
                i12 = 16;
                jV2 = zVar.o();
            } else {
                if (jV2 == 0) {
                    long length2 = qVar.getLength();
                    if (length2 != j12) {
                        jV2 = (length2 - qVar.g()) + 8;
                    }
                }
                i12 = 8;
            }
            long j14 = i12;
            if (jV2 < j14) {
                return z18;
            }
            i15 += i12;
            if (iG2 == 1836019574) {
                i14 += (int) jV2;
                if (i13 != 0 && i14 > length) {
                    i14 = (int) length;
                }
            } else {
                if (iG2 == 1836019558 || iG2 == 1836475768) {
                    z14 = z18 ? 1 : 0;
                    z15 = true;
                    z16 = true;
                    break;
                }
                int i16 = i13;
                if ((i15 + jV2) - j14 >= i14) {
                    z14 = false;
                    z15 = true;
                    break;
                }
                int i17 = (int) (jV2 - j14);
                i15 += i17;
                if (iG2 != 1718909296) {
                    z17 = false;
                    z19 = z19;
                    if (i17 != 0) {
                        qVar.h(i17);
                        z19 = z19;
                    }
                } else {
                    if (i17 < 8) {
                        return false;
                    }
                    zVar.C(i17);
                    qVar.b(0, i17, zVar.f47962a);
                    int i18 = i17 / 4;
                    for (int i19 = 0; i19 < i18; i19++) {
                        if (i19 != 1) {
                            int iG3 = zVar.g();
                            if ((iG3 >>> 8) != 3368816 && (iG3 != 1751476579 || !z13)) {
                                int[] iArr = f51040a;
                                for (int i22 = 0; i22 < 29; i22++) {
                                    if (iArr[i22] != iG3) {
                                    }
                                }
                            }
                            z19 = true;
                            break;
                        }
                        zVar.G(4);
                    }
                    if (!z19) {
                        return false;
                    }
                    z17 = false;
                    z19 = z19;
                }
                z18 = z17;
                i13 = i16;
            }
            j12 = -1;
            z19 = z19;
        }
        z14 = z18 ? 1 : 0;
        z15 = true;
        z16 = z14;
        return (z19 && z12 == z16) ? z15 : z14;
    }
}
