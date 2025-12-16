package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.io.IOException;
import mZ0.C44035b;

/* compiled from: CrashlyticsFileMarker.java */
/* loaded from: classes4.dex */
class F {

    /* renamed from: a, reason: collision with root package name */
    public final String f360903a;

    /* renamed from: b, reason: collision with root package name */
    public final C44035b f360904b;

    public F(String str, C44035b c44035b) {
        this.f360903a = str;
        this.f360904b = c44035b;
    }

    public final void a() throws IOException {
        try {
            String str = this.f360903a;
            C44035b c44035b = this.f360904b;
            c44035b.getClass();
            new File(c44035b.f414584b, str).createNewFile();
        } catch (IOException unused) {
            com.google.firebase.crashlytics.internal.d.f361031a.b();
        }
    }
}
