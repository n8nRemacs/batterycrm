package com.avito.android.phone_reverification_info.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.phone_reverification_info.mvi.entity.PhoneReverificationInfoInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import y70.InterfaceC50076a;
import y70.InterfaceC50077b;

/* compiled from: PhoneReverificationInfoFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Ly70/a;", "Lcom/avito/android/phone_reverification_info/mvi/entity/PhoneReverificationInfoInternalAction;", "Ly70/c;", "Ly70/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class f extends N implements Y41.l<q<InterfaceC50076a, PhoneReverificationInfoInternalAction, y70.c, InterfaceC50077b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f216168l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f216169m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f216170n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f216171o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i f216172p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, b bVar, ScreenPerformanceTracker screenPerformanceTracker, k kVar, i iVar) {
        super(1);
        this.f216168l = dVar;
        this.f216169m = bVar;
        this.f216170n = screenPerformanceTracker;
        this.f216171o = kVar;
        this.f216172p = iVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC50076a, PhoneReverificationInfoInternalAction, y70.c, InterfaceC50077b> qVar) {
        q<InterfaceC50076a, PhoneReverificationInfoInternalAction, y70.c, InterfaceC50077b> qVar2 = qVar;
        qVar2.f92008d = this.f216168l;
        qVar2.f92009e = this.f216169m;
        qVar2.f92011g = new o(this.f216170n, this.f216171o);
        qVar2.f92010f = this.f216172p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
