package com.avito.android.tariff_cpt.configure.levels.domain;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.tariff_cpt.configure.levels.mvi.entity.TariffCptConfigureLevelsInternalAction;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import uC0.InterfaceC48882a;

/* compiled from: TariffCptConfigureLevelsUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/levels/domain/c;", "Lcom/avito/android/tariff_cpt/configure/levels/domain/a;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f297864b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC48882a f297865c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final R0 f297866d;

    @Inject
    public c(@k @com.avito.android.tariff_cpt.common.di.c String str, @k InterfaceC48882a interfaceC48882a, @k R0 r02) {
        this.f297864b = str;
        this.f297865c = interfaceC48882a;
        this.f297866d = r02;
    }

    @Override // Y41.a
    public final InterfaceC43160i<? extends TariffCptConfigureLevelsInternalAction> invoke() {
        return C43175k.I(this.f297866d.a(), C43175k.G(new b(this, null)));
    }
}
