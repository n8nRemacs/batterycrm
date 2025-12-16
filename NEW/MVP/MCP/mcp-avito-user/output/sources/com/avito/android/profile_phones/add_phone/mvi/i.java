package com.avito.android.profile_phones.add_phone.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.arch.mvi.r;
import com.avito.android.profile_phones.add_phone.mvi.entity.AddPhoneInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import nb0.C44373c;
import nb0.InterfaceC44371a;
import nb0.InterfaceC44372b;

/* compiled from: AddPhoneFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lnb0/a;", "Lcom/avito/android/profile_phones/add_phone/mvi/entity/AddPhoneInternalAction;", "Lnb0/c;", "Lnb0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class i extends N implements Y41.l<q<InterfaceC44371a, AddPhoneInternalAction, C44373c, InterfaceC44372b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f226931l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f226932m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f226933n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ n f226934o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ l f226935p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, e eVar, ScreenPerformanceTracker screenPerformanceTracker, n nVar, l lVar) {
        super(1);
        this.f226931l = gVar;
        this.f226932m = eVar;
        this.f226933n = screenPerformanceTracker;
        this.f226934o = nVar;
        this.f226935p = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC44371a, AddPhoneInternalAction, C44373c, InterfaceC44372b> qVar) {
        q<InterfaceC44371a, AddPhoneInternalAction, C44373c, InterfaceC44372b> qVar2 = qVar;
        qVar2.f92008d = this.f226931l;
        qVar2.f92009e = this.f226932m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f226933n, this.f226934o);
        qVar2.f92010f = this.f226935p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91994i);
        qVar2.f92014j = new r(false, true, 1, null);
        return G0.f406611a;
    }
}
