package com.google.firebase.crashlytics.internal.metadata;

import j.P;
import mZ0.C44035b;

/* compiled from: LogFileManager.java */
/* loaded from: classes4.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    public static final b f361035c = new b();

    /* renamed from: a, reason: collision with root package name */
    public final C44035b f361036a;

    /* renamed from: b, reason: collision with root package name */
    public com.google.firebase.crashlytics.internal.metadata.a f361037b;

    public c(C44035b c44035b) {
        this.f361036a = c44035b;
        this.f361037b = f361035c;
    }

    public final void a() {
        this.f361037b.a();
    }

    public final byte[] b() {
        return this.f361037b.e();
    }

    @P
    public final String c() {
        return this.f361037b.d();
    }

    public final void d(String str) {
        this.f361037b.c();
        this.f361037b = f361035c;
        if (str == null) {
            return;
        }
        this.f361037b = new h(this.f361036a.c(str, "userlog"));
    }

    public final void e(long j12, String str) {
        this.f361037b.b(j12, str);
    }

    public c(String str, C44035b c44035b) {
        this(c44035b);
        d(str);
    }

    /* compiled from: LogFileManager.java */
    public static final class b implements com.google.firebase.crashlytics.internal.metadata.a {
        public b() {
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.a
        public final String d() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.a
        public final byte[] e() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.a
        public final void a() {
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.a
        public final void c() {
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.a
        public final void b(long j12, String str) {
        }
    }
}
