package com.google.firebase.crashlytics.internal.model;

import VY0.c;
import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.model.C37605b;
import com.google.firebase.crashlytics.internal.model.C37606c;
import com.google.firebase.crashlytics.internal.model.d;
import com.google.firebase.crashlytics.internal.model.e;
import com.google.firebase.crashlytics.internal.model.f;
import com.google.firebase.crashlytics.internal.model.g;
import com.google.firebase.crashlytics.internal.model.h;
import com.google.firebase.crashlytics.internal.model.i;
import com.google.firebase.crashlytics.internal.model.k;
import com.google.firebase.crashlytics.internal.model.l;
import com.google.firebase.crashlytics.internal.model.m;
import com.google.firebase.crashlytics.internal.model.n;
import com.google.firebase.crashlytics.internal.model.o;
import com.google.firebase.crashlytics.internal.model.p;
import com.google.firebase.crashlytics.internal.model.q;
import com.google.firebase.crashlytics.internal.model.r;
import com.google.firebase.crashlytics.internal.model.s;
import com.google.firebase.crashlytics.internal.model.t;
import com.google.firebase.crashlytics.internal.model.u;
import com.google.firebase.crashlytics.internal.model.v;
import com.google.firebase.crashlytics.internal.model.w;
import j.N;
import j.P;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.charset.Charset;
import rZ0.InterfaceC47620a;

@VY0.c
@InterfaceC47620a
/* loaded from: classes4.dex */
public abstract class CrashlyticsReport {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f361078a = Charset.forName(Constants.ENCODING);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Type[] f361079b = {new Type("INCOMPLETE", 0), new Type("JAVA", 1), new Type("NATIVE", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        Type EF5;

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f361079b.clone();
        }
    }

    @VY0.c
    public static abstract class a {

        @VY0.c
        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC10700a {

            @c.a
            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$a$a$a, reason: collision with other inner class name */
            public static abstract class AbstractC10701a {
                @N
                public abstract AbstractC10700a a();

                @N
                public abstract AbstractC10701a b(@N String str);

                @N
                public abstract AbstractC10701a c(@N String str);

                @N
                public abstract AbstractC10701a d(@N String str);
            }

            @N
            public static AbstractC10701a a() {
                return new d.b();
            }

            @N
            public abstract String b();

            @N
            public abstract String c();

            @N
            public abstract String d();
        }

        @c.a
        public static abstract class b {
            @N
            public abstract a a();

            @N
            public abstract b b(@P B<AbstractC10700a> b12);

            @N
            public abstract b c(@N int i12);

            @N
            public abstract b d(@N int i12);

            @N
            public abstract b e(@N String str);

            @N
            public abstract b f(@N long j12);

            @N
            public abstract b g(@N int i12);

            @N
            public abstract b h(@N long j12);

            @N
            public abstract b i(@N long j12);

            @N
            public abstract b j(@P String str);
        }

        @N
        public static b a() {
            return new C37606c.b();
        }

        @P
        public abstract B<AbstractC10700a> b();

        @N
        public abstract int c();

        @N
        public abstract int d();

        @N
        public abstract String e();

        @N
        public abstract long f();

        @N
        public abstract int g();

        @N
        public abstract long h();

        @N
        public abstract long i();

        @P
        public abstract String j();
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    @c.a
    public static abstract class c {
        @N
        public abstract CrashlyticsReport a();

        @N
        public abstract c b(a aVar);

        @N
        public abstract c c(@N String str);

        @N
        public abstract c d(@N String str);

        @N
        public abstract c e(@N String str);

        @N
        public abstract c f(@N String str);

        @N
        public abstract c g(e eVar);

        @N
        public abstract c h(int i12);

        @N
        public abstract c i(@N String str);

        @N
        public abstract c j(@N f fVar);
    }

    @VY0.c
    public static abstract class d {

        @c.a
        public static abstract class a {
            @N
            public abstract d a();

            @N
            public abstract a b(@N String str);

            @N
            public abstract a c(@N String str);
        }

        @N
        public static a a() {
            return new e.b();
        }

        @N
        public abstract String b();

        @N
        public abstract String c();
    }

    @VY0.c
    public static abstract class e {

        @c.a
        public static abstract class a {
            public abstract e a();

            public abstract a b(B<b> b12);

            public abstract a c(String str);
        }

        @VY0.c
        public static abstract class b {

