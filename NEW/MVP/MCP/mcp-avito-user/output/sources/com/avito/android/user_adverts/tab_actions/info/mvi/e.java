package com.avito.android.user_adverts.tab_actions.info.mvi;

import Y41.l;
import bJ0.C25520c;
import bJ0.InterfaceC25518a;
import bJ0.InterfaceC25519b;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.user_adverts.tab_actions.info.mvi.entity.UserAdvertsActionResultInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UserAdvertsActionResultFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LbJ0/a;", "Lcom/avito/android/user_adverts/tab_actions/info/mvi/entity/UserAdvertsActionResultInternalAction;", "LbJ0/c;", "LbJ0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class e extends N implements l<q<InterfaceC25518a, UserAdvertsActionResultInternalAction, C25520c, InterfaceC25519b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f314678l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f314679m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h f314680n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, ScreenPerformanceTracker screenPerformanceTracker, h hVar) {
        super(1);
        this.f314678l = cVar;
        this.f314679m = screenPerformanceTracker;
        this.f314680n = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC25518a, UserAdvertsActionResultInternalAction, C25520c, InterfaceC25519b> qVar) {
        q<InterfaceC25518a, UserAdvertsActionResultInternalAction, C25520c, InterfaceC25519b> qVar2 = qVar;
        qVar2.f92009e = this.f314678l;
        qVar2.f92011g = new o(this.f314679m, this.f314680n);
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91992g);
        return G0.f406611a;
    }
}
