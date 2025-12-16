package shark.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.sequences.C43028k;
import kotlin.sequences.C43033p;
import kotlin.sequences.InterfaceC43030m;
import shark.A1;
import shark.AbstractC48345t2;
import shark.C48240c2;
import shark.K1;
import shark.L1;
import shark.M1;
import shark.internal.C48298v;
import shark.q3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AndroidReferenceReaders.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lshark/internal/AndroidReferenceReaders;", "", "Lshark/internal/v$a$a;", "d", "shark"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public abstract class AndroidReferenceReaders implements C48298v.a.InterfaceC12634a {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AndroidReferenceReaders[] f438298b = {new a("ACTIVITY_THREAD__NEW_ACTIVITIES", 0, null), new e("MESSAGE_QUEUE", 1, null), new b("ANIMATOR_WEAK_REF_SUCKS", 2, null), new f("SAFE_ITERABLE_MAP", 3, null), new c("ARRAY_SET", 4, null)};

    /* JADX INFO: Fake field, exist only in values array */
    AndroidReferenceReaders EF10;

    /* compiled from: AndroidReferenceReaders.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/internal/AndroidReferenceReaders$a;", "Lshark/internal/AndroidReferenceReaders;", "shark"}, k = 1, mv = {1, 4, 1})
    public static final class a extends AndroidReferenceReaders {

        /* compiled from: AndroidReferenceReaders.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"shark/internal/AndroidReferenceReaders$a$a", "Lshark/internal/v$a;", "shark"}, k = 1, mv = {1, 4, 1})
        /* renamed from: shark.internal.AndroidReferenceReaders$a$a, reason: collision with other inner class name */
        public static final class C12629a implements C48298v.a {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f438300b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f438301c;

            public C12629a(long j12, long j13) {
                this.f438300b = j12;
                this.f438301c = j13;
            }

            @Override // shark.internal.C48298v.a
            public final boolean a(@Y61.k M1.c cVar) {
                long j12 = cVar.f438150d.f438474b;
                return j12 == this.f438300b || j12 == this.f438301c;
            }

            @Override // shark.internal.E0
            public final InterfaceC43030m b(M1 m12) {
                M1.c cVar = (M1.c) m12;
                long j12 = cVar.f438150d.f438474b;
                long j13 = this.f438300b;
                a aVar = a.this;
                C48240c2 c48240c2 = cVar.f438149c;
                if (j12 != j13) {
                    A1 a12 = c48240c2.f438253b;
                    Long l12 = (Long) a12.f437944a.get(aVar.name());
                    if (l12 != null) {
                        if (cVar.f438151e == l12.longValue()) {
                            return C43033p.y(new C43028k(C43033p.u(C48269c.f438508l, cVar)), new C48273e(this));
                        }
                    }
                    return C43033p.h();
                }
                K1 k1J = cVar.j("android.app.ActivityThread", "mNewActivities");
                if (k1J == null) {
                    kotlin.jvm.internal.L.k();
                    throw null;
                }
                Long lF2 = k1J.f438095c.f();
                if (lF2 == null) {
                    kotlin.jvm.internal.L.k();
                    throw null;
                }
                long jLongValue = lF2.longValue();
                if (jLongValue == 0) {
                    return C43033p.h();
                }
                A1 a13 = c48240c2.f438253b;
                a13.f437944a.put(aVar.name(), lF2);
                return C42756l.f(new C0[]{new C0(jLongValue, false, new C48267b(this))});
            }
        }

        public a() {
            throw null;
        }

        @Override // shark.internal.C48298v.a.InterfaceC12634a
        @Y61.l
        public final C48298v.a a(@Y61.k L1 l12) {
            C48240c2 c48240c2 = (C48240c2) l12;
            M1.b bVarC = c48240c2.c("android.app.ActivityThread");
            if (bVarC == null) {
                return null;
            }
            List<AbstractC48345t2.b.c.a.C12636a> listK = bVarC.k();
            if ((listK instanceof Collection) && listK.isEmpty()) {
                return null;
            }
            Iterator<T> it = listK.iterator();
            while (it.hasNext()) {
                if (bVarC.j((AbstractC48345t2.b.c.a.C12636a) it.next()).equals("mNewActivities")) {
                    M1.b bVarC2 = c48240c2.c("android.app.ActivityThread$ActivityClientRecord");
                    if (bVarC2 == null) {
                        return null;
                    }
                    List<AbstractC48345t2.b.c.a.C12636a> listK2 = bVarC2.k();
                    ArrayList arrayList = new ArrayList(C42745f0.q(listK2, 10));
                    Iterator<T> it2 = listK2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(bVarC.j((AbstractC48345t2.b.c.a.C12636a) it2.next()));
                    }
                    List listM0 = C42745f0.M0(arrayList);
                    if (listM0.contains("nextIdle") && listM0.contains("activity")) {
                        return new C12629a(bVarC.f438147e, bVarC2.f438147e);
                    }
                    return null;
                }
            }
            return null;
        }
    }

    /* compiled from: AndroidReferenceReaders.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/internal/AndroidReferenceReaders$b;", "Lshark/internal/AndroidReferenceReaders;", "shark"}, k = 1, mv = {1, 4, 1})
    public static final class b extends AndroidReferenceReaders {

        /* compiled from: AndroidReferenceReaders.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"shark/internal/AndroidReferenceReaders$b$a", "Lshark/internal/v$a;", "shark"}, k = 1, mv = {1, 4, 1})
        public static final class a implements C48298v.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ long f438302a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f438303b;

            public a(long j12, long j13) {
                this.f438302a = j12;
                this.f438303b = j13;
            }

            @Override // shark.internal.C48298v.a
            public final boolean a(@Y61.k M1.c cVar) {
                return cVar.f438150d.f438474b == this.f438302a;
            }

            @Override // shark.internal.E0
            public final InterfaceC43030m b(M1 m12) {
                M1.c cVarA;
                K1 k1J = ((M1.c) m12).j("android.animation.ObjectAnimator", "mTarget");
                if (k1J == null || (cVarA = k1J.a()) == null) {
                    return C43033p.h();
                }
                if (cVarA.f438150d.f438474b != this.f438303b) {
                    return C43033p.h();
                }
                K1 k1J2 = cVarA.j("java.lang.ref.Reference", "referent");
                if (k1J2 != null) {
                    q3.i iVar = (q3.i) k1J2.f438095c.f438228b;
                    return iVar.a() ? C43033p.h() : C42756l.f(new C0[]{new C0(iVar.f438688a, true, new C48275f(this))});
                }
                kotlin.jvm.internal.L.k();
                throw null;
            }
        }

        public b() {
            throw null;
        }

        @Override // shark.internal.C48298v.a.InterfaceC12634a
        @Y61.l
        public final C48298v.a a(@Y61.k L1 l12) {
            M1.b bVarC;
            C48240c2 c48240c2 = (C48240c2) l12;
            M1.b bVarC2 = c48240c2.c("android.animation.ObjectAnimator");
            if (bVarC2 == null || (bVarC = c48240c2.c("java.lang.ref.WeakReference")) == null) {
                return null;
            }
            return new a(bVarC2.f438147e, bVarC.f438147e);
        }
    }

    /* compiled from: AndroidReferenceReaders.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/internal/AndroidReferenceReaders$c;", "Lshark/internal/AndroidReferenceReaders;", "shark"}, k = 1, mv = {1, 4, 1})
    public static final class c extends AndroidReferenceReaders {

        /* compiled from: AndroidReferenceReaders.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"shark/internal/AndroidReferenceReaders$c$a", "Lshark/internal/v$a;", "shark"}, k = 1, mv = {1, 4, 1})
        public static final class a implements C48298v.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ long f438304a;

            public a(long j12) {
                this.f438304a = j12;
            }

            @Override // shark.internal.C48298v.a
            public final boolean a(@Y61.k M1.c cVar) {
                return cVar.f438150d.f438474b == this.f438304a;
            }

            @Override // shark.internal.E0
            public final InterfaceC43030m b(M1 m12) {
                M1.c cVar = (M1.c) m12;
                K1 k1J = cVar.j("android.util.ArraySet", "mArray");
                if (k1J == null) {
                    kotlin.jvm.internal.L.k();
                    throw null;
                }
                M1.d dVarB = k1J.b();
                if (dVarB != null) {
                    return new kotlin.sequences.o0(C43033p.i(dVarB.f(), C48277g.f438519l), new C48281i(cVar.f438150d.f438474b));
                }
                kotlin.jvm.internal.L.k();
                throw null;
            }
        }

        public c() {
            throw null;
        }

        @Override // shark.internal.C48298v.a.InterfaceC12634a
        @Y61.l
        public final C48298v.a a(@Y61.k L1 l12) {
            M1.b bVarC = ((C48240c2) l12).c("android.util.ArraySet");
            if (bVarC != null) {
                return new a(bVarC.f438147e);
            }
            return null;
        }
    }

    /* compiled from: AndroidReferenceReaders.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lshark/internal/AndroidReferenceReaders$d;", "", "<init>", "()V", "", "ARRAY_SET_CLASS_NAME", "Ljava/lang/String;", "FAST_SAFE_ITERABLE_MAP_CLASS_NAME", "SAFE_ITERABLE_MAP_CLASS_NAME", "SAFE_ITERABLE_MAP_ENTRY_CLASS_NAME", "shark"}, k = 1, mv = {1, 4, 1})
    public static final class d {
        public d() {
        }

        public /* synthetic */ d(C42822w c42822w) {
            this();
        }
    }

    /* compiled from: AndroidReferenceReaders.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/internal/AndroidReferenceReaders$e;", "Lshark/internal/AndroidReferenceReaders;", "shark"}, k = 1, mv = {1, 4, 1})
    public static final class e extends AndroidReferenceReaders {

        /* compiled from: AndroidReferenceReaders.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"shark/internal/AndroidReferenceReaders$e$a", "Lshark/internal/v$a;", "shark"}, k = 1, mv = {1, 4, 1})
        public static final class a implements C48298v.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ long f438305a;

            public a(long j12) {
                this.f438305a = j12;
            }

            @Override // shark.internal.C48298v.a
            public final boolean a(@Y61.k M1.c cVar) {
                return cVar.f438150d.f438474b == this.f438305a;
            }

            @Override // shark.internal.E0
            public final InterfaceC43030m b(M1 m12) {
                K1 k1J = ((M1.c) m12).j("android.os.MessageQueue", "mMessages");
                if (k1J != null) {
                    return new kotlin.sequences.o0(new C43028k(C43033p.u(C48283j.f438565l, k1J.a())), new C48287l(this));
                }
                kotlin.jvm.internal.L.k();
                throw null;
            }
        }

        public e() {
            throw null;
        }

        @Override // shark.internal.C48298v.a.InterfaceC12634a
        @Y61.l
        public final C48298v.a a(@Y61.k L1 l12) {
            M1.b bVarC = ((C48240c2) l12).c("android.os.MessageQueue");
            if (bVarC != null) {
                return new a(bVarC.f438147e);
            }
            return null;
        }
    }

    /* compiled from: AndroidReferenceReaders.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/internal/AndroidReferenceReaders$f;", "Lshark/internal/AndroidReferenceReaders;", "shark"}, k = 1, mv = {1, 4, 1})
    public static final class f extends AndroidReferenceReaders {

        /* compiled from: AndroidReferenceReaders.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"shark/internal/AndroidReferenceReaders$f$a", "Lshark/internal/v$a;", "shark"}, k = 1, mv = {1, 4, 1})
        public static final class a implements C48298v.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ long f438306a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Long f438307b;

            public a(long j12, Long l12) {
                this.f438306a = j12;
                this.f438307b = l12;
            }

            @Override // shark.internal.C48298v.a
            public final boolean a(@Y61.k M1.c cVar) {
                Long l12;
                long j12 = cVar.f438150d.f438474b;
                return j12 == this.f438306a || ((l12 = this.f438307b) != null && j12 == l12.longValue());
            }

            @Override // shark.internal.E0
            public final InterfaceC43030m b(M1 m12) {
                M1.c cVar = (M1.c) m12;
                K1 k1J = cVar.j("androidx.arch.core.internal.SafeIterableMap", "mStart");
                if (k1J != null) {
                    return C43033p.o(C43033p.u(C48293p.f438581l, k1J.a()), new C48292o(cVar.f438150d.f438474b));
                }
                kotlin.jvm.internal.L.k();
                throw null;
            }
        }

        public f() {
            throw null;
        }

        @Override // shark.internal.C48298v.a.InterfaceC12634a
        @Y61.l
        public final C48298v.a a(@Y61.k L1 l12) {
            C48240c2 c48240c2 = (C48240c2) l12;
            M1.b bVarC = c48240c2.c("androidx.arch.core.internal.SafeIterableMap");
            if (bVarC == null) {
                return null;
            }
            M1.b bVarC2 = c48240c2.c("androidx.arch.core.internal.FastSafeIterableMap");
            return new a(bVarC.f438147e, bVarC2 != null ? Long.valueOf(bVarC2.f438147e) : null);
        }
    }

    static {
        new d(null);
    }

    public AndroidReferenceReaders() {
        throw null;
    }

    public AndroidReferenceReaders(String str, int i12, C42822w c42822w) {
    }

    public static AndroidReferenceReaders valueOf(String str) {
        return (AndroidReferenceReaders) Enum.valueOf(AndroidReferenceReaders.class, str);
    }

    public static AndroidReferenceReaders[] values() {
        return (AndroidReferenceReaders[]) f438298b.clone();
    }
}
