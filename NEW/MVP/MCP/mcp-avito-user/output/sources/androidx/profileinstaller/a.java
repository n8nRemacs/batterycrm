package androidx.profileinstaller;

import j.X;
import java.io.File;

/* compiled from: BenchmarkOperation.java */
/* loaded from: classes.dex */
class a {

    /* compiled from: BenchmarkOperation.java */
    @X
    /* renamed from: androidx.profileinstaller.a$a, reason: collision with other inner class name */
    public static class C1908a {
    }

    /* compiled from: BenchmarkOperation.java */
    @X
    public static class b {
    }

    public static boolean a(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z12 = true;
        for (File file2 : fileArrListFiles) {
            z12 = a(file2) && z12;
        }
        return z12;
    }
}
