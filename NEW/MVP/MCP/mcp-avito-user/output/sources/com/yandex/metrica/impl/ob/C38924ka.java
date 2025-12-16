package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.content.Context;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.ka, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C38924ka {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f380913a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final B0 f380914b;

    public C38924ka(@j.N Context context, @j.N B0 b02) {
        this.f380913a = context;
        this.f380914b = b02;
    }

    private String b(@j.N String str, @j.N File file) {
        this.f380914b.getClass();
        File file2 = new File(file, str);
        if (!file2.exists() && a(this.f380913a.getDatabasePath(str), file, str)) {
            String strQ = androidx.appcompat.app.r.q(str, "-journal");
            a(this.f380913a.getDatabasePath(strQ), file, strQ);
            String strQ2 = androidx.appcompat.app.r.q(str, "-shm");
            a(this.f380913a.getDatabasePath(strQ2), file, strQ2);
            String strQ3 = androidx.appcompat.app.r.q(str, "-wal");
            a(this.f380913a.getDatabasePath(strQ3), file, strQ3);
        }
        return file2.getAbsolutePath();
    }

    @j.P
    public String a(@j.N String str, @j.N File file) {
        File noBackupFilesDir;
        try {
            this.f380914b.getClass();
            File file2 = new File(file, str);
            if (file2.exists()) {
                return file2.getAbsolutePath();
            }
            if (A2.a(21) && (noBackupFilesDir = this.f380913a.getNoBackupFilesDir()) != null) {
                this.f380914b.getClass();
                if (a(new File(noBackupFilesDir, str), file, str)) {
                    String str2 = str + "-journal";
                    this.f380914b.getClass();
                    a(new File(noBackupFilesDir, str2), file, str2);
                    String str3 = str + "-shm";
                    this.f380914b.getClass();
                    a(new File(noBackupFilesDir, str3), file, str3);
                    String str4 = str + "-wal";
                    this.f380914b.getClass();
                    a(new File(noBackupFilesDir, str4), file, str4);
                    return file2.getAbsolutePath();
                }
            }
            return b(str, file);
        } catch (Throwable unused) {
            return null;
        }
    }

    @TargetApi(21)
    public String a(@j.N String str) {
        try {
            File noBackupFilesDir = this.f380913a.getNoBackupFilesDir();
            return noBackupFilesDir == null ? str : b(str, noBackupFilesDir);
        } catch (Throwable unused) {
            return str;
        }
    }

    private boolean a(@j.P File file, @j.N File file2, @j.N String str) {
        if (file == null || !file.exists()) {
            return false;
        }
        this.f380914b.getClass();
        File file3 = new File(file2, str);
        boolean zRenameTo = file.renameTo(file3);
        return !zRenameTo ? C38689b.a(file, file3) : zRenameTo;
    }
}
