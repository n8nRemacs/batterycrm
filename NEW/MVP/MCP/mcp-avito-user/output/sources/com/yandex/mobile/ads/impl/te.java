package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.ky0;
import java.util.HashMap;

/* loaded from: classes8.dex */
public abstract class te<T> implements dz0<n2, AdResponse<T>> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final o5 f390198a = new o5();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final c6 f390199b = new c6();

    @Override // com.yandex.mobile.ads.impl.dz0
    public final ky0 a(@j.N n2 n2Var) {
        return new ky0(ky0.b.f387309j.a(), a(n2Var));
    }

    @Override // com.yandex.mobile.ads.impl.dz0
    public final ky0 a(@j.P kz0 kz0Var, int i12, @j.N n2 n2Var) {
        return new ky0(ky0.b.f387310k.a(), a(i12, n2Var, kz0Var));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @j.N
    public HashMap a(@j.N n2 n2Var) {
        HashMap map = new HashMap();
        g5 g5VarA = n2Var.a();
        if (g5VarA != null) {
            map.putAll(this.f390198a.a(g5VarA));
        }
        map.put("block_id", n2Var.c());
        map.put("ad_unit_id", n2Var.c());
        map.put("ad_type", n2Var.b().a());
        if (n2Var.n() != null) {
            map.put("size_type", m41.b(n2Var.n().d()));
        }
        map.put("is_passback", Boolean.valueOf(n2Var.p() == 2));
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00da  */
    @j.N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.HashMap a(int r6, @j.N com.yandex.mobile.ads.impl.n2 r7, @j.P com.yandex.mobile.ads.impl.kz0 r8) {
        /*
            r5 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.yandex.mobile.ads.impl.c6 r1 = r5.f390199b
            r1.getClass()
            com.yandex.mobile.ads.impl.ly0 r1 = new com.yandex.mobile.ads.impl.ly0
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.<init>(r2)
            java.lang.String r2 = r7.c()
            java.lang.String r3 = "block_id"
            r1.b(r2, r3)
            java.lang.String r2 = r7.c()
            java.lang.String r3 = "ad_unit_id"
            r1.b(r2, r3)
            com.yandex.mobile.ads.impl.y6 r2 = r7.b()
            java.lang.String r2 = r2.a()
            java.lang.String r3 = "ad_type"
            r1.b(r2, r3)
            if (r8 == 0) goto L80
            T r2 = r8.f387334a
            if (r2 == 0) goto L80
            com.yandex.mobile.ads.base.AdResponse r2 = (com.yandex.mobile.ads.base.AdResponse) r2
            com.yandex.mobile.ads.base.model.MediationData r2 = r2.z()
            if (r2 != 0) goto L80
            T r2 = r8.f387334a
            com.yandex.mobile.ads.base.AdResponse r2 = (com.yandex.mobile.ads.base.AdResponse) r2
            java.lang.String r2 = r2.n()
            java.lang.String r3 = "ad_type_format"
            r1.b(r2, r3)
            T r2 = r8.f387334a
            com.yandex.mobile.ads.base.AdResponse r2 = (com.yandex.mobile.ads.base.AdResponse) r2
            java.lang.String r2 = r2.A()
            java.lang.String r3 = "product_type"
            r1.b(r2, r3)
            T r2 = r8.f387334a
            com.yandex.mobile.ads.base.AdResponse r2 = (com.yandex.mobile.ads.base.AdResponse) r2
            java.lang.String r2 = r2.v()
            java.lang.String r3 = "design"
            r1.a(r2, r3)
            T r2 = r8.f387334a
            com.yandex.mobile.ads.base.AdResponse r2 = (com.yandex.mobile.ads.base.AdResponse) r2
            java.util.List r2 = r2.c()
            r1.a(r2)
            T r2 = r8.f387334a
            com.yandex.mobile.ads.base.AdResponse r2 = (com.yandex.mobile.ads.base.AdResponse) r2
            java.util.Map r2 = r2.r()
            if (r2 == 0) goto L80
            r1.a(r2)
        L80:
            com.yandex.mobile.ads.base.SizeInfo r2 = r7.n()
            if (r2 == 0) goto Lad
            int r3 = r2.d()
            java.lang.String r3 = com.yandex.mobile.ads.impl.m41.b(r3)
            java.lang.String r4 = "size_type"
            r1.b(r3, r4)
            int r3 = r2.e()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "width"
            r1.b(r3, r4)
            int r2 = r2.c()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "height"
            r1.b(r2, r3)
        Lad:
            r2 = -1
            if (r6 != r2) goto Lb3
            java.lang.String r2 = "error_code"
            goto Lb5
        Lb3:
            java.lang.String r2 = "code"
        Lb5:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r1.b(r6, r2)
            if (r8 == 0) goto Lda
            T r6 = r8.f387334a
            if (r6 == 0) goto Lda
            com.yandex.mobile.ads.base.AdResponse r6 = (com.yandex.mobile.ads.base.AdResponse) r6
            com.yandex.mobile.ads.base.model.MediationData r6 = r6.z()
            if (r6 == 0) goto Lcd
            java.lang.String r6 = "mediation"
            goto Ldc
        Lcd:
            T r6 = r8.f387334a
            com.yandex.mobile.ads.base.AdResponse r6 = (com.yandex.mobile.ads.base.AdResponse) r6
            java.lang.Object r6 = r6.B()
            if (r6 == 0) goto Lda
            java.lang.String r6 = "ad"
            goto Ldc
        Lda:
            java.lang.String r6 = "empty"
        Ldc:
            java.lang.String r8 = "response_type"
            r1.b(r6, r8)
            java.util.Map r6 = r1.a()
            r0.putAll(r6)
            com.yandex.mobile.ads.impl.g5 r6 = r7.a()
            if (r6 == 0) goto Lf7
            com.yandex.mobile.ads.impl.o5 r7 = r5.f390198a
            java.util.Map r6 = r7.a(r6)
            r0.putAll(r6)
        Lf7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.te.a(int, com.yandex.mobile.ads.impl.n2, com.yandex.mobile.ads.impl.kz0):java.util.HashMap");
    }
}
