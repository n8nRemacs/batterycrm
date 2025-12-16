package com.avito.android.delivery_tarifikator.domain;

import Ov.C14738a;
import Ov.C14739b;
import com.squareup.anvil.annotations.ContributesBinding;
import cw.C39420a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;

/* compiled from: TariffsRepository.kt */
@kotlin.jvm.internal.s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/i0;", "Lcom/avito/android/delivery_tarifikator/domain/h0;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes12.dex */
public final class i0 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d0 f135288a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f135289b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f135290c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ArrayList f135291d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ArrayList f135292e = new ArrayList();

    /* compiled from: TariffsRepository.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends kotlin.jvm.internal.H implements Y41.l<String, C14738a> {
        @Override // Y41.l
        public final C14738a invoke(String str) {
            return (C14738a) ((Map) this.receiver).get(str);
        }
    }

    @Inject
    public i0(@Y61.k d0 d0Var) {
        this.f135288a = d0Var;
    }

    @Override // com.avito.android.delivery_tarifikator.domain.h0
    public final void a(@Y61.k C39420a c39420a) {
        LinkedHashMap linkedHashMap = this.f135289b;
        linkedHashMap.clear();
        LinkedHashMap linkedHashMap2 = this.f135290c;
        linkedHashMap2.clear();
        ArrayList arrayList = this.f135291d;
        arrayList.clear();
        ArrayList arrayList2 = this.f135292e;
        arrayList2.clear();
        List<cw.e> listJ = c39420a.j();
        d0 d0Var = this.f135288a;
        List<C14738a> listB = d0Var.b(listJ);
        int iF2 = P0.f(C42745f0.q(listB, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iF2);
        for (Object obj : listB) {
            linkedHashMap3.put(((C14738a) obj).f12667h, obj);
        }
        linkedHashMap.putAll(linkedHashMap3);
        List listC = d0Var.c(new a(1, linkedHashMap, Map.class, "get", "get(Ljava/lang/Object;)Ljava/lang/Object;", 0), c39420a.b());
        List list = listC;
        int iF3 = P0.f(C42745f0.q(list, 10));
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(iF3 < 16 ? 16 : iF3);
        for (Object obj2 : list) {
            linkedHashMap4.put(Long.valueOf(((C14739b) obj2).f12676i), obj2);
        }
        linkedHashMap2.putAll(linkedHashMap4);
        arrayList2.addAll(listC);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list) {
            if (((C14739b) obj3).f12673f) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : listB) {
            C14738a c14738a = (C14738a) obj4;
            if (c14738a.f12662c && !c14738a.f12665f) {
                arrayList4.add(obj4);
            }
        }
        C42745f0.h(C42745f0.h0(arrayList4, arrayList3), arrayList);
    }

    @Override // com.avito.android.delivery_tarifikator.domain.h0
    public final void b(@Y61.k C14739b c14739b) {
        long j12;
        ArrayList arrayList = this.f135292e;
        Iterator it = arrayList.iterator();
        int i12 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            j12 = c14739b.f12676i;
            if (!zHasNext) {
                i12 = -1;
                break;
            } else if (((C14739b) it.next()).f12676i == j12) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 < 0) {
            c(c14739b);
            return;
        }
        this.f135290c.put(Long.valueOf(j12), c14739b);
        this.f135291d.set(i12, c14739b);
        arrayList.set(i12, c14739b);
    }

    @Override // com.avito.android.delivery_tarifikator.domain.h0
    public final void c(@Y61.k C14739b c14739b) {
        this.f135290c.put(Long.valueOf(c14739b.f12676i), c14739b);
        ArrayList arrayList = this.f135292e;
        this.f135291d.add(arrayList.size(), c14739b);
        arrayList.add(c14739b);
    }

    @Override // com.avito.android.delivery_tarifikator.domain.h0
    @Y61.k
    public final List<C14739b> d() {
        return C42745f0.M0(this.f135292e);
    }

    @Override // com.avito.android.delivery_tarifikator.domain.h0
    public final void e(long j12) {
        C14739b c14739bH = h(j12);
        if (c14739bH == null) {
            return;
        }
        this.f135290c.remove(Long.valueOf(j12));
        this.f135291d.remove(c14739bH);
        this.f135292e.remove(c14739bH);
    }

    @Override // com.avito.android.delivery_tarifikator.domain.h0
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final ArrayList getF135291d() {
        return this.f135291d;
    }

    @Override // com.avito.android.delivery_tarifikator.domain.h0
    @Y61.l
    public final C14738a g(@Y61.k String str) {
        return (C14738a) this.f135289b.get(str);
    }

    @Override // com.avito.android.delivery_tarifikator.domain.h0
    @Y61.l
    public final C14739b h(long j12) {
        return (C14739b) this.f135290c.get(Long.valueOf(j12));
    }
}
