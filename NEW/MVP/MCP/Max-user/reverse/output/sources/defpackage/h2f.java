package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.Typeface;
import java.util.ArrayList;
import one.me.android.concurrent.SingleCoreActivity;

/* loaded from: classes.dex */
public abstract class h2f {
    public static boolean a;
    public static final me7 b = new me7("SVG", ".svg");

    public static w2i a(yt3 yt3Var, int i, ArrayList arrayList, w2i w2iVar) {
        int i2;
        int i3 = i == 0 ? yt3Var.n0 : yt3Var.o0;
        if (i3 != -1 && (w2iVar == null || i3 != w2iVar.b)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                w2i w2iVar2 = (w2i) arrayList.get(i4);
                if (w2iVar2.b == i3) {
                    if (w2iVar != null) {
                        w2iVar.c(i, w2iVar2);
                        arrayList.remove(w2iVar);
                    }
                    w2iVar = w2iVar2;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return w2iVar;
        }
        if (w2iVar == null) {
            if (yt3Var instanceof e27) {
                e27 e27Var = (e27) yt3Var;
                int i5 = 0;
                while (true) {
                    if (i5 >= e27Var.r0) {
                        i2 = -1;
                        break;
                    }
                    yt3 yt3Var2 = e27Var.q0[i5];
                    if ((i == 0 && (i2 = yt3Var2.n0) != -1) || (i == 1 && (i2 = yt3Var2.o0) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList.size()) {
                            break;
                        }
                        w2i w2iVar3 = (w2i) arrayList.get(i6);
                        if (w2iVar3.b == i2) {
                            w2iVar = w2iVar3;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (w2iVar == null) {
                w2iVar = new w2i();
                w2iVar.a = new ArrayList();
                w2iVar.d = null;
                w2iVar.e = -1;
                int i7 = w2i.f;
                w2i.f = i7 + 1;
                w2iVar.b = i7;
                w2iVar.c = i;
            }
            arrayList.add(w2iVar);
        }
        int i8 = w2iVar.b;
        ArrayList arrayList2 = w2iVar.a;
        if (arrayList2.contains(yt3Var)) {
            return w2iVar;
        }
        arrayList2.add(yt3Var);
        if (yt3Var instanceof hz6) {
            hz6 hz6Var = (hz6) yt3Var;
            hz6Var.t0.c(hz6Var.u0 == 0 ? 1 : 0, w2iVar, arrayList);
        }
        if (i == 0) {
            yt3Var.n0 = i8;
            yt3Var.I.c(i, w2iVar, arrayList);
            yt3Var.K.c(i, w2iVar, arrayList);
        } else {
            yt3Var.o0 = i8;
            yt3Var.J.c(i, w2iVar, arrayList);
            yt3Var.M.c(i, w2iVar, arrayList);
            yt3Var.L.c(i, w2iVar, arrayList);
        }
        yt3Var.P.c(i, w2iVar, arrayList);
        return w2iVar;
    }

    public static boolean b(Context context) {
        try {
            boolean z = true;
            if (context.getPackageManager().getComponentEnabledSetting(new ComponentName("ru.oneme.app", SingleCoreActivity.class.getName())) != 1) {
                z = false;
            }
            a = z;
            String name = h2f.class.getName();
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.d;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, name, "isEnabled=" + a, null);
                }
            }
            return a;
        } catch (Throwable th) {
            wqi.e(h2f.class.getName(), "fail to get component", th);
            return false;
        }
    }

    public static boolean e(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }

    public abstract void c(int i);

    public abstract void d(Typeface typeface, boolean z);
}
