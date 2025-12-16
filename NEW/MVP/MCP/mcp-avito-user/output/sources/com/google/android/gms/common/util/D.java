package com.google.android.gms.common.util;

import android.os.Build;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.common.internal.C36729v;
import j.N;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@RX0.a
/* loaded from: classes6.dex */
public class D {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f349599a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f349600b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f349601c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f349602d;

    /* renamed from: e, reason: collision with root package name */
    @j.B
    public static Boolean f349603e;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Process.myUid();
        try {
            method = WorkSource.class.getMethod("add", Integer.TYPE);
        } catch (Exception unused) {
            method = null;
        }
        f349599a = method;
        try {
            method2 = WorkSource.class.getMethod("add", Integer.TYPE, String.class);
        } catch (Exception unused2) {
            method2 = null;
        }
        f349600b = method2;
        try {
            method3 = WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception unused3) {
            method3 = null;
        }
        f349601c = method3;
        try {
            WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception unused4) {
        }
        try {
            WorkSource.class.getMethod("getName", Integer.TYPE);
        } catch (Exception unused5) {
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                WorkSource.class.getMethod("createWorkChain", new Class[0]);
            } catch (Exception unused6) {
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
            } catch (Exception unused7) {
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                method4 = WorkSource.class.getMethod("isEmpty", new Class[0]);
                try {
                    method4.setAccessible(true);
                } catch (Exception unused8) {
                }
            } catch (Exception unused9) {
            }
        } else {
            method4 = null;
        }
        f349602d = method4;
        f349603e = null;
    }

    @RX0.a
    public static void a(@N WorkSource workSource, int i12, @N String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = f349600b;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i12), str);
                return;
            } catch (Exception e12) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e12);
                return;
            }
        }
        Method method2 = f349599a;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i12));
            } catch (Exception e13) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e13);
            }
        }
    }

    @RX0.a
    public static boolean b(@N WorkSource workSource) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int iIntValue;
        Method method = f349602d;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(workSource, new Object[0]);
                C36729v.j(objInvoke);
                return ((Boolean) objInvoke).booleanValue();
            } catch (Exception unused) {
            }
        }
        Method method2 = f349601c;
        if (method2 != null) {
            try {
                Object objInvoke2 = method2.invoke(workSource, new Object[0]);
                C36729v.j(objInvoke2);
                iIntValue = ((Integer) objInvoke2).intValue();
            } catch (Exception e12) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e12);
            }
        } else {
            iIntValue = 0;
        }
        return iIntValue == 0;
    }
}
