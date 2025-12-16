package I91;

import ru.mts.biometry.api.dataSource.j;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final j f8026a;

    public b(j jVar) {
        this.f8026a = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof I91.a
            if (r0 == 0) goto L13
            r0 = r14
            I91.a r0 = (I91.a) r0
            int r1 = r0.f8025s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8025s = r1
            goto L18
        L13:
            I91.a r0 = new I91.a
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.f8023q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f8025s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r14)
            goto L3f
        L29:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L31:
            kotlin.C42729a0.b(r14)
            r0.f8025s = r3
            ru.mts.biometry.api.dataSource.j r14 = r12.f8026a
            java.lang.Object r14 = r14.b(r13, r0)
            if (r14 != r1) goto L3f
            return r1
        L3f:
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.ArrayList r13 = new java.util.ArrayList
            r0 = 10
            int r0 = kotlin.collections.C42745f0.q(r14, r0)
            r13.<init>(r0)
            java.util.Iterator r14 = r14.iterator()
        L50:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto Ld3
            java.lang.Object r0 = r14.next()
            ru.mts.biometry.api.entity.locationSuggestion.LocationSuggestion r0 = (ru.mts.biometry.api.entity.locationSuggestion.LocationSuggestion) r0
            java.lang.String r2 = r0.getValue()
            java.lang.String r3 = r0.getUnrestrictedValue()
            ru.mts.biometry.api.entity.locationSuggestion.LocationData r1 = r0.getData()
            java.lang.String r6 = r1.getHouse()
            ru.mts.biometry.api.entity.locationSuggestion.LocationData r1 = r0.getData()
            java.lang.String r1 = r1.getCity()
            if (r1 != 0) goto L7e
            ru.mts.biometry.api.entity.locationSuggestion.LocationData r1 = r0.getData()
            java.lang.String r1 = r1.getSettlementWithType()
        L7e:
            r4 = r1
            ru.mts.biometry.api.entity.locationSuggestion.LocationData r1 = r0.getData()
            java.lang.String r5 = r1.getCityDistrict()
            ru.mts.biometry.api.entity.locationSuggestion.LocationData r1 = r0.getData()
            java.lang.String r1 = r1.getPostalCode()
            if (r1 == 0) goto L9b
            int r1 = java.lang.Integer.parseInt(r1)
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r1)
        L99:
            r8 = r1
            goto L9d
        L9b:
            r1 = 0
            goto L99
        L9d:
            ru.mts.biometry.api.entity.locationSuggestion.LocationData r1 = r0.getData()
            java.lang.String r1 = r1.getRegionWithType()
            if (r1 != 0) goto Laf
            ru.mts.biometry.api.entity.locationSuggestion.LocationData r1 = r0.getData()
            java.lang.String r1 = r1.getRegion()
        Laf:
            r10 = r1
            ru.mts.biometry.api.entity.locationSuggestion.LocationData r1 = r0.getData()
            java.lang.String r9 = r1.getFlat()
            ru.mts.biometry.api.entity.locationSuggestion.LocationData r1 = r0.getData()
            java.lang.String r11 = r1.getStreet()
            ru.mts.biometry.api.entity.locationSuggestion.LocationData r0 = r0.getData()
            java.lang.String r7 = r0.getBlock()
            I91.d r0 = new I91.d
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r13.add(r0)
            goto L50
        Ld3:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: I91.b.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
