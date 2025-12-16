package com.avito.android.advertising.ui;

import Y61.l;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.deep_linking.links.WebViewLinkSettings;
import com.avito.android.deep_linking.x;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.util.V2;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import ur.InterfaceC49101b;

/* compiled from: CommercialLinkOpener.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/ui/j;", "Lcom/avito/android/advertising/ui/i;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final x f88707a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49101b f88708b;

    @Inject
    public j(@Y61.k x xVar, @Y61.k InterfaceC49101b interfaceC49101b) {
        this.f88707a = xVar;
        this.f88708b = interfaceC49101b;
    }

    @Override // com.avito.android.advertising.ui.i
    public final void a(@l com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k String str) {
        try {
            Uri uri = Uri.parse(str);
            DeepLink deepLinkE = C42745f0.r(this.f88708b.b(), uri.getScheme()) ? this.f88707a.e(uri) : new WebViewLink.AnyDomain(uri, new WebViewLinkSettings(false, false, false, true, false, null, null, false, true, true, false, 1271, null), null, 4, null);
            if (aVar != null) {
                b.a.a(aVar, deepLinkE, null, null, 6);
            }
        } catch (Throwable th2) {
            V2.f318762a.a("DEFAULT_TAG", "CommercialLinkOpener", th2);
        }
    }
}
