package com.avito.android.notifications_permission.presentation.mvi;

import com.avito.android.arch.mvi.q;
import com.avito.android.notifications_permission.presentation.mvi.entity.NotificationPermissionInfoInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: NotificationPermissionInfoFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LQ30/a;", "Lcom/avito/android/notifications_permission/presentation/mvi/entity/NotificationPermissionInfoInternalAction;", "LQ30/c;", "LQ30/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class h extends N implements Y41.l<q<Q30.a, NotificationPermissionInfoInternalAction, Q30.c, Q30.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f207884l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f207885m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ k f207886n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, d dVar, k kVar) {
        super(1);
        this.f207884l = fVar;
        this.f207885m = dVar;
        this.f207886n = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<Q30.a, NotificationPermissionInfoInternalAction, Q30.c, Q30.b> qVar) {
        q<Q30.a, NotificationPermissionInfoInternalAction, Q30.c, Q30.b> qVar2 = qVar;
        qVar2.f92008d = this.f207884l;
        qVar2.f92009e = this.f207885m;
        qVar2.f92010f = this.f207886n;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
