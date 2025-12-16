package shark.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.sequences.InterfaceC43030m;
import shark.AbstractC48345t2;
import shark.C48240c2;
import shark.K1;
import shark.L1;
import shark.M1;
import shark.internal.C48298v;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ApacheHarmonyInstanceRefReaders.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lshark/internal/ApacheHarmonyInstanceRefReaders;", "", "Lshark/internal/v$a$a;", "shark"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public abstract class ApacheHarmonyInstanceRefReaders implements C48298v.a.InterfaceC12634a {

    /* renamed from: b, reason: collision with root package name */
    public static final ApacheHarmonyInstanceRefReaders f438308b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ApacheHarmonyInstanceRefReaders[] f438309c;

    /* JADX INFO: Fake field, exist only in values array */
    ApacheHarmonyInstanceRefReaders EF5;

    /* compiled from: ApacheHarmonyInstanceRefReaders.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/internal/ApacheHarmonyInstanceRefReaders$a;", "Lshark/internal/ApacheHarmonyInstanceRefReaders;", "shark"}, k = 1, mv = {1, 4, 1})
    public static final class a extends ApacheHarmonyInstanceRefReaders {
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
                if (bVarC.j((AbstractC48345t2.b.c.a.C12636a) it.next()).equals("array")) {
                    return new C48266a0("java.util.ArrayList", bVarC.f438147e, "array", "size");
                }
            }
            return null;
        }
    }

    /* compiled from: ApacheHarmonyInstanceRefReaders.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/internal/ApacheHarmonyInstanceRefReaders$b;", "Lshark/internal/ApacheHarmonyInstanceRefReaders;", "shark"}, k = 1, mv = {1, 4, 1})
    public static final class b extends ApacheHarmonyInstanceRefReaders {
        public b() {
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
                if (bVarC.j((AbstractC48345t2.b.c.a.C12636a) it.next()).equals("elements")) {
                    return new C48266a0("java.util.concurrent.CopyOnWriteArrayList", bVarC.f438147e, "elements", null);
                }
            }
            return null;
        }
    }

    /* compiled from: ApacheHarmonyInstanceRefReaders.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/internal/ApacheHarmonyInstanceRefReaders$c;", "Lshark/internal/ApacheHarmonyInstanceRefReaders;", "shark"}, k = 1, mv = {1, 4, 1})
    public static final class c extends ApacheHarmonyInstanceRefReaders {

        /* compiled from: ApacheHarmonyInstanceRefReaders.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lshark/M1$c;", "it", "", "invoke", "(Lshark/M1$c;)Z", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends kotlin.jvm.internal.N implements Y41.l<M1.c, Boolean> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ long f438310l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ long f438311m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j12, long j13) {
                super(1);
                this.f438310l = j12;
                this.f438311m = j13;
            }

            @Override // Y41.l
            public final Boolean invoke(M1.c cVar) {
                long j12 = cVar.f438150d.f438474b;
                return Boolean.valueOf(j12 == this.f438310l || j12 == this.f438311m);
            }
        }

        /* compiled from: ApacheHarmonyInstanceRefReaders.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lshark/M1$c;", "it", "", "invoke", "(Lshark/M1$c;)J", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class b extends kotlin.jvm.internal.N implements Y41.l<M1.c, Long> {

            /* renamed from: l, reason: collision with root package name */
            public static final b f438312l = new b();

            public b() {
                super(1);
            }

            @Override // Y41.l
            public final Long invoke(M1.c cVar) {
                return Long.valueOf(cVar.f438150d.f438474b);
            }
        }

        public c() {
            throw null;
        }

        @Override // shark.internal.C48298v.a.InterfaceC12634a
        @Y61.l
        public final C48298v.a a(@Y61.k L1 l12) {
            C48240c2 c48240c2 = (C48240c2) l12;
            M1.b bVarC = c48240c2.c("java.util.HashMap");
            if (bVarC == null) {
                return null;
            }
            List<AbstractC48345t2.b.c.a.C12636a> listK = bVarC.k();
            if (!(listK instanceof Collection) || !listK.isEmpty()) {
                Iterator<T> it = listK.iterator();
                while (it.hasNext()) {
                    if (bVarC.j((AbstractC48345t2.b.c.a.C12636a) it.next()).equals("loadFactor")) {
                        return null;
                    }
                }
            }
            M1.b bVarC2 = c48240c2.c("java.util.LinkedHashMap");
            return new C48268b0("java.util.HashMap", "java.util.HashMap$HashMapEntry", "value", "key()", false, new a(bVarC.f438147e, bVarC2 != null ? bVarC2.f438147e : 0L), b.f438312l);
        }
    }

    /* compiled from: ApacheHarmonyInstanceRefReaders.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/internal/ApacheHarmonyInstanceRefReaders$d;", "Lshark/internal/ApacheHarmonyInstanceRefReaders;", "shark"}, k = 1, mv = {1, 4, 1})
    public static final class d extends ApacheHarmonyInstanceRefReaders {

        /* compiled from: ApacheHarmonyInstanceRefReaders.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"shark/internal/ApacheHarmonyInstanceRefReaders$d$a", "Lshark/internal/v$a;", "shark"}, k = 1, mv = {1, 4, 1})
        public static final class a implements C48298v.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ long f438313a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f438314b;

            public a(long j12, long j13) {
                this.f438313a = j12;
                this.f438314b = j13;
            }

            @Override // shark.internal.C48298v.a
            public final boolean a(@Y61.k M1.c cVar) {
                long j12 = cVar.f438150d.f438474b;
                return j12 == this.f438313a || j12 == this.f438314b;
            }

            @Override // shark.internal.E0
            public final InterfaceC43030m b(M1 m12) {
                M1.c cVar = (M1.c) m12;
                K1 k1J = cVar.j("java.util.HashSet", "backingMap");
                if (k1J == null) {
                    kotlin.jvm.internal.L.k();
                    throw null;
                }
                M1.c cVarA = k1J.a();
                if (cVarA != null) {
                    return new C48268b0("java.util.HashMap", "java.util.HashMap$HashMapEntry", "value", "element()", true, C48294q.f438583l, new r(cVar)).b(cVarA);
                }
                kotlin.jvm.internal.L.k();
                throw null;
            }
        }

        public d() {
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
                        if (bVarC.j((AbstractC48345t2.b.c.a.C12636a) it.next()).equals("backingMap")) {
                            M1.b bVarC2 = c48240c2.c("java.util.LinkedHashSet");
                            return new a(bVarC.f438147e, bVarC2 != null ? bVarC2.f438147e : 0L);
                        }
                    }
                }
            }
            return null;
        }
    }

    /* compiled from: ApacheHarmonyInstanceRefReaders.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/internal/ApacheHarmonyInstanceRefReaders$e;", "Lshark/internal/ApacheHarmonyInstanceRefReaders;", "shark"}, k = 1, mv = {1, 4, 1})
    public static final class e extends ApacheHarmonyInstanceRefReaders {
        public e() {
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
                if (bVarC.j((AbstractC48345t2.b.c.a.C12636a) it.next()).equals("voidLink")) {
                    return new C48282i0(bVarC.f438147e, "voidLink", "java.util.LinkedList$Link", "data");
                }
            }
            return null;
        }
    }

    static {
        e eVar = new e("LINKED_LIST", 0, null);
        a aVar = new a("ARRAY_LIST", 1, null);
        f438308b = aVar;
        f438309c = new ApacheHarmonyInstanceRefReaders[]{eVar, aVar, new b("COPY_ON_WRITE_ARRAY_LIST", 2, null), new c("HASH_MAP", 3, null), new d("HASH_SET", 4, null)};
    }

    public ApacheHarmonyInstanceRefReaders() {
        throw null;
    }

    public ApacheHarmonyInstanceRefReaders(String str, int i12, C42822w c42822w) {
    }

    public static ApacheHarmonyInstanceRefReaders valueOf(String str) {
        return (ApacheHarmonyInstanceRefReaders) Enum.valueOf(ApacheHarmonyInstanceRefReaders.class, str);
    }

    public static ApacheHarmonyInstanceRefReaders[] values() {
        return (ApacheHarmonyInstanceRefReaders[]) f438309c.clone();
    }
}
