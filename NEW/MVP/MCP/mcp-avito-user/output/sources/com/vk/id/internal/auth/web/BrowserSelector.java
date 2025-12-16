package com.vk.id.internal.auth.web;

import Y61.k;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.adjust.sdk.Constants;
import com.vk.id.internal.context.InternalVKIDPackageManager;
import com.vk.id.logger.InternalVKIDLog;
import com.vk.id.logger.InternalVKIDLogger;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BrowserSelector.kt */
@P
@s0
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/vk/id/internal/auth/web/BrowserSelector;", "", "<init>", "()V", "Lcom/vk/id/internal/context/InternalVKIDPackageManager;", "pm", "", "packageName", "", "hasWarmupService", "(Lcom/vk/id/internal/context/InternalVKIDPackageManager;Ljava/lang/String;)Z", "Landroid/content/pm/ResolveInfo;", "resolveInfo", "isFullBrowser", "(Landroid/content/pm/ResolveInfo;)Z", "", "Lcom/vk/id/internal/auth/web/BrowserDescriptor;", "getAllBrowsers", "(Lcom/vk/id/internal/context/InternalVKIDPackageManager;)Ljava/util/List;", "Lcom/vk/id/logger/InternalVKIDLogger;", "logger", "Lcom/vk/id/logger/InternalVKIDLogger;", "ACTION_CUSTOM_TABS_CONNECTION", "Ljava/lang/String;", "Landroid/content/Intent;", "BROWSER_INTENT", "Landroid/content/Intent;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BrowserSelector {

    @k
    public static final BrowserSelector INSTANCE = new BrowserSelector();

    @k
    private static final InternalVKIDLogger logger = InternalVKIDLog.INSTANCE.createLoggerForTag("BrowserSelector");

    @k
    private static final String ACTION_CUSTOM_TABS_CONNECTION = "android.support.customtabs.action.CustomTabsService";

    @k
    private static final Intent BROWSER_INTENT = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com")).addCategory("android.intent.category.BROWSABLE");
    public static final int $stable = 8;

    private BrowserSelector() {
    }

    private final boolean hasWarmupService(InternalVKIDPackageManager pm2, String packageName) {
        Intent intent = new Intent();
        intent.setAction(ACTION_CUSTOM_TABS_CONNECTION);
        intent.setPackage(packageName);
        return pm2.resolveService(intent, 0) != null;
    }

    private final boolean isFullBrowser(ResolveInfo resolveInfo) {
        if (!resolveInfo.filter.hasAction("android.intent.action.VIEW") || !resolveInfo.filter.hasCategory("android.intent.category.BROWSABLE") || resolveInfo.filter.schemesIterator() == null || resolveInfo.filter.authoritiesIterator() != null) {
            return false;
        }
        Iterator<String> itSchemesIterator = resolveInfo.filter.schemesIterator();
        boolean zEquals = false;
        boolean zEquals2 = false;
        while (itSchemesIterator.hasNext()) {
            String next = itSchemesIterator.next();
            zEquals |= "http".equals(next);
            zEquals2 |= Constants.SCHEME.equals(next);
            if (zEquals && zEquals2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f A[SYNTHETIC] */
    @Y61.k
    @android.annotation.SuppressLint({"PackageManagerGetSignatures"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.vk.id.internal.auth.web.BrowserDescriptor> getAllBrowsers(@Y61.k com.vk.id.internal.context.InternalVKIDPackageManager r10) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.content.Intent r1 = com.vk.id.internal.auth.web.BrowserSelector.BROWSER_INTENT
            r2 = 0
            android.content.pm.ResolveInfo r3 = r10.resolveActivity(r1, r2)
            if (r3 == 0) goto L13
            android.content.pm.ActivityInfo r3 = r3.activityInfo
            java.lang.String r3 = r3.packageName
            goto L14
        L13:
            r3 = 0
        L14:
            r4 = 131136(0x20040, float:1.8376E-40)
            java.util.List r1 = r10.queryIntentActivities(r1, r4)
            java.util.Iterator r1 = r1.iterator()
        L1f:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L7f
            java.lang.Object r4 = r1.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            boolean r5 = r9.isFullBrowser(r4)
            if (r5 != 0) goto L32
            goto L1f
        L32:
            android.content.pm.ActivityInfo r5 = r4.activityInfo     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5a
            java.lang.String r5 = r5.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5a
            r6 = 64
            android.content.pm.PackageInfo r5 = r10.getPackageInfo(r5, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5a
            android.content.pm.ActivityInfo r6 = r4.activityInfo     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5a
            java.lang.String r6 = r6.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5a
            boolean r6 = r9.hasWarmupService(r10, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5a
            if (r6 == 0) goto L5f
            com.vk.id.internal.auth.web.BrowserDescriptor r6 = new com.vk.id.internal.auth.web.BrowserDescriptor     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5a
            r7 = 1
            r6.<init>(r5, r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5a
            android.content.pm.ActivityInfo r8 = r4.activityInfo     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5a
            java.lang.String r8 = r8.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5a
            boolean r8 = kotlin.jvm.internal.L.f(r8, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5a
            if (r8 == 0) goto L5c
            r0.add(r2, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5a
            goto L60
        L5a:
            r4 = move-exception
            goto L77
        L5c:
            r0.add(r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5a
        L5f:
            r7 = r2
        L60:
            com.vk.id.internal.auth.web.BrowserDescriptor r6 = new com.vk.id.internal.auth.web.BrowserDescriptor     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5a
            r6.<init>(r5, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5a
            android.content.pm.ActivityInfo r4 = r4.activityInfo     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5a
            java.lang.String r4 = r4.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5a
            boolean r4 = kotlin.jvm.internal.L.f(r4, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5a
            if (r4 == 0) goto L73
            r0.add(r7, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5a
            goto L1f
        L73:
            r0.add(r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5a
            goto L1f
        L77:
            com.vk.id.logger.InternalVKIDLogger r5 = com.vk.id.internal.auth.web.BrowserSelector.logger
            java.lang.String r6 = "Can't generate browser descriptor without the package info"
            r5.error(r6, r4)
            goto L1f
        L7f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.id.internal.auth.web.BrowserSelector.getAllBrowsers(com.vk.id.internal.context.InternalVKIDPackageManager):java.util.List");
    }
}
