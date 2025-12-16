package com.avito.android.data_picker_show.datapickershow.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.data_picker_show.datapickershow.mvi.entity.DataPickerShowInternalAction;
import gu.InterfaceC40736a;
import gu.InterfaceC40737b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DataPickerShowFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lgu/a;", "Lcom/avito/android/data_picker_show/datapickershow/mvi/entity/DataPickerShowInternalAction;", "Lgu/c;", "Lgu/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class e extends N implements Y41.l<q<InterfaceC40736a, DataPickerShowInternalAction, gu.c, InterfaceC40737b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f132512l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f132513m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f132514n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j f132515o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h f132516p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, j jVar, h hVar) {
        super(1);
        this.f132512l = cVar;
        this.f132513m = aVar;
        this.f132514n = screenPerformanceTracker;
        this.f132515o = jVar;
        this.f132516p = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC40736a, DataPickerShowInternalAction, gu.c, InterfaceC40737b> qVar) {
        q<InterfaceC40736a, DataPickerShowInternalAction, gu.c, InterfaceC40737b> qVar2 = qVar;
        qVar2.f92008d = this.f132512l;
        qVar2.f92009e = this.f132513m;
        qVar2.f92011g = new o(this.f132514n, this.f132515o);
        qVar2.f92010f = this.f132516p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
