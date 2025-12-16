package com.avito.android.developments_agency_search.factory;

import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import com.avito.android.developments_agency_search.screen.deal_room.DealRoomFragment;
import com.avito.android.developments_agency_search.screen.deal_room.model.DealRoomArguments;
import javax.inject.Inject;
import kotlin.Metadata;
import zN0.InterfaceC50490a;

/* compiled from: NewDevelopmentsDealRoomFactory.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/factory/a;", "LzN0/b;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC50490a
@C11.a
/* loaded from: classes13.dex */
public final class a implements zN0.b {
    @Inject
    public a() {
    }

    @Override // zN0.b
    public final Fragment a(String str) {
        DealRoomFragment.a aVar = DealRoomFragment.f137222z0;
        DealRoomArguments.ProcessIdArguments processIdArguments = new DealRoomArguments.ProcessIdArguments(str, null, "virtual_deal_room");
        aVar.getClass();
        DealRoomFragment dealRoomFragment = new DealRoomFragment();
        dealRoomFragment.f137229t0.setValue(dealRoomFragment, DealRoomFragment.f137221A0[0], processIdArguments);
        return dealRoomFragment;
    }
}
