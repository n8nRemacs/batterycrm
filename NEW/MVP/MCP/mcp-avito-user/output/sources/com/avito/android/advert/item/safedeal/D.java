package com.avito.android.advert.item.safedeal;

import android.os.Build;
import com.avito.android.advert.deeplinks.delivery_order.a;
import com.avito.android.advert.item.I1;
import com.avito.android.advert.item.InterfaceC27816b0;
import com.avito.android.advert.item.safedeal.real_one_click_payment_block.PaymentBlockItemState;
import com.avito.android.safedeal.remote.model.SafeDealPaymentBlockResponse;
import kotlin.Metadata;
import kv.C43501a;

/* compiled from: AdvertSafeDealPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class D<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28180h f78726b;

    public D(C28180h c28180h) {
        this.f78726b = c28180h;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C43501a c43501a = (C43501a) obj;
        C28180h c28180h = this.f78726b;
        SafeDealPaymentBlockResponse safeDealPaymentBlockResponse = c28180h.f78819H;
        if (safeDealPaymentBlockResponse == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            int i12 = c43501a.f413261b instanceof a.AbstractC2162a.b ? 17 : 12;
            I1 i13 = c28180h.f78841v;
            if (i13 != null) {
                i13.H(i12);
            }
        }
        InterfaceC27816b0 interfaceC27816b0Z = c28180h.z(c28180h.f78814C);
        if (interfaceC27816b0Z != null) {
            interfaceC27816b0Z.c(new PaymentBlockItemState.ShowPaymentBlock(safeDealPaymentBlockResponse, Boolean.FALSE));
        }
    }
}
