package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.io.File;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.yandex.metrica.impl.ob.gj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38834gj implements InterfaceC38734cj {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f380660a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final B0 f380661b;

    @j.k0
    public C38834gj(@j.N Context context, @j.N B0 b02) {
        this.f380660a = context;
        this.f380661b = b02;
    }

    private boolean b() throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        boolean zExists;
        File fileC = this.f380661b.c(this.f380660a);
        if (fileC != null) {
            this.f380661b.getClass();
            zExists = new File(fileC, "metrica_data.db").exists();
        } else {
            zExists = false;
        }
        if (!zExists && A2.a(21)) {
            B0 b02 = this.f380661b;
            Context context = this.f380660a;
            b02.getClass();
            File noBackupFilesDir = context.getNoBackupFilesDir();
            File file = noBackupFilesDir == null ? null : new File(noBackupFilesDir, "metrica_data.db");
            zExists = file != null && file.exists();
        }
        if (zExists) {
            return zExists;
        }
        B0 b03 = this.f380661b;
        Context context2 = this.f380660a;
        b03.getClass();
        File databasePath = context2.getDatabasePath("metrica_data.db");
        return databasePath != null && databasePath.exists();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38734cj
    public boolean a() {
        return !b();
    }
}
