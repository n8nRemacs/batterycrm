package com.avito.android.search_suggest;

import com.avito.android.remote.model.search.suggest.SuggestResponse;
import com.avito.android.util.V2;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: SearchSuggestInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/search/suggest/SuggestResponse;", "it", "", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class h<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final h<T, R> f264233b = new h<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        V2.f318762a.e("SearchSuggestInteractorImpl got error with message: " + ((Throwable) obj), null);
        return new SuggestResponse(C42784z0.f406748b, null);
    }
}
