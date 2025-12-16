package com.avito.android.autoteka.presentation.choosingPurchase.mvi;

import Hf.b;
import Zd.InterfaceC19542a;
import android.app.Activity;
import android.content.Intent;
import com.avito.android.authorization.AuthSource;
import com.avito.android.autoteka.deeplinks.AutotekaPaymentLink;
import com.avito.android.autoteka.deeplinks.PaymentDetails;
import com.avito.android.autoteka.helpers.l;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.util.UtmParamsV2;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AutotekaChoosingPurchaseOneTimeEventHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/l;", "", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f97204a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC19542a f97205b;

    @Inject
    public l(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k InterfaceC19542a interfaceC19542a) {
        this.f97204a = aVar;
        this.f97205b = interfaceC19542a;
    }

    public final void a(@Y61.k Hf.b bVar, @Y61.k Activity activity, @Y61.k androidx.view.result.h<Intent> hVar, @Y61.k Y41.l<? super l.a, G0> lVar) {
        if (bVar instanceof b.e) {
            throw null;
        }
        if (bVar instanceof b.d) {
            b.d dVar = (b.d) bVar;
            b.a.a(this.f97204a, new AutotekaPaymentLink(new PaymentDetails(dVar.f7580a, dVar.f7581b, dVar.f7582c, null, new UtmParamsV2(null, null, null, null, null, 31, null), null, false, 64, null)), "req_key_autoteka_payment_screen", null, 4);
            return;
        }
        if (bVar instanceof b.a) {
            activity.finish();
            return;
        }
        if (bVar instanceof b.C0430b ? true : bVar instanceof b.f) {
            activity.setResult(-1);
            activity.finish();
        } else if (bVar instanceof b.c) {
            Intent intentA = this.f97205b.a(AuthSource.f92691Z);
            intentA.setFlags(603979776);
            hVar.b(intentA);
        } else if (bVar instanceof b.g) {
            lVar.invoke(((b.g) bVar).f7584a);
        }
    }
}
