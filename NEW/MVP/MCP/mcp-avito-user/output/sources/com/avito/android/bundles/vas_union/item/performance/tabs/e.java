package com.avito.android.bundles.vas_union.item.performance.tabs;

import Y41.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PerformanceTabsItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/bundles/vas_union/item/tabs/a;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/bundles/vas_union/item/tabs/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class e extends N implements l<com.avito.android.bundles.vas_union.item.tabs.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f108629l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f108630m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, f fVar) {
        super(1);
        this.f108629l = aVar;
        this.f108630m = fVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.bundles.vas_union.item.tabs.a aVar) {
        com.avito.android.bundles.vas_union.item.tabs.a aVar2 = aVar;
        this.f108629l.f108624c = aVar2.f108665b;
        this.f108630m.f108631b.onNext(aVar2);
        return G0.f406611a;
    }
}
