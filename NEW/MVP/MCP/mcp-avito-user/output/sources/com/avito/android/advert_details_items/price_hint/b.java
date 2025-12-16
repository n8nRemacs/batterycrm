package com.avito.android.advert_details_items.price_hint;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.I5;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PriceHintDialogFactory.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/price_hint/b;", "Lcom/avito/android/advert_details_items/price_hint/a;", "<init>", "()V", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements com.avito.android.advert_details_items.price_hint.a {

    /* compiled from: PriceHintDialogFactory.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f85361l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.lib.design.bottom_sheet.d dVar) {
            super(0);
            this.f85361l = dVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f85361l.dismiss();
            return G0.f406611a;
        }
    }

    @Inject
    public b() {
    }

    @Override // com.avito.android.advert_details_items.price_hint.a
    public final void a(@Y61.k Context context, @Y61.k String str, @Y61.k String str2) {
        View viewInflate = View.inflate(context, R.layout.advert_details_price_hint_dialog, null);
        int i12 = 0;
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(context, i12, 2, null);
        dVar.setContentView(viewInflate);
        dVar.t();
        dVar.setCancelable(true);
        dVar.setCanceledOnTouchOutside(true);
        e eVar = new e(viewInflate);
        I5.a(eVar.f85363a, str, false);
        I5.a(eVar.f85364b, str2, false);
        eVar.f85365c.setOnClickListener(new com.avito.android.advert_collection.adapter.order.h(24, new a(dVar)));
        com.avito.android.lib.util.g.a(dVar);
    }
}
