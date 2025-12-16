package com.avito.android.safety.password_setting.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.arch.mvi.r;
import com.avito.android.safety.password_setting.mvi.entity.PasswordSettingInternalAction;
import com.avito.android.safety.password_setting.mvi.entity.PasswordSettingState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import so0.InterfaceC48391a;
import so0.InterfaceC48392b;

/* compiled from: PasswordSettingFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lso0/a;", "Lcom/avito/android/safety/password_setting/mvi/entity/PasswordSettingInternalAction;", "Lcom/avito/android/safety/password_setting/mvi/entity/PasswordSettingState;", "Lso0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class g extends N implements Y41.l<q<InterfaceC48391a, PasswordSettingInternalAction, PasswordSettingState, InterfaceC48392b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f257509l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f257510m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f257511n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f257512o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j f257513p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, c cVar, ScreenPerformanceTracker screenPerformanceTracker, l lVar, j jVar) {
        super(1);
        this.f257509l = eVar;
        this.f257510m = cVar;
        this.f257511n = screenPerformanceTracker;
        this.f257512o = lVar;
        this.f257513p = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC48391a, PasswordSettingInternalAction, PasswordSettingState, InterfaceC48392b> qVar) {
        q<InterfaceC48391a, PasswordSettingInternalAction, PasswordSettingState, InterfaceC48392b> qVar2 = qVar;
        qVar2.f92008d = this.f257509l;
        qVar2.f92009e = this.f257510m;
        qVar2.f92014j = new r(false, true, 1, null);
        qVar2.f92011g = new o(this.f257511n, this.f257512o);
        qVar2.f92010f = this.f257513p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91994i);
        return G0.f406611a;
    }
}
