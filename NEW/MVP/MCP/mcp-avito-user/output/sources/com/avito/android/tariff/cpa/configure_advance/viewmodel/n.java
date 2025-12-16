package com.avito.android.tariff.cpa.configure_advance.viewmodel;

import androidx.compose.runtime.internal.P;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ConfigureAdvanceRepository.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpa/configure_advance/viewmodel/n;", "Lcom/avito/android/tariff/cpa/configure_advance/viewmodel/j;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class n implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final WB0.a f294399a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f294400b;

    @Inject
    public n(@Y61.k WB0.a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f294399a = aVar;
        this.f294400b = interfaceC35745a5;
    }

    @Override // com.avito.android.tariff.cpa.configure_advance.viewmodel.j
    @Y61.k
    public final B0 a(@Y61.k String str) {
        return this.f294399a.l(str).x0(this.f294400b.a()).d0(k.f294396b);
    }

    @Override // com.avito.android.tariff.cpa.configure_advance.viewmodel.j
    @Y61.k
    public final B0 c(int i12, @Y61.k String str) {
        return this.f294399a.c(i12, str).x0(this.f294400b.a()).d0(m.f294398b);
    }

    @Override // com.avito.android.tariff.cpa.configure_advance.viewmodel.j
    @Y61.k
    public final B0 e(int i12, @Y61.k String str) {
        return this.f294399a.e(i12, str).x0(this.f294400b.a()).d0(l.f294397b);
    }
}
