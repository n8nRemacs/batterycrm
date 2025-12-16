package com.avito.android.tariff.cpr.configure.advance.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.tariff.cpr.configure.advance.mvi.entity.CprConfigureAdvanceInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CprConfigureAdvanceBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/advance/mvi/f;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/tariff/cpr/configure/advance/mvi/entity/CprConfigureAdvanceInternalAction;", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements com.avito.android.arch.mvi.b<CprConfigureAdvanceInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff.cpr.configure.advance.mvi.domain.a f295472a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f295473b;

    @Inject
    public f(@Y61.k com.avito.android.tariff.cpr.configure.advance.mvi.domain.a aVar, @Y61.k @com.avito.android.tariff.cpr.configure.advance.di.a String str) {
        this.f295472a = aVar;
        this.f295473b = str;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<CprConfigureAdvanceInternalAction> a() {
        return (InterfaceC43160i) this.f295472a.invoke(this.f295473b);
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
