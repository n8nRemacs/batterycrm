package com.avito.android.comfortable_deal.submitting.ordercall.mvi;

import Yo.t;
import android.content.Context;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.comfortable_deal.deeplink.SubmittingSuccessLink;
import com.avito.android.comfortable_deal.submitting.ordercall.mvi.entity.OrderCallInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import qp.C47424a;
import rp.C47702e;

/* compiled from: OrderCallBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/ordercall/mvi/g;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/comfortable_deal/submitting/ordercall/mvi/entity/OrderCallInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g implements com.avito.android.arch.mvi.b<OrderCallInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.comfortable_deal.repository.n f123084a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final t f123085b;

    @Inject
    public g(@Y61.k com.avito.android.comfortable_deal.repository.n nVar, @Y61.k t tVar) {
        this.f123084a = nVar;
        this.f123085b = tVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<OrderCallInternalAction> a() {
        InterfaceC43160i interfaceC43160iG = C43175k.G(new f(this, null));
        C47424a c47424a = this.f123084a.f122627a;
        Context context = c47424a.f429364a;
        return C43175k.N(interfaceC43160iG, new C43210w(new OrderCallInternalAction.ContentLoaded(new C47702e(context.getString(R.string.promo_content_phone_input_title), context.getString(R.string.promo_content_phone_input_subtitle), c47424a.b(), context.getString(R.string.promo_content_phone_input_placeholder), context.getString(R.string.promo_content_phone_button_text), new SubmittingSuccessLink()))));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
