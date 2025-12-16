package com.avito.android.crm_candidates.domain;

import Us.InterfaceC15563a;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.crm_candidates.features.full_filters.entity.FilterItem;
import com.avito.android.crm_candidates.view.list_items.list_filter.JobCrmListFilterItem;
import com.avito.android.di.B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: FullFilterListInteractor.kt */
@B
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/domain/c;", "LUs/a;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements InterfaceC15563a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<FilterItem> f129356a;

    /* compiled from: FullFilterListInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.android.crm_candidates.domain.FullFilterListInteractor", f = "FullFilterListInteractor.kt", i = {0}, l = {45}, m = "clearAll", n = {"this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public c f129357q;

        /* renamed from: r, reason: collision with root package name */
        public Iterator f129358r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f129359s;

        /* renamed from: u, reason: collision with root package name */
        public int f129361u;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f129359s = obj;
            this.f129361u |= BeduinInputModel.MIN_TEXT_VERSION;
            return c.this.l(this);
        }
    }

    @Inject
    public c(@Y61.k List<FilterItem> list) {
        this.f129356a = list;
    }

    @Override // Us.InterfaceC15563a
    @Y61.k
    public final List<JobCrmListFilterItem> c(@Y61.k String str) {
        Object next;
        Iterator<T> it = this.f129356a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((FilterItem) next).f129564b, str)) {
                break;
            }
        }
        FilterItem filterItem = (FilterItem) next;
        return filterItem == null ? C42784z0.f406748b : filterItem.f129567e;
    }

    @Override // Us.InterfaceC15563a
    @Y61.l
    public final Object getAll() {
        return this.f129356a;
    }

    @Override // Us.InterfaceC15563a
    @Y61.l
    public final G0 h(@Y61.k String str) {
        if (L.f(str, "date") || L.f(str, "statuses")) {
            return G0.f406611a;
        }
        List<FilterItem> list = this.f129356a;
        Iterator<FilterItem> it = list.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            if (L.f(it.next().f129564b, str)) {
                break;
            }
            i12++;
        }
        if (i12 != -1) {
            FilterItem filterItem = list.get(i12);
            List<JobCrmListFilterItem> list2 = filterItem.f129567e;
            ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(JobCrmListFilterItem.a((JobCrmListFilterItem) it2.next(), false, null, null, 503));
            }
            list.set(i12, FilterItem.a(filterItem, arrayList));
        }
        return G0.f406611a;
    }

    @Override // Us.InterfaceC15563a
    @Y61.l
    public final G0 k(@Y61.k List list) {
        List<FilterItem> list2 = this.f129356a;
        list2.clear();
        list2.addAll(list);
        return G0.f406611a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Us.InterfaceC15563a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(@Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.avito.android.crm_candidates.domain.c.a
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.crm_candidates.domain.c$a r0 = (com.avito.android.crm_candidates.domain.c.a) r0
            int r1 = r0.f129361u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129361u = r1
            goto L1a
        L13:
            com.avito.android.crm_candidates.domain.c$a r0 = new com.avito.android.crm_candidates.domain.c$a
            kotlin.coroutines.jvm.internal.ContinuationImpl r6 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r6
            r0.<init>(r6)
        L1a:
            java.lang.Object r6 = r0.f129359s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f129361u
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.util.Iterator r2 = r0.f129358r
            com.avito.android.crm_candidates.domain.c r4 = r0.f129357q
            kotlin.C42729a0.b(r6)
            goto L65
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L37:
            kotlin.C42729a0.b(r6)
            java.util.List<com.avito.android.crm_candidates.features.full_filters.entity.FilterItem> r6 = r5.f129356a
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.C42745f0.q(r6, r4)
            r2.<init>(r4)
            java.util.Iterator r6 = r6.iterator()
        L4d:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L5f
            java.lang.Object r4 = r6.next()
            com.avito.android.crm_candidates.features.full_filters.entity.FilterItem r4 = (com.avito.android.crm_candidates.features.full_filters.entity.FilterItem) r4
            java.lang.String r4 = r4.f129564b
            r2.add(r4)
            goto L4d
        L5f:
            java.util.Iterator r6 = r2.iterator()
            r4 = r5
            r2 = r6
        L65:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L7e
            java.lang.Object r6 = r2.next()
            java.lang.String r6 = (java.lang.String) r6
            r0.f129357q = r4
            r0.f129358r = r2
            r0.f129361u = r3
            kotlin.G0 r6 = r4.h(r6)
            if (r6 != r1) goto L65
            return r1
        L7e:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.crm_candidates.domain.c.l(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // Us.InterfaceC15563a
    @Y61.l
    public final G0 o(@Y61.k String str, @Y61.k List list) {
        List<FilterItem> list2 = this.f129356a;
        Iterator<FilterItem> it = list2.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            if (L.f(it.next().f129564b, str)) {
                break;
            }
            i12++;
        }
        if (i12 != -1) {
            list2.set(i12, new FilterItem(str, list2.get(i12).f129565c, list2.get(i12).f129566d, list));
        }
        return G0.f406611a;
    }
}
