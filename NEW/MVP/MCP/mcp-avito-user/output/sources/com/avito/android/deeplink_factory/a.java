package com.avito.android.deeplink_factory;

import Ru.d;
import Y61.k;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deeplink_events.events.DeeplinkParsingFailReason;
import com.avito.android.util.V2;
import kotlin.Metadata;
import kotlin.Z;

/* compiled from: DeepLinkFactories.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_avito-network_deeplinks-parser-factory"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a {
    @k
    public static final Object a(@k Object obj, @k Uri uri) {
        int i12 = Z.f406624c;
        return (obj instanceof Z.b ? null : obj) instanceof NoMatchLink ? new Z.b(new DeeplinkParsingError.Custom(uri.toString(), "Failed to parse deeplink! (NoMatch)", null, 4, null)) : obj;
    }

    @k
    public static final void b(@k Object obj, @k com.avito.android.deeplink_events.registry.d dVar, @k Uri uri) {
        int i12 = Z.f406624c;
        if (!(obj instanceof Z.b)) {
            dVar.b(new d.C0991d(uri, (DeepLink) obj, false));
        }
        Throwable thB = Z.b(obj);
        if (thB != null) {
            V2.f318762a.b("DeepLinkFactory", thB);
            dVar.b(new d.a(uri, DeeplinkParsingFailReason.f134146c, thB));
        }
    }
}
