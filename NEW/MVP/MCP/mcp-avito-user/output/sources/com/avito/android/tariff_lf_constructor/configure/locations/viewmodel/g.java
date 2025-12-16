package com.avito.android.tariff_lf_constructor.configure.locations.viewmodel;

import androidx.compose.runtime.internal.P;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import javax.inject.Inject;
import kotlin.Metadata;
import pD0.InterfaceC46937a;

/* compiled from: ConstructorConfigureLocationsRepository.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/locations/viewmodel/g;", "Lcom/avito/android/tariff_lf_constructor/configure/locations/viewmodel/e;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC46937a f299958a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f299959b;

    @Inject
    public g(@Y61.k InterfaceC46937a interfaceC46937a, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f299958a = interfaceC46937a;
        this.f299959b = interfaceC35745a5;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.locations.viewmodel.e
    @Y61.k
    public final B0 a(@Y61.k String str, @Y61.k String str2) {
        return this.f299958a.i(str, str2).x0(this.f299959b.a()).d0(f.f299957b);
    }
}
