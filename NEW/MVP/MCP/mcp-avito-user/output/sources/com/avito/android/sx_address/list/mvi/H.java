package com.avito.android.sx_address.list.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.sx_address.list.domain.ScreenData;
import com.avito.android.sx_address.list.mvi.entity.ListState;
import com.avito.android.sx_address.list.mvi.entity.b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SxAddressListReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/H;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/sx_address/list/mvi/entity/b;", "Lcom/avito/android/sx_address/list/mvi/entity/ListState;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class H implements com.avito.android.arch.mvi.u<com.avito.android.sx_address.list.mvi.entity.b, ListState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.sx_address.list.mvi.entity.d f293222b;

    @Inject
    public H(@Y61.k com.avito.android.sx_address.list.mvi.entity.d dVar) {
        this.f293222b = dVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final ListState a(com.avito.android.sx_address.list.mvi.entity.b bVar, ListState listState) {
        com.avito.android.sx_address.list.mvi.entity.b bVar2 = bVar;
        ListState listState2 = listState;
        boolean z12 = bVar2 instanceof b.q;
        com.avito.android.sx_address.list.mvi.entity.d dVar = this.f293222b;
        if (z12) {
            return dVar.b(ListState.a(listState2, null, ListState.LoadingType.f293250c, null, null, 13), null);
        }
        if (bVar2 instanceof b.m) {
            b.m mVar = (b.m) bVar2;
            return dVar.b(ListState.a(listState2, null, ListState.LoadingType.f293249b, ScreenData.a(mVar.f293291a, null, null, null, true, 24575), mVar.f293291a.f293166b, 1), null);
        }
        if (bVar2 instanceof b.n) {
            b.n nVar = (b.n) bVar2;
            ScreenData screenDataA = ScreenData.a(nVar.f293292a, nVar.f293293b, null, null, true, 24574);
            ScreenData screenData = listState2.f293247d;
            return dVar.a(ListState.a(listState2, null, ListState.LoadingType.f293249b, ScreenData.a(screenData, null, screenData.f293176l, null, false, 23551), nVar.f293292a.f293166b, 1), screenDataA);
        }
        if (bVar2 instanceof b.g) {
            b.g gVar = (b.g) bVar2;
            return dVar.b(ListState.a(listState2, null, null, ScreenData.a(listState2.f293247d, gVar.f293283a, null, gVar.f293284b, false, 20478), null, 11), null);
        }
        if (!(bVar2 instanceof b.h)) {
            return bVar2 instanceof b.c ? dVar.b(ListState.a(listState2, null, ListState.LoadingType.f293251d, null, null, 13), ((b.c) bVar2).f293279a) : bVar2 instanceof b.d ? dVar.b(ListState.a(listState2, null, ListState.LoadingType.f293249b, null, null, 13), null) : listState2;
        }
        b.h hVar = (b.h) bVar2;
        return dVar.a(ListState.a(listState2, null, null, ScreenData.a(listState2.f293247d, null, hVar.f293286b, null, false, 23551), null, 11), ScreenData.a(listState2.f293247d, hVar.f293285a, null, null, false, 24574));
    }
}
