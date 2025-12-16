package com.avito.android.suggest_addresses.mvi;

import com.avito.android.suggest_addresses.mvi.entity.SuggestAddressesInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import oA0.C44612c;
import oA0.InterfaceC44610a;
import oA0.InterfaceC44611b;

/* compiled from: SuggestAddressesFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LoA0/a;", "Lcom/avito/android/suggest_addresses/mvi/entity/SuggestAddressesInternalAction;", "LoA0/c;", "LoA0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class o extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC44610a, SuggestAddressesInternalAction, C44612c, InterfaceC44611b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m f291951l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k f291952m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ t f291953n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ r f291954o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(m mVar, k kVar, t tVar, r rVar) {
        super(1);
        this.f291951l = mVar;
        this.f291952m = kVar;
        this.f291953n = tVar;
        this.f291954o = rVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC44610a, SuggestAddressesInternalAction, C44612c, InterfaceC44611b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC44610a, SuggestAddressesInternalAction, C44612c, InterfaceC44611b> qVar2 = qVar;
        qVar2.f92008d = this.f291951l;
        qVar2.f92009e = this.f291952m;
        qVar2.f92011g = this.f291953n;
        qVar2.f92010f = this.f291954o;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
