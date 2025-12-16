package com.google.android.material.color;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import com.adjust.sdk.Constants;
import j.N;
import j.P;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: DynamicColors.java */
/* loaded from: classes6.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Map<String, c> f356319a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map<String, c> f356320b;

    /* compiled from: DynamicColors.java */
    public class a implements c {
        @Override // com.google.android.material.color.e.c
        public final boolean isSupported() {
            return true;
        }
    }

    /* compiled from: DynamicColors.java */
    public class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public Long f356321a;

        @Override // com.google.android.material.color.e.c
        public final boolean isSupported() throws NoSuchMethodException, SecurityException {
            if (this.f356321a == null) {
                try {
                    Method declaredMethod = Build.class.getDeclaredMethod("getLong", String.class);
                    declaredMethod.setAccessible(true);
                    Long l12 = (Long) declaredMethod.invoke(null, "ro.build.version.oneui");
                    l12.longValue();
                    this.f356321a = l12;
                } catch (Exception unused) {
                    this.f356321a = -1L;
                }
            }
            return this.f356321a.longValue() >= 40100;
        }
    }

    /* compiled from: DynamicColors.java */
    public interface c {
        boolean isSupported();
    }

    /* compiled from: DynamicColors.java */
    /* renamed from: com.google.android.material.color.e$e, reason: collision with other inner class name */
    public interface InterfaceC10640e {
    }

    /* compiled from: DynamicColors.java */
    public interface f {
    }

    static {
        a aVar = new a();
        b bVar = new b();
        HashMap map = new HashMap();
        map.put("fcnt", aVar);
        map.put(Constants.REFERRER_API_GOOGLE, aVar);
        map.put("hmd global", aVar);
        map.put("infinix", aVar);
        map.put("infinix mobility limited", aVar);
        map.put("itel", aVar);
        map.put("kyocera", aVar);
        map.put("lenovo", aVar);
        map.put("lge", aVar);
        map.put("motorola", aVar);
        map.put("nothing", aVar);
        map.put("oneplus", aVar);
        map.put("oppo", aVar);
        map.put("realme", aVar);
        map.put("robolectric", aVar);
        map.put(Constants.REFERRER_API_SAMSUNG, bVar);
        map.put("sharp", aVar);
        map.put("sony", aVar);
        map.put("tcl", aVar);
        map.put("tecno", aVar);
        map.put("tecno mobile limited", aVar);
        map.put(Constants.REFERRER_API_VIVO, aVar);
        map.put("wingtech", aVar);
        map.put(Constants.REFERRER_API_XIAOMI, aVar);
        f356319a = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("asus", aVar);
        map2.put("jio", aVar);
        f356320b = Collections.unmodifiableMap(map2);
    }

    /* compiled from: DynamicColors.java */
    public static class d implements Application.ActivityLifecycleCallbacks {
        /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onActivityPreCreated(@j.N android.app.Activity r2, @j.P android.os.Bundle r3) {
            /*
                r1 = this;
                java.util.Map<java.lang.String, com.google.android.material.color.e$c> r2 = com.google.android.material.color.e.f356319a
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 31
                if (r2 >= r3) goto L9
                goto L56
            L9:
                int r3 = androidx.core.os.C22774b.f44795a
                r3 = 33
                if (r2 >= r3) goto L57
                r3 = 32
                if (r2 < r3) goto L30
                java.lang.String r2 = android.os.Build.VERSION.CODENAME
                java.lang.String r3 = "REL"
                boolean r3 = r3.equals(r2)
                if (r3 == 0) goto L1e
                goto L30
            L1e:
                java.util.Locale r3 = java.util.Locale.ROOT
                java.lang.String r2 = r2.toUpperCase(r3)
                java.lang.String r0 = "Tiramisu"
                java.lang.String r3 = r0.toUpperCase(r3)
                int r2 = r2.compareTo(r3)
                if (r2 >= 0) goto L57
            L30:
                java.lang.String r2 = android.os.Build.MANUFACTURER
                java.lang.String r2 = r2.toLowerCase()
                java.util.Map<java.lang.String, com.google.android.material.color.e$c> r3 = com.google.android.material.color.e.f356319a
                java.lang.Object r2 = r3.get(r2)
                com.google.android.material.color.e$c r2 = (com.google.android.material.color.e.c) r2
                if (r2 != 0) goto L4e
                java.lang.String r2 = android.os.Build.BRAND
                java.lang.String r2 = r2.toLowerCase()
                java.util.Map<java.lang.String, com.google.android.material.color.e$c> r3 = com.google.android.material.color.e.f356320b
                java.lang.Object r2 = r3.get(r2)
                com.google.android.material.color.e$c r2 = (com.google.android.material.color.e.c) r2
            L4e:
                if (r2 == 0) goto L56
                boolean r2 = r2.isSupported()
                if (r2 != 0) goto L57
            L56:
                return
            L57:
                r2 = 0
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.color.e.d.onActivityPreCreated(android.app.Activity, android.os.Bundle):void");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(@N Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(@N Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(@N Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(@N Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(@N Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(@N Activity activity, @P Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(@N Activity activity, @N Bundle bundle) {
        }
    }
}
