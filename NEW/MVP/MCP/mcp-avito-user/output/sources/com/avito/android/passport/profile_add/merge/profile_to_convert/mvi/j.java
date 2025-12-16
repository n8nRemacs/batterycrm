package com.avito.android.passport.profile_add.merge.profile_to_convert.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.passport.profile_add.merge.profile_to_convert.mvi.entity.ProfileToConvertInternalAction;
import e60.C39958c;
import e60.InterfaceC39956a;
import e60.InterfaceC39957b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ProfileToConvertFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Le60/a;", "Lcom/avito/android/passport/profile_add/merge/profile_to_convert/mvi/entity/ProfileToConvertInternalAction;", "Le60/c;", "Le60/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class j extends N implements Y41.l<q<InterfaceC39956a, ProfileToConvertInternalAction, C39958c, InterfaceC39957b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f213168l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f213169m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f213170n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ m f213171o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h f213172p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(f fVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, m mVar, h hVar) {
        super(1);
        this.f213168l = fVar;
        this.f213169m = aVar;
        this.f213170n = screenPerformanceTracker;
        this.f213171o = mVar;
        this.f213172p = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC39956a, ProfileToConvertInternalAction, C39958c, InterfaceC39957b> qVar) {
        q<InterfaceC39956a, ProfileToConvertInternalAction, C39958c, InterfaceC39957b> qVar2 = qVar;
        qVar2.f92008d = this.f213168l;
        qVar2.f92009e = this.f213169m;
        qVar2.f92011g = new o(this.f213170n, this.f213171o);
        qVar2.f92010f = this.f213172p;
        AW.a aVar = AW.a.f430a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(aVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
