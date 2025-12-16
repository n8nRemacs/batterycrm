package retrofit2;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* compiled from: ParameterHandler.java */
/* loaded from: classes9.dex */
abstract class u<T> {

    /* compiled from: ParameterHandler.java */
    public static final class a<T> extends u<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f430021a;

        /* renamed from: b, reason: collision with root package name */
        public final int f430022b;

        /* renamed from: c, reason: collision with root package name */
        public final retrofit2.f<T, RequestBody> f430023c;

        public a(Method method, int i12, retrofit2.f<T, RequestBody> fVar) {
            this.f430021a = method;
            this.f430022b = i12;
            this.f430023c = fVar;
        }

        @Override // retrofit2.u
        public final void a(w wVar, @I41.h T t12) {
            int i12 = this.f430022b;
            Method method = this.f430021a;
            if (t12 == null) {
                throw D.j(method, i12, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                wVar.f430079k = this.f430023c.convert(t12);
            } catch (IOException e12) {
                throw D.k(method, e12, i12, "Unable to convert " + t12 + " to RequestBody", new Object[0]);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    public static final class b<T> extends u<T> {

        /* renamed from: a, reason: collision with root package name */
        public final String f430024a;

        /* renamed from: b, reason: collision with root package name */
        public final retrofit2.f<T, String> f430025b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f430026c;

        public b(String str, retrofit2.f<T, String> fVar, boolean z12) {
            Objects.requireNonNull(str, "name == null");
            this.f430024a = str;
            this.f430025b = fVar;
            this.f430026c = z12;
        }

        @Override // retrofit2.u
        public final void a(w wVar, @I41.h T t12) {
            String strConvert;
            if (t12 == null || (strConvert = this.f430025b.convert(t12)) == null) {
                return;
            }
            FormBody.Builder builder = wVar.f430078j;
            String str = this.f430024a;
            if (this.f430026c) {
                builder.addEncoded(str, strConvert);
            } else {
                builder.add(str, strConvert);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    public static final class c<T> extends u<Map<String, T>> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f430027a;

        /* renamed from: b, reason: collision with root package name */
        public final int f430028b;

        /* renamed from: c, reason: collision with root package name */
        public final retrofit2.f<T, String> f430029c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f430030d;

        public c(Method method, int i12, retrofit2.f<T, String> fVar, boolean z12) {
            this.f430027a = method;
            this.f430028b = i12;
            this.f430029c = fVar;
            this.f430030d = z12;
        }

        @Override // retrofit2.u
        public final void a(w wVar, @I41.h Object obj) {
            Map map = (Map) obj;
            int i12 = this.f430028b;
            Method method = this.f430027a;
            if (map == null) {
                throw D.j(method, i12, "Field map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw D.j(method, i12, "Field map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw D.j(method, i12, AK.c.k("Field map contained null value for key '", str, "'."), new Object[0]);
                }
                retrofit2.f<T, String> fVar = this.f430029c;
                String str2 = (String) fVar.convert(value);
                if (str2 == null) {
                    throw D.j(method, i12, "Field map value '" + value + "' converted to null by " + fVar.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                }
                FormBody.Builder builder = wVar.f430078j;
                if (this.f430030d) {
                    builder.addEncoded(str, str2);
                } else {
                    builder.add(str, str2);
                }
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    public static final class d<T> extends u<T> {

        /* renamed from: a, reason: collision with root package name */
        public final String f430031a;

        /* renamed from: b, reason: collision with root package name */
        public final retrofit2.f<T, String> f430032b;

        public d(String str, retrofit2.f<T, String> fVar) {
            Objects.requireNonNull(str, "name == null");
            this.f430031a = str;
            this.f430032b = fVar;
        }

        @Override // retrofit2.u
        public final void a(w wVar, @I41.h T t12) {
            String strConvert;
            if (t12 == null || (strConvert = this.f430032b.convert(t12)) == null) {
                return;
            }
            wVar.a(this.f430031a, strConvert);
        }
    }

    /* compiled from: ParameterHandler.java */
    public static final class e<T> extends u<Map<String, T>> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f430033a;

        /* renamed from: b, reason: collision with root package name */
        public final int f430034b;

        /* renamed from: c, reason: collision with root package name */
        public final retrofit2.f<T, String> f430035c;

        public e(Method method, int i12, retrofit2.f<T, String> fVar) {
            this.f430033a = method;
            this.f430034b = i12;
            this.f430035c = fVar;
        }

        @Override // retrofit2.u
        public final void a(w wVar, @I41.h Object obj) {
            Map map = (Map) obj;
            int i12 = this.f430034b;
            Method method = this.f430033a;
            if (map == null) {
                throw D.j(method, i12, "Header map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw D.j(method, i12, "Header map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw D.j(method, i12, AK.c.k("Header map contained null value for key '", str, "'."), new Object[0]);
                }
                wVar.a(str, (String) this.f430035c.convert(value));
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    public static final class f extends u<Headers> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f430036a;

        /* renamed from: b, reason: collision with root package name */
        public final int f430037b;

        public f(int i12, Method method) {
            this.f430036a = method;
            this.f430037b = i12;
        }

        @Override // retrofit2.u
        public final void a(w wVar, @I41.h Headers headers) {
            Headers headers2 = headers;
            if (headers2 != null) {
                wVar.f430074f.addAll(headers2);
            } else {
                throw D.j(this.f430036a, this.f430037b, "Headers parameter must not be null.", new Object[0]);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    public static final class g<T> extends u<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f430038a;

        /* renamed from: b, reason: collision with root package name */
        public final int f430039b;

        /* renamed from: c, reason: collision with root package name */
        public final Headers f430040c;

        /* renamed from: d, reason: collision with root package name */
        public final retrofit2.f<T, RequestBody> f430041d;

        public g(Method method, int i12, Headers headers, retrofit2.f<T, RequestBody> fVar) {
            this.f430038a = method;
            this.f430039b = i12;
            this.f430040c = headers;
            this.f430041d = fVar;
        }

        @Override // retrofit2.u
        public final void a(w wVar, @I41.h T t12) {
            if (t12 == null) {
                return;
            }
            try {
                wVar.f430077i.addPart(this.f430040c, this.f430041d.convert(t12));
            } catch (IOException e12) {
                throw D.j(this.f430038a, this.f430039b, "Unable to convert " + t12 + " to RequestBody", e12);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    public static final class h<T> extends u<Map<String, T>> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f430042a;

        /* renamed from: b, reason: collision with root package name */
        public final int f430043b;

        /* renamed from: c, reason: collision with root package name */
        public final retrofit2.f<T, RequestBody> f430044c;

        /* renamed from: d, reason: collision with root package name */
        public final String f430045d;

        public h(Method method, int i12, retrofit2.f<T, RequestBody> fVar, String str) {
            this.f430042a = method;
            this.f430043b = i12;
            this.f430044c = fVar;
            this.f430045d = str;
        }

        @Override // retrofit2.u
        public final void a(w wVar, @I41.h Object obj) {
            Map map = (Map) obj;
            int i12 = this.f430043b;
            Method method = this.f430042a;
            if (map == null) {
                throw D.j(method, i12, "Part map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw D.j(method, i12, "Part map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw D.j(method, i12, AK.c.k("Part map contained null value for key '", str, "'."), new Object[0]);
                }
                wVar.f430077i.addPart(Headers.of("Content-Disposition", AK.c.k("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", this.f430045d), (RequestBody) this.f430044c.convert(value));
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    public static final class i<T> extends u<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f430046a;

        /* renamed from: b, reason: collision with root package name */
        public final int f430047b;

        /* renamed from: c, reason: collision with root package name */
        public final String f430048c;

        /* renamed from: d, reason: collision with root package name */
        public final retrofit2.f<T, String> f430049d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f430050e;

        public i(Method method, int i12, String str, retrofit2.f<T, String> fVar, boolean z12) {
            this.f430046a = method;
            this.f430047b = i12;
            Objects.requireNonNull(str, "name == null");
            this.f430048c = str;
            this.f430049d = fVar;
            this.f430050e = z12;
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x00e7  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00ea  */
        @Override // retrofit2.u
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(retrofit2.w r18, @I41.h T r19) {
            /*
                Method dump skipped, instructions count: 271
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: retrofit2.u.i.a(retrofit2.w, java.lang.Object):void");
        }
    }

    /* compiled from: ParameterHandler.java */
    public static final class j<T> extends u<T> {

        /* renamed from: a, reason: collision with root package name */
        public final String f430051a;

        /* renamed from: b, reason: collision with root package name */
        public final retrofit2.f<T, String> f430052b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f430053c;

        public j(String str, retrofit2.f<T, String> fVar, boolean z12) {
            Objects.requireNonNull(str, "name == null");
            this.f430051a = str;
            this.f430052b = fVar;
            this.f430053c = z12;
        }

        @Override // retrofit2.u
        public final void a(w wVar, @I41.h T t12) {
            String strConvert;
            if (t12 == null || (strConvert = this.f430052b.convert(t12)) == null) {
                return;
            }
            wVar.b(this.f430051a, strConvert, this.f430053c);
        }
    }

    /* compiled from: ParameterHandler.java */
    public static final class k<T> extends u<Map<String, T>> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f430054a;

        /* renamed from: b, reason: collision with root package name */
        public final int f430055b;

        /* renamed from: c, reason: collision with root package name */
        public final retrofit2.f<T, String> f430056c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f430057d;

        public k(Method method, int i12, retrofit2.f<T, String> fVar, boolean z12) {
            this.f430054a = method;
            this.f430055b = i12;
            this.f430056c = fVar;
            this.f430057d = z12;
        }

        @Override // retrofit2.u
        public final void a(w wVar, @I41.h Object obj) {
            Map map = (Map) obj;
            int i12 = this.f430055b;
            Method method = this.f430054a;
            if (map == null) {
                throw D.j(method, i12, "Query map was null", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw D.j(method, i12, "Query map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw D.j(method, i12, AK.c.k("Query map contained null value for key '", str, "'."), new Object[0]);
                }
                retrofit2.f<T, String> fVar = this.f430056c;
                String str2 = (String) fVar.convert(value);
                if (str2 == null) {
                    throw D.j(method, i12, "Query map value '" + value + "' converted to null by " + fVar.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                }
                wVar.b(str, str2, this.f430057d);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    public static final class l<T> extends u<T> {

        /* renamed from: a, reason: collision with root package name */
        public final retrofit2.f<T, String> f430058a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f430059b;

        public l(retrofit2.f<T, String> fVar, boolean z12) {
            this.f430058a = fVar;
            this.f430059b = z12;
        }

        @Override // retrofit2.u
        public final void a(w wVar, @I41.h T t12) {
            if (t12 == null) {
                return;
            }
            wVar.b(this.f430058a.convert(t12), null, this.f430059b);
        }
    }

    /* compiled from: ParameterHandler.java */
    public static final class m extends u<MultipartBody.Part> {

        /* renamed from: a, reason: collision with root package name */
        public static final m f430060a = new m();

        @Override // retrofit2.u
        public final void a(w wVar, @I41.h MultipartBody.Part part) {
            MultipartBody.Part part2 = part;
            if (part2 != null) {
                wVar.f430077i.addPart(part2);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    public static final class n extends u<Object> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f430061a;

        /* renamed from: b, reason: collision with root package name */
        public final int f430062b;

        public n(int i12, Method method) {
            this.f430061a = method;
            this.f430062b = i12;
        }

        @Override // retrofit2.u
        public final void a(w wVar, @I41.h Object obj) {
            if (obj != null) {
                wVar.f430071c = obj.toString();
            } else {
                int i12 = this.f430062b;
                throw D.j(this.f430061a, i12, "@Url parameter is null.", new Object[0]);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    public static final class o<T> extends u<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Class<T> f430063a;

        public o(Class<T> cls) {
            this.f430063a = cls;
        }

        @Override // retrofit2.u
        public final void a(w wVar, @I41.h T t12) {
            wVar.f430073e.tag(this.f430063a, t12);
        }
    }

    public abstract void a(w wVar, @I41.h T t12);
}
