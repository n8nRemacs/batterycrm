package com.avito.android.sx_address.list.mvi;

import com.avito.android.sx_address.list.mvi.entity.ListState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SxAddressListFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lcom/avito/android/sx_address/list/mvi/entity/a;", "Lcom/avito/android/sx_address/list/mvi/entity/b;", "Lcom/avito/android/sx_address/list/mvi/entity/ListState;", "Lcom/avito/android/sx_address/list/mvi/entity/c;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class C extends N implements Y41.l<com.avito.android.arch.mvi.q<com.avito.android.sx_address.list.mvi.entity.a, com.avito.android.sx_address.list.mvi.entity.b, ListState, com.avito.android.sx_address.list.mvi.entity.c>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z f293213l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x f293214m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ H f293215n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ F f293216o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(z zVar, x xVar, H h12, F f12) {
        super(1);
        this.f293213l = zVar;
        this.f293214m = xVar;
        this.f293215n = h12;
        this.f293216o = f12;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<com.avito.android.sx_address.list.mvi.entity.a, com.avito.android.sx_address.list.mvi.entity.b, ListState, com.avito.android.sx_address.list.mvi.entity.c> qVar) {
        com.avito.android.arch.mvi.q<com.avito.android.sx_address.list.mvi.entity.a, com.avito.android.sx_address.list.mvi.entity.b, ListState, com.avito.android.sx_address.list.mvi.entity.c> qVar2 = qVar;
        qVar2.f92008d = this.f293213l;
        qVar2.f92009e = this.f293214m;
        qVar2.f92011g = this.f293215n;
        qVar2.f92010f = this.f293216o;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
