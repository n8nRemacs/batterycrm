package com.avito.android.vas_autoprolong.screens.autoprolong.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.vas_autoprolong.screens.autoprolong.mvi.entity.AutoprolongInternalAction;
import jL0.C42282c;
import jL0.InterfaceC42280a;
import jL0.InterfaceC42281b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutoprolongFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LjL0/a;", "Lcom/avito/android/vas_autoprolong/screens/autoprolong/mvi/entity/AutoprolongInternalAction;", "LjL0/c;", "LjL0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class g extends N implements Y41.l<q<InterfaceC42280a, AutoprolongInternalAction, C42282c, InterfaceC42281b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f319546l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f319547m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f319548n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ m f319549o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j f319550p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, c cVar, ScreenPerformanceTracker screenPerformanceTracker, m mVar, j jVar) {
        super(1);
        this.f319546l = eVar;
        this.f319547m = cVar;
        this.f319548n = screenPerformanceTracker;
        this.f319549o = mVar;
        this.f319550p = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC42280a, AutoprolongInternalAction, C42282c, InterfaceC42281b> qVar) {
        q<InterfaceC42280a, AutoprolongInternalAction, C42282c, InterfaceC42281b> qVar2 = qVar;
        qVar2.f92008d = this.f319546l;
        qVar2.f92009e = this.f319547m;
        qVar2.f92011g = new o(this.f319548n, this.f319549o);
        qVar2.f92010f = this.f319550p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91992g);
        return G0.f406611a;
    }
}
