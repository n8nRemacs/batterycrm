package com.avito.android.advert_stats.item;

import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: PlotItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_stats/item/s;", "Lcom/avito/android/advert_stats/item/p;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert_stats.item.s, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28339s implements InterfaceC28337p {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28333l f86793b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b<O> f86794c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<C28322a> f86795d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f86796e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public u f86797f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public Object f86798g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f86799h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b f86800i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f86801j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f86802k;

    @Inject
    public C28339s(@Y61.k InterfaceC28333l interfaceC28333l) {
        this.f86793b = interfaceC28333l;
        com.jakewharton.rxrelay3.b<O> bVar = new com.jakewharton.rxrelay3.b<>();
        this.f86794c = bVar;
        com.jakewharton.rxrelay3.c<C28322a> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f86795d = cVar;
        com.jakewharton.rxrelay3.c<G0> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f86796e = cVar2;
        this.f86798g = C42784z0.f406748b;
        this.f86799h = true;
        this.f86800i = bVar;
        this.f86801j = cVar;
        this.f86802k = cVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        kotlin.Q q12;
        u uVar = (u) eVar;
        this.f86797f = uVar;
        ArrayList arrayList = ((C28336o) aVar).f86779b;
        this.f86798g = arrayList;
        uVar.N(this.f86793b.getF86775d());
        uVar.ld(new C28338q(arrayList, this));
        Iterator it = arrayList.iterator();
        int i13 = 0;
        while (true) {
            q12 = null;
            Object obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int i14 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            Iterator it2 = ((O) next).f86701c.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (((C28322a) next2).f86720e == BarState.f86679c) {
                    obj = next2;
                    break;
                }
            }
            C28322a c28322a = (C28322a) obj;
            if (c28322a != null) {
                q12 = new kotlin.Q(Integer.valueOf(i13), c28322a);
                break;
            }
            i13 = i14;
        }
        uVar.id(arrayList, q12 != null);
        com.jakewharton.rxrelay3.b<O> bVar = this.f86794c;
        if (q12 != null) {
            int iIntValue = ((Number) q12.f406619b).intValue();
            C28322a c28322a2 = (C28322a) q12.f406620c;
            bVar.accept(arrayList.get(iIntValue));
            this.f86795d.accept(c28322a2);
            uVar.P4(iIntValue);
        } else {
            bVar.accept(C42745f0.E(arrayList));
        }
        uVar.Gb(new r(this, uVar));
    }

    @Override // com.avito.android.advert_stats.item.InterfaceC28337p
    @Y61.k
    /* renamed from: V6, reason: from getter */
    public final com.jakewharton.rxrelay3.b getF86800i() {
        return this.f86800i;
    }

    @Override // com.avito.android.advert_stats.item.InterfaceC28337p
    @Y61.k
    /* renamed from: f4, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF86801j() {
        return this.f86801j;
    }

    @Override // com.avito.android.advert_stats.item.InterfaceC28337p
    @Y61.k
    /* renamed from: j3, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF86802k() {
        return this.f86802k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.List] */
    @Override // com.avito.android.advert_stats.item.InterfaceC28331j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(@Y61.k com.avito.android.advert_stats.item.C28322a r8) {
        /*
            r7 = this;
            com.avito.android.advert_stats.item.BarState r0 = r8.f86720e
            com.avito.android.advert_stats.item.BarState r1 = com.avito.android.advert_stats.item.BarState.f86679c
            if (r0 == r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto L11
            com.jakewharton.rxrelay3.c<com.avito.android.advert_stats.item.a> r1 = r7.f86795d
            r1.accept(r8)
            goto L20
        L11:
            com.jakewharton.rxrelay3.b<com.avito.android.advert_stats.item.O> r1 = r7.f86794c
            java.util.concurrent.atomic.AtomicReference<T> r2 = r1.f364266b
            java.lang.Object r2 = r2.get()
            com.avito.android.advert_stats.item.O r2 = (com.avito.android.advert_stats.item.O) r2
            if (r2 == 0) goto L20
            r1.accept(r2)
        L20:
            if (r0 == 0) goto L25
            com.avito.android.advert_stats.item.BarState r1 = com.avito.android.advert_stats.item.BarState.f86680d
            goto L27
        L25:
            com.avito.android.advert_stats.item.BarState r1 = com.avito.android.advert_stats.item.BarState.f86678b
        L27:
            java.lang.Object r2 = r7.f86798g
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L2f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L62
            java.lang.Object r3 = r2.next()
            com.avito.android.advert_stats.item.O r3 = (com.avito.android.advert_stats.item.O) r3
            java.util.ArrayList r3 = r3.f86701c
            java.util.Iterator r3 = r3.iterator()
        L41:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L2f
            java.lang.Object r4 = r3.next()
            com.avito.android.advert_stats.item.a r4 = (com.avito.android.advert_stats.item.C28322a) r4
            java.lang.String r5 = r4.f86717b
            java.lang.String r6 = r8.f86717b
            boolean r5 = kotlin.jvm.internal.L.f(r5, r6)
            if (r5 == 0) goto L5e
            com.avito.android.advert_stats.item.BarState r5 = r8.f86720e
            com.avito.android.advert_stats.item.BarState r6 = com.avito.android.advert_stats.item.BarState.f86679c
            if (r5 == r6) goto L5e
            goto L5f
        L5e:
            r6 = r1
        L5f:
            r4.f86720e = r6
            goto L41
        L62:
            com.avito.android.advert_stats.item.u r1 = r7.f86797f
            if (r1 == 0) goto L6b
            java.lang.Object r2 = r7.f86798g
            r1.id(r2, r0)
        L6b:
            com.avito.android.advert_stats.item.u r1 = r7.f86797f
            if (r1 == 0) goto L74
            int r8 = r8.f86721f
            r1.mU(r8, r0)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert_stats.item.C28339s.k(com.avito.android.advert_stats.item.a):void");
    }
}
