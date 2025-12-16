package com.avito.android.advert.item.autoteka_select.teaser;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.W0;
import com.avito.android.advert.item.autoteka_select.teaser.c;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.autoteka.analytics.event.FromBlock;
import com.avito.android.autoteka.model.AutotekaChoosingPurchaseButtonParams;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.di.module.InterfaceC30174s;
import com.avito.android.remote.model.autoteka_teaser_select.AutotekaTeaserSelectItemResponse;
import com.avito.android.remote.model.autotekateaser.AutotekaPurchaseAction;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import x4.AbstractC49760b;

/* compiled from: AdvertDetailsAutotekaSelectTeaserPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/advert/item/autoteka_select/teaser/e;", "Lx4/b;", "Lcom/avito/android/remote/model/autoteka_teaser_select/AutotekaTeaserSelectItemResponse;", "Lcom/avito/android/advert/item/autoteka_select/teaser/h;", "Lcom/avito/android/advert/item/autoteka_select/teaser/AdvertDetailsAutotekaSelectTeaserItem;", "Lcom/avito/android/advert/item/autoteka_select/teaser/c$b;", "Lcom/avito/android/advert/item/autoteka_select/teaser/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e extends AbstractC49760b<AutotekaTeaserSelectItemResponse, h, AdvertDetailsAutotekaSelectTeaserItem, c.b> implements c {

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f73164h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final InterfaceC28373a f73165i;

    @Inject
    public e(@k @InterfaceC30174s String str, @k InterfaceC28373a interfaceC28373a, @k com.avito.android.autoteka.data.a aVar) {
        super(aVar, str);
        this.f73164h = str;
        this.f73165i = interfaceC28373a;
    }

    @Override // x4.AbstractC49760b, com.avito.android.advert.item.teaser.a.b
    public final void V() {
        AutotekaTeaserResult autotekaTeaserResult = this.f442185f;
        if (autotekaTeaserResult != null) {
            com.avito.android.autoteka.helpers.b.f96647a.getClass();
            AutotekaPurchaseAction autotekaPurchaseActionA = com.avito.android.autoteka.helpers.b.a(autotekaTeaserResult);
            G0 g02 = null;
            if (autotekaPurchaseActionA != null) {
                FromBlock fromBlock = FromBlock.f96083c;
                AutotekaChoosingPurchaseButtonParams autotekaChoosingPurchaseButtonParamsC = com.avito.android.autoteka.helpers.b.c(autotekaPurchaseActionA, 100, this.f442186g, null, null);
                W0 w02 = this.f442184e;
                if (w02 != null) {
                    w02.a(autotekaChoosingPurchaseButtonParamsC.f97068b);
                    g02 = G0.f406611a;
                }
            }
            if (g02 == null) {
                k0();
            }
        }
    }

    @Override // x4.AbstractC49760b, com.avito.android.advert.item.teaser.a.b
    public final void Y(@k DeepLink deepLink) {
        W0 w02 = this.f442184e;
        if (w02 != null) {
            w02.h(deepLink);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    @Override // x4.AbstractC49760b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n0(com.avito.android.remote.model.autotekateaser.AutotekaTeaserItem r23) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.autoteka_select.teaser.e.n0(com.avito.android.remote.model.autotekateaser.AutotekaTeaserItem):void");
    }
}
