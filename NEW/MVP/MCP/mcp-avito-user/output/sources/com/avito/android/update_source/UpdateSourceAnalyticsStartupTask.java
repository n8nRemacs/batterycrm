package com.avito.android.update_source;

import Y61.k;
import com.avito.android.app.task.ApplicationForegroundStartupTask;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UpdateSourceAnalyticsStartupTask.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/update_source/UpdateSourceAnalyticsStartupTask;", "Lcom/avito/android/app/task/ApplicationForegroundStartupTask;", "LKG0/a;", "isAppUpdatedUseCase", "LIG0/a;", "updateSourceAnalytics", "<init>", "(LKG0/a;LIG0/a;)V", "Lkotlin/G0;", "execute", "()V", "LKG0/a;", "LIG0/a;", "_avito_update-source_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UpdateSourceAnalyticsStartupTask implements ApplicationForegroundStartupTask {

    @k
    private final KG0.a isAppUpdatedUseCase;

    @k
    private final IG0.a updateSourceAnalytics;

    @Inject
    public UpdateSourceAnalyticsStartupTask(@k KG0.a aVar, @k IG0.a aVar2) {
        this.isAppUpdatedUseCase = aVar;
        this.updateSourceAnalytics = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0074 A[PHI: r3
  0x0074: PHI (r3v5 java.lang.String) = (r3v4 java.lang.String), (r3v8 java.lang.String) binds: [B:17:0x0082, B:13:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.avito.android.app.task.ApplicationForegroundStartupTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void execute() {
        /*
            r7 = this;
            KG0.a r0 = r7.isAppUpdatedUseCase
            com.avito.android.update_source.c r1 = r0.f9379a
            kotlin.C r1 = r1.f306705c
            java.lang.Object r1 = r1.getValue()
            AK0.l r1 = (AK0.l) r1
            r2 = 0
            java.lang.String r3 = "update_source_last_updated_version_code"
            int r1 = r1.getInt(r3, r2)
            com.avito.android.update_source.c r2 = r0.f9379a
            com.avito.android.util.C r0 = r0.f9380b
            if (r1 != 0) goto L29
            int r0 = r0.getF125492l()
            kotlin.C r1 = r2.f306705c
            java.lang.Object r1 = r1.getValue()
            AK0.l r1 = (AK0.l) r1
            r1.a(r0, r3)
            goto L91
        L29:
            int r4 = r0.getF125492l()
            if (r1 != r4) goto L30
            goto L91
        L30:
            int r0 = r0.getF125492l()
            kotlin.C r1 = r2.f306705c
            java.lang.Object r1 = r1.getValue()
            AK0.l r1 = (AK0.l) r1
            r1.a(r0, r3)
            IG0.a r0 = r7.updateSourceAnalytics
            com.avito.android.util.u r1 = r0.f8052b
            int r1 = r1.getF125492l()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            com.avito.android.P r2 = r0.f8053c
            DE0.a r2 = r2.f()
            java.lang.Object r2 = r2.invoke()
            java.lang.String r2 = (java.lang.String) r2
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L85
            r4 = 30
            java.lang.String r5 = "unknown"
            android.content.Context r6 = r0.f8054d
            if (r3 < r4) goto L76
            android.content.pm.PackageManager r3 = r6.getPackageManager()     // Catch: java.lang.Exception -> L85
            java.lang.String r4 = r6.getPackageName()     // Catch: java.lang.Exception -> L85
            android.content.pm.InstallSourceInfo r3 = androidx.media3.exoplayer.source.mediaparser.d.h(r3, r4)     // Catch: java.lang.Exception -> L85
            java.lang.String r3 = androidx.media3.exoplayer.source.mediaparser.d.n(r3)     // Catch: java.lang.Exception -> L85
            if (r3 != 0) goto L74
            goto L87
        L74:
            r5 = r3
            goto L87
        L76:
            android.content.pm.PackageManager r3 = r6.getPackageManager()     // Catch: java.lang.Exception -> L85
            java.lang.String r4 = r6.getPackageName()     // Catch: java.lang.Exception -> L85
            java.lang.String r3 = r3.getInstallerPackageName(r4)     // Catch: java.lang.Exception -> L85
            if (r3 != 0) goto L74
            goto L87
        L85:
            java.lang.String r5 = "error_getting_source"
        L87:
            IG0.d r3 = new IG0.d
            r3.<init>(r5, r1, r2)
            com.avito.android.analytics.a r0 = r0.f8051a
            r0.c(r3)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.update_source.UpdateSourceAnalyticsStartupTask.execute():void");
    }
}
