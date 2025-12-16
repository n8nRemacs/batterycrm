package com.avito.android.comparison.mvi;

import Rq.b;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ComparisonActor.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LRq/b;", "change", "Lkotlin/G0;", "accept", "(LRq/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class i<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f124135b;

    public i(m mVar) {
        this.f124135b = mVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        T t12;
        T next;
        Rq.b bVar = (Rq.b) obj;
        if (bVar instanceof b.c) {
            m mVar = this.f124135b;
            Integer numP0 = mVar.f124147g.P0();
            Sq.j jVar = ((b.c) bVar).f14677a;
            Iterator<T> it = jVar.f15164b.iterator();
            while (true) {
                t12 = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                TV0.a aVar = (TV0.a) next;
                if ((aVar instanceof com.avito.android.comparison.items.header_item.b) && L.f(((com.avito.android.comparison.items.header_item.b) aVar).f123952d, mVar.f124148h)) {
                    break;
                }
            }
            boolean z12 = next == null;
            if (numP0 != null) {
                io.reactivex.rxjava3.subjects.b<Integer> bVar2 = mVar.f124147g;
                if (z12) {
                    bVar2.onNext(-1);
                    mVar.f124148h = null;
                    return;
                }
                if (numP0.intValue() != -1) {
                    List<TV0.a> list = jVar.f15164b;
                    if (list.size() > 1) {
                        Iterator<T> it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            T next2 = it2.next();
                            if (((TV0.a) next2) instanceof com.avito.android.comparison.items.header_item.b) {
                                t12 = next2;
                                break;
                            }
                        }
                        bVar2.onNext(Integer.valueOf(list.indexOf((TV0.a) t12)));
                        return;
                    }
                }
                bVar2.onNext(-1);
                mVar.f124148h = null;
            }
        }
    }
}
