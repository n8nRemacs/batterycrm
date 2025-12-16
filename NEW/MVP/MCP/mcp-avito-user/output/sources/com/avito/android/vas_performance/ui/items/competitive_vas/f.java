package com.avito.android.vas_performance.ui.items.competitive_vas;

import Y41.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CompetitiveVasItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/vas_performance/ui/items/competitive_vas/c;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/vas_performance/ui/items/competitive_vas/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class f extends N implements l<c, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f321631l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar) {
        super(1);
        this.f321631l = gVar;
    }

    @Override // Y41.l
    public final G0 invoke(c cVar) {
        this.f321631l.f321632b.onNext(cVar);
        return G0.f406611a;
    }
}
