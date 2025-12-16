package com.avito.android.tariff.cpx.info.advance.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import tB0.C48533d;
import tB0.InterfaceC48530a;
import tB0.InterfaceC48531b;

/* compiled from: TariffCpxInfoAdvanceActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff/cpx/info/advance/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "LtB0/a;", "LtB0/b;", "LtB0/d;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements com.avito.android.arch.mvi.a<InterfaceC48530a, InterfaceC48531b, C48533d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final v50.g f296340a;

    @Inject
    public d(@Y61.k v50.g gVar) {
        this.f296340a = gVar;
    }

    @Y61.k
    public static InterfaceC43160i c(@Y61.k InterfaceC48530a interfaceC48530a, @Y61.k C48533d c48533d) {
        if (interfaceC48530a instanceof InterfaceC48530a.C12662a) {
            return new C43210w(new InterfaceC48531b.a(((InterfaceC48530a.C12662a) interfaceC48530a).f439185a));
        }
        if (!(interfaceC48530a instanceof InterfaceC48530a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        DeepLink deeplink = c48533d.f439198b.getDeeplink();
        return deeplink != null ? new C43210w(new InterfaceC48531b.d(deeplink, c48533d.f439199c)) : C43175k.w();
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(new a(this.f296340a.a()), com.avito.android.arch.mvi.utils.h.e(c43197r1, b.f296337l, new c(this, aVar), 1000L));
    }

    @Override // com.avito.android.arch.mvi.a
    public final /* bridge */ /* synthetic */ InterfaceC43160i<InterfaceC48531b> b(InterfaceC48530a interfaceC48530a, C48533d c48533d) {
        return c(interfaceC48530a, c48533d);
    }
}
