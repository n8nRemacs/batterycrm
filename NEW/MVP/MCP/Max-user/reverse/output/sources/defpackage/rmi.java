package defpackage;

import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import android.support.v4.media.session.PlaybackStateCompat;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class rmi {
    public static final int[] a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static Object a(Intent intent, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return yo7.c(intent, str, cls);
        }
        Parcelable parcelableExtra = intent.getParcelableExtra(str);
        if (cls.isInstance(parcelableExtra)) {
            return parcelableExtra;
        }
        return null;
    }

    public static Serializable b(Intent intent, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return yo7.d(intent, str, cls);
        }
        Serializable serializableExtra = intent.getSerializableExtra(str);
        if (cls.isInstance(serializableExtra)) {
            return serializableExtra;
        }
        return null;
    }

    public static wjg c(wjg wjgVar, String[] strArr, Map map) {
        int i = 0;
        if (wjgVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (wjg) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                wjg wjgVar2 = new wjg();
                int length = strArr.length;
                while (i < length) {
                    wjgVar2.a((wjg) map.get(strArr[i]));
                    i++;
                }
                return wjgVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                wjgVar.a((wjg) map.get(strArr[0]));
                return wjgVar;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    wjgVar.a((wjg) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return wjgVar;
    }

    public static boolean d(hp5 hp5Var, boolean z, boolean z2) {
        boolean z3;
        int i;
        int i2;
        long length = hp5Var.getLength();
        long j = -1;
        int i3 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j2 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        if (i3 != 0 && length <= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j2 = length;
        }
        int i4 = (int) j2;
        qyg qygVar = new qyg(64);
        int i5 = 0;
        int i6 = 0;
        boolean z4 = false;
        while (i6 < i4) {
            qygVar.B(8);
            if (!hp5Var.n(qygVar.a, i5, 8, true)) {
                break;
            }
            long jT = qygVar.t();
            int iF = qygVar.f();
            if (jT == 1) {
                hp5Var.i(8, qygVar.a, 8);
                qygVar.D(16);
                i = i6;
                i2 = 16;
                jT = qygVar.m();
            } else {
                if (jT == 0) {
                    long length2 = hp5Var.getLength();
                    if (length2 != j) {
                        jT = (length2 - hp5Var.o()) + 8;
                    }
                }
                i = i6;
                i2 = 8;
            }
            long j3 = i2;
            if (jT < j3) {
                return false;
            }
            int i7 = i + i2;
            if (iF == 1836019574) {
                i4 += (int) jT;
                if (i3 != 0 && i4 > length) {
                    i4 = (int) length;
                }
                i6 = i7;
            } else {
                if (iF == 1836019558 || iF == 1836475768) {
                    z3 = true;
                    break;
                }
                int i8 = i3;
                if ((i7 + jT) - j3 >= i4) {
                    break;
                }
                int i9 = (int) (jT - j3);
                i6 = i7 + i9;
                if (iF == 1718909296) {
                    if (i9 < 8) {
                        return false;
                    }
                    qygVar.B(i9);
                    hp5Var.i(0, qygVar.a, i9);
                    int i10 = i9 / 4;
                    for (int i11 = 0; i11 < i10; i11++) {
                        if (i11 != 1) {
                            int iF2 = qygVar.f();
                            if ((iF2 >>> 8) != 3368816 && (iF2 != 1751476579 || !z2)) {
                                for (int i12 = 0; i12 < 29; i12++) {
                                    if (a[i12] != iF2) {
                                    }
                                }
                            }
                            z4 = true;
                            break;
                        }
                        qygVar.F(4);
                    }
                    if (!z4) {
                        return false;
                    }
                } else if (i9 != 0) {
                    hp5Var.q(i9);
                }
                i3 = i8;
            }
            j = -1;
            i5 = 0;
        }
        z3 = false;
        return z4 && z == z3;
    }
}
