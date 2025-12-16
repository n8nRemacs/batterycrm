package com.avito.android.advert.item.geo_distance;

import com.avito.android.advert.item.geo_distance.c;
import com.avito.android.travel_time_calculator.data.TransportType;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsAddressGeoDistanceInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/avito/android/travel_time_calculator/data/TransportType;", "Lcom/avito/android/advert/item/geo_distance/c$a$b;", "it", "Lkotlin/G0;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class d extends N implements Y41.l<Map<TransportType, ? extends c.a.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f75684l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Map<TransportType, Long>, G0> f75685m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f75686n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(c cVar, Y41.l<? super Map<TransportType, Long>, G0> lVar, Y41.a<G0> aVar) {
        super(1);
        this.f75684l = cVar;
        this.f75685m = lVar;
        this.f75686n = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009f A[SYNTHETIC] */
    @Override // Y41.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.G0 invoke(java.util.Map<com.avito.android.travel_time_calculator.data.TransportType, ? extends com.avito.android.advert.item.geo_distance.c.a.b> r15) {
        /*
            r14 = this;
            java.util.Map r15 = (java.util.Map) r15
            int r0 = com.avito.android.advert.item.geo_distance.c.f75676c
            com.avito.android.advert.item.geo_distance.c r0 = r14.f75684l
            r0.getClass()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.Set r15 = r15.entrySet()
            java.util.Iterator r15 = r15.iterator()
            r3 = 0
        L1c:
            boolean r4 = r15.hasNext()
            if (r4 == 0) goto La8
            java.lang.Object r4 = r15.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            com.avito.android.travel_time_calculator.data.TransportType r5 = (com.avito.android.travel_time_calculator.data.TransportType) r5
            java.lang.Object r4 = r4.getValue()
            com.avito.android.advert.item.geo_distance.c$a$b r4 = (com.avito.android.advert.item.geo_distance.c.a.b) r4
            boolean r6 = r4 instanceof com.avito.android.advert.item.geo_distance.c.a.b.C2246a
            r7 = -2
            r9 = 1
            if (r6 == 0) goto L54
            com.avito.android.advert.item.geo_distance.c$a$b$a r4 = (com.avito.android.advert.item.geo_distance.c.a.b.C2246a) r4
            boolean r4 = r4.f75682a
            if (r4 != 0) goto L4c
            r3 = -1
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.put(r5, r3)
            r3 = r9
            goto L1c
        L4c:
            java.lang.Long r4 = java.lang.Long.valueOf(r7)
            r2.put(r5, r4)
            goto L1c
        L54:
            boolean r6 = r4 instanceof com.avito.android.advert.item.geo_distance.c.a.b.C2247b
            if (r6 == 0) goto L1c
            com.avito.android.advert.item.geo_distance.c$a$b$b r4 = (com.avito.android.advert.item.geo_distance.c.a.b.C2247b) r4
            long r10 = r4.f75683a
            int r6 = r5.ordinal()
            if (r6 == 0) goto L7b
            if (r6 == r9) goto L6e
            r9 = 2
            if (r6 != r9) goto L68
            goto L7b
        L68:
            kotlin.NoWhenBranchMatchedException r15 = new kotlin.NoWhenBranchMatchedException
            r15.<init>()
            throw r15
        L6e:
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MINUTES
            r12 = 30
            long r12 = r6.toSeconds(r12)
            int r6 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r6 > 0) goto L9f
            goto L87
        L7b:
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.HOURS
            r12 = 2
            long r12 = r6.toSeconds(r12)
            int r6 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r6 > 0) goto L9f
        L87:
            long r6 = r4.f75683a
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r1.put(r5, r4)
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            long r6 = r4.toMinutes(r6)
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r2.put(r5, r4)
            goto L1c
        L9f:
            java.lang.Long r4 = java.lang.Long.valueOf(r7)
            r2.put(r5, r4)
            goto L1c
        La8:
            x5.a$a r15 = new x5.a$a
            com.avito.android.travel_time_calculator.data.TransportType r4 = com.avito.android.travel_time_calculator.data.TransportType.f303310c
            java.lang.Object r4 = r2.get(r4)
            r5 = r4
            java.lang.Long r5 = (java.lang.Long) r5
            com.avito.android.travel_time_calculator.data.TransportType r4 = com.avito.android.travel_time_calculator.data.TransportType.f303309b
            java.lang.Object r4 = r2.get(r4)
            r6 = r4
            java.lang.Long r6 = (java.lang.Long) r6
            com.avito.android.travel_time_calculator.data.TransportType r4 = com.avito.android.travel_time_calculator.data.TransportType.f303311d
            java.lang.Object r2 = r2.get(r4)
            r7 = r2
            java.lang.Long r7 = (java.lang.Long) r7
            r8 = 0
            r9 = 8
            r10 = 0
            r4 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10)
            x5.a r0 = r0.f75678b
            r0.b(r15)
            Y41.l<java.util.Map<com.avito.android.travel_time_calculator.data.TransportType, java.lang.Long>, kotlin.G0> r15 = r14.f75685m
            com.avito.android.advert.item.geo_distance.h r15 = (com.avito.android.advert.item.geo_distance.h) r15
            r15.invoke(r1)
            if (r3 == 0) goto Le2
            Y41.a<kotlin.G0> r15 = r14.f75686n
            com.avito.android.advert.item.geo_distance.i r15 = (com.avito.android.advert.item.geo_distance.i) r15
            r15.invoke()
        Le2:
            kotlin.G0 r15 = kotlin.G0.f406611a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.geo_distance.d.invoke(java.lang.Object):java.lang.Object");
    }
}
