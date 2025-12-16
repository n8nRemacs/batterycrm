package shark;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.InterfaceC42819t;
import kotlin.text.C43059p;
import shark.C48356w1;
import shark.M1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ObjectInspectors.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lshark/ObjectInspectors;", "", "Lshark/R2;", "d", "shark"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public abstract class ObjectInspectors implements R2 {

    /* renamed from: b, reason: collision with root package name */
    public static final ObjectInspectors f438172b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ObjectInspectors[] f438173c;

    /* renamed from: d, reason: collision with root package name */
    public static final C43059p f438174d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final ArrayList f438175e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final d f438176f;

    /* compiled from: ObjectInspectors.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/ObjectInspectors$a;", "Lshark/ObjectInspectors;", "shark"}, k = 1, mv = {1, 4, 1})
    public static final class a extends ObjectInspectors {
        public a() {
            throw null;
        }

        @Override // shark.R2
        public final void a(@Y61.k U2 u22) {
            M1 m12 = u22.f438218d;
            if (m12 instanceof M1.c) {
                M1.b bVarE = ((M1.c) m12).e();
                if (ObjectInspectors.f438174d.e(bVarE.g())) {
                    M1.b bVarI = bVarE.i();
                    if (bVarI == null) {
                        kotlin.jvm.internal.L.k();
                        throw null;
                    }
                    boolean zF2 = kotlin.jvm.internal.L.f(bVarI.g(), "java.lang.Object");
                    LinkedHashSet<String> linkedHashSet = u22.f438215a;
                    if (zF2) {
                        try {
                            Class<?>[] interfaces = Class.forName(bVarE.g()).getInterfaces();
                            linkedHashSet.add(!(interfaces.length == 0) ? "Anonymous class implementing ".concat(interfaces[0].getName()) : "Anonymous subclass of java.lang.Object");
                        } catch (ClassNotFoundException unused) {
                        }
                    } else {
                        linkedHashSet.add("Anonymous subclass of " + bVarI.g());
                    }
                }
            }
        }
    }

    /* compiled from: ObjectInspectors.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/ObjectInspectors$b;", "Lshark/ObjectInspectors;", "shark"}, k = 1, mv = {1, 4, 1})
    public static final class b extends ObjectInspectors {
        public b() {
            throw null;
        }

        @Override // shark.R2
        public final void a(@Y61.k U2 u22) {
            if (u22.f438218d instanceof M1.b) {
                u22.f438217c.add("a class is never leaking");
            }
        }
    }

    /* compiled from: ObjectInspectors.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/ObjectInspectors$c;", "Lshark/ObjectInspectors;", "shark"}, k = 1, mv = {1, 4, 1})
    public static final class c extends ObjectInspectors {

        /* compiled from: ObjectInspectors.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lshark/U2;", "Lshark/M1$c;", "it", "Lkotlin/G0;", "invoke", "(Lshark/U2;Lshark/M1$c;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends kotlin.jvm.internal.N implements Y41.p<U2, M1.c, kotlin.G0> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f438177l = new a();

            public a() {
                super(2);
            }

            @Override // Y41.p
            public final kotlin.G0 invoke(U2 u22, M1.c cVar) {
                u22.f438217c.add("A ClassLoader is never leaking");
                return kotlin.G0.f406611a;
            }
        }

        public c() {
            throw null;
        }

        @Override // shark.R2
        public final void a(@Y61.k U2 u22) {
            kotlin.reflect.d dVarB = kotlin.jvm.internal.m0.f406844a.b(ClassLoader.class);
            a aVar = a.f438177l;
            u22.getClass();
            u22.a(aVar, ((InterfaceC42819t) dVarB).f().getName());
        }
    }

    /* compiled from: ObjectInspectors.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lshark/ObjectInspectors$d;", "", "<init>", "()V", "", "ANONYMOUS_CLASS_NAME_PATTERN", "Ljava/lang/String;", "Lkotlin/text/p;", "ANONYMOUS_CLASS_NAME_PATTERN_REGEX", "Lkotlin/text/p;", "shark"}, k = 1, mv = {1, 4, 1})
    public static final class d {
        public d() {
        }

        public /* synthetic */ d(C42822w c42822w) {
            this();
        }
    }

    /* compiled from: ObjectInspectors.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/ObjectInspectors$f;", "Lshark/ObjectInspectors;", "shark"}, k = 1, mv = {1, 4, 1})
    public static final class f extends ObjectInspectors {

        /* compiled from: ObjectInspectors.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lshark/U2;", "Lshark/M1$c;", "instance", "Lkotlin/G0;", "invoke", "(Lshark/U2;Lshark/M1$c;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends kotlin.jvm.internal.N implements Y41.p<U2, M1.c, kotlin.G0> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f438179l = new a();

            public a() {
                super(2);
            }

            @Override // Y41.p
            public final kotlin.G0 invoke(U2 u22, M1.c cVar) {
                U2 u23 = u22;
                M1.c cVar2 = cVar;
                kotlin.reflect.d dVarB = kotlin.jvm.internal.m0.f406844a.b(Thread.class);
                cVar2.getClass();
                K1 k1J = cVar2.j(((InterfaceC42819t) dVarB).f().getName(), "name");
                if (k1J == null) {
                    kotlin.jvm.internal.L.k();
                    throw null;
                }
                String strI = k1J.f438095c.i();
                u23.f438215a.add("Thread name: '" + strI + '\'');
                return kotlin.G0.f406611a;
            }
        }

        public f() {
            throw null;
        }

        @Override // shark.R2
        public final void a(@Y61.k U2 u22) {
            kotlin.reflect.d dVarB = kotlin.jvm.internal.m0.f406844a.b(Thread.class);
            a aVar = a.f438179l;
            u22.getClass();
            u22.a(aVar, ((InterfaceC42819t) dVarB).f().getName());
        }
    }

    static {
        ObjectInspectors objectInspectors = new ObjectInspectors() { // from class: shark.ObjectInspectors.e

            /* renamed from: g, reason: collision with root package name */
            @Y61.k
            public final Y41.l<M1, Boolean> f438178g = T2.f438210l;

            @Override // shark.R2
            public final void a(@Y61.k U2 u22) {
                M1 m12 = u22.f438218d;
                C48240c2 f438155c = m12.getF438155c();
                C2.f438011a.getClass();
                List<shark.internal.r0> listB = C2.b(f438155c);
                long f438157e = m12.getF438157e();
                for (shark.internal.r0 r0Var : listB) {
                    if (r0Var.f438591c.f438688a == f438157e) {
                        LinkedHashSet linkedHashSet = u22.f438216b;
                        String str = r0Var.f438593e;
                        linkedHashSet.add(str.length() > 0 ? "ObjectWatcher was watching this because ".concat(str) : "ObjectWatcher was watching this");
                        LinkedHashSet<String> linkedHashSet2 = u22.f438215a;
                        linkedHashSet2.add("key = " + r0Var.f438592d);
                        Long l12 = r0Var.f438594f;
                        if (l12 != null) {
                            linkedHashSet2.add("watchDurationMillis = " + l12);
                        }
                        Long l13 = r0Var.f438595g;
                        if (l13 != null) {
                            linkedHashSet2.add("retainedDurationMillis = " + l13);
                        }
                    }
                }
            }

            @Override // shark.ObjectInspectors
            @Y61.k
            public final Y41.l<M1, Boolean> b() {
                return this.f438178g;
            }
        };
        f438172b = objectInspectors;
        f438173c = new ObjectInspectors[]{objectInspectors, new c("CLASSLOADER", 1, null), new b("CLASS", 2, null), new a("ANONYMOUS_CLASS", 3, null), new f("THREAD", 4, null)};
        f438176f = new d(null);
        f438174d = new C43059p("^.+\\$\\d+$");
        EnumSet enumSetAllOf = EnumSet.allOf(ObjectInspectors.class);
        ArrayList arrayList = new ArrayList();
        Iterator it = enumSetAllOf.iterator();
        while (it.hasNext()) {
            Y41.l<M1, Boolean> lVarB = ((ObjectInspectors) it.next()).b();
            if (lVarB != null) {
                arrayList.add(lVarB);
            }
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            final Y41.l lVar = (Y41.l) it2.next();
            arrayList2.add(new C48356w1.a() { // from class: shark.S2
                @Override // shark.C48356w1.a
                public final boolean a(@Y61.k M1 m12) {
                    return ((Boolean) lVar.invoke(m12)).booleanValue();
                }
            });
        }
        f438175e = arrayList2;
    }

    public ObjectInspectors() {
        throw null;
    }

    public ObjectInspectors(String str, int i12, C42822w c42822w) {
    }

    public static ObjectInspectors valueOf(String str) {
        return (ObjectInspectors) Enum.valueOf(ObjectInspectors.class, str);
    }

    public static ObjectInspectors[] values() {
        return (ObjectInspectors[]) f438173c.clone();
    }

    @Y61.l
    public Y41.l<M1, Boolean> b() {
        return null;
    }
}
