package com.avito.android.advert.deeplinks.chrome_tab;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.CustomChromeTabExternalLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CustomChromeTabExternalLinkParser.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/deeplinks/chrome_tab/a;", "LKu/a;", "Lcom/avito/android/deep_linking/links/CustomChromeTabExternalLink;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a extends AbstractC14350a<CustomChromeTabExternalLink> {
    @Inject
    public a() {
    }

    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        return new CustomChromeTabExternalLink(i.q(uri, "externalUri"));
    }
}
