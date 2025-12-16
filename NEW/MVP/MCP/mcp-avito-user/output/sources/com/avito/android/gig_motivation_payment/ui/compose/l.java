package com.avito.android.gig_motivation_payment.ui.compose;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import sH.C48049a;
import vH.InterfaceC49211a;

/* compiled from: MotivationPaymentScreen.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class l extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C48049a f160149l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC49211a, G0> f160150m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Y41.l lVar, C48049a c48049a) {
        super(0);
        this.f160149l = c48049a;
        this.f160150m = lVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink;
        sH.f fVar = this.f160149l.f437569e.f437578a;
        if (fVar != null && (deepLink = fVar.f437584c) != null) {
            this.f160150m.invoke(new InterfaceC49211a.d(deepLink));
        }
        return G0.f406611a;
    }
}
