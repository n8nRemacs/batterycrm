package mZ0;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import com.google.firebase.crashlytics.internal.d;
import j.P;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: FileStore.java */
/* renamed from: mZ0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C44035b {

    /* renamed from: a, reason: collision with root package name */
    public final File f414583a;

    /* renamed from: b, reason: collision with root package name */
    public final File f414584b;

    /* renamed from: c, reason: collision with root package name */
    public final File f414585c;

    /* renamed from: d, reason: collision with root package name */
    public final File f414586d;

    /* renamed from: e, reason: collision with root package name */
    public final File f414587e;

    /* renamed from: f, reason: collision with root package name */
    public final File f414588f;

    public C44035b(Context context) {
        String str;
        File filesDir = context.getFilesDir();
        this.f414583a = filesDir;
        if (Build.VERSION.SDK_INT >= 28) {
            str = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator + Application.getProcessName().replaceAll("[^a-zA-Z0-9.]", "_");
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File file = new File(filesDir, str);
        d(file);
        this.f414584b = file;
        File file2 = new File(file, "open-sessions");
        d(file2);
        this.f414585c = file2;
        File file3 = new File(file, "reports");
        d(file3);
        this.f414586d = file3;
        File file4 = new File(file, "priority-reports");
        d(file4);
        this.f414587e = file4;
        File file5 = new File(file, "native-reports");
        d(file5);
        this.f414588f = file5;
    }

    public static void a(File file) {
        if (file.exists() && e(file)) {
            d dVar = d.f361031a;
            file.getPath();
            dVar.a(3);
        }
    }

    public static synchronized void d(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return;
                }
                d dVar = d.f361031a;
                file.toString();
                dVar.a(3);
                file.delete();
            }
            if (!file.mkdirs()) {
                d dVar2 = d.f361031a;
                file.toString();
                dVar2.b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static boolean e(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                e(file2);
            }
        }
        return file.delete();
    }

    public static <T> List<T> f(@P T[] tArr) {
        return tArr == null ? Collections.emptyList() : Arrays.asList(tArr);
    }

    public final File b(String str) {
        File file = new File(this.f414585c, str);
        file.mkdirs();
        File file2 = new File(file, "native");
        file2.mkdirs();
        return file2;
    }

    public final File c(String str, String str2) {
        File file = new File(this.f414585c, str);
        file.mkdirs();
        return new File(file, str2);
    }
}
