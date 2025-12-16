package com.avito.android.service_booking_common.link.cancel;

import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.remote.model.SimpleMessageResult;
import com.avito.android.service_booking_common.link.cancel.ServiceBookingCancelLink;
import com.avito.android.util.P2;
import kotlin.Metadata;
import l41.g;

/* compiled from: ServiceBookingCancelLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/SimpleMessageResult;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class b<T> implements g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f276574b;

    public b(d dVar) {
        this.f276574b = dVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        P2 p22 = (P2) obj;
        boolean z12 = p22 instanceof P2.b;
        d dVar = this.f276574b;
        a.g gVar = dVar.f276578h;
        if (!z12) {
            if (p22 instanceof P2.c) {
                gVar.g(dVar.d(), true);
                return;
            } else {
                if (p22 instanceof P2.a) {
                    d.k(dVar, ((P2.a) p22).f318719a);
                    return;
                }
                return;
            }
        }
        String message = ((SimpleMessageResult) ((P2.b) p22).f318720a).getMessage();
        gVar.g(dVar.d(), false);
        if (message != null) {
            a.i.C4057a.d(dVar.f276580j, com.avito.android.printable_text.b.f(message), null, null, f.a.f125253a, 0, ToastBarPosition.f181047e, null, null, 1966);
        }
        dVar.j(new ServiceBookingCancelLink.b.C8217b(message));
    }
}
