package com.avito.android.seller_room.mvi;

import Vq0.c;
import com.avito.android.arch.mvi.u;
import com.avito.android.error.z;
import com.avito.android.seller_room.mvi.entity.SellerRoomInternalAction;
import javax.inject.Inject;
import kotlin.AbstractC40048c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;

/* compiled from: SellerRoomReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/seller_room/mvi/k;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/seller_room/mvi/entity/SellerRoomInternalAction;", "LVq0/c;", "<init>", "()V", "_avito_seller-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k implements u<SellerRoomInternalAction, Vq0.c> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final Vq0.c a(SellerRoomInternalAction sellerRoomInternalAction, Vq0.c cVar) {
        c.b c1203b;
        c.b c1204c;
        SellerRoomInternalAction sellerRoomInternalAction2 = sellerRoomInternalAction;
        Vq0.c cVar2 = cVar;
        if (sellerRoomInternalAction2 instanceof SellerRoomInternalAction.StartLoading) {
            return new Vq0.c(new c.b.C1204c(false, 1, null));
        }
        if (sellerRoomInternalAction2 instanceof SellerRoomInternalAction.Error) {
            return new Vq0.c(new c.b.C1203b());
        }
        if (!(sellerRoomInternalAction2 instanceof SellerRoomInternalAction.HandleBeduinState)) {
            return cVar2;
        }
        AbstractC40048c.C11084c c11084c = AbstractC40048c.C11084c.f395217b;
        AbstractC40048c abstractC40048c = ((SellerRoomInternalAction.HandleBeduinState) sellerRoomInternalAction2).f268147b;
        if (L.f(abstractC40048c, c11084c) ? true : L.f(abstractC40048c, AbstractC40048c.d.f395218b)) {
            c1204c = new c.b.C1204c(false);
        } else {
            if (abstractC40048c instanceof AbstractC40048c.a) {
                c1203b = new c.b.a(((AbstractC40048c.a) abstractC40048c).getF395211c());
            } else {
                if (!(abstractC40048c instanceof AbstractC40048c.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                z.n(((AbstractC40048c.b) abstractC40048c).f395216b);
                c1203b = new c.b.C1203b();
            }
            c1204c = c1203b;
        }
        return new Vq0.c(c1204c);
    }
}
