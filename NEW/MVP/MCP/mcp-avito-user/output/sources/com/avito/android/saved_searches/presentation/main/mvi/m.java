package com.avito.android.saved_searches.presentation.main.mvi;

import Eo0.InterfaceC13515a;
import Eo0.InterfaceC13516b;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.saved_searches.presentation.main.mvi.entity.SavedSearchMainInternalAction;
import com.avito.android.saved_searches.presentation.main.mvi.entity.SavedSearchMainState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SavedSearchMainFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LEo0/a;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainState;", "LEo0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class m extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC13515a, SavedSearchMainInternalAction, SavedSearchMainState, InterfaceC13516b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f258708l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k f258709m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p f258710n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f258711o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ r f258712p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(g gVar, k kVar, p pVar, ScreenPerformanceTracker screenPerformanceTracker, r rVar) {
        super(1);
        this.f258708l = gVar;
        this.f258709m = kVar;
        this.f258710n = pVar;
        this.f258711o = screenPerformanceTracker;
        this.f258712p = rVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC13515a, SavedSearchMainInternalAction, SavedSearchMainState, InterfaceC13516b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC13515a, SavedSearchMainInternalAction, SavedSearchMainState, InterfaceC13516b> qVar2 = qVar;
        qVar2.f92009e = this.f258708l;
        qVar2.f92008d = this.f258709m;
        qVar2.f92010f = this.f258710n;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f258711o, this.f258712p);
        return G0.f406611a;
    }
}
