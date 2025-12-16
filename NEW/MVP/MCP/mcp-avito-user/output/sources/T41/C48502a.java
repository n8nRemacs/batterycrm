package t41;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.adjust.sdk.Constants;
import io.sentry.buffer.b;
import io.sentry.c;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import u41.C48796a;
import v41.C49163b;
import w41.C49445a;

/* compiled from: AndroidSentryClientFactory.java */
/* renamed from: t41.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C48502a extends io.sentry.a {

    /* renamed from: i, reason: collision with root package name */
    public Context f439146i;

    @Override // io.sentry.a, io.sentry.d
    public final c a(C49445a c49445a) throws ClassNotFoundException {
        Context context = this.f439146i;
        context.checkCallingOrSelfPermission("android.permission.INTERNET");
        context.toString();
        String str = c49445a.f441272d;
        if (!str.equalsIgnoreCase("noop") && !str.equalsIgnoreCase("http") && !str.equalsIgnoreCase(Constants.SCHEME)) {
            String strB = C49163b.b("async", c49445a);
            if (strB == null || !strB.equalsIgnoreCase("false")) {
                throw new IllegalArgumentException("Only 'http' or 'https' connections are supported in Sentry Android, but received: ".concat(str));
            }
            throw new IllegalArgumentException("Sentry Android cannot use synchronous connections, remove 'async=false' from your options.");
        }
        c cVarA = super.a(c49445a);
        C48796a c48796a = new C48796a();
        c48796a.f439790a = context;
        c.f405075m.m(c48796a, "Adding '{}' to the list of builder helpers.");
        cVarA.f405086j.add(c48796a);
        return cVarA;
    }

    @Override // io.sentry.a
    public final b e(C49445a c49445a) throws ClassNotFoundException {
        String strB = C49163b.b("buffer.dir", c49445a);
        File file = strB != null ? new File(strB) : new File(this.f439146i.getCacheDir().getAbsolutePath(), "sentry-buffered-events");
        file.getAbsolutePath();
        return new b(file, io.sentry.util.b.c(10, C49163b.b("buffer.size", c49445a)).intValue());
    }

    @Override // io.sentry.a
    public final io.sentry.context.b f() {
        return new io.sentry.context.c();
    }

    @Override // io.sentry.a
    public final List g(C49445a c49445a) throws PackageManager.NameNotFoundException, ClassNotFoundException {
        PackageInfo packageInfo;
        Context context = this.f439146i;
        List listG = super.g(c49445a);
        if (listG.isEmpty()) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException unused) {
                packageInfo = null;
            }
            if (packageInfo != null && !io.sentry.util.b.a(packageInfo.packageName)) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(packageInfo.packageName);
                return arrayList;
            }
        }
        return listG;
    }
}
