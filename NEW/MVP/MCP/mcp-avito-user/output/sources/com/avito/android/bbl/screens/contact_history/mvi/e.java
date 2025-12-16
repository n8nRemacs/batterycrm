package com.avito.android.bbl.screens.contact_history.mvi;

import Dh.C13399c;
import Dh.InterfaceC13397a;
import Dh.InterfaceC13398b;
import Y41.l;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.bbl.screens.contact_history.mvi.entity.BblContactHistoryInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BblContactHistoryFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LDh/a;", "Lcom/avito/android/bbl/screens/contact_history/mvi/entity/BblContactHistoryInternalAction;", "LDh/c;", "LDh/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class e extends N implements l<q<InterfaceC13397a, BblContactHistoryInternalAction, C13399c, InterfaceC13398b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f99671l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f99672m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f99673n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j f99674o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h f99675p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, j jVar, h hVar) {
        super(1);
        this.f99671l = cVar;
        this.f99672m = aVar;
        this.f99673n = screenPerformanceTracker;
        this.f99674o = jVar;
        this.f99675p = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC13397a, BblContactHistoryInternalAction, C13399c, InterfaceC13398b> qVar) {
        q<InterfaceC13397a, BblContactHistoryInternalAction, C13399c, InterfaceC13398b> qVar2 = qVar;
        qVar2.f92008d = this.f99671l;
        qVar2.f92009e = this.f99672m;
        qVar2.f92011g = new o(this.f99673n, this.f99674o);
        qVar2.f92010f = this.f99675p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
