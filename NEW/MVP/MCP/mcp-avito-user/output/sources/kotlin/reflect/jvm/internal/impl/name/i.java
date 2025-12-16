package kotlin.reflect.jvm.internal.impl.name;

import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.P0;
import kotlin.collections.b1;
import kotlin.jvm.internal.s0;

/* compiled from: StandardClassIds.kt */
@s0
/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final i f409264a = new i();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final c f409265b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final c f409266c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final c f409267d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final c f409268e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final c f409269f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final c f409270g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final c f409271h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final Set<c> f409272i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final b f409273j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final b f409274k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public static final b f409275l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final b f409276m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public static final b f409277n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public static final b f409278o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public static final b f409279p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public static final Set<b> f409280q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public static final Set<b> f409281r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public static final b f409282s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public static final b f409283t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public static final b f409284u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public static final b f409285v;

    static {
        c cVar = new c("kotlin");
        f409265b = cVar;
        c cVarC = cVar.c(f.e("reflect"));
        f409266c = cVarC;
        c cVarC2 = cVar.c(f.e("collections"));
        f409267d = cVarC2;
        c cVarC3 = cVar.c(f.e("ranges"));
        f409268e = cVarC3;
        cVar.c(f.e("jvm")).c(f.e("internal"));
        c cVarC4 = cVar.c(f.e("annotation"));
        f409269f = cVarC4;
        c cVarC5 = cVar.c(f.e("internal"));
        cVarC5.c(f.e("ir"));
        c cVarC6 = cVar.c(f.e("coroutines"));
        f409270g = cVarC6;
        f409271h = cVar.c(f.e("enums"));
        cVar.c(f.e("contracts"));
        cVar.c(f.e("concurrent"));
        cVar.c(f.e("test"));
        f409272i = C42756l.l0(new c[]{cVar, cVarC2, cVarC3, cVarC4, cVarC, cVarC5, cVarC6});
        j.a("Nothing");
        j.a("Unit");
        j.a("Any");
        j.a("Enum");
        j.a("Annotation");
        f409273j = j.a("Array");
        b bVarA = j.a("Boolean");
        b bVarA2 = j.a("Char");
        b bVarA3 = j.a("Byte");
        b bVarA4 = j.a("Short");
        b bVarA5 = j.a("Int");
        b bVarA6 = j.a("Long");
        b bVarA7 = j.a("Float");
        b bVarA8 = j.a("Double");
        f409274k = j.f(bVarA3);
        f409275l = j.f(bVarA4);
        f409276m = j.f(bVarA5);
        f409277n = j.f(bVarA6);
        j.a("CharSequence");
        f409278o = j.a("String");
        j.a("Throwable");
        j.a("Cloneable");
        j.e("KProperty");
        j.e("KMutableProperty");
        j.e("KProperty0");
        j.e("KMutableProperty0");
        j.e("KProperty1");
        j.e("KMutableProperty1");
        j.e("KProperty2");
        j.e("KMutableProperty2");
        f409279p = j.e("KFunction");
        j.e("KClass");
        j.e("KCallable");
        j.e("KType");
        j.a("Comparable");
        j.a("Number");
        j.a("Function");
        Set<b> setL0 = C42756l.l0(new b[]{bVarA, bVarA2, bVarA3, bVarA4, bVarA5, bVarA6, bVarA7, bVarA8});
        f409280q = setL0;
        Set<b> set = setL0;
        int iF2 = P0.f(C42745f0.q(set, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        for (Object obj : set) {
            linkedHashMap.put(obj, j.d(((b) obj).i()));
        }
        j.c(linkedHashMap);
        Set<b> setL02 = C42756l.l0(new b[]{f409274k, f409275l, f409276m, f409277n});
        f409281r = setL02;
        Set<b> set2 = setL02;
        int iF3 = P0.f(C42745f0.q(set2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iF3 >= 16 ? iF3 : 16);
        for (Object obj2 : set2) {
            linkedHashMap2.put(obj2, j.d(((b) obj2).i()));
        }
        j.c(linkedHashMap2);
        b1.i(b1.h(f409280q, f409281r), f409278o);
        f409264a.getClass();
        new b(f409270g, f.e("Continuation"));
        j.b("Iterator");
        j.b("Iterable");
        j.b("Collection");
        j.b("List");
        j.b("ListIterator");
        j.b("Set");
        b bVarB = j.b("Map");
        j.b("MutableIterator");
        j.b("CharIterator");
        j.b("MutableIterable");
        j.b("MutableCollection");
        f409282s = j.b("MutableList");
        j.b("MutableListIterator");
        f409283t = j.b("MutableSet");
        b bVarB2 = j.b("MutableMap");
        f409284u = bVarB2;
        bVarB.d(f.e("Entry"));
        bVarB2.d(f.e("MutableEntry"));
        j.a("Result");
        c cVar2 = f409268e;
        new b(cVar2, f.e("IntRange"));
        new b(cVar2, f.e("LongRange"));
        new b(cVar2, f.e("CharRange"));
        c cVar3 = f409269f;
        new b(cVar3, f.e("AnnotationRetention"));
        new b(cVar3, f.e("AnnotationTarget"));
        j.a("DeprecationLevel");
        f409285v = new b(f409271h, f.e("EnumEntries"));
    }
}
