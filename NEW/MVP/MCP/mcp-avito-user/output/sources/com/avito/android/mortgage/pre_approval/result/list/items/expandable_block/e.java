package com.avito.android.mortgage.pre_approval.result.list.items.expandable_block;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.pre_approval.result.list.items.expandable_block.payloads.a;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: ExpandableBlockPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/result/list/items/expandable_block/e;", "LTV0/f;", "Lcom/avito/android/mortgage/pre_approval/result/list/items/expandable_block/g;", "Lcom/avito/android/mortgage/pre_approval/result/list/items/expandable_block/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements TV0.f<g, c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<W00.a, G0> f202048b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super W00.a, G0> lVar) {
        this.f202048b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        c cVar = (c) aVar;
        gVar.setTitle(cVar.f202044b);
        gVar.h(cVar.f202045c);
        gVar.b80(cVar.f202046d);
        gVar.Ae(new d(this));
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        g gVar = (g) eVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof List) {
                obj = obj2;
            }
        }
        Iterable<com.avito.android.mortgage.pre_approval.result.list.items.expandable_block.payloads.a> iterable = (List) (obj instanceof List ? obj : null);
        if (iterable == null) {
            iterable = C42784z0.f406748b;
        }
        for (com.avito.android.mortgage.pre_approval.result.list.items.expandable_block.payloads.a aVar2 : iterable) {
            if (aVar2 instanceof a.C5997a) {
                gVar.zd(((a.C5997a) aVar2).f202054a);
            }
        }
    }
}
