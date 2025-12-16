package com.avito.android.developments_agency_search.screen.deal_room.di;

import Y41.l;
import Y61.k;
import android.content.Context;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.developments_agency_search.screen.deal_room.DealRoomFragment;
import com.avito.android.developments_agency_search.screen.deal_room.model.DealRoomArguments;
import com.avito.android.di.B;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: DealRoomComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/di/b;", "", "a", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes13.dex */
public interface b {

    /* compiled from: DealRoomComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/di/b$a;", "", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@h31.b @k DealRoomArguments dealRoomArguments, @h31.b @k C28478k c28478k, @h31.b @k l lVar, @k c cVar, @k InterfaceC39417a interfaceC39417a, @h31.b @k Context context);
    }

    void a(@k DealRoomFragment dealRoomFragment);
}
