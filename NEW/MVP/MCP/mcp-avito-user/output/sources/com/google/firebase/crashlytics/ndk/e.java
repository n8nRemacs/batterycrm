package com.google.firebase.crashlytics.ndk;

import com.google.firebase.crashlytics.internal.model.C;
import com.google.firebase.crashlytics.ndk.i;
import j.N;
import java.io.File;
import java.io.IOException;
import mZ0.C44035b;

/* compiled from: FirebaseCrashlyticsNdk.java */
/* loaded from: classes4.dex */
class e implements com.google.firebase.crashlytics.internal.a {

    /* renamed from: a, reason: collision with root package name */
    public final c f361501a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f361502b;

    /* renamed from: c, reason: collision with root package name */
    public String f361503c;

    /* compiled from: FirebaseCrashlyticsNdk.java */
    public interface a {
    }

    public e(@N c cVar, boolean z12) {
        this.f361501a = cVar;
        this.f361502b = z12;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.firebase.crashlytics.ndk.d] */
    @Override // com.google.firebase.crashlytics.internal.a
    public final synchronized void a(@N final String str, final long j12, @N final C c12) {
        this.f361503c = str;
        ?? r62 = new a() { // from class: com.google.firebase.crashlytics.ndk.d
            public final void a() throws Throwable {
                long j13 = j12;
                C c13 = c12;
                e eVar = this.f361497a;
                eVar.getClass();
                com.google.firebase.crashlytics.internal.d dVar = com.google.firebase.crashlytics.internal.d.f361031a;
                dVar.a(3);
                c cVar = eVar.f361501a;
                C44035b c44035b = cVar.f361496c;
                String str2 = str;
                try {
                    if (cVar.f361495b.b(cVar.f361494a.getAssets(), c44035b.b(str2).getCanonicalPath())) {
                        cVar.d(j13, str2);
                        cVar.e(str2, c13.a());
                        cVar.h(str2, c13.d());
                        cVar.f(str2, c13.c());
                        return;
                    }
                } catch (IOException unused) {
                    dVar.b();
                }
                dVar.a(5);
            }
        };
        if (this.f361502b) {
            r62.a();
        }
    }

    @Override // com.google.firebase.crashlytics.internal.a
    @N
    public final com.google.firebase.crashlytics.internal.e b(@N String str) {
        return new j(this.f361501a.b(str));
    }

    @Override // com.google.firebase.crashlytics.internal.a
    public final boolean c() {
        String str = this.f361503c;
        return str != null && d(str);
    }

    @Override // com.google.firebase.crashlytics.internal.a
    public final boolean d(@N String str) {
        File file;
        i.c cVar = this.f361501a.b(str).f361504a;
        return cVar != null && (((file = cVar.f361516a) != null && file.exists()) || cVar.f361517b != null);
    }
}
