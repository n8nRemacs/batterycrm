package com.avito.android.str_seller_orders_important_to_note.ui.item;

import aA0.InterfaceC19747a;
import com.avito.android.str_seller_orders_important_to_note.domain.BookingButton;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: OrderDialogItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BookingButton f291451l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f291452m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.str_seller_orders_important_to_note.ui.i f291453n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(BookingButton bookingButton, d dVar, com.avito.android.str_seller_orders_important_to_note.ui.i iVar) {
        super(0);
        this.f291451l = bookingButton;
        this.f291452m = dVar;
        this.f291453n = iVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        BookingButton bookingButton = this.f291451l;
        if (bookingButton != null && bookingButton.f291297a != null) {
            this.f291452m.f291454b.invoke(new InterfaceC19747a.c(bookingButton, this.f291453n.f291442h));
        }
        return G0.f406611a;
    }
}
