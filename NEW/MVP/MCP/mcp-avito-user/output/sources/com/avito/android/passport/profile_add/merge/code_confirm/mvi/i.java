package com.avito.android.passport.profile_add.merge.code_confirm.mvi;

import b60.InterfaceC25416a;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.passport.profile_add.merge.code_confirm.mvi.entity.CodeConfirmInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CodeConfirmFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lb60/a;", "Lcom/avito/android/passport/profile_add/merge/code_confirm/mvi/entity/CodeConfirmInternalAction;", "Lb60/c;", "Lb60/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class i extends N implements Y41.l<q<InterfaceC25416a, CodeConfirmInternalAction, b60.c, b60.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f212761l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f212762m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f212763n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f212764o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ g f212765p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(e eVar, b bVar, ScreenPerformanceTracker screenPerformanceTracker, l lVar, g gVar) {
        super(1);
        this.f212761l = eVar;
        this.f212762m = bVar;
        this.f212763n = screenPerformanceTracker;
        this.f212764o = lVar;
        this.f212765p = gVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC25416a, CodeConfirmInternalAction, b60.c, b60.b> qVar) {
        q<InterfaceC25416a, CodeConfirmInternalAction, b60.c, b60.b> qVar2 = qVar;
        qVar2.f92008d = this.f212761l;
        qVar2.f92009e = this.f212762m;
        qVar2.f92011g = new o(this.f212763n, this.f212764o);
        qVar2.f92010f = this.f212765p;
        AW.a aVar = AW.a.f430a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(aVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
