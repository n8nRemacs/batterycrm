package com.google.firebase.crashlytics.internal.model;

/* compiled from: StaticSessionData.java */
@VY0.c
/* loaded from: classes4.dex */
public abstract class C {

    /* compiled from: StaticSessionData.java */
    @VY0.c
    public static abstract class a {
        public static a b(String str, String str2, String str3, String str4, int i12, com.google.firebase.crashlytics.internal.c cVar) {
            return new y(str, str2, str3, str4, i12, cVar);
        }

        public abstract String a();

        public abstract int c();

        public abstract com.google.firebase.crashlytics.internal.c d();

        public abstract String e();

        public abstract String f();

        public abstract String g();
    }

    /* compiled from: StaticSessionData.java */
    @VY0.c
    public static abstract class b {
        public static b c(int i12, String str, int i13, long j12, long j13, boolean z12, int i14, String str2, String str3) {
            return new z(i12, str, i13, j12, j13, z12, i14, str2, str3);
        }

        public abstract int a();

        public abstract int b();

        public abstract long d();

        public abstract boolean e();

        public abstract String f();

        public abstract String g();

        public abstract String h();

        public abstract int i();

        public abstract long j();
    }

    /* compiled from: StaticSessionData.java */
    @VY0.c
    public static abstract class c {
        public static c a(String str, String str2, boolean z12) {
            return new A(str, str2, z12);
        }

        public abstract boolean b();

        public abstract String c();

        public abstract String d();
    }

    public static C b(a aVar, c cVar, b bVar) {
        return new x(aVar, cVar, bVar);
    }

    public abstract a a();

    public abstract b c();

    public abstract c d();
}
