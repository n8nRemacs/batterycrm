package com.avito.android.language_selector.presentation.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.language_selector.presentation.mvi.entity.LanguageSelectorInternalAction;
import eR.InterfaceC40041b;
import eR.InterfaceC40042c;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: LanguageSelectorFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LeR/b;", "Lcom/avito/android/language_selector/presentation/mvi/entity/LanguageSelectorInternalAction;", "LeR/d;", "LeR/c;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class f extends N implements Y41.l<q<InterfaceC40041b, LanguageSelectorInternalAction, eR.d, InterfaceC40042c>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f174987l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f174988m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f174989n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f174990o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i f174991p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, b bVar, ScreenPerformanceTracker screenPerformanceTracker, k kVar, i iVar) {
        super(1);
        this.f174987l = dVar;
        this.f174988m = bVar;
        this.f174989n = screenPerformanceTracker;
        this.f174990o = kVar;
        this.f174991p = iVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC40041b, LanguageSelectorInternalAction, eR.d, InterfaceC40042c> qVar) {
        q<InterfaceC40041b, LanguageSelectorInternalAction, eR.d, InterfaceC40042c> qVar2 = qVar;
        qVar2.f92008d = this.f174987l;
        qVar2.f92009e = this.f174988m;
        qVar2.f92011g = new o(this.f174989n, this.f174990o);
        qVar2.f92010f = this.f174991p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
