package com.avito.android.suggest_locations;

import com.avito.android.geo_common.model.location_picker.AddressSuggestion;
import kotlin.Metadata;
import nF.C44245a;

/* compiled from: SuggestLocationsPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/geo_common/model/location_picker/AddressSuggestion;", "suggestion", "Lio/reactivex/rxjava3/core/E;", "apply", "(Lcom/avito/android/geo_common/model/location_picker/AddressSuggestion;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class H<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T f292109b;

    public H(T t12) {
        this.f292109b = t12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        AddressSuggestion addressSuggestion = (AddressSuggestion) obj;
        T t12 = this.f292109b;
        C44245a c44245a = t12.f292180m;
        c44245a.getClass();
        kotlin.reflect.n<Object> nVar = C44245a.f414956i[4];
        if (!((Boolean) c44245a.f414961f.a().invoke()).booleanValue()) {
            return io.reactivex.rxjava3.core.z.c0(addressSuggestion);
        }
        return t12.f292168a.k(addressSuggestion.c()).r(new G(addressSuggestion)).F();
    }
}
