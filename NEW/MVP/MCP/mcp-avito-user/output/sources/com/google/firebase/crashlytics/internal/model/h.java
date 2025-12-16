package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import j.N;
import j.P;
import rZ0.InterfaceC47620a;

/* compiled from: AutoValue_CrashlyticsReport_Session.java */
/* loaded from: classes4.dex */
final class h extends CrashlyticsReport.f {

    /* renamed from: a, reason: collision with root package name */
    public final String f361259a;

    /* renamed from: b, reason: collision with root package name */
    public final String f361260b;

    /* renamed from: c, reason: collision with root package name */
    public final long f361261c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f361262d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f361263e;

    /* renamed from: f, reason: collision with root package name */
    public final CrashlyticsReport.f.a f361264f;

    /* renamed from: g, reason: collision with root package name */
    public final CrashlyticsReport.f.AbstractC10715f f361265g;

    /* renamed from: h, reason: collision with root package name */
    public final CrashlyticsReport.f.e f361266h;

    /* renamed from: i, reason: collision with root package name */
    public final CrashlyticsReport.f.c f361267i;

    /* renamed from: j, reason: collision with root package name */
    public final B<CrashlyticsReport.f.d> f361268j;

    /* renamed from: k, reason: collision with root package name */
    public final int f361269k;

    /* compiled from: AutoValue_CrashlyticsReport_Session.java */
    public static final class b extends CrashlyticsReport.f.b {

        /* renamed from: a, reason: collision with root package name */
        public String f361270a;

        /* renamed from: b, reason: collision with root package name */
        public String f361271b;

        /* renamed from: c, reason: collision with root package name */
        public Long f361272c;

        /* renamed from: d, reason: collision with root package name */
        public Long f361273d;

        /* renamed from: e, reason: collision with root package name */
        public Boolean f361274e;

        /* renamed from: f, reason: collision with root package name */
        public CrashlyticsReport.f.a f361275f;

        /* renamed from: g, reason: collision with root package name */
        public CrashlyticsReport.f.AbstractC10715f f361276g;

        /* renamed from: h, reason: collision with root package name */
        public CrashlyticsReport.f.e f361277h;

        /* renamed from: i, reason: collision with root package name */
        public CrashlyticsReport.f.c f361278i;

        /* renamed from: j, reason: collision with root package name */
        public B<CrashlyticsReport.f.d> f361279j;

        /* renamed from: k, reason: collision with root package name */
        public Integer f361280k;

