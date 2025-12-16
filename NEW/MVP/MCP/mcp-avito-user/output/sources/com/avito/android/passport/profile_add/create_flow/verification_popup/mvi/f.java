package com.avito.android.passport.profile_add.create_flow.verification_popup.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.passport.profile_add.create_flow.verification_popup.mvi.entity.VerificationPopupInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VerificationPopupFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LW50/a;", "Lcom/avito/android/passport/profile_add/create_flow/verification_popup/mvi/entity/VerificationPopupInternalAction;", "LW50/c;", "LW50/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class f extends N implements Y41.l<q<W50.a, VerificationPopupInternalAction, W50.c, W50.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f212273l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f212274m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ k f212275n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i f212276o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(c cVar, ScreenPerformanceTracker screenPerformanceTracker, k kVar, i iVar) {
        super(1);
        this.f212273l = cVar;
        this.f212274m = screenPerformanceTracker;
        this.f212275n = kVar;
        this.f212276o = iVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<W50.a, VerificationPopupInternalAction, W50.c, W50.b> qVar) {
        q<W50.a, VerificationPopupInternalAction, W50.c, W50.b> qVar2 = qVar;
        qVar2.f92009e = this.f212273l;
        qVar2.f92011g = new o(this.f212274m, this.f212275n);
        qVar2.f92010f = this.f212276o;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
