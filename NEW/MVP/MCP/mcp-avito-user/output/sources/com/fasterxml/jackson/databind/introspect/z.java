package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.A;
import com.fasterxml.jackson.annotation.H;
import com.fasterxml.jackson.annotation.InterfaceC36433c;
import com.fasterxml.jackson.annotation.InterfaceC36434d;
import com.fasterxml.jackson.annotation.InterfaceC36435e;
import com.fasterxml.jackson.annotation.InterfaceC36436f;
import com.fasterxml.jackson.annotation.InterfaceC36437g;
import com.fasterxml.jackson.annotation.InterfaceC36438h;
import com.fasterxml.jackson.annotation.InterfaceC36440j;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.annotation.p;
import com.fasterxml.jackson.annotation.r;
import com.fasterxml.jackson.annotation.z;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.i;
import com.fasterxml.jackson.databind.l;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.util.i;
import java.io.Closeable;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import rX0.InterfaceC47611b;
import rX0.InterfaceC47612c;
import rX0.InterfaceC47613d;
import rX0.e;
import sX0.AbstractC48125g;

/* compiled from: JacksonAnnotationIntrospector.java */
/* loaded from: classes4.dex */
public class z extends AnnotationIntrospector implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final Class<? extends Annotation>[] f342111d = {JsonSerialize.class, com.fasterxml.jackson.annotation.F.class, JsonFormat.class, JsonTypeInfo.class, com.fasterxml.jackson.annotation.x.class, com.fasterxml.jackson.annotation.D.class, InterfaceC36438h.class, com.fasterxml.jackson.annotation.t.class};

    /* renamed from: e, reason: collision with root package name */
    public static final Class<? extends Annotation>[] f342112e = {InterfaceC47612c.class, com.fasterxml.jackson.annotation.F.class, JsonFormat.class, JsonTypeInfo.class, com.fasterxml.jackson.annotation.D.class, InterfaceC36438h.class, com.fasterxml.jackson.annotation.t.class, com.fasterxml.jackson.annotation.u.class};

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC48125g f342113f;
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public transient com.fasterxml.jackson.databind.util.q<Class<?>, Boolean> f342114b = new com.fasterxml.jackson.databind.util.q<>(48, 48);

    /* renamed from: c, reason: collision with root package name */
    public final boolean f342115c = true;

    /* compiled from: JacksonAnnotationIntrospector.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f342116a;

        static {
            int[] iArr = new int[JsonSerialize.Inclusion.values().length];
            f342116a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f342116a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f342116a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f342116a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f342116a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        AbstractC48125g abstractC48125g;
        try {
            abstractC48125g = AbstractC48125g.f437702a;
        } catch (Throwable unused) {
            abstractC48125g = null;
        }
        f342113f = abstractC48125g;
    }

    public static boolean A0(com.fasterxml.jackson.databind.h hVar, Class cls) {
        return hVar.f341930b.isPrimitive() ? hVar.x(com.fasterxml.jackson.databind.util.g.B(cls)) : cls.isPrimitive() && cls == com.fasterxml.jackson.databind.util.g.B(hVar.f341930b);
    }

    public static boolean B0(Class cls, Class cls2) {
        return cls.isPrimitive() ? cls == com.fasterxml.jackson.databind.util.g.B(cls2) : cls2.isPrimitive() && cls2 == com.fasterxml.jackson.databind.util.g.B(cls);
    }

    public static Class x0(Class cls) {
        if (cls == null || com.fasterxml.jackson.databind.util.g.v(cls)) {
            return null;
        }
        return cls;
    }

    public static JsonMappingException y0(String str, IllegalArgumentException illegalArgumentException) {
        return new JsonMappingException((Closeable) null, str, illegalArgumentException);
    }

    public static com.fasterxml.jackson.databind.jsontype.n z0(com.fasterxml.jackson.databind.cfg.l lVar, AbstractC36463b abstractC36463b, com.fasterxml.jackson.databind.h hVar) {
        com.fasterxml.jackson.databind.jsontype.n oVar;
        JsonTypeInfo jsonTypeInfo = (JsonTypeInfo) abstractC36463b.c(JsonTypeInfo.class);
        rX0.g gVar = (rX0.g) abstractC36463b.c(rX0.g.class);
        com.fasterxml.jackson.databind.jsontype.m mVar = null;
        if (gVar != null) {
            if (jsonTypeInfo == null) {
                return null;
            }
            Class<? extends com.fasterxml.jackson.databind.jsontype.n<?>> clsValue = gVar.value();
            lVar.f341506c.getClass();
            oVar = (com.fasterxml.jackson.databind.jsontype.n) com.fasterxml.jackson.databind.util.g.h(lVar.k(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS), clsValue);
        } else {
            if (jsonTypeInfo == null) {
                return null;
            }
            JsonTypeInfo.Id idUse = jsonTypeInfo.use();
            JsonTypeInfo.Id id2 = JsonTypeInfo.Id.NONE;
            if (idUse == id2) {
                com.fasterxml.jackson.databind.jsontype.impl.o oVar2 = new com.fasterxml.jackson.databind.jsontype.impl.o();
                oVar2.f342152b = id2;
                oVar2.f342157g = null;
                oVar2.f342154d = null;
                return oVar2;
            }
            oVar = new com.fasterxml.jackson.databind.jsontype.impl.o();
        }
        rX0.f fVar = (rX0.f) abstractC36463b.c(rX0.f.class);
        if (fVar != null) {
            Class<? extends com.fasterxml.jackson.databind.jsontype.m> clsValue2 = fVar.value();
            lVar.f341506c.getClass();
            mVar = (com.fasterxml.jackson.databind.jsontype.m) com.fasterxml.jackson.databind.util.g.h(lVar.k(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS), clsValue2);
        }
        com.fasterxml.jackson.databind.jsontype.impl.o oVarD = oVar.d(jsonTypeInfo.use(), mVar);
        JsonTypeInfo.As asInclude = jsonTypeInfo.include();
        if (asInclude == JsonTypeInfo.As.f340970e && (abstractC36463b instanceof C36465d)) {
            asInclude = JsonTypeInfo.As.f340967b;
        }
        if (asInclude == null) {
            throw new IllegalArgumentException("includeAs cannot be null");
        }
        oVarD.f342153c = asInclude;
        String strProperty = jsonTypeInfo.property();
        if (strProperty == null || strProperty.isEmpty()) {
            strProperty = oVarD.f342152b.f340978b;
        }
        oVarD.f342154d = strProperty;
        Class<?> clsDefaultImpl = jsonTypeInfo.defaultImpl();
        if (clsDefaultImpl != JsonTypeInfo.a.class && !clsDefaultImpl.isAnnotation()) {
            oVarD.f342156f = clsDefaultImpl;
        }
        oVarD.f342155e = jsonTypeInfo.visible();
        return oVarD;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final D A(AbstractC36463b abstractC36463b, D d12) {
        com.fasterxml.jackson.annotation.n nVar = (com.fasterxml.jackson.annotation.n) abstractC36463b.c(com.fasterxml.jackson.annotation.n.class);
        if (nVar == null) {
            return d12;
        }
        if (d12 == null) {
            d12 = D.f341939f;
        }
        boolean zAlwaysAsId = nVar.alwaysAsId();
        if (d12.f341944e == zAlwaysAsId) {
            return d12;
        }
        return new D(d12.f341940a, d12.f341943d, d12.f341941b, zAlwaysAsId, d12.f341942c);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Class<?> B(C36465d c36465d) {
        InterfaceC47612c interfaceC47612c = (InterfaceC47612c) c36465d.f342016k.a(InterfaceC47612c.class);
        if (interfaceC47612c == null) {
            return null;
        }
        return x0(interfaceC47612c.builder());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final e.a C(C36465d c36465d) {
        rX0.e eVar = (rX0.e) c36465d.f342016k.a(rX0.e.class);
        if (eVar == null) {
            return null;
        }
        return new e.a(eVar);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final JsonProperty.Access E(AbstractC36471j abstractC36471j) {
        JsonProperty jsonProperty = (JsonProperty) abstractC36471j.c(JsonProperty.class);
        if (jsonProperty != null) {
            return jsonProperty.access();
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final List F(AbstractC36471j abstractC36471j) {
        InterfaceC36435e interfaceC36435e = (InterfaceC36435e) abstractC36471j.c(InterfaceC36435e.class);
        if (interfaceC36435e == null) {
            return null;
        }
        String[] strArrValue = interfaceC36435e.value();
        int length = strArrValue.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(length);
        for (String str : strArrValue) {
            arrayList.add(com.fasterxml.jackson.databind.v.a(str));
        }
        return arrayList;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final com.fasterxml.jackson.databind.jsontype.n<?> G(com.fasterxml.jackson.databind.cfg.l<?> lVar, AbstractC36471j abstractC36471j, com.fasterxml.jackson.databind.h hVar) {
        if (hVar.n() != null) {
            return z0(lVar, abstractC36471j, hVar);
        }
        throw new IllegalArgumentException("Must call method with a container or reference type (got " + hVar + ")");
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final String H(AbstractC36471j abstractC36471j) {
        JsonProperty jsonProperty = (JsonProperty) abstractC36471j.c(JsonProperty.class);
        if (jsonProperty == null) {
            return null;
        }
        String strDefaultValue = jsonProperty.defaultValue();
        if (strDefaultValue.isEmpty()) {
            return null;
        }
        return strDefaultValue;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final String I(AbstractC36471j abstractC36471j) {
        com.fasterxml.jackson.annotation.v vVar = (com.fasterxml.jackson.annotation.v) abstractC36471j.c(com.fasterxml.jackson.annotation.v.class);
        if (vVar == null) {
            return null;
        }
        return vVar.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final p.a J(AbstractC36463b abstractC36463b) {
        Set setEmptySet;
        com.fasterxml.jackson.annotation.p pVar = (com.fasterxml.jackson.annotation.p) abstractC36463b.c(com.fasterxml.jackson.annotation.p.class);
        if (pVar == null) {
            return p.a.f340991g;
        }
        p.a aVar = p.a.f340991g;
        String[] strArrValue = pVar.value();
        if (strArrValue == null || strArrValue.length == 0) {
            setEmptySet = Collections.emptySet();
        } else {
            HashSet hashSet = new HashSet(strArrValue.length);
            for (String str : strArrValue) {
                hashSet.add(str);
            }
            setEmptySet = hashSet;
        }
        boolean zIgnoreUnknown = pVar.ignoreUnknown();
        boolean zAllowGetters = pVar.allowGetters();
        boolean zAllowSetters = pVar.allowSetters();
        return p.a.a(setEmptySet, zIgnoreUnknown, zAllowGetters, zAllowSetters, false) ? p.a.f340991g : new p.a(setEmptySet, zIgnoreUnknown, zAllowGetters, zAllowSetters, false);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public final p.a K(AbstractC36463b abstractC36463b) {
        return J(abstractC36463b);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final JsonInclude.a L(AbstractC36463b abstractC36463b) {
        JsonInclude.a aVar;
        JsonSerialize jsonSerialize;
        JsonInclude jsonInclude = (JsonInclude) abstractC36463b.c(JsonInclude.class);
        JsonInclude.Include include = JsonInclude.Include.f340958f;
        if (jsonInclude == null) {
            aVar = JsonInclude.a.f340960f;
        } else {
            JsonInclude.a aVar2 = JsonInclude.a.f340960f;
            JsonInclude.Include includeValue = jsonInclude.value();
            JsonInclude.Include includeContent = jsonInclude.content();
            if (includeValue == include && includeContent == include) {
                aVar = aVar2;
            } else {
                Class<?> clsValueFilter = jsonInclude.valueFilter();
                if (clsValueFilter == Void.class) {
                    clsValueFilter = null;
                }
                Class<?> clsContentFilter = jsonInclude.contentFilter();
                aVar = new JsonInclude.a(includeValue, includeContent, clsValueFilter, clsContentFilter != Void.class ? clsContentFilter : null);
            }
        }
        if (aVar.f340961b != include || (jsonSerialize = (JsonSerialize) abstractC36463b.c(JsonSerialize.class)) == null) {
            return aVar;
        }
        int iOrdinal = jsonSerialize.include().ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? aVar : aVar.b(JsonInclude.Include.f340956d) : aVar.b(JsonInclude.Include.f340957e) : aVar.b(JsonInclude.Include.f340955c) : aVar.b(JsonInclude.Include.f340954b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.HashSet] */
    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final r.a N(AbstractC36463b abstractC36463b) {
        ?? EmptySet;
        com.fasterxml.jackson.annotation.r rVar = (com.fasterxml.jackson.annotation.r) abstractC36463b.c(com.fasterxml.jackson.annotation.r.class);
        if (rVar == null) {
            return r.a.f340997c;
        }
        String[] strArrValue = rVar.value();
        if (strArrValue == null || strArrValue.length == 0) {
            EmptySet = Collections.emptySet();
        } else {
            EmptySet = new HashSet(strArrValue.length);
            for (String str : strArrValue) {
                EmptySet.add(str);
            }
        }
        return new r.a(EmptySet);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Integer O(AbstractC36471j abstractC36471j) {
        int iIndex;
        JsonProperty jsonProperty = (JsonProperty) abstractC36471j.c(JsonProperty.class);
        if (jsonProperty == null || (iIndex = jsonProperty.index()) == -1) {
            return null;
        }
        return Integer.valueOf(iIndex);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final com.fasterxml.jackson.databind.jsontype.n<?> P(com.fasterxml.jackson.databind.cfg.l<?> lVar, AbstractC36471j abstractC36471j, com.fasterxml.jackson.databind.h hVar) {
        if (hVar.B() || hVar.f()) {
            return null;
        }
        return z0(lVar, abstractC36471j, hVar);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final AnnotationIntrospector.ReferenceProperty Q(AbstractC36471j abstractC36471j) {
        com.fasterxml.jackson.annotation.t tVar = (com.fasterxml.jackson.annotation.t) abstractC36471j.c(com.fasterxml.jackson.annotation.t.class);
        if (tVar != null) {
            return new AnnotationIntrospector.ReferenceProperty(AnnotationIntrospector.ReferenceProperty.Type.f341342b, tVar.value());
        }
        InterfaceC36438h interfaceC36438h = (InterfaceC36438h) abstractC36471j.c(InterfaceC36438h.class);
        if (interfaceC36438h == null) {
            return null;
        }
        return new AnnotationIntrospector.ReferenceProperty(AnnotationIntrospector.ReferenceProperty.Type.f341343c, interfaceC36438h.value());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final com.fasterxml.jackson.databind.v R() {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final com.fasterxml.jackson.databind.v S(C36465d c36465d) {
        com.fasterxml.jackson.annotation.y yVar = (com.fasterxml.jackson.annotation.y) c36465d.f342016k.a(com.fasterxml.jackson.annotation.y.class);
        if (yVar == null) {
            return null;
        }
        String strNamespace = yVar.namespace();
        return com.fasterxml.jackson.databind.v.b(yVar.value(), (strNamespace == null || !strNamespace.isEmpty()) ? strNamespace : null);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Object T(AbstractC36471j abstractC36471j) {
        Class clsX0;
        JsonSerialize jsonSerialize = (JsonSerialize) abstractC36471j.c(JsonSerialize.class);
        if (jsonSerialize == null || (clsX0 = x0(jsonSerialize.contentConverter())) == null || clsX0 == i.a.class) {
            return null;
        }
        return clsX0;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Object U(AbstractC36463b abstractC36463b) {
        Class clsX0;
        JsonSerialize jsonSerialize = (JsonSerialize) abstractC36463b.c(JsonSerialize.class);
        if (jsonSerialize == null || (clsX0 = x0(jsonSerialize.converter())) == null || clsX0 == i.a.class) {
            return null;
        }
        return clsX0;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final String[] V(C36465d c36465d) {
        com.fasterxml.jackson.annotation.w wVar = (com.fasterxml.jackson.annotation.w) c36465d.f342016k.a(com.fasterxml.jackson.annotation.w.class);
        if (wVar == null) {
            return null;
        }
        return wVar.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Boolean W(AbstractC36463b abstractC36463b) {
        com.fasterxml.jackson.annotation.w wVar = (com.fasterxml.jackson.annotation.w) abstractC36463b.c(com.fasterxml.jackson.annotation.w.class);
        if (wVar == null || !wVar.alphabetic()) {
            return null;
        }
        return Boolean.TRUE;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final JsonSerialize.Typing X(AbstractC36463b abstractC36463b) {
        JsonSerialize jsonSerialize = (JsonSerialize) abstractC36463b.c(JsonSerialize.class);
        if (jsonSerialize == null) {
            return null;
        }
        return jsonSerialize.typing();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Object Y(AbstractC36463b abstractC36463b) {
        Class<? extends com.fasterxml.jackson.databind.l> clsUsing;
        JsonSerialize jsonSerialize = (JsonSerialize) abstractC36463b.c(JsonSerialize.class);
        if (jsonSerialize != null && (clsUsing = jsonSerialize.using()) != l.a.class) {
            return clsUsing;
        }
        com.fasterxml.jackson.annotation.x xVar = (com.fasterxml.jackson.annotation.x) abstractC36463b.c(com.fasterxml.jackson.annotation.x.class);
        if (xVar == null || !xVar.value()) {
            return null;
        }
        return new com.fasterxml.jackson.databind.ser.std.A(abstractC36463b.e(), 0);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final z.a Z(AbstractC36471j abstractC36471j) {
        com.fasterxml.jackson.annotation.z zVar = (com.fasterxml.jackson.annotation.z) abstractC36471j.c(com.fasterxml.jackson.annotation.z.class);
        z.a aVar = z.a.f340999d;
        if (zVar == null) {
            return aVar;
        }
        Nulls nulls = zVar.nulls();
        Nulls nullsContentNulls = zVar.contentNulls();
        Nulls nulls2 = Nulls.f340982e;
        if (nulls == null) {
            nulls = nulls2;
        }
        if (nullsContentNulls == null) {
            nullsContentNulls = nulls2;
        }
        return (nulls == nulls2 && nullsContentNulls == nulls2) ? aVar : new z.a(nulls, nullsContentNulls);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final void a(com.fasterxml.jackson.databind.cfg.l lVar, C36465d c36465d, ArrayList arrayList) {
        Class<?> cls;
        InterfaceC47611b interfaceC47611b = (InterfaceC47611b) c36465d.f342016k.a(InterfaceC47611b.class);
        if (interfaceC47611b == null) {
            return;
        }
        boolean zPrepend = interfaceC47611b.prepend();
        InterfaceC47611b.a[] aVarArrAttrs = interfaceC47611b.attrs();
        int length = aVarArrAttrs.length;
        int i12 = 0;
        com.fasterxml.jackson.databind.h hVarC = null;
        while (true) {
            cls = c36465d.f342008c;
            if (i12 >= length) {
                break;
            }
            if (hVarC == null) {
                hVarC = lVar.c(Object.class);
            }
            InterfaceC47611b.a aVar = aVarArrAttrs[i12];
            com.fasterxml.jackson.databind.u uVar = aVar.required() ? com.fasterxml.jackson.databind.u.f342512i : com.fasterxml.jackson.databind.u.f342513j;
            String strValue = aVar.value();
            String strPropName = aVar.propName();
            String strPropNamespace = aVar.propNamespace();
            com.fasterxml.jackson.databind.v vVarA = strPropName.isEmpty() ? com.fasterxml.jackson.databind.v.f342654e : (strPropNamespace == null || strPropNamespace.isEmpty()) ? com.fasterxml.jackson.databind.v.a(strPropName) : com.fasterxml.jackson.databind.v.b(strPropName, strPropNamespace);
            if (vVarA.f342656b.isEmpty()) {
                vVarA = com.fasterxml.jackson.databind.v.a(strValue);
            }
            com.fasterxml.jackson.databind.ser.impl.a aVar2 = new com.fasterxml.jackson.databind.ser.impl.a(strValue, com.fasterxml.jackson.databind.util.z.C(lVar, new K(c36465d, cls, strValue, hVarC), vVarA, uVar, aVar.include()), c36465d.f342016k, hVarC);
            if (zPrepend) {
                arrayList.add(i12, aVar2);
            } else {
                arrayList.add(aVar2);
            }
            i12++;
        }
        InterfaceC47611b.InterfaceC12381b[] interfaceC12381bArrProps = interfaceC47611b.props();
        if (interfaceC12381bArrProps.length > 0) {
            InterfaceC47611b.InterfaceC12381b interfaceC12381b = interfaceC12381bArrProps[0];
            com.fasterxml.jackson.databind.u uVar2 = interfaceC12381b.required() ? com.fasterxml.jackson.databind.u.f342512i : com.fasterxml.jackson.databind.u.f342513j;
            String strName = interfaceC12381b.name();
            String strNamespace = interfaceC12381b.namespace();
            com.fasterxml.jackson.databind.v vVarA2 = !strName.isEmpty() ? (strNamespace == null || strNamespace.isEmpty()) ? com.fasterxml.jackson.databind.v.a(strName) : com.fasterxml.jackson.databind.v.b(strName, strNamespace) : com.fasterxml.jackson.databind.v.f342654e;
            com.fasterxml.jackson.databind.util.z.C(lVar, new K(c36465d, cls, vVarA2.f342656b, lVar.c(interfaceC12381b.type())), vVarA2, uVar2, interfaceC12381b.include());
            Class<? extends com.fasterxml.jackson.databind.ser.t> clsValue = interfaceC12381b.value();
            lVar.f341506c.getClass();
            ((com.fasterxml.jackson.databind.ser.t) com.fasterxml.jackson.databind.util.g.h(lVar.k(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS), clsValue)).o();
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final List<com.fasterxml.jackson.databind.jsontype.j> a0(AbstractC36463b abstractC36463b) {
        com.fasterxml.jackson.annotation.A a12 = (com.fasterxml.jackson.annotation.A) abstractC36463b.c(com.fasterxml.jackson.annotation.A.class);
        if (a12 == null) {
            return null;
        }
        A.a[] aVarArrValue = a12.value();
        ArrayList arrayList = new ArrayList(aVarArrValue.length);
        for (A.a aVar : aVarArrValue) {
            arrayList.add(new com.fasterxml.jackson.databind.jsontype.j(aVar.value(), aVar.name()));
            for (String str : aVar.names()) {
                arrayList.add(new com.fasterxml.jackson.databind.jsontype.j(aVar.value(), str));
            }
        }
        return arrayList;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final L<?> b(C36465d c36465d, L<?> l12) {
        JsonAutoDetect jsonAutoDetect = (JsonAutoDetect) c36465d.f342016k.a(JsonAutoDetect.class);
        return jsonAutoDetect == null ? l12 : l12.f(jsonAutoDetect);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final String b0(C36465d c36465d) {
        com.fasterxml.jackson.annotation.C c12 = (com.fasterxml.jackson.annotation.C) c36465d.f342016k.a(com.fasterxml.jackson.annotation.C.class);
        if (c12 == null) {
            return null;
        }
        return c12.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Object c(AbstractC36463b abstractC36463b) {
        Class<? extends com.fasterxml.jackson.databind.i> clsContentUsing;
        InterfaceC47612c interfaceC47612c = (InterfaceC47612c) abstractC36463b.c(InterfaceC47612c.class);
        if (interfaceC47612c == null || (clsContentUsing = interfaceC47612c.contentUsing()) == i.a.class) {
            return null;
        }
        return clsContentUsing;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final com.fasterxml.jackson.databind.jsontype.n c0(com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.cfg.l lVar, C36465d c36465d) {
        return z0(lVar, c36465d, hVar);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Object d(AbstractC36463b abstractC36463b) {
        Class<? extends com.fasterxml.jackson.databind.l> clsContentUsing;
        JsonSerialize jsonSerialize = (JsonSerialize) abstractC36463b.c(JsonSerialize.class);
        if (jsonSerialize == null || (clsContentUsing = jsonSerialize.contentUsing()) == l.a.class) {
            return null;
        }
        return clsContentUsing;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final com.fasterxml.jackson.databind.util.t d0(AbstractC36471j abstractC36471j) {
        com.fasterxml.jackson.annotation.D d12 = (com.fasterxml.jackson.annotation.D) abstractC36471j.c(com.fasterxml.jackson.annotation.D.class);
        if (d12 == null || !d12.enabled()) {
            return null;
        }
        return com.fasterxml.jackson.databind.util.t.a(d12.prefix(), d12.suffix());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final JsonCreator.Mode e(com.fasterxml.jackson.databind.cfg.l<?> lVar, AbstractC36463b abstractC36463b) {
        AbstractC48125g abstractC48125g;
        Boolean boolC;
        JsonCreator jsonCreator = (JsonCreator) abstractC36463b.c(JsonCreator.class);
        if (jsonCreator != null) {
            return jsonCreator.mode();
        }
        if (this.f342115c && lVar.k(MapperFeature.INFER_CREATOR_FROM_CONSTRUCTOR_PROPERTIES) && (abstractC36463b instanceof C36467f) && (abstractC48125g = f342113f) != null && (boolC = abstractC48125g.c(abstractC36463b)) != null && boolC.booleanValue()) {
            return JsonCreator.Mode.f340924d;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Object e0(C36465d c36465d) {
        rX0.h hVar = (rX0.h) c36465d.f342016k.a(rX0.h.class);
        if (hVar == null) {
            return null;
        }
        return hVar.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public final JsonCreator.Mode f(AbstractC36463b abstractC36463b) {
        JsonCreator jsonCreator = (JsonCreator) abstractC36463b.c(JsonCreator.class);
        if (jsonCreator == null) {
            return null;
        }
        return jsonCreator.mode();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Class<?>[] f0(AbstractC36463b abstractC36463b) {
        com.fasterxml.jackson.annotation.F f12 = (com.fasterxml.jackson.annotation.F) abstractC36463b.c(com.fasterxml.jackson.annotation.F.class);
        if (f12 == null) {
            return null;
        }
        return f12.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Enum<?> g(Class<Enum<?>> cls) {
        Annotation[] annotationArr = com.fasterxml.jackson.databind.util.g.f342596a;
        for (Field field : cls.getDeclaredFields()) {
            if (field.isEnumConstant() && field.getAnnotation(InterfaceC36440j.class) != null) {
                String name = field.getName();
                for (Enum<?> r82 : cls.getEnumConstants()) {
                    if (name.equals(r82.name())) {
                        return r82;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Object h(AbstractC36471j abstractC36471j) {
        Class clsX0;
        InterfaceC47612c interfaceC47612c = (InterfaceC47612c) abstractC36471j.c(InterfaceC47612c.class);
        if (interfaceC47612c == null || (clsX0 = x0(interfaceC47612c.contentConverter())) == null || clsX0 == i.a.class) {
            return null;
        }
        return clsX0;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Boolean h0(AbstractC36471j abstractC36471j) {
        InterfaceC36436f interfaceC36436f = (InterfaceC36436f) abstractC36471j.c(InterfaceC36436f.class);
        if (interfaceC36436f == null) {
            return null;
        }
        return Boolean.valueOf(interfaceC36436f.enabled());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Object i(AbstractC36463b abstractC36463b) {
        Class clsX0;
        InterfaceC47612c interfaceC47612c = (InterfaceC47612c) abstractC36463b.c(InterfaceC47612c.class);
        if (interfaceC47612c == null || (clsX0 = x0(interfaceC47612c.converter())) == null || clsX0 == i.a.class) {
            return null;
        }
        return clsX0;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public final boolean i0(C36472k c36472k) {
        return c36472k.m(InterfaceC36436f.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Object k(AbstractC36463b abstractC36463b) {
        Class<? extends com.fasterxml.jackson.databind.i> clsUsing;
        InterfaceC47612c interfaceC47612c = (InterfaceC47612c) abstractC36463b.c(InterfaceC47612c.class);
        if (interfaceC47612c == null || (clsUsing = interfaceC47612c.using()) == i.a.class) {
            return null;
        }
        return clsUsing;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Boolean k0(AbstractC36471j abstractC36471j) {
        InterfaceC36437g interfaceC36437g = (InterfaceC36437g) abstractC36471j.c(InterfaceC36437g.class);
        if (interfaceC36437g == null) {
            return null;
        }
        return Boolean.valueOf(interfaceC36437g.enabled());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final void l(Class<?> cls, Enum<?>[] enumArr, String[][] strArr) {
        InterfaceC36435e interfaceC36435e;
        for (Field field : cls.getDeclaredFields()) {
            if (field.isEnumConstant() && (interfaceC36435e = (InterfaceC36435e) field.getAnnotation(InterfaceC36435e.class)) != null) {
                String[] strArrValue = interfaceC36435e.value();
                if (strArrValue.length != 0) {
                    String name = field.getName();
                    int length = enumArr.length;
                    for (int i12 = 0; i12 < length; i12++) {
                        if (name.equals(enumArr[i12].name())) {
                            strArr[i12] = strArrValue;
                        }
                    }
                }
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Boolean l0(AbstractC36471j abstractC36471j) {
        com.fasterxml.jackson.annotation.s sVar = (com.fasterxml.jackson.annotation.s) abstractC36471j.c(com.fasterxml.jackson.annotation.s.class);
        if (sVar == null) {
            return null;
        }
        return Boolean.valueOf(sVar.value());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final String[] m(Class<?> cls, Enum<?>[] enumArr, String[] strArr) {
        JsonProperty jsonProperty;
        HashMap map = null;
        for (Field field : cls.getDeclaredFields()) {
            if (field.isEnumConstant() && (jsonProperty = (JsonProperty) field.getAnnotation(JsonProperty.class)) != null) {
                String strValue = jsonProperty.value();
                if (!strValue.isEmpty()) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    map.put(field.getName(), strValue);
                }
            }
        }
        if (map != null) {
            int length = enumArr.length;
            for (int i12 = 0; i12 < length; i12++) {
                String str = (String) map.get(enumArr[i12].name());
                if (str != null) {
                    strArr[i12] = str;
                }
            }
        }
        return strArr;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Boolean m0(AbstractC36471j abstractC36471j) {
        com.fasterxml.jackson.annotation.E e12 = (com.fasterxml.jackson.annotation.E) abstractC36471j.c(com.fasterxml.jackson.annotation.E.class);
        if (e12 == null) {
            return null;
        }
        return Boolean.valueOf(e12.value());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Object n(AbstractC36463b abstractC36463b) {
        com.fasterxml.jackson.annotation.k kVar = (com.fasterxml.jackson.annotation.k) abstractC36463b.c(com.fasterxml.jackson.annotation.k.class);
        if (kVar == null) {
            return null;
        }
        String strValue = kVar.value();
        if (strValue.isEmpty()) {
            return null;
        }
        return strValue;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public final boolean n0(C36472k c36472k) {
        com.fasterxml.jackson.annotation.E e12 = (com.fasterxml.jackson.annotation.E) c36472k.c(com.fasterxml.jackson.annotation.E.class);
        return e12 != null && e12.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final JsonFormat.b o(AbstractC36463b abstractC36463b) {
        JsonFormat jsonFormat = (JsonFormat) abstractC36463b.c(JsonFormat.class);
        if (jsonFormat == null) {
            return null;
        }
        String strPattern = jsonFormat.pattern();
        JsonFormat.Shape shape = jsonFormat.shape();
        String strLocale = jsonFormat.locale();
        String strTimezone = jsonFormat.timezone();
        JsonFormat.Feature[] featureArrWith = jsonFormat.with();
        JsonFormat.Feature[] featureArrWithout = jsonFormat.without();
        int iOrdinal = 0;
        for (JsonFormat.Feature feature : featureArrWith) {
            iOrdinal |= 1 << feature.ordinal();
        }
        int iOrdinal2 = 0;
        for (JsonFormat.Feature feature2 : featureArrWithout) {
            iOrdinal2 |= 1 << feature2.ordinal();
        }
        return new JsonFormat.b(strPattern, shape, strLocale, strTimezone, new JsonFormat.a(iOrdinal, iOrdinal2), jsonFormat.lenient().a());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public final boolean o0(AbstractC36463b abstractC36463b) {
        AbstractC48125g abstractC48125g;
        Boolean boolC;
        JsonCreator jsonCreator = (JsonCreator) abstractC36463b.c(JsonCreator.class);
        if (jsonCreator != null) {
            return jsonCreator.mode() != JsonCreator.Mode.f340925e;
        }
        if (!this.f342115c || !(abstractC36463b instanceof C36467f) || (abstractC48125g = f342113f) == null || (boolC = abstractC48125g.c(abstractC36463b)) == null) {
            return false;
        }
        return boolC.booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0016  */
    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String p(com.fasterxml.jackson.databind.introspect.AbstractC36471j r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof com.fasterxml.jackson.databind.introspect.n
            r1 = 0
            if (r0 == 0) goto L16
            com.fasterxml.jackson.databind.introspect.n r3 = (com.fasterxml.jackson.databind.introspect.n) r3
            com.fasterxml.jackson.databind.introspect.o r0 = r3.f342066d
            if (r0 == 0) goto L16
            sX0.g r0 = com.fasterxml.jackson.databind.introspect.z.f342113f
            if (r0 == 0) goto L16
            com.fasterxml.jackson.databind.v r3 = r0.a(r3)
            if (r3 == 0) goto L16
            goto L17
        L16:
            r3 = r1
        L17:
            if (r3 != 0) goto L1a
            goto L1c
        L1a:
            java.lang.String r1 = r3.f342656b
        L1c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.z.p(com.fasterxml.jackson.databind.introspect.j):java.lang.String");
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final boolean p0(AbstractC36471j abstractC36471j) {
        Boolean boolB;
        com.fasterxml.jackson.annotation.o oVar = (com.fasterxml.jackson.annotation.o) abstractC36471j.c(com.fasterxml.jackson.annotation.o.class);
        if (oVar != null) {
            return oVar.value();
        }
        AbstractC48125g abstractC48125g = f342113f;
        if (abstractC48125g == null || (boolB = abstractC48125g.b(abstractC36471j)) == null) {
            return false;
        }
        return boolB.booleanValue();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final InterfaceC36434d.a q(AbstractC36471j abstractC36471j) {
        String name;
        InterfaceC36434d interfaceC36434d = (InterfaceC36434d) abstractC36471j.c(InterfaceC36434d.class);
        if (interfaceC36434d == null) {
            return null;
        }
        String strValue = interfaceC36434d.value();
        Boolean boolA = interfaceC36434d.useInput().a();
        String str = "".equals(strValue) ? null : strValue;
        InterfaceC36434d.a aVar = (str == null && boolA == null) ? InterfaceC36434d.a.f340988d : new InterfaceC36434d.a(str, boolA);
        Object obj = aVar.f340989b;
        if (obj != null) {
            return aVar;
        }
        if (abstractC36471j instanceof C36472k) {
            C36472k c36472k = (C36472k) abstractC36471j;
            name = c36472k.w().length == 0 ? abstractC36471j.e().getName() : c36472k.v(0).getName();
        } else {
            name = abstractC36471j.e().getName();
        }
        return name.equals(obj) ? aVar : new InterfaceC36434d.a(name, aVar.f340990c);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Boolean q0(AbstractC36471j abstractC36471j) {
        JsonProperty jsonProperty = (JsonProperty) abstractC36471j.c(JsonProperty.class);
        if (jsonProperty != null) {
            return Boolean.valueOf(jsonProperty.required());
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public final Object r(AbstractC36471j abstractC36471j) {
        InterfaceC36434d.a aVarQ = q(abstractC36471j);
        if (aVarQ == null) {
            return null;
        }
        return aVarQ.f340989b;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final boolean r0(Annotation annotation) {
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        Boolean boolValueOf = this.f342114b.f342624c.get(clsAnnotationType);
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(clsAnnotationType.getAnnotation(InterfaceC36433c.class) != null);
            this.f342114b.a(boolValueOf, clsAnnotationType);
        }
        return boolValueOf.booleanValue();
    }

    public Object readResolve() {
        if (this.f342114b == null) {
            this.f342114b = new com.fasterxml.jackson.databind.util.q<>(48, 48);
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Object s(AbstractC36463b abstractC36463b) {
        Class<? extends com.fasterxml.jackson.databind.m> clsKeyUsing;
        InterfaceC47612c interfaceC47612c = (InterfaceC47612c) abstractC36463b.c(InterfaceC47612c.class);
        if (interfaceC47612c == null || (clsKeyUsing = interfaceC47612c.keyUsing()) == m.a.class) {
            return null;
        }
        return clsKeyUsing;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Boolean s0(C36465d c36465d) {
        com.fasterxml.jackson.annotation.q qVar = (com.fasterxml.jackson.annotation.q) c36465d.f342016k.a(com.fasterxml.jackson.annotation.q.class);
        if (qVar == null) {
            return null;
        }
        return Boolean.valueOf(qVar.value());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Object t(AbstractC36463b abstractC36463b) {
        Class<? extends com.fasterxml.jackson.databind.l> clsKeyUsing;
        JsonSerialize jsonSerialize = (JsonSerialize) abstractC36463b.c(JsonSerialize.class);
        if (jsonSerialize == null || (clsKeyUsing = jsonSerialize.keyUsing()) == l.a.class) {
            return null;
        }
        return clsKeyUsing;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Boolean t0(AbstractC36471j abstractC36471j) {
        return Boolean.valueOf(abstractC36471j.m(com.fasterxml.jackson.annotation.B.class));
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Boolean u(AbstractC36471j abstractC36471j) {
        com.fasterxml.jackson.annotation.u uVar = (com.fasterxml.jackson.annotation.u) abstractC36471j.c(com.fasterxml.jackson.annotation.u.class);
        if (uVar == null) {
            return null;
        }
        return uVar.value().a();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final com.fasterxml.jackson.databind.h u0(com.fasterxml.jackson.databind.cfg.l<?> lVar, AbstractC36463b abstractC36463b, com.fasterxml.jackson.databind.h hVar) throws JsonMappingException {
        com.fasterxml.jackson.databind.type.n nVar = lVar.f341506c.f341474b;
        InterfaceC47612c interfaceC47612c = (InterfaceC47612c) abstractC36463b.c(InterfaceC47612c.class);
        Class<?> clsX0 = interfaceC47612c == null ? null : x0(interfaceC47612c.as());
        if (clsX0 != null && !hVar.x(clsX0) && !A0(hVar, clsX0)) {
            try {
                hVar = nVar.k(hVar, clsX0, false);
            } catch (IllegalArgumentException e12) {
                throw y0(String.format("Failed to narrow type %s with annotation (value %s), from '%s': %s", hVar, clsX0.getName(), abstractC36463b.d(), e12.getMessage()), e12);
            }
        }
        if (hVar.G()) {
            com.fasterxml.jackson.databind.h hVarR = hVar.r();
            Class<?> clsX02 = interfaceC47612c == null ? null : x0(interfaceC47612c.keyAs());
            if (clsX02 != null && !A0(hVarR, clsX02)) {
                try {
                    hVar = ((com.fasterxml.jackson.databind.type.f) hVar).Y(nVar.k(hVarR, clsX02, false));
                } catch (IllegalArgumentException e13) {
                    throw y0(String.format("Failed to narrow key type of %s with concrete-type annotation (value %s), from '%s': %s", hVar, clsX02.getName(), abstractC36463b.d(), e13.getMessage()), e13);
                }
            }
        }
        com.fasterxml.jackson.databind.h hVarN = hVar.n();
        if (hVarN == null) {
            return hVar;
        }
        Class<?> clsX03 = interfaceC47612c != null ? x0(interfaceC47612c.contentAs()) : null;
        if (clsX03 == null || A0(hVarN, clsX03)) {
            return hVar;
        }
        try {
            return hVar.L(nVar.k(hVarN, clsX03, false));
        } catch (IllegalArgumentException e14) {
            throw y0(String.format("Failed to narrow value type of %s with concrete-type annotation (value %s), from '%s': %s", hVar, clsX03.getName(), abstractC36463b.d(), e14.getMessage()), e14);
        }
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final com.fasterxml.jackson.databind.v v(AbstractC36471j abstractC36471j) {
        boolean z12;
        com.fasterxml.jackson.annotation.z zVar = (com.fasterxml.jackson.annotation.z) abstractC36471j.c(com.fasterxml.jackson.annotation.z.class);
        if (zVar != null) {
            String strValue = zVar.value();
            if (!strValue.isEmpty()) {
                return com.fasterxml.jackson.databind.v.a(strValue);
            }
            z12 = true;
        } else {
            z12 = false;
        }
        JsonProperty jsonProperty = (JsonProperty) abstractC36471j.c(JsonProperty.class);
        if (jsonProperty != null) {
            String strNamespace = jsonProperty.namespace();
            return com.fasterxml.jackson.databind.v.b(jsonProperty.value(), (strNamespace == null || !strNamespace.isEmpty()) ? strNamespace : null);
        }
        if (z12 || abstractC36471j.n(f342112e)) {
            return com.fasterxml.jackson.databind.v.f342654e;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final com.fasterxml.jackson.databind.h v0(com.fasterxml.jackson.databind.cfg.l<?> lVar, AbstractC36463b abstractC36463b, com.fasterxml.jackson.databind.h hVar) throws JsonMappingException {
        com.fasterxml.jackson.databind.h hVarQ;
        com.fasterxml.jackson.databind.h hVarQ2;
        com.fasterxml.jackson.databind.type.n nVar = lVar.f341506c.f341474b;
        JsonSerialize jsonSerialize = (JsonSerialize) abstractC36463b.c(JsonSerialize.class);
        Class<?> clsX0 = jsonSerialize == null ? null : x0(jsonSerialize.as());
        if (clsX0 != null) {
            if (hVar.x(clsX0)) {
                hVar = hVar.Q();
            } else {
                Class<?> cls = hVar.f341930b;
                try {
                    if (clsX0.isAssignableFrom(cls)) {
                        nVar.getClass();
                        hVar = com.fasterxml.jackson.databind.type.n.h(hVar, clsX0);
                    } else if (cls.isAssignableFrom(clsX0)) {
                        hVar = nVar.k(hVar, clsX0, false);
                    } else {
                        if (!B0(cls, clsX0)) {
                            throw new JsonMappingException(null, String.format("Cannot refine serialization type %s into %s; types not related", hVar, clsX0.getName()));
                        }
                        hVar = hVar.Q();
                    }
                } catch (IllegalArgumentException e12) {
                    throw y0(String.format("Failed to widen type %s with annotation (value %s), from '%s': %s", hVar, clsX0.getName(), abstractC36463b.d(), e12.getMessage()), e12);
                }
            }
        }
        if (hVar.G()) {
            com.fasterxml.jackson.databind.h hVarR = hVar.r();
            Class<?> clsX02 = jsonSerialize == null ? null : x0(jsonSerialize.keyAs());
            if (clsX02 != null) {
                if (hVarR.x(clsX02)) {
                    hVarQ2 = hVarR.Q();
                } else {
                    Class<?> cls2 = hVarR.f341930b;
                    try {
                        if (clsX02.isAssignableFrom(cls2)) {
                            nVar.getClass();
                            hVarQ2 = com.fasterxml.jackson.databind.type.n.h(hVarR, clsX02);
                        } else if (cls2.isAssignableFrom(clsX02)) {
                            hVarQ2 = nVar.k(hVarR, clsX02, false);
                        } else {
                            if (!B0(cls2, clsX02)) {
                                throw new JsonMappingException(null, String.format("Cannot refine serialization key type %s into %s; types not related", hVarR, clsX02.getName()));
                            }
                            hVarQ2 = hVarR.Q();
                        }
                    } catch (IllegalArgumentException e13) {
                        throw y0(String.format("Failed to widen key type of %s with concrete-type annotation (value %s), from '%s': %s", hVar, clsX02.getName(), abstractC36463b.d(), e13.getMessage()), e13);
                    }
                }
                hVar = ((com.fasterxml.jackson.databind.type.f) hVar).Y(hVarQ2);
            }
        }
        com.fasterxml.jackson.databind.h hVarN = hVar.n();
        if (hVarN == null) {
            return hVar;
        }
        Class<?> clsX03 = jsonSerialize == null ? null : x0(jsonSerialize.contentAs());
        if (clsX03 == null) {
            return hVar;
        }
        if (hVarN.x(clsX03)) {
            hVarQ = hVarN.Q();
        } else {
            Class<?> cls3 = hVarN.f341930b;
            try {
                if (clsX03.isAssignableFrom(cls3)) {
                    nVar.getClass();
                    hVarQ = com.fasterxml.jackson.databind.type.n.h(hVarN, clsX03);
                } else if (cls3.isAssignableFrom(clsX03)) {
                    hVarQ = nVar.k(hVarN, clsX03, false);
                } else {
                    if (!B0(cls3, clsX03)) {
                        throw new JsonMappingException(null, String.format("Cannot refine serialization content type %s into %s; types not related", hVarN, clsX03.getName()));
                    }
                    hVarQ = hVarN.Q();
                }
            } catch (IllegalArgumentException e14) {
                throw y0(String.format("Internal error: failed to refine value type of %s with concrete-type annotation (value %s), from '%s': %s", hVar, clsX03.getName(), abstractC36463b.d(), e14.getMessage()), e14);
            }
        }
        return hVar.L(hVarQ);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final com.fasterxml.jackson.databind.v w(AbstractC36471j abstractC36471j) {
        boolean z12;
        com.fasterxml.jackson.annotation.l lVar = (com.fasterxml.jackson.annotation.l) abstractC36471j.c(com.fasterxml.jackson.annotation.l.class);
        if (lVar != null) {
            String strValue = lVar.value();
            if (!strValue.isEmpty()) {
                return com.fasterxml.jackson.databind.v.a(strValue);
            }
            z12 = true;
        } else {
            z12 = false;
        }
        JsonProperty jsonProperty = (JsonProperty) abstractC36471j.c(JsonProperty.class);
        if (jsonProperty != null) {
            String strNamespace = jsonProperty.namespace();
            return com.fasterxml.jackson.databind.v.b(jsonProperty.value(), (strNamespace == null || !strNamespace.isEmpty()) ? strNamespace : null);
        }
        if (z12 || abstractC36471j.n(f342111d)) {
            return com.fasterxml.jackson.databind.v.f342654e;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final C36472k w0(C36472k c36472k, C36472k c36472k2) {
        Class<?> clsV = c36472k.v(0);
        Class<?> clsV2 = c36472k2.v(0);
        if (clsV.isPrimitive()) {
            if (clsV2.isPrimitive()) {
                return null;
            }
            return c36472k;
        }
        if (clsV2.isPrimitive()) {
            return c36472k2;
        }
        if (clsV == String.class) {
            if (clsV2 != String.class) {
                return c36472k;
            }
        } else if (clsV2 == String.class) {
            return c36472k2;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Object x(C36465d c36465d) {
        InterfaceC47613d interfaceC47613d = (InterfaceC47613d) c36465d.f342016k.a(InterfaceC47613d.class);
        if (interfaceC47613d == null) {
            return null;
        }
        return interfaceC47613d.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Object y(AbstractC36471j abstractC36471j) {
        Class<? extends com.fasterxml.jackson.databind.l> clsNullsUsing;
        JsonSerialize jsonSerialize = (JsonSerialize) abstractC36471j.c(JsonSerialize.class);
        if (jsonSerialize == null || (clsNullsUsing = jsonSerialize.nullsUsing()) == l.a.class) {
            return null;
        }
        return clsNullsUsing;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final D z(AbstractC36463b abstractC36463b) {
        com.fasterxml.jackson.annotation.m mVar = (com.fasterxml.jackson.annotation.m) abstractC36463b.c(com.fasterxml.jackson.annotation.m.class);
        if (mVar == null || mVar.generator() == H.c.class) {
            return null;
        }
        return new D(com.fasterxml.jackson.databind.v.a(mVar.property()), mVar.scope(), mVar.generator(), false, mVar.resolver());
    }
}