        public b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.b
        public final CrashlyticsReport.f a() {
            String strQ = this.f361270a == null ? " generator" : "";
            if (this.f361271b == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " identifier");
            }
            if (this.f361272c == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " startedAt");
            }
            if (this.f361274e == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " crashed");
            }
            if (this.f361275f == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " app");
            }
            if (this.f361280k == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " generatorType");
            }
            if (strQ.isEmpty()) {
                return new h(this.f361270a, this.f361271b, this.f361272c.longValue(), this.f361273d, this.f361274e.booleanValue(), this.f361275f, this.f361276g, this.f361277h, this.f361278i, this.f361279j, this.f361280k.intValue(), null);
            }
            throw new IllegalStateException("Missing required properties:".concat(strQ));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.b
        public final CrashlyticsReport.f.b b(CrashlyticsReport.f.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.f361275f = aVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.b
        public final CrashlyticsReport.f.b c(boolean z12) {
            this.f361274e = Boolean.valueOf(z12);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.b
        public final CrashlyticsReport.f.b d(CrashlyticsReport.f.c cVar) {
            this.f361278i = cVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.b
        public final CrashlyticsReport.f.b e(Long l12) {
            this.f361273d = l12;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.b
        public final CrashlyticsReport.f.b f(B<CrashlyticsReport.f.d> b12) {
            this.f361279j = b12;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.b
        public final CrashlyticsReport.f.b g(String str) {
            if (str == null) {
                throw new NullPointerException("Null generator");
            }
            this.f361270a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.b
        public final CrashlyticsReport.f.b h(int i12) {
            this.f361280k = Integer.valueOf(i12);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.b
        public final CrashlyticsReport.f.b i(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f361271b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.b
        public final CrashlyticsReport.f.b j(CrashlyticsReport.f.e eVar) {
            this.f361277h = eVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.b
        public final CrashlyticsReport.f.b k(long j12) {
            this.f361272c = Long.valueOf(j12);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.b
        public final CrashlyticsReport.f.b l(CrashlyticsReport.f.AbstractC10715f abstractC10715f) {
            this.f361276g = abstractC10715f;
            return this;
        }

        public b(CrashlyticsReport.f fVar, a aVar) {
            this.f361270a = fVar.f();
            this.f361271b = fVar.h();
            this.f361272c = Long.valueOf(fVar.j());
            this.f361273d = fVar.d();
            this.f361274e = Boolean.valueOf(fVar.l());
            this.f361275f = fVar.b();
            this.f361276g = fVar.k();
            this.f361277h = fVar.i();
            this.f361278i = fVar.c();
            this.f361279j = fVar.e();
            this.f361280k = Integer.valueOf(fVar.g());
        }
    }

    public h() {
        throw null;
    }

    public h(String str, String str2, long j12, Long l12, boolean z12, CrashlyticsReport.f.a aVar, CrashlyticsReport.f.AbstractC10715f abstractC10715f, CrashlyticsReport.f.e eVar, CrashlyticsReport.f.c cVar, B b12, int i12, a aVar2) {
        this.f361259a = str;
        this.f361260b = str2;
        this.f361261c = j12;
        this.f361262d = l12;
        this.f361263e = z12;
        this.f361264f = aVar;
        this.f361265g = abstractC10715f;
        this.f361266h = eVar;
        this.f361267i = cVar;
        this.f361268j = b12;
        this.f361269k = i12;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f
    @N
    public final CrashlyticsReport.f.a b() {
        return this.f361264f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f
    @P
    public final CrashlyticsReport.f.c c() {
        return this.f361267i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f
    @P
    public final Long d() {
        return this.f361262d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f
    @P
    public final B<CrashlyticsReport.f.d> e() {
        return this.f361268j;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f
            r2 = 0
            if (r1 == 0) goto Lb7
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f r8 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f) r8
            java.lang.String r1 = r8.f()
            java.lang.String r3 = r7.f361259a
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto Lb5
            java.lang.String r1 = r7.f361260b
            java.lang.String r3 = r8.h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lb5
            long r3 = r7.f361261c
            long r5 = r8.j()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto Lb5
            java.lang.Long r1 = r7.f361262d
            if (r1 != 0) goto L38
            java.lang.Long r1 = r8.d()
            if (r1 != 0) goto Lb5
            goto L42
        L38:
            java.lang.Long r3 = r8.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lb5
        L42:
            boolean r1 = r7.f361263e
            boolean r3 = r8.l()
            if (r1 != r3) goto Lb5
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$a r1 = r7.f361264f
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$a r3 = r8.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lb5
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$f r1 = r7.f361265g
            if (r1 != 0) goto L61
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$f r1 = r8.k()
            if (r1 != 0) goto Lb5
            goto L6b
        L61:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$f r3 = r8.k()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lb5
        L6b:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$e r1 = r7.f361266h
            if (r1 != 0) goto L76
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$e r1 = r8.i()
            if (r1 != 0) goto Lb5
            goto L80
        L76:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$e r3 = r8.i()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lb5
        L80:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$c r1 = r7.f361267i
            if (r1 != 0) goto L8b
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$c r1 = r8.c()
            if (r1 != 0) goto Lb5
            goto L95
        L8b:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$c r3 = r8.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lb5
        L95:
            com.google.firebase.crashlytics.internal.model.B<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$f$d> r1 = r7.f361268j
            if (r1 != 0) goto La0
            com.google.firebase.crashlytics.internal.model.B r1 = r8.e()
            if (r1 != 0) goto Lb5
            goto Lac
        La0:
            com.google.firebase.crashlytics.internal.model.B r3 = r8.e()
            java.util.List<E> r1 = r1.f361077b
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lb5
        Lac:
            int r1 = r7.f361269k
            int r8 = r8.g()
            if (r1 != r8) goto Lb5
            goto Lb6
        Lb5:
            r0 = r2
        Lb6:
            return r0
        Lb7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.model.h.equals(java.lang.Object):boolean");
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f
    @N
    public final String f() {
        return this.f361259a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f
    public final int g() {
        return this.f361269k;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f
    @InterfaceC47620a.b
    @N
    public final String h() {
        return this.f361260b;
    }

    public final int hashCode() {
        int iHashCode = (((this.f361259a.hashCode() ^ 1000003) * 1000003) ^ this.f361260b.hashCode()) * 1000003;
        long j12 = this.f361261c;
        int i12 = (iHashCode ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        Long l12 = this.f361262d;
        int iHashCode2 = (((((i12 ^ (l12 == null ? 0 : l12.hashCode())) * 1000003) ^ (this.f361263e ? 1231 : 1237)) * 1000003) ^ this.f361264f.hashCode()) * 1000003;
        CrashlyticsReport.f.AbstractC10715f abstractC10715f = this.f361265g;
        int iHashCode3 = (iHashCode2 ^ (abstractC10715f == null ? 0 : abstractC10715f.hashCode())) * 1000003;
        CrashlyticsReport.f.e eVar = this.f361266h;
        int iHashCode4 = (iHashCode3 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        CrashlyticsReport.f.c cVar = this.f361267i;
        int iHashCode5 = (iHashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        B<CrashlyticsReport.f.d> b12 = this.f361268j;
        return ((iHashCode5 ^ (b12 != null ? b12.f361077b.hashCode() : 0)) * 1000003) ^ this.f361269k;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f
    @P
    public final CrashlyticsReport.f.e i() {
        return this.f361266h;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f
    public final long j() {
        return this.f361261c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f
    @P
    public final CrashlyticsReport.f.AbstractC10715f k() {
        return this.f361265g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f
    public final boolean l() {
        return this.f361263e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f
    public final CrashlyticsReport.f.b m() {
        return new b(this, null);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f361259a);
        sb2.append(", identifier=");
        sb2.append(this.f361260b);
        sb2.append(", startedAt=");
        sb2.append(this.f361261c);
        sb2.append(", endedAt=");
        sb2.append(this.f361262d);
        sb2.append(", crashed=");
        sb2.append(this.f361263e);
        sb2.append(", app=");
        sb2.append(this.f361264f);
        sb2.append(", user=");
        sb2.append(this.f361265g);
        sb2.append(", os=");
        sb2.append(this.f361266h);
        sb2.append(", device=");
        sb2.append(this.f361267i);
        sb2.append(", events=");
        sb2.append(this.f361268j);
        sb2.append(", generatorType=");
        return AK.c.i(this.f361269k, "}", sb2);
    }
}
