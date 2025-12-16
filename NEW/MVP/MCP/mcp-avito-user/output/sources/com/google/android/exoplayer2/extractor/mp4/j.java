package com.google.android.exoplayer2.extractor.mp4;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.util.F;

/* compiled from: Sniffer.java */
/* loaded from: classes6.dex */
final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f344867a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean a(com.google.android.exoplayer2.extractor.k kVar, boolean z12, boolean z13) {
        boolean z14;
        boolean z15;
        boolean z16;
        int i12;
        boolean z17;
        long length = kVar.getLength();
        long j12 = -1;
        int i13 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j13 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        if (i13 != 0 && length <= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j13 = length;
        }
        int i14 = (int) j13;
        F f12 = new F(64);
        boolean z18 = false;
        int i15 = 0;
        boolean z19 = false;
        while (i15 < i14) {
            f12.y(8);
            if (!kVar.a(f12.f348070a, z18 ? 1 : 0, 8, true)) {
                break;
            }
            long jS2 = f12.s();
            int iD2 = f12.d();
            if (jS2 == 1) {
                kVar.b(8, 8, f12.f348070a);
                f12.A(16);
                i12 = 16;
                jS2 = f12.l();
            } else {
                if (jS2 == 0) {
                    long length2 = kVar.getLength();
                    if (length2 != j12) {
                        jS2 = (length2 - kVar.g()) + 8;
                    }
                }
                i12 = 8;
            }
            long j14 = i12;
            if (jS2 < j14) {
                return z18;
            }
            i15 += i12;
            if (iD2 == 1836019574) {
                i14 += (int) jS2;
                if (i13 != 0 && i14 > length) {
                    i14 = (int) length;
                }
            } else {
                if (iD2 == 1836019558 || iD2 == 1836475768) {
                    z14 = z18 ? 1 : 0;
                    z15 = true;
                    z16 = true;
                    break;
                }
                int i16 = i13;
                if ((i15 + jS2) - j14 >= i14) {
                    z14 = false;
                    z15 = true;
                    break;
                }
                int i17 = (int) (jS2 - j14);
                i15 += i17;
                if (iD2 != 1718909296) {
                    z17 = false;
                    z19 = z19;
                    if (i17 != 0) {
                        kVar.h(i17);
                        z19 = z19;
                    }
                } else {
                    if (i17 < 8) {
                        return false;
                    }
                    f12.y(i17);
                    kVar.b(0, i17, f12.f348070a);
                    int i18 = i17 / 4;
                    for (int i19 = 0; i19 < i18; i19++) {
                        if (i19 != 1) {
                            int iD3 = f12.d();
                            if ((iD3 >>> 8) != 3368816 && (iD3 != 1751476579 || !z13)) {
                                int[] iArr = f344867a;
                                for (int i22 = 0; i22 < 29; i22++) {
                                    if (iArr[i22] != iD3) {
                                    }
                                }
                            }
                            z19 = true;
                            break;
                        }
                        f12.C(4);
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
