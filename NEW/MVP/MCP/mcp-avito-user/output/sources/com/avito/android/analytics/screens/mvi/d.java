package com.avito.android.analytics.screens.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;

/* compiled from: MviPerformanceUtils.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/analytics/screens/mvi/q;", "State", "", "OneTimeEvent", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/analytics/screens/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class d extends N implements Y41.l<Object, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f90652l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ H f90653m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(ScreenPerformanceTracker screenPerformanceTracker, Y41.l<Object, G0> lVar) {
        super(1);
        this.f90652l = screenPerformanceTracker;
        this.f90653m = (H) lVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.l, kotlin.jvm.internal.H] */
    @Override // Y41.l
    public final G0 invoke(Object obj) {
        a.i((q) obj, this.f90652l, new c(this.f90653m));
        return G0.f406611a;
    }
}
