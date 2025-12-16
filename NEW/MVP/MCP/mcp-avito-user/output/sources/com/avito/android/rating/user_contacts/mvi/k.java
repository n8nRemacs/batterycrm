package com.avito.android.rating.user_contacts.mvi;

import Sg0.InterfaceC15184a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.rating.user_contacts.mvi.entity.UserContactsInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UserContactsFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lcom/avito/android/rating/user_contacts/mvi/entity/a;", "Lcom/avito/android/rating/user_contacts/mvi/entity/UserContactsInternalAction;", "Lcom/avito/android/rating/user_contacts/mvi/entity/b;", "LSg0/a;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class k extends N implements Y41.l<com.avito.android.arch.mvi.q<com.avito.android.rating.user_contacts.mvi.entity.a, UserContactsInternalAction, com.avito.android.rating.user_contacts.mvi.entity.b, InterfaceC15184a>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f247835l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f247836m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f247837n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ s f247838o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ q f247839p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(f fVar, d dVar, ScreenPerformanceTracker screenPerformanceTracker, s sVar, q qVar) {
        super(1);
        this.f247835l = fVar;
        this.f247836m = dVar;
        this.f247837n = screenPerformanceTracker;
        this.f247838o = sVar;
        this.f247839p = qVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<com.avito.android.rating.user_contacts.mvi.entity.a, UserContactsInternalAction, com.avito.android.rating.user_contacts.mvi.entity.b, InterfaceC15184a> qVar) {
        com.avito.android.arch.mvi.q<com.avito.android.rating.user_contacts.mvi.entity.a, UserContactsInternalAction, com.avito.android.rating.user_contacts.mvi.entity.b, InterfaceC15184a> qVar2 = qVar;
        qVar2.f92008d = this.f247835l;
        qVar2.f92009e = this.f247836m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f247837n, this.f247838o);
        qVar2.f92010f = this.f247839p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
