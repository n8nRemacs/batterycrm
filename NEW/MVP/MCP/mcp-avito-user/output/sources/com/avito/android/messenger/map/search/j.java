package com.avito.android.messenger.map.search;

import com.avito.android.messenger.map.search.h;
import com.avito.android.mvi.b;
import com.avito.android.remote.model.messenger.geo.GeoSearchSuggests;
import kotlin.Metadata;

/* compiled from: GeoSearchInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/messenger/geo/GeoSearchSuggests;", "<name for destructuring parameter 0>", "Lcom/avito/android/messenger/map/search/h$a;", "apply", "(Lcom/avito/android/remote/model/messenger/geo/GeoSearchSuggests;)Lcom/avito/android/messenger/map/search/h$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class j<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h.a f196568b;

    public j(h.a aVar) {
        this.f196568b = aVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return h.a.a(this.f196568b, null, new b.d(((GeoSearchSuggests) obj).component1()), 1);
    }
}
