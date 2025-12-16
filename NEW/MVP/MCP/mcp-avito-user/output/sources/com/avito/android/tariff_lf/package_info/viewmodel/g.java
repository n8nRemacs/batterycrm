package com.avito.android.tariff_lf.package_info.viewmodel;

import bD0.InterfaceC25499a;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TariffPackageInfoRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf/package_info/viewmodel/g;", "Lcom/avito/android/tariff_lf/package_info/viewmodel/e;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC25499a f299282a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f299283b;

    @Inject
    public g(@Y61.k InterfaceC25499a interfaceC25499a, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f299282a = interfaceC25499a;
        this.f299283b = interfaceC35745a5;
    }

    @Override // com.avito.android.tariff_lf.package_info.viewmodel.e
    @Y61.k
    public final B0 a(@Y61.k String str, @Y61.k String str2) {
        return this.f299282a.c(str, str2).x0(this.f299283b.a()).d0(f.f299281b);
    }
}
