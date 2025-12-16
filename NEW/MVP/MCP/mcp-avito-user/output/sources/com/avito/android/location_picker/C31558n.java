package com.avito.android.location_picker;

import com.avito.android.location_picker.entities.LocationPickerState;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverter;
import kotlin.Metadata;

/* compiled from: LocationPickerBinder.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/G0;", "it", "Lio/reactivex/rxjava3/core/E;", "LyW/a;", "apply", "(Lkotlin/G0;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.location_picker.n, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31558n<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LocationPickerState f182427b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0 f182428c;

    public C31558n(x0 x0Var, LocationPickerState locationPickerState) {
        this.f182427b = locationPickerState;
        this.f182428c = x0Var;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        LocationPickerState locationPickerState = this.f182427b;
        SearchParams searchParams = locationPickerState.f182375t.f182393n;
        if (searchParams == null) {
            searchParams = new SearchParams(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1, null);
        }
        String str = locationPickerState.f182375t.f182381b;
        if (str.length() > 0) {
            searchParams.setRadius(Integer.valueOf(Integer.parseInt(str)));
        }
        x0 x0Var = this.f182428c;
        return x0Var.f182817k.a(SearchParamsConverter.DefaultImpls.convertToMap$default(x0Var.f182819m, searchParams, null, false, null, 14, null), String.valueOf(searchParams.getRadius()), searchParams.getGeoCoords()).z(x0Var.f182812f.a()).F();
    }
}
