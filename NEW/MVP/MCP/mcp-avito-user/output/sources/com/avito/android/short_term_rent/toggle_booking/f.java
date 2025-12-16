package com.avito.android.short_term_rent.toggle_booking;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.str_core.toggle_booking.ToggleOnlineBookingDeepLink;
import com.avito.android.util.P2;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ToggleOnlineBookingLinkHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/util/P2;", "Lkotlin/G0;", VoiceInfo.STATE, "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class f<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f283009b;

    public f(h hVar) {
        this.f283009b = hVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        P2 p22 = (P2) obj;
        h hVar = this.f283009b;
        boolean zF2 = L.f(p22, P2.c.f318721a);
        a.g gVar = hVar.f283013h;
        if (zF2) {
            gVar.g(hVar.d(), true);
            return;
        }
        if (p22 instanceof P2.b) {
            gVar.g(hVar.d(), false);
            hVar.j(ToggleOnlineBookingDeepLink.c.b.f288538b);
        } else if (p22 instanceof P2.a) {
            hVar.k(((P2.a) p22).f318719a);
        }
    }
}