            @c.a
            public static abstract class a {
                public abstract b a();

                public abstract a b(byte[] bArr);

                public abstract a c(String str);
            }

            @N
            public static a a() {
                return new g.b();
            }

            @N
            public abstract byte[] b();

            @N
            public abstract String c();
        }

        @N
        public static a a() {
            return new f.b();
        }

        @N
        public abstract B<b> b();

        @P
        public abstract String c();
    }

    @VY0.c
    public static abstract class f {

        @VY0.c
        public static abstract class a {

            @c.a
            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$a$a, reason: collision with other inner class name */
            public static abstract class AbstractC10702a {
                @N
                public abstract a a();

                @N
                public abstract AbstractC10702a b(@P String str);

                @N
                public abstract AbstractC10702a c(@P String str);

                @N
                public abstract AbstractC10702a d(@N String str);

                @N
                public abstract AbstractC10702a e(@N String str);

                @N
                public abstract AbstractC10702a f(@N String str);

                @N
                public abstract AbstractC10702a g(@N String str);
            }

            @VY0.c
            public static abstract class b {

                @c.a
                /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$a$b$a, reason: collision with other inner class name */
                public static abstract class AbstractC10703a {
                }

                @N
                public abstract String a();
            }

            @N
            public static AbstractC10702a a() {
                return new i.b();
            }

            @P
            public abstract String b();

            @P
            public abstract String c();

            @P
            public abstract String d();

            @N
            public abstract String e();

            @P
            public abstract String f();

            @P
            public abstract b g();

            @N
            public abstract String h();
        }

        @c.a
        public static abstract class b {
            @N
            public abstract f a();

            @N
            public abstract b b(@N a aVar);

            @N
            public abstract b c(boolean z12);

            @N
            public abstract b d(@N c cVar);

            @N
            public abstract b e(@N Long l12);

            @N
            public abstract b f(@N B<d> b12);

            @N
            public abstract b g(@N String str);

            @N
            public abstract b h(int i12);

            @N
            public abstract b i(@N String str);

            @N
            public abstract b j(@N e eVar);

            @N
            public abstract b k(long j12);

            @N
            public abstract b l(@N AbstractC10715f abstractC10715f);
        }

        @VY0.c
        public static abstract class c {

            @c.a
            public static abstract class a {
                @N
                public abstract c a();

                @N
                public abstract a b(int i12);

                @N
                public abstract a c(int i12);

                @N
                public abstract a d(long j12);

                @N
                public abstract a e(@N String str);

                @N
                public abstract a f(@N String str);

                @N
                public abstract a g(@N String str);

                @N
                public abstract a h(long j12);

                @N
                public abstract a i(boolean z12);

                @N
                public abstract a j(int i12);
            }

            @N
            public static a a() {
                return new k.b();
            }

            @N
            public abstract int b();

            public abstract int c();

            public abstract long d();

            @N
            public abstract String e();

            @N
            public abstract String f();

            @N
            public abstract String g();

            public abstract long h();

            public abstract int i();

            public abstract boolean j();
        }

        @VY0.c
        public static abstract class d {

            @VY0.c
            public static abstract class a {

                @c.a
                /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$a$a, reason: collision with other inner class name */
                public static abstract class AbstractC10704a {
                    @N
                    public abstract a a();

                    @N
                    public abstract AbstractC10704a b(@P Boolean bool);

                    @N
                    public abstract AbstractC10704a c(@N B<d> b12);

                    @N
                    public abstract AbstractC10704a d(@N b bVar);

                    @N
                    public abstract AbstractC10704a e(@N B<d> b12);

                    @N
                    public abstract AbstractC10704a f(int i12);
                }

                @VY0.c
                public static abstract class b {

                    @VY0.c
                    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$a$b$a, reason: collision with other inner class name */
                    public static abstract class AbstractC10705a {

                        @c.a
                        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$a$b$a$a, reason: collision with other inner class name */
                        public static abstract class AbstractC10706a {
                            @N
                            public abstract AbstractC10705a a();

                            @N
                            public abstract AbstractC10706a b(long j12);

                            @N
                            public abstract AbstractC10706a c(@N String str);

                            @N
                            public abstract AbstractC10706a d(long j12);

                            @N
                            public abstract AbstractC10706a e(@P String str);
                        }

                        @N
                        public static AbstractC10706a a() {
                            return new o.b();
                        }

