package com.avito.android.virtual_deal_room.client_edit.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.virtual_deal_room.client_edit.mvi.entity.ClientEditInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ClientEditFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LCN0/a;", "Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditInternalAction;", "LCN0/c;", "LCN0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class g extends N implements Y41.l<q<CN0.a, ClientEditInternalAction, CN0.c, CN0.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f326231l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f326232m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f326233n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f326234o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j f326235p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, b bVar, ScreenPerformanceTracker screenPerformanceTracker, l lVar, j jVar) {
        super(1);
        this.f326231l = eVar;
        this.f326232m = bVar;
        this.f326233n = screenPerformanceTracker;
        this.f326234o = lVar;
        this.f326235p = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<CN0.a, ClientEditInternalAction, CN0.c, CN0.b> qVar) {
        q<CN0.a, ClientEditInternalAction, CN0.c, CN0.b> qVar2 = qVar;
        qVar2.f92008d = this.f326231l;
        qVar2.f92009e = this.f326232m;
        qVar2.f92011g = new o(this.f326233n, this.f326234o);
        qVar2.f92010f = this.f326235p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
