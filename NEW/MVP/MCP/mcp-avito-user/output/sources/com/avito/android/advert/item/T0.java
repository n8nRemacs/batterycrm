package com.avito.android.advert.item;

import com.avito.android.advert_core.safedeal.trust_factors.TrustFactorsComponent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: AdvertDetailsPresenter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/advert_core/safedeal/trust_factors/TrustFactorsComponent;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class T0 extends kotlin.jvm.internal.N implements Y41.l<List<? extends TrustFactorsComponent>, List<? extends TrustFactorsComponent>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<TrustFactorsComponent.CombinedButtons, TrustFactorsComponent.CombinedButtons> f72168l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public T0(Y41.l<? super TrustFactorsComponent.CombinedButtons, TrustFactorsComponent.CombinedButtons> lVar) {
        super(1);
        this.f72168l = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final List<? extends TrustFactorsComponent> invoke(List<? extends TrustFactorsComponent> list) {
        List<? extends TrustFactorsComponent> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (TrustFactorsComponent trustFactorsComponent : list2) {
            if (trustFactorsComponent instanceof TrustFactorsComponent.CombinedButtons) {
                trustFactorsComponent = (TrustFactorsComponent) this.f72168l.invoke(trustFactorsComponent);
            }
            arrayList.add(trustFactorsComponent);
        }
        return arrayList;
    }
}
