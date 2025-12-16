package shark.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.sequences.C43033p;
import kotlin.sequences.InterfaceC43030m;
import shark.AbstractC48345t2;
import shark.C48240c2;
import shark.K1;
import shark.L1;
import shark.M1;
import shark.internal.C48298v;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OpenJdkInstanceRefReaders.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lshark/internal/OpenJdkInstanceRefReaders;", "", "Lshark/internal/v$a$a;", "shark"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public abstract class OpenJdkInstanceRefReaders implements C48298v.a.InterfaceC12634a {

    /* renamed from: b, reason: collision with root package name */
    public static final OpenJdkInstanceRefReaders f438405b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ OpenJdkInstanceRefReaders[] f438406c;

    /* JADX INFO: Fake field, exist only in values array */
    OpenJdkInstanceRefReaders EF6;

    /* compiled from: OpenJdkInstanceRefReaders.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/internal/OpenJdkInstanceRefReaders$a;", "Lshark/internal/OpenJdkInstanceRefReaders;", "shark"}, k = 1, mv = {1, 4, 1})
    public static final class a extends OpenJdkInstanceRefReaders {
        public a() {
            throw null;
        }

        @Override // shark.internal.C48298v.a.InterfaceC12634a
        @Y61.l
        public final C48298v.a a(@Y61.k L1 l12) {
            M1.b bVarC = l12.c("java.util.ArrayList");
            if (bVarC == null) {
                return null;
            }
            List<AbstractC48345t2.b.c.a.C12636a> listK = bVarC.k();
            if ((listK instanceof Collection) && listK.isEmpty()) {
                return null;
            }
            Iterator<T> it = listK.iterator();
            while (it.hasNext()) {
                if (bVarC.j((AbstractC48345t2.b.c.a.C12636a) it.next()).equals("elementData")) {
                    return new C48266a0("java.util.ArrayList", bVarC.f438147e, "elementData", "size");
                }
            }
            return null;
        }
    }

    /* compiled from: OpenJdkInstanceRefReaders.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/internal/OpenJdkInstanceRefReaders$b;", "Lshark/internal/OpenJdkInstanceRefReaders;", "shark"}, k = 1, mv = {1, 4, 1})
    public static final class b extends OpenJdkInstanceRefReaders {

        /* compiled from: OpenJdkInstanceRefReaders.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lshark/M1$c;", "it", "", "invoke", "(Lshark/M1$c;)Z", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends kotlin.jvm.internal.N implements Y41.l<M1.c, Boolean> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ long f438407l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j12) {
                super(1);
                this.f438407l = j12;
            }

            @Override // Y41.l
            public final Boolean invoke(M1.c cVar) {
                return Boolean.valueOf(cVar.f438150d.f438474b == this.f438407l);
            }
        }

        /* compiled from: OpenJdkInstanceRefReaders.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lshark/M1$c;", "it", "", "invoke", "(Lshark/M1$c;)J", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        /* renamed from: shark.internal.OpenJdkInstanceRefReaders$b$b, reason: collision with other inner class name */
        public static final class C12632b extends kotlin.jvm.internal.N implements Y41.l<M1.c, Long> {

            /* renamed from: l, reason: collision with root package name */
            public static final C12632b f438408l = new C12632b();

            public C12632b() {
                super(1);
            }

            @Override // Y41.l
            public final Long invoke(M1.c cVar) {
                return Long.valueOf(cVar.f438150d.f438474b);
            }
        }

        public b() {
            throw null;
        }

        @Override // shark.internal.C48298v.a.InterfaceC12634a
        @Y61.l
        public final C48298v.a a(@Y61.k L1 l12) {
            M1.b bVarC = ((C48240c2) l12).c("java.util.concurrent.ConcurrentHashMap");
            if (bVarC == null) {
                return null;
            }
            List<AbstractC48345t2.b.c.a.C12636a> listK = bVarC.k();
            if ((listK instanceof Collection) && listK.isEmpty()) {
                return null;
            }
            Iterator<T> it = listK.iterator();
            while (it.hasNext()) {
                if (bVarC.j((AbstractC48345t2.b.c.a.C12636a) it.next()).equals("table")) {
                    return new C48268b0("java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentHashMap$Node", "val", "key()", false, new a(bVarC.f438147e), C12632b.f438408l);
                }
            }
            return null;
        }
    }

    /* compiled from: OpenJdkInstanceRefReaders.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/internal/OpenJdkInstanceRefReaders$c;", "Lshark/internal/OpenJdkInstanceRefReaders;", "shark"}, k = 1, mv = {1, 4, 1})
    public static final class c extends OpenJdkInstanceRefReaders {
        public c() {
            throw null;
        }

        @Override // shark.internal.C48298v.a.InterfaceC12634a
        @Y61.l
        public final C48298v.a a(@Y61.k L1 l12) {
            M1.b bVarC = ((C48240c2) l12).c("java.util.concurrent.CopyOnWriteArrayList");
            if (bVarC == null) {
                return null;
            }
            List<AbstractC48345t2.b.c.a.C12636a> listK = bVarC.k();
            if ((listK instanceof Collection) && listK.isEmpty()) {
                return null;
            }
            Iterator<T> it = listK.iterator();
            while (it.hasNext()) {
                if (bVarC.j((AbstractC48345t2.b.c.a.C12636a) it.next()).equals("array")) {
                    return new C48266a0("java.util.concurrent.CopyOnWriteArrayList", bVarC.f438147e, "array", null);
                }
            }
            return null;
        }
    }

    /* compiled from: OpenJdkInstanceRefReaders.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/internal/OpenJdkInstanceRefReaders$d;", "Lshark/internal/OpenJdkInstanceRefReaders;", "shark"}, k = 1, mv = {1, 4, 1})
    public static final class d extends OpenJdkInstanceRefReaders {

        /* compiled from: OpenJdkInstanceRefReaders.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lshark/M1$c;", "it", "", "invoke", "(Lshark/M1$c;)Z", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends kotlin.jvm.internal.N implements Y41.l<M1.c, Boolean> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ long f438409l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ long f438410m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j12, long j13) {
                super(1);
                this.f438409l = j12;
                this.f438410m = j13;
            }

            @Override // Y41.l
            public final Boolean invoke(M1.c cVar) {
                long j12 = cVar.f438150d.f438474b;
                return Boolean.valueOf(j12 == this.f438409l || j12 == this.f438410m);
            }
        }

        /* compiled from: OpenJdkInstanceRefReaders.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lshark/M1$c;", "it", "", "invoke", "(Lshark/M1$c;)J", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class b extends kotlin.jvm.internal.N implements Y41.l<M1.c, Long> {

            /* renamed from: l, reason: collision with root package name */
            public static final b f438411l = new b();

            public b() {
                super(1);
            }

            @Override // Y41.l
            public final Long invoke(M1.c cVar) {
                return Long.valueOf(cVar.f438150d.f438474b);
            }
        }

        public d() {
            throw null;
        }

        @Override // shark.internal.C48298v.a.InterfaceC12634a
        @Y61.l
        public final C48298v.a a(@Y61.k L1 l12) {
            C48240c2 c48240c2 = (C48240c2) l12;
            M1.b bVarC = c48240c2.c("java.util.HashMap");
            if (bVarC != null) {
                List<AbstractC48345t2.b.c.a.C12636a> listK = bVarC.k();
                if (!(listK instanceof Collection) || !listK.isEmpty()) {
                    Iterator<T> it = listK.iterator();
                    while (it.hasNext()) {
                        if (bVarC.j((AbstractC48345t2.b.c.a.C12636a) it.next()).equals("loadFactor")) {
                            M1.b bVarC2 = c48240c2.c("java.util.LinkedHashMap");
                            String str = "java.util.HashMap$Entry";
                            if (c48240c2.c("java.util.HashMap$Entry") == null) {
                                str = "java.util.HashMap$HashMapEntry";
                                if (c48240c2.c("java.util.HashMap$HashMapEntry") == null) {
                                    str = "java.util.HashMap$Node";
                                }
                            }
                            return new C48268b0("java.util.HashMap", str, "value", "key()", false, new a(bVarC.f438147e, bVarC2 != null ? bVarC2.f438147e : 0L), b.f438411l);
                        }
                    }
                }
            }
            return null;
        }
    }

    /* compiled from: OpenJdkInstanceRefReaders.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/internal/OpenJdkInstanceRefReaders$e;", "Lshark/internal/OpenJdkInstanceRefReaders;", "shark"}, k = 1, mv = {1, 4, 1})
    public static final class e extends OpenJdkInstanceRefReaders {

        /* compiled from: OpenJdkInstanceRefReaders.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"shark/internal/OpenJdkInstanceRefReaders$e$a", "Lshark/internal/v$a;", "shark"}, k = 1, mv = {1, 4, 1})
        public static final class a implements C48298v.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ long f438412a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f438413b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f438414c;

            public a(long j12, long j13, String str) {
                this.f438412a = j12;
                this.f438413b = j13;
                this.f438414c = str;
            }

            @Override // shark.internal.C48298v.a
            public final boolean a(@Y61.k M1.c cVar) {
                long j12 = cVar.f438150d.f438474b;
                return j12 == this.f438412a || j12 == this.f438413b;
            }

            @Override // shark.internal.E0
            public final InterfaceC43030m b(M1 m12) {
                M1.c cVar = (M1.c) m12;
                K1 k1J = cVar.j("java.util.HashSet", "map");
                if (k1J == null) {
                    kotlin.jvm.internal.L.k();
                    throw null;
                }
                M1.c cVarA = k1J.a();
                if (cVarA == null) {
                    return C43033p.h();
                }
                return new C48268b0("java.util.HashMap", this.f438414c, "value", "element()", true, z0.f438633l, new A0(cVar)).b(cVarA);
            }
        }

        public e() {
            throw null;
        }

        @Override // shark.internal.C48298v.a.InterfaceC12634a
        @Y61.l
        public final C48298v.a a(@Y61.k L1 l12) {
            C48240c2 c48240c2 = (C48240c2) l12;
            M1.b bVarC = c48240c2.c("java.util.HashSet");
            if (bVarC != null) {
                List<AbstractC48345t2.b.c.a.C12636a> listK = bVarC.k();
                if (!(listK instanceof Collection) || !listK.isEmpty()) {
                    Iterator<T> it = listK.iterator();
                    while (it.hasNext()) {
                        if (bVarC.j((AbstractC48345t2.b.c.a.C12636a) it.next()).equals("map")) {
                            M1.b bVarC2 = c48240c2.c("java.util.LinkedHashSet");
                            String str = "java.util.HashMap$Entry";
                            if (c48240c2.c("java.util.HashMap$Entry") == null) {
                                str = "java.util.HashMap$HashMapEntry";
                                if (c48240c2.c("java.util.HashMap$HashMapEntry") == null) {
                                    str = "java.util.HashMap$Node";
                                }
                            }
                            return new a(bVarC.f438147e, bVarC2 != null ? bVarC2.f438147e : 0L, str);
                        }
                    }
                }
            }
            return null;
        }
    }

    /* compiled from: OpenJdkInstanceRefReaders.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/internal/OpenJdkInstanceRefReaders$f;", "Lshark/internal/OpenJdkInstanceRefReaders;", "shark"}, k = 1, mv = {1, 4, 1})
    public static final class f extends OpenJdkInstanceRefReaders {
        public f() {
            throw null;
        }

        @Override // shark.internal.C48298v.a.InterfaceC12634a
        @Y61.l
        public final C48298v.a a(@Y61.k L1 l12) {
            M1.b bVarC = ((C48240c2) l12).c("java.util.LinkedList");
            if (bVarC == null) {
                return null;
            }
            List<AbstractC48345t2.b.c.a.C12636a> listK = bVarC.k();
            if ((listK instanceof Collection) && listK.isEmpty()) {
                return null;
            }
            Iterator<T> it = listK.iterator();
            while (it.hasNext()) {
                if (bVarC.j((AbstractC48345t2.b.c.a.C12636a) it.next()).equals("first")) {
                    return new C48282i0(bVarC.f438147e, "first", "java.util.LinkedList$Node", "item");
                }
            }
            return null;
        }
    }

    static {
        f fVar = new f("LINKED_LIST", 0, null);
        a aVar = new a("ARRAY_LIST", 1, null);
        f438405b = aVar;
        f438406c = new OpenJdkInstanceRefReaders[]{fVar, aVar, new c("COPY_ON_WRITE_ARRAY_LIST", 2, null), new d("HASH_MAP", 3, null), new b("CONCURRENT_HASH_MAP", 4, null), new e("HASH_SET", 5, null)};
    }

    public OpenJdkInstanceRefReaders() {
        throw null;
    }

    public OpenJdkInstanceRefReaders(String str, int i12, C42822w c42822w) {
    }

    public static OpenJdkInstanceRefReaders valueOf(String str) {
        return (OpenJdkInstanceRefReaders) Enum.valueOf(OpenJdkInstanceRefReaders.class, str);
    }

    public static OpenJdkInstanceRefReaders[] values() {
        return (OpenJdkInstanceRefReaders[]) f438406c.clone();
    }
}
