package MH0;

import Y61.k;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.model.adverts.MyAdvertDetails;
import j.InterfaceC42150f;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SbStatusBlockEventsTracker.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMH0/d;", "LMH0/c;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f10543a;

    @Inject
    public d(@k InterfaceC28373a interfaceC28373a) {
        this.f10543a = interfaceC28373a;
    }

    @Override // MH0.c
    public final void a(@k MyAdvertDetails.SbStatusBlock.Event event) {
        this.f10543a.c(new b(event.getUid(), event.getIid(), event.getActionType(), event.getBannerType()));
    }

    @Override // MH0.c
    public final void b(@InterfaceC42150f int i12, @k String str) {
        this.f10543a.c(new com.avito.android.service_booking_utils.events.reminder_banner.a("item", i12 == R.attr.bannerWarmgray ? "gray" : i12 == R.attr.bannerRed ? "red" : i12 == R.attr.bannerOrange ? "yellow" : "", str, "block_item"));
    }
}
