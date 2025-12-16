package com.avito.android.seller_room;

import Uq0.InterfaceC15559a;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.Intent;
import com.avito.android.seller_room.ui.SellerRoomActivity;
import com.avito.android.seller_room.ui.SellerRoomOpenParams;
import com.avito.android.util.C35961v3;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SellerRoomIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_room/a;", "LUq0/a;", "_avito_seller-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements InterfaceC15559a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f268106a;

    @Inject
    public a(@k Context context) {
        this.f268106a = context;
    }

    @Override // Uq0.InterfaceC15559a
    @k
    public final Intent a(@l String str) {
        Intent intent = new Intent(this.f268106a, (Class<?>) SellerRoomActivity.class);
        C35961v3.b(intent, new SellerRoomOpenParams(str));
        return intent;
    }
}
