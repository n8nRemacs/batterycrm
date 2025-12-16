package com.avito.android.advert.item.leasing_beduin;

import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bj.InterfaceC25659b;
import com.avito.android.R;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_shared.model.utils.j;
import com.avito.android.beduin_shared.model.utils.l;
import dj.InterfaceC39736a;
import gj.InterfaceC40691b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import lj.InterfaceC43779a;

/* compiled from: AdvertDetailsLeasingBeduinItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/leasing_beduin/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/leasing_beduin/f;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC39736a f77351b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f77352c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC43779a f77353d;

    public g(@k View view, @k InterfaceC25659b interfaceC25659b, @k InterfaceC39736a interfaceC39736a, @k InterfaceC40691b interfaceC40691b) {
        super(view);
        this.f77351b = interfaceC39736a;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f77352c = cVar;
        InterfaceC43779a interfaceC43779aJ = interfaceC40691b.j();
        this.f77353d = interfaceC43779aJ;
        View viewFindViewById = view.findViewById(R.id.beduin_leasing);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        com.avito.android.beduin.common.component.adapter.a aVarB = interfaceC25659b.b(null);
        aVarB.f100611g = interfaceC39736a;
        this.itemView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(aVarB);
        l.a(interfaceC43779aJ.getF103348p(), aVarB, cVar);
    }

    @Override // com.avito.android.advert.item.leasing_beduin.f
    public final void EQ(@k List<? extends BeduinModel> list) {
        j.b(this.f77353d, "beduinLeasing", list);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f77352c.e();
    }
}
