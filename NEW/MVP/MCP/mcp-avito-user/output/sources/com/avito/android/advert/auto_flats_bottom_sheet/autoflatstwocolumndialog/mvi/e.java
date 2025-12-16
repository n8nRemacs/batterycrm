package com.avito.android.advert.auto_flats_bottom_sheet.autoflatstwocolumndialog.mvi;

import Y41.l;
import com.avito.android.advert.auto_flats_bottom_sheet.autoflatstwocolumndialog.mvi.entity.AutoFlatsTwoColumnDialogInternalAction;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutoFlatsTwoColumnDialogFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LU3/a;", "Lcom/avito/android/advert/auto_flats_bottom_sheet/autoflatstwocolumndialog/mvi/entity/AutoFlatsTwoColumnDialogInternalAction;", "LU3/c;", "LU3/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class e extends N implements l<q<U3.a, AutoFlatsTwoColumnDialogInternalAction, U3.c, U3.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f68712l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f68713m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f68714n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j f68715o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h f68716p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, j jVar, h hVar) {
        super(1);
        this.f68712l = cVar;
        this.f68713m = aVar;
        this.f68714n = screenPerformanceTracker;
        this.f68715o = jVar;
        this.f68716p = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<U3.a, AutoFlatsTwoColumnDialogInternalAction, U3.c, U3.b> qVar) {
        q<U3.a, AutoFlatsTwoColumnDialogInternalAction, U3.c, U3.b> qVar2 = qVar;
        qVar2.f92008d = this.f68712l;
        qVar2.f92009e = this.f68713m;
        qVar2.f92011g = new o(this.f68714n, this.f68715o);
        qVar2.f92010f = this.f68716p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
