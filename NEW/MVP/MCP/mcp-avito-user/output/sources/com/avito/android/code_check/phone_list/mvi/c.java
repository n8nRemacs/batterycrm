package com.avito.android.code_check.phone_list.mvi;

import Qo.C14915b;
import Qo.InterfaceC14914a;
import Y41.l;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.code_check.phone_list.mvi.entity.PhoneListInternalAction;
import com.avito.android.util.R0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PhoneListFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LQo/a;", "Lcom/avito/android/code_check/phone_list/mvi/entity/PhoneListInternalAction;", "LQo/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class c extends N implements l<q<InterfaceC14914a, PhoneListInternalAction, C14915b, G0>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f118994l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f118995m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ f f118996n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ R0 f118997o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, ScreenPerformanceTracker screenPerformanceTracker, f fVar, R0 r02) {
        super(1);
        this.f118994l = aVar;
        this.f118995m = screenPerformanceTracker;
        this.f118996n = fVar;
        this.f118997o = r02;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC14914a, PhoneListInternalAction, C14915b, G0> qVar) {
        q<InterfaceC14914a, PhoneListInternalAction, C14915b, G0> qVar2 = qVar;
        qVar2.f92009e = this.f118994l;
        qVar2.f92011g = new o(this.f118995m, this.f118996n);
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        qVar2.f92013i = this.f118997o.c();
        return G0.f406611a;
    }
}
