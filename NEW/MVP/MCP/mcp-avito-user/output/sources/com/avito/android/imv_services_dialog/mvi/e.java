package com.avito.android.imv_services_dialog.mvi;

import Y41.l;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.imv_services_dialog.mvi.entity.ImvServicesDialogInternalAction;
import jN.C42288c;
import jN.InterfaceC42286a;
import jN.InterfaceC42287b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ImvServicesDialogFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LjN/a;", "Lcom/avito/android/imv_services_dialog/mvi/entity/ImvServicesDialogInternalAction;", "LjN/c;", "LjN/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class e extends N implements l<q<InterfaceC42286a, ImvServicesDialogInternalAction, C42288c, InterfaceC42287b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f170795l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f170796m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f170797n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j f170798o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h f170799p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, j jVar, h hVar) {
        super(1);
        this.f170795l = cVar;
        this.f170796m = aVar;
        this.f170797n = screenPerformanceTracker;
        this.f170798o = jVar;
        this.f170799p = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC42286a, ImvServicesDialogInternalAction, C42288c, InterfaceC42287b> qVar) {
        q<InterfaceC42286a, ImvServicesDialogInternalAction, C42288c, InterfaceC42287b> qVar2 = qVar;
        qVar2.f92008d = this.f170795l;
        qVar2.f92009e = this.f170796m;
        qVar2.f92011g = new o(this.f170797n, this.f170798o);
        qVar2.f92010f = this.f170799p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
