package com.google.firebase.crashlytics.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.firebase.crashlytics.internal.common.C37586h;
import j.P;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: DevelopmentPlatformProvider.java */
/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f360874a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public b f360875b = null;

    /* compiled from: DevelopmentPlatformProvider.java */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        @P
        public final String f360876a;

        /* renamed from: b, reason: collision with root package name */
        @P
        public final String f360877b;

        public b(c cVar, a aVar) throws Resources.NotFoundException, IOException {
            int iE2 = C37586h.e(cVar.f360874a, "com.google.firebase.crashlytics.unity_version", "string");
            d dVar = d.f361031a;
            Context context = cVar.f360874a;
            if (iE2 != 0) {
                this.f360876a = "Unity";
                this.f360877b = context.getResources().getString(iE2);
                dVar.a(2);
                return;
            }
            if (context.getAssets() != null) {
                try {
                    InputStream inputStreamOpen = context.getAssets().open("flutter_assets/NOTICES.Z");
                    if (inputStreamOpen != null) {
                        inputStreamOpen.close();
                    }
                    this.f360876a = "Flutter";
                    this.f360877b = null;
                    dVar.a(2);
                    return;
                } catch (IOException unused) {
                }
            }
            this.f360876a = null;
            this.f360877b = null;
        }
    }

    public c(Context context) {
        this.f360874a = context;
    }

    @P
    public final String a() {
        if (this.f360875b == null) {
            this.f360875b = new b(this, null);
        }
        return this.f360875b.f360876a;
    }

    @P
    public final String b() {
        if (this.f360875b == null) {
            this.f360875b = new b(this, null);
        }
        return this.f360875b.f360877b;
    }
}
