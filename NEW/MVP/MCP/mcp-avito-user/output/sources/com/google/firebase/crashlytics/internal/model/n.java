package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import j.N;
import j.P;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution.java */
/* loaded from: classes4.dex */
final class n extends CrashlyticsReport.f.d.a.b {

    /* renamed from: a, reason: collision with root package name */
    public final B<CrashlyticsReport.f.d.a.b.e> f361334a;

    /* renamed from: b, reason: collision with root package name */
    public final CrashlyticsReport.f.d.a.b.c f361335b;

    /* renamed from: c, reason: collision with root package name */
    public final CrashlyticsReport.a f361336c;

    /* renamed from: d, reason: collision with root package name */
    public final CrashlyticsReport.f.d.a.b.AbstractC10709d f361337d;

    /* renamed from: e, reason: collision with root package name */
    public final B<CrashlyticsReport.f.d.a.b.AbstractC10705a> f361338e;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution.java */
    public static final class b extends CrashlyticsReport.f.d.a.b.AbstractC10707b {

        /* renamed from: a, reason: collision with root package name */
        public B<CrashlyticsReport.f.d.a.b.e> f361339a;

        /* renamed from: b, reason: collision with root package name */
        public CrashlyticsReport.f.d.a.b.c f361340b;

        /* renamed from: c, reason: collision with root package name */
        public CrashlyticsReport.a f361341c;

        /* renamed from: d, reason: collision with root package name */
        public CrashlyticsReport.f.d.a.b.AbstractC10709d f361342d;

        /* renamed from: e, reason: collision with root package name */
        public B<CrashlyticsReport.f.d.a.b.AbstractC10705a> f361343e;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.AbstractC10707b
        public final CrashlyticsReport.f.d.a.b a() {
            String strQ = this.f361342d == null ? " signal" : "";
            if (this.f361343e == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " binaries");
            }
            if (strQ.isEmpty()) {
                return new n(this.f361339a, this.f361340b, this.f361341c, this.f361342d, this.f361343e, null);
            }
            throw new IllegalStateException("Missing required properties:".concat(strQ));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.AbstractC10707b
        public final CrashlyticsReport.f.d.a.b.AbstractC10707b b(CrashlyticsReport.a aVar) {
            this.f361341c = aVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.AbstractC10707b
        public final CrashlyticsReport.f.d.a.b.AbstractC10707b c(B<CrashlyticsReport.f.d.a.b.AbstractC10705a> b12) {
            if (b12 == null) {
                throw new NullPointerException("Null binaries");
            }
            this.f361343e = b12;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.AbstractC10707b
        public final CrashlyticsReport.f.d.a.b.AbstractC10707b d(CrashlyticsReport.f.d.a.b.c cVar) {
            this.f361340b = cVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.AbstractC10707b
        public final CrashlyticsReport.f.d.a.b.AbstractC10707b e(CrashlyticsReport.f.d.a.b.AbstractC10709d abstractC10709d) {
            if (abstractC10709d == null) {
                throw new NullPointerException("Null signal");
            }
            this.f361342d = abstractC10709d;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.AbstractC10707b
        public final CrashlyticsReport.f.d.a.b.AbstractC10707b f(B<CrashlyticsReport.f.d.a.b.e> b12) {
            this.f361339a = b12;
            return this;
        }
    }

    public n() {
        throw null;
    }

    public n(B b12, CrashlyticsReport.f.d.a.b.c cVar, CrashlyticsReport.a aVar, CrashlyticsReport.f.d.a.b.AbstractC10709d abstractC10709d, B b13, a aVar2) {
        this.f361334a = b12;
        this.f361335b = cVar;
        this.f361336c = aVar;
        this.f361337d = abstractC10709d;
        this.f361338e = b13;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b
    @P
    public final CrashlyticsReport.a b() {
        return this.f361336c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b
    @N
    public final B<CrashlyticsReport.f.d.a.b.AbstractC10705a> c() {
        return this.f361338e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b
    @P
    public final CrashlyticsReport.f.d.a.b.c d() {
        return this.f361335b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b
    @N
    public final CrashlyticsReport.f.d.a.b.AbstractC10709d e() {
        return this.f361337d;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b
            r2 = 0
            if (r1 == 0) goto L69
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$a$b r5 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b) r5
            com.google.firebase.crashlytics.internal.model.B<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$a$b$e> r1 = r4.f361334a
            if (r1 != 0) goto L16
            com.google.firebase.crashlytics.internal.model.B r1 = r5.f()
            if (r1 != 0) goto L67
            goto L22
        L16:
            com.google.firebase.crashlytics.internal.model.B r3 = r5.f()
            java.util.List<E> r1 = r1.f361077b
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L67
        L22:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$a$b$c r1 = r4.f361335b
            if (r1 != 0) goto L2d
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$a$b$c r1 = r5.d()
            if (r1 != 0) goto L67
            goto L37
        L2d:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$a$b$c r3 = r5.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L67
        L37:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$a r1 = r4.f361336c
            if (r1 != 0) goto L42
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$a r1 = r5.b()
            if (r1 != 0) goto L67
            goto L4c
        L42:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$a r3 = r5.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L67
        L4c:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$a$b$d r1 = r5.e()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$a$b$d r3 = r4.f361337d
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L67
            com.google.firebase.crashlytics.internal.model.B r5 = r5.c()
            com.google.firebase.crashlytics.internal.model.B<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$a$b$a> r1 = r4.f361338e
            java.util.List<E> r1 = r1.f361077b
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L67
            goto L68
        L67:
            r0 = r2
        L68:
            return r0
        L69:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.model.n.equals(java.lang.Object):boolean");
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b
    @P
    public final B<CrashlyticsReport.f.d.a.b.e> f() {
        return this.f361334a;
    }

    public final int hashCode() {
        B<CrashlyticsReport.f.d.a.b.e> b12 = this.f361334a;
        int iHashCode = ((b12 == null ? 0 : b12.f361077b.hashCode()) ^ 1000003) * 1000003;
        CrashlyticsReport.f.d.a.b.c cVar = this.f361335b;
        int iHashCode2 = (iHashCode ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        CrashlyticsReport.a aVar = this.f361336c;
        return (((((aVar != null ? aVar.hashCode() : 0) ^ iHashCode2) * 1000003) ^ this.f361337d.hashCode()) * 1000003) ^ this.f361338e.f361077b.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.f361334a + ", exception=" + this.f361335b + ", appExitInfo=" + this.f361336c + ", signal=" + this.f361337d + ", binaries=" + this.f361338e + "}";
    }
}
