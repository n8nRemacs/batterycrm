package com.avito.android.saved_searches.presentation.settings.mvi;

import Fo0.InterfaceC13822a;
import Fo0.InterfaceC13823b;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.saved_searches.presentation.settings.mvi.entity.SavedSearchSettingsInternalAction;
import com.avito.android.saved_searches.presentation.settings.mvi.entity.SavedSearchSettingsState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SavedSearchSettingsFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LFo0/a;", "Lcom/avito/android/saved_searches/presentation/settings/mvi/entity/SavedSearchSettingsInternalAction;", "Lcom/avito/android/saved_searches/presentation/settings/mvi/entity/SavedSearchSettingsState;", "LFo0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class d extends N implements Y41.l<q<InterfaceC13822a, SavedSearchSettingsInternalAction, SavedSearchSettingsState, InterfaceC13823b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f258757l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f258758m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i f258759n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ g f258760o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, ScreenPerformanceTracker screenPerformanceTracker, i iVar, g gVar) {
        super(1);
        this.f258757l = bVar;
        this.f258758m = screenPerformanceTracker;
        this.f258759n = iVar;
        this.f258760o = gVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC13822a, SavedSearchSettingsInternalAction, SavedSearchSettingsState, InterfaceC13823b> qVar) {
        q<InterfaceC13822a, SavedSearchSettingsInternalAction, SavedSearchSettingsState, InterfaceC13823b> qVar2 = qVar;
        qVar2.f92009e = this.f258757l;
        qVar2.f92011g = new o(this.f258758m, this.f258759n);
        qVar2.f92010f = this.f258760o;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
