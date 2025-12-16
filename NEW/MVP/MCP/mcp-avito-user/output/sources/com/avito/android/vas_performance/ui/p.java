package com.avito.android.vas_performance.ui;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: PerformanceVasViewModelImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/vas_performance/ui/items/info_action/a;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/vas_performance/ui/items/info_action/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class p<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f321890b;

    public p(m mVar) {
        this.f321890b = mVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        DeepLink deepLink = ((com.avito.android.vas_performance.ui.items.info_action.a) obj).f321695d;
        m mVar = this.f321890b;
        if (deepLink != null) {
            mVar.f321875T.postValue(deepLink);
        } else {
            mVar.getClass();
        }
    }
}
