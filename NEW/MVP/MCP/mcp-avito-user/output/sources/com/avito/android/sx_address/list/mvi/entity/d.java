package com.avito.android.sx_address.list.mvi.entity;

import Y61.k;
import Y61.l;
import com.avito.android.sx_address.list.domain.ScreenData;
import kotlin.Metadata;

/* compiled from: SxAddressListViewStateBuilder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/d;", "", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface d {

    /* compiled from: SxAddressListViewStateBuilder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @k
    ListState a(@k ListState listState, @k ScreenData screenData);

    @k
    ListState b(@k ListState listState, @l Throwable th2);
}
