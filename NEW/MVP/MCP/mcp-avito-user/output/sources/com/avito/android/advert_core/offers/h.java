package com.avito.android.advert_core.offers;

import Y61.k;
import Y61.l;
import android.graphics.Rect;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.advert.item.compatibility.v2.m;
import com.avito.android.advert_core.offers.items.OfferItem;
import com.avito.android.util.I5;
import com.avito.konveyor.adapter.j;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: OffersItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_core/offers/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_core/offers/g;", "a", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f83818g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final I9.a f83819b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f83820c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f83821d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.h f83822e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final j f83823f;

    /* compiled from: OffersItemView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/advert_core/offers/h$a;", "", "<init>", "()V", "", "OFFER_BUTTON_POSITION", "I", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: OffersItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/advert_core/offers/h$b", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends RecyclerView.l {

        /* renamed from: b, reason: collision with root package name */
        public final int f83824b;

        /* renamed from: c, reason: collision with root package name */
        public final int f83825c;

        public b(View view) {
            this.f83824b = com.avito.android.actions_sheet.a.d(view, R.dimen.content_horizontal_padding);
            this.f83825c = view.getContext().getResources().getDimensionPixelSize(R.dimen.offers_carousel_padding) / 2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
            recyclerView.getClass();
            int iU2 = RecyclerView.U(view);
            int i12 = this.f83824b;
            int i13 = this.f83825c;
            if (iU2 == 0) {
                rect.left = i12;
                rect.right = i13;
            } else if (iU2 == zVar.b() - 1) {
                rect.left = i13;
                rect.right = i12;
            } else {
                rect.left = i13;
                rect.right = i13;
            }
        }
    }

    static {
        new a(null);
    }

    public h(@k View view, @k com.avito.konveyor.a aVar, @k I9.a aVar2) {
        super(view);
        this.f83819b = aVar2;
        View viewFindViewById = view.findViewById(R.id.offers_item_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f83820c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.offers_item_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f83821d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.offers_item_carousel);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById3;
        this.itemView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.l(new b(view), -1);
        com.avito.konveyor.adapter.h hVar = new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
        this.f83822e = hVar;
        j jVar = new j(hVar, aVar);
        this.f83823f = jVar;
        recyclerView.setAdapter(jVar);
    }

    @Override // com.avito.android.advert_core.offers.g
    public final void AE(@l String str) {
        I5.a(this.f83821d, str, false);
    }

    @Override // com.avito.android.advert_core.offers.g
    public final void gD(@k List<? extends OfferItem> list) {
        this.f83822e.f338510e = new UV0.c(list);
        this.f83823f.notifyDataSetChanged();
    }

    @Override // com.avito.android.advert_core.offers.g
    public final void rO(@k Y41.l<? super Integer, G0> lVar) {
        this.f83819b.k(new i(lVar));
        this.f83821d.setOnClickListener(new m(6, lVar));
    }

    @Override // com.avito.android.advert_core.offers.g
    public final void setTitle(@k String str) {
        I5.a(this.f83820c, str, false);
    }
}
