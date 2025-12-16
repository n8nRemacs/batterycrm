package com.avito.android.seller_coach.all_advices.item;

import android.view.View;
import com.avito.android.R;
import com.avito.android.seller_coach.adverts_hint.item.UserAdvertsHintItem;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AdvicesItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/seller_coach/all_advices/item/h;", "Lcom/avito/android/seller_coach/all_advices/item/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f267348b;

    /* renamed from: c, reason: collision with root package name */
    public final View f267349c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.seller_coach.adverts_hint.item.a f267350d;

    public h(@Y61.k View view) {
        super(view);
        this.f267348b = view;
        View viewFindViewById = view.findViewById(R.id.advert_hint_item);
        this.f267349c = viewFindViewById;
        this.f267350d = new com.avito.android.seller_coach.adverts_hint.item.a(viewFindViewById);
    }

    @Override // com.avito.android.seller_coach.all_advices.item.g
    public final void Cm(@Y61.k UserAdvertsHintItem userAdvertsHintItem, @Y61.k Y41.l<? super UserAdvertsHintItem, G0> lVar) {
        this.f267350d.a(userAdvertsHintItem, lVar);
    }
}
