package com.avito.android.tariff.cpa.configure_info.viewmodel;

import androidx.compose.runtime.internal.P;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CpaConfigureInfoRepository.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpa/configure_info/viewmodel/i;", "Lcom/avito/android/tariff/cpa/configure_info/viewmodel/g;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final WB0.a f294540a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f294541b;

    @Inject
    public i(@Y61.k WB0.a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f294540a = aVar;
        this.f294541b = interfaceC35745a5;
    }

    @Override // com.avito.android.tariff.cpa.configure_info.viewmodel.g
    @Y61.k
    public final B0 d(@Y61.k String str) {
        return this.f294540a.d(str).x0(this.f294541b.a()).d0(h.f294539b);
    }
}
