package com.avito.android.notifications_permission.presentation.mvi;

import Q30.a;
import com.avito.android.arch.mvi.a;
import com.avito.android.notifications_permission.presentation.mvi.entity.NotificationPermissionInfoInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: NotificationPermissionInfoActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/notifications_permission/presentation/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "LQ30/a;", "Lcom/avito/android/notifications_permission/presentation/mvi/entity/NotificationPermissionInfoInternalAction;", "LQ30/c;", "_avito_notifications-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements com.avito.android.arch.mvi.a<Q30.a, NotificationPermissionInfoInternalAction, Q30.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final P30.a f207869a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final N30.a f207870b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.notifications_permission.analytics.b f207871c;

    @Inject
    public d(@Y61.k P30.a aVar, @Y61.k N30.a aVar2, @Y61.k com.avito.android.notifications_permission.analytics.b bVar) {
        this.f207869a = aVar;
        this.f207870b = aVar2;
        this.f207871c = bVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<NotificationPermissionInfoInternalAction> b(Q30.a aVar, Q30.c cVar) {
        Q30.a aVar2 = aVar;
        if (aVar2 instanceof a.d) {
            com.avito.android.notifications_permission.analytics.b bVar = this.f207871c;
            bVar.f207832b.c(new com.avito.android.notifications_permission.analytics.e((String) bVar.f207833c.getValue()));
            return C43175k.w();
        }
        if (aVar2 instanceof a.C0883a) {
            return C43175k.G(new a(this, null));
        }
        if (aVar2 instanceof a.b) {
            return C43175k.G(new b(this, null));
        }
        if (aVar2 instanceof a.c) {
            return C43175k.G(new c(this, aVar2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
