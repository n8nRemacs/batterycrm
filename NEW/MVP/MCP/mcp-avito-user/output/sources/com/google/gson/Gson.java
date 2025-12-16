package com.google.gson;

import com.google.gson.internal.A;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.internal.w;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes6.dex */
public final class Gson {

    /* renamed from: m, reason: collision with root package name */
    public static final FieldNamingPolicy f361954m = FieldNamingPolicy.f361952b;

    /* renamed from: n, reason: collision with root package name */
    public static final ToNumberPolicy f361955n = ToNumberPolicy.f361980b;

    /* renamed from: o, reason: collision with root package name */
    public static final ToNumberPolicy f361956o = ToNumberPolicy.f361981c;

    /* renamed from: p, reason: collision with root package name */
    public static final com.google.gson.reflect.a<?> f361957p = com.google.gson.reflect.a.get(Object.class);

    /* renamed from: a, reason: collision with root package name */
    public final ThreadLocal<Map<com.google.gson.reflect.a<?>, FutureTypeAdapter<?>>> f361958a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f361959b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.gson.internal.m f361960c;

    /* renamed from: d, reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f361961d;

    /* renamed from: e, reason: collision with root package name */
    public final Excluder f361962e;

    /* renamed from: f, reason: collision with root package name */
    public final FieldNamingPolicy f361963f;
    final List<r> factories;

    /* renamed from: g, reason: collision with root package name */
    public final Map<Type, e<?>> f361964g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f361965h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f361966i;

    /* renamed from: j, reason: collision with root package name */
    public final List<r> f361967j;

    /* renamed from: k, reason: collision with root package name */
    public final List<r> f361968k;

    /* renamed from: l, reason: collision with root package name */
    public final List<ReflectionAccessFilter> f361969l;

    /* renamed from: com.google.gson.Gson$1, reason: invalid class name */
    class AnonymousClass1 extends TypeAdapter<Number> {
        @Override // com.google.gson.TypeAdapter
        public final Number read(com.google.gson.stream.a aVar) {
            if (aVar.F() != JsonToken.f362204j) {
                return Double.valueOf(aVar.p());
            }
            aVar.z();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(com.google.gson.stream.c cVar, Number number) throws IOException {
            Number number2 = number;
            if (number2 == null) {
                cVar.j();
            } else {
                Gson.b(number2.doubleValue());
                cVar.p(number2);
            }
        }
    }

    /* renamed from: com.google.gson.Gson$2, reason: invalid class name */
    class AnonymousClass2 extends TypeAdapter<Number> {
        @Override // com.google.gson.TypeAdapter
        public final Number read(com.google.gson.stream.a aVar) {
            if (aVar.F() != JsonToken.f362204j) {
                return Float.valueOf((float) aVar.p());
            }
            aVar.z();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(com.google.gson.stream.c cVar, Number number) throws IOException {
            Number number2 = number;
            if (number2 == null) {
                cVar.j();
            } else {
                Gson.b(number2.floatValue());
                cVar.p(number2);
            }
        }
    }

    public static class FutureTypeAdapter<T> extends TypeAdapter<T> {

        /* renamed from: a, reason: collision with root package name */
        public TypeAdapter<T> f361972a;

        @Override // com.google.gson.TypeAdapter
        public final T read(com.google.gson.stream.a aVar) {
            TypeAdapter<T> typeAdapter = this.f361972a;
            if (typeAdapter != null) {
                return typeAdapter.read(aVar);
            }
            throw new IllegalStateException();
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(com.google.gson.stream.c cVar, T t12) {
            TypeAdapter<T> typeAdapter = this.f361972a;
            if (typeAdapter == null) {
                throw new IllegalStateException();
            }
            typeAdapter.write(cVar, t12);
        }
    }

    public Gson() {
        this(Excluder.f362008d, f361954m, Collections.emptyMap(), true, false, true, LongSerializationPolicy.f361973b, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), f361955n, f361956o, Collections.emptyList());
    }

