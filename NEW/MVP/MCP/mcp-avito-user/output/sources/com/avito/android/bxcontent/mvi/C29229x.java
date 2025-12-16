package com.avito.android.bxcontent.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.bxcontent.mvi.entity.BxContentInternalAction;
import com.avito.android.bxcontent.mvi.entity.InterfaceC29127b;
import kotlin.Metadata;

/* compiled from: BxContentFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "Lcom/avito/android/bxcontent/mvi/entity/l;", "Lcom/avito/android/bxcontent/mvi/entity/g;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.bxcontent.mvi.x, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29229x extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC29127b, BxContentInternalAction, com.avito.android.bxcontent.mvi.entity.l, com.avito.android.bxcontent.mvi.entity.g>, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.arch.mvi.b<BxContentInternalAction> f112619l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C29105a f112620m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f112621n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ J0 f112622o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29229x(com.avito.android.arch.mvi.b<BxContentInternalAction> bVar, C29105a c29105a, ScreenPerformanceTracker screenPerformanceTracker, J0 j02) {
        super(1);
        this.f112619l = bVar;
        this.f112620m = c29105a;
        this.f112621n = screenPerformanceTracker;
        this.f112622o = j02;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(com.avito.android.arch.mvi.q<InterfaceC29127b, BxContentInternalAction, com.avito.android.bxcontent.mvi.entity.l, com.avito.android.bxcontent.mvi.entity.g> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC29127b, BxContentInternalAction, com.avito.android.bxcontent.mvi.entity.l, com.avito.android.bxcontent.mvi.entity.g> qVar2 = qVar;
        qVar2.f92008d = this.f112619l;
        qVar2.f92009e = this.f112620m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f112621n, this.f112622o);
        qVar2.f92010f = I0.f111367b;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91992g);
        return kotlin.G0.f406611a;
    }
}
