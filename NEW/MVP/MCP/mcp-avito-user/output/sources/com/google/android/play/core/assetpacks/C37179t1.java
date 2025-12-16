package com.google.android.play.core.assetpacks;

import android.os.ParcelFileDescriptor;
import com.google.android.play.core.assetpacks.internal.C37142l;
import com.google.android.play.core.assetpacks.internal.C37146p;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* renamed from: com.google.android.play.core.assetpacks.t1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37179t1 {

    /* renamed from: c, reason: collision with root package name */
    public static final com.google.android.play.core.assetpacks.internal.F f358506c = new com.google.android.play.core.assetpacks.internal.F("PatchSliceTaskHandler");

    /* renamed from: a, reason: collision with root package name */
    public final Q f358507a;

    /* renamed from: b, reason: collision with root package name */
    public final C37146p f358508b;

    public C37179t1(Q q12, C37146p c37146p) {
        this.f358507a = q12;
        this.f358508b = c37146p;
    }

    public final void a(C37176s1 c37176s1) throws Throwable {
        Class cls;
        U u12;
        File fileK;
        com.google.android.play.core.assetpacks.internal.F f12 = f358506c;
        int i12 = c37176s1.f358230a;
        Q q12 = this.f358507a;
        String str = c37176s1.f358231b;
        int i13 = c37176s1.f358491c;
        long j12 = c37176s1.f358492d;
        File fileJ = q12.j(i13, j12, str);
        File file = new File(q12.j(i13, j12, str), "_metadata");
        String str2 = c37176s1.f358496h;
        File file2 = new File(file, str2);
        try {
            int i14 = c37176s1.f358495g;
            ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = c37176s1.f358498j;
            InputStream gZIPInputStream = i14 != 2 ? autoCloseInputStream : new GZIPInputStream(autoCloseInputStream, 8192);
            try {
                u12 = new U(fileJ, file2);
                fileK = this.f358507a.k(c37176s1.f358231b, c37176s1.f358496h, c37176s1.f358493e, c37176s1.f358494f);
                if (!fileK.exists()) {
                    fileK.mkdirs();
                }
                cls = Throwable.class;
            } catch (Throwable th2) {
                th = th2;
                cls = Throwable.class;
            }
            try {
                B1 b12 = new B1(this.f358507a, c37176s1.f358231b, c37176s1.f358493e, c37176s1.f358494f, c37176s1.f358496h);
                C37142l.a(u12, gZIPInputStream, new C37193y0(fileK, b12), c37176s1.f358497i);
                b12.h(0);
                try {
                    gZIPInputStream.close();
                    f12.d("Patching and extraction finished for slice %s of pack %s.", str2, str);
                    ((a2) this.f358508b.a()).e(i12, 0, str, str2);
                    try {
                        autoCloseInputStream.close();
                    } catch (IOException unused) {
                        f12.e("Could not close file for slice %s of pack %s.", str2, str);
                    }
                } catch (IOException e12) {
                    e = e12;
                    f12.b("IOException during patching %s.", e.getMessage());
                    throw new C37184v0(i12, androidx.camera.core.Q.a("Error patching slice ", str2, " of pack ", str, "."), e);
                }
            } catch (Throwable th3) {
                th = th3;
                Throwable th4 = th;
                try {
                    gZIPInputStream.close();
                    throw th4;
                } catch (Throwable th5) {
                    try {
                        cls.getDeclaredMethod("addSuppressed", cls).invoke(th4, th5);
                        throw th4;
                    } catch (Exception unused2) {
                        throw th4;
                    }
                }
            }
        } catch (IOException e13) {
            e = e13;
        }
    }
}
