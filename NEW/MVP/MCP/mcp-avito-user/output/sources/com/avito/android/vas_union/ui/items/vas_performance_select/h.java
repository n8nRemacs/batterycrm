package com.avito.android.vas_union.ui.items.vas_performance_select;

import Y41.l;
import com.avito.android.vas_union.ui.items.vas_performance_select.c;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: VasUnionV2PerformanceSelectItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_union/ui/items/vas_performance_select/h;", "Lcom/avito/android/vas_union/ui/items/vas_performance_select/f;", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h implements f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l<c.a, G0> f323365b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public h(@com.avito.android.vas_union.di.h @Y61.k l<? super c.a, G0> lVar) {
        this.f323365b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        Object next;
        j jVar = (j) eVar;
        List<c.a> list = ((c) aVar).f323347c;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((c.a) next).f323350c) {
                    break;
                }
            }
        }
        c.a aVar2 = (c.a) next;
        if (aVar2 == null) {
            aVar2 = (c.a) C42745f0.E(list);
        }
        jVar.tP(aVar2.f323351d != null);
        jVar.aV(list, aVar2, new g(1, this.f323365b, l.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 0));
    }
}
