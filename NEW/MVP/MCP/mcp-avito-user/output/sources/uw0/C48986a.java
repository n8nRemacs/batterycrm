package uW0;

import com.facebook.imagepipeline.cache.C36378k;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: FLog.java */
@Nullsafe
/* renamed from: uW0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C48986a {

    /* renamed from: a, reason: collision with root package name */
    public static final C48987b f440079a = C48987b.f440080a;

    public static void a(Class<?> cls, String str) {
        C48987b c48987b = f440079a;
        if (c48987b.a(6)) {
            c48987b.b(6, cls.getSimpleName(), str);
        }
    }

    public static void b(String str, String str2) {
        C48987b c48987b = f440079a;
        if (c48987b.a(6)) {
            c48987b.b(6, str, str2);
        }
    }

    public static void c(String str, String str2, Throwable th2) {
        C48987b c48987b = f440079a;
        if (c48987b.a(6)) {
            c48987b.c(6, str, str2, th2);
        }
    }

    public static void d(Class<?> cls, String str) {
        C48987b c48987b = f440079a;
        if (c48987b.a(2)) {
            c48987b.b(2, cls.getSimpleName(), str);
        }
    }

    public static void e(Class cls, String str, Integer num, Object obj) {
        C48987b c48987b = f440079a;
        if (c48987b.a(2)) {
            c48987b.b(2, cls.getSimpleName(), String.format(null, str, num, obj));
        }
    }

    public static void f(Class cls, String str, Integer num, Object obj, Object obj2) {
        if (f440079a.a(2)) {
            d(cls, String.format(null, str, num, obj, obj2));
        }
    }

    public static void g(Object obj, Class cls, String str) {
        C48987b c48987b = f440079a;
        if (c48987b.a(2)) {
            c48987b.b(2, cls.getSimpleName(), String.format(null, str, obj));
        }
    }

    public static void h(String str, Long l12, String str2, Object obj) {
        C48987b c48987b = f440079a;
        if (c48987b.a(2)) {
            c48987b.b(2, "RequestLoggingListener", String.format(null, str, l12, str2, obj));
        }
    }

    public static void i(String str, String str2, Object... objArr) {
        C48987b c48987b = f440079a;
        if (c48987b.a(2)) {
            c48987b.b(2, str, String.format(null, str2, objArr));
        }
    }

    public static void j(Class<?> cls, String str, Object... objArr) {
        C48987b c48987b = f440079a;
        if (c48987b.a(5)) {
            c48987b.b(5, cls.getSimpleName(), String.format(null, str, objArr));
        }
    }

    public static void k(Exception exc, String str, Object... objArr) {
        if (f440079a.a(5)) {
            String str2 = String.format(null, str, objArr);
            C48987b c48987b = f440079a;
            if (c48987b.a(5)) {
                c48987b.c(5, C36378k.class.getSimpleName(), str2, exc);
            }
        }
    }

    public static void l(String str, String str2, Object... objArr) {
        C48987b c48987b = f440079a;
        if (c48987b.a(5)) {
            c48987b.b(5, str, String.format(null, str2, objArr));
        }
    }

    public static void m(String str, String str2, Object... objArr) {
        C48987b c48987b = f440079a;
        if (c48987b.a(6)) {
            c48987b.b(6, str, String.format(null, str2, objArr));
        }
    }
}
