package com.avito.android.code_check.code_confirm.mvi;

import Jo.C14226c;
import Jo.InterfaceC14224a;
import Jo.InterfaceC14225b;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.arch.mvi.r;
import com.avito.android.code_check.code_confirm.mvi.entity.CodeConfirmInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CodeConfirmFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LJo/a;", "Lcom/avito/android/code_check/code_confirm/mvi/entity/CodeConfirmInternalAction;", "LJo/c;", "LJo/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class j extends N implements Y41.l<q<InterfaceC14224a, CodeConfirmInternalAction, C14226c, InterfaceC14225b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f118761l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f118762m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ o f118763n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ m f118764o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h f118765p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(e eVar, ScreenPerformanceTracker screenPerformanceTracker, o oVar, m mVar, h hVar) {
        super(1);
        this.f118761l = eVar;
        this.f118762m = screenPerformanceTracker;
        this.f118763n = oVar;
        this.f118764o = mVar;
        this.f118765p = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC14224a, CodeConfirmInternalAction, C14226c, InterfaceC14225b> qVar) {
        q<InterfaceC14224a, CodeConfirmInternalAction, C14226c, InterfaceC14225b> qVar2 = qVar;
        qVar2.f92009e = this.f118761l;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f118762m, this.f118763n);
        qVar2.f92010f = this.f118764o;
        qVar2.f92008d = this.f118765p;
        qVar2.f92014j = new r(false, true, 1, null);
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
