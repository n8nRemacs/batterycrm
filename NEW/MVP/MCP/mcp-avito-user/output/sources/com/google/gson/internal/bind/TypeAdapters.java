package com.google.gson.internal.bind;

import androidx.camera.camera2.internal.G;
import androidx.compose.ui.graphics.colorspace.e;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.SelectionType;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.f;
import com.google.gson.i;
import com.google.gson.internal.w;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.r;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: classes6.dex */
public final class TypeAdapters {

    /* renamed from: A, reason: collision with root package name */
    public static final r f362076A;

    /* renamed from: B, reason: collision with root package name */
    public static final r f362077B;

    /* renamed from: a, reason: collision with root package name */
    public static final r f362078a = new AnonymousClass31(Class.class, new TypeAdapter<Class>() { // from class: com.google.gson.internal.bind.TypeAdapters.1
        @Override // com.google.gson.TypeAdapter
        public final Class read(com.google.gson.stream.a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(com.google.gson.stream.c cVar, Class cls) {
            throw new UnsupportedOperationException(C0.f(cls, new StringBuilder("Attempted to serialize java.lang.Class: "), ". Forgot to register a type adapter?"));
        }
    }.nullSafe());

    /* renamed from: b, reason: collision with root package name */
    public static final r f362079b = new AnonymousClass31(BitSet.class, new TypeAdapter<BitSet>() { // from class: com.google.gson.internal.bind.TypeAdapters.2
        @Override // com.google.gson.TypeAdapter
        public final BitSet read(com.google.gson.stream.a aVar) {
            boolean zO2;
            BitSet bitSet = new BitSet();
            aVar.a();
            JsonToken jsonTokenF = aVar.F();
            int i12 = 0;
            while (jsonTokenF != JsonToken.f362197c) {
                int iOrdinal = jsonTokenF.ordinal();
                if (iOrdinal == 5 || iOrdinal == 6) {
                    int iQ2 = aVar.q();
                    if (iQ2 == 0) {
                        zO2 = false;
                    } else {
                        if (iQ2 != 1) {
                            StringBuilder sbJ = G.j(iQ2, "Invalid bitset value ", ", expected 0 or 1; at path ");
                            sbJ.append(aVar.j());
                            throw new JsonSyntaxException(sbJ.toString());
                        }
                        zO2 = true;
                    }
                } else {
                    if (iOrdinal != 7) {
                        StringBuilder sbK = com.avito.android.authorization.auto_recovery.phone_confirm.b.k("Invalid bitset value type: ", jsonTokenF, "; at path ");
                        sbK.append(aVar.getPath());
                        throw new JsonSyntaxException(sbK.toString());
                    }
                    zO2 = aVar.o();
                }
                if (zO2) {
                    bitSet.set(i12);
                }
                i12++;
                jsonTokenF = aVar.F();
            }
            aVar.f();
            return bitSet;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(com.google.gson.stream.c cVar, BitSet bitSet) throws IOException {
            BitSet bitSet2 = bitSet;
            cVar.b();
            int length = bitSet2.length();
            for (int i12 = 0; i12 < length; i12++) {
                cVar.n(bitSet2.get(i12) ? 1L : 0L);
            }
            cVar.f();
        }
    }.nullSafe());

    /* renamed from: c, reason: collision with root package name */
    public static final TypeAdapter<Boolean> f362080c;

    /* renamed from: d, reason: collision with root package name */
    public static final r f362081d;

    /* renamed from: e, reason: collision with root package name */
    public static final r f362082e;

    /* renamed from: f, reason: collision with root package name */
    public static final r f362083f;

    /* renamed from: g, reason: collision with root package name */
    public static final r f362084g;

    /* renamed from: h, reason: collision with root package name */
    public static final r f362085h;

    /* renamed from: i, reason: collision with root package name */
    public static final r f362086i;

    /* renamed from: j, reason: collision with root package name */
    public static final r f362087j;

    /* renamed from: k, reason: collision with root package name */
    public static final TypeAdapter<Number> f362088k;

    /* renamed from: l, reason: collision with root package name */
    public static final r f362089l;

    /* renamed from: m, reason: collision with root package name */
    public static final TypeAdapter<BigDecimal> f362090m;

    /* renamed from: n, reason: collision with root package name */
    public static final TypeAdapter<BigInteger> f362091n;

    /* renamed from: o, reason: collision with root package name */
    public static final TypeAdapter<w> f362092o;

    /* renamed from: p, reason: collision with root package name */
    public static final r f362093p;

    /* renamed from: q, reason: collision with root package name */
    public static final r f362094q;

    /* renamed from: r, reason: collision with root package name */
    public static final r f362095r;

    /* renamed from: s, reason: collision with root package name */
    public static final r f362096s;

    /* renamed from: t, reason: collision with root package name */
    public static final r f362097t;

    /* renamed from: u, reason: collision with root package name */
    public static final r f362098u;

    /* renamed from: v, reason: collision with root package name */
    public static final r f362099v;

    /* renamed from: w, reason: collision with root package name */
    public static final r f362100w;

    /* renamed from: x, reason: collision with root package name */
    public static final r f362101x;

    /* renamed from: y, reason: collision with root package name */
    public static final r f362102y;

    /* renamed from: z, reason: collision with root package name */
    public static final TypeAdapter<i> f362103z;

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$31, reason: invalid class name */
    public class AnonymousClass31 implements r {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Class f362106b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TypeAdapter f362107c;

        public AnonymousClass31(Class cls, TypeAdapter typeAdapter) {
            this.f362106b = cls;
            this.f362107c = typeAdapter;
        }

        @Override // com.google.gson.r
        public final <T> TypeAdapter<T> a(Gson gson, com.google.gson.reflect.a<T> aVar) {
            if (aVar.getRawType() == this.f362106b) {
                return this.f362107c;
            }
            return null;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Factory[type=");
            e.u(this.f362106b, sb2, ",adapter=");
            sb2.append(this.f362107c);
            sb2.append("]");
            return sb2.toString();
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$32, reason: invalid class name */
    public class AnonymousClass32 implements r {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Class f362108b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Class f362109c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ TypeAdapter f362110d;

        public AnonymousClass32(Class cls, Class cls2, TypeAdapter typeAdapter) {
            this.f362108b = cls;
            this.f362109c = cls2;
            this.f362110d = typeAdapter;
        }

        @Override // com.google.gson.r
        public final <T> TypeAdapter<T> a(Gson gson, com.google.gson.reflect.a<T> aVar) {
            Class<? super T> rawType = aVar.getRawType();
            if (rawType == this.f362108b || rawType == this.f362109c) {
                return this.f362110d;
            }
            return null;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Factory[type=");
            e.u(this.f362109c, sb2, "+");
            e.u(this.f362108b, sb2, ",adapter=");
            sb2.append(this.f362110d);
            sb2.append("]");
            return sb2.toString();
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$34, reason: invalid class name */
    class AnonymousClass34 implements r {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Class f362112b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TypeAdapter f362113c;

        public AnonymousClass34(Class cls, TypeAdapter typeAdapter) {
            this.f362112b = cls;
            this.f362113c = typeAdapter;
        }

        @Override // com.google.gson.r
        public final <T2> TypeAdapter<T2> a(Gson gson, com.google.gson.reflect.a<T2> aVar) {
            final Class<? super T2> rawType = aVar.getRawType();
            if (this.f362112b.isAssignableFrom(rawType)) {
                return (TypeAdapter<T2>) new TypeAdapter<Object>() { // from class: com.google.gson.internal.bind.TypeAdapters.34.1
                    @Override // com.google.gson.TypeAdapter
                    public final Object read(com.google.gson.stream.a aVar2) {
                        Object obj = AnonymousClass34.this.f362113c.read(aVar2);
                        if (obj != null) {
                            Class cls = rawType;
                            if (!cls.isInstance(obj)) {
                                throw new JsonSyntaxException("Expected a " + cls.getName() + " but was " + obj.getClass().getName() + "; at path " + aVar2.j());
                            }
                        }
                        return obj;
                    }

                    @Override // com.google.gson.TypeAdapter
                    public final void write(com.google.gson.stream.c cVar, Object obj) {
                        AnonymousClass34.this.f362113c.write(cVar, obj);
                    }
                };
            }
            return null;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Factory[typeHierarchy=");
            e.u(this.f362112b, sb2, ",adapter=");
            sb2.append(this.f362113c);
            sb2.append("]");
            return sb2.toString();
        }
    }

    public static final class EnumTypeAdapter<T extends Enum<T>> extends TypeAdapter<T> {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f362116a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        public final HashMap f362117b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        public final HashMap f362118c = new HashMap();

        public class a implements PrivilegedAction<Field[]> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Class f362119b;

            public a(Class cls) {
                this.f362119b = cls;
            }

            @Override // java.security.PrivilegedAction
            public final Field[] run() throws SecurityException {
                Field[] declaredFields = this.f362119b.getDeclaredFields();
                ArrayList arrayList = new ArrayList(declaredFields.length);
                for (Field field : declaredFields) {
                    if (field.isEnumConstant()) {
                        arrayList.add(field);
                    }
                }
                Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
                AccessibleObject.setAccessible(fieldArr, true);
                return fieldArr;
            }
        }

        public EnumTypeAdapter(Class<T> cls) {
            try {
                for (Field field : (Field[]) AccessController.doPrivileged(new a(cls))) {
                    Enum r42 = (Enum) field.get(null);
                    String strName = r42.name();
                    String string = r42.toString();
                    com.google.gson.annotations.c cVar = (com.google.gson.annotations.c) field.getAnnotation(com.google.gson.annotations.c.class);
                    if (cVar != null) {
                        strName = cVar.value();
                        for (String str : cVar.alternate()) {
                            this.f362116a.put(str, r42);
                        }
                    }
                    this.f362116a.put(strName, r42);
                    this.f362117b.put(string, r42);
                    this.f362118c.put(r42, strName);
                }
            } catch (IllegalAccessException e12) {
                throw new AssertionError(e12);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public final Object read(com.google.gson.stream.a aVar) {
            if (aVar.F() == JsonToken.f362204j) {
                aVar.z();
                return null;
            }
            String strB = aVar.B();
            Enum r02 = (Enum) this.f362116a.get(strB);
            return r02 == null ? (Enum) this.f362117b.get(strB) : r02;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(com.google.gson.stream.c cVar, Object obj) throws IOException {
            Enum r32 = (Enum) obj;
            cVar.q(r32 == null ? null : (String) this.f362118c.get(r32));
        }
    }

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f362120a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f362120a = iArr;
            try {
                iArr[6] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f362120a[5] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f362120a[7] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f362120a[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f362120a[2] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f362120a[8] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static {
        TypeAdapter<Boolean> typeAdapter = new TypeAdapter<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.3
            @Override // com.google.gson.TypeAdapter
            public final Boolean read(com.google.gson.stream.a aVar) {
                JsonToken jsonTokenF = aVar.F();
                if (jsonTokenF != JsonToken.f362204j) {
                    return jsonTokenF == JsonToken.f362201g ? Boolean.valueOf(Boolean.parseBoolean(aVar.B())) : Boolean.valueOf(aVar.o());
                }
                aVar.z();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(com.google.gson.stream.c cVar, Boolean bool) throws IOException {
                cVar.o(bool);
            }
        };
        f362080c = new TypeAdapter<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.4
            @Override // com.google.gson.TypeAdapter
            public final Boolean read(com.google.gson.stream.a aVar) {
                if (aVar.F() != JsonToken.f362204j) {
                    return Boolean.valueOf(aVar.B());
                }
                aVar.z();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(com.google.gson.stream.c cVar, Boolean bool) throws IOException {
                Boolean bool2 = bool;
                cVar.q(bool2 == null ? "null" : bool2.toString());
            }
        };
        f362081d = new AnonymousClass32(Boolean.TYPE, Boolean.class, typeAdapter);
        f362082e = new AnonymousClass32(Byte.TYPE, Byte.class, new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.5
            @Override // com.google.gson.TypeAdapter
            public final Number read(com.google.gson.stream.a aVar) {
                if (aVar.F() == JsonToken.f362204j) {
                    aVar.z();
                    return null;
                }
                try {
                    int iQ2 = aVar.q();
                    if (iQ2 <= 255 && iQ2 >= -128) {
                        return Byte.valueOf((byte) iQ2);
                    }
                    StringBuilder sbJ = G.j(iQ2, "Lossy conversion from ", " to byte; at path ");
                    sbJ.append(aVar.j());
                    throw new JsonSyntaxException(sbJ.toString());
                } catch (NumberFormatException e12) {
                    throw new JsonSyntaxException(e12);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(com.google.gson.stream.c cVar, Number number) throws IOException {
                cVar.p(number);
            }
        });
        f362083f = new AnonymousClass32(Short.TYPE, Short.class, new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.6
            @Override // com.google.gson.TypeAdapter
            public final Number read(com.google.gson.stream.a aVar) {
                if (aVar.F() == JsonToken.f362204j) {
                    aVar.z();
                    return null;
                }
                try {
                    int iQ2 = aVar.q();
                    if (iQ2 <= 65535 && iQ2 >= -32768) {
                        return Short.valueOf((short) iQ2);
                    }
                    StringBuilder sbJ = G.j(iQ2, "Lossy conversion from ", " to short; at path ");
                    sbJ.append(aVar.j());
                    throw new JsonSyntaxException(sbJ.toString());
                } catch (NumberFormatException e12) {
                    throw new JsonSyntaxException(e12);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(com.google.gson.stream.c cVar, Number number) throws IOException {
                cVar.p(number);
            }
        });
        f362084g = new AnonymousClass32(Integer.TYPE, Integer.class, new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.7
            @Override // com.google.gson.TypeAdapter
            public final Number read(com.google.gson.stream.a aVar) {
                if (aVar.F() == JsonToken.f362204j) {
                    aVar.z();
                    return null;
                }
                try {
                    return Integer.valueOf(aVar.q());
                } catch (NumberFormatException e12) {
                    throw new JsonSyntaxException(e12);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(com.google.gson.stream.c cVar, Number number) throws IOException {
                cVar.p(number);
            }
        });
        f362085h = new AnonymousClass31(AtomicInteger.class, new TypeAdapter<AtomicInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.8
            @Override // com.google.gson.TypeAdapter
            public final AtomicInteger read(com.google.gson.stream.a aVar) {
                try {
                    return new AtomicInteger(aVar.q());
                } catch (NumberFormatException e12) {
                    throw new JsonSyntaxException(e12);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(com.google.gson.stream.c cVar, AtomicInteger atomicInteger) throws IOException {
                cVar.n(atomicInteger.get());
            }
        }.nullSafe());
        f362086i = new AnonymousClass31(AtomicBoolean.class, new TypeAdapter<AtomicBoolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.9
            @Override // com.google.gson.TypeAdapter
            public final AtomicBoolean read(com.google.gson.stream.a aVar) {
                return new AtomicBoolean(aVar.o());
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(com.google.gson.stream.c cVar, AtomicBoolean atomicBoolean) throws IOException {
                cVar.u(atomicBoolean.get());
            }
        }.nullSafe());
        f362087j = new AnonymousClass31(AtomicIntegerArray.class, new TypeAdapter<AtomicIntegerArray>() { // from class: com.google.gson.internal.bind.TypeAdapters.10
            @Override // com.google.gson.TypeAdapter
            public final AtomicIntegerArray read(com.google.gson.stream.a aVar) {
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.k()) {
                    try {
                        arrayList.add(Integer.valueOf(aVar.q()));
                    } catch (NumberFormatException e12) {
                        throw new JsonSyntaxException(e12);
                    }
                }
                aVar.f();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i12 = 0; i12 < size; i12++) {
                    atomicIntegerArray.set(i12, ((Integer) arrayList.get(i12)).intValue());
                }
                return atomicIntegerArray;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(com.google.gson.stream.c cVar, AtomicIntegerArray atomicIntegerArray) throws IOException {
                cVar.b();
                int length = atomicIntegerArray.length();
                for (int i12 = 0; i12 < length; i12++) {
                    cVar.n(r6.get(i12));
                }
                cVar.f();
            }
        }.nullSafe());
        f362088k = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.11
            @Override // com.google.gson.TypeAdapter
            public final Number read(com.google.gson.stream.a aVar) {
                if (aVar.F() == JsonToken.f362204j) {
                    aVar.z();
                    return null;
                }
                try {
                    return Long.valueOf(aVar.u());
                } catch (NumberFormatException e12) {
                    throw new JsonSyntaxException(e12);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(com.google.gson.stream.c cVar, Number number) throws IOException {
                cVar.p(number);
            }
        };
        new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.12
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
                cVar.p(number);
            }
        };
        new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.13
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
                cVar.p(number);
            }
        };
        f362089l = new AnonymousClass32(Character.TYPE, Character.class, new TypeAdapter<Character>() { // from class: com.google.gson.internal.bind.TypeAdapters.14
            @Override // com.google.gson.TypeAdapter
            public final Character read(com.google.gson.stream.a aVar) {
                if (aVar.F() == JsonToken.f362204j) {
                    aVar.z();
                    return null;
                }
                String strB = aVar.B();
                if (strB.length() == 1) {
                    return Character.valueOf(strB.charAt(0));
                }
                StringBuilder sbA = androidx.appcompat.app.r.A("Expecting character, got: ", strB, "; at ");
                sbA.append(aVar.j());
                throw new JsonSyntaxException(sbA.toString());
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(com.google.gson.stream.c cVar, Character ch2) throws IOException {
                Character ch3 = ch2;
                cVar.q(ch3 == null ? null : String.valueOf(ch3));
            }
        });
        TypeAdapter<String> typeAdapter2 = new TypeAdapter<String>() { // from class: com.google.gson.internal.bind.TypeAdapters.15
            @Override // com.google.gson.TypeAdapter
            public final String read(com.google.gson.stream.a aVar) {
                JsonToken jsonTokenF = aVar.F();
                if (jsonTokenF != JsonToken.f362204j) {
                    return jsonTokenF == JsonToken.f362203i ? Boolean.toString(aVar.o()) : aVar.B();
                }
                aVar.z();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(com.google.gson.stream.c cVar, String str) throws IOException {
                cVar.q(str);
            }
        };
        f362090m = new TypeAdapter<BigDecimal>() { // from class: com.google.gson.internal.bind.TypeAdapters.16
            @Override // com.google.gson.TypeAdapter
            public final BigDecimal read(com.google.gson.stream.a aVar) {
                if (aVar.F() == JsonToken.f362204j) {
                    aVar.z();
                    return null;
                }
                String strB = aVar.B();
                try {
                    return new BigDecimal(strB);
                } catch (NumberFormatException e12) {
                    StringBuilder sbA = androidx.appcompat.app.r.A("Failed parsing '", strB, "' as BigDecimal; at path ");
                    sbA.append(aVar.j());
                    throw new JsonSyntaxException(sbA.toString(), e12);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(com.google.gson.stream.c cVar, BigDecimal bigDecimal) throws IOException {
                cVar.p(bigDecimal);
            }
        };
        f362091n = new TypeAdapter<BigInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.17
            @Override // com.google.gson.TypeAdapter
            public final BigInteger read(com.google.gson.stream.a aVar) {
                if (aVar.F() == JsonToken.f362204j) {
                    aVar.z();
                    return null;
                }
                String strB = aVar.B();
                try {
                    return new BigInteger(strB);
                } catch (NumberFormatException e12) {
                    StringBuilder sbA = androidx.appcompat.app.r.A("Failed parsing '", strB, "' as BigInteger; at path ");
                    sbA.append(aVar.j());
                    throw new JsonSyntaxException(sbA.toString(), e12);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(com.google.gson.stream.c cVar, BigInteger bigInteger) throws IOException {
                cVar.p(bigInteger);
            }
        };
        f362092o = new TypeAdapter<w>() { // from class: com.google.gson.internal.bind.TypeAdapters.18
            @Override // com.google.gson.TypeAdapter
            public final w read(com.google.gson.stream.a aVar) {
                if (aVar.F() != JsonToken.f362204j) {
                    return new w(aVar.B());
                }
                aVar.z();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(com.google.gson.stream.c cVar, w wVar) throws IOException {
                cVar.p(wVar);
            }
        };
        f362093p = new AnonymousClass31(String.class, typeAdapter2);
        f362094q = new AnonymousClass31(StringBuilder.class, new TypeAdapter<StringBuilder>() { // from class: com.google.gson.internal.bind.TypeAdapters.19
            @Override // com.google.gson.TypeAdapter
            public final StringBuilder read(com.google.gson.stream.a aVar) {
                if (aVar.F() != JsonToken.f362204j) {
                    return new StringBuilder(aVar.B());
                }
                aVar.z();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(com.google.gson.stream.c cVar, StringBuilder sb2) throws IOException {
                StringBuilder sb3 = sb2;
                cVar.q(sb3 == null ? null : sb3.toString());
            }
        });
        f362095r = new AnonymousClass31(StringBuffer.class, new TypeAdapter<StringBuffer>() { // from class: com.google.gson.internal.bind.TypeAdapters.20
            @Override // com.google.gson.TypeAdapter
            public final StringBuffer read(com.google.gson.stream.a aVar) {
                if (aVar.F() != JsonToken.f362204j) {
                    return new StringBuffer(aVar.B());
                }
                aVar.z();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(com.google.gson.stream.c cVar, StringBuffer stringBuffer) throws IOException {
                StringBuffer stringBuffer2 = stringBuffer;
                cVar.q(stringBuffer2 == null ? null : stringBuffer2.toString());
            }
        });
        f362096s = new AnonymousClass31(URL.class, new TypeAdapter<URL>() { // from class: com.google.gson.internal.bind.TypeAdapters.21
            @Override // com.google.gson.TypeAdapter
            public final URL read(com.google.gson.stream.a aVar) {
                if (aVar.F() == JsonToken.f362204j) {
                    aVar.z();
                    return null;
                }
                String strB = aVar.B();
                if ("null".equals(strB)) {
                    return null;
                }
                return new URL(strB);
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(com.google.gson.stream.c cVar, URL url) throws IOException {
                URL url2 = url;
                cVar.q(url2 == null ? null : url2.toExternalForm());
            }
        });
        f362097t = new AnonymousClass31(URI.class, new TypeAdapter<URI>() { // from class: com.google.gson.internal.bind.TypeAdapters.22
            @Override // com.google.gson.TypeAdapter
            public final URI read(com.google.gson.stream.a aVar) {
                if (aVar.F() == JsonToken.f362204j) {
                    aVar.z();
                    return null;
                }
                try {
                    String strB = aVar.B();
                    if ("null".equals(strB)) {
                        return null;
                    }
                    return new URI(strB);
                } catch (URISyntaxException e12) {
                    throw new JsonIOException(e12);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(com.google.gson.stream.c cVar, URI uri) throws IOException {
                URI uri2 = uri;
                cVar.q(uri2 == null ? null : uri2.toASCIIString());
            }
        });
        f362098u = new AnonymousClass34(InetAddress.class, new TypeAdapter<InetAddress>() { // from class: com.google.gson.internal.bind.TypeAdapters.23
            @Override // com.google.gson.TypeAdapter
            public final InetAddress read(com.google.gson.stream.a aVar) {
                if (aVar.F() != JsonToken.f362204j) {
                    return InetAddress.getByName(aVar.B());
                }
                aVar.z();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(com.google.gson.stream.c cVar, InetAddress inetAddress) throws IOException {
                InetAddress inetAddress2 = inetAddress;
                cVar.q(inetAddress2 == null ? null : inetAddress2.getHostAddress());
            }
        });
        f362099v = new AnonymousClass31(UUID.class, new TypeAdapter<UUID>() { // from class: com.google.gson.internal.bind.TypeAdapters.24
            @Override // com.google.gson.TypeAdapter
            public final UUID read(com.google.gson.stream.a aVar) {
                if (aVar.F() == JsonToken.f362204j) {
                    aVar.z();
                    return null;
                }
                String strB = aVar.B();
                try {
                    return UUID.fromString(strB);
                } catch (IllegalArgumentException e12) {
                    StringBuilder sbA = androidx.appcompat.app.r.A("Failed parsing '", strB, "' as UUID; at path ");
                    sbA.append(aVar.j());
                    throw new JsonSyntaxException(sbA.toString(), e12);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(com.google.gson.stream.c cVar, UUID uuid) throws IOException {
                UUID uuid2 = uuid;
                cVar.q(uuid2 == null ? null : uuid2.toString());
            }
        });
        f362100w = new AnonymousClass31(Currency.class, new TypeAdapter<Currency>() { // from class: com.google.gson.internal.bind.TypeAdapters.25
            @Override // com.google.gson.TypeAdapter
            public final Currency read(com.google.gson.stream.a aVar) {
                String strB = aVar.B();
                try {
                    return Currency.getInstance(strB);
                } catch (IllegalArgumentException e12) {
                    StringBuilder sbA = androidx.appcompat.app.r.A("Failed parsing '", strB, "' as Currency; at path ");
                    sbA.append(aVar.j());
                    throw new JsonSyntaxException(sbA.toString(), e12);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(com.google.gson.stream.c cVar, Currency currency) throws IOException {
                cVar.q(currency.getCurrencyCode());
            }
        }.nullSafe());
        final TypeAdapter<Calendar> typeAdapter3 = new TypeAdapter<Calendar>() { // from class: com.google.gson.internal.bind.TypeAdapters.26
            @Override // com.google.gson.TypeAdapter
            public final Calendar read(com.google.gson.stream.a aVar) {
                if (aVar.F() == JsonToken.f362204j) {
                    aVar.z();
                    return null;
                }
                aVar.b();
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                while (aVar.F() != JsonToken.f362199e) {
                    String strX = aVar.x();
                    int iQ2 = aVar.q();
                    if (SelectionType.TYPE_YEAR.equals(strX)) {
                        i12 = iQ2;
                    } else if (SelectionType.TYPE_MONTH.equals(strX)) {
                        i13 = iQ2;
                    } else if ("dayOfMonth".equals(strX)) {
                        i14 = iQ2;
                    } else if ("hourOfDay".equals(strX)) {
                        i15 = iQ2;
                    } else if (SelectionType.TYPE_MINUTE.equals(strX)) {
                        i16 = iQ2;
                    } else if ("second".equals(strX)) {
                        i17 = iQ2;
                    }
                }
                aVar.g();
                return new GregorianCalendar(i12, i13, i14, i15, i16, i17);
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(com.google.gson.stream.c cVar, Calendar calendar) throws IOException {
                if (calendar == null) {
                    cVar.j();
                    return;
                }
                cVar.c();
                cVar.h(SelectionType.TYPE_YEAR);
                cVar.n(r4.get(1));
                cVar.h(SelectionType.TYPE_MONTH);
                cVar.n(r4.get(2));
                cVar.h("dayOfMonth");
                cVar.n(r4.get(5));
                cVar.h("hourOfDay");
                cVar.n(r4.get(11));
                cVar.h(SelectionType.TYPE_MINUTE);
                cVar.n(r4.get(12));
                cVar.h("second");
                cVar.n(r4.get(13));
                cVar.g();
            }
        };
        f362101x = new r() { // from class: com.google.gson.internal.bind.TypeAdapters.33
            @Override // com.google.gson.r
            public final <T> TypeAdapter<T> a(Gson gson, com.google.gson.reflect.a<T> aVar) {
                Class<? super T> rawType = aVar.getRawType();
                if (rawType == Calendar.class || rawType == GregorianCalendar.class) {
                    return typeAdapter3;
                }
                return null;
            }

            public final String toString() {
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + typeAdapter3 + "]";
            }
        };
        f362102y = new AnonymousClass31(Locale.class, new TypeAdapter<Locale>() { // from class: com.google.gson.internal.bind.TypeAdapters.27
            @Override // com.google.gson.TypeAdapter
            public final Locale read(com.google.gson.stream.a aVar) {
                if (aVar.F() == JsonToken.f362204j) {
                    aVar.z();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(aVar.B(), "_");
                String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                return (strNextToken2 == null && strNextToken3 == null) ? new Locale(strNextToken) : strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(com.google.gson.stream.c cVar, Locale locale) throws IOException {
                Locale locale2 = locale;
                cVar.q(locale2 == null ? null : locale2.toString());
            }
        });
        TypeAdapter<i> typeAdapter4 = new TypeAdapter<i>() { // from class: com.google.gson.internal.bind.TypeAdapters.28
            public static i a(com.google.gson.stream.a aVar, JsonToken jsonToken) {
                int iOrdinal = jsonToken.ordinal();
                if (iOrdinal == 5) {
                    return new m(aVar.B());
                }
                if (iOrdinal == 6) {
                    return new m(new w(aVar.B()));
                }
                if (iOrdinal == 7) {
                    return new m(Boolean.valueOf(aVar.o()));
                }
                if (iOrdinal == 8) {
                    aVar.z();
                    return j.f362193b;
                }
                throw new IllegalStateException("Unexpected token: " + jsonToken);
            }

            @Override // com.google.gson.TypeAdapter
            public final i read(com.google.gson.stream.a aVar) {
                i fVar;
                i fVar2;
                if (aVar instanceof com.google.gson.internal.bind.a) {
                    com.google.gson.internal.bind.a aVar2 = (com.google.gson.internal.bind.a) aVar;
                    JsonToken jsonTokenF = aVar2.F();
                    if (jsonTokenF != JsonToken.f362200f && jsonTokenF != JsonToken.f362197c && jsonTokenF != JsonToken.f362199e && jsonTokenF != JsonToken.f362205k) {
                        i iVar = (i) aVar2.Q();
                        aVar2.L();
                        return iVar;
                    }
                    throw new IllegalStateException("Unexpected " + jsonTokenF + " when reading a JsonElement.");
                }
                JsonToken jsonTokenF2 = aVar.F();
                int iOrdinal = jsonTokenF2.ordinal();
                if (iOrdinal == 0) {
                    aVar.a();
                    fVar = new f();
                } else if (iOrdinal != 2) {
                    fVar = null;
                } else {
                    aVar.b();
                    fVar = new k();
                }
                if (fVar == null) {
                    return a(aVar, jsonTokenF2);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                while (true) {
                    if (aVar.k()) {
                        String strX = fVar instanceof k ? aVar.x() : null;
                        JsonToken jsonTokenF3 = aVar.F();
                        int iOrdinal2 = jsonTokenF3.ordinal();
                        if (iOrdinal2 == 0) {
                            aVar.a();
                            fVar2 = new f();
                        } else if (iOrdinal2 != 2) {
                            fVar2 = null;
                        } else {
                            aVar.b();
                            fVar2 = new k();
                        }
                        boolean z12 = fVar2 != null;
                        if (fVar2 == null) {
                            fVar2 = a(aVar, jsonTokenF3);
                        }
                        if (fVar instanceof f) {
                            ((f) fVar).t(fVar2);
                        } else {
                            ((k) fVar).t(strX, fVar2);
                        }
                        if (z12) {
                            arrayDeque.addLast(fVar);
                            fVar = fVar2;
                        }
                    } else {
                        if (fVar instanceof f) {
                            aVar.f();
                        } else {
                            aVar.g();
                        }
                        if (arrayDeque.isEmpty()) {
                            return fVar;
                        }
                        fVar = (i) arrayDeque.removeLast();
                    }
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(com.google.gson.stream.c cVar, i iVar) throws IOException {
                if (iVar == null || (iVar instanceof j)) {
                    cVar.j();
                    return;
                }
                if (iVar instanceof m) {
                    m mVarJ = iVar.j();
                    Serializable serializable = mVarJ.f362195b;
                    if (serializable instanceof Number) {
                        cVar.p(mVarJ.r());
                        return;
                    } else if (serializable instanceof Boolean) {
                        cVar.u(mVarJ.d());
                        return;
                    } else {
                        cVar.q(mVarJ.s());
                        return;
                    }
                }
                if (iVar instanceof f) {
                    cVar.b();
                    Iterator it = iVar.h().f362000b.iterator();
                    while (it.hasNext()) {
                        write(cVar, (i) it.next());
                    }
                    cVar.f();
                    return;
                }
                if (!(iVar instanceof k)) {
                    throw new IllegalArgumentException("Couldn't write " + iVar.getClass());
                }
                cVar.c();
                for (Map.Entry<String, i> entry : iVar.i().f362194b.entrySet()) {
                    cVar.h(entry.getKey());
                    write(cVar, entry.getValue());
                }
                cVar.g();
            }
        };
        f362103z = typeAdapter4;
        f362076A = new AnonymousClass34(i.class, typeAdapter4);
        f362077B = new r() { // from class: com.google.gson.internal.bind.TypeAdapters.29
            @Override // com.google.gson.r
            public final <T> TypeAdapter<T> a(Gson gson, com.google.gson.reflect.a<T> aVar) {
                Class<? super T> rawType = aVar.getRawType();
                if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                    return null;
                }
                if (!rawType.isEnum()) {
                    rawType = rawType.getSuperclass();
                }
                return new EnumTypeAdapter(rawType);
            }
        };
    }

    public TypeAdapters() {
        throw new UnsupportedOperationException();
    }

    public static <TT> r a(final com.google.gson.reflect.a<TT> aVar, final TypeAdapter<TT> typeAdapter) {
        return new r() { // from class: com.google.gson.internal.bind.TypeAdapters.30
            @Override // com.google.gson.r
            public final <T> TypeAdapter<T> a(Gson gson, com.google.gson.reflect.a<T> aVar2) {
                if (aVar2.equals(aVar)) {
                    return typeAdapter;
                }
                return null;
            }
        };
    }

    public static <TT> r b(Class<TT> cls, TypeAdapter<TT> typeAdapter) {
        return new AnonymousClass31(cls, typeAdapter);
    }

    public static <TT> r c(Class<TT> cls, Class<TT> cls2, TypeAdapter<? super TT> typeAdapter) {
        return new AnonymousClass32(cls, cls2, typeAdapter);
    }

    public static r d(TypeAdapter typeAdapter) {
        return new AnonymousClass34(List.class, typeAdapter);
    }
}
