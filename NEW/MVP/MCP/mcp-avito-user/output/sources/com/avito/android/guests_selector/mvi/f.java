package com.avito.android.guests_selector.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.guests_selector.mvi.entity.GuestsSelectorInternalAction;
import gI.InterfaceC40585a;
import gI.InterfaceC40586b;
import hI.C40827a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GuestsSelectorFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LgI/a;", "Lcom/avito/android/guests_selector/mvi/entity/GuestsSelectorInternalAction;", "LhI/a;", "LgI/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class f extends N implements Y41.l<q<InterfaceC40585a, GuestsSelectorInternalAction, C40827a, InterfaceC40586b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f161558l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f161559m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f161560n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f161561o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i f161562p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, b bVar, ScreenPerformanceTracker screenPerformanceTracker, k kVar, i iVar) {
        super(1);
        this.f161558l = dVar;
        this.f161559m = bVar;
        this.f161560n = screenPerformanceTracker;
        this.f161561o = kVar;
        this.f161562p = iVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC40585a, GuestsSelectorInternalAction, C40827a, InterfaceC40586b> qVar) {
        q<InterfaceC40585a, GuestsSelectorInternalAction, C40827a, InterfaceC40586b> qVar2 = qVar;
        qVar2.f92008d = this.f161558l;
        qVar2.f92009e = this.f161559m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f161560n, this.f161561o);
        qVar2.f92010f = this.f161562p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
