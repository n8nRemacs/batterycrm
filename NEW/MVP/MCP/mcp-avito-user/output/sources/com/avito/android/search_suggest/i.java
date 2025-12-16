package com.avito.android.search_suggest;

import com.avito.android.remote.model.search.suggest.SuggestResponse;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: SearchSuggestInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/search/suggest/SuggestResponse;", "it", "Lcom/avito/android/search/o;", "apply", "(Lcom/avito/android/remote/model/search/suggest/SuggestResponse;)Lcom/avito/android/search/o;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class i<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final i<T, R> f264234b = new i<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        SuggestResponse suggestResponse = (SuggestResponse) obj;
        return new com.avito.android.search.o(new com.avito.android.search.p(suggestResponse.getXSgt()), C42745f0.C(suggestResponse.getResult()));
    }
}
