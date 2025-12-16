package com.avito.android.service_orders.mvi;

import Mu0.InterfaceC14532b;
import android.os.Bundle;
import com.avito.android.service_booking_common.link.details.ServiceBookingItemDetailsLink;
import com.avito.android.service_orders.list.blueprints.ServiceOrdersListSnippetItem;
import com.avito.android.service_orders.mvi.entity.ServiceOrdersListInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceOrdersListOneTimeEventProducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service_orders/mvi/B;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "LMu0/b;", "<init>", "()V", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class B implements com.avito.android.arch.mvi.t<ServiceOrdersListInternalAction, InterfaceC14532b> {
    @Inject
    public B() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC14532b b(ServiceOrdersListInternalAction serviceOrdersListInternalAction) {
        InterfaceC14532b.d dVar;
        InterfaceC14532b.d dVar2;
        ServiceOrdersListInternalAction serviceOrdersListInternalAction2 = serviceOrdersListInternalAction;
        Bundle bundle = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        int i12 = 2;
        if (!(serviceOrdersListInternalAction2 instanceof ServiceOrdersListInternalAction.ClickEmptyButton)) {
            if (serviceOrdersListInternalAction2 instanceof ServiceOrdersListInternalAction.ClickSnippetMoreActionsBtn) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("key.order_id", ((ServiceOrdersListInternalAction.ClickSnippetMoreActionsBtn) serviceOrdersListInternalAction2).f279532b);
                dVar2 = new InterfaceC14532b.d(null, bundle2);
            } else if (serviceOrdersListInternalAction2 instanceof ServiceOrdersListInternalAction.ClickSnippetActionBtn) {
                dVar = new InterfaceC14532b.d(((ServiceOrdersListInternalAction.ClickSnippetActionBtn) serviceOrdersListInternalAction2).f279529b, objArr8 == true ? 1 : 0, i12, objArr7 == true ? 1 : 0);
            } else if (serviceOrdersListInternalAction2 instanceof ServiceOrdersListInternalAction.ClickCalendarBtn) {
                dVar = new InterfaceC14532b.d(((ServiceOrdersListInternalAction.ClickCalendarBtn) serviceOrdersListInternalAction2).f279526b, objArr6 == true ? 1 : 0, i12, objArr5 == true ? 1 : 0);
            } else if (serviceOrdersListInternalAction2 instanceof ServiceOrdersListInternalAction.ClickSnippetBody) {
                dVar2 = new InterfaceC14532b.d(new ServiceBookingItemDetailsLink(null), objArr4 == true ? 1 : 0, i12, objArr3 == true ? 1 : 0);
            } else {
                if (serviceOrdersListInternalAction2 instanceof ServiceOrdersListInternalAction.ShowErrorToast) {
                    return new InterfaceC14532b.e(((ServiceOrdersListInternalAction.ShowErrorToast) serviceOrdersListInternalAction2).f279564c);
                }
                if (!(serviceOrdersListInternalAction2 instanceof ServiceOrdersListInternalAction.OpenDeepLink)) {
                    if (serviceOrdersListInternalAction2 instanceof ServiceOrdersListInternalAction.ShowToast) {
                        return new InterfaceC14532b.f(((ServiceOrdersListInternalAction.ShowToast) serviceOrdersListInternalAction2).f279572b);
                    }
                    if (serviceOrdersListInternalAction2.equals(ServiceOrdersListInternalAction.ShowUxFeedbackOrderCancellation.f279573b)) {
                        return InterfaceC14532b.g.f11082a;
                    }
                    if (serviceOrdersListInternalAction2 instanceof ServiceOrdersListInternalAction.OnDeeplinkClicked) {
                        return new InterfaceC14532b.c(((ServiceOrdersListInternalAction.OnDeeplinkClicked) serviceOrdersListInternalAction2).f279539b);
                    }
                    if (serviceOrdersListInternalAction2.equals(ServiceOrdersListInternalAction.CancelScreen.f279525b)) {
                        return InterfaceC14532b.a.f11074a;
                    }
                    if (!(serviceOrdersListInternalAction2 instanceof ServiceOrdersListInternalAction.CopyPhoneToClipboard)) {
                        return null;
                    }
                    ServiceOrdersListSnippetItem.a aVar = ((ServiceOrdersListInternalAction.CopyPhoneToClipboard) serviceOrdersListInternalAction2).f279534c;
                    return new InterfaceC14532b.C0705b(aVar.f279249c, aVar.f279251e);
                }
                dVar = new InterfaceC14532b.d(((ServiceOrdersListInternalAction.OpenDeepLink) serviceOrdersListInternalAction2).f279545b, objArr2 == true ? 1 : 0, i12, objArr == true ? 1 : 0);
            }
            return dVar2;
        }
        dVar = new InterfaceC14532b.d(((ServiceOrdersListInternalAction.ClickEmptyButton) serviceOrdersListInternalAction2).f279528b, bundle, i12, objArr9 == true ? 1 : 0);
        return dVar;
    }
}
