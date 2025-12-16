package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.builtins.functions.e;
import kotlin.reflect.jvm.internal.impl.builtins.n;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.text.C43066x;

/* compiled from: JavaToKotlinClassMap.kt */
@s0
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final c f407238a = new c();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f407239b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f407240c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final String f407241d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final String f407242e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final kotlin.reflect.jvm.internal.impl.name.b f407243f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final kotlin.reflect.jvm.internal.impl.name.c f407244g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final kotlin.reflect.jvm.internal.impl.name.b f407245h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final HashMap<kotlin.reflect.jvm.internal.impl.name.d, kotlin.reflect.jvm.internal.impl.name.b> f407246i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final HashMap<kotlin.reflect.jvm.internal.impl.name.d, kotlin.reflect.jvm.internal.impl.name.b> f407247j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final HashMap<kotlin.reflect.jvm.internal.impl.name.d, kotlin.reflect.jvm.internal.impl.name.c> f407248k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public static final HashMap<kotlin.reflect.jvm.internal.impl.name.d, kotlin.reflect.jvm.internal.impl.name.c> f407249l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final HashMap<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.name.b> f407250m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public static final HashMap<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.name.b> f407251n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public static final List<a> f407252o;

    /* compiled from: JavaToKotlinClassMap.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final kotlin.reflect.jvm.internal.impl.name.b f407253a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final kotlin.reflect.jvm.internal.impl.name.b f407254b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final kotlin.reflect.jvm.internal.impl.name.b f407255c;

        public a(@Y61.k kotlin.reflect.jvm.internal.impl.name.b bVar, @Y61.k kotlin.reflect.jvm.internal.impl.name.b bVar2, @Y61.k kotlin.reflect.jvm.internal.impl.name.b bVar3) {
            this.f407253a = bVar;
            this.f407254b = bVar2;
            this.f407255c = bVar3;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f407253a, aVar.f407253a) && L.f(this.f407254b, aVar.f407254b) && L.f(this.f407255c, aVar.f407255c);
        }

        public final int hashCode() {
            return this.f407255c.hashCode() + ((this.f407254b.hashCode() + (this.f407253a.hashCode() * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.f407253a + ", kotlinReadOnly=" + this.f407254b + ", kotlinMutable=" + this.f407255c + ')';
        }
    }

    static {
        StringBuilder sb2 = new StringBuilder();
        e.a aVar = e.a.f407215c;
        sb2.append(aVar.f407213a.f409243a.toString());
        sb2.append('.');
        sb2.append(aVar.f407214b);
        f407239b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        e.b bVar = e.b.f407216c;
        sb3.append(bVar.f407213a.f409243a.toString());
        sb3.append('.');
        sb3.append(bVar.f407214b);
        f407240c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        e.d dVar = e.d.f407218c;
        sb4.append(dVar.f407213a.f409243a.toString());
        sb4.append('.');
        sb4.append(dVar.f407214b);
        f407241d = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        e.c cVar = e.c.f407217c;
        sb5.append(cVar.f407213a.f409243a.toString());
        sb5.append('.');
        sb5.append(cVar.f407214b);
        f407242e = sb5.toString();
        kotlin.reflect.jvm.internal.impl.name.b bVarJ = kotlin.reflect.jvm.internal.impl.name.b.j(new kotlin.reflect.jvm.internal.impl.name.c("kotlin.jvm.functions.FunctionN"));
        f407243f = bVarJ;
        f407244g = bVarJ.b();
        kotlin.reflect.jvm.internal.impl.name.i.f409264a.getClass();
        f407245h = kotlin.reflect.jvm.internal.impl.name.i.f409279p;
        c(Class.class);
        f407246i = new HashMap<>();
        f407247j = new HashMap<>();
        f407248k = new HashMap<>();
        f407249l = new HashMap<>();
        f407250m = new HashMap<>();
        f407251n = new HashMap<>();
        kotlin.reflect.jvm.internal.impl.name.b bVarJ2 = kotlin.reflect.jvm.internal.impl.name.b.j(n.a.f407346B);
        a aVar2 = new a(c(Iterable.class), bVarJ2, new kotlin.reflect.jvm.internal.impl.name.b(bVarJ2.g(), kotlin.reflect.jvm.internal.impl.name.e.b(n.a.f407354J, bVarJ2.g()), false));
        kotlin.reflect.jvm.internal.impl.name.b bVarJ3 = kotlin.reflect.jvm.internal.impl.name.b.j(n.a.f407345A);
        a aVar3 = new a(c(Iterator.class), bVarJ3, new kotlin.reflect.jvm.internal.impl.name.b(bVarJ3.g(), kotlin.reflect.jvm.internal.impl.name.e.b(n.a.f407353I, bVarJ3.g()), false));
        kotlin.reflect.jvm.internal.impl.name.b bVarJ4 = kotlin.reflect.jvm.internal.impl.name.b.j(n.a.f407347C);
        a aVar4 = new a(c(Collection.class), bVarJ4, new kotlin.reflect.jvm.internal.impl.name.b(bVarJ4.g(), kotlin.reflect.jvm.internal.impl.name.e.b(n.a.f407355K, bVarJ4.g()), false));
        kotlin.reflect.jvm.internal.impl.name.b bVarJ5 = kotlin.reflect.jvm.internal.impl.name.b.j(n.a.f407348D);
        a aVar5 = new a(c(List.class), bVarJ5, new kotlin.reflect.jvm.internal.impl.name.b(bVarJ5.g(), kotlin.reflect.jvm.internal.impl.name.e.b(n.a.f407356L, bVarJ5.g()), false));
        kotlin.reflect.jvm.internal.impl.name.b bVarJ6 = kotlin.reflect.jvm.internal.impl.name.b.j(n.a.f407350F);
        a aVar6 = new a(c(Set.class), bVarJ6, new kotlin.reflect.jvm.internal.impl.name.b(bVarJ6.g(), kotlin.reflect.jvm.internal.impl.name.e.b(n.a.f407358N, bVarJ6.g()), false));
        kotlin.reflect.jvm.internal.impl.name.b bVarJ7 = kotlin.reflect.jvm.internal.impl.name.b.j(n.a.f407349E);
        a aVar7 = new a(c(ListIterator.class), bVarJ7, new kotlin.reflect.jvm.internal.impl.name.b(bVarJ7.g(), kotlin.reflect.jvm.internal.impl.name.e.b(n.a.f407357M, bVarJ7.g()), false));
        kotlin.reflect.jvm.internal.impl.name.c cVar2 = n.a.f407351G;
        kotlin.reflect.jvm.internal.impl.name.b bVarJ8 = kotlin.reflect.jvm.internal.impl.name.b.j(cVar2);
        a aVar8 = new a(c(Map.class), bVarJ8, new kotlin.reflect.jvm.internal.impl.name.b(bVarJ8.g(), kotlin.reflect.jvm.internal.impl.name.e.b(n.a.f407359O, bVarJ8.g()), false));
        kotlin.reflect.jvm.internal.impl.name.b bVarD = kotlin.reflect.jvm.internal.impl.name.b.j(cVar2).d(n.a.f407352H.f());
        List<a> listU = C42745f0.U(aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, new a(c(Map.Entry.class), bVarD, new kotlin.reflect.jvm.internal.impl.name.b(bVarD.g(), kotlin.reflect.jvm.internal.impl.name.e.b(n.a.f407360P, bVarD.g()), false)));
        f407252o = listU;
        b(Object.class, n.a.f407373b);
        b(String.class, n.a.f407381g);
        b(CharSequence.class, n.a.f407380f);
        a(c(Throwable.class), kotlin.reflect.jvm.internal.impl.name.b.j(n.a.f407386l));
        b(Cloneable.class, n.a.f407377d);
        b(Number.class, n.a.f407384j);
        a(c(Comparable.class), kotlin.reflect.jvm.internal.impl.name.b.j(n.a.f407387m));
        b(Enum.class, n.a.f407385k);
        a(c(Annotation.class), kotlin.reflect.jvm.internal.impl.name.b.j(n.a.f407394t));
        for (a aVar9 : listU) {
            f407238a.getClass();
            kotlin.reflect.jvm.internal.impl.name.b bVar2 = aVar9.f407253a;
            kotlin.reflect.jvm.internal.impl.name.b bVar3 = aVar9.f407254b;
            a(bVar2, bVar3);
            kotlin.reflect.jvm.internal.impl.name.b bVar4 = aVar9.f407255c;
            f407247j.put(bVar4.b().i(), bVar2);
            f407250m.put(bVar4, bVar3);
            f407251n.put(bVar3, bVar4);
            kotlin.reflect.jvm.internal.impl.name.c cVarB = bVar3.b();
            kotlin.reflect.jvm.internal.impl.name.c cVarB2 = bVar4.b();
            f407248k.put(bVar4.b().i(), cVarB);
            f407249l.put(cVarB.i(), cVarB2);
        }
        for (JvmPrimitiveType jvmPrimitiveType : JvmPrimitiveType.values()) {
            c cVar3 = f407238a;
            kotlin.reflect.jvm.internal.impl.name.b bVarJ9 = kotlin.reflect.jvm.internal.impl.name.b.j(jvmPrimitiveType.e());
            kotlin.reflect.jvm.internal.impl.name.b bVarJ10 = kotlin.reflect.jvm.internal.impl.name.b.j(kotlin.reflect.jvm.internal.impl.builtins.n.f407339l.c(jvmPrimitiveType.d().f407170b));
            cVar3.getClass();
            a(bVarJ9, bVarJ10);
        }
        kotlin.reflect.jvm.internal.impl.builtins.c.f407192a.getClass();
        for (kotlin.reflect.jvm.internal.impl.name.b bVar5 : kotlin.reflect.jvm.internal.impl.builtins.c.f407193b) {
            c cVar4 = f407238a;
            kotlin.reflect.jvm.internal.impl.name.b bVarJ11 = kotlin.reflect.jvm.internal.impl.name.b.j(new kotlin.reflect.jvm.internal.impl.name.c("kotlin.jvm.internal." + bVar5.i().b() + "CompanionObject"));
            kotlin.reflect.jvm.internal.impl.name.b bVarD2 = bVar5.d(kotlin.reflect.jvm.internal.impl.name.h.f409258c);
            cVar4.getClass();
            a(bVarJ11, bVarD2);
        }
        for (int i12 = 0; i12 < 23; i12++) {
            c cVar5 = f407238a;
            kotlin.reflect.jvm.internal.impl.name.b bVarJ12 = kotlin.reflect.jvm.internal.impl.name.b.j(new kotlin.reflect.jvm.internal.impl.name.c(AK.c.g(i12, "kotlin.jvm.functions.Function")));
            kotlin.reflect.jvm.internal.impl.name.b bVar6 = new kotlin.reflect.jvm.internal.impl.name.b(kotlin.reflect.jvm.internal.impl.builtins.n.f407339l, kotlin.reflect.jvm.internal.impl.name.f.e("Function" + i12));
            cVar5.getClass();
            a(bVarJ12, bVar6);
            f407247j.put(new kotlin.reflect.jvm.internal.impl.name.c(f407240c + i12).i(), f407245h);
        }
        for (int i13 = 0; i13 < 22; i13++) {
            e.c cVar6 = e.c.f407217c;
            String str = cVar6.f407213a.f409243a.toString() + '.' + cVar6.f407214b;
            c cVar7 = f407238a;
            kotlin.reflect.jvm.internal.impl.name.c cVar8 = new kotlin.reflect.jvm.internal.impl.name.c(str + i13);
            kotlin.reflect.jvm.internal.impl.name.b bVar7 = f407245h;
            cVar7.getClass();
            f407247j.put(cVar8.i(), bVar7);
        }
        c cVar9 = f407238a;
        kotlin.reflect.jvm.internal.impl.name.c cVarG = n.a.f407375c.g();
        cVar9.getClass();
        f407247j.put(cVarG.i(), c(Void.class));
    }

    public static void a(kotlin.reflect.jvm.internal.impl.name.b bVar, kotlin.reflect.jvm.internal.impl.name.b bVar2) {
        f407246i.put(bVar.b().i(), bVar2);
        f407247j.put(bVar2.b().i(), bVar);
    }

    public static void b(Class cls, kotlin.reflect.jvm.internal.impl.name.d dVar) {
        a(c(cls), kotlin.reflect.jvm.internal.impl.name.b.j(dVar.g()));
    }

    public static kotlin.reflect.jvm.internal.impl.name.b c(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        return declaringClass == null ? kotlin.reflect.jvm.internal.impl.name.b.j(new kotlin.reflect.jvm.internal.impl.name.c(cls.getCanonicalName())) : c(declaringClass).d(kotlin.reflect.jvm.internal.impl.name.f.e(cls.getSimpleName()));
    }

    public static boolean d(kotlin.reflect.jvm.internal.impl.name.d dVar, String str) {
        Integer numY0;
        String str2 = dVar.f409248a;
        if (str2 != null) {
            String strM0 = C43066x.m0(str2, str, "");
            return strM0.length() > 0 && !C43066x.j0(strM0, '0') && (numY0 = C43066x.y0(strM0)) != null && numY0.intValue() >= 23;
        }
        kotlin.reflect.jvm.internal.impl.name.d.a(4);
        throw null;
    }

    @Y61.l
    public static kotlin.reflect.jvm.internal.impl.name.b e(@Y61.k kotlin.reflect.jvm.internal.impl.name.d dVar) {
        boolean zD2 = d(dVar, f407239b);
        kotlin.reflect.jvm.internal.impl.name.b bVar = f407243f;
        if (zD2 || d(dVar, f407241d)) {
            return bVar;
        }
        boolean zD3 = d(dVar, f407240c);
        kotlin.reflect.jvm.internal.impl.name.b bVar2 = f407245h;
        return (zD3 || d(dVar, f407242e)) ? bVar2 : f407247j.get(dVar);
    }
}
