package com.avito.android.tariff_lf_constructor.configure.level.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.tariff_lf_constructor.configure.level.mvi.entity.ConstructorConfigureLevelInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import mD0.C43952d;
import mD0.InterfaceC43949a;

/* compiled from: ConstructorConfigureLevelActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/level/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LmD0/a;", "Lcom/avito/android/tariff_lf_constructor/configure/level/mvi/entity/ConstructorConfigureLevelInternalAction;", "LmD0/d;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements com.avito.android.arch.mvi.a<InterfaceC43949a, ConstructorConfigureLevelInternalAction, C43952d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff_lf_constructor.configure.level.domain.a f299830a;

    @Inject
    public c(@Y61.k com.avito.android.tariff_lf_constructor.configure.level.domain.a aVar) {
        this.f299830a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return com.avito.android.arch.mvi.utils.h.e(c43197r1, a.f299827l, new b(this, aVar), 1000L);
    }

    @Override // com.avito.android.arch.mvi.a
    public final /* bridge */ /* synthetic */ InterfaceC43160i<ConstructorConfigureLevelInternalAction> b(InterfaceC43949a interfaceC43949a, C43952d c43952d) {
        return c(interfaceC43949a);
    }

    @Y61.k
    public final InterfaceC43160i c(@Y61.k InterfaceC43949a interfaceC43949a) {
        if (interfaceC43949a instanceof InterfaceC43949a.b) {
            return this.f299830a.execute();
        }
        if (interfaceC43949a instanceof InterfaceC43949a.C11819a) {
            return new C43210w(ConstructorConfigureLevelInternalAction.Close.f299833b);
        }
        if (interfaceC43949a instanceof InterfaceC43949a.c) {
            return new C43210w(new ConstructorConfigureLevelInternalAction.HandleDeeplink(((InterfaceC43949a.c) interfaceC43949a).f414412a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
