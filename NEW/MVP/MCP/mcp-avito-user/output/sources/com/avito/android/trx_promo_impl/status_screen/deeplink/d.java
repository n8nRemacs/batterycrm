package com.avito.android.trx_promo_impl.status_screen.deeplink;

import Ju.InterfaceC14249c;
import Y41.l;
import Y61.k;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.trx_promo_public.deeplink.TrxPromoConfigureSuccessLink;
import com.avito.android.util.C35967w2;
import eH0.c;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.s0;
import nI0.InterfaceC44261b;
import sv.C48421d;

/* compiled from: TrxPromoConfigureSuccessDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/trx_promo_impl/status_screen/deeplink/d;", "Lev/a;", "Lcom/avito/android/trx_promo_public/deeplink/TrxPromoConfigureSuccessLink;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d extends AbstractC40161a<TrxPromoConfigureSuccessLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.paid_services.a f304402f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final v50.c f304403g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final eH0.c f304404h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final InterfaceC44261b f304405i;

    /* compiled from: TrxPromoConfigureSuccessDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements l<InterfaceC14249c.b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC14249c.b bVar) {
            ((d) this.receiver).j(bVar);
            return G0.f406611a;
        }
    }

    @Inject
    public d(@k com.avito.android.paid_services.a aVar, @k v50.c cVar, @k eH0.c cVar2, @k InterfaceC44261b interfaceC44261b) {
        this.f304402f = aVar;
        this.f304403g = cVar;
        this.f304404h = cVar2;
        this.f304405i = interfaceC44261b;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        Intent flags;
        TrxPromoConfigureSuccessLink trxPromoConfigureSuccessLink = (TrxPromoConfigureSuccessLink) deepLink;
        if (bundle != null) {
            flags = (Intent) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) bundle.getParcelable("up_intent", Intent.class) : bundle.getParcelable("up_intent"));
        } else {
            flags = null;
        }
        if (flags == null && trxPromoConfigureSuccessLink.f304514d) {
            flags = c.a.a(this.f304404h, trxPromoConfigureSuccessLink.f304513c, null, true, false, 22).putExtra("up_intent", InterfaceC44261b.a.a(this.f304405i, null, null, null, null, 31)).setFlags(603979776);
        }
        Intent intentAddFlags = this.f304403g.a(trxPromoConfigureSuccessLink).addFlags(603979776);
        if (flags != null) {
            intentAddFlags.putExtra("up_intent", flags);
        }
        C35967w2.c(intentAddFlags, bundle != null ? com.avito.android.util.H.b(bundle) : null);
        this.f304402f.a(trxPromoConfigureSuccessLink, C48421d.a(this), bundle, intentAddFlags);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f304402f.b(C48421d.a(this), new a(1, this, d.class, "setTerminalResult", "setTerminalResult(Lcom/avito/android/deep_linking/links/result/DeeplinkResult$Terminal;)V", 0));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f304402f.e();
    }
}