                        @N
                        public abstract long b();

                        @N
                        public abstract String c();

                        public abstract long d();

                        @InterfaceC47620a.b
                        @P
                        public abstract String e();
                    }

                    @c.a
                    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$a$b$b, reason: collision with other inner class name */
                    public static abstract class AbstractC10707b {
                        @N
                        public abstract b a();

                        @N
                        public abstract AbstractC10707b b(@N a aVar);

                        @N
                        public abstract AbstractC10707b c(@N B<AbstractC10705a> b12);

                        @N
                        public abstract AbstractC10707b d(@N c cVar);

                        @N
                        public abstract AbstractC10707b e(@N AbstractC10709d abstractC10709d);

                        @N
                        public abstract AbstractC10707b f(@N B<e> b12);
                    }

                    @VY0.c
                    public static abstract class c {

                        @c.a
                        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$a$b$c$a, reason: collision with other inner class name */
                        public static abstract class AbstractC10708a {
                            @N
                            public abstract c a();

                            @N
                            public abstract AbstractC10708a b(@N c cVar);

                            @N
                            public abstract AbstractC10708a c(@N B<e.AbstractC10712b> b12);

                            @N
                            public abstract AbstractC10708a d(int i12);

                            @N
                            public abstract AbstractC10708a e(@N String str);

                            @N
                            public abstract AbstractC10708a f(@N String str);
                        }

                        @N
                        public static AbstractC10708a a() {
                            return new p.b();
                        }

                        @P
                        public abstract c b();

                        @N
                        public abstract B<e.AbstractC10712b> c();

                        public abstract int d();

                        @P
                        public abstract String e();

                        @N
                        public abstract String f();
                    }

                    @VY0.c
                    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$a$b$d, reason: collision with other inner class name */
                    public static abstract class AbstractC10709d {

                        @c.a
                        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$a$b$d$a, reason: collision with other inner class name */
                        public static abstract class AbstractC10710a {
                            @N
                            public abstract AbstractC10709d a();

                            @N
                            public abstract AbstractC10710a b(long j12);

                            @N
                            public abstract AbstractC10710a c(@N String str);

                            @N
                            public abstract AbstractC10710a d(@N String str);
                        }

                        @N
                        public static AbstractC10710a a() {
                            return new q.b();
                        }

                        @N
                        public abstract long b();

                        @N
                        public abstract String c();

                        @N
                        public abstract String d();
                    }

                    @VY0.c
                    public static abstract class e {

                        @c.a
                        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$a$b$e$a, reason: collision with other inner class name */
                        public static abstract class AbstractC10711a {
                            @N
                            public abstract e a();

                            @N
                            public abstract AbstractC10711a b(@N B<AbstractC10712b> b12);

                            @N
                            public abstract AbstractC10711a c(int i12);

                            @N
                            public abstract AbstractC10711a d(@N String str);
                        }

                        @VY0.c
                        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$a$b$e$b, reason: collision with other inner class name */
                        public static abstract class AbstractC10712b {

                            @c.a
                            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$a$b$e$b$a, reason: collision with other inner class name */
                            public static abstract class AbstractC10713a {
                                @N
                                public abstract AbstractC10712b a();

                                @N
                                public abstract AbstractC10713a b(@N String str);

                                @N
                                public abstract AbstractC10713a c(int i12);

                                @N
                                public abstract AbstractC10713a d(long j12);

                                @N
                                public abstract AbstractC10713a e(long j12);

                                @N
                                public abstract AbstractC10713a f(@N String str);
                            }

                            @N
                            public static AbstractC10713a a() {
                                return new s.b();
                            }

                            @P
                            public abstract String b();

                            public abstract int c();

                            public abstract long d();

                            public abstract long e();

                            @N
                            public abstract String f();
                        }

                        @N
                        public static AbstractC10711a a() {
                            return new r.b();
                        }

                        @N
                        public abstract B<AbstractC10712b> b();

                        public abstract int c();

                        @N
                        public abstract String d();
                    }

                    @N
                    public static AbstractC10707b a() {
                        return new n.b();
                    }

                    @P
                    public abstract a b();

                    @N
                    public abstract B<AbstractC10705a> c();

                    @P
                    public abstract c d();

                    @N
                    public abstract AbstractC10709d e();

                    @P
                    public abstract B<e> f();
                }

