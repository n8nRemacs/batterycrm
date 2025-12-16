package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.util.SparseArray;
import java.util.Objects;

/* loaded from: classes.dex */
public final class u20 {
    public static final u20 c = new u20(wg7.m(s20.d));
    public static final zjd d;
    public static final ah7 e;
    public final SparseArray a = new SparseArray();
    public final int b;

    static {
        Object[] objArr = {2, 5, 6};
        pyi.a(3, objArr);
        d = wg7.h(3, objArr);
        lk6 lk6Var = new lk6(4);
        lk6Var.T(5, 6);
        lk6Var.T(17, 6);
        lk6Var.T(7, 6);
        lk6Var.T(30, 10);
        lk6Var.T(18, 6);
        lk6Var.T(6, 8);
        lk6Var.T(8, 8);
        lk6Var.T(14, 8);
        e = lk6Var.u();
    }

    public u20(zjd zjdVar) {
        for (int i = 0; i < zjdVar.d; i++) {
            s20 s20Var = (s20) zjdVar.get(i);
            this.a.put(s20Var.a, s20Var);
        }
        int iMax = 0;
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            iMax = Math.max(iMax, ((s20) this.a.valueAt(i2)).b);
        }
        this.b = iMax;
    }

    public static zjd a(int i, int[] iArr) {
        tg7 tg7VarI = wg7.i();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            tg7VarI.a(new s20(i2, i));
        }
        return tg7VarI.i();
    }

    public static u20 b(Context context, k20 k20Var, ao6 ao6Var) {
        return c(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), k20Var, ao6Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0228  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.u20 c(android.content.Context r12, android.content.Intent r13, defpackage.k20 r14, defpackage.ao6 r15) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u20.c(android.content.Context, android.content.Intent, k20, ao6):u20");
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair d(defpackage.hf6 r17, defpackage.k20 r18) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u20.d(hf6, k20):android.util.Pair");
    }

    public final boolean equals(Object obj) {
        boolean zContentEquals;
        if (this != obj) {
            if (obj instanceof u20) {
                u20 u20Var = (u20) obj;
                SparseArray sparseArray = u20Var.a;
                String str = zxg.a;
                SparseArray sparseArray2 = this.a;
                if (sparseArray2 != null) {
                    if (sparseArray != null) {
                        if (Build.VERSION.SDK_INT >= 31) {
                            zContentEquals = sparseArray2.contentEquals(sparseArray);
                        } else {
                            int size = sparseArray2.size();
                            if (size == sparseArray.size()) {
                                for (int i = 0; i < size; i++) {
                                    if (Objects.equals(sparseArray2.valueAt(i), sparseArray.get(sparseArray2.keyAt(i)))) {
                                    }
                                }
                                zContentEquals = true;
                            }
                        }
                    }
                    zContentEquals = false;
                    break;
                } else {
                    if (sparseArray != null) {
                        zContentEquals = false;
                        break;
                    }
                    zContentEquals = true;
                }
                if (!zContentEquals || this.b != u20Var.b) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode;
        String str = zxg.a;
        int i = Build.VERSION.SDK_INT;
        SparseArray sparseArray = this.a;
        if (i >= 31) {
            iHashCode = sparseArray.contentHashCode();
        } else {
            iHashCode = 17;
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                iHashCode = Objects.hashCode(sparseArray.valueAt(i2)) + ((sparseArray.keyAt(i2) + (iHashCode * 31)) * 31);
            }
        }
        return (iHashCode * 31) + this.b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", audioProfiles=" + this.a + "]";
    }
}
