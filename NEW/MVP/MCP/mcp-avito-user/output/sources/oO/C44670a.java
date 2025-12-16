package oO;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DevelopmentsCatalogInfrastructureLink;
import com.avito.android.deep_linking.links.InfrastructureBody;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.developments_catalog.MetroParam;
import com.avito.android.remote.model.developments_catalog.MetroParamKt;
import ev.AbstractC40162b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import oO.f;

/* compiled from: DevelopmentsCatalogInfrastructureLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LoO/a;", "Lev/b;", "Lcom/avito/android/deep_linking/links/DevelopmentsCatalogInfrastructureLink;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oO.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C44670a extends AbstractC40162b<DevelopmentsCatalogInfrastructureLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final f f419745d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f419746e;

    @Inject
    public C44670a(@Y61.k f fVar, @Y61.k a.InterfaceC4053a interfaceC4053a) {
        this.f419745d = fVar;
        this.f419746e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        ArrayList arrayList;
        InfrastructureBody infrastructureBody = ((DevelopmentsCatalogInfrastructureLink) deepLink).f133245b;
        Coordinates coords = infrastructureBody.getCoords();
        List<MetroParam> listF = infrastructureBody.f();
        if (listF != null) {
            List<MetroParam> list = listF;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(MetroParamKt.toGeoReference((MetroParam) it.next()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        this.f419746e.R(f.a.a(this.f419745d, coords, false, null, null, null, infrastructureBody.getAddress(), null, infrastructureBody.getTitle(), arrayList, null, infrastructureBody.getId(), infrastructureBody.d(), null, false, null, null, null, null, null, false, null, false, false, 134194364), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
