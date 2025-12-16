package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.internal.C37146p;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* renamed from: com.google.android.play.core.assetpacks.k1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37153k1 {

    /* renamed from: a, reason: collision with root package name */
    public final Q f358391a;

    /* renamed from: b, reason: collision with root package name */
    public final Q0 f358392b;

    /* renamed from: c, reason: collision with root package name */
    public final C37196z0 f358393c;

    /* renamed from: d, reason: collision with root package name */
    public final C37165o1 f358394d;

    /* renamed from: e, reason: collision with root package name */
    public final C37146p f358395e;

    /* renamed from: f, reason: collision with root package name */
    public final C37146p f358396f;

    public C37153k1(Q q12, C37146p c37146p, Q0 q02, C37146p c37146p2, C37196z0 c37196z0, C37165o1 c37165o1) {
        this.f358391a = q12;
        this.f358395e = c37146p;
        this.f358392b = q02;
        this.f358396f = c37146p2;
        this.f358393c = c37196z0;
        this.f358394d = c37165o1;
    }

    public final void a(final C37130i1 c37130i1) {
        Q q12 = this.f358391a;
        q12.getClass();
        String str = c37130i1.f358231b;
        int i12 = c37130i1.f358335c;
        long j12 = c37130i1.f358336d;
        File file = new File(q12.d(i12, j12, str), "_packs");
        String str2 = c37130i1.f358231b;
        File file2 = new File(new File(q12.d(i12, j12, str2), "_slices"), "_metadata");
        boolean zExists = file.exists();
        int i13 = c37130i1.f358230a;
        if (!zExists || !file2.exists()) {
            throw new C37184v0(AK.c.k("Cannot find pack files to move for pack ", str2, "."), i13);
        }
        File fileJ = q12.j(i12, j12, str2);
        fileJ.mkdirs();
        if (!file.renameTo(fileJ)) {
            throw new C37184v0("Cannot move merged pack files to final location.", i13);
        }
        new File(q12.j(i12, j12, str2), "merge.tmp").delete();
        File file3 = new File(q12.j(i12, j12, str2), "_metadata");
        file3.mkdirs();
        if (!file2.renameTo(file3)) {
            throw new C37184v0("Cannot move metadata files to final location.", i13);
        }
        try {
            this.f358394d.b(c37130i1.f358231b, c37130i1.f358337e, c37130i1.f358335c, c37130i1.f358336d);
            ((Executor) this.f358396f.a()).execute(new Runnable() { // from class: com.google.android.play.core.assetpacks.j1
                @Override // java.lang.Runnable
                public final void run() {
                    C37153k1 c37153k1 = this.f358385b;
                    c37153k1.getClass();
                    C37130i1 c37130i12 = c37130i1;
                    String str3 = c37130i12.f358231b;
                    c37153k1.f358391a.a(c37130i12.f358335c, c37130i12.f358336d, str3);
                }
            });
            Q0 q02 = this.f358392b;
            q02.getClass();
            q02.c(new F0(q02, str2, i12, j12));
            this.f358393c.b(str2);
            ((a2) this.f358395e.a()).b(i13, str2);
        } catch (IOException e12) {
            throw new C37184v0(androidx.compose.ui.graphics.colorspace.e.n("Could not write asset pack version tag for pack ", str2, ": ", e12.getMessage()), i13);
        }
    }
}
