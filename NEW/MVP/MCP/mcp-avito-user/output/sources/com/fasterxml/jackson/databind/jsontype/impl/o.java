package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.z;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: StdTypeResolverBuilder.java */
/* loaded from: classes4.dex */
public class o implements com.fasterxml.jackson.databind.jsontype.n<o> {

    /* renamed from: b, reason: collision with root package name */
    public JsonTypeInfo.Id f342152b;

    /* renamed from: c, reason: collision with root package name */
    public JsonTypeInfo.As f342153c;

    /* renamed from: d, reason: collision with root package name */
    public String f342154d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f342155e;

    /* renamed from: f, reason: collision with root package name */
    public Class<?> f342156f;

    /* renamed from: g, reason: collision with root package name */
    public com.fasterxml.jackson.databind.jsontype.m f342157g;

    /* compiled from: StdTypeResolverBuilder.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f342158a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f342159b;

        static {
            int[] iArr = new int[JsonTypeInfo.Id.values().length];
            f342159b = iArr;
            try {
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f342159b[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f342159b[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f342159b[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f342159b[0] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f342159b[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[JsonTypeInfo.As.values().length];
            f342158a = iArr2;
            try {
                iArr2[2] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f342158a[0] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f342158a[1] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f342158a[3] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f342158a[4] = 5;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public o() {
        this.f342155e = false;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.n
    public t a(z zVar, com.fasterxml.jackson.databind.h hVar, Collection collection) {
        if (this.f342152b == JsonTypeInfo.Id.NONE || hVar.f341930b.isPrimitive()) {
            return null;
        }
        com.fasterxml.jackson.databind.jsontype.m mVarG = g(zVar, hVar, h(zVar), collection, true, false);
        if (this.f342152b == JsonTypeInfo.Id.DEDUCTION) {
            return new d(mVarG, null, this.f342154d);
        }
        int iOrdinal = this.f342153c.ordinal();
        if (iOrdinal == 0) {
            return new h(mVarG, null, this.f342154d);
        }
        if (iOrdinal == 1) {
            return new j(mVarG, null);
        }
        if (iOrdinal == 2) {
            return new b(mVarG, null);
        }
        if (iOrdinal == 3) {
            return new f(mVarG, null, this.f342154d);
        }
        if (iOrdinal == 4) {
            return new d(mVarG, null, this.f342154d);
        }
        throw new IllegalStateException("Do not know how to construct standard type serializer for inclusion type: " + this.f342153c);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.n
    public final Class<?> b() {
        return this.f342156f;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    @Override // com.fasterxml.jackson.databind.jsontype.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.fasterxml.jackson.databind.jsontype.impl.q c(com.fasterxml.jackson.databind.e r10, com.fasterxml.jackson.databind.h r11, java.util.Collection r12) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.jsontype.impl.o.c(com.fasterxml.jackson.databind.e, com.fasterxml.jackson.databind.h, java.util.Collection):com.fasterxml.jackson.databind.jsontype.impl.q");
    }

    @Override // com.fasterxml.jackson.databind.jsontype.n
    public final o d(JsonTypeInfo.Id id2, com.fasterxml.jackson.databind.jsontype.m mVar) {
        if (id2 == null) {
            throw new IllegalArgumentException("idType cannot be null");
        }
        this.f342152b = id2;
        this.f342157g = mVar;
        this.f342154d = id2.f340978b;
        return this;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.n
    public final o e(Class cls) {
        this.f342156f = cls;
        return this;
    }

    public final com.fasterxml.jackson.databind.jsontype.m g(com.fasterxml.jackson.databind.cfg.m mVar, com.fasterxml.jackson.databind.h hVar, PolymorphicTypeValidator polymorphicTypeValidator, Collection collection, boolean z12, boolean z13) {
        ConcurrentHashMap concurrentHashMap;
        String name;
        com.fasterxml.jackson.databind.jsontype.m mVar2 = this.f342157g;
        if (mVar2 != null) {
            return mVar2;
        }
        JsonTypeInfo.Id id2 = this.f342152b;
        if (id2 == null) {
            throw new IllegalStateException("Cannot build, 'init()' not yet called");
        }
        int iOrdinal = id2.ordinal();
        HashMap map = null;
        if (iOrdinal == 0) {
            return null;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return new m(hVar, mVar.f341506c.f341474b, polymorphicTypeValidator);
            }
            if (iOrdinal == 3) {
                if (z12 == z13) {
                    throw new IllegalArgumentException();
                }
                if (z12) {
                    concurrentHashMap = new ConcurrentHashMap();
                } else {
                    map = new HashMap();
                    concurrentHashMap = new ConcurrentHashMap(4);
                }
                boolean zK2 = mVar.k(MapperFeature.ACCEPT_CASE_INSENSITIVE_VALUES);
                if (collection != null) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        com.fasterxml.jackson.databind.jsontype.j jVar = (com.fasterxml.jackson.databind.jsontype.j) it.next();
                        Class<?> cls = jVar.f342179b;
                        if (jVar.a()) {
                            name = jVar.f342181d;
                        } else {
                            name = cls.getName();
                            int iLastIndexOf = name.lastIndexOf(46);
                            if (iLastIndexOf >= 0) {
                                name = name.substring(iLastIndexOf + 1);
                            }
                        }
                        if (z12) {
                            concurrentHashMap.put(cls.getName(), name);
                        }
                        if (z13) {
                            if (zK2) {
                                name = name.toLowerCase();
                            }
                            com.fasterxml.jackson.databind.h hVar2 = (com.fasterxml.jackson.databind.h) map.get(name);
                            if (hVar2 == null || !cls.isAssignableFrom(hVar2.f341930b)) {
                                map.put(name, mVar.c(cls));
                            }
                        }
                    }
                }
                return new s(mVar, hVar, concurrentHashMap, map);
            }
            if (iOrdinal != 4) {
                throw new IllegalStateException("Do not know how to construct standard type id resolver for idType: " + this.f342152b);
            }
        }
        return new k(hVar, mVar.f341506c.f341474b, polymorphicTypeValidator);
    }

    public PolymorphicTypeValidator h(com.fasterxml.jackson.databind.cfg.m mVar) {
        PolymorphicTypeValidator polymorphicTypeValidator = mVar.f341506c.f341478f;
        return (polymorphicTypeValidator == l.f342149b && mVar.k(MapperFeature.BLOCK_UNSAFE_POLYMORPHIC_BASE_TYPES)) ? new com.fasterxml.jackson.databind.jsontype.i() : polymorphicTypeValidator;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.n
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public o f(Class<?> cls) {
        if (this.f342156f == cls) {
            return this;
        }
        com.fasterxml.jackson.databind.util.g.G(this, o.class, "withDefaultImpl");
        return new o(this, cls);
    }

    public o(o oVar, Class<?> cls) {
        this.f342155e = false;
        this.f342152b = oVar.f342152b;
        this.f342153c = oVar.f342153c;
        this.f342154d = oVar.f342154d;
        this.f342155e = oVar.f342155e;
        this.f342157g = oVar.f342157g;
        this.f342156f = cls;
    }
}
