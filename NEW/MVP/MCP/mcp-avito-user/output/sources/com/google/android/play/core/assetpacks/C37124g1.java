package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* renamed from: com.google.android.play.core.assetpacks.g1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37124g1 {

    /* renamed from: b, reason: collision with root package name */
    public static final com.google.android.play.core.assetpacks.internal.F f358327b = new com.google.android.play.core.assetpacks.internal.F("MergeSliceTaskHandler");

    /* renamed from: a, reason: collision with root package name */
    public final Q f358328a;

    public C37124g1(Q q12) {
        this.f358328a = q12;
    }

    public static void b(File file, File file2) {
        if (!file.isDirectory()) {
            if (file2.exists()) {
                throw new C37184v0("File clashing with existing file from other slice: ".concat(file2.toString()));
            }
            if (!file.renameTo(file2)) {
                throw new C37184v0("Unable to move file: ".concat(String.valueOf(file)));
            }
            return;
        }
        file2.mkdirs();
        for (File file3 : file.listFiles()) {
            b(file3, new File(file2, file3.getName()));
        }
        if (!file.delete()) {
            throw new C37184v0("Unable to delete directory: ".concat(String.valueOf(file)));
        }
    }

    public final void a(C37121f1 c37121f1) throws IOException {
        Q q12 = this.f358328a;
        int i12 = c37121f1.f358319c;
        File fileL = q12.l(c37121f1.f358231b, c37121f1.f358321e, i12, c37121f1.f358320d);
        boolean zExists = fileL.exists();
        int i13 = c37121f1.f358230a;
        if (!zExists) {
            throw new C37184v0(AK.c.s(new StringBuilder("Cannot find verified files for slice "), c37121f1.f358321e, "."), i13);
        }
        Q q13 = this.f358328a;
        q13.getClass();
        String str = c37121f1.f358231b;
        int i14 = c37121f1.f358319c;
        long j12 = c37121f1.f358320d;
        File file = new File(q13.d(i14, j12, str), "_packs");
        if (!file.exists()) {
            file.mkdirs();
        }
        b(fileL, file);
        try {
            int i15 = q13.i(i14, j12, str) + 1;
            File file2 = new File(new File(q13.d(i14, j12, str), "_packs"), "merge.tmp");
            Properties properties = new Properties();
            properties.put("numberOfMerges", String.valueOf(i15));
            file2.getParentFile().mkdirs();
            file2.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (IOException e12) {
            f358327b.b("Writing merge checkpoint failed with %s.", e12.getMessage());
            throw new C37184v0(i13, "Writing merge checkpoint failed.", e12);
        }
    }
}
