package com.avito.android.tariff.cpx.configure.levels.mvi.domain;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.tariff.cpx.configure.levels.mvi.entity.TariffCpxConfigureLevelsInternalAction;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: GetTariffCpxConfigureLevelsUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/levels/mvi/domain/c;", "Lcom/avito/android/tariff/cpx/configure/levels/mvi/domain/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f296200b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final WB0.a f296201c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final R0 f296202d;

    @Inject
    public c(@k WB0.a aVar, @k R0 r02, @YA0.c @k String str) {
        this.f296200b = str;
        this.f296201c = aVar;
        this.f296202d = r02;
    }

    @Override // Y41.a
    public final InterfaceC43160i<? extends TariffCpxConfigureLevelsInternalAction> invoke() {
        return C43175k.I(this.f296202d.a(), C43175k.G(new b(this, null)));
    }
}
