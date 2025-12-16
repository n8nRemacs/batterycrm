package QT0;

import Y61.k;
import java.time.ZoneId;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlinx.datetime.A;
import kotlinx.datetime.InterfaceC43316a;
import kotlinx.datetime.i;
import kotlinx.datetime.l;
import kotlinx.datetime.q;
import kotlinx.datetime.r;
import kotlinx.datetime.t;
import kotlinx.datetime.z;

/* compiled from: KotlinxDateCalculator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQT0/b;", "LRT0/c;", "<init>", "()V", "kotlinx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements RT0.c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final b f13719a = new b();

    public static int a(ST0.a aVar, ST0.a aVar2, i.b bVar) throws Exception {
        if (!(aVar instanceof ST0.f)) {
            if (aVar instanceof ST0.e) {
                f.f13722a.getClass();
                return r.b(f.a((ST0.e) aVar), f.a((ST0.e) aVar2), bVar);
            }
            throw new IllegalArgumentException("Unsupported type " + aVar.getF14992a());
        }
        g.f13723a.getClass();
        t tVarA = g.a((ST0.f) aVar);
        t tVarA2 = g.a((ST0.f) aVar2);
        q qVarA = tVarA2.a();
        q qVarA2 = tVarA.a();
        i.Companion companion = i.INSTANCE;
        companion.getClass();
        i.c cVar = i.f412489g;
        if (r.b(qVarA, qVarA2, cVar) < 0 && e.a(tVarA2.b(), tVarA.b(), i.f412483a) > 0) {
            qVarA = r.a(qVarA, -1, cVar);
        } else if (r.b(qVarA, tVarA.a(), cVar) > 0 && e.a(tVarA2.b(), tVarA.b(), i.f412483a) < 0) {
            companion.getClass();
            qVarA = r.a(qVarA, 1, cVar);
        }
        return r.b(tVarA.a(), qVarA, bVar);
    }

    public static ST0.a b(ST0.a aVar, int i12, i.b bVar) {
        if (aVar instanceof ST0.e) {
            f.f13722a.getClass();
            return new ST0.e(r.a(f.a((ST0.e) aVar), -i12, bVar).f412619b.toString());
        }
        if (!(aVar instanceof ST0.f)) {
            throw new IllegalArgumentException("Unsupported type " + aVar.getF14992a());
        }
        g.f13723a.getClass();
        t tVarA = g.a((ST0.f) aVar);
        return new ST0.f(new t(r.a(tVarA.a(), -i12, bVar), tVarA.b()).f412681b.toString());
    }

    public static ST0.a d(ST0.a aVar, int i12, i.b bVar) {
        if (aVar instanceof ST0.e) {
            f.f13722a.getClass();
            return new ST0.e(r.a(f.a((ST0.e) aVar), i12, bVar).f412619b.toString());
        }
        if (!(aVar instanceof ST0.f)) {
            throw new IllegalArgumentException("Unsupported type " + aVar.getF14992a());
        }
        g.f13723a.getClass();
        t tVarA = g.a((ST0.f) aVar);
        return new ST0.f(new t(r.a(tVarA.a(), i12, bVar), tVarA.b()).f412681b.toString());
    }

    @Override // RT0.c
    public final <T extends ST0.a> int C(@k T t12) {
        if (t12 instanceof ST0.e) {
            f.f13722a.getClass();
            return f.a((ST0.e) t12).f412619b.getMonthValue();
        }
        if (t12 instanceof ST0.f) {
            g.f13723a.getClass();
            return g.a((ST0.f) t12).a().f412619b.getMonthValue();
        }
        throw new IllegalArgumentException("Unsupported type " + t12);
    }

    @Override // RT0.c
    @k
    public final <T extends ST0.a> T F(@k T t12, int i12) {
        i.INSTANCE.getClass();
        return (T) b(t12, i12, i.f412489g);
    }

    @Override // RT0.c
    public final <T extends ST0.a> int I(@k T t12) {
        if (t12 instanceof ST0.e) {
            f.f13722a.getClass();
            return f.a((ST0.e) t12).f412619b.getDayOfMonth();
        }
        if (t12 instanceof ST0.f) {
            g.f13723a.getClass();
            return g.a((ST0.f) t12).a().f412619b.getDayOfMonth();
        }
        throw new IllegalArgumentException("Unsupported type " + t12);
    }

    @Override // RT0.c
    public final <T extends ST0.a> int J(@k T t12, @k T t13) {
        i.INSTANCE.getClass();
        return a(t12, t13, i.f412489g);
    }

    @Override // RT0.c
    @k
    public final <T extends ST0.a> T K(@k T t12, int i12) {
        i.INSTANCE.getClass();
        return (T) d(t12, i12, i.f412489g);
    }

    @Override // RT0.c
    @k
    public final ST0.e L(@k ST0.f fVar) {
        g.f13723a.getClass();
        return new ST0.e(g.a(fVar).a().f412619b.toString());
    }

    @Override // RT0.c
    public final <T extends ST0.a> int M(@k T t12, @k T t13) {
        i.INSTANCE.getClass();
        return a(t12, t13, i.f412491i);
    }

    @Override // RT0.c
    public final <T extends ST0.a> boolean N(@k T t12) {
        InterfaceC43316a.b.f412314a.getClass();
        l lVarA = InterfaceC43316a.b.a();
        z.INSTANCE.getClass();
        t tVarA = A.a(lVarA, z.Companion.a(ZoneId.systemDefault()));
        if (t12 instanceof ST0.f) {
            g.f13723a.getClass();
            return g.a((ST0.f) t12).a().equals(tVarA.a());
        }
        if (t12 instanceof ST0.e) {
            f.f13722a.getClass();
            return L.f(f.a((ST0.e) t12), tVarA.a());
        }
        throw new IllegalArgumentException("Unsupported type " + t12);
    }

    @Override // RT0.c
    public final <T extends ST0.a> int c(@k T t12, @k T t13) {
        i.INSTANCE.getClass();
        return a(t12, t13, i.f412490h);
    }

    @Override // RT0.c
    @k
    public final <T extends ST0.a> T j(@k T t12, int i12) {
        i.INSTANCE.getClass();
        return (T) d(t12, i12, i.f412491i);
    }

    @Override // RT0.c
    public final <T extends ST0.a> int m(@k T t12) {
        if (t12 instanceof ST0.e) {
            f.f13722a.getClass();
            return f.a((ST0.e) t12).f412619b.getYear();
        }
        if (t12 instanceof ST0.f) {
            g.f13723a.getClass();
            return g.a((ST0.f) t12).a().f412619b.getYear();
        }
        throw new IllegalArgumentException("Unsupported type " + t12);
    }

    @Override // RT0.c
    @k
    public final <T extends ST0.a> T s(@k T t12, int i12) {
        i.INSTANCE.getClass();
        return (T) b(t12, i12, i.f412491i);
    }

    @Override // RT0.c
    @k
    public final <T extends ST0.a> T x(@k T t12, int i12) {
        i.INSTANCE.getClass();
        return (T) b(t12, i12, i.f412490h);
    }

    @Override // RT0.c
    @k
    public final <T extends ST0.a> T y(@k T t12, int i12) {
        i.INSTANCE.getClass();
        return (T) d(t12, i12, i.f412490h);
    }
}
