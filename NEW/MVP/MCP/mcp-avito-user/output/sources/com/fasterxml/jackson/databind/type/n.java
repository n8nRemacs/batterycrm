package com.fasterxml.jackson.databind.type;

import com.adjust.sdk.Constants;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.IntParameter;
import com.fasterxml.jackson.databind.type.p;
import com.fasterxml.jackson.databind.util.q;
import com.fasterxml.jackson.databind.util.s;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* compiled from: TypeFactory.java */
/* loaded from: classes4.dex */
public class n implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.fasterxml.jackson.databind.h[] f342485d = new com.fasterxml.jackson.databind.h[0];

    /* renamed from: e, reason: collision with root package name */
    public static final n f342486e = new n();

    /* renamed from: f, reason: collision with root package name */
    public static final m f342487f = m.f342469h;

    /* renamed from: g, reason: collision with root package name */
    public static final Class<?> f342488g = String.class;

    /* renamed from: h, reason: collision with root package name */
    public static final Class<?> f342489h = Object.class;

    /* renamed from: i, reason: collision with root package name */
    public static final Class<?> f342490i = Comparable.class;

    /* renamed from: j, reason: collision with root package name */
    public static final Class<?> f342491j = Class.class;

    /* renamed from: k, reason: collision with root package name */
    public static final Class<?> f342492k = Enum.class;

    /* renamed from: l, reason: collision with root package name */
    public static final Class<?> f342493l = com.fasterxml.jackson.databind.j.class;

    /* renamed from: m, reason: collision with root package name */
    public static final Class<?> f342494m;

    /* renamed from: n, reason: collision with root package name */
    public static final Class<?> f342495n;

    /* renamed from: o, reason: collision with root package name */
    public static final Class<?> f342496o;

    /* renamed from: p, reason: collision with root package name */
    public static final k f342497p;

    /* renamed from: q, reason: collision with root package name */
    public static final k f342498q;

    /* renamed from: r, reason: collision with root package name */
    public static final k f342499r;

    /* renamed from: s, reason: collision with root package name */
    public static final k f342500s;
    private static final long serialVersionUID = 1;

    /* renamed from: t, reason: collision with root package name */
    public static final k f342501t;

    /* renamed from: u, reason: collision with root package name */
    public static final k f342502u;

    /* renamed from: v, reason: collision with root package name */
    public static final k f342503v;

    /* renamed from: w, reason: collision with root package name */
    public static final k f342504w;

    /* renamed from: x, reason: collision with root package name */
    public static final k f342505x;

    /* renamed from: b, reason: collision with root package name */
    public final s<Object, com.fasterxml.jackson.databind.h> f342506b = new q(16, 200);

    /* renamed from: c, reason: collision with root package name */
    public final p f342507c = new p(this);

    static {
        Class<?> cls = Boolean.TYPE;
        f342494m = cls;
        Class<?> cls2 = Integer.TYPE;
        f342495n = cls2;
        Class<?> cls3 = Long.TYPE;
        f342496o = cls3;
        f342497p = new k(cls);
        f342498q = new k(cls2);
        f342499r = new k(cls3);
        f342500s = new k(String.class);
        f342501t = new k(Object.class);
        f342502u = new k(Comparable.class);
        f342503v = new k(Enum.class);
        f342504w = new k(Class.class);
        f342505x = new k(com.fasterxml.jackson.databind.j.class);
    }

    public static k a(Class cls) {
        if (cls.isPrimitive()) {
            if (cls == f342494m) {
                return f342497p;
            }
            if (cls == f342495n) {
                return f342498q;
            }
            if (cls == f342496o) {
                return f342499r;
            }
            return null;
        }
        if (cls == f342488g) {
            return f342500s;
        }
        if (cls == f342489h) {
            return f342501t;
        }
        if (cls == f342493l) {
            return f342505x;
        }
        return null;
    }

    public static boolean e(com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.h hVar2) {
        if (hVar2 instanceof h) {
            ((h) hVar2).f342459l = hVar;
            return true;
        }
        if (hVar.f341930b != hVar2.f341930b) {
            return false;
        }
        List<com.fasterxml.jackson.databind.h> listE = hVar.m().e();
        List<com.fasterxml.jackson.databind.h> listE2 = hVar2.m().e();
        int size = listE.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (!e(listE.get(i12), listE2.get(i12))) {
                return false;
            }
        }
        return true;
    }

    public static com.fasterxml.jackson.databind.h h(com.fasterxml.jackson.databind.h hVar, Class cls) {
        Class<?> cls2 = hVar.f341930b;
        if (cls2 == cls) {
            return hVar;
        }
        com.fasterxml.jackson.databind.h hVarL = hVar.l(cls);
        if (hVarL != null) {
            return hVarL;
        }
        if (cls.isAssignableFrom(cls2)) {
            throw new IllegalArgumentException(String.format("Internal error: class %s not included as super-type for %s", cls.getName(), hVar));
        }
        throw new IllegalArgumentException(String.format("Class %s not a super-type of %s", cls.getName(), hVar));
    }

    public static Class m(String str) throws ClassNotFoundException {
        Throwable thS = null;
        if (str.indexOf(46) < 0) {
            Class cls = IntParameter.TYPE.equals(str) ? Integer.TYPE : Constants.LONG.equals(str) ? Long.TYPE : "float".equals(str) ? Float.TYPE : "double".equals(str) ? Double.TYPE : BooleanParameter.TYPE.equals(str) ? Boolean.TYPE : "byte".equals(str) ? Byte.TYPE : CharParameter.TYPE.equals(str) ? Character.TYPE : "short".equals(str) ? Short.TYPE : "void".equals(str) ? Void.TYPE : null;
            if (cls != null) {
                return cls;
            }
        }
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader != null) {
            try {
                return Class.forName(str, true, contextClassLoader);
            } catch (Exception e12) {
                thS = com.fasterxml.jackson.databind.util.g.s(e12);
            }
        }
        try {
            return Class.forName(str);
        } catch (Exception e13) {
            if (thS == null) {
                thS = com.fasterxml.jackson.databind.util.g.s(e13);
            }
            com.fasterxml.jackson.databind.util.g.F(thS);
            throw new ClassNotFoundException(thS.getMessage(), thS);
        }
    }

    public static com.fasterxml.jackson.databind.h[] n(com.fasterxml.jackson.databind.h hVar, Class cls) {
        com.fasterxml.jackson.databind.h hVarL = hVar.l(cls);
        return hVarL == null ? f342485d : hVarL.m().f342471c;
    }

    @Deprecated
    public static void o(Class cls) {
        m mVar = f342487f;
        if (!mVar.f() || a(cls) == null) {
            new k(cls, mVar, null, null);
        }
    }

    public static k p() {
        f342486e.getClass();
        return f342501t;
    }

    public final com.fasterxml.jackson.databind.h b(c cVar, Type type, m mVar) {
        com.fasterxml.jackson.databind.h hVar;
        Type[] bounds;
        com.fasterxml.jackson.databind.h hVar2;
        m mVarC;
        if (type instanceof Class) {
            return c(cVar, (Class) type, f342487f);
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Class<?> cls = (Class) parameterizedType.getRawType();
            if (cls == f342492k) {
                return f342503v;
            }
            if (cls == f342490i) {
                return f342502u;
            }
            if (cls == f342491j) {
                return f342504w;
            }
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments == null ? 0 : actualTypeArguments.length;
            if (length == 0) {
                mVarC = f342487f;
            } else {
                com.fasterxml.jackson.databind.h[] hVarArr = new com.fasterxml.jackson.databind.h[length];
                for (int i12 = 0; i12 < length; i12++) {
                    hVarArr[i12] = b(cVar, actualTypeArguments[i12], mVar);
                }
                mVarC = m.c(cls, hVarArr);
            }
            return c(cVar, cls, mVarC);
        }
        if (type instanceof com.fasterxml.jackson.databind.h) {
            return (com.fasterxml.jackson.databind.h) type;
        }
        if (type instanceof GenericArrayType) {
            com.fasterxml.jackson.databind.h hVarB = b(cVar, ((GenericArrayType) type).getGenericComponentType(), mVar);
            int i13 = a.f342446m;
            return new a(hVarB, mVar, Array.newInstance(hVarB.f341930b, 0), null, null, false);
        }
        if (!(type instanceof TypeVariable)) {
            if (type instanceof WildcardType) {
                return b(cVar, ((WildcardType) type).getUpperBounds()[0], mVar);
            }
            StringBuilder sb2 = new StringBuilder("Unrecognized Type: ");
            sb2.append(type == null ? "[null]" : type.toString());
            throw new IllegalArgumentException(sb2.toString());
        }
        TypeVariable typeVariable = (TypeVariable) type;
        String name = typeVariable.getName();
        if (mVar == null) {
            throw new IllegalArgumentException(AK.c.k("Null `bindings` passed (type variable \"", name, "\")"));
        }
        String[] strArr = mVar.f342470b;
        int length2 = strArr.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length2) {
                hVar = null;
                break;
            }
            if (name.equals(strArr[i14])) {
                hVar = mVar.f342471c[i14];
                if ((hVar instanceof j) && (hVar2 = ((j) hVar).f342462k) != null) {
                    hVar = hVar2;
                }
            } else {
                i14++;
            }
        }
        if (hVar != null) {
            return hVar;
        }
        String[] strArr2 = mVar.f342472d;
        if (strArr2 != null) {
            int length3 = strArr2.length;
            do {
                length3--;
                if (length3 >= 0) {
                }
            } while (!name.equals(strArr2[length3]));
            return f342501t;
        }
        String[] strArr3 = mVar.f342472d;
        int length4 = strArr3 == null ? 0 : strArr3.length;
        String[] strArr4 = length4 == 0 ? new String[1] : (String[]) Arrays.copyOf(strArr3, 1 + length4);
        strArr4[length4] = name;
        m mVar2 = new m(mVar.f342470b, mVar.f342471c, strArr4);
        synchronized (typeVariable) {
            bounds = typeVariable.getBounds();
        }
        return b(cVar, bounds[0], mVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0200  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.h c(com.fasterxml.jackson.databind.type.c r26, java.lang.Class<?> r27, com.fasterxml.jackson.databind.type.m r28) {
        /*
            Method dump skipped, instructions count: 621
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.type.n.c(com.fasterxml.jackson.databind.type.c, java.lang.Class, com.fasterxml.jackson.databind.type.m):com.fasterxml.jackson.databind.h");
    }

    public final com.fasterxml.jackson.databind.h[] d(c cVar, Class<?> cls, m mVar) {
        Annotation[] annotationArr = com.fasterxml.jackson.databind.util.g.f342596a;
        Type[] genericInterfaces = cls.getGenericInterfaces();
        if (genericInterfaces == null || genericInterfaces.length == 0) {
            return f342485d;
        }
        int length = genericInterfaces.length;
        com.fasterxml.jackson.databind.h[] hVarArr = new com.fasterxml.jackson.databind.h[length];
        for (int i12 = 0; i12 < length; i12++) {
            hVarArr[i12] = b(cVar, genericInterfaces[i12], mVar);
        }
        return hVarArr;
    }

    public final e f(com.fasterxml.jackson.databind.h hVar, Class cls) {
        m mVar;
        String[] strArr = m.f342467f;
        TypeVariable[] typeParameters = cls.getTypeParameters();
        int length = typeParameters == null ? 0 : typeParameters.length;
        if (length == 0) {
            mVar = m.f342469h;
        } else {
            if (length != 1) {
                throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 1 type parameter: class expects " + length);
            }
            mVar = new m(new String[]{typeParameters[0].getName()}, new com.fasterxml.jackson.databind.h[]{hVar}, null);
        }
        e eVar = (e) c(null, cls, mVar);
        if (mVar.f() && hVar != null) {
            com.fasterxml.jackson.databind.h hVarN = eVar.l(Collection.class).n();
            if (!hVarN.equals(hVar)) {
                throw new IllegalArgumentException(String.format("Non-generic Collection class %s did not resolve to something with element type %s but %s ", com.fasterxml.jackson.databind.util.g.A(cls), hVar, hVarN));
            }
        }
        return eVar;
    }

    public final com.fasterxml.jackson.databind.h g(String str) {
        p pVar = this.f342507c;
        pVar.getClass();
        p.a aVar = new p.a(str.trim());
        com.fasterxml.jackson.databind.h hVarB = pVar.b(aVar);
        if (aVar.hasMoreTokens()) {
            throw p.a(aVar, "Unexpected tokens after complete type");
        }
        return hVarB;
    }

    public final g i(Class<? extends Map> cls, com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.h hVar2) {
        m mVar;
        com.fasterxml.jackson.databind.h[] hVarArr = {hVar, hVar2};
        String[] strArr = m.f342467f;
        TypeVariable<Class<? extends Map>>[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null || typeParameters.length == 0) {
            mVar = m.f342469h;
        } else {
            int length = typeParameters.length;
            String[] strArr2 = new String[length];
            for (int i12 = 0; i12 < length; i12++) {
                strArr2[i12] = typeParameters[i12].getName();
            }
            if (length != 2) {
                throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 2 type parameters: class expects " + length);
            }
            mVar = new m(strArr2, hVarArr, null);
        }
        g gVar = (g) c(null, cls, mVar);
        if (mVar.f()) {
            com.fasterxml.jackson.databind.h hVarL = gVar.l(Map.class);
            com.fasterxml.jackson.databind.h hVarR = hVarL.r();
            if (!hVarR.equals(hVar)) {
                throw new IllegalArgumentException(String.format("Non-generic Map class %s did not resolve to something with key type %s but %s ", com.fasterxml.jackson.databind.util.g.A(cls), hVar, hVarR));
            }
            com.fasterxml.jackson.databind.h hVarN = hVarL.n();
            if (!hVarN.equals(hVar2)) {
                throw new IllegalArgumentException(String.format("Non-generic Map class %s did not resolve to something with value type %s but %s ", com.fasterxml.jackson.databind.util.g.A(cls), hVar2, hVarN));
            }
        }
        return gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0099 A[LOOP:0: B:45:0x0097->B:46:0x0099, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.h k(com.fasterxml.jackson.databind.h r17, java.lang.Class<?> r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.type.n.k(com.fasterxml.jackson.databind.h, java.lang.Class, boolean):com.fasterxml.jackson.databind.h");
    }

    public final com.fasterxml.jackson.databind.h l(Type type) {
        return b(null, type, f342487f);
    }
}
