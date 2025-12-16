package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: ActivityRecreator.java */
@RestrictTo
/* renamed from: androidx.core.app.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22750h {

    /* renamed from: a, reason: collision with root package name */
    public static final Class<?> f44529a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f44530b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f44531c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f44532d;

    /* renamed from: e, reason: collision with root package name */
    public static final Method f44533e;

    /* renamed from: f, reason: collision with root package name */
    public static final Method f44534f;

    /* renamed from: g, reason: collision with root package name */
    public static final Handler f44535g = new Handler(Looper.getMainLooper());

    static {
        Class<?> cls;
        Field declaredField;
        Field declaredField2;
        Method declaredMethod;
        Method declaredMethod2;
        Method method = null;
        try {
            cls = Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            cls = null;
        }
        f44529a = cls;
        try {
            declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
        } catch (Throwable unused2) {
            declaredField = null;
        }
        f44530b = declaredField;
        try {
            declaredField2 = Activity.class.getDeclaredField("mToken");
            declaredField2.setAccessible(true);
        } catch (Throwable unused3) {
            declaredField2 = null;
        }
        f44531c = declaredField2;
        Class<?> cls2 = f44529a;
        if (cls2 == null) {
            declaredMethod = null;
        } else {
            try {
                declaredMethod = cls2.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
                declaredMethod.setAccessible(true);
            } catch (Throwable unused4) {
            }
        }
        f44532d = declaredMethod;
        Class<?> cls3 = f44529a;
        if (cls3 == null) {
            declaredMethod2 = null;
        } else {
            try {
                declaredMethod2 = cls3.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
                declaredMethod2.setAccessible(true);
            } catch (Throwable unused5) {
            }
        }
        f44533e = declaredMethod2;
        Class<?> cls4 = f44529a;
        if (Build.VERSION.SDK_INT == 27 && cls4 != null) {
            try {
                Class cls5 = Integer.TYPE;
                Class cls6 = Boolean.TYPE;
                Method declaredMethod3 = cls4.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, cls5, cls6, Configuration.class, Configuration.class, cls6, cls6);
                declaredMethod3.setAccessible(true);
                method = declaredMethod3;
            } catch (Throwable unused6) {
            }
        }
        f44534f = method;
    }

    /* compiled from: ActivityRecreator.java */
    /* renamed from: androidx.core.app.h$a */
    public static final class a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: b, reason: collision with root package name */
        public Object f44536b;

        /* renamed from: c, reason: collision with root package name */
        public Activity f44537c;

        /* renamed from: d, reason: collision with root package name */
        public final int f44538d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f44539e = false;

        /* renamed from: f, reason: collision with root package name */
        public boolean f44540f = false;

        /* renamed from: g, reason: collision with root package name */
        public boolean f44541g = false;

        public a(@j.N Activity activity) {
            this.f44537c = activity;
            this.f44538d = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            if (this.f44537c == activity) {
                this.f44537c = null;
                this.f44540f = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            if (!this.f44540f || this.f44541g || this.f44539e) {
                return;
            }
            Object obj = this.f44536b;
            try {
                Object obj2 = C22750h.f44531c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f44538d) {
                    C22750h.f44535g.postAtFrontOfQueue(new RunnableC22749g(C22750h.f44530b.get(activity), obj2));
                    this.f44541g = true;
                    this.f44536b = null;
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            if (this.f44537c == activity) {
                this.f44539e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
