package com.avito.android.tariff.cpx.info.sf.menu.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.tariff.cpx.info.sf.menu.mvi.entity.TariffCpxInfoSfMenuInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import zB0.C50434c;
import zB0.InterfaceC50432a;

/* compiled from: TariffCpxInfoSfMenuActor.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/tariff/cpx/info/sf/menu/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LzB0/a;", "Lcom/avito/android/tariff/cpx/info/sf/menu/mvi/entity/TariffCpxInfoSfMenuInternalAction;", "LzB0/c;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC50432a, TariffCpxInfoSfMenuInternalAction, C50434c> {
    @Inject
    public a() {
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<TariffCpxInfoSfMenuInternalAction> b(InterfaceC50432a interfaceC50432a, C50434c c50434c) {
        InterfaceC50432a interfaceC50432a2 = interfaceC50432a;
        if (interfaceC50432a2 instanceof InterfaceC50432a.C12946a) {
            return new C43210w(new TariffCpxInfoSfMenuInternalAction.HandleDeeplinkWithCloseScreen(((InterfaceC50432a.C12946a) interfaceC50432a2).f443943a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
