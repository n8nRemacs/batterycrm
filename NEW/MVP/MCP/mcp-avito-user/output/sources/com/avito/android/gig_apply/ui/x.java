package com.avito.android.gig_apply.ui;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.gig_apply.models.PaymentState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import pH.i;

/* compiled from: GigSlotRenderer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class x extends N implements Y41.l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PaymentState f160077l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s f160078m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(PaymentState paymentState, s sVar) {
        super(1);
        this.f160077l = paymentState;
        this.f160078m = sVar;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        DeepLink deepLink2 = this.f160077l.f159700d;
        if (deepLink2 != null) {
            this.f160078m.f160047b.accept(new i.C12261i(deepLink2));
        }
        return G0.f406611a;
    }
}