                @N
                public static AbstractC10704a a() {
                    return new m.b();
                }

                @P
                public abstract Boolean b();

                @P
                public abstract B<d> c();

                @N
                public abstract b d();

                @P
                public abstract B<d> e();

                public abstract int f();

                @N
                public abstract AbstractC10704a g();
            }

            @c.a
            public static abstract class b {
                @N
                public abstract d a();

                @N
                public abstract b b(@N a aVar);

                @N
                public abstract b c(@N c cVar);

                @N
                public abstract b d(@N AbstractC10714d abstractC10714d);

                @N
                public abstract b e(long j12);

                @N
                public abstract b f(@N String str);
            }

            @VY0.c
            public static abstract class c {

                @c.a
                public static abstract class a {
                    @N
                    public abstract c a();

                    @N
                    public abstract a b(Double d12);

                    @N
                    public abstract a c(int i12);

                    @N
                    public abstract a d(long j12);

                    @N
                    public abstract a e(int i12);

                    @N
                    public abstract a f(boolean z12);

                    @N
                    public abstract a g(long j12);
                }

                @N
                public static a a() {
                    return new t.b();
                }

                @P
                public abstract Double b();

                public abstract int c();

                public abstract long d();

                public abstract int e();

                public abstract long f();

                public abstract boolean g();
            }

            @VY0.c
            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$d, reason: collision with other inner class name */
            public static abstract class AbstractC10714d {

                @c.a
                /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$d$a */
                public static abstract class a {
                    @N
                    public abstract AbstractC10714d a();

                    @N
                    public abstract a b(@N String str);
                }

                @N
                public static a a() {
                    return new u.b();
                }

                @N
                public abstract String b();
            }

            @N
            public static b a() {
                return new l.b();
            }

            @N
            public abstract a b();

            @N
            public abstract c c();

            @P
            public abstract AbstractC10714d d();

            public abstract long e();

            @N
            public abstract String f();

            @N
            public abstract b g();
        }

        @VY0.c
        public static abstract class e {

            @c.a
            public static abstract class a {
                @N
                public abstract e a();

                @N
                public abstract a b(@N String str);

                @N
                public abstract a c(boolean z12);

                @N
                public abstract a d(int i12);

                @N
                public abstract a e(@N String str);
            }

            @N
            public static a a() {
                return new v.b();
            }

            @N
            public abstract String b();

            public abstract int c();

            @N
            public abstract String d();

            public abstract boolean e();
        }

        @VY0.c
        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$f, reason: collision with other inner class name */
        public static abstract class AbstractC10715f {

            @c.a
            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$f$a */
            public static abstract class a {
                @N
                public abstract AbstractC10715f a();

                @N
                public abstract a b(@N String str);
            }

            @N
            public static a a() {
                return new w.b();
            }

            @N
            public abstract String b();
        }

        @N
        public static b a() {
            h.b bVar = new h.b();
            bVar.f361274e = Boolean.FALSE;
            return bVar;
        }

        @N
        public abstract a b();

        @P
        public abstract c c();

        @P
        public abstract Long d();

        @P
        public abstract B<d> e();

        @N
        public abstract String f();

        public abstract int g();

        @InterfaceC47620a.b
        @N
        public abstract String h();

        @P
        public abstract e i();

        public abstract long j();

        @P
        public abstract AbstractC10715f k();

        public abstract boolean l();

        @N
        public abstract b m();
    }

    @N
    public static c a() {
        return new C37605b.C10717b();
    }

    @P
    public abstract a b();

    @N
    public abstract String c();

    @N
    public abstract String d();

    @N
    public abstract String e();

    @N
    public abstract String f();

    @P
    public abstract e g();

    public abstract int h();

    @N
    public abstract String i();

    @P
    public abstract f j();

    @N
    public abstract c k();

    @N
    public final CrashlyticsReport l(@P String str, boolean z12, long j12) {
        c cVarK = k();
        if (j() != null) {
            f.b bVarM = j().m();
            ((h.b) bVarM).f361273d = Long.valueOf(j12);
            bVarM.c(z12);
            if (str != null) {
                w.b bVar = new w.b();
                bVar.f361409a = str;
                ((h.b) bVarM).f361276g = bVar.a();
            }
            ((C37605b.C10717b) cVarK).f361220g = bVarM.a();
        }
        return cVarK.a();
    }
}
