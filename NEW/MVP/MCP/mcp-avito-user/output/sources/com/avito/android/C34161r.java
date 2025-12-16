package com.avito.android;

import com.avito.android.util.InterfaceC35950u;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;

/* compiled from: AvitoFeatures.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/r;", "Lcom/avito/android/p;", "_common_features_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.r, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C34161r implements InterfaceC32948p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C34157q f246393a;

    /* compiled from: AvitoFeatures.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.r$a */
    public /* synthetic */ class a extends kotlin.jvm.internal.H implements Y41.l<DE0.a<? extends Object>, DE0.a<? extends Object>> {
        @Override // Y41.l
        public final DE0.a<? extends Object> invoke(DE0.a<? extends Object> aVar) {
            return ((InterfaceC36170z0) this.receiver).decorate(aVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x009b, code lost:
    
        r4.put(r0.getClass().getName(), r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C34161r(@Y61.k com.avito.android.util.InterfaceC35950u r9, @Y61.k java.util.Set<? extends com.avito.android.B0> r10, @Y61.k java.util.List<? extends com.avito.android.InterfaceC36170z0> r11) {
        /*
            r8 = this;
            r8.<init>()
            com.avito.android.q r0 = new com.avito.android.q
            r0.<init>()
            r8.f246393a = r0
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L10:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto La8
            java.lang.Object r0 = r10.next()
            com.avito.android.B0 r0 = (com.avito.android.B0) r0
            com.avito.android.A0 r0 = r0.a(r9)
            com.avito.android.q r1 = r8.f246393a
            r1.getClass()
            java.util.LinkedHashMap r2 = r0.f67174a
            java.util.Collection r2 = r2.values()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r2 = kotlin.collections.C42745f0.M0(r2)
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L3b:
            boolean r3 = r2.hasNext()
            java.util.LinkedHashMap r4 = r1.f246155a
            if (r3 == 0) goto L9b
            java.lang.Object r3 = r2.next()
            DE0.a r3 = (DE0.a) r3
            java.lang.String r5 = r3.getF3108c()
            java.util.Collection r4 = r4.values()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r4 = r4.iterator()
        L5c:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L76
            java.lang.Object r7 = r4.next()
            com.avito.android.A0 r7 = (com.avito.android.A0) r7
            java.util.LinkedHashMap r7 = r7.f67174a
            java.lang.Object r7 = r7.get(r5)
            DE0.a r7 = (DE0.a) r7
            if (r7 == 0) goto L5c
            r6.add(r7)
            goto L5c
        L76:
            java.lang.Object r4 = kotlin.collections.C42745f0.G(r6)
            DE0.a r4 = (DE0.a) r4
            if (r4 != 0) goto L7f
            goto L3b
        L7f:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Duplicate toggles: "
            r9.<init>(r10)
            java.lang.String r10 = r3.getF3108c()
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        L9b:
            java.lang.Class r1 = r0.getClass()
            java.lang.String r1 = r1.getName()
            r4.put(r1, r0)
            goto L10
        La8:
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r9 = r11.iterator()
        Lae:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L109
            java.lang.Object r10 = r9.next()
            r2 = r10
            com.avito.android.z0 r2 = (com.avito.android.InterfaceC36170z0) r2
            com.avito.android.r$a r10 = new com.avito.android.r$a
            java.lang.String r5 = "decorate(Lcom/avito/android/toggle/Feature;)Lcom/avito/android/toggle/Feature;"
            r6 = 0
            r1 = 1
            java.lang.Class<com.avito.android.z0> r3 = com.avito.android.InterfaceC36170z0.class
            java.lang.String r4 = "decorate"
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            com.avito.android.q r11 = r8.f246393a
            java.util.LinkedHashMap r11 = r11.f246155a
            java.util.Collection r11 = r11.values()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
        Ld7:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto Lae
            java.lang.Object r0 = r11.next()
            com.avito.android.A0 r0 = (com.avito.android.A0) r0
            java.util.LinkedHashMap r0 = r0.f67174a
            java.util.Set r1 = r0.entrySet()
            java.util.Iterator r1 = r1.iterator()
        Led:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Ld7
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            java.lang.Object r2 = r10.invoke(r2)
            r0.put(r3, r2)
            goto Led
        L109:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.C34161r.<init>(com.avito.android.util.u, java.util.Set, java.util.List):void");
    }

    @Override // com.avito.android.InterfaceC32948p
    @Y61.k
    public final List<DE0.a<Object>> a() {
        return this.f246393a.a();
    }

    public C34161r(InterfaceC35950u interfaceC35950u, Set set, List list, int i12, C42822w c42822w) {
        this(interfaceC35950u, set, (i12 & 4) != 0 ? C42784z0.f406748b : list);
    }
}
