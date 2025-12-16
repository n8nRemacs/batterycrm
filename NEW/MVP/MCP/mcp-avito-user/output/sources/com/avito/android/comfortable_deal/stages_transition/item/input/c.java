package com.avito.android.comfortable_deal.stages_transition.item.input;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import fq.InterfaceC40463a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: InputPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/stages_transition/item/input/c;", "LTV0/d;", "Lcom/avito/android/comfortable_deal/stages_transition/item/input/e;", "Lcom/avito/android/comfortable_deal/stages_transition/item/input/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements TV0.d<e, a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC40463a, G0> f122896b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public c(@k l<? super InterfaceC40463a, G0> lVar) {
        this.f122896b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        e eVar2 = (e) eVar;
        a aVar2 = (a) aVar;
        eVar2.A3(aVar2.f122891b);
        eVar2.lF(aVar2.f122893d, aVar2.f122892c);
        eVar2.r0(new b(this, aVar2));
    }
}
