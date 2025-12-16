package com.avito.android.tariff.cpr.configure.advance.manual.mvi.domain;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.tariff.cpr.configure.advance.manual.di.e;
import com.avito.android.tariff.cpr.configure.advance.manual.mvi.entity.CprConfigureAdvanceManualInternalAction;
import com.avito.android.util.R0;
import hB0.InterfaceC40801a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CprConfigureAdvanceManualUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/advance/manual/mvi/domain/c;", "Lcom/avito/android/tariff/cpr/configure/advance/manual/mvi/domain/a;", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f295412b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC40801a f295413c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final R0 f295414d;

    @Inject
    public c(@e @k String str, @k InterfaceC40801a interfaceC40801a, @k R0 r02) {
        this.f295412b = str;
        this.f295413c = interfaceC40801a;
        this.f295414d = r02;
    }

    @Override // Y41.a
    public final InterfaceC43160i<? extends CprConfigureAdvanceManualInternalAction> invoke() {
        return C43175k.I(this.f295414d.a(), C43175k.G(new b(this, null)));
    }
}
