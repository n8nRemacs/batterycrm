package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.C37586h;
import java.io.File;
import java.io.FileInputStream;
import mZ0.C44035b;
import org.json.JSONObject;

/* compiled from: CachedSettingsIo.java */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final File f361453a;

    public a(C44035b c44035b) {
        this.f361453a = new File(c44035b.f414584b, "com.crashlytics.settings.json");
    }

    public final JSONObject a() throws Throwable {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        com.google.firebase.crashlytics.internal.d dVar = com.google.firebase.crashlytics.internal.d.f361031a;
        dVar.a(3);
        FileInputStream fileInputStream2 = null;
        try {
            File file = this.f361453a;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(C37586h.k(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception unused) {
                        dVar.b();
                        C37586h.a(fileInputStream);
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    C37586h.a(fileInputStream2);
                    throw th;
                }
            } else {
                dVar.a(2);
                jSONObject = null;
            }
            C37586h.a(fileInputStream2);
            return jSONObject;
        } catch (Exception unused2) {
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            C37586h.a(fileInputStream2);
            throw th;
        }
    }
}
