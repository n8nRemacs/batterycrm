package androidx.media3.common.util;

import android.os.Bundle;
import android.os.IBinder;
import androidx.media3.common.BinderC23095i;
import j.P;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: BundleUtil.java */
@J
/* renamed from: androidx.media3.common.util.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23113d {

    /* renamed from: a, reason: collision with root package name */
    @P
    public static Method f47899a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public static Method f47900b;

    @P
    public static IBinder a(Bundle bundle, @P String str) throws NoSuchMethodException, SecurityException {
        if (M.f47887a >= 18) {
            return bundle.getBinder(str);
        }
        Method method = f47899a;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", String.class);
                f47899a = method2;
                method2.setAccessible(true);
                method = f47899a;
            } catch (NoSuchMethodException e12) {
                s.a("Failed to retrieve getIBinder method", e12);
                s.f();
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e13) {
            s.a("Failed to invoke getIBinder via reflection", e13);
            s.f();
            return null;
        }
    }

    public static void b(Bundle bundle, @P String str, @P BinderC23095i binderC23095i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (M.f47887a >= 18) {
            bundle.putBinder(str, binderC23095i);
            return;
        }
        Method method = f47900b;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                f47900b = method2;
                method2.setAccessible(true);
                method = f47900b;
            } catch (NoSuchMethodException e12) {
                s.a("Failed to retrieve putIBinder method", e12);
                s.f();
                return;
            }
        }
        try {
            method.invoke(bundle, str, binderC23095i);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e13) {
            s.a("Failed to invoke putIBinder via reflection", e13);
            s.f();
        }
    }
}
