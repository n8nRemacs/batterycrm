package com.avito.android.publish.details;

import com.avito.android.delivery_abuse.price_reduction.deeplink.PriceReductionLink;
import com.avito.android.remote.model.category_parameters.PriceParameter;
import kotlin.Metadata;
import kv.C43501a;

/* compiled from: PublishDetailsFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "result", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class C0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PublishDetailsFragment f232627b;

    public C0(PublishDetailsFragment publishDetailsFragment) {
        this.f232627b = publishDetailsFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C43501a c43501a = (C43501a) obj;
        K1 k12 = this.f232627b.f233086C0;
        if (k12 == null) {
            k12 = null;
        }
        PriceReductionLink.b bVar = (PriceReductionLink.b) c43501a.f413261b;
        k12.getClass();
        boolean z12 = bVar instanceof PriceReductionLink.b.C4066b;
        V0 v02 = k12.f232961J;
        if (!z12) {
            v02.oc();
            return;
        }
        PriceParameter priceParameter = (PriceParameter) k12.ne().getFirstParameterOfType(PriceParameter.class);
        if (priceParameter != null) {
            long j12 = ((PriceReductionLink.b.C4066b) bVar).f134787b;
            priceParameter.setValue(String.valueOf(j12));
            v02.Eb(String.valueOf(j12));
            k12.l(null);
            k12.nb();
        }
    }
}
