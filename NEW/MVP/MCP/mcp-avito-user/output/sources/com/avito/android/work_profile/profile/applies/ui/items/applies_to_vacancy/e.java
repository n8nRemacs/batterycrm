package com.avito.android.work_profile.profile.applies.ui.items.applies_to_vacancy;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AppliesToVacancyPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class e extends N implements Y41.l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f330970l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ApplyToVacancyItem f330971m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, ApplyToVacancyItem applyToVacancyItem) {
        super(1);
        this.f330970l = hVar;
        this.f330971m = applyToVacancyItem;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        this.f330970l.f330974b.get().N4(deepLink, this.f330971m.f330955d.f330959b);
        return G0.f406611a;
    }
}
