package com.avito.android.tariff_lf_publication.level.mvi;

import com.avito.android.tariff_lf_publication.level.mvi.entity.TariffLfPublicationLevelInternalAction;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: TariffLfPublicationLevelActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LUD0/a;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/tariff_lf_publication/level/mvi/entity/TariffLfPublicationLevelInternalAction;", "invoke", "(LUD0/a;)Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class b extends N implements Y41.l<UD0.a, InterfaceC43160i<? extends TariffLfPublicationLevelInternalAction>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f300920l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<UD0.c> f300921m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Y41.a<UD0.c> aVar) {
        super(1);
        this.f300920l = cVar;
        this.f300921m = aVar;
    }

    @Override // Y41.l
    public final InterfaceC43160i<? extends TariffLfPublicationLevelInternalAction> invoke(UD0.a aVar) {
        UD0.c cVarInvoke = this.f300921m.invoke();
        return this.f300920l.b(aVar, cVarInvoke);
    }
}
