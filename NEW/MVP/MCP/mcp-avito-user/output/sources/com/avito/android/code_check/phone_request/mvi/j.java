package com.avito.android.code_check.phone_request.mvi;

import Ro.InterfaceC15066a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.code_check.phone_request.mvi.entity.PhoneRequestInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PhoneRequestFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LRo/a;", "Lcom/avito/android/code_check/phone_request/mvi/entity/PhoneRequestInternalAction;", "LRo/c;", "LRo/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class j extends N implements Y41.l<q<InterfaceC15066a, PhoneRequestInternalAction, Ro.c, Ro.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f119126l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f119127m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f119128n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ o f119129o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ m f119130p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h hVar, c cVar, ScreenPerformanceTracker screenPerformanceTracker, o oVar, m mVar) {
        super(1);
        this.f119126l = hVar;
        this.f119127m = cVar;
        this.f119128n = screenPerformanceTracker;
        this.f119129o = oVar;
        this.f119130p = mVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC15066a, PhoneRequestInternalAction, Ro.c, Ro.b> qVar) {
        q<InterfaceC15066a, PhoneRequestInternalAction, Ro.c, Ro.b> qVar2 = qVar;
        qVar2.f92008d = this.f119126l;
        qVar2.f92009e = this.f119127m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f119128n, this.f119129o);
        qVar2.f92010f = this.f119130p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
