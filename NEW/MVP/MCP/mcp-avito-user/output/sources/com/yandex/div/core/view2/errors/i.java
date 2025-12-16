package com.yandex.div.core.view2.errors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: ErrorVisualMonitor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/errors/i;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final f f369074a;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public c f369078e;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f369075b = new LinkedHashSet();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ArrayList f369076c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ArrayList f369077d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Y41.p<List<? extends Throwable>, List<? extends Throwable>, G0> f369079f = new a();

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public o f369080g = new o(false, 0, 0, null, null, 31, null);

    /* compiled from: ErrorVisualMonitor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "errors", "warnings", "Lkotlin/G0;", "invoke", "(Ljava/util/List;Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends N implements Y41.p<List<? extends Throwable>, List<? extends Throwable>, G0> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(List<? extends Throwable> list, List<? extends Throwable> list2) {
            i iVar = i.this;
            ArrayList arrayList = iVar.f369076c;
            arrayList.clear();
            arrayList.addAll(C42745f0.q0(list));
            ArrayList arrayList2 = iVar.f369077d;
            arrayList2.clear();
            arrayList2.addAll(C42745f0.q0(list2));
            o oVar = iVar.f369080g;
            ArrayList arrayList3 = iVar.f369076c;
            iVar.a(o.a(oVar, false, arrayList3.size(), arrayList2.size(), L.j(C42745f0.O(C42745f0.E0(arrayList3, 25), "\n", null, null, h.f369073l, 30), "Last 25 errors:\n"), L.j(C42745f0.O(C42745f0.E0(arrayList2, 25), "\n", null, null, j.f369082l, 30), "Last 25 warnings:\n"), 1));
            return G0.f406611a;
        }
    }

    public i(@Y61.k f fVar) {
        this.f369074a = fVar;
    }

    public final void a(o oVar) {
        this.f369080g = oVar;
        Iterator it = this.f369075b.iterator();
        while (it.hasNext()) {
            ((Y41.l) it.next()).invoke(oVar);
        }
    }
}
