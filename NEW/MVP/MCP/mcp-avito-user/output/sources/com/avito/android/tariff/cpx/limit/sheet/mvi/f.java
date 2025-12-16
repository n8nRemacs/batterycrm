package com.avito.android.tariff.cpx.limit.sheet.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.tariff.cpx.limit.sheet.mvi.entity.TariffCpxLimitInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.rx3.y;

/* compiled from: TariffCpxLimitActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff/cpx/limit/sheet/mvi/f;", "Lcom/avito/android/arch/mvi/a;", "LNB0/a;", "Lcom/avito/android/tariff/cpx/limit/sheet/mvi/entity/TariffCpxLimitInternalAction;", "LNB0/c;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements com.avito.android.arch.mvi.a<NB0.a, TariffCpxLimitInternalAction, NB0.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f297328a;

    @Inject
    public f(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f297328a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlinx.coroutines.flow.InterfaceC43160i c(@Y61.k NB0.a r6, @Y61.k NB0.c r7) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.tariff.cpx.limit.sheet.mvi.f.c(NB0.a, NB0.c):kotlinx.coroutines.flow.i");
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(C43175k.G(new c(new a(new b(y.a(this.f297328a.d9()))), null)), com.avito.android.arch.mvi.utils.h.e(c43197r1, d.f297312l, new e(this, aVar), 1000L));
    }

    @Override // com.avito.android.arch.mvi.a
    public final /* bridge */ /* synthetic */ InterfaceC43160i<TariffCpxLimitInternalAction> b(NB0.a aVar, NB0.c cVar) {
        return c(aVar, cVar);
    }
}
