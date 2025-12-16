package com.avito.android.service_order_map.serviceordermap;

import com.avito.android.geo_common.model.location_picker.AddressSuggestion;
import com.avito.android.service_order_map.serviceordermap.mvi.entity.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServiceOrderMapView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/geo_common/model/location_picker/AddressSuggestion;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/geo_common/model/location_picker/AddressSuggestion;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class j extends N implements Y41.l<AddressSuggestion, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f278683l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar) {
        super(1);
        this.f278683l = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(AddressSuggestion addressSuggestion) {
        AddressSuggestion addressSuggestion2 = addressSuggestion;
        Y41.l<? super com.avito.android.service_order_map.serviceordermap.mvi.entity.a, G0> lVar = this.f278683l.f278699p;
        if (lVar != null) {
            ((a) lVar).invoke(new a.g(addressSuggestion2));
        }
        return G0.f406611a;
    }
}
