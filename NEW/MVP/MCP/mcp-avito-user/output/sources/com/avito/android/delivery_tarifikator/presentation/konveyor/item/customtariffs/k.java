package com.avito.android.delivery_tarifikator.presentation.konveyor.item.customtariffs;

import Oi0.InterfaceC14697a;
import Rv.C15084a;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.I5;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CustomTariffsView.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/customtariffs/k;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/customtariffs/j;", "LOi0/a;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class k extends com.avito.konveyor.adapter.b implements j, InterfaceC14697a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.d f135379b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f135380c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f135381d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f135382e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Button f135383f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public e f135384g;

    public k(@Y61.k com.avito.konveyor.adapter.d dVar, @Y61.k RecyclerView.l lVar, @Y61.k View view) {
        super(view);
        this.f135379b = dVar;
        View viewFindViewById = view.findViewById(R.id.item_custom_tariffs_recycler);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f135380c = recyclerView;
        View viewFindViewById2 = view.findViewById(R.id.item_custom_tariffs_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f135381d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.item_custom_tariffs_description);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f135382e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.item_custom_tariffs_create_btn);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById4;
        this.f135383f = button;
        view.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        dVar.setHasStableIds(true);
        recyclerView.setItemAnimator(null);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(dVar);
        recyclerView.l(lVar, -1);
        button.setOnClickListener(new com.avito.android.comfortable_deal.deal.item.agent.h(this, 24));
    }

    @Override // com.avito.konveyor.adapter.b, Oi0.InterfaceC14697a
    public final void destroy() {
        this.f135380c.setAdapter(null);
    }

    @Override // com.avito.android.delivery_tarifikator.presentation.konveyor.item.customtariffs.j
    public final void gK(@Y61.k d dVar, @l C15084a.C0992a c0992a) {
        if (c0992a == null) {
            String str = dVar.f135367e;
            if (str != null) {
                com.avito.android.lib.design.badge.e.d(this.f135381d, dVar.f135366d, str, R.style.Re23_Badge_TextRedS, null, 56);
            } else {
                this.f135381d.setText(dVar.f135366d);
            }
        }
        if (c0992a == null || c0992a.f14729a.f318649a) {
            I5.a(this.f135382e, dVar.f135368f, false);
        }
        Button button = this.f135383f;
        if (c0992a == null || c0992a.f14730b.f318649a) {
            button.setEnabled(!dVar.f135370h);
        }
        this.f135379b.l(dVar.f135365c, new com.avito.android.app.coldstart.d(this, 18));
        button.setVisibility(dVar.f135369g ? 0 : 8);
    }

    @Override // com.avito.android.delivery_tarifikator.presentation.konveyor.item.customtariffs.j
    public final void rA(@Y61.k e eVar) {
        this.f135384g = eVar;
    }
}
