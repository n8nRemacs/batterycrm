package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public interface x21 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final z21 f391532a;

        /* renamed from: b, reason: collision with root package name */
        public final z21 f391533b;

        public a(z21 z21Var) {
            this(z21Var, z21Var);
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f391532a.equals(aVar.f391532a) && this.f391533b.equals(aVar.f391533b);
        }

        public final int hashCode() {
            return this.f391533b.hashCode() + (this.f391532a.hashCode() * 31);
        }

        public final String toString() {
            String string;
            StringBuilder sbA = Cif.a("[");
            sbA.append(this.f391532a);
            if (this.f391532a.equals(this.f391533b)) {
                string = "";
            } else {
                StringBuilder sbA2 = Cif.a(", ");
                sbA2.append(this.f391533b);
                string = sbA2.toString();
            }
            return AK.c.s(sbA, string, "]");
        }

        public a(z21 z21Var, z21 z21Var2) {
            this.f391532a = (z21) db.a(z21Var);
            this.f391533b = (z21) db.a(z21Var2);
        }
    }

    public static class b implements x21 {

        /* renamed from: a, reason: collision with root package name */
        private final long f391534a;

        /* renamed from: b, reason: collision with root package name */
        private final a f391535b;

        public b() {
            this(-9223372036854775807L, 0L);
        }

        @Override // com.yandex.mobile.ads.impl.x21
        public final boolean b() {
            return false;
        }

        @Override // com.yandex.mobile.ads.impl.x21
        public final long c() {
            return this.f391534a;
        }

        public b(long j12, long j13) {
            this.f391534a = j12;
            this.f391535b = new a(j13 == 0 ? z21.f392158c : new z21(0L, j13));
        }

        @Override // com.yandex.mobile.ads.impl.x21
        public final a b(long j12) {
            return this.f391535b;
        }
    }

    a b(long j12);

    boolean b();

    long c();
}
