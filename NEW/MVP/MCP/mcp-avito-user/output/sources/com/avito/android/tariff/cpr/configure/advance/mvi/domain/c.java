package com.avito.android.tariff.cpr.configure.advance.mvi.domain;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.tariff.cpr.configure.advance.mvi.entity.CprConfigureAdvanceInternalAction;
import com.avito.android.util.R0;
import hB0.InterfaceC40801a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: GetCprConfigureAdvanceUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/advance/mvi/domain/c;", "Lcom/avito/android/tariff/cpr/configure/advance/mvi/domain/a;", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC40801a f295457b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final R0 f295458c;

    @Inject
    public c(@k InterfaceC40801a interfaceC40801a, @k R0 r02) {
        this.f295457b = interfaceC40801a;
        this.f295458c = r02;
    }

    @Override // Y41.l
    public final InterfaceC43160i<? extends CprConfigureAdvanceInternalAction> invoke(String str) {
        return C43175k.I(this.f295458c.a(), C43175k.G(new b(this, str, null)));
    }
}
