package com.avito.android.verification.verification_passport.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.arch.mvi.r;
import com.avito.android.verification.verification_passport.mvi.entity.PassportInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PassportFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LVM0/a;", "Lcom/avito/android/verification/verification_passport/mvi/entity/PassportInternalAction;", "LVM0/c;", "LVM0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class h extends N implements Y41.l<q<VM0.a, PassportInternalAction, VM0.c, VM0.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f325734l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f325735m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ m f325736n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f325737o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, ScreenPerformanceTracker screenPerformanceTracker, m mVar, k kVar) {
        super(1);
        this.f325734l = fVar;
        this.f325735m = screenPerformanceTracker;
        this.f325736n = mVar;
        this.f325737o = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<VM0.a, PassportInternalAction, VM0.c, VM0.b> qVar) {
        q<VM0.a, PassportInternalAction, VM0.c, VM0.b> qVar2 = qVar;
        qVar2.f92009e = this.f325734l;
        qVar2.f92011g = new o(this.f325735m, this.f325736n);
        qVar2.f92010f = this.f325737o;
        qVar2.f92014j = new r(false, true, 1, null);
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
