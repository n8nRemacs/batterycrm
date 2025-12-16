package com.avito.android.comfortable_deal.client_room.seller_recall.mvi;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.comfortable_deal.client_room.seller_recall.mvi.entity.SellerRecallInternalAction;
import com.avito.android.comfortable_deal.client_room.seller_recall.mvi.entity.SellerRecallState;
import ip.InterfaceC42085a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SellerRecallActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/comfortable_deal/client_room/seller_recall/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "Lip/a;", "Lcom/avito/android/comfortable_deal/client_room/seller_recall/mvi/entity/SellerRecallInternalAction;", "Lcom/avito/android/comfortable_deal/client_room/seller_recall/mvi/entity/SellerRecallState;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC42085a, SellerRecallInternalAction, SellerRecallState> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f119982a;

    @Inject
    public b(@k InterfaceC28373a interfaceC28373a) {
        this.f119982a = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.a
    @k
    public final InterfaceC43160i a(@k C43197r1 c43197r1, @k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<SellerRecallInternalAction> b(InterfaceC42085a interfaceC42085a, SellerRecallState sellerRecallState) {
        C43210w c43210w;
        InterfaceC42085a interfaceC42085a2 = interfaceC42085a;
        SellerRecallState sellerRecallState2 = sellerRecallState;
        if (interfaceC42085a2.equals(InterfaceC42085a.C11535a.f405238a)) {
            return new C43210w(SellerRecallInternalAction.Close.f119988b);
        }
        if (interfaceC42085a2 instanceof InterfaceC42085a.b) {
            c43210w = new C43210w(new SellerRecallInternalAction.UpdateComment(((InterfaceC42085a.b) interfaceC42085a2).f405239a));
        } else if (interfaceC42085a2 instanceof InterfaceC42085a.c) {
            c43210w = new C43210w(new SellerRecallInternalAction.UpdatePhone(((InterfaceC42085a.c) interfaceC42085a2).f405240a));
        } else {
            if (interfaceC42085a2.equals(InterfaceC42085a.e.f405242a)) {
                return C43175k.G(new a(sellerRecallState2, this, null));
            }
            if (interfaceC42085a2 instanceof InterfaceC42085a.f) {
                c43210w = new C43210w(new SellerRecallInternalAction.OpenUrl(((InterfaceC42085a.f) interfaceC42085a2).f405243a));
            } else {
                if (!(interfaceC42085a2 instanceof InterfaceC42085a.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                c43210w = new C43210w(new SellerRecallInternalAction.SelectReason(((InterfaceC42085a.d) interfaceC42085a2).f405241a));
            }
        }
        return c43210w;
    }
}
