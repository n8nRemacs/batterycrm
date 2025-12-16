package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public interface cu extends z91 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final v91 f384456a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f384457b;

        /* renamed from: c, reason: collision with root package name */
        public final int f384458c;

        public a() {
            throw null;
        }

        public a(int i12, v91 v91Var, int[] iArr) {
            if (iArr.length == 0) {
                ka0.a("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f384456a = v91Var;
            this.f384457b = iArr;
            this.f384458c = i12;
        }
    }

    public interface b {
    }

    void a(float f12);

    default void a(boolean z12) {
    }

    void b();

    void c();

    vw d();

    void e();

    default void f() {
    }

    default void g() {
    }
}
