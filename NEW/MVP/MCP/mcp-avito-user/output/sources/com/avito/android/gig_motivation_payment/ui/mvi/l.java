package com.avito.android.gig_motivation_payment.ui.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.gig_motivation_payment.ui.MotivationPaymentOpenParams;
import com.avito.android.gig_motivation_payment.ui.mvi.entity.MotivationPaymentInternalAction;
import fv.C40482a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import rH.InterfaceC47543a;

/* compiled from: MotivationPaymentBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/gig_motivation_payment/ui/mvi/l;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/gig_motivation_payment/ui/mvi/entity/MotivationPaymentInternalAction;", "_avito_gig_motivation-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class l implements com.avito.android.arch.mvi.b<MotivationPaymentInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final MotivationPaymentOpenParams f160257a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47543a f160258b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f160259c;

    @Inject
    public l(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k MotivationPaymentOpenParams motivationPaymentOpenParams, @Y61.k InterfaceC47543a interfaceC47543a) {
        this.f160257a = motivationPaymentOpenParams;
        this.f160258b = interfaceC47543a;
        this.f160259c = aVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<MotivationPaymentInternalAction> a() {
        return C43175k.N(C43175k.C(new k(this, null), C40482a.b(this.f160259c)), new C43210w(MotivationPaymentInternalAction.c.f160230b), C43175k.G(new j(this, null)));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
