package com.avito.android.mortgage.pre_approval.form.list.items.chips;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.pre_approval.form.list.items.chips.c;
import com.avito.android.mortgage.pre_approval.form.list.items.chips.payload.a;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: ChipsPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/list/items/chips/e;", "LTV0/f;", "Lcom/avito/android/mortgage/pre_approval/form/list/items/chips/g;", "Lcom/avito/android/mortgage/pre_approval/form/list/items/chips/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements TV0.f<g, c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<Q00.a, G0> f201752b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super Q00.a, G0> lVar) {
        this.f201752b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        c cVar = (c) aVar;
        gVar.D(cVar.f201744c);
        ArrayList arrayList = cVar.f201745d;
        gVar.C1(arrayList);
        c.a aVar2 = cVar.f201746e;
        gVar.db(aVar2 != null ? Integer.valueOf(arrayList.indexOf(aVar2)) : null);
        gVar.G2(cVar.f201747f);
        gVar.E1(new d(this, cVar));
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
        if (!(obj instanceof List)) {
            obj = null;
        }
        Iterable<com.avito.android.mortgage.pre_approval.form.list.items.chips.payload.a> iterable = (List) obj;
        if (iterable == null) {
            iterable = C42784z0.f406748b;
        }
        for (com.avito.android.mortgage.pre_approval.form.list.items.chips.payload.a aVar2 : iterable) {
            if (aVar2 instanceof a.C5983a) {
                a.C5983a c5983a = (a.C5983a) aVar2;
                gVar.C1(c5983a.f201757a);
                c.a aVar3 = c5983a.f201758b;
                gVar.db(aVar3 != null ? Integer.valueOf(c5983a.f201757a.indexOf(aVar3)) : null);
            } else if (aVar2 instanceof a.c) {
                a.c cVar = (a.c) aVar2;
                c.a aVar4 = cVar.f201761b;
                gVar.db(aVar4 != null ? Integer.valueOf(cVar.f201760a.indexOf(aVar4)) : null);
            } else if (aVar2 instanceof a.b) {
                gVar.G2(((a.b) aVar2).f201759a);
            }
        }
    }
}
