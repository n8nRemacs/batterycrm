package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class ge6 {
    public static final yk8 a = new yk8(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final z0f d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new q27(1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new z0f(0);
    }

    public static fe6 a(String str, Context context, qt6 qt6Var, int i) {
        yk8 yk8Var = a;
        Typeface typeface = (Typeface) yk8Var.c(str);
        if (typeface != null) {
            return new fe6(typeface);
        }
        try {
            bj bjVarD = bxe.d(context, qt6Var);
            me6[] me6VarArr = (me6[]) bjVarD.c;
            int i2 = bjVarD.b;
            int i3 = 1;
            if (i2 != 0) {
                i3 = i2 != 1 ? -3 : -2;
            } else if (me6VarArr != null && me6VarArr.length != 0) {
                int length = me6VarArr.length;
                i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        break;
                    }
                    int i5 = me6VarArr[i4].e;
                    if (i5 == 0) {
                        i4++;
                    } else if (i5 >= 0) {
                        i3 = i5;
                    }
                }
            }
            if (i3 != 0) {
                return new fe6(i3);
            }
            Typeface typefaceF0 = vog.a.f0(context, me6VarArr, i);
            if (typefaceF0 == null) {
                return new fe6(-3);
            }
            yk8Var.d(str, typefaceF0);
            return new fe6(typefaceF0);
        } catch (PackageManager.NameNotFoundException unused) {
            return new fe6(-1);
        }
    }
}
