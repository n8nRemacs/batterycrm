package sY;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.lib.design.master_plan_view.MasterPlanPin;
import com.avito.android.master_plan.MasterPlanLinkData;
import com.avito.android.master_plan.MasterPlanShowLink;
import com.avito.android.master_plan.c;
import ev.AbstractC40162b;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: MasterPlanShowLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LsY/c;", "Lev/b;", "Lcom/avito/android/master_plan/MasterPlanShowLink;", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sY.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C48133c extends AbstractC40162b<MasterPlanShowLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.master_plan.c f437712d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f437713e;

    @Inject
    public C48133c(@k com.avito.android.master_plan.c cVar, @k a.InterfaceC4053a interfaceC4053a) {
        this.f437712d = cVar;
        this.f437713e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        Object next;
        MasterPlanShowLink masterPlanShowLink = (MasterPlanShowLink) deepLink;
        MasterPlanLinkData masterPlanLinkData = masterPlanShowLink.f185987c;
        if (masterPlanLinkData == null) {
            return AbstractC14250d.b.f9170c;
        }
        Iterator<T> it = masterPlanLinkData.d().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((MasterPlanPin) next).getId(), masterPlanShowLink.f185986b)) {
                break;
            }
        }
        MasterPlanPin masterPlanPin = (MasterPlanPin) next;
        if (masterPlanPin == null && (masterPlanPin = (MasterPlanPin) C42745f0.G(masterPlanLinkData.d())) == null) {
            return AbstractC14250d.b.f9170c;
        }
        this.f437713e.R(c.a.a(this.f437712d, masterPlanLinkData.getImage(), masterPlanLinkData.d(), 0.0f, masterPlanPin, masterPlanLinkData.getDevelopmentId(), masterPlanLinkData.getSource(), 4), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