    public static void a(com.google.gson.stream.a aVar, Object obj) {
        if (obj != null) {
            try {
                if (aVar.F() == JsonToken.f362205k) {
                } else {
                    throw new JsonSyntaxException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e12) {
                throw new JsonSyntaxException(e12);
            } catch (IOException e13) {
                throw new JsonIOException(e13);
            }
        }
    }

    public static void b(double d12) {
        if (Double.isNaN(d12) || Double.isInfinite(d12)) {
            throw new IllegalArgumentException(d12 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final <T> T c(com.google.gson.stream.a aVar, Type type) {
        boolean z12 = aVar.f362208c;
        boolean z13 = true;
        aVar.f362208c = true;
        try {
            try {
                try {
                    aVar.F();
                    z13 = false;
                    return f(com.google.gson.reflect.a.get(type)).read(aVar);
                } catch (EOFException e12) {
                    if (!z13) {
                        throw new JsonSyntaxException(e12);
                    }
                    aVar.f362208c = z12;
                    return null;
                } catch (IllegalStateException e13) {
                    throw new JsonSyntaxException(e13);
                }
            } catch (IOException e14) {
                throw new JsonSyntaxException(e14);
            } catch (AssertionError e15) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.9.1): " + e15.getMessage());
                assertionError.initCause(e15);
                throw assertionError;
            }
        } finally {
            aVar.f362208c = z12;
        }
    }

    public final Object d(Class cls, String str) {
        return A.b(cls).cast(e(str, cls));
    }

    public final <T> T e(String str, Type type) {
        if (str == null) {
            return null;
        }
        com.google.gson.stream.a aVar = new com.google.gson.stream.a(new StringReader(str));
        aVar.f362208c = false;
        T t12 = (T) c(aVar, type);
        a(aVar, t12);
        return t12;
    }

    public final <T> TypeAdapter<T> f(com.google.gson.reflect.a<T> aVar) {
        boolean z12;
        ConcurrentHashMap concurrentHashMap = this.f361959b;
        TypeAdapter<T> typeAdapter = (TypeAdapter) concurrentHashMap.get(aVar == null ? f361957p : aVar);
        if (typeAdapter != null) {
            return typeAdapter;
        }
        ThreadLocal<Map<com.google.gson.reflect.a<?>, FutureTypeAdapter<?>>> threadLocal = this.f361958a;
        Map<com.google.gson.reflect.a<?>, FutureTypeAdapter<?>> map = threadLocal.get();
        if (map == null) {
            map = new HashMap<>();
            threadLocal.set(map);
            z12 = true;
        } else {
            z12 = false;
        }
        FutureTypeAdapter<?> futureTypeAdapter = map.get(aVar);
        if (futureTypeAdapter != null) {
            return futureTypeAdapter;
        }
        try {
            FutureTypeAdapter<?> futureTypeAdapter2 = new FutureTypeAdapter<>();
            map.put(aVar, futureTypeAdapter2);
            Iterator<r> it = this.factories.iterator();
            while (it.hasNext()) {
                TypeAdapter<T> typeAdapterA = it.next().a(this, aVar);
                if (typeAdapterA != null) {
                    if (futureTypeAdapter2.f361972a != null) {
                        throw new AssertionError();
                    }
                    futureTypeAdapter2.f361972a = typeAdapterA;
                    concurrentHashMap.put(aVar, typeAdapterA);
                    map.remove(aVar);
                    if (z12) {
                        threadLocal.remove();
                    }
                    return typeAdapterA;
                }
            }
            throw new IllegalArgumentException("GSON (2.9.1) cannot handle " + aVar);
        } catch (Throwable th2) {
            map.remove(aVar);
            if (z12) {
                threadLocal.remove();
            }
            throw th2;
        }
    }

    public final <T> TypeAdapter<T> g(Class<T> cls) {
        return f(com.google.gson.reflect.a.get((Class) cls));
    }

    public final <T> TypeAdapter<T> h(r rVar, com.google.gson.reflect.a<T> aVar) {
        if (!this.factories.contains(rVar)) {
            rVar = this.f361961d;
        }
        boolean z12 = false;
        for (r rVar2 : this.factories) {
            if (z12) {
                TypeAdapter<T> typeAdapterA = rVar2.a(this, aVar);
                if (typeAdapterA != null) {
                    return typeAdapterA;
                }
            } else if (rVar2 == rVar) {
                z12 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public final com.google.gson.stream.c i(Writer writer) {
        com.google.gson.stream.c cVar = new com.google.gson.stream.c(writer);
        if (this.f361966i) {
            cVar.f362228e = "  ";
            cVar.f362229f = ": ";
        }
        cVar.f362231h = this.f361965h;
        cVar.f362230g = false;
        cVar.f362233j = false;
        return cVar;
    }

    public final String j(i iVar) {
        StringWriter stringWriter = new StringWriter();
        try {
            m(i(stringWriter), iVar);
            return stringWriter.toString();
        } catch (IOException e12) {
            throw new JsonIOException(e12);
        }
    }

    public final String k(Class cls, Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            n(obj, cls, i(stringWriter));
            return stringWriter.toString();
        } catch (IOException e12) {
            throw new JsonIOException(e12);
        }
    }

    public final String l(Object obj) {
        return obj == null ? j(j.f362193b) : k(obj.getClass(), obj);
    }

    public final void m(com.google.gson.stream.c cVar, i iVar) {
        boolean z12 = cVar.f362230g;
        cVar.f362230g = true;
        boolean z13 = cVar.f362231h;
        cVar.f362231h = this.f361965h;
        boolean z14 = cVar.f362233j;
        cVar.f362233j = false;
        try {
            try {
                TypeAdapters.f362103z.write(cVar, iVar);
                cVar.f362230g = z12;
                cVar.f362231h = z13;
                cVar.f362233j = z14;
            } catch (IOException e12) {
                throw new JsonIOException(e12);
            } catch (AssertionError e13) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.9.1): " + e13.getMessage());
                assertionError.initCause(e13);
                throw assertionError;
            }
        } catch (Throwable th2) {
            cVar.f362230g = z12;
            cVar.f362231h = z13;
            cVar.f362233j = z14;
            throw th2;
        }
    }

    public final void n(Object obj, Type type, com.google.gson.stream.c cVar) {
        TypeAdapter typeAdapterF = f(com.google.gson.reflect.a.get(type));
        boolean z12 = cVar.f362230g;
        cVar.f362230g = true;
        boolean z13 = cVar.f362231h;
        cVar.f362231h = this.f361965h;
        boolean z14 = cVar.f362233j;
        cVar.f362233j = false;
        try {
            try {
                try {
                    typeAdapterF.write(cVar, obj);
                } catch (IOException e12) {
                    throw new JsonIOException(e12);
                }
            } catch (AssertionError e13) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.9.1): " + e13.getMessage());
                assertionError.initCause(e13);
                throw assertionError;
            }
        } finally {
            cVar.f362230g = z12;
            cVar.f362231h = z13;
            cVar.f362233j = z14;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.factories + ",instanceCreators:" + this.f361960c + "}";
    }

    public Gson(Excluder excluder, FieldNamingPolicy fieldNamingPolicy, Map map, boolean z12, boolean z13, boolean z14, LongSerializationPolicy longSerializationPolicy, List list, List list2, List list3, ToNumberPolicy toNumberPolicy, ToNumberPolicy toNumberPolicy2, List list4) {
        final TypeAdapter<Number> typeAdapter;
        r rVarA;
        this.f361958a = new ThreadLocal<>();
        this.f361959b = new ConcurrentHashMap();
        this.f361962e = excluder;
        this.f361963f = fieldNamingPolicy;
        this.f361964g = map;
        com.google.gson.internal.m mVar = new com.google.gson.internal.m(list4, z14, map);
        this.f361960c = mVar;
        this.f361965h = z12;
        this.f361966i = z13;
        this.f361967j = list;
        this.f361968k = list2;
        this.f361969l = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.f362076A);
        arrayList.add(ObjectTypeAdapter.a(toNumberPolicy));
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.f362093p);
        arrayList.add(TypeAdapters.f362084g);
        arrayList.add(TypeAdapters.f362081d);
        arrayList.add(TypeAdapters.f362082e);
        arrayList.add(TypeAdapters.f362083f);
        if (longSerializationPolicy == LongSerializationPolicy.f361973b) {
            typeAdapter = TypeAdapters.f362088k;
        } else {
            typeAdapter = new TypeAdapter<Number>() { // from class: com.google.gson.Gson.3
                @Override // com.google.gson.TypeAdapter
                public final Number read(com.google.gson.stream.a aVar) {
                    if (aVar.F() != JsonToken.f362204j) {
                        return Long.valueOf(aVar.u());
                    }
                    aVar.z();
                    return null;
                }

                @Override // com.google.gson.TypeAdapter
                public final void write(com.google.gson.stream.c cVar, Number number) throws IOException {
                    Number number2 = number;
                    if (number2 == null) {
                        cVar.j();
                    } else {
                        cVar.q(number2.toString());
                    }
                }
            };
        }
        arrayList.add(TypeAdapters.c(Long.TYPE, Long.class, typeAdapter));
        arrayList.add(TypeAdapters.c(Double.TYPE, Double.class, new AnonymousClass1()));
        arrayList.add(TypeAdapters.c(Float.TYPE, Float.class, new AnonymousClass2()));
        r rVar = NumberTypeAdapter.f362042b;
        if (toNumberPolicy2 == ToNumberPolicy.f361981c) {
            rVarA = NumberTypeAdapter.f362042b;
        } else {
            rVarA = NumberTypeAdapter.a(toNumberPolicy2);
        }
        arrayList.add(rVarA);
        arrayList.add(TypeAdapters.f362085h);
        arrayList.add(TypeAdapters.f362086i);
        arrayList.add(TypeAdapters.b(AtomicLong.class, new TypeAdapter<AtomicLong>() { // from class: com.google.gson.Gson.4
            @Override // com.google.gson.TypeAdapter
            public final AtomicLong read(com.google.gson.stream.a aVar) {
                return new AtomicLong(((Number) typeAdapter.read(aVar)).longValue());
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(com.google.gson.stream.c cVar, AtomicLong atomicLong) {
                typeAdapter.write(cVar, Long.valueOf(atomicLong.get()));
            }
        }.nullSafe()));
        arrayList.add(TypeAdapters.b(AtomicLongArray.class, new TypeAdapter<AtomicLongArray>() { // from class: com.google.gson.Gson.5
            @Override // com.google.gson.TypeAdapter
            public final AtomicLongArray read(com.google.gson.stream.a aVar) {
                ArrayList arrayList2 = new ArrayList();
                aVar.a();
                while (aVar.k()) {
                    arrayList2.add(Long.valueOf(((Number) typeAdapter.read(aVar)).longValue()));
                }
                aVar.f();
                int size = arrayList2.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i12 = 0; i12 < size; i12++) {
                    atomicLongArray.set(i12, ((Long) arrayList2.get(i12)).longValue());
                }
                return atomicLongArray;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(com.google.gson.stream.c cVar, AtomicLongArray atomicLongArray) throws IOException {
                AtomicLongArray atomicLongArray2 = atomicLongArray;
                cVar.b();
                int length = atomicLongArray2.length();
                for (int i12 = 0; i12 < length; i12++) {
                    typeAdapter.write(cVar, Long.valueOf(atomicLongArray2.get(i12)));
                }
                cVar.f();
            }
        }.nullSafe()));
        arrayList.add(TypeAdapters.f362087j);
        arrayList.add(TypeAdapters.f362089l);
        arrayList.add(TypeAdapters.f362094q);
        arrayList.add(TypeAdapters.f362095r);
        arrayList.add(TypeAdapters.b(BigDecimal.class, TypeAdapters.f362090m));
        arrayList.add(TypeAdapters.b(BigInteger.class, TypeAdapters.f362091n));
        arrayList.add(TypeAdapters.b(w.class, TypeAdapters.f362092o));
        arrayList.add(TypeAdapters.f362096s);
        arrayList.add(TypeAdapters.f362097t);
        arrayList.add(TypeAdapters.f362099v);
        arrayList.add(TypeAdapters.f362100w);
        arrayList.add(TypeAdapters.f362102y);
        arrayList.add(TypeAdapters.f362098u);
        arrayList.add(TypeAdapters.f362079b);
        arrayList.add(DateTypeAdapter.f362031b);
        arrayList.add(TypeAdapters.f362101x);
        if (com.google.gson.internal.sql.a.f362162a) {
            arrayList.add(com.google.gson.internal.sql.a.f362166e);
            arrayList.add(com.google.gson.internal.sql.a.f362165d);
            arrayList.add(com.google.gson.internal.sql.a.f362167f);
        }
        arrayList.add(ArrayTypeAdapter.f362025c);
        arrayList.add(TypeAdapters.f362078a);
        arrayList.add(new CollectionTypeAdapterFactory(mVar));
        arrayList.add(new MapTypeAdapterFactory(mVar));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(mVar);
        this.f361961d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.f362077B);
        arrayList.add(new ReflectiveTypeAdapterFactory(mVar, fieldNamingPolicy, excluder, jsonAdapterAnnotationTypeAdapterFactory, list4));
        this.factories = Collections.unmodifiableList(arrayList);
    }
}
