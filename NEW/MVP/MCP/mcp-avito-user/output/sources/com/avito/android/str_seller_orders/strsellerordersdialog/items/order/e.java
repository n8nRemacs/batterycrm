package com.avito.android.str_seller_orders.strsellerordersdialog.items.order;

import Bz0.InterfaceC13208a;
import bz0.C25738a;
import com.avito.android.str_booking.network.models.common.Button;
import com.avito.android.str_booking.network.models.common.ButtonAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: OrderDialogItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Button f290136l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f290137m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C25738a f290138n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Button button, f fVar, C25738a c25738a) {
        super(0);
        this.f290136l = button;
        this.f290137m = fVar;
        this.f290138n = c25738a;
    }

    @Override // Y41.a
    public final G0 invoke() {
        ButtonAction action;
        Button button = this.f290136l;
        if (button != null && (action = button.getAction()) != null) {
            this.f290137m.f290139b.invoke(new InterfaceC13208a.C0081a(button.getClickstream(), action, this.f290138n.f57579b));
        }
        return G0.f406611a;
    }
}
