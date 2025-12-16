package com.yandex.mobile.ads.impl;

import android.support.v4.media.session.PlaybackStateCompat;

/* loaded from: classes8.dex */
final class m51 {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f387863a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean a(to toVar) {
        return a(toVar, true, false);
    }

    public static boolean a(su suVar, boolean z12) {
        return a(suVar, false, z12);
    }

    private static boolean a(su suVar, boolean z12, boolean z13) {
        boolean z14;
        boolean z15;
        boolean z16;
        int i12;
        boolean z17;
        long jA2 = suVar.a();
        long j12 = -1;
        int i13 = (jA2 > (-1L) ? 1 : (jA2 == (-1L) ? 0 : -1));
        long j13 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        if (i13 != 0 && jA2 <= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j13 = jA2;
        }
        int i14 = (int) j13;
        pr0 pr0Var = new pr0(64);
        boolean z18 = false;
        int i15 = 0;
        boolean z19 = false;
        while (i15 < i14) {
            pr0Var.c(8);
            if (!suVar.b(pr0Var.c(), z18 ? 1 : 0, 8, true)) {
                break;
            }
            long jV2 = pr0Var.v();
            int iH2 = pr0Var.h();
            if (jV2 == 1) {
                suVar.a(pr0Var.c(), 8, 8);
                pr0Var.d(16);
                i12 = 16;
                jV2 = pr0Var.p();
            } else {
                if (jV2 == 0) {
                    long jA3 = suVar.a();
                    if (jA3 != j12) {
                        jV2 = (jA3 - suVar.e()) + 8;
                    }
                }
                i12 = 8;
            }
            long j14 = i12;
            if (jV2 < j14) {
                return z18;
            }
            i15 += i12;
            if (iH2 == 1836019574) {
                i14 += (int) jV2;
                if (i13 != 0 && i14 > jA2) {
                    i14 = (int) jA2;
                }
            } else {
                if (iH2 == 1836019558 || iH2 == 1836475768) {
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
                if (iH2 != 1718909296) {
                    z17 = false;
                    z19 = z19;
                    if (i17 != 0) {
                        suVar.b(i17);
                        z19 = z19;
                    }
                } else {
                    if (i17 < 8) {
                        return false;
                    }
                    pr0Var.c(i17);
                    suVar.a(pr0Var.c(), 0, i17);
                    int i18 = i17 / 4;
                    for (int i19 = 0; i19 < i18; i19++) {
                        if (i19 == 1) {
                            pr0Var.f(4);
                        } else {
                            int iH3 = pr0Var.h();
                            if ((iH3 >>> 8) != 3368816 && (iH3 != 1751476579 || !z13)) {
                                int[] iArr = f387863a;
                                for (int i22 = 0; i22 < 29; i22++) {
                                    if (iArr[i22] != iH3) {
                                    }
                                }
                            }
                            z19 = true;
                            break;
                        }
                    }
                    z17 = false;
                    z19 = z19;
                    if (!z19) {
                        return false;
                    }
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
