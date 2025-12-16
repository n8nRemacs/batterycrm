package com.avito.android.tariff_cpt.info.mvi;

import com.avito.android.tariff_cpt.info.mvi.entity.CptInfoV2InternalAction;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43160i;
import yC0.InterfaceC50099a;

/* compiled from: CptInfoV2Actor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LyC0/a;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/tariff_cpt/info/mvi/entity/CptInfoV2InternalAction;", "invoke", "(LyC0/a;)Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class d extends N implements Y41.l<InterfaceC50099a, InterfaceC43160i<? extends CptInfoV2InternalAction>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f298234l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<yC0.c> f298235m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, Y41.a<yC0.c> aVar) {
        super(1);
        this.f298234l = fVar;
        this.f298235m = aVar;
    }

    @Override // Y41.l
    public final InterfaceC43160i<? extends CptInfoV2InternalAction> invoke(InterfaceC50099a interfaceC50099a) {
        yC0.c cVarInvoke = this.f298235m.invoke();
        return this.f298234l.b(interfaceC50099a, cVarInvoke);
    }
}
