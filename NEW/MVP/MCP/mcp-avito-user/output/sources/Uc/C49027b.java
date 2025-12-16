package uc;

import Y41.l;
import com.avito.android.evidence_request.mvi.domain.evidence_details.C;
import com.avito.android.remote.model.validation.Structure;
import com.avito.android.util.V2;
import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerAttribution;
import io.reactivex.rxjava3.core.K;
import io.reactivex.rxjava3.core.M;
import kotlin.Z;

/* compiled from: R8$$SyntheticClass */
/* renamed from: uc.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C49027b implements MyTracker.AttributionListener, M {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f440183b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f440184c;

    public /* synthetic */ C49027b(Object obj, Object obj2) {
        this.f440183b = obj;
        this.f440184c = obj2;
    }

    @Override // io.reactivex.rxjava3.core.M
    public void j(K k12) {
        C c12 = (C) this.f440183b;
        try {
            k12.onSuccess(c12.f148653b.a((Structure) this.f440184c));
        } catch (Throwable th2) {
            k12.g(th2);
        }
    }

    @Override // com.my.tracker.MyTracker.AttributionListener
    public void onReceiveAttribution(MyTrackerAttribution myTrackerAttribution) {
        Object objC = ((C49028c) this.f440184c).f440185a.c(myTrackerAttribution.getDeeplink());
        Throwable thB = Z.b(objC);
        if (thB != null) {
            V2 v22 = V2.f318762a;
            String message = thB.getMessage();
            if (message == null) {
                message = "MyTracker deferred deeplink parse error";
            }
            v22.d("MyTrackerDeferredDeeplinkConsumer", message);
            objC = null;
        }
        ((l) this.f440183b).invoke(objC);
    }
}
