package com.google.android.play.core.splitcompat;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes6.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final long f358660a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f358661b;

    /* renamed from: c, reason: collision with root package name */
    public File f358662c;

    public g(Context context) {
        this.f358661b = context;
        this.f358660a = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
    }

    public static void c(File file) {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                c(file2);
            }
        }
        if (file.exists() && !file.delete()) {
            throw new IOException(AK.c.k("Failed to delete '", file.getAbsolutePath(), "'"));
        }
    }

    public static File d(File file, String str) {
        File file2 = new File(file, str);
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            return file2;
        }
        throw new IllegalArgumentException("split ID cannot be placed in target directory");
    }

    public static void e(File file) {
        if (file.exists()) {
            if (!file.isDirectory()) {
                throw new IllegalArgumentException("File input must be directory when it exists.");
            }
        } else {
            file.mkdirs();
            if (!file.isDirectory()) {
                throw new IOException("Unable to create directory: ".concat(String.valueOf(file.getAbsolutePath())));
            }
        }
    }

    public final HashSet a() {
        File file = new File(g(), "verified-splits");
        e(file);
        HashSet hashSet = new HashSet();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isFile() && file2.getName().endsWith(".apk") && !file2.canWrite()) {
                    hashSet.add(new d(file2, file2.getName().substring(0, r6.length() - 4)));
                }
            }
        }
        return hashSet;
    }

    public final void b() {
        File fileF = f();
        String[] list = fileF.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals(Long.toString(this.f358660a))) {
                    File file = new File(fileF, str);
                    file.toString();
                    c(file);
                }
            }
        }
    }

    public final File f() {
        if (this.f358662c == null) {
            this.f358662c = this.f358661b.getFilesDir();
        }
        File file = new File(this.f358662c, "splitcompat");
        e(file);
        return file;
    }

    public final File g() {
        File file = new File(f(), Long.toString(this.f358660a));
        e(file);
        return file;
    }
}
