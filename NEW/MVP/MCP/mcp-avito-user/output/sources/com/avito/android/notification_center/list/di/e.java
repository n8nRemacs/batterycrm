package com.avito.android.notification_center.list.di;

import com.avito.android.ab_tests.configs.PreloadingPromiseTestGroup;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.preloading.coroutines.AbstractC33302a;
import com.avito.android.preloading.coroutines.l;
import com.avito.android.remote.model.notification.NotificationsResponse;
import com.avito.android.util.C;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: NotificationCenterListModule.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/preloading/coroutines/a;", "Lkotlin/G0;", "Lcom/avito/android/remote/model/notification/NotificationsResponse;", "invoke", "()Lcom/avito/android/preloading/coroutines/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class e extends N implements Y41.a<AbstractC33302a<G0, NotificationsResponse>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E30.c f207581l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C f207582m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ PreloadingPromiseTestGroup f207583n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC28373a f207584o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C28478k f207585p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(E30.c cVar, C c12, PreloadingPromiseTestGroup preloadingPromiseTestGroup, InterfaceC28373a interfaceC28373a, C28478k c28478k) {
        super(0);
        this.f207581l = cVar;
        this.f207582m = c12;
        this.f207583n = preloadingPromiseTestGroup;
        this.f207584o = interfaceC28373a;
        this.f207585p = c28478k;
    }

    @Override // Y41.a
    public final AbstractC33302a<G0, NotificationsResponse> invoke() {
        AbstractC33302a.C6710a c6710a = AbstractC33302a.f221798g;
        l lVar = (l) this.f207581l.get();
        C43238h c43238hA = U.a(EmptyCoroutineContext.INSTANCE);
        boolean zA2 = this.f207583n.a();
        String str = this.f207585p.f90636a.f90471b;
        c6710a.getClass();
        return AbstractC33302a.C6710a.a(G0.f406611a, lVar, c43238hA, this.f207582m, zA2, 30, this.f207584o, str);
    }
}
