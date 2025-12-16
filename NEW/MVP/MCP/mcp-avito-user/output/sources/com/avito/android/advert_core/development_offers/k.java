package com.avito.android.advert_core.development_offers;

import Y61.l;
import android.graphics.Rect;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.advert.item.Z0;
import com.avito.android.advert.item.compatibility.v2.m;
import com.avito.android.remote.model.DevelopmentOffers;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: DevelopmentOffersItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/development_offers/k;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_core/development_offers/j;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class k extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f83338e = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f83339b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f83340c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f83341d;

    /* compiled from: DevelopmentOffersItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/advert_core/development_offers/k$a", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends RecyclerView.l {

        /* renamed from: b, reason: collision with root package name */
        public final int f83342b;

        /* renamed from: c, reason: collision with root package name */
        public final int f83343c;

        public a(View view) {
            this.f83342b = com.avito.android.actions_sheet.a.d(view, R.dimen.content_horizontal_padding);
            this.f83343c = view.getContext().getResources().getDimensionPixelSize(R.dimen.development_offers_carousel_padding) / 2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
            recyclerView.getClass();
            int iU2 = RecyclerView.U(view);
            int i12 = this.f83342b;
            int i13 = this.f83343c;
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

    public k(@Y61.k View view) {
        super(view);
        this.f83339b = (TextView) view.findViewById(R.id.development_offers_item_title);
        this.f83340c = (TextView) view.findViewById(R.id.development_offers_item_button);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.development_offers_item_carousel);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.l(new a(view), -1);
        this.f83341d = recyclerView;
    }

    @Override // com.avito.android.advert_core.development_offers.j
    public final void LQ(@Y61.k DevelopmentOffers developmentOffers, @l Z0 z02, @Y61.k Y41.l lVar) {
        I5.a(this.f83339b, developmentOffers.getTitle(), false);
        String offersButtonTitle = developmentOffers.getOffersButtonTitle();
        TextView textView = this.f83340c;
        I5.a(textView, offersButtonTitle, false);
        textView.setOnClickListener(new m(5, lVar));
        this.f83341d.setAdapter(new b(developmentOffers.getOffers(), z02, lVar, developmentOffers.getCarouselPhoneBanner(), developmentOffers.getCarouselPhoneUri()));
    }
}
