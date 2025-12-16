package com.avito.android.tariff_lf.edit_info.viewmodel;

import bD0.InterfaceC25499a;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: EditInfoRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf/edit_info/viewmodel/i;", "Lcom/avito/android/tariff_lf/edit_info/viewmodel/e;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i implements InterfaceC35211e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC25499a f299096a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f299097b;

    @Inject
    public i(@Y61.k InterfaceC25499a interfaceC25499a, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f299096a = interfaceC25499a;
        this.f299097b = interfaceC35745a5;
    }

    @Override // com.avito.android.tariff_lf.edit_info.viewmodel.InterfaceC35211e
    @Y61.k
    public final B0 a() {
        return this.f299096a.a().x0(this.f299097b.a()).d0(C35212f.f299093b);
    }

    @Override // com.avito.android.tariff_lf.edit_info.viewmodel.InterfaceC35211e
    @Y61.k
    public final B0 b(@Y61.k String str) {
        return this.f299096a.d(str).x0(this.f299097b.a()).d0(C35213g.f299094b);
    }

    @Override // com.avito.android.tariff_lf.edit_info.viewmodel.InterfaceC35211e
    @Y61.k
    public final B0 c(boolean z12) {
        return this.f299096a.b(z12 ? "1" : "0").x0(this.f299097b.a()).d0(C35214h.f299095b);
    }
}
