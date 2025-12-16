package com.avito.android.seller_room.mvi;

import Vq0.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.seller_room.mvi.entity.SellerRoomInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SellerRoomEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/seller_room/mvi/f;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/seller_room/mvi/entity/SellerRoomInternalAction;", "LVq0/b;", "<init>", "()V", "_avito_seller-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements t<SellerRoomInternalAction, Vq0.b> {
    @Inject
    public f() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final Vq0.b b(SellerRoomInternalAction sellerRoomInternalAction) {
        SellerRoomInternalAction sellerRoomInternalAction2 = sellerRoomInternalAction;
        if (sellerRoomInternalAction2 instanceof SellerRoomInternalAction.ContentLoaded) {
            return new b.a(((SellerRoomInternalAction.ContentLoaded) sellerRoomInternalAction2).f268144b);
        }
        if (sellerRoomInternalAction2 instanceof SellerRoomInternalAction.HandleBeduinEvent) {
            BeduinOneTimeEvent beduinOneTimeEvent = ((SellerRoomInternalAction.HandleBeduinEvent) sellerRoomInternalAction2).f268146b;
            if (beduinOneTimeEvent instanceof BeduinOneTimeEvent.ShowToastBar) {
                return new b.g((BeduinOneTimeEvent.ShowToastBar) beduinOneTimeEvent);
            }
            if (beduinOneTimeEvent instanceof BeduinOneTimeEvent.c) {
                return b.d.f17418a;
            }
            if (beduinOneTimeEvent instanceof BeduinOneTimeEvent.b) {
                return new b.c(((BeduinOneTimeEvent.b) beduinOneTimeEvent).f176281a);
            }
            if (beduinOneTimeEvent instanceof BeduinOneTimeEvent.a) {
                return new b.C1202b(((BeduinOneTimeEvent.a) beduinOneTimeEvent).f176280a);
            }
        }
        return null;
    }
}
