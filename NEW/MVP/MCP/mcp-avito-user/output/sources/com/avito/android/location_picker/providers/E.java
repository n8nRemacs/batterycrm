package com.avito.android.location_picker.providers;

import io.reactivex.rxjava3.internal.operators.single.O;
import javax.inject.Inject;
import kotlin.Metadata;
import uW.InterfaceC48983a;

/* compiled from: RadiusListProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location_picker/providers/E;", "Lcom/avito/android/location_picker/providers/C;", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class E implements C {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC48983a> f182442a;

    @Inject
    public E(@Y61.k h31.e<InterfaceC48983a> eVar) {
        this.f182442a = eVar;
    }

    @Override // com.avito.android.location_picker.providers.C
    @Y61.k
    public final O a(@Y61.k String str, @Y61.k String str2) {
        return this.f182442a.get().a(str, str2).S().r(D.f182441b);
    }
}
