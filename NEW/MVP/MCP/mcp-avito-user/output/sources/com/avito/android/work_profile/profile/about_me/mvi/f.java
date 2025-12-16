package com.avito.android.work_profile.profile.about_me.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.work_profile.profile.about_me.mvi.entity.AboutMeInternalAction;
import hQ0.C40868c;
import hQ0.InterfaceC40866a;
import hQ0.InterfaceC40867b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AboutMeFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LhQ0/a;", "Lcom/avito/android/work_profile/profile/about_me/mvi/entity/AboutMeInternalAction;", "LhQ0/c;", "LhQ0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class f extends N implements Y41.l<q<InterfaceC40866a, AboutMeInternalAction, C40868c, InterfaceC40867b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f330802l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f330803m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f330804n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f330805o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i f330806p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, b bVar, ScreenPerformanceTracker screenPerformanceTracker, k kVar, i iVar) {
        super(1);
        this.f330802l = dVar;
        this.f330803m = bVar;
        this.f330804n = screenPerformanceTracker;
        this.f330805o = kVar;
        this.f330806p = iVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC40866a, AboutMeInternalAction, C40868c, InterfaceC40867b> qVar) {
        q<InterfaceC40866a, AboutMeInternalAction, C40868c, InterfaceC40867b> qVar2 = qVar;
        qVar2.f92008d = this.f330802l;
        qVar2.f92009e = this.f330803m;
        qVar2.f92011g = new o(this.f330804n, this.f330805o);
        qVar2.f92010f = this.f330806p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
