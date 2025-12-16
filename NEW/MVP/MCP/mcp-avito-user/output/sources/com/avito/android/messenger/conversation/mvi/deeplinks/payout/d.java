package com.avito.android.messenger.conversation.mvi.deeplinks.payout;

import Ju.AbstractC14250d;
import android.content.res.Resources;
import android.net.Uri;
import com.avito.android.R;
import com.avito.android.deep_linking.links.PayoutLink;
import com.avito.android.payment.WebPaymentResourceProviderImpl;
import com.avito.android.util.P2;
import kotlin.Metadata;
import sv.C48421d;

/* compiled from: AbstractPayoutDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/deep_linking/links/PayoutLink;", "Deeplink", "Lcom/avito/android/util/P2;", "Landroid/net/Uri;", "loadingState", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class d<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b<PayoutLink> f190541b;

    public d(b<PayoutLink> bVar) {
        this.f190541b = bVar;
    }

    @Override // l41.g
    public final void accept(Object obj) throws Resources.NotFoundException {
        P2 p22 = (P2) obj;
        boolean z12 = p22 instanceof P2.c;
        b<PayoutLink> bVar = this.f190541b;
        if (z12) {
            bVar.getF190623n().g(bVar.d(), true);
            return;
        }
        if (p22 instanceof P2.a) {
            bVar.getF190623n().g(bVar.d(), false);
            bVar.u(((P2.a) p22).f318719a);
            bVar.j(AbstractC14250d.b.f9170c);
        } else if (p22 instanceof P2.b) {
            Uri uri = (Uri) ((P2.b) p22).f318720a;
            bVar.getF190623n().g(bVar.d(), false);
            bVar.getF190620k().J(bVar.getF190622m().j(uri.toString(), (14 & 2) != 0 ? null : null, (14 & 4) != 0 ? null : null, (14 & 8) != 0 ? null : new WebPaymentResourceProviderImpl("", null, bVar.getF190624o().getString(R.string.delivery_seller_pay_out_cancel_confirmation), bVar.getF190624o().getString(R.string.yes), bVar.getF190624o().getString(R.string.no), bVar.getF190624o().getString(R.string.delivery_seller_pay_out_error_title), bVar.getF190624o().getString(R.string.delivery_seller_pay_out_error_message), bVar.getF190624o().getString(R.string.ok), bVar.getF190624o().getString(R.string.connection_problem), R.drawable.ic_close_24_blue, bVar.getF190624o().getString(R.string.delivery_buyer_payment_progress_message_simple), bVar.getF190624o().getString(R.string.delivery_buyer_payment_progress_message)), (14 & 16) != 0 ? null : null), C48421d.a(bVar), com.avito.android.deeplink_handler.view.c.f134589l);
        }
    }
}
