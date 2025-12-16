package com.avito.android.tariff.cpx.levels.domain;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.tariff.cpx.levels.mvi.entity.CpxLevelsInternalAction;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CpxLevelsUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/levels/domain/c;", "Lcom/avito/android/tariff/cpx/levels/domain/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f297094b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final WB0.a f297095c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final R0 f297096d;

    @Inject
    public c(@k WB0.a aVar, @k R0 r02, @YA0.c @k String str) {
        this.f297094b = str;
        this.f297095c = aVar;
        this.f297096d = r02;
    }

    @Override // Y41.a
    public final InterfaceC43160i<? extends CpxLevelsInternalAction> invoke() {
        return C43175k.I(this.f297096d.a(), C43175k.G(new b(this, null)));
    }
}
