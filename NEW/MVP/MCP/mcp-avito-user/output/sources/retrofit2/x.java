package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;

/* compiled from: RequestFactory.java */
/* loaded from: classes9.dex */
final class x {

    /* renamed from: a, reason: collision with root package name */
    public final Method f430082a;

    /* renamed from: b, reason: collision with root package name */
    public final HttpUrl f430083b;

    /* renamed from: c, reason: collision with root package name */
    public final String f430084c;

    /* renamed from: d, reason: collision with root package name */
    @I41.h
    public final String f430085d;

    /* renamed from: e, reason: collision with root package name */
    @I41.h
    public final Headers f430086e;

    /* renamed from: f, reason: collision with root package name */
    @I41.h
    public final MediaType f430087f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f430088g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f430089h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f430090i;

    /* renamed from: j, reason: collision with root package name */
    public final u<?>[] f430091j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f430092k;

    /* compiled from: RequestFactory.java */
    public static final class a {

        /* renamed from: x, reason: collision with root package name */
        public static final Pattern f430093x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: y, reason: collision with root package name */
        public static final Pattern f430094y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a, reason: collision with root package name */
        public final z f430095a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f430096b;

        /* renamed from: c, reason: collision with root package name */
        public final Annotation[] f430097c;

        /* renamed from: d, reason: collision with root package name */
        public final Annotation[][] f430098d;

        /* renamed from: e, reason: collision with root package name */
        public final Type[] f430099e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f430100f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f430101g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f430102h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f430103i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f430104j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f430105k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f430106l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f430107m;

        /* renamed from: n, reason: collision with root package name */
        @I41.h
        public String f430108n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f430109o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f430110p;

        /* renamed from: q, reason: collision with root package name */
        public boolean f430111q;

        /* renamed from: r, reason: collision with root package name */
        @I41.h
        public String f430112r;

        /* renamed from: s, reason: collision with root package name */
        @I41.h
        public Headers f430113s;

        /* renamed from: t, reason: collision with root package name */
        @I41.h
        public MediaType f430114t;

        /* renamed from: u, reason: collision with root package name */
        @I41.h
        public LinkedHashSet f430115u;

        /* renamed from: v, reason: collision with root package name */
        @I41.h
        public u<?>[] f430116v;

        /* renamed from: w, reason: collision with root package name */
        public boolean f430117w;

        public a(z zVar, Method method) {
            this.f430095a = zVar;
            this.f430096b = method;
            this.f430097c = method.getAnnotations();
            this.f430099e = method.getGenericParameterTypes();
            this.f430098d = method.getParameterAnnotations();
        }

        public static Class<?> a(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        public final void b(String str, String str2, boolean z12) {
            String str3 = this.f430108n;
            Method method = this.f430096b;
            if (str3 != null) {
                throw D.i(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.f430108n = str;
            this.f430109o = z12;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            Pattern pattern = f430093x;
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (pattern.matcher(strSubstring).find()) {
                    throw D.i(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                }
            }
            this.f430112r = str2;
            Matcher matcher = pattern.matcher(str2);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            this.f430115u = linkedHashSet;
        }

        public final void c(int i12, Type type) {
            if (D.g(type)) {
                throw D.j(this.f430096b, i12, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public x(a aVar) {
        this.f430082a = aVar.f430096b;
        this.f430083b = aVar.f430095a.f430123c;
        this.f430084c = aVar.f430108n;
        this.f430085d = aVar.f430112r;
        this.f430086e = aVar.f430113s;
        this.f430087f = aVar.f430114t;
        this.f430088g = aVar.f430109o;
        this.f430089h = aVar.f430110p;
        this.f430090i = aVar.f430111q;
        this.f430091j = aVar.f430116v;
        this.f430092k = aVar.f430117w;
    }
}
