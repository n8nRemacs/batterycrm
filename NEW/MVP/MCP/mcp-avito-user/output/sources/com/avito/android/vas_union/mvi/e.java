package com.avito.android.vas_union.mvi;

import Y41.l;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.vas_union.mvi.entity.VasUnionV2InternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import qM0.C47322c;
import qM0.InterfaceC47320a;
import qM0.InterfaceC47321b;

/* compiled from: VasUnionV2FeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LqM0/a;", "Lcom/avito/android/vas_union/mvi/entity/VasUnionV2InternalAction;", "LqM0/c;", "LqM0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class e extends N implements l<q<InterfaceC47320a, VasUnionV2InternalAction, C47322c, InterfaceC47321b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f323211l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f323212m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f323213n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j f323214o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h f323215p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, j jVar, h hVar) {
        super(1);
        this.f323211l = cVar;
        this.f323212m = aVar;
        this.f323213n = screenPerformanceTracker;
        this.f323214o = jVar;
        this.f323215p = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC47320a, VasUnionV2InternalAction, C47322c, InterfaceC47321b> qVar) {
        q<InterfaceC47320a, VasUnionV2InternalAction, C47322c, InterfaceC47321b> qVar2 = qVar;
        qVar2.f92008d = this.f323211l;
        qVar2.f92009e = this.f323212m;
        qVar2.f92011g = new o(this.f323213n, this.f323214o);
        qVar2.f92010f = this.f323215p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
