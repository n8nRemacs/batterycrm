package com.facebook.soloader;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.StrictMode;
import java.io.File;

/* compiled from: ApplicationSoSource.java */
/* renamed from: com.facebook.soloader.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C36425b extends D {

    /* renamed from: a, reason: collision with root package name */
    public Context f340863a;

    /* renamed from: b, reason: collision with root package name */
    public int f340864b;

    /* renamed from: c, reason: collision with root package name */
    public C36427d f340865c;

    @Override // com.facebook.soloader.D
    public final int a(String str, int i12, StrictMode.ThreadPolicy threadPolicy) {
        return this.f340865c.a(str, i12, threadPolicy);
    }

    @Override // com.facebook.soloader.D
    public final void b(int i12) {
        this.f340865c.getClass();
    }

    public final boolean c() throws PackageManager.NameNotFoundException {
        File file = this.f340865c.f340869a;
        try {
            Context context = this.f340863a;
            Context contextCreatePackageContext = context.createPackageContext(context.getPackageName(), 0);
            File file2 = new File(contextCreatePackageContext.getApplicationInfo().nativeLibraryDir);
            if (file.equals(file2)) {
                return false;
            }
            file.toString();
            file2.toString();
            int i12 = this.f340864b | 1;
            this.f340864b = i12;
            this.f340865c = new C36427d(file2, i12);
            this.f340863a = contextCreatePackageContext;
            return true;
        } catch (PackageManager.NameNotFoundException e12) {
            throw new RuntimeException(e12);
        }
    }

    @Override // com.facebook.soloader.D
    public final String toString() {
        return this.f340865c.toString();
    }
}
