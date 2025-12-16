package org.threeten.bp.temporal;

import org.threeten.bp.o;
import org.threeten.bp.q;

/* compiled from: TemporalQueries.java */
/* loaded from: classes15.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final j<o> f422198a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final j<org.threeten.bp.chrono.j> f422199b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final j<k> f422200c = new c();

    /* renamed from: d, reason: collision with root package name */
    public static final j<o> f422201d = new d();

    /* renamed from: e, reason: collision with root package name */
    public static final j<q> f422202e = new e();

    /* renamed from: f, reason: collision with root package name */
    public static final j<org.threeten.bp.e> f422203f = new f();

    /* renamed from: g, reason: collision with root package name */
    public static final j<org.threeten.bp.g> f422204g = new g();

    /* compiled from: TemporalQueries.java */
    public class a implements j<o> {
        @Override // org.threeten.bp.temporal.j
        public final o a(org.threeten.bp.temporal.d dVar) {
            return (o) dVar.f(this);
        }
    }

    /* compiled from: TemporalQueries.java */
    public class b implements j<org.threeten.bp.chrono.j> {
        @Override // org.threeten.bp.temporal.j
        public final org.threeten.bp.chrono.j a(org.threeten.bp.temporal.d dVar) {
            return (org.threeten.bp.chrono.j) dVar.f(this);
        }
    }

    /* compiled from: TemporalQueries.java */
    public class c implements j<k> {
        @Override // org.threeten.bp.temporal.j
        public final k a(org.threeten.bp.temporal.d dVar) {
            return (k) dVar.f(this);
        }
    }

    /* compiled from: TemporalQueries.java */
    public class d implements j<o> {
        @Override // org.threeten.bp.temporal.j
        public final o a(org.threeten.bp.temporal.d dVar) {
            o oVar = (o) dVar.f(i.f422198a);
            return oVar != null ? oVar : (o) dVar.f(i.f422202e);
        }
    }

    /* compiled from: TemporalQueries.java */
    public class e implements j<q> {
        @Override // org.threeten.bp.temporal.j
        public final q a(org.threeten.bp.temporal.d dVar) {
            ChronoField chronoField = ChronoField.f422126H;
            if (dVar.l(chronoField)) {
                return q.w(dVar.k(chronoField));
            }
            return null;
        }
    }

    /* compiled from: TemporalQueries.java */
    public class f implements j<org.threeten.bp.e> {
        @Override // org.threeten.bp.temporal.j
        public final org.threeten.bp.e a(org.threeten.bp.temporal.d dVar) {
            ChronoField chronoField = ChronoField.f422148y;
            if (dVar.l(chronoField)) {
                return org.threeten.bp.e.P(dVar.m(chronoField));
            }
            return null;
        }
    }

    /* compiled from: TemporalQueries.java */
    public class g implements j<org.threeten.bp.g> {
        @Override // org.threeten.bp.temporal.j
        public final org.threeten.bp.g a(org.threeten.bp.temporal.d dVar) {
            ChronoField chronoField = ChronoField.f422129f;
            if (dVar.l(chronoField)) {
                return org.threeten.bp.g.w(dVar.m(chronoField));
            }
            return null;
        }
    }
}
