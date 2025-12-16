package com.avito.android.beduin.ui.universal;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UniversalBeduinFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u00020\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "kotlin.jvm.PlatformType", "it", "invoke", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class e extends N implements Y41.l<G0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UniversalBeduinFragment f104485l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(UniversalBeduinFragment universalBeduinFragment) {
        super(1);
        this.f104485l = universalBeduinFragment;
    }

    @Override // Y41.l
    public final G0 invoke(G0 g02) {
        UniversalBeduinFragment universalBeduinFragment = this.f104485l;
        m mVar = universalBeduinFragment.f104418n0;
        if (mVar == null) {
            mVar = null;
        }
        ScreenPerformanceTracker screenPerformanceTrackerLe = mVar.le();
        if (screenPerformanceTrackerLe != null) {
            universalBeduinFragment.u5(screenPerformanceTrackerLe);
        }
        return G0.f406611a;
    }
}
