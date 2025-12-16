package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes.dex */
public final class tje {
    public static final String b;
    public static final String c;
    public final sje a;

    static {
        e19.a("media3.session");
        String str = zxg.a;
        b = Integer.toString(0, 36);
        c = Integer.toString(1, 36);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public tje(android.content.Context r13, android.content.ComponentName r14) {
        /*
            r12 = this;
            r12.<init>()
            java.lang.String r0 = "context must not be null"
            defpackage.hsi.e(r13, r0)
            android.content.pm.PackageManager r13 = r13.getPackageManager()
            java.lang.String r0 = r14.getPackageName()
            r1 = 0
            android.content.pm.ApplicationInfo r0 = r13.getApplicationInfo(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L19
            int r0 = r0.uid     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L19
        L17:
            r2 = r0
            goto L1b
        L19:
            r0 = -1
            goto L17
        L1b:
            java.lang.String r0 = "androidx.media3.session.MediaLibraryService"
            boolean r0 = a(r13, r0, r14)
            r1 = 101(0x65, float:1.42E-43)
            if (r0 == 0) goto L28
            r13 = 2
        L26:
            r3 = r13
            goto L3b
        L28:
            java.lang.String r0 = "androidx.media3.session.MediaSessionService"
            boolean r0 = a(r13, r0, r14)
            if (r0 == 0) goto L32
            r13 = 1
            goto L26
        L32:
            java.lang.String r0 = "android.media.browse.MediaBrowserService"
            boolean r13 = a(r13, r0, r14)
            if (r13 == 0) goto L5f
            r3 = r1
        L3b:
            if (r3 == r1) goto L56
            uje r1 = new uje
            java.lang.String r6 = r14.getPackageName()
            java.lang.String r7 = r14.getClassName()
            android.os.Bundle r10 = android.os.Bundle.EMPTY
            r11 = 0
            r4 = 1000000(0xf4240, float:1.401298E-39)
            r5 = 0
            r9 = 0
            r8 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.a = r1
            goto L5e
        L56:
            r8 = r14
            vje r13 = new vje
            r13.<init>(r2, r8)
            r12.a = r13
        L5e:
            return
        L5f:
            r8 = r14
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to resolve SessionToken for "
            r14.<init>(r0)
            r14.append(r8)
            java.lang.String r0 = ". Manifest doesn't declare one of either MediaSessionService, MediaLibraryService, MediaBrowserService or MediaBrowserServiceCompat. Use service's full name."
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tje.<init>(android.content.Context, android.content.ComponentName):void");
    }

    public static boolean a(PackageManager packageManager, String str, ComponentName componentName) {
        ServiceInfo serviceInfo;
        Intent intent = new Intent(str);
        intent.setPackage(componentName.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 128);
        if (listQueryIntentServices != null) {
            for (int i = 0; i < listQueryIntentServices.size(); i++) {
                ResolveInfo resolveInfo = listQueryIntentServices.get(i);
                if (resolveInfo != null && (serviceInfo = resolveInfo.serviceInfo) != null && TextUtils.equals(serviceInfo.name, componentName.getClassName())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        sje sjeVar = this.a;
        boolean z = sjeVar instanceof uje;
        String str = b;
        if (z) {
            bundle.putInt(str, 0);
        } else {
            bundle.putInt(str, 1);
        }
        bundle.putBundle(c, sjeVar.f());
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tje) {
            return this.a.equals(((tje) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    public tje(int i, int i2, int i3, String str, eb7 eb7Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        IBinder iBinderAsBinder = eb7Var.asBinder();
        bundle.getClass();
        this.a = new uje(i, 0, i2, i3, str, "", null, iBinderAsBinder, bundle, token);
    }
}
