package com.avito.android.advert.item.fair_price.dialog;

import Ai.DialogInterfaceOnDismissListenerC13035a;
import Y61.k;
import Y61.l;
import android.content.Context;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.fair_price.model.AdvertFairPriceModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.bottom_sheet.j;
import com.avito.android.lib.util.g;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: FairPriceExplanationDialogManager.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/fair_price/dialog/e;", "Lcom/avito/android/advert/item/fair_price/dialog/d;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final a f75388a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public com.avito.android.lib.design.bottom_sheet.d f75389b;

    @Inject
    public e(@k a aVar) {
        this.f75388a = aVar;
    }

    @Override // com.avito.android.advert.item.fair_price.dialog.d
    public final void a(@k Context context, @k AdvertFairPriceModel.Explanation explanation, @k Y41.l<? super DeepLink, G0> lVar) {
        if (this.f75389b != null) {
            return;
        }
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(context, 0, 2, null);
        dVar.setContentView(this.f75388a.a(context, explanation, lVar));
        j.c(dVar, explanation.f75407d, true, 0, 0, 0, 120);
        dVar.setOnDismissListener(new DialogInterfaceOnDismissListenerC13035a(this, 5));
        g.a(dVar);
        this.f75389b = dVar;
    }
}
