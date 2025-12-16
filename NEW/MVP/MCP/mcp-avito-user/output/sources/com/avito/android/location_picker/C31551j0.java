package com.avito.android.location_picker;

import com.avito.android.geo_common.model.location_picker.AddressSuggestion;
import kotlin.Metadata;

/* compiled from: LocationPickerBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/geo_common/model/location_picker/AddressSuggestion;", "suggest", "Lio/reactivex/rxjava3/core/O;", "apply", "(Lcom/avito/android/geo_common/model/location_picker/AddressSuggestion;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.location_picker.j0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31551j0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f182409b;

    public C31551j0(x0 x0Var) {
        this.f182409b = x0Var;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        AddressSuggestion addressSuggestion = (AddressSuggestion) obj;
        return this.f182409b.f182811e.e(addressSuggestion.c()).r(new C31549i0(addressSuggestion));
    }
}
