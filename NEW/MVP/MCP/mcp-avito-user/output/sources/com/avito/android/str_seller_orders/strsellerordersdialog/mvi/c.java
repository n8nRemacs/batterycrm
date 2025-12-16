package com.avito.android.str_seller_orders.strsellerordersdialog.mvi;

import Y61.l;
import com.avito.android.str_seller_orders.strsellerordersdialog.mvi.entity.StrSellerOrdersDialogInternalAction;
import com.avito.android.str_seller_orders.strsellerordersdialog.shared.StrSellerOrdersDialogData;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: StrSellerOrdersDialogBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerordersdialog/mvi/c;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/str_seller_orders/strsellerordersdialog/mvi/entity/StrSellerOrdersDialogInternalAction;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements com.avito.android.arch.mvi.b<StrSellerOrdersDialogInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final StrSellerOrdersDialogData f290142a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f290143b;

    @Inject
    public c(@l StrSellerOrdersDialogData strSellerOrdersDialogData) {
        this.f290142a = strSellerOrdersDialogData;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<StrSellerOrdersDialogInternalAction> a() {
        if (this.f290143b || this.f290142a == null) {
            return C43175k.w();
        }
        this.f290143b = true;
        return new C43210w(new StrSellerOrdersDialogInternalAction.InitWithNewDialogData(this.f290142a));
    }

    @Override // com.avito.android.arch.mvi.b
    @l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
