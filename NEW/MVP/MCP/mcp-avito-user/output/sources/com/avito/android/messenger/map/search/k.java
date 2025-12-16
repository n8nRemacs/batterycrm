package com.avito.android.messenger.map.search;

import com.avito.android.messenger.map.search.h;
import com.avito.android.mvi.b;
import com.avito.android.remote.model.messenger.geo.GeoSearchSuggest;
import io.reactivex.rxjava3.core.I;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GeoSearchInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/map/search/h$a;", "oldState", "Lio/reactivex/rxjava3/core/I;", "invoke", "(Lcom/avito/android/messenger/map/search/h$a;)Lio/reactivex/rxjava3/core/I;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class k extends N implements Y41.l<h.a, I<h.a>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f196569l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l f196570m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f196571n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(long j12, l lVar, String str) {
        super(1);
        this.f196569l = j12;
        this.f196570m = lVar;
        this.f196571n = str;
    }

    @Override // Y41.l
    public final I<h.a> invoke(h.a aVar) {
        h.a aVar2 = aVar;
        com.avito.android.mvi.b<List<GeoSearchSuggest>> bVar = aVar2.f196565b;
        if (!(bVar instanceof b.c) || ((b.c) bVar).f207034a != this.f196569l) {
            return I.q(aVar2);
        }
        l lVar = this.f196570m;
        return lVar.f196574X.getGeoSearchSuggests(lVar.f196572V, this.f196571n, lVar.f196573W).r(new j(aVar2)).u(new i(aVar2, 0));
    }
}
