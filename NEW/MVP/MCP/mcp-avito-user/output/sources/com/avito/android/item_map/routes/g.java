package com.avito.android.item_map.routes;

import com.avito.android.item_map.remote.model.route.RouteResponse;
import com.avito.android.util.P2;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RoutesInteractor.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0001*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "Lcom/avito/android/util/P2;", "Lcom/avito/android/item_map/remote/model/route/RouteResponse;", "invoke", "(Ljava/lang/Throwable;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class g extends N implements Y41.l<Throwable, P2<? super RouteResponse>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f173384l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar) {
        super(1);
        this.f173384l = hVar;
    }

    @Override // Y41.l
    public final P2<? super RouteResponse> invoke(Throwable th2) {
        return new P2.a(this.f173384l.f173386b.a(th2));
    }
}
