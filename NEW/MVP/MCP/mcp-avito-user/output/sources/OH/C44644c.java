package oH;

import Ju.AbstractC14250d;
import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.gig_apply.GigSlotMapDeeplink;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.LocationMap;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import oO.f;

/* compiled from: GigSlotMapDeeplinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LoH/c;", "Lev/a;", "Lcom/avito/android/gig_apply/GigSlotMapDeeplink;", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oH.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C44644c extends AbstractC40161a<GigSlotMapDeeplink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final f f419687f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f419688g;

    @Inject
    public C44644c(@k f fVar, @k a.InterfaceC4053a interfaceC4053a) {
        this.f419687f = fVar;
        this.f419688g = interfaceC4053a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        Double d12;
        GigSlotMapDeeplink gigSlotMapDeeplink = (GigSlotMapDeeplink) deepLink;
        Double d13 = gigSlotMapDeeplink.f159522d;
        LocationMap locationMap = null;
        Coordinates coordinates = (d13 == null || (d12 = gigSlotMapDeeplink.f159523e) == null) ? null : new Coordinates(d13.doubleValue(), d12.doubleValue());
        DeepLink deepLink2 = gigSlotMapDeeplink.f159525g;
        if (deepLink2 != null) {
            String str2 = gigSlotMapDeeplink.f159524f;
            if (str2 == null) {
                str2 = "";
            }
            locationMap = new LocationMap(new LocationMap.BottomButton(str2, null, null, null, deepLink2));
        }
        this.f419688g.R(f.a.a(this.f419687f, coordinates, false, null, null, null, gigSlotMapDeeplink.f159521c, null, gigSlotMapDeeplink.f159520b, null, null, null, null, null, false, null, null, null, locationMap, null, false, null, false, false, 116391612), com.avito.android.deeplink_handler.view.b.f134588l);
        j(AbstractC14250d.c.f9171c);
    }
}
