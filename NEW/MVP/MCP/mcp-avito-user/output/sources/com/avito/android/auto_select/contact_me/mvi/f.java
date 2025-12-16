package com.avito.android.auto_select.contact_me.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.auto_select.contact_me.mvi.entity.AutoSelectContactMeInternalAction;
import gf.C40672c;
import gf.InterfaceC40670a;
import gf.InterfaceC40671b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutoSelectContactMeFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lgf/a;", "Lcom/avito/android/auto_select/contact_me/mvi/entity/AutoSelectContactMeInternalAction;", "Lgf/c;", "Lgf/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class f extends N implements Y41.l<q<InterfaceC40670a, AutoSelectContactMeInternalAction, C40672c, InterfaceC40671b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f96011l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f96012m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ k f96013n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ d f96014o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i f96015p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b bVar, ScreenPerformanceTracker screenPerformanceTracker, k kVar, d dVar, i iVar) {
        super(1);
        this.f96011l = bVar;
        this.f96012m = screenPerformanceTracker;
        this.f96013n = kVar;
        this.f96014o = dVar;
        this.f96015p = iVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC40670a, AutoSelectContactMeInternalAction, C40672c, InterfaceC40671b> qVar) {
        q<InterfaceC40670a, AutoSelectContactMeInternalAction, C40672c, InterfaceC40671b> qVar2 = qVar;
        qVar2.f92009e = this.f96011l;
        qVar2.f92011g = new o(this.f96012m, this.f96013n);
        qVar2.f92008d = this.f96014o;
        qVar2.f92010f = this.f96015p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
