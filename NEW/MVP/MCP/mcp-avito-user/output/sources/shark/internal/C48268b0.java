package shark.internal;

import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.sequences.C43026i;
import kotlin.sequences.C43033p;
import kotlin.sequences.InterfaceC43030m;
import shark.K1;
import shark.M1;
import shark.X1;
import shark.internal.C48298v;

/* compiled from: InternalSharedExpanderHelpers.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/internal/b0;", "Lshark/internal/v$a;", "shark"}, k = 1, mv = {1, 4, 1})
/* renamed from: shark.internal.b0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48268b0 implements C48298v.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f438493a;

    /* renamed from: b, reason: collision with root package name */
    public final String f438494b;

    /* renamed from: c, reason: collision with root package name */
    public final String f438495c;

    /* renamed from: d, reason: collision with root package name */
    public final String f438496d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f438497e;

    /* renamed from: f, reason: collision with root package name */
    public final kotlin.jvm.internal.N f438498f;

    /* renamed from: g, reason: collision with root package name */
    public final kotlin.jvm.internal.N f438499g;

    /* compiled from: InternalSharedExpanderHelpers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lshark/M1$c;", "entry", "Lshark/internal/C0;", "invoke", "(Lshark/M1$c;)Lshark/internal/C0;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* renamed from: shark.internal.b0$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<M1.c, C0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l f438501m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.l lVar) {
            super(1);
            this.f438501m = lVar;
        }

        @Override // Y41.l
        public final C0 invoke(M1.c cVar) {
            K1 k1J = cVar.j(C48268b0.this.f438494b, "key");
            if (k1J == null) {
                kotlin.jvm.internal.L.k();
                throw null;
            }
            return (C0) ((c) this.f438501m).invoke(k1J.f438095c);
        }
    }

    /* compiled from: InternalSharedExpanderHelpers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lshark/M1$c;", "entry", "Lkotlin/sequences/m;", "Lshark/internal/C0;", "invoke", "(Lshark/M1$c;)Lkotlin/sequences/m;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* renamed from: shark.internal.b0$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<M1.c, InterfaceC43030m<? extends C0>> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l f438503m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ long f438504n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.l lVar, long j12) {
            super(1);
            this.f438503m = lVar;
            this.f438504n = j12;
        }

        @Override // Y41.l
        public final InterfaceC43030m<? extends C0> invoke(M1.c cVar) {
            M1.c cVar2 = cVar;
            C48268b0 c48268b0 = C48268b0.this;
            K1 k1J = cVar2.j(c48268b0.f438494b, "key");
            C0 c02 = null;
            if (k1J == null) {
                kotlin.jvm.internal.L.k();
                throw null;
            }
            Y41.l lVar = this.f438503m;
            X1 x12 = k1J.f438095c;
            C0 c03 = (C0) ((c) lVar).invoke(x12);
            K1 k1J2 = cVar2.j(c48268b0.f438494b, c48268b0.f438495c);
            if (k1J2 == null) {
                kotlin.jvm.internal.L.k();
                throw null;
            }
            X1 x13 = k1J2.f438095c;
            if (x13.g()) {
                Long lF2 = x13.f();
                if (lF2 == null) {
                    kotlin.jvm.internal.L.k();
                    throw null;
                }
                c02 = new C0(lF2.longValue(), false, new C48270c0(this, x12));
            }
            return (c03 == null || c02 == null) ? c03 != null ? C42756l.f(new C0[]{c03}) : c02 != null ? C42756l.f(new C0[]{c02}) : C43033p.h() : C42756l.f(new C0[]{c03, c02});
        }
    }

    /* compiled from: InternalSharedExpanderHelpers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lshark/X1;", "key", "Lshark/internal/C0;", "invoke", "(Lshark/X1;)Lshark/internal/C0;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* renamed from: shark.internal.b0$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<X1, C0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ long f438506m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j12) {
            super(1);
            this.f438506m = j12;
        }

        @Override // Y41.l
        public final C0 invoke(X1 x12) {
            X1 x13 = x12;
            if (!x13.g()) {
                return null;
            }
            Long lF2 = x13.f();
            if (lF2 != null) {
                return new C0(lF2.longValue(), false, new C48272d0(this));
            }
            kotlin.jvm.internal.L.k();
            throw null;
        }
    }

    /* compiled from: InternalSharedExpanderHelpers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lshark/X1;", "entryRef", "Lkotlin/sequences/m;", "Lshark/M1$c;", "invoke", "(Lshark/X1;)Lkotlin/sequences/m;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* renamed from: shark.internal.b0$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<X1, InterfaceC43030m<? extends M1.c>> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final InterfaceC43030m<? extends M1.c> invoke(X1 x12) {
            X1 x13 = x12;
            if (!x13.g()) {
                return null;
            }
            M1 m1E = x13.e();
            if (m1E == null) {
                kotlin.jvm.internal.L.k();
                throw null;
            }
            M1.c cVarA = m1E.a();
            if (cVarA != null) {
                return C43033p.u(new C48274e0(this), cVarA);
            }
            kotlin.jvm.internal.L.k();
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C48268b0(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, boolean z12, @Y61.k Y41.l lVar, @Y61.k Y41.l lVar2) {
        this.f438493a = str;
        this.f438494b = str2;
        this.f438495c = str3;
        this.f438496d = str4;
        this.f438497e = z12;
        this.f438498f = (kotlin.jvm.internal.N) lVar;
        this.f438499g = (kotlin.jvm.internal.N) lVar2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // shark.internal.C48298v.a
    public final boolean a(@Y61.k M1.c cVar) {
        return ((Boolean) this.f438498f.invoke(cVar)).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // shark.internal.E0
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43030m<C0> b(@Y61.k M1.c cVar) {
        K1 k1J = cVar.j(this.f438493a, "table");
        if (k1J == null) {
            kotlin.jvm.internal.L.k();
            throw null;
        }
        M1.d dVarB = k1J.b();
        if (dVarB == null) {
            return C43033p.h();
        }
        C43026i c43026iQ = C43033p.q(C43033p.y(dVarB.f(), new d()));
        long jLongValue = ((Number) this.f438499g.invoke(cVar)).longValue();
        c cVar2 = new c(jLongValue);
        return this.f438497e ? C43033p.y(c43026iQ, new a(cVar2)) : C43033p.o(c43026iQ, new b(cVar2, jLongValue));
    }
}
