package com.avito.android.libs.saved_searches.domain;

import Go0.InterfaceC13902a;
import Hq0.C14020b;
import com.avito.android.favorites.FavoritesSpace;
import com.avito.android.libs.saved_searches.deeplinks.SavedSearchLink;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import io.reactivex.rxjava3.internal.operators.observable.F;
import io.reactivex.rxjava3.internal.operators.observable.L0;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SearchSubscriptionInteractorRx.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/libs/saved_searches/domain/t;", "Lcom/avito/android/libs/saved_searches/domain/i;", "_avito-discouraged_avito-libs_saved-searches"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes14.dex */
public final class t implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC13902a> f181477a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.db.n f181478b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TV.c f181479c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f181480d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final SearchParamsConverter f181481e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f181482f;

    @Inject
    public t(@Y61.k h31.e<InterfaceC13902a> eVar, @Y61.k com.avito.android.db.n nVar, @Y61.k TV.c cVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k SearchParamsConverter searchParamsConverter, @Y61.k com.avito.android.remote.error.f fVar) {
        this.f181477a = eVar;
        this.f181478b = nVar;
        this.f181479c = cVar;
        this.f181480d = interfaceC35745a5;
        this.f181481e = searchParamsConverter;
        this.f181482f = fVar;
    }

    @Override // com.avito.android.libs.saved_searches.domain.i
    @Y61.k
    @InterfaceC42830m
    public final C41982q1 a(@Y61.k FavoritesSpace favoritesSpace) {
        return new F(new C14020b(12, this, favoritesSpace)).x0(this.f181480d.a());
    }

    @Override // com.avito.android.libs.saved_searches.domain.i
    @Y61.k
    @InterfaceC42830m
    public final L0 b(@Y61.l PresentationType presentationType, @Y61.k SearchParams searchParams, @Y61.l String str, @Y61.l String str2) {
        LinkedHashMap linkedHashMap = str == null ? new LinkedHashMap(SearchParamsConverter.DefaultImpls.convertToMap$default(this.f181481e, searchParams, null, false, presentationType, 6, null)) : new LinkedHashMap();
        if (str == null && str2 != null) {
            linkedHashMap.put(SearchParamsConverterKt.DRAW_ID, str2);
        }
        return z.c0(new SavedSearchLink(str, linkedHashMap, null, null, 12, null)).K(new n(this)).x0(this.f181480d.a()).d0(q.f181475b).r0(P2.c.f318721a).m0(new r(this));
    }

    @Override // com.avito.android.libs.saved_searches.domain.i
    @Y61.k
    @InterfaceC42830m
    public final L0 k(@Y61.k String str) {
        return new F(new C14020b(11, this, str)).K(new m(this, str)).x0(this.f181480d.a()).d0(q.f181475b).r0(P2.c.f318721a).m0(new r(this));
    }
}
