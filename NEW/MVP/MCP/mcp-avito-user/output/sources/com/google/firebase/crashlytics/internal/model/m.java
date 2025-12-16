package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import j.N;
import j.P;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application.java */
/* loaded from: classes4.dex */
final class m extends CrashlyticsReport.f.d.a {

    /* renamed from: a, reason: collision with root package name */
    public final CrashlyticsReport.f.d.a.b f361324a;

    /* renamed from: b, reason: collision with root package name */
    public final B<CrashlyticsReport.d> f361325b;

    /* renamed from: c, reason: collision with root package name */
    public final B<CrashlyticsReport.d> f361326c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f361327d;

    /* renamed from: e, reason: collision with root package name */
    public final int f361328e;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application.java */
    public static final class b extends CrashlyticsReport.f.d.a.AbstractC10704a {

        /* renamed from: a, reason: collision with root package name */
        public CrashlyticsReport.f.d.a.b f361329a;

        /* renamed from: b, reason: collision with root package name */
        public B<CrashlyticsReport.d> f361330b;

        /* renamed from: c, reason: collision with root package name */
        public B<CrashlyticsReport.d> f361331c;

        /* renamed from: d, reason: collision with root package name */
        public Boolean f361332d;

        /* renamed from: e, reason: collision with root package name */
        public Integer f361333e;

        public b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.AbstractC10704a
        public final CrashlyticsReport.f.d.a a() {
            String strQ = this.f361329a == null ? " execution" : "";
            if (this.f361333e == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " uiOrientation");
            }
            if (strQ.isEmpty()) {
                return new m(this.f361329a, this.f361330b, this.f361331c, this.f361332d, this.f361333e.intValue(), null);
            }
            throw new IllegalStateException("Missing required properties:".concat(strQ));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.AbstractC10704a
        public final CrashlyticsReport.f.d.a.AbstractC10704a b(@P Boolean bool) {
            this.f361332d = bool;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.AbstractC10704a
        public final CrashlyticsReport.f.d.a.AbstractC10704a c(B<CrashlyticsReport.d> b12) {
            this.f361330b = b12;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.AbstractC10704a
        public final CrashlyticsReport.f.d.a.AbstractC10704a d(CrashlyticsReport.f.d.a.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null execution");
            }
            this.f361329a = bVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.AbstractC10704a
        public final CrashlyticsReport.f.d.a.AbstractC10704a e(B<CrashlyticsReport.d> b12) {
            this.f361331c = b12;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.AbstractC10704a
        public final CrashlyticsReport.f.d.a.AbstractC10704a f(int i12) {
            this.f361333e = Integer.valueOf(i12);
            return this;
        }

        public b(CrashlyticsReport.f.d.a aVar, a aVar2) {
            this.f361329a = aVar.d();
            this.f361330b = aVar.c();
            this.f361331c = aVar.e();
            this.f361332d = aVar.b();
            this.f361333e = Integer.valueOf(aVar.f());
        }
    }

    public m() {
        throw null;
    }

    public m(CrashlyticsReport.f.d.a.b bVar, B b12, B b13, Boolean bool, int i12, a aVar) {
        this.f361324a = bVar;
        this.f361325b = b12;
        this.f361326c = b13;
        this.f361327d = bool;
        this.f361328e = i12;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a
    @P
    public final Boolean b() {
        return this.f361327d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a
    @P
    public final B<CrashlyticsReport.d> c() {
        return this.f361325b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a
    @N
    public final CrashlyticsReport.f.d.a.b d() {
        return this.f361324a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a
    @P
    public final B<CrashlyticsReport.d> e() {
        return this.f361326c;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
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
            boolean r1 = r5 instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a
            r2 = 0
            if (r1 == 0) goto L65
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$a r5 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a) r5
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$a$b r1 = r5.d()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d$a$b r3 = r4.f361324a
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L63
            com.google.firebase.crashlytics.internal.model.B<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d> r1 = r4.f361325b
            if (r1 != 0) goto L22
            com.google.firebase.crashlytics.internal.model.B r1 = r5.c()
            if (r1 != 0) goto L63
            goto L2e
        L22:
            com.google.firebase.crashlytics.internal.model.B r3 = r5.c()
            java.util.List<E> r1 = r1.f361077b
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L63
        L2e:
            com.google.firebase.crashlytics.internal.model.B<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d> r1 = r4.f361326c
            if (r1 != 0) goto L39
            com.google.firebase.crashlytics.internal.model.B r1 = r5.e()
            if (r1 != 0) goto L63
            goto L45
        L39:
            com.google.firebase.crashlytics.internal.model.B r3 = r5.e()
            java.util.List<E> r1 = r1.f361077b
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L63
        L45:
            java.lang.Boolean r1 = r4.f361327d
            if (r1 != 0) goto L50
            java.lang.Boolean r1 = r5.b()
            if (r1 != 0) goto L63
            goto L5a
        L50:
            java.lang.Boolean r3 = r5.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L63
        L5a:
            int r1 = r4.f361328e
            int r5 = r5.f()
            if (r1 != r5) goto L63
            goto L64
        L63:
            r0 = r2
        L64:
            return r0
        L65:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.model.m.equals(java.lang.Object):boolean");
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a
    public final int f() {
        return this.f361328e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a
    public final CrashlyticsReport.f.d.a.AbstractC10704a g() {
        return new b(this, null);
    }

    public final int hashCode() {
        int iHashCode = (this.f361324a.hashCode() ^ 1000003) * 1000003;
        B<CrashlyticsReport.d> b12 = this.f361325b;
        int iHashCode2 = (iHashCode ^ (b12 == null ? 0 : b12.f361077b.hashCode())) * 1000003;
        B<CrashlyticsReport.d> b13 = this.f361326c;
        int iHashCode3 = (iHashCode2 ^ (b13 == null ? 0 : b13.f361077b.hashCode())) * 1000003;
        Boolean bool = this.f361327d;
        return ((iHashCode3 ^ (bool != null ? bool.hashCode() : 0)) * 1000003) ^ this.f361328e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{execution=");
        sb2.append(this.f361324a);
        sb2.append(", customAttributes=");
        sb2.append(this.f361325b);
        sb2.append(", internalKeys=");
        sb2.append(this.f361326c);
        sb2.append(", background=");
        sb2.append(this.f361327d);
        sb2.append(", uiOrientation=");
        return AK.c.i(this.f361328e, "}", sb2);
    }
}
