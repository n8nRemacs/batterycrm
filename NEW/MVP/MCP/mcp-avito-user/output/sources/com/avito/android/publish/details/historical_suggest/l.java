package com.avito.android.publish.details.historical_suggest;

import com.avito.android.remote.model.TypedResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;
import l41.o;
import uF.d;

/* compiled from: HistoricalSuggestsInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "LuF/d$c;", "it", "", "Lcom/avito/android/geo_common/model/location_picker/AddressSuggestion;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class l<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public static final l<T, R> f234689b = new l<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Success) {
            return ((d.c) ((TypedResult.Success) typedResult).getResult()).a();
        }
        if (typedResult instanceof TypedResult.Error) {
            return C42784z0.f406748b;
        }
        throw new NoWhenBranchMatchedException();
    }
}
