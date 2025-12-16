package com.yandex.metrica.impl.ob;

import java.util.LinkedHashMap;

/* renamed from: com.yandex.metrica.impl.ob.jb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38900jb {

    /* renamed from: a, reason: collision with root package name */
    private final M0 f380889a;

    /* renamed from: com.yandex.metrica.impl.ob.jb$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f380890a;

        /* renamed from: b, reason: collision with root package name */
        private final int f380891b;

        /* renamed from: c, reason: collision with root package name */
        private final int f380892c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        private final String f380893d;

        public a() {
            this(false, 0, 0, null, 15);
        }

        @Y61.l
        public final String a() {
            return this.f380893d;
        }

        public final int b() {
            return this.f380891b;
        }

        public final int c() {
            return this.f380892c;
        }

        public final boolean d() {
            return this.f380890a;
        }

        public boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f380890a == aVar.f380890a && this.f380891b == aVar.f380891b && this.f380892c == aVar.f380892c && kotlin.jvm.internal.L.f(this.f380893d, aVar.f380893d);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r0v9 */
        public int hashCode() {
            boolean z12 = this.f380890a;
            ?? r02 = z12;
            if (z12) {
                r02 = 1;
            }
            int i12 = ((((r02 * 31) + this.f380891b) * 31) + this.f380892c) * 31;
            String str = this.f380893d;
            return i12 + (str != null ? str.hashCode() : 0);
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("RequestReport(success=");
            sb2.append(this.f380890a);
            sb2.append(", httpStatus=");
            sb2.append(this.f380891b);
            sb2.append(", size=");
            sb2.append(this.f380892c);
            sb2.append(", failureReason=");
            return AK.c.s(sb2, this.f380893d, ")");
        }

        public a(boolean z12, int i12, int i13, @Y61.l String str) {
            this.f380890a = z12;
            this.f380891b = i12;
            this.f380892c = i13;
            this.f380893d = str;
        }

        public /* synthetic */ a(boolean z12, int i12, int i13, String str, int i14) {
            this((i14 & 1) != 0 ? false : z12, (i14 & 2) != 0 ? 0 : i12, (i14 & 4) != 0 ? 0 : i13, null);
        }
    }

    public C38900jb(@Y61.k Uh uh2, @Y61.k M0 m02) {
        this.f380889a = uh2.e() ? m02 : null;
    }

    public final void a(@Y61.k a aVar) {
        M0 m02 = this.f380889a;
        if (m02 != null) {
            LinkedHashMap linkedHashMapJ = kotlin.collections.P0.j(new kotlin.Q("status", aVar.d() ? "OK" : "FAILED"), new kotlin.Q("http_status", Integer.valueOf(aVar.b())), new kotlin.Q("size", Integer.valueOf(aVar.c())));
            String strA = aVar.a();
            if (strA != null) {
                linkedHashMapJ.put("reason", strA);
            }
            m02.reportEvent("egress_status", kotlin.collections.P0.q(linkedHashMapJ));
        }
    }
}
