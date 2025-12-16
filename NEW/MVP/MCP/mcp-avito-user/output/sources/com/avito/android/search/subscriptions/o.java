package com.avito.android.search.subscriptions;

import Go0.InterfaceC13902a;
import android.database.Cursor;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.remote.model.SearchParamsFactory;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.saved_searches.model.SearchSubscription;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import pu.C47140a;

/* compiled from: SearchSubscriptionSyncService.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/Location;", "location", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/Location;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class o<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchSubscriptionSyncService f263998b;

    public o(SearchSubscriptionSyncService searchSubscriptionSyncService) {
        this.f263998b = searchSubscriptionSyncService;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Location location = (Location) obj;
        SearchSubscriptionSyncService searchSubscriptionSyncService = this.f263998b;
        com.avito.android.db.l lVar = searchSubscriptionSyncService.f263852e;
        if (lVar == null) {
            lVar = null;
        }
        Cursor cursorQuery = lVar.f132678a.getReadableDatabase().query("saved_searches", null, null, null, null, null, "timestamp ASC");
        try {
            Cursor cursor = cursorQuery;
            while (cursor.moveToNext()) {
                com.avito.android.db.l lVar2 = searchSubscriptionSyncService.f263852e;
                if (lVar2 == null) {
                    lVar2 = null;
                }
                lVar2.getClass();
                C47140a c47140aT = com.avito.android.db.l.t(cursor);
                SearchParams searchParamsFromString = SearchParamsFactory.INSTANCE.fromString(c47140aT.f428824b);
                if (searchParamsFromString.getLocationId() == null) {
                    searchParamsFromString.setLocationId(location.getId());
                }
                SearchParamsConverter searchParamsConverter = searchSubscriptionSyncService.f263854g;
                Map<String, String> mapConvertToMap$default = SearchParamsConverter.DefaultImpls.convertToMap$default(searchParamsConverter != null ? searchParamsConverter : null, searchParamsFromString, null, false, null, 14, null);
                io.reactivex.rxjava3.disposables.c cVar = searchSubscriptionSyncService.f263858k;
                InterfaceC13902a interfaceC13902a = searchSubscriptionSyncService.f263849b;
                InterfaceC13902a interfaceC13902a2 = interfaceC13902a != null ? interfaceC13902a : null;
                String drawId = searchParamsFromString.getDrawId();
                I30.d dVar = searchSubscriptionSyncService.f263856i;
                if (dVar == null) {
                    dVar = null;
                }
                z<TypedResult<SearchSubscription>> zVarG = interfaceC13902a2.g(mapConvertToMap$default, drawId, null, null, dVar.b(), null);
                InterfaceC35745a5 interfaceC35745a5 = searchSubscriptionSyncService.f263853f;
                if (interfaceC35745a5 == null) {
                    interfaceC35745a5 = null;
                }
                I0 i0J0 = zVarG.j0(interfaceC35745a5.b());
                InterfaceC35745a5 interfaceC35745a52 = searchSubscriptionSyncService.f263853f;
                if (interfaceC35745a52 == null) {
                    interfaceC35745a52 = null;
                }
                cVar.b(i0J0.x0(interfaceC35745a52.b()).v0(new q(searchSubscriptionSyncService, c47140aT), new r(searchSubscriptionSyncService, c47140aT), io.reactivex.rxjava3.internal.functions.a.f401993c));
            }
            G0 g02 = G0.f406611a;
            kotlin.io.c.a(cursorQuery, null);
        } finally {
        }
    }
}
