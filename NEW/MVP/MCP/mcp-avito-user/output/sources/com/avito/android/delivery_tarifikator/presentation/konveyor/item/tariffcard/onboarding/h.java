package com.avito.android.delivery_tarifikator.presentation.konveyor.item.tariffcard.onboarding;

import Ov.C14740c;
import Ov.i;
import Y61.k;
import Yv.C18330a;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.w;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.button.Button;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: TariffCardOnboardingView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/tariffcard/onboarding/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/tariffcard/onboarding/g;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f135495b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Badge f135496c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Button f135497d;

    /* compiled from: TariffCardOnboardingView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ w f135498l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ i f135499m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w wVar, i iVar) {
            super(0);
            this.f135498l = wVar;
            this.f135499m = iVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f135498l.i7(this.f135499m.f12693b);
            return G0.f406611a;
        }
    }

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.item_tariff_card_onboarding_text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f135495b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.item_tariff_card_onboarding_badge);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.badge.Badge");
        }
        this.f135496c = (Badge) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.item_tariff_card_onboarding_btn);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f135497d = (Button) viewFindViewById3;
        C18330a.c(this.itemView);
    }

    @Override // com.avito.android.delivery_tarifikator.presentation.konveyor.item.tariffcard.onboarding.g
    public final void s20(@k c cVar, @k w wVar) {
        C14740c c14740c = cVar.f135491c;
        C18330a.b(this.f135495b, c14740c.f12677a, wVar);
        com.avito.android.lib.design.badge.h.a(this.f135496c, c14740c.f12678b);
        i iVar = c14740c.f12679c;
        int i12 = iVar != null ? 0 : 8;
        Button button = this.f135497d;
        button.setVisibility(i12);
        if (iVar != null) {
            button.setState(new UU.a(iVar.f12692a, null, false, false, false, new a(wVar, iVar), null, null, null, false, 990, null));
        }
    }
}
