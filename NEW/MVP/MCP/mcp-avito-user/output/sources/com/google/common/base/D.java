package com.google.common.base;

import aZ0.InterfaceC19845a;
import java.util.Arrays;

/* compiled from: MoreObjects.java */
@InterfaceC37268l
@XY0.b
/* loaded from: classes6.dex */
public final class D {

    /* compiled from: MoreObjects.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f358958a;

        /* renamed from: b, reason: collision with root package name */
        public final C10650b f358959b;

        /* renamed from: c, reason: collision with root package name */
        public C10650b f358960c;

        /* compiled from: MoreObjects.java */
        public static final class a extends C10650b {
            public a() {
                super();
            }
        }

        /* compiled from: MoreObjects.java */
        /* renamed from: com.google.common.base.D$b$b, reason: collision with other inner class name */
        public static class C10650b {

            /* renamed from: a, reason: collision with root package name */
            @I41.a
            public String f358961a;

            /* renamed from: b, reason: collision with root package name */
            @I41.a
            public Object f358962b;

            /* renamed from: c, reason: collision with root package name */
            @I41.a
            public C10650b f358963c;

            public C10650b() {
            }
        }

        public b(String str, a aVar) {
            C10650b c10650b = new C10650b();
            this.f358959b = c10650b;
            this.f358960c = c10650b;
            str.getClass();
            this.f358958a = str;
        }

        @InterfaceC19845a
        public final void a(long j12, String str) {
            c(str, String.valueOf(j12));
        }

        @InterfaceC19845a
        public final void b(@I41.a Object obj, String str) {
            C10650b c10650b = new C10650b();
            this.f358960c.f358963c = c10650b;
            this.f358960c = c10650b;
            c10650b.f358962b = obj;
            c10650b.f358961a = str;
        }

        @InterfaceC19845a
        public final void c(String str, String str2) {
            a aVar = new a();
            this.f358960c.f358963c = aVar;
            this.f358960c = aVar;
            aVar.f358962b = str2;
            aVar.f358961a = str;
        }

        @InterfaceC19845a
        public final void d(@I41.a Object obj) {
            C10650b c10650b = new C10650b();
            this.f358960c.f358963c = c10650b;
            this.f358960c = c10650b;
            c10650b.f358962b = obj;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.f358958a);
            sb2.append('{');
            C10650b c10650b = this.f358959b.f358963c;
            String str = "";
            while (c10650b != null) {
                Object obj = c10650b.f358962b;
                boolean z12 = c10650b instanceof a;
                sb2.append(str);
                String str2 = c10650b.f358961a;
                if (str2 != null) {
                    sb2.append(str2);
                    sb2.append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    sb2.append(obj);
                } else {
                    String strDeepToString = Arrays.deepToString(new Object[]{obj});
                    sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                }
                c10650b = c10650b.f358963c;
                str = ", ";
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    public static <T> T a(@I41.a T t12, @I41.a T t13) {
        if (t12 != null) {
            return t12;
        }
        if (t13 != null) {
            return t13;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static b b(Object obj) {
        return new b(obj.getClass().getSimpleName(), null);
    }
}
