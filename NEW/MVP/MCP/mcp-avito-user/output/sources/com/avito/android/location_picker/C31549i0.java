package com.avito.android.location_picker;

import com.avito.android.geo_common.model.location_picker.AddressSuggestion;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import uF.c;

/* compiled from: LocationPickerBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LuF/c;", "it", "Lcom/avito/android/geo_common/model/location_picker/AddressSuggestion;", "apply", "(LuF/c;)Lcom/avito/android/geo_common/model/location_picker/AddressSuggestion;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.location_picker.i0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31549i0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddressSuggestion f182406b;

    public C31549i0(AddressSuggestion addressSuggestion) {
        this.f182406b = addressSuggestion;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        uF.c cVar = (uF.c) obj;
        boolean z12 = cVar instanceof c.b ? true : cVar instanceof c.a;
        AddressSuggestion addressSuggestion = this.f182406b;
        if (z12) {
            return AddressSuggestion.a(addressSuggestion, null);
        }
        if (cVar instanceof c.C12707c) {
            return AddressSuggestion.a(addressSuggestion, ((c.C12707c) cVar).getCoords());
        }
        throw new NoWhenBranchMatchedException();
    }
}
