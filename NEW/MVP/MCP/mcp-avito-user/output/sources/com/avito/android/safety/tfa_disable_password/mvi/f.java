package com.avito.android.safety.tfa_disable_password.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.arch.mvi.r;
import com.avito.android.safety.tfa_disable_password.mvi.entity.TfaDisablePasswordInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import wo0.C49661c;
import wo0.InterfaceC49659a;
import wo0.InterfaceC49660b;

/* compiled from: TfaDisablePasswordFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lwo0/a;", "Lcom/avito/android/safety/tfa_disable_password/mvi/entity/TfaDisablePasswordInternalAction;", "Lwo0/c;", "Lwo0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class f extends N implements Y41.l<q<InterfaceC49659a, TfaDisablePasswordInternalAction, C49661c, InterfaceC49660b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f258127l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f258128m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f258129n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f258130o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i f258131p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, b bVar, ScreenPerformanceTracker screenPerformanceTracker, k kVar, i iVar) {
        super(1);
        this.f258127l = dVar;
        this.f258128m = bVar;
        this.f258129n = screenPerformanceTracker;
        this.f258130o = kVar;
        this.f258131p = iVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC49659a, TfaDisablePasswordInternalAction, C49661c, InterfaceC49660b> qVar) {
        q<InterfaceC49659a, TfaDisablePasswordInternalAction, C49661c, InterfaceC49660b> qVar2 = qVar;
        qVar2.f92008d = this.f258127l;
        qVar2.f92009e = this.f258128m;
        qVar2.f92014j = new r(false, true, 1, null);
        qVar2.f92011g = new o(this.f258129n, this.f258130o);
        qVar2.f92010f = this.f258131p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91994i);
        return G0.f406611a;
    }
}
