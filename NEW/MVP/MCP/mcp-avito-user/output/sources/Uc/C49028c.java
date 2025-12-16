package uc;

import Y41.l;
import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.my.tracker.MyTracker;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MyTrackerDeferredDeeplinkConsumerImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Luc/c;", "Luc/a;", "_common_analytics-mytracker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uc.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C49028c implements InterfaceC49026a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final x f440185a;

    public C49028c(@k x xVar) {
        this.f440185a = xVar;
    }

    @Override // uc.InterfaceC49026a
    public final void a(@k l<? super DeepLink, G0> lVar) {
        MyTracker.setAttributionListener(new C49027b(lVar, this));
    }

    @Override // uc.InterfaceC49026a
    public final void clear() {
        MyTracker.setAttributionListener(new org.webrtc.h(8));
    }
}
