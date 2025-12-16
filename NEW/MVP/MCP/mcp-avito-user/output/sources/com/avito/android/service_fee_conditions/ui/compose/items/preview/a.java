package com.avito.android.service_fee_conditions.ui.compose.items.preview;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import com.akita.compose.theme.re23.g;
import com.avito.android.remote.model.payment.status.PaymentStateKt;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import qu0.c;

/* compiled from: ServiceFeeConditionsBulletsItemPreview.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class a extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f278559l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i12) {
        super(2);
        this.f278559l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f278559l | 1);
        B bE2 = a12.E(113194956);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            g.f65049a.getClass();
            com.avito.android.service_fee_conditions.ui.compose.items.g.a(C42745f0.U(new c.b("Оплата просмотров", g.a(PaymentStateKt.PAYMENT_STATE_DONE)), new c.b("Деньги будут списываться из аванса", g.a(PaymentStateKt.PAYMENT_STATE_DONE)), new c.b("Стоимость просмотра — 0,4 ₽", g.a(PaymentStateKt.PAYMENT_STATE_DONE))), null, bE2, 0, 2);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(iA2);
        }
        return G0.f406611a;
    }
}
