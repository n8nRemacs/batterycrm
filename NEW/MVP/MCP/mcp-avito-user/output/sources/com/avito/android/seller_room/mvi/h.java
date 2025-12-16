package com.avito.android.seller_room.mvi;

import Vq0.InterfaceC15708a;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.seller_room.mvi.entity.SellerRoomInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SellerRoomFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LVq0/a;", "Lcom/avito/android/seller_room/mvi/entity/SellerRoomInternalAction;", "LVq0/c;", "LVq0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class h extends N implements Y41.l<q<InterfaceC15708a, SellerRoomInternalAction, Vq0.c, Vq0.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f268149l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f268150m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f268151n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f268152o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ f f268153p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(d dVar, b bVar, ScreenPerformanceTracker screenPerformanceTracker, k kVar, f fVar) {
        super(1);
        this.f268149l = dVar;
        this.f268150m = bVar;
        this.f268151n = screenPerformanceTracker;
        this.f268152o = kVar;
        this.f268153p = fVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC15708a, SellerRoomInternalAction, Vq0.c, Vq0.b> qVar) {
        q<InterfaceC15708a, SellerRoomInternalAction, Vq0.c, Vq0.b> qVar2 = qVar;
        qVar2.f92008d = this.f268149l;
        qVar2.f92009e = this.f268150m;
        qVar2.f92011g = new o(this.f268151n, this.f268152o);
        qVar2.f92010f = this.f268153p;
        return G0.f406611a;
    }
}
