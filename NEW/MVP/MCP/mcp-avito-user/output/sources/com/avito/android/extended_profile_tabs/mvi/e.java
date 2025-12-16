package com.avito.android.extended_profile_tabs.mvi;

import Y41.l;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.extended_profile_tabs.mvi.entity.ExtendedProfileTabsInternalAction;
import dB.InterfaceC39552a;
import dB.InterfaceC39553b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ExtendedProfileTabsFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LdB/a;", "Lcom/avito/android/extended_profile_tabs/mvi/entity/ExtendedProfileTabsInternalAction;", "Lcom/avito/android/extended_profile_tabs/mvi/entity/a;", "LdB/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class e extends N implements l<q<InterfaceC39552a, ExtendedProfileTabsInternalAction, com.avito.android.extended_profile_tabs.mvi.entity.a, InterfaceC39553b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f153226l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f153227m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ j f153228n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ h f153229o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ c f153230p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, ScreenPerformanceTracker screenPerformanceTracker, j jVar, h hVar, c cVar) {
        super(1);
        this.f153226l = aVar;
        this.f153227m = screenPerformanceTracker;
        this.f153228n = jVar;
        this.f153229o = hVar;
        this.f153230p = cVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC39552a, ExtendedProfileTabsInternalAction, com.avito.android.extended_profile_tabs.mvi.entity.a, InterfaceC39553b> qVar) {
        q<InterfaceC39552a, ExtendedProfileTabsInternalAction, com.avito.android.extended_profile_tabs.mvi.entity.a, InterfaceC39553b> qVar2 = qVar;
        qVar2.f92009e = this.f153226l;
        qVar2.f92011g = new o(this.f153227m, this.f153228n);
        qVar2.f92010f = this.f153229o;
        qVar2.f92008d = this.f153230p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
