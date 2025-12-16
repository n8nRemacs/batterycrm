package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* loaded from: classes6.dex */
public final /* synthetic */ class M1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N1 f358183b;

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        int i12;
        Q q12 = this.f358183b.f358188a;
        Iterator it = q12.f().iterator();
        while (true) {
            i12 = 0;
            if (!it.hasNext()) {
                break;
            }
            File file = (File) it.next();
            if (file.listFiles() != null) {
                File[] fileArrListFiles = file.listFiles();
                int length = fileArrListFiles.length;
                while (i12 < length) {
                    File file2 = fileArrListFiles[i12];
                    File file3 = new File(file2, "stale.tmp");
                    if (file3.exists() && System.currentTimeMillis() - file3.lastModified() > Q.f358212e) {
                        Q.h(file2);
                    }
                    i12++;
                }
            }
        }
        Iterator it2 = q12.f().iterator();
        while (it2.hasNext()) {
            File file4 = (File) it2.next();
            if (file4.listFiles() != null) {
                Q.g(file4);
                long jB2 = Q.b(file4, false);
                if (q12.f358214b.a() != jB2) {
                    try {
                        new File(new File(file4, String.valueOf(jB2)), "stale.tmp").createNewFile();
                    } catch (IOException unused) {
                        Q.f358210c.b("Could not write staleness marker.", new Object[0]);
                    }
                }
                for (File file5 : file4.listFiles()) {
                    Q.g(file5);
                }
            }
        }
        if (new File(q12.e(), "_tmp").exists()) {
            File[] fileArrListFiles2 = new File(q12.e(), "_tmp").listFiles();
            int length2 = fileArrListFiles2.length;
            while (i12 < length2) {
                File file6 = fileArrListFiles2[i12];
                if (System.currentTimeMillis() - file6.lastModified() > Q.f358211d) {
                    Q.h(file6);
                } else {
                    Q.g(file6);
                }
                i12++;
            }
        }
    }
}
