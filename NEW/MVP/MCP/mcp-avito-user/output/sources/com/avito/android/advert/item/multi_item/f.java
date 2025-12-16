package com.avito.android.advert.item.multi_item;

import Sa.InterfaceC15166a;
import Y61.k;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.advert_multi_items.AdvertDetailsMultiItemState;
import com.avito.android.util.y6;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.konveyor.a;
import com.avito.konveyor.adapter.h;
import com.avito.konveyor.adapter.j;
import com.avito.konveyor.exception.BlueprintCollisionException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsMultiItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/multi_item/f;", "Lcom/avito/android/advert/item/multi_item/d;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f extends com.avito.konveyor.adapter.b implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final b f77732b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final RecyclerView f77733c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final h f77734d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final j f77735e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public List<? extends ParcelableItem> f77736f;

    public f(@k TV0.b<?, ?> bVar, @k TV0.b<?, ?> bVar2, @k b bVar3, @k View view) throws BlueprintCollisionException {
        super(view);
        this.f77732b = bVar3;
        View viewFindViewById = view.findViewById(R.id.multi_item_params_list);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f77733c = recyclerView;
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        c10493a.b(bVar2);
        com.avito.konveyor.a aVarA = c10493a.a();
        h hVar = new h(aVarA, aVarA, null, 4, null);
        this.f77734d = hVar;
        j jVar = new j(hVar, aVarA);
        this.f77735e = jVar;
        recyclerView.setAdapter(jVar);
        recyclerView.l(new com.avito.android.ui.h(0, 0, 0, y6.b(10), 7, null), -1);
    }

    @Override // com.avito.android.advert.item.multi_item.d
    @k
    public final AdvertDetailsMultiItemState.ParamsItemState Sw() {
        List list = this.f77736f;
        if (list == null) {
            list = C42784z0.f406748b;
        }
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            Object objP = this.f77733c.P(i12);
            AdvertDetailsMultiItemState.ParamState paramStateQU = null;
            if (objP != null) {
                InterfaceC15166a interfaceC15166a = objP instanceof InterfaceC15166a ? (InterfaceC15166a) objP : null;
                if (interfaceC15166a != null) {
                    paramStateQU = interfaceC15166a.qU();
                }
            }
            arrayList.add(paramStateQU);
        }
        return new AdvertDetailsMultiItemState.ParamsItemState(arrayList);
    }

    @Override // com.avito.konveyor.util.d
    public final void kD(TV0.a aVar) {
        List<ParcelableItem> list = ((AdvertDetailsMultiItemItem) aVar).f77717d;
        this.f77736f = list;
        this.f77734d.f338510e = new UV0.c(list);
        this.f77735e.notifyDataSetChanged();
        b bVar = this.f77732b;
        AdvertDetailsMultiItemState.ParamsItemState paramsItemState = bVar.f77727a;
        bVar.f77727a = null;
        if (paramsItemState != null) {
            RecyclerView recyclerView = this.f77733c;
            recyclerView.addOnLayoutChangeListener(new e(recyclerView, this, paramsItemState));
        }
    }
}
