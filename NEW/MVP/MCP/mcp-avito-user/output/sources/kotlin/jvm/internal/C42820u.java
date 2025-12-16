package kotlin.jvm.internal;

import com.adjust.sdk.Constants;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.IntParameter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.InterfaceC42733c0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.text.C43066x;

/* compiled from: ClassReference.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/jvm/internal/u;", "Lkotlin/reflect/d;", "", "Lkotlin/jvm/internal/t;", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.jvm.internal.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42820u implements kotlin.reflect.d<Object>, InterfaceC42819t {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f406851c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final Map<Class<? extends InterfaceC43072x<?>>, Integer> f406852d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final HashMap<String, String> f406853e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final LinkedHashMap f406854f;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Class<?> f406855b;

    /* compiled from: ClassReference.kt */
    @s0
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R,\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR0\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nj\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR0\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nj\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR0\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nj\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\t¨\u0006\u0012"}, d2 = {"Lkotlin/jvm/internal/u$a;", "", "<init>", "()V", "", "Ljava/lang/Class;", "Lkotlin/x;", "", "FUNCTION_CLASSES", "Ljava/util/Map;", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "classFqNames", "Ljava/util/HashMap;", "primitiveFqNames", "primitiveWrapperFqNames", "simpleNames", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.jvm.internal.u$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        List listU = C42745f0.U(Y41.a.class, Y41.l.class, Y41.p.class, Y41.q.class, Y41.r.class, Y41.s.class, Y41.t.class, Y41.u.class, Y41.v.class, Y41.w.class, Y41.b.class, Y41.c.class, Y41.d.class, Y41.e.class, Y41.f.class, Y41.g.class, Y41.h.class, Y41.i.class, Y41.j.class, Y41.k.class, Y41.m.class, Y41.n.class, Y41.o.class);
        ArrayList arrayList = new ArrayList(C42745f0.q(listU, 10));
        int i12 = 0;
        for (Object obj : listU) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            arrayList.add(new kotlin.Q((Class) obj, Integer.valueOf(i12)));
            i12 = i13;
        }
        f406852d = P0.p(arrayList);
        HashMap map = new HashMap();
        map.put(BooleanParameter.TYPE, "kotlin.Boolean");
        map.put(CharParameter.TYPE, "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put(IntParameter.TYPE, "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put(Constants.LONG, "kotlin.Long");
        map.put("double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        HashMap<String, String> map3 = new HashMap<>();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        for (String str : map.values()) {
            map3.put("kotlin.jvm.internal." + C43066x.n0('.', str, str) + "CompanionObject", str.concat(".Companion"));
        }
        for (Map.Entry<Class<? extends InterfaceC43072x<?>>, Integer> entry : f406852d.entrySet()) {
            map3.put(entry.getKey().getName(), "kotlin.Function" + entry.getValue().intValue());
        }
        f406853e = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(map3.size()));
        Iterator<T> it = map3.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            linkedHashMap.put(key, C43066x.n0('.', str2, str2));
        }
        f406854f = linkedHashMap;
    }

    public C42820u(@Y61.k Class<?> cls) {
        this.f406855b = cls;
    }

    @Override // kotlin.reflect.d
    @Y61.k
    public final List<kotlin.reflect.r> C() {
        throw new X41.r();
    }

    public final boolean equals(@Y61.l Object obj) {
        return (obj instanceof C42820u) && X41.b.b(this).equals(X41.b.b((kotlin.reflect.d) obj));
    }

    @Override // kotlin.jvm.internal.InterfaceC42819t
    @Y61.k
    public final Class<?> f() {
        return this.f406855b;
    }

    @Override // kotlin.reflect.d
    public final int hashCode() {
        return X41.b.b(this).hashCode();
    }

    @Override // kotlin.reflect.d
    @Y61.l
    public final String l0() {
        String str;
        f406851c.getClass();
        Class<?> cls = this.f406855b;
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            boolean zIsArray = cls.isArray();
            LinkedHashMap linkedHashMap = f406854f;
            if (!zIsArray) {
                String str2 = (String) linkedHashMap.get(cls.getName());
                return str2 == null ? cls.getSimpleName() : str2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                strConcat = str.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return C43066x.m0(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return C43066x.l0('$', simpleName, simpleName);
        }
        return C43066x.m0(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    @Override // kotlin.reflect.d
    @Y61.k
    public final Collection<kotlin.reflect.d<?>> m0() {
        throw new X41.r();
    }

    @Override // kotlin.reflect.d
    @InterfaceC42733c0
    public final boolean n0(@Y61.l Object obj) {
        f406851c.getClass();
        Map<Class<? extends InterfaceC43072x<?>>, Integer> map = f406852d;
        Class<?> clsB = this.f406855b;
        Integer num = map.get(clsB);
        if (num != null) {
            return v0.f(num.intValue(), obj);
        }
        if (clsB.isPrimitive()) {
            clsB = X41.b.b(m0.f406844a.b(clsB));
        }
        return clsB.isInstance(obj);
    }

    @Override // kotlin.reflect.d
    @Y61.k
    public final Collection<kotlin.reflect.c<?>> o0() {
        throw new X41.r();
    }

    @Override // kotlin.reflect.d
    @Y61.l
    public final String p0() {
        String str;
        f406851c.getClass();
        Class<?> cls = this.f406855b;
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        boolean zIsArray = cls.isArray();
        HashMap<String, String> map = f406853e;
        if (!zIsArray) {
            String str2 = map.get(cls.getName());
            return str2 == null ? cls.getCanonicalName() : str2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (str = map.get(componentType.getName())) != null) {
            strConcat = str.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    @Y61.k
    public final String toString() {
        return this.f406855b.toString() + " (Kotlin reflection is not available)";
    }
}
