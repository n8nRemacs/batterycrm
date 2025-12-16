package com.avito.android.auction.offer;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.progress_overlay.l;
import com.avito.android.util.y6;
import com.avito.konveyor.adapter.j;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import lD.C43617a;

/* compiled from: AuctionOfferView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auction/offer/h;", "Lcom/avito/android/auction/offer/e;", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f92523a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.h f92524b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f92525c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AuctionOfferFragment f92526d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C43617a f92527e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final j f92528f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.beduin.common.component.adapter.a f92529g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final TextView f92530h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Button f92531i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final Button f92532j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final l f92533k;

    public h(@k com.avito.konveyor.a aVar, @k View view, @k com.avito.konveyor.adapter.h hVar, @k com.avito.android.util.text.a aVar2, @k AuctionOfferFragment auctionOfferFragment, @k C43617a c43617a) {
        this.f92523a = view;
        this.f92524b = hVar;
        this.f92525c = aVar2;
        this.f92526d = auctionOfferFragment;
        this.f92527e = c43617a;
        j jVar = new j(hVar, aVar);
        this.f92528f = jVar;
        com.avito.android.beduin.common.component.adapter.a aVar3 = new com.avito.android.beduin.common.component.adapter.a(Integer.valueOf(y6.b(16)));
        this.f92529g = aVar3;
        View viewFindViewById = view.findViewById(R.id.recycler);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.terms);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f92530h = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.action_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f92531i = (Button) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.cancel_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f92532j = (Button) viewFindViewById4;
        this.f92533k = new l((ViewGroup) view, 0, null, 0, 0, 30, null);
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        if (!c43617a.w().invoke().booleanValue()) {
            recyclerView.setAdapter(jVar);
        } else {
            recyclerView.setAdapter(aVar3);
            recyclerView.setPadding(0, 0, 0, 0);
        }
    }
}
