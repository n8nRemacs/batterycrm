package com.avito.android.change_specific.mvi;

import Y41.l;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.change_specific.mvi.entity.ExtendedProfileChangeSpecificInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import lo.C43810c;
import lo.InterfaceC43808a;
import lo.InterfaceC43809b;

/* compiled from: ExtendedProfileChangeSpecificFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Llo/a;", "Lcom/avito/android/change_specific/mvi/entity/ExtendedProfileChangeSpecificInternalAction;", "Llo/c;", "Llo/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class e extends N implements l<q<InterfaceC43808a, ExtendedProfileChangeSpecificInternalAction, C43810c, InterfaceC43809b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f118018l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f118019m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f118020n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j f118021o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h f118022p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, j jVar, h hVar) {
        super(1);
        this.f118018l = cVar;
        this.f118019m = aVar;
        this.f118020n = screenPerformanceTracker;
        this.f118021o = jVar;
        this.f118022p = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC43808a, ExtendedProfileChangeSpecificInternalAction, C43810c, InterfaceC43809b> qVar) {
        q<InterfaceC43808a, ExtendedProfileChangeSpecificInternalAction, C43810c, InterfaceC43809b> qVar2 = qVar;
        qVar2.f92008d = this.f118018l;
        qVar2.f92009e = this.f118019m;
        qVar2.f92011g = new o(this.f118020n, this.f118021o);
        qVar2.f92010f = this.f118022p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
