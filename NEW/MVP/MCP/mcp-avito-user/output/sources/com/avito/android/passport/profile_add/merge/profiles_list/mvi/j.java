package com.avito.android.passport.profile_add.merge.profiles_list.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.passport.profile_add.merge.profiles_list.mvi.entity.ProfilesListInternalAction;
import f60.InterfaceC40238a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ProfilesListFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lf60/a;", "Lcom/avito/android/passport/profile_add/merge/profiles_list/mvi/entity/ProfilesListInternalAction;", "Lf60/c;", "Lf60/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class j extends N implements Y41.l<q<InterfaceC40238a, ProfilesListInternalAction, f60.c, f60.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f213298l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f213299m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h f213300n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f213301o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ m f213302p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(b bVar, f fVar, h hVar, ScreenPerformanceTracker screenPerformanceTracker, m mVar) {
        super(1);
        this.f213298l = bVar;
        this.f213299m = fVar;
        this.f213300n = hVar;
        this.f213301o = screenPerformanceTracker;
        this.f213302p = mVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC40238a, ProfilesListInternalAction, f60.c, f60.b> qVar) {
        q<InterfaceC40238a, ProfilesListInternalAction, f60.c, f60.b> qVar2 = qVar;
        qVar2.f92009e = this.f213298l;
        qVar2.f92008d = this.f213299m;
        qVar2.f92010f = this.f213300n;
        qVar2.f92011g = new o(this.f213301o, this.f213302p);
        AW.a aVar = AW.a.f430a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(aVar, com.avito.android.arch.mvi.log.g.f91992g);
        return G0.f406611a;
    }
}
