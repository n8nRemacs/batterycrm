package com.avito.android.success_screen_after_apply.mvi;

import com.avito.android.arch.mvi.q;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SuccessScreenAfterApplyFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lcom/avito/android/success_screen_after_apply/mvi/a;", "Lcom/avito/android/success_screen_after_apply/mvi/i;", "Lcom/avito/android/success_screen_after_apply/mvi/m;", "Lcom/avito/android/success_screen_after_apply/mvi/j;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class f extends N implements Y41.l<q<a, i, m, j>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f291735l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k f291736m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, k kVar) {
        super(1);
        this.f291735l = dVar;
        this.f291736m = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<a, i, m, j> qVar) {
        q<a, i, m, j> qVar2 = qVar;
        qVar2.f92009e = this.f291735l;
        qVar2.f92010f = this.f291736m;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91992g);
        return G0.f406611a;
    }
}
