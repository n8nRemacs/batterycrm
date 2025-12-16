package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes.dex */
public abstract class yei {
    public static w7c a;
    public static final String[] b = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] c = {44100, 48000, 32000};
    public static final int[] d = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] f = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] g = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] h = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static Object a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void b(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static int c(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i6 = c[i5];
        if (i2 == 2) {
            i6 /= 2;
        } else if (i2 == 0) {
            i6 /= 4;
        }
        int i7 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? d[i4 - 1] : e[i4 - 1]) * 12) / i6) + i7) * 4;
        }
        int i8 = i2 == 3 ? i3 == 2 ? f[i4 - 1] : g[i4 - 1] : h[i4 - 1];
        if (i2 == 3) {
            return ((i8 * 144) / i6) + i7;
        }
        return (((i3 == 1 ? 72 : 144) * i8) / i6) + i7;
    }

    public static int d(int i) {
        int i2;
        int i3;
        if ((i & (-2097152)) == -2097152 && (i2 = (i >>> 19) & 3) != 1 && (i3 = (i >>> 17) & 3) != 0) {
            int i4 = (i >>> 12) & 15;
            int i5 = (i >>> 10) & 3;
            if (i4 != 0 && i4 != 15 && i5 != 3) {
                if (i3 == 1) {
                    return i2 == 3 ? 1152 : 576;
                }
                if (i3 == 2) {
                    return 1152;
                }
                if (i3 == 3) {
                    return 384;
                }
                throw new IllegalArgumentException();
            }
        }
        return -1;
    }

    public static final Object e(v9g v9gVar, sm6 sm6Var) throws Throwable {
        Object zk3Var;
        Object objMakeCompletingOnce$kotlinx_coroutines_core;
        eoi.i(v9gVar, true, new wy4(0, s8j.e(v9gVar.uCont.getContext()).invokeOnTimeout(v9gVar.a, v9gVar, v9gVar.getContext())));
        try {
            if (sm6Var instanceof ij0) {
                uog.d(2, sm6Var);
                zk3Var = sm6Var.invoke(v9gVar, v9gVar);
            } else {
                zk3Var = hni.h(sm6Var, v9gVar, v9gVar);
            }
        } catch (Throwable th) {
            zk3Var = new zk3(th, false);
        }
        g84 g84Var = g84.a;
        if (zk3Var == g84Var || (objMakeCompletingOnce$kotlinx_coroutines_core = v9gVar.makeCompletingOnce$kotlinx_coroutines_core(zk3Var)) == tu7.b) {
            return g84Var;
        }
        if (objMakeCompletingOnce$kotlinx_coroutines_core instanceof zk3) {
            Throwable th2 = ((zk3) objMakeCompletingOnce$kotlinx_coroutines_core).a;
            if (!(th2 instanceof TimeoutCancellationException) || ((TimeoutCancellationException) th2).a != v9gVar) {
                throw th2;
            }
            if (zk3Var instanceof zk3) {
                throw ((zk3) zk3Var).a;
            }
        } else {
            zk3Var = tu7.a(objMakeCompletingOnce$kotlinx_coroutines_core);
        }
        return zk3Var;
    }

    public static final Object f(long j, sm6 sm6Var, q44 q44Var) {
        if (j > 0) {
            return e(new v9g(j, q44Var), sm6Var);
        }
        throw new TimeoutCancellationException("Timed out immediately", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(long r5, defpackage.sm6 r7, kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof defpackage.w9g
            if (r0 == 0) goto L13
            r0 = r8
            w9g r0 = (defpackage.w9g) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            w9g r0 = new w9g
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.o
            int r1 = r0.X
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            uid r5 = r0.d
            defpackage.g8j.b(r8)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L27
            return r8
        L27:
            r6 = move-exception
            goto L57
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.g8j.b(r8)
            r3 = 0
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 > 0) goto L3b
            goto L5d
        L3b:
            uid r8 = new uid
            r8.<init>()
            r0.d = r8     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L55
            r0.X = r2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L55
            v9g r1 = new v9g     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L55
            r1.<init>(r5, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L55
            r8.a = r1     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L55
            java.lang.Object r5 = e(r1, r7)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L55
            g84 r6 = defpackage.g84.a
            if (r5 != r6) goto L54
            return r6
        L54:
            return r5
        L55:
            r6 = move-exception
            r5 = r8
        L57:
            qt7 r7 = r6.a
            java.lang.Object r5 = r5.a
            if (r7 != r5) goto L5f
        L5d:
            r5 = 0
            return r5
        L5f:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yei.g(long, sm6, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
