package ub1;

import android.content.Context;

/* loaded from: classes9.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final Context f440129a;

    /* renamed from: b, reason: collision with root package name */
    public final String f440130b;

    public E(Context context) {
        this.f440129a = context;
        this.f440130b = context.getPackageName();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057 A[LOOP:0: B:16:0x0051->B:18:0x0057, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(android.content.Context r8, Y41.l r9, android.content.ServiceConnection r10) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            ru.rustore.sdk.core.util.i r0 = ru.rustore.sdk.core.util.i.f436810a
            r0.getClass()
            java.lang.String r0 = "ru.vk.store.qa"
            r1 = 1
            r2 = 0
            android.content.pm.PackageManager r3 = r8.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L12
            r3.getPackageInfo(r0, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L12
            r3 = r1
            goto L13
        L12:
            r3 = r2
        L13:
            java.lang.String r4 = "ru.vk.store"
            if (r3 != 0) goto L28
            android.content.pm.PackageManager r3 = r8.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1f
            r3.getPackageInfo(r4, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1f
            goto L28
        L1f:
            ru.rustore.sdk.core.exception.RuStoreNotInstalledException r8 = new ru.rustore.sdk.core.exception.RuStoreNotInstalledException
            r8.<init>()
        L24:
            r9.invoke(r8)
            goto L90
        L28:
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r5 = "ru.vk.store.provider.review.RemoteReviewFlowProvider"
            r3.<init>(r5)
            android.content.pm.PackageManager r5 = r8.getPackageManager()
            java.util.List r2 = r5.queryIntentServices(r3, r2)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r5 = 10
            int r5 = kotlin.collections.C42745f0.q(r2, r5)
            int r5 = kotlin.collections.P0.f(r5)
            r6 = 16
            if (r5 >= r6) goto L48
            r5 = r6
        L48:
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>(r5)
            java.util.Iterator r2 = r2.iterator()
        L51:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L65
            java.lang.Object r5 = r2.next()
            android.content.pm.ResolveInfo r5 = (android.content.pm.ResolveInfo) r5
            android.content.pm.ServiceInfo r7 = r5.serviceInfo
            java.lang.String r7 = r7.packageName
            r6.put(r7, r5)
            goto L51
        L65:
            java.lang.Object r0 = r6.get(r0)
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0
            if (r0 != 0) goto L73
            java.lang.Object r0 = r6.get(r4)
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0
        L73:
            if (r0 == 0) goto L81
            android.content.ComponentName r2 = new android.content.ComponentName
            android.content.pm.ServiceInfo r0 = r0.serviceInfo
            java.lang.String r4 = r0.packageName
            java.lang.String r0 = r0.name
            r2.<init>(r4, r0)
            goto L82
        L81:
            r2 = 0
        L82:
            if (r2 != 0) goto L8a
            ru.rustore.sdk.core.exception.RuStoreOutdatedException r8 = new ru.rustore.sdk.core.exception.RuStoreOutdatedException
            r8.<init>()
            goto L24
        L8a:
            r3.setComponent(r2)
            r8.bindService(r3, r10, r1)
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ub1.E.a(android.content.Context, Y41.l, android.content.ServiceConnection):void");
    }
}
