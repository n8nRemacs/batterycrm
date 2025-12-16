package com.avito.android.notificationdeeplink.mvi;

import Y41.l;
import com.avito.android.arch.mvi.q;
import com.avito.android.notificationdeeplink.mvi.entity.NotificationDeepLinkState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: NotificationDeepLinkFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LK30/a;", "LK30/b;", "Lcom/avito/android/notificationdeeplink/mvi/entity/NotificationDeepLinkState;", "LK30/c;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class c extends N implements l<q<K30.a, K30.b, NotificationDeepLinkState, K30.c>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f207812l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f207813m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, f fVar) {
        super(1);
        this.f207812l = aVar;
        this.f207813m = fVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<K30.a, K30.b, NotificationDeepLinkState, K30.c> qVar) {
        q<K30.a, K30.b, NotificationDeepLinkState, K30.c> qVar2 = qVar;
        qVar2.f92008d = this.f207812l;
        qVar2.f92010f = this.f207813m;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
