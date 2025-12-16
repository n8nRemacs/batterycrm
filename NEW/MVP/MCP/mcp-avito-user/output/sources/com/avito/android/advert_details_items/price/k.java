package com.avito.android.advert_details_items.price;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.I5;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: OldPriceHintDialogFactory.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/price/k;", "Lcom/avito/android/advert_details_items/price/j;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f85208a;

    /* compiled from: OldPriceHintDialogFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ DeepLink f85209l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f85210m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ k f85211n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DeepLink deepLink, com.avito.android.lib.design.bottom_sheet.d dVar, k kVar) {
            super(0);
            this.f85209l = deepLink;
            this.f85210m = dVar;
            this.f85211n = kVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            DeepLink deepLink = this.f85209l;
            if (deepLink != null) {
                b.a.a(this.f85211n.f85208a, deepLink, null, null, 6);
            }
            this.f85210m.r();
            return G0.f406611a;
        }
    }

    @Inject
    public k(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f85208a = aVar;
    }

    @Override // com.avito.android.advert_details_items.price.j
    public final void a(@Y61.k Context context, @Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l DeepLink deepLink) {
        View viewInflate = View.inflate(context, R.layout.advert_details_old_price_hint_dialog, null);
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(context, 0, 2, null);
        dVar.setContentView(viewInflate);
        dVar.t();
        dVar.setCancelable(true);
        dVar.setCanceledOnTouchOutside(true);
        n nVar = new n(viewInflate);
        I5.a(nVar.f85213a, str, false);
        I5.a(nVar.f85214b, str2, false);
        Button button = nVar.f85215c;
        com.avito.android.lib.design.button.b.a(button, str3, false);
        button.setOnClickListener(new com.avito.android.advert_collection.adapter.order.h(22, new a(deepLink, dVar, this)));
        com.avito.android.lib.util.g.a(dVar);
    }
}
