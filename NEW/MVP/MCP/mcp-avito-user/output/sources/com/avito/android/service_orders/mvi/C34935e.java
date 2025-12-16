package com.avito.android.service_orders.mvi;

import Iu0.C14160a;
import androidx.view.C22984Q;
import androidx.view.InterfaceC22983P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.service_booking_utils.events.FromPageType;
import com.avito.android.service_orders.list.blueprints.ServiceOrdersBannerItem;
import com.avito.android.service_orders.mvi.entity.ServiceOrdersListInternalAction;
import hu0.C41167a;
import hu0.C41168b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.AbstractC43075a;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import st0.C48412a;
import st0.C48413b;

/* compiled from: AnalyticsTracker.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_orders/mvi/e;", "Lcom/avito/android/service_orders/mvi/a;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.service_orders.mvi.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34935e implements InterfaceC34931a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f279519a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22983P f279520b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public N0 f279521c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final e2 f279522d = f2.b(1, 0, BufferOverflow.f410778c, 2);

    @Inject
    public C34935e(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC22983P interfaceC22983P) {
        this.f279519a = interfaceC28373a;
        this.f279520b = interfaceC22983P;
    }

    @Override // com.avito.android.service_orders.mvi.InterfaceC34931a
    public final void a(@Y61.k ServiceOrdersListInternalAction serviceOrdersListInternalAction) {
        String str;
        boolean z12 = serviceOrdersListInternalAction instanceof ServiceOrdersListInternalAction.LoadCompleted;
        InterfaceC22983P interfaceC22983P = this.f279520b;
        if (z12) {
            C43259k.d(C22984Q.a(interfaceC22983P), null, null, new C34932b(this, null), 3);
            return;
        }
        if (serviceOrdersListInternalAction instanceof ServiceOrdersListInternalAction.ShowErrorFullScreen) {
            C43259k.d(C22984Q.a(interfaceC22983P), null, null, new C34933c(this, null), 3);
            return;
        }
        boolean z13 = serviceOrdersListInternalAction instanceof ServiceOrdersListInternalAction.ShowErrorToast;
        InterfaceC28373a interfaceC28373a = this.f279519a;
        if (z13) {
            interfaceC28373a.c(((ServiceOrdersListInternalAction.ShowErrorToast) serviceOrdersListInternalAction).f279563b);
            return;
        }
        if (serviceOrdersListInternalAction instanceof ServiceOrdersListInternalAction.ClickSnippetMoreActionsBtn) {
            interfaceC28373a.c(new Iu0.b(((ServiceOrdersListInternalAction.ClickSnippetMoreActionsBtn) serviceOrdersListInternalAction).f279532b));
            return;
        }
        if (serviceOrdersListInternalAction instanceof ServiceOrdersListInternalAction.ClickSnippetActionBtn) {
            ServiceOrdersListInternalAction.ClickSnippetActionBtn clickSnippetActionBtn = (ServiceOrdersListInternalAction.ClickSnippetActionBtn) serviceOrdersListInternalAction;
            interfaceC28373a.c(new C48413b(clickSnippetActionBtn.f279530c, clickSnippetActionBtn.f279531d));
            return;
        }
        if (serviceOrdersListInternalAction instanceof ServiceOrdersListInternalAction.ClickCalendarBtn) {
            interfaceC28373a.c(new C14160a());
            return;
        }
        if (serviceOrdersListInternalAction instanceof ServiceOrdersListInternalAction.OnActionSuccess) {
            String str2 = ((ServiceOrdersListInternalAction.OnActionSuccess) serviceOrdersListInternalAction).f279538b;
            if (str2 != null) {
                interfaceC28373a.c(new C48412a("list_seller", str2));
                return;
            }
            return;
        }
        if (serviceOrdersListInternalAction instanceof ServiceOrdersListInternalAction.OnActionFailure) {
            String str3 = ((ServiceOrdersListInternalAction.OnActionFailure) serviceOrdersListInternalAction).f279537b;
            if (str3 != null) {
                interfaceC28373a.c(new C48412a("list_seller", str3));
                return;
            }
            return;
        }
        if (serviceOrdersListInternalAction instanceof ServiceOrdersListInternalAction.OnResume) {
            N0 n02 = this.f279521c;
            if (n02 == null || !((AbstractC43075a) n02).isActive()) {
                this.f279521c = C43259k.d(C22984Q.a(interfaceC22983P), null, null, new C34934d(this, null), 3);
                return;
            }
            return;
        }
        if (!(serviceOrdersListInternalAction instanceof ServiceOrdersListInternalAction.ClickCloseReminderBanner)) {
            if (serviceOrdersListInternalAction instanceof ServiceOrdersListInternalAction.OnShowPhone) {
                interfaceC28373a.c(new C41168b(((ServiceOrdersListInternalAction.OnShowPhone) serviceOrdersListInternalAction).f279543b, FromPageType.f278332c));
                return;
            } else {
                if (serviceOrdersListInternalAction instanceof ServiceOrdersListInternalAction.CopyPhoneToClipboard) {
                    String str4 = ((ServiceOrdersListInternalAction.CopyPhoneToClipboard) serviceOrdersListInternalAction).f279533b;
                    interfaceC28373a.c(new C41167a(str4 != null ? str4 : "", FromPageType.f278332c));
                    return;
                }
                return;
            }
        }
        ServiceOrdersBannerItem serviceOrdersBannerItem = ((ServiceOrdersListInternalAction.ClickCloseReminderBanner) serviceOrdersListInternalAction).f279527b;
        int iOrdinal = serviceOrdersBannerItem.f279216f.ordinal();
        if (iOrdinal == 0) {
            str = "yellow";
        } else if (iOrdinal == 1) {
            str = "red";
        } else if (iOrdinal == 2) {
            str = "gray";
        } else if (iOrdinal == 3) {
            str = "white";
        } else {
            if (iOrdinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
            str = "violet";
        }
        interfaceC28373a.c(new com.avito.android.service_booking_utils.events.reminder_banner.a("item_list", str, serviceOrdersBannerItem.f279217g, ""));
    }
}
