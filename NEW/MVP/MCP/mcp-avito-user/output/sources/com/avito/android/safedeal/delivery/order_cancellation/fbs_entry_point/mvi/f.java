package com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.mvi;

import Gn0.InterfaceC13900a;
import Y41.l;
import com.avito.android.arch.mvi.q;
import com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.mvi.entity.FbsEntryPointInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FbsEntryPointFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LGn0/a;", "Lcom/avito/android/safedeal/delivery/order_cancellation/fbs_entry_point/mvi/entity/FbsEntryPointInternalAction;", "LGn0/c;", "LGn0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class f extends N implements l<q<InterfaceC13900a, FbsEntryPointInternalAction, Gn0.c, Gn0.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f256352l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f256353m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i f256354n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, b bVar, i iVar) {
        super(1);
        this.f256352l = dVar;
        this.f256353m = bVar;
        this.f256354n = iVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC13900a, FbsEntryPointInternalAction, Gn0.c, Gn0.b> qVar) {
        q<InterfaceC13900a, FbsEntryPointInternalAction, Gn0.c, Gn0.b> qVar2 = qVar;
        qVar2.f92008d = this.f256352l;
        qVar2.f92009e = this.f256353m;
        qVar2.f92010f = this.f256354n;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
