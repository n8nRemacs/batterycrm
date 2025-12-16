package com.google.android.play.core.assetpacks;

import androidx.media3.common.C23088b;
import com.google.android.play.core.assetpacks.internal.C37146p;
import java.io.File;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* renamed from: com.google.android.play.core.assetpacks.x1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37191x1 {

    /* renamed from: a, reason: collision with root package name */
    public final Q f358540a;

    /* renamed from: b, reason: collision with root package name */
    public final Q0 f358541b;

    /* renamed from: c, reason: collision with root package name */
    public final C37196z0 f358542c;

    /* renamed from: d, reason: collision with root package name */
    public final C37146p f358543d;

    /* renamed from: e, reason: collision with root package name */
    public final C37146p f358544e;

    public C37191x1(Q q12, C37146p c37146p, Q0 q02, C37146p c37146p2, C37196z0 c37196z0) {
        this.f358540a = q12;
        this.f358543d = c37146p;
        this.f358541b = q02;
        this.f358544e = c37146p2;
        this.f358542c = c37196z0;
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
    	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:179)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:132)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
     */
    public final void a(final C37185v1 c37185v1) {
        Q q12 = this.f358540a;
        String str = c37185v1.f358231b;
        int i12 = c37185v1.f358513c;
        long j12 = c37185v1.f358515e;
        File fileJ = q12.j(i12, j12, str);
        boolean zExists = fileJ.exists();
        int i13 = c37185v1.f358230a;
        String str2 = c37185v1.f358231b;
        if (!zExists) {
            throw new C37184v0(androidx.compose.ui.graphics.colorspace.e.n("Cannot find pack files to promote for pack ", str2, " at ", fileJ.getAbsolutePath()), i13);
        }
        int i14 = c37185v1.f358514d;
        File fileJ2 = q12.j(i14, j12, str2);
        fileJ2.mkdirs();
        if (!fileJ.renameTo(fileJ2)) {
            String absolutePath = fileJ.getAbsolutePath();
            String absolutePath2 = fileJ2.getAbsolutePath();
            StringBuilder sbB = C23088b.b("Cannot promote pack ", str2, " from ", absolutePath, " to ");
            sbB.append(absolutePath2);
            throw new C37184v0(sbB.toString(), i13);
        }
        ((Executor) this.f358544e.a()).execute(new Runnable() { // from class: com.google.android.play.core.assetpacks.w1
            @Override // java.lang.Runnable
            public final void run() {
                C37191x1 c37191x1 = this.f358528b;
                c37191x1.getClass();
                C37185v1 c37185v12 = c37185v1;
                String str3 = c37185v12.f358231b;
                c37191x1.f358540a.a(c37185v12.f358514d, c37185v12.f358515e, str3);
            }
        });
        Q0 q02 = this.f358541b;
        q02.getClass();
        q02.c(new F0(q02, str2, i14, j12));
        this.f358542c.b(str2);
        ((a2) this.f358543d.a()).b(i13, str2);
    }
}
