package com.avito.android.advert_core.contactbar;

import W9.b;
import com.avito.android.advert_core.ux_feedback.AdvertDetailsRemoteFeedbackEvent;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.ux_feedback.UxFeedbackConfigOld;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AdvertContactsPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "show", "Lio/reactivex/rxjava3/core/O;", "apply", "(Z)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class l<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28266e f83237b;

    public l(C28266e c28266e) {
        this.f83237b = c28266e;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            return io.reactivex.rxjava3.core.I.q(Boolean.TRUE);
        }
        C28266e c28266e = this.f83237b;
        c28266e.getClass();
        boolean z12 = System.currentTimeMillis() - c28266e.f83186b0 > 10000;
        if (!c28266e.f83184a0 || !z12) {
            return io.reactivex.rxjava3.core.I.q(Boolean.FALSE);
        }
        b.a aVar = b.a.f17810b;
        AdvertDetails advertDetails = c28266e.f83168L;
        c28266e.f83209o.a(aVar, advertDetails != null ? advertDetails.getUxFeedbackConfig() : null);
        AdvertDetails advertDetails2 = c28266e.f83168L;
        List<UxFeedbackConfigOld> uxFeedbackConfigs = advertDetails2 != null ? advertDetails2.getUxFeedbackConfigs() : null;
        com.avito.android.delayed_ux_feedback.d dVar = c28266e.f83213s;
        dVar.ge(uxFeedbackConfigs);
        dVar.ga(AdvertDetailsRemoteFeedbackEvent.f84400e);
        return io.reactivex.rxjava3.core.I.q(Boolean.TRUE);
    }
}
