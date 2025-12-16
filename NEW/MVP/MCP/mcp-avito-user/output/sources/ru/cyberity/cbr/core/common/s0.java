package ru.cyberity.cbr.core.common;

import android.content.Context;
import android.content.pm.PackageManager;
import com.adjust.sdk.Constants;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: RootCheckerSentry.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0012B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/cyberity/cbr/core/common/s0;", "", "Landroid/content/Context;", "context", "Lru/cyberity/cbr/core/common/f;", "buildInfoProvider", "", "", "rootFiles", "rootPackages", "Ljava/lang/Runtime;", "runtime", "<init>", "(Landroid/content/Context;Lru/cyberity/cbr/core/common/f;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/Runtime;)V", "(Landroid/content/Context;Lru/cyberity/cbr/core/common/f;)V", "", "d", "()Z", "a", "c", "b", "Landroid/content/Context;", "e", "()Landroid/content/Context;", "Lru/cyberity/cbr/core/common/f;", "[Ljava/lang/String;", "Ljava/lang/Runtime;", "f", "isDeviceRooted", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class s0 {

    /* renamed from: g, reason: collision with root package name */
    private static final Charset f432834g = Charset.forName(Constants.ENCODING);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final f buildInfoProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final String[] rootFiles;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final String[] rootPackages;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final Runtime runtime;

    public s0(@Y61.k Context context, @Y61.k f fVar, @Y61.k String[] strArr, @Y61.k String[] strArr2, @Y61.k Runtime runtime) {
        this.context = context;
        this.buildInfoProvider = fVar;
        this.rootFiles = strArr;
        this.rootPackages = strArr2;
        this.runtime = runtime;
    }

    private final boolean a() {
        for (String str : this.rootFiles) {
            try {
            } catch (RuntimeException e12) {
                ru.cyberity.log.a aVar = ru.cyberity.log.a.f436064a;
                String strA = ru.cyberity.log.c.a(this);
                kotlin.jvm.internal.u0 u0Var = kotlin.jvm.internal.u0.f406856a;
                aVar.e(strA, String.format("Error when trying to check if root file %s exists.", Arrays.copyOf(new Object[]{str}, 1)), e12);
            }
            if (new File(str).exists()) {
                return true;
            }
        }
        return false;
    }

    private final boolean b() throws PackageManager.NameNotFoundException {
        PackageManager packageManager = this.context.getPackageManager();
        if (packageManager != null) {
            for (String str : this.rootPackages) {
                try {
                    packageManager.getPackageInfo(str, 0);
                    return true;
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean c() throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.String r0 = "/system/xbin/which"
            java.lang.String r1 = "su"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            r1 = 0
            r2 = 0
            java.lang.Runtime r3 = r10.runtime     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L4f
            java.lang.Process r0 = r3.exec(r0)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L4f
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L39
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L39
            java.io.InputStream r5 = r0.getInputStream()     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L39
            java.nio.charset.Charset r6 = ru.cyberity.cbr.core.common.s0.f432834g     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L39
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L39
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L39
            java.lang.String r4 = r3.readLine()     // Catch: java.lang.Throwable -> L32
            if (r4 == 0) goto L28
            r4 = 1
            goto L29
        L28:
            r4 = r1
        L29:
            kotlin.io.c.a(r3, r2)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L39
            r0.destroy()
            return r4
        L30:
            r2 = move-exception
            goto L3f
        L32:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L34
        L34:
            r4 = move-exception
            kotlin.io.c.a(r3, r2)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L39
            throw r4     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L39
        L39:
            r2 = r0
            goto L4f
        L3b:
            r0 = move-exception
            r9 = r2
            r2 = r0
            r0 = r9
        L3f:
            ru.cyberity.log.a r3 = ru.cyberity.log.a.f436064a     // Catch: java.lang.Throwable -> L4d
            java.lang.String r4 = ru.cyberity.log.c.a(r10)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r5 = "Error when trying to check if SU exists."
            r3.d(r4, r5, r2)     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L63
            goto L60
        L4d:
            r1 = move-exception
            goto L66
        L4f:
            ru.cyberity.log.a r3 = ru.cyberity.log.a.f436064a     // Catch: java.lang.Throwable -> L64
            java.lang.String r4 = ru.cyberity.log.c.a(r10)     // Catch: java.lang.Throwable -> L64
            java.lang.String r5 = "SU isn't found on this Device."
            r7 = 4
            r8 = 0
            r6 = 0
            ru.cyberity.log.logger.Logger.d$default(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L64
            if (r2 == 0) goto L63
            r0 = r2
        L60:
            r0.destroy()
        L63:
            return r1
        L64:
            r1 = move-exception
            r0 = r2
        L66:
            if (r0 == 0) goto L6b
            r0.destroy()
        L6b:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.common.s0.c():boolean");
    }

    private final boolean d() {
        String strA = this.buildInfoProvider.a();
        return strA != null && C43066x.q(strA, "test-keys", false);
    }

    public final boolean f() {
        return d() || a() || c() || b();
    }

    public s0(@Y61.k Context context, @Y61.k f fVar) {
        this(context, fVar, new String[]{"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/su/bin", "/system/xbin/daemonsu"}, new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "com.koushikdutta.superuser", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.noshufou.android.su"}, Runtime.getRuntime());
    }
}
